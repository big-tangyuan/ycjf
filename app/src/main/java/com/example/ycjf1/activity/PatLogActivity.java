package com.example.ycjf1.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ycjf1.R;

import cn.bmob.v3.BmobSMS;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.LogInListener;
import cn.bmob.v3.listener.QueryListener;

public class PatLogActivity extends AppCompatActivity {
    @BindView(R.id.edt_phone)
    EditText mEdtPhone;
    @BindView(R.id.edt_code)
    EditText mEdtCode;
    @BindView(R.id.tv_info)
    TextView mTvInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pat_log);
        ButterKnife.bind(this);
        /*
        patLogBtm = (Button) findViewById(R.id.dl);
        patLogBtm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PatLogActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
                //跳转到主页
                Intent intent = new Intent(PatLogActivity.this, MainPageActivity.class);
                startActivity(intent);
            }
        });
        */
        @OnClick({R.id.btn_send, R.id.btn_signup_or_login})
        public void onViewClicked (View view){
            switch (view.getId()) {
                case R.id.btn_send: {
                    String phone = mEdtPhone.getText().toString().trim();
                    if (TextUtils.isEmpty(phone)) {
                        Toast.makeText(this, "请输入手机号码", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    /**
                     * TODO template 如果是自定义短信模板，此处替换为你在控制台设置的自定义短信模板名称；如果没有对应的自定义短信模板，则使用默认短信模板。
                     */
                    BmobSMS.requestSMSCode(phone, "医触即发手机验证码", new QueryListener<Integer>() {
                        @Override
                        public void done(Integer smsId, BmobException e) {
                            if (e == null) {
                                mTvInfo.append("发送验证码成功，短信ID：" + smsId + "\n");
                            } else {
                                mTvInfo.append("发送验证码失败：" + e.getErrorCode() + "-" + e.getMessage() + "\n");
                            }
                        }
                    });
                    break;
                }
                case R.id.patlog: {
                    String phone = mEdtPhone.getText().toString().trim();
                    if (TextUtils.isEmpty(phone)) {
                        Toast.makeText(this, "请输入手机号码", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    String code = mEdtCode.getText().toString().trim();
                    if (TextUtils.isEmpty(code)) {
                        Toast.makeText(this, "请输入验证码", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    BmobUser.signOrLoginByMobilePhone(phone, code, new LogInListener<BmobUser>() {
                        @Override
                        public void done(BmobUser bmobUser, BmobException e) {
                            if (e == null) {
                                mTvInfo.append("短信注册或登录成功：" + bmobUser.getUsername());
                                startActivity(new Intent(UserSignUpOrLoginSmsActivity.this, UserMainActivity.class));
                            } else {
                                mTvInfo.append("短信注册或登录失败：" + e.getErrorCode() + "-" + e.getMessage() + "\n");
                            }
                        }
                    });
                    break;
                }

                default:
                    break;
            }
        }

    }
}

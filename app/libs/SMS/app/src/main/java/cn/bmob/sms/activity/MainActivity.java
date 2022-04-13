package cn.bmob.sms.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.bmob.sms.R;
import cn.bmob.sms.activity.user.UserLoginPasswordActivity;
import cn.bmob.sms.activity.user.UserLoginSmsActivity;
import cn.bmob.sms.activity.user.UserSignUpOrLoginSmsActivity;
import cn.bmob.sms.activity.user.UserSignUpPasswordActivity;
import cn.bmob.sms.activity.user.UserSignUpPasswordAndSmsActivity;

/**
 * @author zhangchaozhou
 */
public class MainActivity extends AppCompatActivity {


    /**
     * 本案例主要功能
     * <p>
     * TODO 1、通常的短信验证：发送短信验证码->验证短信验证码->进行重要的用户操作。
     * <p>
     * TODO 2、用户名密码注册
     * <p>
     * TODO 3、手机号码注册或登录：发送短信验证码->验证短信验证码->若首次验证手机号码则进行注册并登录，若非首次验证手机号码则进行直接登录。
     * <p>
     * TODO 4、用户名密码注册的同时绑定手机号码：发送短信验证码->验证短信验证码->进行用户名密码注册并登录，同时进行绑定手机号码。
     * <p>
     * TODO 5、用户名密码登录。
     * <p>
     * TODO 6、短信验证码登录。
     * <p>
     * TODO 7、注册登录之后进行绑定或解绑手机号码：发送短信验证码->验证短信验证码->进行手机号码的绑定或解绑操作。
     * <p>
     * TODO 8、注册登录之后进行短信验证密码重置：发送短信验证码->验证短信验证码->进行密码重置。
     * <p>
     * TODO 9、注册登录之后进行原始密码重置。
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.btn_normal, R.id.btn_user_signup_password, R.id.btn_signup_or_login_sms, R.id.btn_user_signup_password_and_sms, R.id.btn_user_login_password, R.id.btn_user_login_sms})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_normal:
                startActivity(new Intent(this, NormalActivity.class));
                break;
            case R.id.btn_user_signup_password:
                startActivity(new Intent(this, UserSignUpPasswordActivity.class));
                break;
            case R.id.btn_signup_or_login_sms:
                startActivity(new Intent(this, UserSignUpOrLoginSmsActivity.class));
                break;
            case R.id.btn_user_signup_password_and_sms:
                startActivity(new Intent(this, UserSignUpPasswordAndSmsActivity.class));
                break;
            case R.id.btn_user_login_password:
                startActivity(new Intent(this, UserLoginPasswordActivity.class));
                break;
            case R.id.btn_user_login_sms:
                startActivity(new Intent(this, UserLoginSmsActivity.class));
                break;
            default:
                break;
        }
    }
}

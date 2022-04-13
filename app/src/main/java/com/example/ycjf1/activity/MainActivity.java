package com.example.ycjf1.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.BoolRes;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ycjf1.R;

import cn.bmob.v3.Bmob;

public class MainActivity extends AppCompatActivity {

    private Button mBtnDocLog;
    private  Button mBtnPatLog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bmob.initialize(this, "d4b4f705836fd1760eea681d4ef62f96");//默认初始化Bmob
        setContentView(R.layout.activity_main);
/*
        mBtnDocLog = (Button)findViewById(R.id.doclog);
        mBtnDocLog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //跳转到DOC登录页面
                Intent intent = new Intent(MainActivity.this, DocLogActivity.class);
                startActivity(intent);
            }
                                      }
        );
*/
        HashMap<Integer, Boolean> hashMAP = new HashMap<>();
        hashMAP.put(1, true);
        hashMAP.conteinsKey(1);

        mBtnPatLog = (Button)findViewById(R.id.btn_signup_or_login_sms);
        mBtnPatLog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //跳转到DOC登录页面
                Intent intent = new Intent(MainActivity.this, PatLogActivity.class);
                startActivity(intent);
                                          }
        }
        );
    }
}

package com.example.ycjf1.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ycjf1.R;

public class DocLogActivity extends AppCompatActivity {

    private Button docLogBtm;
    private TextView forPassword;
    private TextView zC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_log);
        docLogBtm = (Button) findViewById(R.id.dl);
        docLogBtm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DocLogActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
                //跳转到主页
                Intent intent = new Intent(DocLogActivity.this, MainPageActivity.class);
                startActivity(intent);
            }
        });
        forPassword =(Button) findViewById(R.id.forPass);
        forPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DocLogActivity.this,"开发中...",Toast.LENGTH_SHORT).show();
            }
        });
        zC = (Button) findViewById(R.id.zhuCe);
        zC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DocLogActivity.this,"开发中...",Toast.LENGTH_SHORT).show();
            }
        });
    }

}

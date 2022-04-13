package com.example.ycjf1.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ycjf1.R;

public class MainPageActivity extends AppCompatActivity {
    private ImageButton bingLi;
    private ImageButton personalPage;
    private ImageButton chaYiShen;
    private ImageButton chaYiYuan;
    private ImageButton chaJiBing;
    private ImageButton guaHao;
    private ImageButton wenZhen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        bingLi = findViewById(R.id.elcBL);
        bingLi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到电子病历
                Intent intent = new Intent(MainPageActivity.this, ElecBingLi.class);
                startActivity(intent);
            }
        });
        personalPage = findViewById(R.id.wDe);
        personalPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到个人页面
                Intent intent = new Intent(MainPageActivity.this, PerPage.class);
                startActivity(intent);
            }
        });
        wenZhen = findViewById(R.id.wZh);
        wenZhen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到个人页面
                Intent intent = new Intent(MainPageActivity.this, WenZhen.class);
                startActivity(intent);
            }
        });
        guaHao = findViewById(R.id.yyGH);
        guaHao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到个人页面
                Intent intent = new Intent(MainPageActivity.this, YuYueGuaHao.class);
                startActivity(intent);
            }
        });
        chaYiShen = findViewById(R.id.cYS);
        chaYiShen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到查医生页面
                Intent intent = new Intent(MainPageActivity.this, ChaYiShen.class);
                startActivity(intent);
            }
        });
        chaYiYuan = findViewById(R.id.cYY);
        chaYiYuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转查医院页面
                Intent intent = new Intent(MainPageActivity.this, ChaYiYuan.class);
                startActivity(intent);
            }
        });
        chaJiBing = findViewById(R.id.cJB);
        chaJiBing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到查疾病页面
                Intent intent = new Intent(MainPageActivity.this, ChaJiBing.class);
                startActivity(intent);
            }
        });
    }
}

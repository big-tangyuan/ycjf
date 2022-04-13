package com.example.ycjf1.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ycjf1.R;

public class PerPage extends AppCompatActivity {
    private TextView perDZBL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_per_page);
        perDZBL =findViewById(R.id.dZBL);
        perDZBL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到电子病历
                Intent intent = new Intent(PerPage.this, ElecBingLi.class);
                startActivity(intent);
            }
        });
    }
}

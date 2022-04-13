package com.example.ycjf1.activity;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ChaYiYuan extends AppCompatActivity {

    private EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cha_yi_yuan);
        text = (EditText) findViewById(R.id.yiyuan);
    }
}

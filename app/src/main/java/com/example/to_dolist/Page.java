package com.example.to_dolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);
    TextView x=findViewById(R.id.yyy);
    String a="Happy Birthday "+getIntent().getStringExtra("tk");
    x.setText(a);
    }
}
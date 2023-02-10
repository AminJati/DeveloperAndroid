package com.example.twoactivitieshomework;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView mTextHello;
    TextView mTextCount;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mTextHello = findViewById(R.id.text_hello);
        mTextCount = findViewById(R.id.text_count);
        Intent intent = getIntent();
        mTextCount.setText(Integer.toString(
                intent.getIntExtra(MainActivity.EXTRA_MESSAGE, 0)));
    }
}
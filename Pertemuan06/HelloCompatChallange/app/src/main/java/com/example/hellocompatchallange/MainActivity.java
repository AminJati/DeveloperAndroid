package com.example.hellocompatchallange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String CHOICE =
            "com.example.hellocompatchallange.CHOICE";
    public static final String HEADER =
            "com.example.hellocompatchallange.HEADER";
    public static final String SUBHEADER =
            "com.example.hellocompatchallange.SUBHEADER";
    public Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(this, SecondActivity.class);
    }

    public void TextOne(View view) {
        intent.putExtra(CHOICE, "TEXT ONE");
        intent.putExtra(HEADER, "AMIN JATI");
        intent.putExtra(SUBHEADER, "Abbey Road Studios in London");
        startActivity(intent);
    }

    public void TextTwo(View view) {
        intent.putExtra(CHOICE, "TEXT TWO");
        intent.putExtra(HEADER, "AMIN JATI");
        intent.putExtra(SUBHEADER, "Highlights include");
        startActivity(intent);
    }

    public void TextThree(View view) {
        intent.putExtra(CHOICE, "TEXT THREE");
        intent.putExtra(HEADER, "AMIN JATI");
        intent.putExtra(SUBHEADER, "Love Me Do");
        startActivity(intent);
    }
}
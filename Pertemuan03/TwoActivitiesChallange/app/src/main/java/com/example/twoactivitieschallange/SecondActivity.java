package com.example.twoactivitieschallange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView scrollTextView;
    TextView headerView;
    TextView subHeaderView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        scrollTextView = findViewById(R.id.article);
        headerView = findViewById(R.id.article_heading);
        subHeaderView = findViewById(R.id.article_subheading);

        headerView.setText(intent.getStringExtra(MainActivity.HEADER));
        subHeaderView.setText(intent.getStringExtra(MainActivity.SUBHEADER));
        switch (intent.getStringExtra(MainActivity.CHOICE)){
            case "TEXT ONE":
                scrollTextView.setText(R.string.article_text_1);
                break;
            case "TEXT TWO":
                scrollTextView.setText(R.string.article_text_2);
                break;
            case "TEXT THREE":
                scrollTextView.setText(R.string.article_text_3);
                break;
            default:
                throw new IllegalStateException("Unexpected Value: "
                        + intent.getStringExtra(MainActivity.CHOICE));
        }
    }
}
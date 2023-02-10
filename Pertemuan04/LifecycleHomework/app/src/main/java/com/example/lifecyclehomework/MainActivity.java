package com.example.lifecyclehomework;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);

        if (savedInstanceState != null){
            mCount = savedInstanceState.getInt("result");
            mShowCount.setText(Integer.toString(mCount));
        }
    }
    @Override
    protected void onSaveInstanceState(@Nullable Bundle outstate){
        outstate.putInt("result", mCount);
        super.onSaveInstanceState(outstate);
    }
    public void ShowCount(View view){
        mCount ++;
        if(mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}
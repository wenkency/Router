package com.chenenyu.router.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class DynamicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_annotated);
    }
}

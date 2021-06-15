package com.endsem.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
/*
* Name - Gourav Uniyal
* Section - B
* Roll no - 1018488
* Subject - Mobile Application Development
* */
public class SecondActivity extends AppCompatActivity {

    TextView txtName;
    TextView txtAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txtName = findViewById(R.id.txtName);
        txtAge = findViewById(R.id.txtAge);
        String name = getIntent().getStringExtra("name");
        String age = getIntent().getStringExtra("age");
        txtAge.setText(name);
        txtName.setText(age);
    }
}
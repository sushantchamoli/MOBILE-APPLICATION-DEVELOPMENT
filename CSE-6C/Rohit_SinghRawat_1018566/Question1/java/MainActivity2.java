package com.prezrohit.question1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView txtName;
    TextView txtAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtName = findViewById(R.id.txtName);
        txtAge = findViewById(R.id.txtAge);
        String name = getIntent().getStringExtra("name");
        String age = getIntent().getStringExtra("age");
        txtAge.setText(name);
        txtName.setText(age);
    }
}
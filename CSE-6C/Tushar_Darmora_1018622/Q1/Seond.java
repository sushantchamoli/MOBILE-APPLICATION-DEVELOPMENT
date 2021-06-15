package com.example.q1endtermtushardarmora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Seond extends AppCompatActivity {
    TextView txtName;
    TextView txtAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seond);
        txtName = findViewById(R.id.txtName);
        txtAge = findViewById(R.id.txtAge);
        String name = getIntent().getStringExtra("name");
        String age = getIntent().getStringExtra("age");
        txtAge.setText(name);
        txtName.setText(age);
    }
}
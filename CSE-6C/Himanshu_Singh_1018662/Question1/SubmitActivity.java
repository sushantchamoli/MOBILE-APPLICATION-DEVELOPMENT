package com.example.practicalone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

//Submit Activity//

public class SubmitActivity extends AppCompatActivity {

    TextView txtName;
    TextView txtAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.submit_activity_layout);
        txtName = findViewById(R.id.txtName);
        txtAge = findViewById(R.id.txtAge);
        String name = getIntent().getStringExtra("name");
        String age = getIntent().getStringExtra("age");
        txtAge.setText(name);
        txtName.setText(age);
    }
}
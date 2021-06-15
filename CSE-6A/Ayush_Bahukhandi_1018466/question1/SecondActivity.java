package com.example.question1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView name;
    private TextView email;
    private TextView age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        name = findViewById(R.id.name1);
        email = findViewById(R.id.email1);
        age = findViewById(R.id.age1);


        String userName = getIntent().getStringExtra("newName");
        String userEmail = getIntent().getStringExtra("newEmail");
        String userAge = getIntent().getStringExtra("newAge");

        name.setText("Name is = " + userName);
        email.setText("Email is = " + userEmail);
        age.setText("Age is = " + userAge);
    }
}
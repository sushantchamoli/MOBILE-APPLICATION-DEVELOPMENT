package com.siddharthnegi.question1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String personName = intent.getStringExtra("name");
        String personAge = intent.getStringExtra("age");

        TextView name = findViewById(R.id.name);
        TextView age = findViewById(R.id.age);

        personName = "Name: " + personName;
        personAge = "Age: " + personAge;

        name.setText(personName);
        age.setText(personAge);
    }

}

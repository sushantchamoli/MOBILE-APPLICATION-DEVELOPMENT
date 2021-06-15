package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {
  private  TextView namet,aget;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Intent intent=getIntent();
        String name=intent.getStringExtra("Name");
        String age=intent.getStringExtra("Age");
        namet=findViewById(R.id.name_text);
        aget=findViewById(R.id.age_text);
        namet.setText(name);
          aget.setText(age);
    }
}
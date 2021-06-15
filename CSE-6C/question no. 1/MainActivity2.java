package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String name=getIntent().getStringExtra("name");
        String email=getIntent().getStringExtra("email");


        TextView nameF=findViewById(R.id.textView);
        TextView emailF=findViewById(R.id.textView2);


        nameF.setText(name);
        emailF.setText(email);

    }
}
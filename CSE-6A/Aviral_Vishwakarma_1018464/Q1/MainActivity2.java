package com.example.q1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView eName,eAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        eAge=findViewById(R.id.Age);
        eName=findViewById(R.id.Name);
        Intent i = getIntent();
        eAge.setText(i.getStringExtra("name"));
        eName.setText(i.getStringExtra("age"));

    }
}
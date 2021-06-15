package com.example.practical1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
        TextView name,age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name=findViewById(R.id.name_receive);
        age=findViewById(R.id.Age_receive);

        Intent i=getIntent();
        String s1=i.getStringExtra("key");
        String str=i.getStringExtra("key1");
        name.setText(s1);
        age.setText(str);
    }
}
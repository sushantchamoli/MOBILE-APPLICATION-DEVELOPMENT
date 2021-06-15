package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView name,age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name=findViewById(R.id.nm);
        age=findViewById(R.id.ag);
        Intent intent=getIntent();
        String n=intent.getStringExtra("name");
        String a=intent.getStringExtra("age");
        name.setText(n);
        age.setText(a);
    }
    public void clickBack(View view){
        finish();
    }
}
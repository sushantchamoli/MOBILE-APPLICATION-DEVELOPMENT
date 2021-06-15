package com.example.question1labpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv2,tv3;


    //Getting the values from 1 activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //displaying the values on act2.xml
        setContentView(R.layout.act2);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        String  name = getIntent().getStringExtra("Name");
        String  age = getIntent().getStringExtra("Age");
        tv2.setText("Name is "+name);
        tv3.setText("Age is "+age);

    }
}
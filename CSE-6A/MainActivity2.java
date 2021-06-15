package com.example.intentprogram;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView out;
    TextView age_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        out=findViewById(R.id.output);
        age_1 =findViewById(R.id.age1);
        Intent i = getIntent();
        out.setText(i.getStringExtra("name"));
        age_1.setText(i.getStringExtra("age"));
    }
}
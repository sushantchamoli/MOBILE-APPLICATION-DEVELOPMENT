//Devesh Kumar Srivastav

package com.example.q1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main1Activity extends AppCompatActivity
{
    TextView t1, t2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        t1 = findViewById(R.id.textView);
        t2 = findViewById(R.id.textView5);
        Intent intent = getIntent();
        t1.setText(intent.getStringExtra("name"));
        t2.setText(intent.getStringExtra("age"));
    }
}

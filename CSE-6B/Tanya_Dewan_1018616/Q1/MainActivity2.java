package com.example.thirdq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i=getIntent();
        text=findViewById(R.id.text);

        String b=i.getStringExtra("msg2");

        String d=i.getStringExtra("msg4");
        text.setText("\nName: "+d+"\n\nAge: "+b+" ");
    }
}

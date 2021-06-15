package com.example.myapplication77;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText t1;
    EditText t2;
    EditText t3;
    EditText t4;
    Button t5;
    TextView t6,t7,t8,t9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.edit);
        t2=findViewById(R.id.edit2);
        t3=findViewById(R.id.edit3);
        t4=findViewById(R.id.edit4);
        t5=findViewById(R.id.button);
        t6=findViewById(R.id.textView2);
        t7=findViewById(R.id.textView3);
        t8=findViewById(R.id.textView4);
        t9=findViewById(R.id.textView5);
        Intent i=new Intent(MainActivity.this,MainActivity2.class);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=t1.getText().toString();
                String s1=t2.getText().toString();
                String s2=t3.getText().toString();
                String s3=t4.getText().toString();
                i.putExtra("msg","name    "+s+"\n\n\n"+" age   "+s2);
                startActivity(i);

            }
        });
    }
}
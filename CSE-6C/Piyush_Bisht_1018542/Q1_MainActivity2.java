//Name: Piyush Bisht
//RollNo:1018542
//Section:C

package com.example.barrier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView1,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView1=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView3);

        Intent i=getIntent();
        textView1.setText("Name Entered is:"+i.getStringExtra("name"));
        textView2.setText("Age Entered is:"+i.getStringExtra("age"));
    }
}
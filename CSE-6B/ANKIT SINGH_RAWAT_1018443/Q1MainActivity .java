package com.example.ankitsinghrawatlabtestapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2,et3,et4;
    TextView t1,t2,t3,t4;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.editTextTextPersonName);
        et2=findViewById(R.id.editTextTextPersonName2);
        et3=findViewById(R.id.editTextTextPersonName3);
        et4=findViewById(R.id.editTextTextPersonName4);
        t1=findViewById(R.id.textView);
        t2=findViewById(R.id.textView2);
        t3=findViewById(R.id.textView3);
        t4=findViewById(R.id.textView4);
        Intent i=new Intent(MainActivity.this,MainActivity2.class);
        b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=et1.getText().toString();
                String s2=et2.getText().toString();
                String s3=et3.getText().toString();
                String s4=et4.getText().toString();
                i.putExtra("msg1",s1);
                i.putExtra("msg2",s2);
                i.putExtra("msg3",s3);
                i.putExtra("msg4",s4);
                startActivity(i);
            }
        });

    }
// ANKIT SINGH RAWAT
// 1018443
}

















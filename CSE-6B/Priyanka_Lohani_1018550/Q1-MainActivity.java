package com.example.priyankalohani_labq1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    EditText e2;
    EditText e3;
    EditText e4;
    Intent i;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.et101);
        e2=findViewById(R.id.et201);
        e3=findViewById(R.id.et301);
        e4=findViewById(R.id.et401);
        b1=findViewById(R.id.bt101);
        i=new Intent(MainActivity.this,SubActivity.class);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("msg1",e1.getText().toString());
                i.putExtra("msg2",e2.getText().toString());
                i.putExtra("msg3",e3.getText().toString());
                i.putExtra("msg4",e4.getText().toString());
                startActivity(i);
            }
        });

    }
}
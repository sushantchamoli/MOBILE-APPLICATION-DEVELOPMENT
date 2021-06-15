/*Saumya Bhatt*/
package com.example.saumyaq1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView t1,t2,t3,t4;
    EditText e1;
    EditText e2;
    EditText e3;
    EditText e4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        t1=findViewById(R.id.textView);
        t2=findViewById(R.id.textView3);
        t3=findViewById(R.id.textView4);
        t4=findViewById(R.id.textView5);
        e1=findViewById(R.id.name);
        e2=findViewById(R.id.email);
        e4=findViewById(R.id.password);
        e3=findViewById(R.id.age1);

        Intent i=new Intent( MainActivity.this,MainActivity2.class);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                i.putExtra("msg1",e1.getText().toString());
                i.putExtra("msg2",e2.getText().toString());
                i.putExtra("msg3",e3.getText().toString());
                i.putExtra("msg4",e4.getText().toString());
                startActivity(i);
            }

        });
    }
}
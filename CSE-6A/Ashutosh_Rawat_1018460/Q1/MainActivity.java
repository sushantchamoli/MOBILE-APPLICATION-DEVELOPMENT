package com.example.q1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1;
    TextView textView1,textView2,textView3,textView4;
    EditText editText1,editText2,editText3,editText4;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button);
        textView1=findViewById(R.id.email);
        editText1=findViewById(R.id.name);
        textView2=findViewById(R.id.email);
        editText2=findViewById(R.id.emailet);
        textView3=findViewById(R.id.age);
        editText3=findViewById(R.id.ageed);
        textView4=findViewById(R.id.password);
        editText4=findViewById(R.id.passworded);

        Intent i=new Intent( MainActivity.this,MainActivity2.class);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                i.putExtra("msg1",editText1.getText().toString()+" \n " + editText2.getText().toString());
                startActivity(i);
            }

        });
    }
}

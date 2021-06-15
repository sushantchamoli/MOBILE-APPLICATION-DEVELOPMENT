package com.example.end_sem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText name,age,password,email;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.nameinp);
        age=findViewById(R.id.ageinp);
        password=findViewById(R.id.passinp);
        email=findViewById(R.id.emailInp);
        b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1=name.getText().toString();
                int age1=Integer.parseInt(age.getText().toString());
                Intent i=new Intent(MainActivity.this,Second.class);
                i.putExtra("Name",name1);
                i.putExtra("age",age1);
                startActivity(i);

            }
        });


    }
}
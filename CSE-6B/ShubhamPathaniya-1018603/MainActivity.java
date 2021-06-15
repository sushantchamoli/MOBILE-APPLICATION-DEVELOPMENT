package com.example.q1byshubhampathaniya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Name;
    EditText Age;
    EditText email;
    EditText password;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name=findViewById(R.id.Name);
        email=findViewById(R.id.editTextTextEmailAddress);
        Age=findViewById(R.id.editTextNumber);
        password=findViewById(R.id.editTextTextPassword);
        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("name",Name.getText().toString());
                i.putExtra("age",Age.getText().toString());
                startActivity(i);
            }
        });
    }
}
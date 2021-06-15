package com.example.myapplication_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,age,email,pass;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.editTextTextPersonName);
        age = findViewById(R.id.editTextNumber);
        email = findViewById(R.id.editTextTextEmailAddress);
        pass = findViewById(R.id.editTextNumberPassword);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("name",name.getText().toString());
                i.putExtra("email",email.getText().toString());
                i.putExtra("age",age.getText().toString());
                i.putExtra("pass",pass.getText().toString());
                startActivity(i);
            }
        });
    }
}
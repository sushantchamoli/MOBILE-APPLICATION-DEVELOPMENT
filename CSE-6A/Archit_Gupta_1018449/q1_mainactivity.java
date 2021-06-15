package com.example.intentprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class q1_mainactivity extends AppCompatActivity {
Button submit;
EditText name;
EditText email;
EditText age;
EditText password;
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Archit Gupta 1018449
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Referencing to the text fields
        submit = findViewById(R.id.submit);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        age= findViewById(R.id.age);
        password = findViewById(R.id.password);

        //making intent
        intent = new Intent(q1_mainactivity.this, q1_activity2.class);
        //on click function
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //passing the values
                intent.putExtra("name",name.getText().toString());
                intent.putExtra("age",age.getText().toString());
                startActivity(intent);
            }
        });

    }
}
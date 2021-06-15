package com.example.intentprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button submit;
EditText input;
    EditText name;

    EditText pass;
    EditText age;
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.submit);
        input = findViewById(R.id.input);
        name=findViewById(R.id.name);
        age=findViewById(R.id.pass);

        pass=findViewById(R.id.pass);
        intent = new Intent(MainActivity.this,MainActivity2.class);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("email",input.getText().toString());
                intent.putExtra("pass",pass.getText().toString());
                intent.putExtra("age",age.getText().toString());
                intent.putExtra("name",name.getText().toString());
                startActivity(intent);
            }
        });

    }
}
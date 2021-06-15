package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name, email,age, password;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        age = findViewById(R.id.email);
        email = findViewById(R.id.age);
        password = findViewById(R.id.password);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n=name.getText().toString();
                String a=age.getText().toString();
                String e=email.getText().toString();
                String p=password.getText().toString();
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("name",n);
                intent.putExtra("age",a);
                intent.putExtra("email",e);
                intent.putExtra("password",p);
                startActivity(intent);

            }
        });


    }
}
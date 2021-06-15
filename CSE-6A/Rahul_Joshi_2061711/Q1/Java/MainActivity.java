package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText name,email,age,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        age=findViewById(R.id.age);
        password=findViewById(R.id.pasword);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=name.getText().toString();
                String e=email.getText().toString();
                String a=age.getText().toString();
                String p=password.getText().toString();
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("name",n);
                intent.putExtra("email",e);
                intent.putExtra("age",a);
                intent.putExtra("password",p);
                startActivity(intent);
            }
        });
    }
}
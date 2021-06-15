package com.example.q1signin;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.ImageDecoder;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    Button button;
    EditText name,email,age,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= findViewById(R.id.button);
        name=findViewById(R.id.editTextTextPersonName);
        email=findViewById(R.id.editTextTextEmailAddress2);
        age=findViewById(R.id.editTextNumber);
        password=findViewById(R.id.editTextTextPassword2);
        final Intent i= new Intent(MainActivity.this,MainActivity2.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("msg1",name.getText().toString());
                i.putExtra("msg2",email.getText().toString());
                i.putExtra("msg3",age.getText().toString());
                i.putExtra("msg4",password.getText().toString());
                startActivity(i);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
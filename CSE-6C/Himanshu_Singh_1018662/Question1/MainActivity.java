package com.example.practicalone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//Created by Himanshu Singh(1018662)//

//Main Activity//

public class MainActivity extends AppCompatActivity {

    EditText edtName;
    EditText edtAge;
    EditText edtEmail;
    EditText edtPassword;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtAge = findViewById(R.id.editAge);
        edtEmail = findViewById(R.id.editEmail);
        edtName = findViewById(R.id.editName);
        edtPassword = findViewById(R.id.editPassword);
        btnSubmit = findViewById(R.id.button1);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edtName.getText().toString();
                String age = edtAge.getText().toString();
                String email = edtEmail.getText().toString();
                String password = edtPassword.getText().toString();
                Intent intent = new Intent(getApplicationContext(), SubmitActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("age", age);
                intent.putExtra("password", password);
                intent.putExtra("email", email);
                startActivity(intent);
            }
        });

    }
}
package com.prezrohit.question1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtName;
    private EditText edtAge;
    private EditText edtEmail;
    private EditText edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtAge = findViewById(R.id.editAge);
        edtEmail = findViewById(R.id.editEmail);
        edtName = findViewById(R.id.editName);
        edtPassword = findViewById(R.id.editPassword);
        Button btnSubmit = findViewById(R.id.btn_submit);

        btnSubmit.setOnClickListener(view -> {
            String name = edtName.getText().toString();
            String age = edtAge.getText().toString();
            String email = edtEmail.getText().toString();
            String password = edtPassword.getText().toString();
            Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
            intent.putExtra("name", name);
            intent.putExtra("age", age);
            intent.putExtra("password", password);
            intent.putExtra("email", email);
            startActivity(intent);
        });

    }
}
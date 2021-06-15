package com.example.question1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Email;
    private EditText Age;
    private EditText Password;
    private Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = (EditText) findViewById(R.id.nameView);
        Email = (EditText) findViewById(R.id.emailView);
        Age = (EditText) findViewById(R.id.ageView);
        Password = (EditText) findViewById(R.id.passwordView);
        Submit = (Button) findViewById(R.id.submitView);


        Submit.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                String userName = Name.getText().toString();
                String userEmail = Email.getText().toString();
                String userAge = Age.getText().toString();
                String userPassword = Password.getText().toString();

                Intent intent = new Intent (MainActivity.this, SecondActivity.class);
                intent.putExtra ("newName", userName);
                intent.putExtra ("newEmail", userEmail);
                intent.putExtra ("newAge", userAge);
                startActivity (intent);
            }
        });
    }}
 /*   private void validate ()
    {
        String userName = Name.getText().toString();
        String userPassword = Password.getText().toString();
        if ((userName == "Ayush") && (userPassword == "123456"))
        {
            Intent intent = new Intent (MainActivity.this, SecondActivity.class);
            startActivity (intent);
        }
    }*/


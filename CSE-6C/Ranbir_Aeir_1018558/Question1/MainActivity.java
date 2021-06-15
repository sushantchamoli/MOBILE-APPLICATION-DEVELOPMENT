package com.ranbiraeir.question1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText age;
    EditText edtEmail;
    EditText password;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        age = findViewById(R.id.editAge);
        edtEmail = findViewById(R.id.editEmail);
        name = findViewById(R.id.editName);
        password = findViewById(R.id.editPassword);
        submit = findViewById(R.id.btn_submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = MainActivity.this.name.getText().toString();
                String age = MainActivity.this.age.getText().toString();
                String email = edtEmail.getText().toString();
                String password = MainActivity.this.password.getText().toString();
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("age", age);
                intent.putExtra("password", password);
                intent.putExtra("email", email);
                startActivity(intent);
            }
        });

    }
}
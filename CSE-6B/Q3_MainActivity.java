package com.example.question1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText d1,d2,d3,d4;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        d1 = findViewById(R.id.editTextTextPersonName3);
        d2 = findViewById(R.id.editTextTextPersonName2);
        d3 = findViewById(R.id.editTextTextPersonName1);
        d4 = findViewById(R.id.editTextTextPassword2);
        button = findViewById(R.id.button);
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("name",d1.getText().toString());
                intent.putExtra("email",d2.getText().toString());
                intent.putExtra("age",d3.getText().toString());
                intent.putExtra("password",d4.getText().toString());
                startActivity(intent);
            }
        });
    }
}
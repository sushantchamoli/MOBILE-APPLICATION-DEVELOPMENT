package com.example.endsem1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button submit;
    EditText input;
    EditText age;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.button);
        input = findViewById(R.id.name);
        age = findViewById(R.id.age3);
        intent = new Intent(MainActivity.this, MainActivity2.class);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("name",input.getText().toString());
                intent.putExtra("age",age.getText().toString());
                startActivity(intent);
            }
        });

    }
}
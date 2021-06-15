package com.myk.endsem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText e1;
    EditText e2;
    EditText e3;
    EditText e4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        e1 = findViewById(R.id.name);
        e2 = findViewById(R.id.email);
        e3 = findViewById(R.id.age);
        e4 = findViewById(R.id.password);
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("name", e1.getText().toString());
                i.putExtra("age", e3.getText().toString());
                startActivity(i);
            }

        });
    }
}

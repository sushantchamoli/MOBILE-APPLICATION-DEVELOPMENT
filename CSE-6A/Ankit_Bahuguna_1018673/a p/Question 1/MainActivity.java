package com.ankit.question1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {
        EditText name = findViewById(R.id.name);
        EditText email = findViewById(R.id.email);
        EditText age = findViewById(R.id.age);
        EditText password = findViewById(R.id.password);

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("name", name.getText().toString());
        intent.putExtra("age", age.getText().toString());
        startActivity(intent);
    }
}
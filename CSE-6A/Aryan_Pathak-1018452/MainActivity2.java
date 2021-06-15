package com.example.endsem1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.endsem1.R;

public class MainActivity2 extends AppCompatActivity {

    TextView name;
    TextView age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name = findViewById(R.id.name1);
        age = findViewById(R.id.age1);

        Intent i = getIntent();

        name.setText(i.getStringExtra("name"));
        age.setText(i.getStringExtra("age"));
    }
}

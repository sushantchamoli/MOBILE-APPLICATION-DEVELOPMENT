package com.example.practicalendsem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle bundle = getIntent().getExtras();
        if (bundle!= null) {
            String name = bundle.getString("name");
            String age = bundle.getString("age");
            TextView name1= findViewById(R.id.name1);
            TextView age1 = findViewById(R.id.age1);
            name1.setText(name);
            age1.setText(age);
        }
    }
}
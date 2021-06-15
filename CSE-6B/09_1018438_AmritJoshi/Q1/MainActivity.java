package com.example.practical1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,Age;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        Age=findViewById(R.id.age);

        submit=findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=name.getText().toString();
                String s2=Age.getText().toString();

                Intent i=new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("key",s);
                i.putExtra("key1",s2);
                startActivity(i);
            }
        });

    }
}
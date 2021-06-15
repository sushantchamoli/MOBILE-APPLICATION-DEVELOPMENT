package com.example.intent1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button button;
    EditText name,age,panno,uidno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        name = findViewById(R.id.name1);
        age=  findViewById(R.id.age1);
        panno=findViewById(R.id.password1);
        uidno=findViewById(R.id.email1);

        Intent i = new Intent(MainActivity.this,Main_Activity2.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("msg1",name.getText().toString());
                final Intent intent = i.putExtra("msg2", age.getText().toString());
                startActivity(i);
            }
        });
    }
    }
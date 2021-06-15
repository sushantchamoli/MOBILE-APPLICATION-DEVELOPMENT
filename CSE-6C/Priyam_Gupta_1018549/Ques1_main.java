package com.project.ques;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText name;
    EditText mail;
    EditText age;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        name=findViewById(R.id.name);
        mail=findViewById(R.id.email);
        age=findViewById(R.id.age1);
        pass=findViewById(R.id.password);
        Intent i=new Intent( MainActivity.this,MainActivity2.class);
        button.setOnClickListener(v -> {
            i.putExtra("msg1",name.getText().toString());
            i.putExtra("msg2",age.getText().toString());
            startActivity(i);
        });
    }
}
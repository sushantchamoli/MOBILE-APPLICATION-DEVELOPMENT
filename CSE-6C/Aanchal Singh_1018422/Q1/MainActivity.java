package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name = (EditText) findViewById(R.id.editText1);
        EditText email = (EditText) findViewById(R.id.editText2);
        EditText age = (EditText) findViewById(R.id.editText3);
        EditText pass = (EditText) findViewById(R.id.editText4);

        Button sub = (Button)findViewById(R.id.button);
        Intent i = new Intent(MainActivity.this,MainActivity2.this);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("msg1",name.getText().toString());
                i.putExtra("msg2",age.getText().toString());
                startActivity(i);
            }
        });

    }
}
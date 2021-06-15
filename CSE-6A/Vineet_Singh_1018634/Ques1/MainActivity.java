package com.example.details;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=(EditText)findViewById(R.id.editText1);
        editText2=(EditText)findViewById(R.id.editText2);
        editText3=(EditText)findViewById(R.id.editText3);
        editText4=(EditText)findViewById(R.id.editText4);
        button=(Button)findViewById(R.id.button);
        Intent i=new Intent(MainActivity.this,MainActivity2.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("msg1",editText1.getText().toString());
                startActivity(i);
            }
        });
    }
}
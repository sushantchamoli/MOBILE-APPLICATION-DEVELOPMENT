package com.rohitpokhriyal.ques1;
//created by rohit pokhriyal
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    EditText name,email,age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        name=(EditText) findViewById(R.id.yname);
        email=(EditText)findViewById(R.id.yemail);
        age=(EditText)findViewById(R.id.yage);

        Intent intent = getIntent();
        String sname=intent.getStringExtra("name");
        String semail=intent.getStringExtra("email");
        String sage=intent.getStringExtra("age");

        name.setText(sname);
        email.setText(semail);
        age.setText(sage);
    }
}

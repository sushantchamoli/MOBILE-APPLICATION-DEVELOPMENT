package com.adityakoul.endsem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
        TextView name,age,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name=findViewById(R.id.name_receive);
        email=findViewById(R.id.email_receive);
        age=findViewById(R.id.Age_receive);

        Intent i=getIntent();
        String s1=i.getStringExtra("key");
        String s2=i.getStringExtra("key2");
        String str=i.getStringExtra("key1");
        name.setText(s1);
        email.setText(s2);
        age.setText(str);
    }
}
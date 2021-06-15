package com.priyanshiBinjola.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText name,email,age,password;
    Button button;
    ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewByIdes();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sname = name.getText().toString();
                String semail = email.getText().toString();
                String page = age.getText().toString();
                String pass = password.getText().toString();
                
                arrayList = new ArrayList<>();
                arrayList.add(sname);
                arrayList.add(semail);
                arrayList.add(page);
                arrayList.add(pass);
               
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putStringArrayListExtra("SEND",arrayList);
                startActivity(intent);
            }
        });
    }

    private void findViewByIdes(){
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        age = findViewById(R.id.age);
        password = findViewById(R.id.password);
        button = findViewById(R.id.button);
    }
}
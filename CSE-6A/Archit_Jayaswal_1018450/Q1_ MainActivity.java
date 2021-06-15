package com.archit.form;

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
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pname = name.getText().toString();
                String pemail = email.getText().toString();
                String page = age.getText().toString();
                String pass = password.getText().toString();
                arrayList = new ArrayList<>();
                arrayList.add(pname);
                arrayList.add(pmail);
                arrayList.add(page);
                arrayList.add(pass);
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putStringArrayListExtra("SND",arrayList);
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
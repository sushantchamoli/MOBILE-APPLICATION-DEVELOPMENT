package com.priyanshiBinjola.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    TextView uname,uage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        zname = findViewById(R.id.textView6);
        zage = findViewById(R.id.textView8);
        showData();
    }

    private void showData() {
        Intent intent = getIntent();
        ArrayList<String> a;
        a = intent.getStringArrayListExtra("SEND");
        zname.setText(a.get(0));
        zage.setText(a.get(2));
    }
}
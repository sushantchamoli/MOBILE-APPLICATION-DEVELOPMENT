package com.aryanwalia.form;

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
        uname = findViewById(R.id.textView6);
        uage = findViewById(R.id.textView8);
        showData();
    }

    private void showData() {
        Intent intent = getIntent();
        ArrayList<String> a;
        a = intent.getStringArrayListExtra("SEND");
        uname.setText(a.get(0));
        uage.setText(a.get(2));
    }
}
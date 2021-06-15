package com.example.question1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
   private EditText name,age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        age=findViewById(R.id.age);

    }
    public void sendToNext(View v){
        Intent intent=new Intent(getApplicationContext(),NextActivity.class);
        intent.putExtra("Name",name.getText().toString());
        intent.putExtra("Age",age.getText().toString());
        startActivity(intent);
    }
}

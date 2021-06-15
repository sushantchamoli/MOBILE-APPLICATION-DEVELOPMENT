//Name : Saurabh Chauhan
//Sec : C
//ROLL NO:58
package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView name,age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name=findViewById(R.id.nm);//name
        age=findViewById(R.id.ag);//age
        Intent intent=getIntent();//intent
        String n=intent.getStringExtra("name");
        String a=intent.getStringExtra("age");
        name.setText(n);
        age.setText(a);
    }
    public void clickBack(View view){
        finish();
    }
}
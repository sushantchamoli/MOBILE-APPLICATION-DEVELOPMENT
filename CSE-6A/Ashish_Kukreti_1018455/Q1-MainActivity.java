package com.ashish.practical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText eName,ePassword,eEmail,eAge;
    Button eSubmit;
    public String name;
    public int age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eName=findViewById(R.id.Name);
        ePassword=findViewById(R.id.Password);
        eEmail=findViewById(R.id.Email);
        eAge=findViewById(R.id.Age);
        eSubmit=findViewById(R.id.Submit);

        eSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=eName.getText().toString();
                age=Integer.parseInt(eAge.getText().toString());
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("name",name);
                i.putExtra("age",age);
                startActivity(i);
            }
        });



    }
}
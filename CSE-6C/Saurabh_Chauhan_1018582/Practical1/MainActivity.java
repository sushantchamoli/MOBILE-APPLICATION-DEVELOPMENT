//Name : Saurabh Chauhan
//Sec : C
//ROLL NO:58
package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,email,age,password;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        age=findViewById(R.id.age);
        password=findViewById(R.id.pasword);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=name.getText().toString();
                String email=email.getText().toString();
                String age=age.getText().toString();
                String password=password.getText().toString();
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("name",name);
                intent.putExtra("email",email);
                intent.putExtra("age",age);
                intent.putExtra("password",password);
                startActivity(intent);
            }
        });
    }
}
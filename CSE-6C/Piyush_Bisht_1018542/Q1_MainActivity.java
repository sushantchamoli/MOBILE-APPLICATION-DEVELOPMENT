//Name: Piyush Bisht
//RollNo:1018542
//Section:C

package com.example.barrier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,email,age,password;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.editTextTextPersonName);
        email=findViewById(R.id.editTextTextPersonName2);
        age=findViewById(R.id.editTextTextPersonName3);
        password=findViewById(R.id.editTextTextPersonName4);
        button=findViewById(R.id.button);
        final Intent intent=new Intent(this,MainActivity2.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("name",name.getText().toString());
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("password",password.getText().toString());
                intent.putExtra("age",age.getText().toString());

                startActivity(intent);
            }
        });
    }
}
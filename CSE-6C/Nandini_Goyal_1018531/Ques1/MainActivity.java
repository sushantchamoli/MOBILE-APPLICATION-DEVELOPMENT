package com.example.practicalendsem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.microedition.khronos.egl.EGLDisplay;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText password;
    Button Submit;
    EditText email;
    EditText age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=(EditText)findViewById(R.id.name);
        password=(EditText)findViewById(R.id.password);
        age=(EditText)findViewById(R.id.age);
        email=(EditText)findViewById(R.id.email);
        Submit=(Button)findViewById(R.id.button);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    String name1 = name.getText().toString();
                    String age1 = age.getText().toString();
                    Bundle bundle = new Bundle();
                    bundle.putString("name", name1);
                    bundle.putString("age", age1);
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
            }
        });
    }


}
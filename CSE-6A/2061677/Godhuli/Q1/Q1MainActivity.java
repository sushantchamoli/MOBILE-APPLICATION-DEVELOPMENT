package com.example.ras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;

    EditText e1,e2,e3,e4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);

        e1=findViewById(R.id.ename);
        e2=findViewById(R.id.email);
        e3=findViewById(R.id.eage);
        e4=findViewById(R.id.epass);
        Intent i=new Intent( MainActivity.this,MainActivity2.class);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                i.putExtra("msg1",e1.getText().toString());
                i.putExtra("msg2",e2.getText().toString());
                i.putExtra("msg3",e3.getText().toString());
                i.putExtra("msg4",e4.getText().toString());
                startActivity(i);
            }

        });

    }
}

package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tv,te,ta,tp;
    EditText e1,ee,ea,ep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        tv=findViewById(R.id.email);
        e1=findViewById(R.id.name);
        te=findViewById(R.id.email);
        ee=findViewById(R.id.emailet);
        ta=findViewById(R.id.age);
        ea=findViewById(R.id.ageed);
        tp=findViewById(R.id.password);
        ep=findViewById(R.id.passworded);

        Intent i=new Intent( MainActivity.this,MainActivity2.class);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                i.putExtra("msg1",e1.getText().toString()+" , "+ ea.getText().toString());
                startActivity(i);
            }

        });
    }
}

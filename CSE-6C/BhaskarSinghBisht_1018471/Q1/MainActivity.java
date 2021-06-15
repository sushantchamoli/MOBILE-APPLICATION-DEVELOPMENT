package com.example.question1_BhaskarSinghBisht_1018471_C;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button submit;
    TextView output;
    EditText input,input2,input3,input4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = findViewById(R.id.submit);
        input = findViewById(R.id.input);
        input2 = findViewById(R.id.input2);
        input3 = findViewById(R.id.input3);
        input4 = findViewById(R.id.input4);
        output = findViewById(R.id.output);


        Intent packet = new Intent(MainActivity.this,MainActivity2.class);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                packet.putExtra("name",input.getText().toString());
                packet.putExtra("email",input2.getText().toString());
                packet.putExtra("age",input3.getText().toString());
                packet.putExtra("password",input4.getText().toString());

                startActivity(packet);

            }
        });

    }
}
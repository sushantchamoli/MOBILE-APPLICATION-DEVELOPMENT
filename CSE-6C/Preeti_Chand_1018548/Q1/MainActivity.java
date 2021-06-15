
package com.example.practical_1_endterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2,et3,et4;
    TextView t1,t2,t3,t4;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.editText1);
        et2=findViewById(R.id.editText2);
        et3=findViewById(R.id.editTextTextPassword);
        et4=findViewById(R.id.editText3);
        t1=findViewById(R.id.textView);
        t2=findViewById(R.id.textView2);
        t3=findViewById(R.id.textView3);
        t4=findViewById(R.id.textView4);
        Intent i=new Intent(MainActivity.this,MainActivity2.class);
        b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=et1.getText().toString();
                String s2=et4.getText().toString();
                i.putExtra("msg1",s1);
                i.putExtra("msg2",s2);

                startActivity(i);
            }
        });

    }
}

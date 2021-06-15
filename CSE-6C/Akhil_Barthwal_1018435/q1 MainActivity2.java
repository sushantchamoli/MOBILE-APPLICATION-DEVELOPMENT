package tech.mrhunt.myapplicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t1;
//    TextView t2;
    TextView t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i=getIntent();
        t1=findViewById(R.id.textView1);
//        t2=findViewById(R.id.textView2);
        t3=findViewById(R.id.textView3);
        t1.setText(i.getStringExtra("msg1"));
//        t2.setText(i.getStringExtra("msg2"));
        t3.setText(i.getStringExtra("msg3"));

    }
}
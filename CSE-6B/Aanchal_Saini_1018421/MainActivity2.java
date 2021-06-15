package com.aanchal_saini.q1;

import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=findViewById(R.id.textView7);
        t2=findViewById(R.id.textView6);
        Intent i=getIntent();
        t1.setText(i.getStringExtra("msg1"));
        t2.setText(i.getStringExtra("msg2"));

    }
}
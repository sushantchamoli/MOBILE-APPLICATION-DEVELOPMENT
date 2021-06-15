package com.example.callingsecondactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = (TextView)findViewById(R.id.second_activity);
        Button button = (Button)findViewById(R.id.button_second_activity);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("msg2", "I'm back");
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        String age = intent.getStringExtra("age");
        String password = intent.getStringExtra("password");



        textView.setText("Details Are \n"+name+"  \n"+email+"  \n"+age+"  \n"+password);


    }
}
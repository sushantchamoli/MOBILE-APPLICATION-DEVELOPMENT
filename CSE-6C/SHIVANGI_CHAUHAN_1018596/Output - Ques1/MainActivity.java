package com.example.two_activities_navigate;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText text;
    EditText text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button_id);
        text = (EditText)findViewById(R.id.text_id);
        text2 = (EditText)findViewById(R.id.text3_id);
        button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v)
        {
        String str = text.getText().toString()+" "+text2.getText().toString();
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        intent.putExtra("input",str);
        startActivity(intent);
        }
    });
    }
}

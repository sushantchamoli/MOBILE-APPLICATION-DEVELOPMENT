package com.example.callingsecondactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    /*
    *   Name: Arvind Singh
    *   Rollno: 1018451
    *
     */
    private Button button;
    private EditText editText1, editText2, editText3, editText4;
    private Intent intent;
    private String name, email, age, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editTextTextPersonName3);
        editText2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        editText3 = (EditText) findViewById(R.id.editTextTextPersonName);
        editText4 = (EditText) findViewById(R.id.editTextTextPersonName4);
        button = (Button)findViewById(R.id.button);

        intent = new Intent(getApplicationContext(), MainActivity2.class);

        name = editText1.getText().toString();
        email = editText2.getText().toString();
        age = editText3.getText().toString();
        password = editText4.getText().toString();
        Log.e("Arvind", name);
        intent.putExtra("name", name);
        intent.putExtra("email", email);
        intent.putExtra("age", age);
        intent.putExtra("password", password);
        call();

    }

    public void call(){
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                startActivityForResult(intent, 22);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if(requestCode == 22)
        {
            if(resultCode==RESULT_OK)
            {
//                String name = data.getStringExtra("name", name);
//                String email = data.getStringExtra("msg2");
                //textView.setText(temp);
            }
        }

    }
}
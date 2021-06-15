package com.example.thirdq;

import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText name;
    EditText email;
    EditText age;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        age=findViewById(R.id.age);
        password=findViewById(R.id.password);
        final Intent i=new Intent(MainActivity.this,MainActivity2.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("msg1",password.getText().toString());
                i.putExtra("msg2",age.getText().toString());
                i.putExtra("msg3",email.getText().toString());
                i.putExtra("msg4",name.getText().toString());
                startActivity(i);
            }
        });
    }
}

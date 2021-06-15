package com.example.intent1;

        import android.content.Intent;
        import android.os.Bundle;
        import android.widget.TextView;
        import androidx.appcompat.app.AppCompatActivity;

public class Main_Activity2 extends AppCompatActivity {

    TextView name, age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        name = findViewById(R.id.name2);
        name.setText(i.getStringExtra("msg1"));
        age = findViewById(R.id.age2);
        age.setText(i.getStringExtra("msg2"));
    }
}
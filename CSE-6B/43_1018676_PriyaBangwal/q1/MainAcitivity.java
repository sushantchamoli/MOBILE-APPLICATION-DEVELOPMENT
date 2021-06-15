import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    Button bt1;

    final int Activity =3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.edt1);
        ed2 = findViewById(R.id.edt2);
        ed3 = findViewById(R.id.edt3);
        ed4 = findViewById(R.id.edt4);
        bt1 = findViewById(R.id.bt1);



        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().isEmpty() && ed2.getText().toString().isEmpty() && ed3.getText().toString().isEmpty() && ed4.getText().toString().isEmpty() )
                {
                    Toast.makeText(MainActivity.this,"Please enter all fields",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String name = ed1.getText().toString().trim();
                    String age = ed2.getText().toString().trim();
                    String email = ed3.getText().toString().trim();
                    String password = ed4.getText().toString().trim();
                    Intent intent = new Intent(MainActivity.this,com.paad.extintents.Act1.class);
                    intent.putExtra("Name",name);
                    intent.putExtra("Age",age);

                    startActivity(intent);
                }

            }
        });

       



    }
}
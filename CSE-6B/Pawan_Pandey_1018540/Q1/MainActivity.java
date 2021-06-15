import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button submit;
    EditText input;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.submit);
        input = findViewById(R.id.input);
        intent = new Intent(MainActivity.this,MainActivity2.class);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("Name",input.getText().toString());
                intent.putExtra("Email",input.getText().toString());
                intent.putExtra("Age",input.getText().toString());
                intent.putExtra("Password",input.getText().toString());
                startActivity(intent);
            }
        });

    }
}
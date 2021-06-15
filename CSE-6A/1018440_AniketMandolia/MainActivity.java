public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.editTextTextPersonName3);
        e2 = findViewById(R.id.editTextTextPersonName2);
        e3 = findViewById(R.id.editTextTextPersonName);
        e4 = findViewById(R.id.editTextTextPersonName4);
        button = findViewById(R.id.button);
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("name",e1.getText().toString());
                intent.putExtra("email",e2.getText().toString());
                intent.putExtra("age",e3.getText().toString());
                intent.putExtra("password",e4.getText().toString());
                startActivity(intent);
            }
        });
    }
}
//Hardik Singh
//1018492
//38
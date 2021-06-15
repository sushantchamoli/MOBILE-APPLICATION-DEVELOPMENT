public class FirstActivity extends AppCompatActivity {
    EditText etname,etage,etemail,etpass;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        etname=(EditText)findViewById(R.id.etname);
        etemail=(EditText)findViewById(R.id.etemail);
        etage=(EditText)findViewById(R.id.etage);
        etpass=(EditText)findViewById(R.id.etpass);
        submit=findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=etname.getText().toString();
                String email=etemail.getText().toString();
                String age=etage.getText().toString();
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("name",name);
                intent.putExtra("email",email);
                intent.putExtra("age",age);
                startActivity(intent);
            }
        });

    }
}

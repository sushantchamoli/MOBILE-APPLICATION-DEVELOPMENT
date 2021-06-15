//created by Stuti_Joshi
public class LoginActivity extends AppCompatActivity {
    EditText sname,sage,semail,spass;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        sname=(EditText)findViewById(R.id.sname);
        semail=(EditText)findViewById(R.id.semail);
        sage=(EditText)findViewById(R.id.sage);
        spass=(EditText)findViewById(R.id.spass);
        submit=findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=sname.getText().toString();
                String email=semail.getText().toString();
                String age=sage.getText().toString();
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("name",name);
                intent.putExtra("email",email);
                intent.putExtra("age",age);
                startActivity(intent);
            }
        });

    }
}

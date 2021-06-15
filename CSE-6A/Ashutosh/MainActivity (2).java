public class FirstActivityextends AppCompatActivity {
EditText etName,etAge,etEmail,etPass;
Button submit;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_first);

etName=(EditText)findViewById(R.id.etName);
etEmail=(EditText)findViewById(R.id.etEmail);
etAge=(EditText)findViewById(R.id.etAge);
etPass=(EditText)findViewById(R.id.etPass);
Submit=findViewById(R.id.Submit);

submit.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
                String name=etname.getText().toString();
String email=etemail.getText().toString();
String age=etage.getText().toString();
Intent intent = new Intent(MainActivity.this,SecondActivity.class);
intent.putExtra("name",Name);
intent.putExtra("email",Email);
intent.putExtra("age",Age);
startActivity(intent);
}
        });

}
}

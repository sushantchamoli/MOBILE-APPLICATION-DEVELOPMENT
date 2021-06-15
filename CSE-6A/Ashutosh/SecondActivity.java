public class SecondActivityextends AppCompatActivity {
EditText Name,Email,Ege;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_second);

Name=(EditText) findViewById(R.id.yName);
Email=(EditText)findViewById(R.id.yEmail);
Age=(EditText)findViewById(R.id.yAge);

Intent intent = getIntent();
String sname=intent.getStringExtra("name");
String semail=intent.getStringExtra("email");
String sage=intent.getStringExtra("age");

name.setText(sname);
email.setText(semail);
age.setText(sage);
}
}

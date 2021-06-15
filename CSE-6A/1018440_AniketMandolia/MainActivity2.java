public class MainActivity2 extends AppCompatActivity {
    TextView t1 ,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1 = findViewById(R.id.textView);
        t2 = findViewById(R.id.textView6);
        Intent intent = getIntent();
        t1.setText(intent.getStringExtra("name"));
        t2.setText(intent.getStringExtra("age"));
    }
}

//Hardik Singh
//1018492
//38
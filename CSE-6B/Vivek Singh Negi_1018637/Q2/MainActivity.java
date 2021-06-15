package abhiandroid.com.list;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;import android.widget.ListView;

public class MainActivity extends Activity
{
   
    ListView sl;
    String cl[] = {"India", "China", "australia", "Portugle", "America", "NewZealand"};

    @Override   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);      setContentView(R.layout.activity_main);

        sl = (ListView)findViewById(R.id.slView);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, cl);

        sl.setAdapter(arrayAdapter);
    }
}
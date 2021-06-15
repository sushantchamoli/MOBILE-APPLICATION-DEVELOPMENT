package AyushSinghandroid.com.listexample;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;import android.widget.ListView;        // name:ayush singh
                                                                          // rollno:1018469

public class MainActivity extends Activity
{
   
    ListView SimpList;
    String CountryList[] = {"India", "China", "australia", "Portugle", "America", "NewZealand"};

    @Override   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);      setContentView(R.layout.activity_main);
        SimpList = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, CountryList);
        SimpList.setAdapter(arrayAdapter);
    }
}
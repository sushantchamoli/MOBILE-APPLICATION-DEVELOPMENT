//Name: Piyush Bisht
//RollNo:1018542
//Section:C

package com.example.localservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity {
    Button b;
    TextView textView;
    MyService myService;
    boolean mBound=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        final ArrayList<Integer> arr=new ArrayList<>();

        arr.add(5);
        arr.add(3);
        arr.add(10);
        arr.add(9);
        arr.add(1);
        arr.add(2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mBound)
                {
                    textView.setText("SORTED ARRAY IS: ");
                    ArrayList<Integer> sortedList=myService.sortArray(arr);
                    for(int i=0;i<sortedList.size();i++)
                    {
                        textView.setText(textView.getText().toString()+sortedList.get(i).toString());
                    }

                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent=new Intent(this,MyService.class);
        bindService(intent,mConnection, Context.BIND_AUTO_CREATE);

    }

    @Override
    protected void onStop() {
        super.onStop();
        if(mBound)
        {
            unbindService(mConnection);
            mBound=false;
            Log.e(TAG, "onStop: SERVICE DISCONNECTED ");
        }
    }



    private ServiceConnection mConnection=new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            // We have bound to LocalService, cast the IBinder and get LocalService instance
            MyService.LocalBinder binder=(MyService.LocalBinder) iBinder;
            myService=binder.getService();
            mBound=true;
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

            mBound=false;
        }
    };
}
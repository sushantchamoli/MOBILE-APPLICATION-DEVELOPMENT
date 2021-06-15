package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button b1, b2, b3, b5;
    private ArrayList<Integer> num = new ArrayList<>();
    private TextView textView, textView2;
    private ServiceConnection serviceConnection = null;
    private MyService myService = null;
    private boolean isServiceBound = false;
/------------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init()
    {
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b5 = (Button) findViewById(R.id.button5);
        textView = (TextView) findViewById(R.id.input_text);
        textView2 = (TextView) findViewById(R.id.output_text);
        listener();
        num.add(23);
        num.add(9);
        num.add(21);
        num.add(92);
        num.add(79);
        num.add(35);

        String str = "Input Array:  ";
        for(Integer temp: num)
        {
            str += temp+" ";
        }
        textView.setText(str);
    }

    private void listener(){
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "START Pressed", Toast.LENGTH_SHORT).show();
                startService(new Intent(getApplicationContext(), MyService.class));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "STOP Pressed", Toast.LENGTH_SHORT).show();
                stopService(new Intent(getApplicationContext(), MyService.class));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "BIND Pressed", Toast.LENGTH_SHORT).show();
                bindService();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Sort Array Pressed", Toast.LENGTH_SHORT).show();
                sort();
            }
        });
    }

    public void bindService() {
        if(serviceConnection == null) {
            serviceConnection = new ServiceConnection() {
                @Override
                public void onServiceConnected(ComponentName name, IBinder service) {
                    isServiceBound = true;
                    MyService.MyBinder myServiceBinder = (MyService.MyBinder) service;
                    myService = myServiceBinder.getService();
                }

                @Override
                public void onServiceDisconnected(ComponentName name) {
                    isServiceBound = false;
                }
            };
            Intent serviceIntent = new Intent(getApplicationContext(), com.example.lab6.MyService.class);
            bindService(serviceIntent, serviceConnection, Context.BIND_AUTO_CREATE);
        }
    }

    public void sort()
    {
        if(isServiceBound)
        {
            myService.sort(num);
            String str ="";
            for(Integer temp: num)
            {
                str += temp+" ";
            }
            textView2.setText(str);
        }
    }
}

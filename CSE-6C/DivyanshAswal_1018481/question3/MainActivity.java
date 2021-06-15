package com.example.localboundservice;

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

    private Button button1, button2, button3, button5;
    private ArrayList<Integer> list = new ArrayList<>();
    private TextView textView, textView2;
    private ServiceConnection serviceConnection = null;
    private MyService myService = null;
    private boolean isServiceBound = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init()
    {
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button5 = (Button) findViewById(R.id.button5);
        textView = (TextView) findViewById(R.id.input_text);
        textView2 = (TextView) findViewById(R.id.output_text);
        listener();
        list.add(23);
        list.add(9);
        list.add(21);
        list.add(92);
        list.add(79);
        list.add(35);

        String str = "Input Array:  ";
        for(Integer temp: list)
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
            Intent serviceIntent = new Intent(getApplicationContext(), MyService.class);
            bindService(serviceIntent, serviceConnection, Context.BIND_AUTO_CREATE);
        }
    }

    public void sort()
    {
        if(isServiceBound)
        {
            myService.sort(list);
            String str = "Sort Array:  ";
            for(Integer temp: list)
            {
                str += temp+" ";
            }
            textView2.setText(str);
        }
        else{
            textView2.setText("Start Service and Bind it first");
        }
    }
}

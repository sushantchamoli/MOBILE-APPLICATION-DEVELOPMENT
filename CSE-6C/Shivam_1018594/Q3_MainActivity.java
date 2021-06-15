package com.Shivam.question3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

	private ListView lv;
	private SortService SS;
	private boolean isBound = false;
	private ArrayList<Integer> integerList;
	private ArrayAdapter<Integer> integerArrayAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		integerList = new ArrayList<>();
		integerList.add(0);
		integerList.add(23);
		integerList.add(45);
		integerList.add(85);
		integerList.add(100);
		integerList.add(102);
		integerList.add(129);
		integerList.add(844);

		integerArrayAdapter = new ArrayAdapter<>(this, R.layout.row_integer, integerList);

		lv = findViewById(R.id.lv);
		lv.setAdapter(integerArrayAdapter);

		Intent intent = new Intent(this, SortService.class);
		intent.putIntegerArrayListExtra("data", integerList);
		bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE);
	}

	public void sortNumbers(View view) {
		integerList = SS.sortNumbers();
		integerArrayAdapter = new ArrayAdapter<>(this, R.layout.row_integer, integerList);
		lv.setAdapter(integerArrayAdapter);
	}

	private final ServiceConnection serviceConnection = new ServiceConnection() {
		@Override
		public void onServiceConnected(ComponentName className, IBinder service) {
			SortService.LocalBinder binder = (SortService.LocalBinder) service;
			SS = binder.getService();
			isBound = true;
		}

		@Override
		public void onServiceDisconnected(ComponentName name) {
			isBound = false;
		}
	};

}

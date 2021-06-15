package com.xyz.q3;

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

	private ListView listView;
	private BoundService sortService;
	private boolean isBound = false;
	private ArrayList<Integer> integerList;
	private ArrayAdapter<Integer> integerArrayAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		integerList = new ArrayList<>();
		integerList.add(54);
		integerList.add(2);
		integerList.add(65);
		integerList.add(202);
		integerList.add(0);
		integerList.add(87);
		integerList.add(12);
		integerList.add(78);
		integerList.add(23);

		integerArrayAdapter = new ArrayAdapter<>(this, R.layout.numbers, integerList);

		listView = findViewById(R.id.listView);
		listView.setAdapter(integerArrayAdapter);

		Intent intent = new Intent(this, BoundService.class);
		intent.putIntegerArrayListExtra("numbers", integerList);
		bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE);
	}

	public void onclick(View view) {
		integerList = sortService.sortNumbers();
		integerArrayAdapter = new ArrayAdapter<>(this, R.layout.numbers, integerList);
		listView.setAdapter(integerArrayAdapter);
		view.setVisibility(View.GONE);
	}

	private final ServiceConnection serviceConnection = new ServiceConnection() {
		@Override
		public void onServiceConnected(ComponentName className, IBinder service) {
			BoundService.LocalBinder binder = (BoundService.LocalBinder) service;
			sortService = binder.getService();
			isBound = true;
		}

		@Override
		public void onServiceDisconnected(ComponentName name) {
			isBound = false;
		}
	};

}
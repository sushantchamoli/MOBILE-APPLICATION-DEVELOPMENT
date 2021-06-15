package com.sarthak.ques3;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collections;

public class BoundService extends Service {

	private ArrayList<Integer> integers;
	private final IBinder binder = new LocalBinder();

	@Nullable
	@Override
	public IBinder onBind(Intent intent) {
		integers = intent.getIntegerArrayListExtra("numbers");
		return binder;
	}

	public ArrayList<Integer> sortNumbers() {
		Collections.sort(integers);
		return integers;
	}

	public class LocalBinder extends Binder {
		BoundService getService() {
			return BoundService.this;
		}
	}
}

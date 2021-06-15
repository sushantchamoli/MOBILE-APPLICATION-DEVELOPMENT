package com.endsem.thirdquestion;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collections;

public class WorkService extends Service {

	private ArrayList<Integer> arrayList;
	private final IBinder binder = new LocalBinder();

	@Nullable
	@Override
	public IBinder onBind(Intent intent) {
		arrayList = intent.getIntegerArrayListExtra("data");
		return binder;
	}

	public ArrayList<Integer> sortNumbers() {
		Collections.sort(arrayList);
		return arrayList;
	}

	public class LocalBinder extends Binder {
		WorkService getService() {
			return WorkService.this;
		}
	}

}

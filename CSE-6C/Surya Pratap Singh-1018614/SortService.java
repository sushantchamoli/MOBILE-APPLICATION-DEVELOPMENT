package com.surya.localbounded_suryapratap_1018614;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collections;

public class SortService extends Service {

    private ArrayList<Integer> integers;
    private final IBinder binder = new LocalBinder();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        integers = intent.getIntegerArrayListExtra("data");
        return binder;
    }

    public ArrayList<Integer> sortNumbers() {
        Collections.sort(integers);
        return integers;
    }

    public class LocalBinder extends Binder {
        SortService getService() {
            return SortService.this;
        }
    }

}

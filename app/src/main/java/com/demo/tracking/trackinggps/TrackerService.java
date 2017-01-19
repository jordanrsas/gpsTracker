package com.demo.tracking.trackinggps;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;

/**
 * Created by Jordan on 19/01/2017.
 */

public class TrackerService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        makeText(this, " MyService Created ", LENGTH_LONG).show();
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        //Se debe Bindear la variable mLastLocation
        //makeText(this, "Latitude: " + latitude + ", Longitude: " + longitude, LENGTH_LONG).show();
        makeText(this, " MyService Start ", LENGTH_LONG).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        // TODO Auto-generated method stub
        makeText(this, "Servics Stopped", LENGTH_SHORT).show();
        super.onDestroy();
    }

}

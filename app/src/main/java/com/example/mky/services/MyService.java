package com.example.mky.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.provider.Settings;
import android.util.Log;
import android.os.HandlerThread;

public class MyService extends Service {
    public static final String TAG = "om.example.mky.services";
    public MyService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG,"onStartCommand method called");
        //
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++) {
                    Long futureTime = System.currentTimeMillis() + 5000;
                    while (System.currentTimeMillis() < futureTime) {
                        synchronized (this) {
                            try {
                                wait(futureTime - System.currentTimeMillis());
                                Log.i(TAG, "Service is doing something");
                            } catch (Exception e) {

                            }
                        }
                    }
                }
            }
        };
        Thread buckysThread = new Thread(r);
        buckysThread.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        Log.i(TAG,"onDestroy method called");
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.

        return null;
    }
}

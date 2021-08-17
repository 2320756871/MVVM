package com.zy.frameworkapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

import com.zy.msgbus.MsgBus;


public class TestService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("123", "onStartCommand: service is start....");
        MsgBus.getInstance().getDefault().post(new MsgEvent1("xiaoming"));
        return super.onStartCommand(intent, flags, startId);
    }
}

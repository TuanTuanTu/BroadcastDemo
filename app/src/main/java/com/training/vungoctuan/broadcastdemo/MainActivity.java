package com.training.vungoctuan.broadcastdemo;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.training.vungoctuan.broadcastdemo.broadcasts.MyBroadcastReceiver;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BroadcastReceiver br = new MyBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        intentFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        this.registerReceiver(br,intentFilter);


    }
}

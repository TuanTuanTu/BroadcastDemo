package com.training.vungoctuan.broadcastdemo.broadcasts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by vungoctuan on 2/9/18.
 */
public class MyBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "BroadcastReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        String log = ("Action: " + intent.getAction() + "\n") +
            "URI: " + intent.toUri(Intent.URI_INTENT_SCHEME) + "\n";
        Log.d(TAG, log);
        Toast.makeText(context, log, Toast.LENGTH_LONG).show();
    }
}

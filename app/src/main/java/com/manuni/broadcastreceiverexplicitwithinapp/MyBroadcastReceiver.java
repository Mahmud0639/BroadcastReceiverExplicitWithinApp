package com.manuni.broadcastreceiverexplicitwithinapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Received broadcast message.", Toast.LENGTH_SHORT).show();
    }
}

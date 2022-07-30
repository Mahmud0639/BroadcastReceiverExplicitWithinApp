package com.manuni.broadcastreceiverexplicitwithinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendBroadcast(View view) {
        //this is explicit broadcast receiver
        Intent intent = new Intent(MainActivity.this,MyBroadcastReceiver.class);
        sendBroadcast(intent);
    }
}
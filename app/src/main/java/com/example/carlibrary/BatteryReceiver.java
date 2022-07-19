package com.example.carlibrary;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

class BatteryReceiver extends BroadcastReceiver {
    TextView receiver;
    BatteryReceiver(TextView receiver){
        this.receiver= receiver;
    }
    @Override
    public void onReceive(Context context, Intent intent) {
        int percentage=intent.getIntExtra("level",0);
        if(percentage!=0)
        {
            receiver.setText(percentage+ "%remaining");
        }


    }
}

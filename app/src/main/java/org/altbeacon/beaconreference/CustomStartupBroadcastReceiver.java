package org.altbeacon.beaconreference;

import android.content.Context;
import android.content.Intent;

import org.altbeacon.beacon.startup.StartupBroadcastReceiver;

public class CustomStartupBroadcastReceiver extends StartupBroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        ((BeaconReferenceApplication) context.getApplicationContext()).doStuff();
        super.onReceive(context, intent);
    }
}

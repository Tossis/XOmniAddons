package com.tossis.android.xposed.omnirom.addons.mods;

import android.content.res.XResources;
import android.util.Log;

import com.tossis.android.xposed.omnirom.addons.XOmniAddons;

public class DisplayMods {
    
    public static void handleEnableAllRotationAngles () {
        try {
                Log.d(XOmniAddons.LOGCAT_TAG, "Enabling all rotation angles.");
                XResources.setSystemWideReplacement("android", "bool", "config_allowAllRotations", true);
        } catch (Throwable t) {
            Log.e(XOmniAddons.LOGCAT_TAG,"Exeption on 'handleEnableAllRotationAngles()'", t) ;
        }
    }
}
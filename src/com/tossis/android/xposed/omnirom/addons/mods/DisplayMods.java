package com.tossis.android.xposed.omnirom.addons.mods;

import android.content.res.XResources;
import android.util.Log;

import com.tossis.android.xposed.omnirom.addons.XposedRomAddons;

import de.robv.android.xposed.XposedBridge;

public class DisplayMods {
    
    public static void handleEnableAllRotationAngles () {
        try {
                Log.d(XposedRomAddons.LOGCAT_TAG, "Enabling all rotation angles.");
                XResources.setSystemWideReplacement("android", "bool", "config_allowAllRotations", true);
        } catch (Throwable t) {
            Log.e(XposedRomAddons.LOGCAT_TAG,"Exeption on 'handleEnableAllRotationAngles()'", t) ;
        }
    }
    
    public static void handleDisableScreenOnUnplug () {
        try {
                XposedBridge.log("Disabling screen turning on when charger cable is unplugged");
                XResources.setSystemWideReplacement("android", "bool", "config_unplugTurnsOnScreen", false);
        } catch (Throwable t) {
            XposedBridge.log(t);
        }
    }
    
}
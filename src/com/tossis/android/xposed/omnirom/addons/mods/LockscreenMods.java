package com.tossis.android.xposed.omnirom.addons.mods;

import android.content.res.XResources;
import android.util.Log;

import com.tossis.android.xposed.omnirom.addons.XposedRomAddons;

import de.robv.android.xposed.XposedBridge;

public class LockscreenMods {
    
    public static void enableLockscreenRotatoion () {
        try {
            Log.d(XposedRomAddons.LOGCAT_TAG, "Enabling Lockscreen Rotation");
            XResources.setSystemWideReplacement("android", "bool", "config_enableLockScreenRotation", true);
            XResources.setSystemWideReplacement("android", "bool", "lockscreen_isPortrait", false);
    } catch (Throwable t) { 
        XposedBridge.log(t); 
    }
    }
}

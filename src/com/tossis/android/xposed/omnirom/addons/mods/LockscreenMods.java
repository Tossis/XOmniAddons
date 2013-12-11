package com.tossis.android.xposed.omnirom.addons.mods;

import android.content.res.XResources;
import android.util.Log;

import com.tossis.android.xposed.omnirom.addons.XOmniAddons;

import de.robv.android.xposed.XposedBridge;

public class LockscreenMods {
    
    public static void enableLockscreenRotatoion () {
        try {
            Log.d(XOmniAddons.LOGCAT_TAG, "Enabling Lockscreen Rotation");
            XResources.setSystemWideReplacement("android", "bool", "config_enableLockScreenRotation", true);
	    } catch (Throwable t) { 
	        XposedBridge.log(t); 
	    }
    }
}

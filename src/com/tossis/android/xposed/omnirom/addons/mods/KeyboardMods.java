package com.tossis.android.xposed.omnirom.addons.mods;

import android.content.res.XResources;
import android.util.Log;

import com.tossis.android.xposed.omnirom.addons.XOmniAddons;

import de.robv.android.xposed.XposedBridge;

public class KeyboardMods {
    
    public static void handleDisableOngoingImeSwitcher () {
        try {
                Log.d(XOmniAddons.LOGCAT_TAG, "Disabling ongoing IME Switcher");
                XResources.setSystemWideReplacement("android", "bool", "show_ongoing_ime_switcher", false);
        } catch (Throwable t) { 
            XposedBridge.log(t); 
        }
    }
    
}

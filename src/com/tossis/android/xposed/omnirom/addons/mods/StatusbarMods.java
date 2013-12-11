package com.tossis.android.xposed.omnirom.addons.mods;

import static de.robv.android.xposed.XposedHelpers.findAndHookMethod;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedBridge;

public class StatusbarMods {
    
    public static void handleDisableFullBatteryNotification (ClassLoader classLoader) {
        try {
                XposedBridge.log("Disabling Battery full notification");
                findAndHookMethod("com.android.systemui.power.PowerUI", classLoader, "notifyFullBatteryNotification", XC_MethodReplacement.DO_NOTHING);
        } catch (Throwable t) { 
            XposedBridge.log(t); 
        }
    }
    
}

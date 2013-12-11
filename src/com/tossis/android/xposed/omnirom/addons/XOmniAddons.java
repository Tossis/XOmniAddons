package com.tossis.android.xposed.omnirom.addons;

import com.tossis.android.xposed.omnirom.addons.mods.DisplayMods;
import com.tossis.android.xposed.omnirom.addons.mods.KeyboardMods;
import com.tossis.android.xposed.omnirom.addons.mods.LockscreenMods;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;

public class XOmniAddons implements IXposedHookZygoteInit, IXposedHookLoadPackage {
    
    /**
     * Global flag to disable detailed logging. Will be used for development purposes, so for deployment we do not spam the logs.
     */
    public static final String LOGCAT_TAG = "XposedRomAddons";
    public static final String PACKAGE_NAME = XOmniAddons.class.getPackage().getName();
    
    
    @Override
    public void initZygote(StartupParam startupParam) throws Throwable {
        DisplayMods.handleEnableAllRotationAngles();
        KeyboardMods.handleDisableOngoingImeSwitcher();
        LockscreenMods.enableLockscreenRotatoion();
    }

    @Override
    public void handleLoadPackage(LoadPackageParam lpparam) throws Throwable {
        
    }
}
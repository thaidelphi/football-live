package com.ironsource.mediationsdk.config;

import com.adcolony.sdk.AdColonyAppOptions;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ConfigFile {
    private static ConfigFile mInstance;
    private String mPluginFrameworkVersion;
    private String mPluginType;
    private String mPluginVersion;
    private String[] mSupportedPlugins = {"AdobeAir", "Cocos2dx", "Cordova", AdColonyAppOptions.CORONA, "Defold", "Flutter", "ReactNative", AdColonyAppOptions.UNITY, "Unreal", "MAUI", "Other"};

    public static synchronized ConfigFile getConfigFile() {
        ConfigFile configFile;
        synchronized (ConfigFile.class) {
            if (mInstance == null) {
                mInstance = new ConfigFile();
            }
            configFile = mInstance;
        }
        return configFile;
    }

    public String getPluginFrameworkVersion() {
        return this.mPluginFrameworkVersion;
    }

    public String getPluginType() {
        return this.mPluginType;
    }

    public String getPluginVersion() {
        return this.mPluginVersion;
    }

    public void setPluginData(String str, String str2, String str3) {
        this.mPluginType = null;
        if (str != null) {
            String[] strArr = this.mSupportedPlugins;
            int length = strArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                String str4 = strArr[i10];
                if (str.equalsIgnoreCase(str4)) {
                    this.mPluginType = str4;
                    break;
                }
                i10++;
            }
        }
        if (str2 != null) {
            this.mPluginVersion = str2;
        }
        if (str3 != null) {
            this.mPluginFrameworkVersion = str3;
        }
    }
}

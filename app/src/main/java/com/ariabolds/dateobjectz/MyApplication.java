package com.ariabolds.dateobjectz;

import android.app.Application;
import android.content.Context;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MyApplication extends Application {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        StartAppAd.disableSplash();
        StartAppSDK.enableReturnAds(false);
    }
}

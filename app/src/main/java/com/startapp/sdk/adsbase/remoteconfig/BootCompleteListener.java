package com.startapp.sdk.adsbase.remoteconfig;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.startapp.f0;
import com.startapp.m8;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class BootCompleteListener extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    @SuppressLint({"UnsafeProtectedBroadcastReceiver"})
    public final void onReceive(Context context, Intent intent) {
        Object obj = StartAppSDKInternal.C;
        Context a10 = f0.a(context);
        if (a10 != null) {
            context = a10;
        }
        StartAppSDKInternal.c.f22944a.d(context);
        com.startapp.sdk.components.a.a(context).f23248x.a().execute(new m8(context));
    }
}

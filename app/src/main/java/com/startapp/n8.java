package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.SDKAdPreferences;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f22330a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f22331b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f22332c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ SDKAdPreferences f22333d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f22334e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ StartAppSDKInternal f22335f;

    public n8(StartAppSDKInternal startAppSDKInternal, Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, boolean z10) {
        this.f22335f = startAppSDKInternal;
        this.f22330a = context;
        this.f22331b = str;
        this.f22332c = str2;
        this.f22333d = sDKAdPreferences;
        this.f22334e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (StartAppSDKInternal.C) {
            StartAppSDKInternal.a(this.f22335f, this.f22330a, this.f22331b, this.f22332c, this.f22333d, this.f22334e);
        }
    }
}

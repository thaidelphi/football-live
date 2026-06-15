package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class m8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f22292a;

    public m8(Context context) {
        this.f22292a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (StartAppSDKInternal.C) {
            StartAppSDKInternal.a(this.f22292a);
        }
    }
}

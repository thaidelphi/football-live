package com.startapp;

import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MraidMetadata;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class t5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f23379a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f23380b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h2 f23381c = null;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ u5 f23382d;

    public t5(u5 u5Var, String str, String str2) {
        this.f23382d = u5Var;
        this.f23379a = str;
        this.f23380b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int a10 = u5.a(this.f23382d, this.f23379a, this.f23380b);
            h2 h2Var = this.f23381c;
            if (h2Var != null) {
                h2Var.a(Integer.valueOf(a10));
            }
        } catch (Throwable th) {
            MraidMetadata call = this.f23382d.f23441c.call();
            ComponentInfoEventConfig b10 = call != null ? call.b() : null;
            boolean z10 = true;
            if ((b10 == null || !b10.a((long) 1)) ? false : false) {
                l3.a(th);
            }
        }
    }
}

package com.startapp;

import com.startapp.sdk.adsbase.remoteconfig.NetworkDiagnosticConfig;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f21909a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f21910b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f21911c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d6 f21912d;

    public e6(d6 d6Var, String str, String str2, long j10) {
        this.f21912d = d6Var;
        this.f21909a = str;
        this.f21910b = str2;
        this.f21911c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d6 d6Var = this.f21912d;
        String str = this.f21909a;
        String str2 = this.f21910b;
        long j10 = this.f21911c;
        d6Var.getClass();
        try {
            d6Var.f21879b.a(str, str2, System.currentTimeMillis(), j10);
        } catch (Throwable th) {
            NetworkDiagnosticConfig call = d6Var.f21881d.call();
            call = (call == null || !call.e()) ? null : null;
            boolean z10 = true;
            if ((call == null || (call.a() & 1) != 1) ? false : false) {
                l3.a(th);
            }
        }
    }
}

package com.startapp;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class t6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23383a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.d f23384b;

    public t6(com.startapp.sdk.ads.video.d dVar, int i10) {
        this.f23384b = dVar;
        this.f23383a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va vaVar = this.f23384b.f22795b;
        if (vaVar != null) {
            ((ta) vaVar).a(this.f23383a);
        }
    }
}

package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f23206a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MetaDataRequest.RequestReason f23207b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f23208c;

    public b(c cVar, MetaDataRequest.RequestReason requestReason, boolean z10) {
        this.f23206a = cVar;
        this.f23207b = requestReason;
        this.f23208c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23206a.a(this.f23207b, this.f23208c);
    }
}

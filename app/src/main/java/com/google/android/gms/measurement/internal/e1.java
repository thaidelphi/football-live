package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class e1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f12913a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f12914b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f12915c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Bundle f12916d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f12917e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f12918f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ boolean f12919g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ String f12920h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ zzid f12921i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e1(zzid zzidVar, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f12921i = zzidVar;
        this.f12913a = str;
        this.f12914b = str2;
        this.f12915c = j10;
        this.f12916d = bundle;
        this.f12917e = z10;
        this.f12918f = z11;
        this.f12919g = z12;
        this.f12920h = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12921i.r(this.f12913a, this.f12914b, this.f12915c, this.f12916d, this.f12917e, this.f12918f, this.f12919g, this.f12920h);
    }
}

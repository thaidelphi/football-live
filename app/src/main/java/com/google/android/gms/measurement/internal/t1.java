package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzoz;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class t1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzai f13157a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f13158b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f13159c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f13160d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzai f13161e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ zzid f13162f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t1(zzid zzidVar, zzai zzaiVar, int i10, long j10, boolean z10, zzai zzaiVar2) {
        this.f13162f = zzidVar;
        this.f13157a = zzaiVar;
        this.f13158b = i10;
        this.f13159c = j10;
        this.f13160d = z10;
        this.f13161e = zzaiVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13162f.E(this.f13157a);
        zzid.X(this.f13162f, this.f13157a, this.f13158b, this.f13159c, false, this.f13160d);
        zzoz.zzc();
        if (this.f13162f.f13220a.u().w(null, zzeb.f13445u0)) {
            zzid.W(this.f13162f, this.f13157a, this.f13161e);
        }
    }
}

package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzoz;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class s1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzai f13137a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f13138b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f13139c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f13140d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f13141e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ zzai f13142f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ zzid f13143g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s1(zzid zzidVar, zzai zzaiVar, long j10, int i10, long j11, boolean z10, zzai zzaiVar2) {
        this.f13143g = zzidVar;
        this.f13137a = zzaiVar;
        this.f13138b = j10;
        this.f13139c = i10;
        this.f13140d = j11;
        this.f13141e = z10;
        this.f13142f = zzaiVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13143g.E(this.f13137a);
        this.f13143g.u(this.f13138b, false);
        zzid.X(this.f13143g, this.f13137a, this.f13139c, this.f13140d, true, this.f13141e);
        zzoz.zzc();
        if (this.f13143g.f13220a.u().w(null, zzeb.f13445u0)) {
            zzid.W(this.f13143g, this.f13137a, this.f13142f);
        }
    }
}

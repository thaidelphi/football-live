package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class g0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzhb f12956a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzfy f12957b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(zzfy zzfyVar, zzhb zzhbVar) {
        this.f12957b = zzfyVar;
        this.f12956a = zzhbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfy.a(this.f12957b, this.f12956a);
        this.f12957b.h(this.f12956a.f13601g);
    }
}

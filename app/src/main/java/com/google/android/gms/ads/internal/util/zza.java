package com.google.android.gms.ads.internal.util;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zza implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzb f11398a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zza(zzb zzbVar) {
        this.f11398a = zzbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11398a.zzb = Thread.currentThread();
        this.f11398a.zza();
    }
}

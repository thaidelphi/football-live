package com.google.android.gms.ads.internal.util.client;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class zzd extends Thread {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f11373a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzd(zzf zzfVar, String str) {
        this.f11373a = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzu(null).zza(this.f11373a);
    }
}

package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzbzx implements Runnable {
    final /* synthetic */ zzbzz zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbzx(zzbzz zzbzzVar) {
        this.zza = zzbzzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzK("surfaceDestroyed", new String[0]);
    }
}

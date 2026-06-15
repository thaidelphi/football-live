package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbmj implements zzbyy {
    final /* synthetic */ zzbml zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbmj(zzbml zzbmlVar) {
        this.zza = zzbmlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbmq zzbmqVar;
        zzbms zzbmsVar = (zzbms) obj;
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        zzbmqVar = this.zza.zzb;
        zzbmqVar.zzd();
    }
}

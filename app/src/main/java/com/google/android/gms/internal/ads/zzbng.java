package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbng implements zzbyy {
    final /* synthetic */ zzbml zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzbyu zzc;
    final /* synthetic */ zzbnj zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbng(zzbnj zzbnjVar, zzbml zzbmlVar, Object obj, zzbyu zzbyuVar) {
        this.zza = zzbmlVar;
        this.zzb = obj;
        this.zzc = zzbyuVar;
        this.zzd = zzbnjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.zzb;
        zzbyu zzbyuVar = this.zzc;
        zzbnj.zzd(this.zzd, this.zza, (zzbms) obj, obj2, zzbyuVar);
    }
}

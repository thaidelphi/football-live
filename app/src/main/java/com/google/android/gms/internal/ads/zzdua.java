package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdua implements zzgal {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdub zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdua(zzdub zzdubVar, String str) {
        this.zza = str;
        this.zzb = zzdubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdtp zzdtpVar;
        ((zzdss) obj).zzf();
        zzdtpVar = this.zzb.zzd;
        zzdtpVar.zzk(this.zza);
    }
}

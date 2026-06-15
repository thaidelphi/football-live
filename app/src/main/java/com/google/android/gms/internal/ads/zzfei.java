package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfei implements zzgal {
    final /* synthetic */ zzfdz zza;
    final /* synthetic */ zzfej zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfei(zzfej zzfejVar, zzfdz zzfdzVar) {
        this.zza = zzfdzVar;
        this.zzb = zzfejVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        zzfem zzfemVar;
        zzfemVar = this.zzb.zza.zzd;
        zzfemVar.zzb(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zzb(Object obj) {
        zzfem zzfemVar;
        zzfemVar = this.zzb.zza.zzd;
        zzfemVar.zzd(this.zza);
    }
}

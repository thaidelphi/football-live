package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgkc implements zzgcg {
    final String zza;
    final Class zzb;
    final zzgrc zzc;

    zzgkc(String str, Class cls, zzgrc zzgrcVar, zzgyd zzgydVar) {
        this.zza = str;
        this.zzb = cls;
        this.zzc = zzgrcVar;
    }

    public static zzgcg zzd(String str, Class cls, zzgrc zzgrcVar, zzgyd zzgydVar) {
        return new zzgkc(str, cls, zzgrcVar, zzgydVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final zzgre zza(zzgvc zzgvcVar) throws GeneralSecurityException {
        zzgrg zza = zzgri.zza();
        zza.zzb(this.zza);
        zza.zzc(zzgvcVar);
        zza.zza(zzgsi.RAW);
        zzgmb zzgmbVar = (zzgmb) zzgle.zzc().zzd(zzgku.zzb().zza(zzgle.zzc().zzb(zzgmc.zza((zzgri) zza.zzbr())), null), zzgmb.class, zzgce.zza());
        zzgrb zza2 = zzgre.zza();
        zza2.zzb(zzgmbVar.zzg());
        zza2.zzc(zzgmbVar.zze());
        zza2.zza(zzgmbVar.zzb());
        return (zzgre) zza2.zzbr();
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final Class zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final Object zzc(zzgvc zzgvcVar) throws GeneralSecurityException {
        return zzglb.zza().zzb(zzgle.zzc().zza(zzgmb.zza(this.zza, zzgvcVar, this.zzc, zzgsi.RAW, null), zzgce.zza()), this.zzb);
    }
}

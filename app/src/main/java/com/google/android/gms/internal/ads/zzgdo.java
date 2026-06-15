package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgdo implements zzgma {
    private static final zzgdo zza = new zzgdo();
    private static final zzglr zzb = zzglr.zzb(new zzglp() { // from class: com.google.android.gms.internal.ads.zzgdl
        @Override // com.google.android.gms.internal.ads.zzglp
        public final Object zza(zzgcf zzgcfVar) {
            return zzgiu.zzb((zzgke) zzgcfVar);
        }
    }, zzgke.class, zzgbv.class);

    zzgdo() {
    }

    public static void zzd() throws GeneralSecurityException {
        zzglb.zza().zzd(zza);
        zzglb.zza().zzc(zzb);
    }

    public static void zze(zzgls zzglsVar) throws GeneralSecurityException {
        zzglsVar.zzb(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgma
    public final Class zza() {
        return zzgbv.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgma
    public final Class zzb() {
        return zzgbv.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgma
    public final /* synthetic */ Object zzc(zzglz zzglzVar) throws GeneralSecurityException {
        return new zzgdm(zzglzVar, null);
    }
}

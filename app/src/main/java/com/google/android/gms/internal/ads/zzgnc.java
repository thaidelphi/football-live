package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgnc implements zzgma {
    private static final zzgnc zza = new zzgnc();

    private zzgnc() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzd() throws GeneralSecurityException {
        zzglb.zza().zzd(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgma
    public final Class zza() {
        return zzgmz.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgma
    public final Class zzb() {
        return zzgmz.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgma
    public final /* bridge */ /* synthetic */ Object zzc(zzglz zzglzVar) throws GeneralSecurityException {
        if (zzglzVar.zzc() != null) {
            for (List<zzglx> list : zzglzVar.zze()) {
                for (zzglx zzglxVar : list) {
                    zzgmz zzgmzVar = (zzgmz) zzglxVar.zzd();
                }
            }
            return new zzgna(zzglzVar, null);
        }
        throw new GeneralSecurityException("no primary in primitive set");
    }
}

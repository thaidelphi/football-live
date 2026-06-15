package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgdi {
    public static final /* synthetic */ int zza = 0;
    private static final zzgjs zzb = zzb();

    public static zzgbz zza() throws GeneralSecurityException {
        if (zzgjl.zzb()) {
            throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV0 in FIPS mode");
        }
        return zzb;
    }

    private static zzgjs zzb() {
        try {
            zzgls zza2 = zzglv.zza();
            zzgdo.zze(zza2);
            zza2.zza(zzglr.zzb(new zzglp() { // from class: com.google.android.gms.internal.ads.zzgdb
                @Override // com.google.android.gms.internal.ads.zzglp
                public final Object zza(zzgcf zzgcfVar) {
                    return zzgtj.zzb((zzgdr) zzgcfVar);
                }
            }, zzgdr.class, zzgbv.class));
            zza2.zza(zzglr.zzb(new zzglp() { // from class: com.google.android.gms.internal.ads.zzgdc
                @Override // com.google.android.gms.internal.ads.zzglp
                public final Object zza(zzgcf zzgcfVar) {
                    return zzgtg.zzb((zzgen) zzgcfVar);
                }
            }, zzgen.class, zzgbv.class));
            zza2.zza(zzglr.zzb(new zzglp() { // from class: com.google.android.gms.internal.ads.zzgdd
                @Override // com.google.android.gms.internal.ads.zzglp
                public final Object zza(zzgcf zzgcfVar) {
                    return zzgjj.zzb((zzgey) zzgcfVar);
                }
            }, zzgey.class, zzgbv.class));
            zza2.zza(zzglr.zzb(new zzglp() { // from class: com.google.android.gms.internal.ads.zzgde
                @Override // com.google.android.gms.internal.ads.zzglp
                public final Object zza(zzgcf zzgcfVar) {
                    return zzgtf.zzb((zzged) zzgcfVar);
                }
            }, zzged.class, zzgbv.class));
            zza2.zza(zzglr.zzb(new zzglp() { // from class: com.google.android.gms.internal.ads.zzgdf
                @Override // com.google.android.gms.internal.ads.zzglp
                public final Object zza(zzgcf zzgcfVar) {
                    zzgfh zzgfhVar = (zzgfh) zzgcfVar;
                    int i10 = zzgdi.zza;
                    if (zzgih.zze()) {
                        return zzgih.zzb(zzgfhVar);
                    }
                    return zzgti.zzb(zzgfhVar);
                }
            }, zzgfh.class, zzgbv.class));
            zza2.zza(zzglr.zzb(new zzglp() { // from class: com.google.android.gms.internal.ads.zzgdg
                @Override // com.google.android.gms.internal.ads.zzglp
                public final Object zza(zzgcf zzgcfVar) {
                    zzghd zzghdVar = (zzghd) zzgcfVar;
                    int i10 = zzgdi.zza;
                    if (zzgjc.zzc()) {
                        return zzgjc.zzb(zzghdVar);
                    }
                    return zzgug.zzb(zzghdVar);
                }
            }, zzghd.class, zzgbv.class));
            zza2.zza(zzglr.zzb(new zzglp() { // from class: com.google.android.gms.internal.ads.zzgdh
                @Override // com.google.android.gms.internal.ads.zzglp
                public final Object zza(zzgcf zzgcfVar) {
                    return zzgiw.zzb((zzggx) zzgcfVar);
                }
            }, zzggx.class, zzgbv.class));
            return zzgjs.zzd(zza2.zzc());
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException(e8);
        }
    }
}

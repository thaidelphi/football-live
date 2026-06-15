package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgle {
    private static final zzgle zza = (zzgle) zzgmm.zza(new zzgml() { // from class: com.google.android.gms.internal.ads.zzglc
        @Override // com.google.android.gms.internal.ads.zzgml
        public final Object zza() {
            zzgle zzgleVar = new zzgle();
            zzgleVar.zzg(new zzgjy(zzgke.class, zzgmb.class, new zzgjz() { // from class: com.google.android.gms.internal.ads.zzgld
                @Override // com.google.android.gms.internal.ads.zzgjz
                public final zzgmf zza(zzgcf zzgcfVar, zzgcw zzgcwVar) {
                    return ((zzgke) zzgcfVar).zza(zzgcwVar);
                }
            }));
            return zzgleVar;
        }
    });
    private final AtomicReference zzb = new AtomicReference(new zzgmk(new zzgmg(), null));

    public static zzgle zzc() {
        return zza;
    }

    public final zzgcf zza(zzgmf zzgmfVar, zzgcw zzgcwVar) throws GeneralSecurityException {
        return ((zzgmk) this.zzb.get()).zza(zzgmfVar, zzgcwVar);
    }

    public final zzgcs zzb(zzgmf zzgmfVar) throws GeneralSecurityException {
        return ((zzgmk) this.zzb.get()).zzb(zzgmfVar);
    }

    public final zzgmf zzd(zzgcf zzgcfVar, Class cls, zzgcw zzgcwVar) throws GeneralSecurityException {
        return ((zzgmk) this.zzb.get()).zzc(zzgcfVar, cls, zzgcwVar);
    }

    public final zzgmf zze(zzgcs zzgcsVar, Class cls) throws GeneralSecurityException {
        return ((zzgmk) this.zzb.get()).zzd(zzgcsVar, cls);
    }

    public final synchronized void zzf(zzgjx zzgjxVar) throws GeneralSecurityException {
        zzgmg zzgmgVar = new zzgmg((zzgmk) this.zzb.get());
        zzgmgVar.zza(zzgjxVar);
        this.zzb.set(new zzgmk(zzgmgVar, null));
    }

    public final synchronized void zzg(zzgkb zzgkbVar) throws GeneralSecurityException {
        zzgmg zzgmgVar = new zzgmg((zzgmk) this.zzb.get());
        zzgmgVar.zzb(zzgkbVar);
        this.zzb.set(new zzgmk(zzgmgVar, null));
    }

    public final synchronized void zzh(zzglj zzgljVar) throws GeneralSecurityException {
        zzgmg zzgmgVar = new zzgmg((zzgmk) this.zzb.get());
        zzgmgVar.zzc(zzgljVar);
        this.zzb.set(new zzgmk(zzgmgVar, null));
    }

    public final synchronized void zzi(zzgln zzglnVar) throws GeneralSecurityException {
        zzgmg zzgmgVar = new zzgmg((zzgmk) this.zzb.get());
        zzgmgVar.zzd(zzglnVar);
        this.zzb.set(new zzgmk(zzgmgVar, null));
    }

    public final boolean zzj(zzgmf zzgmfVar) {
        return ((zzgmk) this.zzb.get()).zzi(zzgmfVar);
    }

    public final boolean zzk(zzgmf zzgmfVar) {
        return ((zzgmk) this.zzb.get()).zzj(zzgmfVar);
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgmb implements zzgmf {
    private final String zza;
    private final zzguh zzb;
    private final zzgvc zzc;
    private final zzgrc zzd;
    private final zzgsi zze;
    private final Integer zzf;

    private zzgmb(String str, zzguh zzguhVar, zzgvc zzgvcVar, zzgrc zzgrcVar, zzgsi zzgsiVar, Integer num) {
        this.zza = str;
        this.zzb = zzguhVar;
        this.zzc = zzgvcVar;
        this.zzd = zzgrcVar;
        this.zze = zzgsiVar;
        this.zzf = num;
    }

    public static zzgmb zza(String str, zzgvc zzgvcVar, zzgrc zzgrcVar, zzgsi zzgsiVar, Integer num) throws GeneralSecurityException {
        if (zzgsiVar == zzgsi.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzgmb(str, zzgmn.zza(str), zzgvcVar, zzgrcVar, zzgsiVar, num);
    }

    public final zzgrc zzb() {
        return this.zzd;
    }

    public final zzgsi zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final zzguh zzd() {
        return this.zzb;
    }

    public final zzgvc zze() {
        return this.zzc;
    }

    public final Integer zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zza;
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgmc implements zzgmf {
    private final zzguh zza;
    private final zzgri zzb;

    private zzgmc(zzgri zzgriVar, zzguh zzguhVar) {
        this.zzb = zzgriVar;
        this.zza = zzguhVar;
    }

    public static zzgmc zza(zzgri zzgriVar) throws GeneralSecurityException {
        return new zzgmc(zzgriVar, zzgmn.zza(zzgriVar.zzi()));
    }

    public static zzgmc zzb(zzgri zzgriVar) {
        return new zzgmc(zzgriVar, zzgmn.zzb(zzgriVar.zzi()));
    }

    public final zzgri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final zzguh zzd() {
        return this.zza;
    }
}

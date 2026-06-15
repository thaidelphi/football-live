package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgci {
    public static final zzgcs zza(zzgcs zzgcsVar) throws GeneralSecurityException {
        return zzgcsVar != null ? zzgcsVar : zzgcy.zza(zzb(null).zzaV());
    }

    static final zzgri zzb(zzgcs zzgcsVar) {
        try {
            return ((zzgmc) zzgle.zzc().zze(null, zzgmc.class)).zzc();
        } catch (GeneralSecurityException e8) {
            throw new zzgmm("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e8);
        }
    }
}

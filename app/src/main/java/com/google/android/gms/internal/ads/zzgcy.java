package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgcy {
    public static zzgcs zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzgri zzf = zzgri.zzf(bArr, zzgvu.zza());
            zzgle zzc = zzgle.zzc();
            zzgmc zza = zzgmc.zza(zzf);
            return !zzc.zzk(zza) ? new zzgkf(zza) : zzc.zzb(zza);
        } catch (IOException e8) {
            throw new GeneralSecurityException("Failed to parse proto", e8);
        }
    }

    public static byte[] zzb(zzgcs zzgcsVar) throws GeneralSecurityException {
        return ((zzgmc) zzgle.zzc().zze(zzgcsVar, zzgmc.class)).zzc().zzaV();
    }
}

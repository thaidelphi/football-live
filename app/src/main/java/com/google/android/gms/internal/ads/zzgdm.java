package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzgdm implements zzgbv {
    private final zzglz zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgdm(zzglz zzglzVar, zzgdn zzgdnVar) {
        this.zza = zzglzVar;
        if (zzglzVar.zzg()) {
            zzgkk zza = zzgkz.zzb().zza();
            zzgko zza2 = zzgkr.zza(zzglzVar);
            zza.zza(zza2, "aead", "encrypt");
            zza.zza(zza2, "aead", "decrypt");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbv
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 5) {
            for (zzglx zzglxVar : this.zza.zzf(Arrays.copyOf(bArr, 5))) {
                try {
                    byte[] zza = ((zzgbv) zzglxVar.zzd()).zza(bArr, bArr2);
                    zzglxVar.zza();
                    return zza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzglx zzglxVar2 : this.zza.zzf(zzgca.zza)) {
            try {
                byte[] zza2 = ((zzgbv) zzglxVar2.zzd()).zza(bArr, bArr2);
                zzglxVar2.zza();
                return zza2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}

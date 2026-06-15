package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgha {
    private static final zzgkt zza = new zzgkt() { // from class: com.google.android.gms.internal.ads.zzggy
        @Override // com.google.android.gms.internal.ads.zzgkt
        public final zzgcf zza(zzgcs zzgcsVar, Integer num) {
            return zzggx.zza((zzghc) zzgcsVar, zzgui.zzc(32), num);
        }
    };
    private static final zzglr zzb = zzglr.zzb(new zzglp() { // from class: com.google.android.gms.internal.ads.zzggz
        @Override // com.google.android.gms.internal.ads.zzglp
        public final Object zza(zzgcf zzgcfVar) {
            return zzgiw.zzb((zzggx) zzgcfVar);
        }
    }, zzggx.class, zzgbv.class);

    public static void zza(boolean z10) throws GeneralSecurityException {
        int i10 = zzgjb.zza;
        zzgjb.zze(zzgle.zzc());
        zzgla zzb2 = zzgla.zzb();
        HashMap hashMap = new HashMap();
        hashMap.put("XAES_256_GCM_192_BIT_NONCE", zzggw.zzg);
        hashMap.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", zzggw.zzh);
        hashMap.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", zzggw.zzi);
        hashMap.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzggw.zzj);
        zzb2.zzd(Collections.unmodifiableMap(hashMap));
        zzglb.zza().zzc(zzb);
        zzgku.zzb().zzc(zza, zzghc.class);
    }
}

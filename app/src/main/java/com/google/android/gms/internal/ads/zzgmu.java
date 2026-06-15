package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgmu {
    private static final zzgkt zza = new zzgkt() { // from class: com.google.android.gms.internal.ads.zzgmr
        @Override // com.google.android.gms.internal.ads.zzgkt
        public final zzgcf zza(zzgcs zzgcsVar, Integer num) {
            return zzgmu.zzb((zzgmy) zzgcsVar, num);
        }
    };
    private static final zzglr zzb = zzglr.zzb(new zzglp() { // from class: com.google.android.gms.internal.ads.zzgms
        @Override // com.google.android.gms.internal.ads.zzglp
        public final Object zza(zzgcf zzgcfVar) {
            return zzgmu.zzc((zzgmq) zzgcfVar);
        }
    }, zzgmq.class, zzgmz.class);
    private static final zzglr zzc = zzglr.zzb(new zzglp() { // from class: com.google.android.gms.internal.ads.zzgmt
        @Override // com.google.android.gms.internal.ads.zzglp
        public final Object zza(zzgcf zzgcfVar) {
            return zzgmu.zza((zzgmq) zzgcfVar);
        }
    }, zzgmq.class, zzgcr.class);
    private static final zzgcg zzd = zzgkc.zzd("type.googleapis.com/google.crypto.tink.AesCmacKey", zzgcr.class, zzgrc.SYMMETRIC, zzgou.zzh());

    public static /* synthetic */ zzgcr zza(zzgmq zzgmqVar) {
        zze(zzgmqVar.zzb());
        return zzgue.zza(zzgmqVar);
    }

    public static /* synthetic */ zzgmq zzb(zzgmy zzgmyVar, Integer num) {
        zze(zzgmyVar);
        zzgmo zzgmoVar = new zzgmo(null);
        zzgmoVar.zzc(zzgmyVar);
        zzgmoVar.zza(zzgui.zzc(zzgmyVar.zzc()));
        zzgmoVar.zzb(num);
        return zzgmoVar.zzd();
    }

    public static /* synthetic */ zzgmz zzc(zzgmq zzgmqVar) {
        zze(zzgmqVar.zzb());
        return new zzgoj(zzgmqVar);
    }

    public static void zzd(boolean z10) throws GeneralSecurityException {
        if (zzgjk.zza(1)) {
            int i10 = zzgoh.zza;
            zzgoh.zze(zzgle.zzc());
            zzgku.zzb().zzc(zza, zzgmy.class);
            zzglb.zza().zzc(zzb);
            zzglb.zza().zzc(zzc);
            zzgla zzb2 = zzgla.zzb();
            HashMap hashMap = new HashMap();
            zzgmy zzgmyVar = zzgoc.zzc;
            hashMap.put("AES_CMAC", zzgmyVar);
            hashMap.put("AES256_CMAC", zzgmyVar);
            zzgmv zzgmvVar = new zzgmv(null);
            zzgmvVar.zza(32);
            zzgmvVar.zzb(16);
            zzgmvVar.zzc(zzgmw.zzd);
            hashMap.put("AES256_CMAC_RAW", zzgmvVar.zzd());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgjt.zzc().zzd(zzd, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
    }

    private static void zze(zzgmy zzgmyVar) throws GeneralSecurityException {
        if (zzgmyVar.zzc() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}

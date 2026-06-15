package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgdv {
    public static final /* synthetic */ int zza = 0;
    private static final zzglr zzb = zzglr.zzb(new zzglp() { // from class: com.google.android.gms.internal.ads.zzgds
        @Override // com.google.android.gms.internal.ads.zzglp
        public final Object zza(zzgcf zzgcfVar) {
            return zzgtj.zzb((zzgdr) zzgcfVar);
        }
    }, zzgdr.class, zzgbv.class);
    private static final zzgcg zzc = zzgkc.zzd("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzgbv.class, zzgrc.SYMMETRIC, zzgpd.zzh());
    private static final zzgkv zzd = new zzgkv() { // from class: com.google.android.gms.internal.ads.zzgdt
    };
    private static final zzgkt zze = new zzgkt() { // from class: com.google.android.gms.internal.ads.zzgdu
        @Override // com.google.android.gms.internal.ads.zzgkt
        public final zzgcf zza(zzgcs zzgcsVar, Integer num) {
            zzgea zzgeaVar = (zzgea) zzgcsVar;
            int i10 = zzgdv.zza;
            if (zzgeaVar.zzb() == 16 || zzgeaVar.zzb() == 32) {
                zzgdp zzgdpVar = new zzgdp(null);
                zzgdpVar.zzd(zzgeaVar);
                zzgdpVar.zzc(num);
                zzgdpVar.zza(zzgui.zzc(zzgeaVar.zzb()));
                zzgdpVar.zzb(zzgui.zzc(zzgeaVar.zzc()));
                return zzgdpVar.zze();
            }
            throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z10) throws GeneralSecurityException {
        int i10 = zzf;
        if (zzgjk.zza(i10)) {
            int i11 = zzgho.zza;
            zzgho.zze(zzgle.zzc());
            zzglb.zza().zzc(zzb);
            zzgla zzb2 = zzgla.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_CTR_HMAC_SHA256", zzggw.zze);
            zzgdw zzgdwVar = new zzgdw(null);
            zzgdwVar.zza(16);
            zzgdwVar.zzc(32);
            zzgdwVar.zze(16);
            zzgdwVar.zzd(16);
            zzgdx zzgdxVar = zzgdx.zzc;
            zzgdwVar.zzb(zzgdxVar);
            zzgdy zzgdyVar = zzgdy.zzc;
            zzgdwVar.zzf(zzgdyVar);
            hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzgdwVar.zzg());
            hashMap.put("AES256_CTR_HMAC_SHA256", zzggw.zzf);
            zzgdw zzgdwVar2 = new zzgdw(null);
            zzgdwVar2.zza(32);
            zzgdwVar2.zzc(32);
            zzgdwVar2.zze(32);
            zzgdwVar2.zzd(16);
            zzgdwVar2.zzb(zzgdxVar);
            zzgdwVar2.zzf(zzgdyVar);
            hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzgdwVar2.zzg());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgkw.zza().zzb(zzd, zzgea.class);
            zzgku.zzb().zzc(zze, zzgea.class);
            zzgjt.zzc().zzf(zzc, i10, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzger {
    public static final /* synthetic */ int zza = 0;
    private static final zzglr zzb = zzglr.zzb(new zzglp() { // from class: com.google.android.gms.internal.ads.zzgeo
        @Override // com.google.android.gms.internal.ads.zzglp
        public final Object zza(zzgcf zzgcfVar) {
            return zzgtg.zzb((zzgen) zzgcfVar);
        }
    }, zzgen.class, zzgbv.class);
    private static final zzgcg zzc = zzgkc.zzd("type.googleapis.com/google.crypto.tink.AesGcmKey", zzgbv.class, zzgrc.SYMMETRIC, zzgqb.zzg());
    private static final zzgkv zzd = new zzgkv() { // from class: com.google.android.gms.internal.ads.zzgep
    };
    private static final zzgkt zze = new zzgkt() { // from class: com.google.android.gms.internal.ads.zzgeq
        @Override // com.google.android.gms.internal.ads.zzgkt
        public final zzgcf zza(zzgcs zzgcsVar, Integer num) {
            zzgev zzgevVar = (zzgev) zzgcsVar;
            int i10 = zzger.zza;
            if (zzgevVar.zzb() != 24) {
                zzgel zzgelVar = new zzgel(null);
                zzgelVar.zzc(zzgevVar);
                zzgelVar.zza(num);
                zzgelVar.zzb(zzgui.zzc(zzgevVar.zzb()));
                return zzgelVar.zzd();
            }
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z10) throws GeneralSecurityException {
        int i10 = zzf;
        if (zzgjk.zza(i10)) {
            int i11 = zzgia.zza;
            zzgia.zze(zzgle.zzc());
            zzglb.zza().zzc(zzb);
            zzgla zzb2 = zzgla.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_GCM", zzggw.zza);
            zzges zzgesVar = new zzges(null);
            zzgesVar.zza(12);
            zzgesVar.zzb(16);
            zzgesVar.zzc(16);
            zzget zzgetVar = zzget.zzc;
            zzgesVar.zzd(zzgetVar);
            hashMap.put("AES128_GCM_RAW", zzgesVar.zze());
            hashMap.put("AES256_GCM", zzggw.zzb);
            zzges zzgesVar2 = new zzges(null);
            zzgesVar2.zza(12);
            zzgesVar2.zzb(32);
            zzgesVar2.zzc(16);
            zzgesVar2.zzd(zzgetVar);
            hashMap.put("AES256_GCM_RAW", zzgesVar2.zze());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgkw.zza().zzb(zzd, zzgev.class);
            zzgku.zzb().zzc(zze, zzgev.class);
            zzgjt.zzc().zzf(zzc, i10, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}

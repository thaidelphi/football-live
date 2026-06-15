package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgeg {
    public static final /* synthetic */ int zza = 0;
    private static final zzglr zzb = zzglr.zzb(new zzglp() { // from class: com.google.android.gms.internal.ads.zzgee
        @Override // com.google.android.gms.internal.ads.zzglp
        public final Object zza(zzgcf zzgcfVar) {
            return zzgtf.zzb((zzged) zzgcfVar);
        }
    }, zzged.class, zzgbv.class);
    private static final zzgcg zzc = zzgkc.zzd("type.googleapis.com/google.crypto.tink.AesEaxKey", zzgbv.class, zzgrc.SYMMETRIC, zzgps.zzh());
    private static final zzgkt zzd = new zzgkt() { // from class: com.google.android.gms.internal.ads.zzgef
        @Override // com.google.android.gms.internal.ads.zzgkt
        public final zzgcf zza(zzgcs zzgcsVar, Integer num) {
            zzgek zzgekVar = (zzgek) zzgcsVar;
            int i10 = zzgeg.zza;
            if (zzgekVar.zzc() != 24) {
                zzgeb zzgebVar = new zzgeb(null);
                zzgebVar.zzc(zzgekVar);
                zzgebVar.zza(num);
                zzgebVar.zzb(zzgui.zzc(zzgekVar.zzc()));
                return zzgebVar.zzd();
            }
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    };

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (zzgjk.zza(1)) {
            int i10 = zzght.zza;
            zzght.zze(zzgle.zzc());
            zzglb.zza().zzc(zzb);
            zzgla zzb2 = zzgla.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_EAX", zzggw.zzc);
            zzgeh zzgehVar = new zzgeh(null);
            zzgehVar.zza(16);
            zzgehVar.zzb(16);
            zzgehVar.zzc(16);
            zzgei zzgeiVar = zzgei.zzc;
            zzgehVar.zzd(zzgeiVar);
            hashMap.put("AES128_EAX_RAW", zzgehVar.zze());
            hashMap.put("AES256_EAX", zzggw.zzd);
            zzgeh zzgehVar2 = new zzgeh(null);
            zzgehVar2.zza(16);
            zzgehVar2.zzb(32);
            zzgehVar2.zzc(16);
            zzgehVar2.zzd(zzgeiVar);
            hashMap.put("AES256_EAX_RAW", zzgehVar2.zze());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgku.zzb().zzc(zzd, zzgek.class);
            zzgjt.zzc().zzd(zzc, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
    }
}

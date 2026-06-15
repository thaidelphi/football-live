package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgfc {
    public static final /* synthetic */ int zza = 0;
    private static final zzglr zzb = zzglr.zzb(new zzglp() { // from class: com.google.android.gms.internal.ads.zzgez
        @Override // com.google.android.gms.internal.ads.zzglp
        public final Object zza(zzgcf zzgcfVar) {
            return zzgjj.zzb((zzgey) zzgcfVar);
        }
    }, zzgey.class, zzgbv.class);
    private static final zzgkt zzc = new zzgkt() { // from class: com.google.android.gms.internal.ads.zzgfa
        @Override // com.google.android.gms.internal.ads.zzgkt
        public final zzgcf zza(zzgcs zzgcsVar, Integer num) {
            zzgfg zzgfgVar = (zzgfg) zzgcsVar;
            int i10 = zzgfc.zza;
            zzgew zzgewVar = new zzgew(null);
            zzgewVar.zzc(zzgfgVar);
            zzgewVar.zza(num);
            zzgewVar.zzb(zzgui.zzc(zzgfgVar.zzb()));
            return zzgewVar.zzd();
        }
    };
    private static final zzgkv zzd = new zzgkv() { // from class: com.google.android.gms.internal.ads.zzgfb
    };
    private static final zzgcg zze = zzgkc.zzd("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzgbv.class, zzgrc.SYMMETRIC, zzgqh.zzg());

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (zzgjk.zza(1)) {
            int i10 = zzgif.zza;
            zzgif.zze(zzgle.zzc());
            if (zzb()) {
                zzglb.zza().zzc(zzb);
                zzgla zzb2 = zzgla.zzb();
                HashMap hashMap = new HashMap();
                zzgfd zzgfdVar = new zzgfd(null);
                zzgfdVar.zza(16);
                zzgfe zzgfeVar = zzgfe.zza;
                zzgfdVar.zzb(zzgfeVar);
                hashMap.put("AES128_GCM_SIV", zzgfdVar.zzc());
                zzgfd zzgfdVar2 = new zzgfd(null);
                zzgfdVar2.zza(16);
                zzgfe zzgfeVar2 = zzgfe.zzc;
                zzgfdVar2.zzb(zzgfeVar2);
                hashMap.put("AES128_GCM_SIV_RAW", zzgfdVar2.zzc());
                zzgfd zzgfdVar3 = new zzgfd(null);
                zzgfdVar3.zza(32);
                zzgfdVar3.zzb(zzgfeVar);
                hashMap.put("AES256_GCM_SIV", zzgfdVar3.zzc());
                zzgfd zzgfdVar4 = new zzgfd(null);
                zzgfdVar4.zza(32);
                zzgfdVar4.zzb(zzgfeVar2);
                hashMap.put("AES256_GCM_SIV_RAW", zzgfdVar4.zzc());
                zzb2.zzd(Collections.unmodifiableMap(hashMap));
                zzgkw.zza().zzb(zzd, zzgfg.class);
                zzgku.zzb().zzc(zzc, zzgfg.class);
                zzgjt.zzc().zzd(zze, true);
                return;
            }
            return;
        }
        throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
    }

    private static boolean zzb() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }
}

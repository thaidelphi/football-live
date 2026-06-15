package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgnk {
    public static final /* synthetic */ int zza = 0;
    private static final zzglr zzb = zzglr.zzb(new zzglp() { // from class: com.google.android.gms.internal.ads.zzgng
        @Override // com.google.android.gms.internal.ads.zzglp
        public final Object zza(zzgcf zzgcfVar) {
            return new zzgok((zzgnf) zzgcfVar);
        }
    }, zzgnf.class, zzgmz.class);
    private static final zzglr zzc = zzglr.zzb(new zzglp() { // from class: com.google.android.gms.internal.ads.zzgnh
        @Override // com.google.android.gms.internal.ads.zzglp
        public final Object zza(zzgcf zzgcfVar) {
            return zzgue.zzb((zzgnf) zzgcfVar);
        }
    }, zzgnf.class, zzgcr.class);
    private static final zzgcg zzd = zzgkc.zzd("type.googleapis.com/google.crypto.tink.HmacKey", zzgcr.class, zzgrc.SYMMETRIC, zzgqu.zzi());
    private static final zzgkv zze = new zzgkv() { // from class: com.google.android.gms.internal.ads.zzgni
    };
    private static final zzgkt zzf = new zzgkt() { // from class: com.google.android.gms.internal.ads.zzgnj
        @Override // com.google.android.gms.internal.ads.zzgkt
        public final zzgcf zza(zzgcs zzgcsVar, Integer num) {
            zzgnp zzgnpVar = (zzgnp) zzgcsVar;
            int i10 = zzgnk.zza;
            zzgnd zzgndVar = new zzgnd(null);
            zzgndVar.zzc(zzgnpVar);
            zzgndVar.zzb(zzgui.zzc(zzgnpVar.zzc()));
            zzgndVar.zza(num);
            return zzgndVar.zzd();
        }
    };
    private static final int zzg = 2;

    public static void zza(boolean z10) throws GeneralSecurityException {
        int i10 = zzg;
        if (zzgjk.zza(i10)) {
            int i11 = zzgop.zza;
            zzgop.zze(zzgle.zzc());
            zzglb.zza().zzc(zzb);
            zzglb.zza().zzc(zzc);
            zzgla zzb2 = zzgla.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("HMAC_SHA256_128BITTAG", zzgoc.zza);
            zzgnl zzgnlVar = new zzgnl(null);
            zzgnlVar.zzb(32);
            zzgnlVar.zzc(16);
            zzgnn zzgnnVar = zzgnn.zzd;
            zzgnlVar.zzd(zzgnnVar);
            zzgnm zzgnmVar = zzgnm.zzc;
            zzgnlVar.zza(zzgnmVar);
            hashMap.put("HMAC_SHA256_128BITTAG_RAW", zzgnlVar.zze());
            zzgnl zzgnlVar2 = new zzgnl(null);
            zzgnlVar2.zzb(32);
            zzgnlVar2.zzc(32);
            zzgnn zzgnnVar2 = zzgnn.zza;
            zzgnlVar2.zzd(zzgnnVar2);
            zzgnlVar2.zza(zzgnmVar);
            hashMap.put("HMAC_SHA256_256BITTAG", zzgnlVar2.zze());
            zzgnl zzgnlVar3 = new zzgnl(null);
            zzgnlVar3.zzb(32);
            zzgnlVar3.zzc(32);
            zzgnlVar3.zzd(zzgnnVar);
            zzgnlVar3.zza(zzgnmVar);
            hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzgnlVar3.zze());
            zzgnl zzgnlVar4 = new zzgnl(null);
            zzgnlVar4.zzb(64);
            zzgnlVar4.zzc(16);
            zzgnlVar4.zzd(zzgnnVar2);
            zzgnm zzgnmVar2 = zzgnm.zze;
            zzgnlVar4.zza(zzgnmVar2);
            hashMap.put("HMAC_SHA512_128BITTAG", zzgnlVar4.zze());
            zzgnl zzgnlVar5 = new zzgnl(null);
            zzgnlVar5.zzb(64);
            zzgnlVar5.zzc(16);
            zzgnlVar5.zzd(zzgnnVar);
            zzgnlVar5.zza(zzgnmVar2);
            hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzgnlVar5.zze());
            zzgnl zzgnlVar6 = new zzgnl(null);
            zzgnlVar6.zzb(64);
            zzgnlVar6.zzc(32);
            zzgnlVar6.zzd(zzgnnVar2);
            zzgnlVar6.zza(zzgnmVar2);
            hashMap.put("HMAC_SHA512_256BITTAG", zzgnlVar6.zze());
            zzgnl zzgnlVar7 = new zzgnl(null);
            zzgnlVar7.zzb(64);
            zzgnlVar7.zzc(32);
            zzgnlVar7.zzd(zzgnnVar);
            zzgnlVar7.zza(zzgnmVar2);
            hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzgnlVar7.zze());
            hashMap.put("HMAC_SHA512_512BITTAG", zzgoc.zzb);
            zzgnl zzgnlVar8 = new zzgnl(null);
            zzgnlVar8.zzb(64);
            zzgnlVar8.zzc(64);
            zzgnlVar8.zzd(zzgnnVar);
            zzgnlVar8.zza(zzgnmVar2);
            hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzgnlVar8.zze());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgku.zzb().zzc(zzf, zzgnp.class);
            zzgkw.zza().zzb(zze, zzgnp.class);
            zzgjt.zzc().zzf(zzd, i10, true);
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}

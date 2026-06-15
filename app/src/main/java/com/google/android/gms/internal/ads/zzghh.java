package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzghh {
    public static final /* synthetic */ int zza = 0;
    private static final zzglr zzb = zzglr.zzb(new zzglp() { // from class: com.google.android.gms.internal.ads.zzghe
        @Override // com.google.android.gms.internal.ads.zzglp
        public final Object zza(zzgcf zzgcfVar) {
            zzghd zzghdVar = (zzghd) zzgcfVar;
            int i10 = zzghh.zza;
            if (zzgjc.zzc()) {
                return zzgjc.zzb(zzghdVar);
            }
            return zzgug.zzb(zzghdVar);
        }
    }, zzghd.class, zzgbv.class);
    private static final zzgcg zzc = zzgkc.zzd("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzgbv.class, zzgrc.SYMMETRIC, zzgsx.zzg());
    private static final zzgkv zzd = new zzgkv() { // from class: com.google.android.gms.internal.ads.zzghf
    };
    private static final zzgkt zze = new zzgkt() { // from class: com.google.android.gms.internal.ads.zzghg
        @Override // com.google.android.gms.internal.ads.zzgkt
        public final zzgcf zza(zzgcs zzgcsVar, Integer num) {
            int i10 = zzghh.zza;
            return zzghd.zza(((zzghj) zzgcsVar).zzb(), zzgui.zzc(32), num);
        }
    };

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (zzgjk.zza(1)) {
            int i10 = zzgjh.zza;
            zzgjh.zze(zzgle.zzc());
            zzglb.zza().zzc(zzb);
            zzgla zzb2 = zzgla.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("XCHACHA20_POLY1305", zzghj.zzc(zzghi.zza));
            hashMap.put("XCHACHA20_POLY1305_RAW", zzghj.zzc(zzghi.zzc));
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgku.zzb().zzc(zze, zzghj.class);
            zzgkw.zza().zzb(zzd, zzghj.class);
            zzgjt.zzc().zzd(zzc, true);
            return;
        }
        throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
    }
}

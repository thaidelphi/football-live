package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgfk {
    public static final /* synthetic */ int zza = 0;
    private static final zzglr zzb = zzglr.zzb(new zzglp() { // from class: com.google.android.gms.internal.ads.zzgfi
        @Override // com.google.android.gms.internal.ads.zzglp
        public final Object zza(zzgcf zzgcfVar) {
            zzgfh zzgfhVar = (zzgfh) zzgcfVar;
            int i10 = zzgfk.zza;
            if (zzgih.zze()) {
                return zzgih.zzb(zzgfhVar);
            }
            return zzgti.zzb(zzgfhVar);
        }
    }, zzgfh.class, zzgbv.class);
    private static final zzgkt zzc = new zzgkt() { // from class: com.google.android.gms.internal.ads.zzgfj
        @Override // com.google.android.gms.internal.ads.zzgkt
        public final zzgcf zza(zzgcs zzgcsVar, Integer num) {
            int i10 = zzgfk.zza;
            return zzgfh.zza(((zzgfm) zzgcsVar).zzb(), zzgui.zzc(32), num);
        }
    };
    private static final zzgcg zzd = zzgkc.zzd("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzgbv.class, zzgrc.SYMMETRIC, zzgqn.zzg());

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (zzgjk.zza(1)) {
            int i10 = zzgim.zza;
            zzgim.zze(zzgle.zzc());
            zzglb.zza().zzc(zzb);
            zzgku.zzb().zzc(zzc, zzgfm.class);
            zzgla zzb2 = zzgla.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("CHACHA20_POLY1305", zzgfm.zzc(zzgfl.zza));
            hashMap.put("CHACHA20_POLY1305_RAW", zzgfm.zzc(zzgfl.zzc));
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgjt.zzc().zzd(zzd, true);
            return;
        }
        throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
    }
}

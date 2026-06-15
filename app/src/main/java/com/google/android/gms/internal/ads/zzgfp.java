package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgfp {
    public static final /* synthetic */ int zza = 0;
    private static final zzglr zzb = zzglr.zzb(new zzglp() { // from class: com.google.android.gms.internal.ads.zzgfn
        @Override // com.google.android.gms.internal.ads.zzglp
        public final Object zza(zzgcf zzgcfVar) {
            zzgfu zzgfuVar = (zzgfu) zzgcfVar;
            int i10 = zzgfp.zza;
            return zzgiu.zzc(zzgcq.zza(zzgfuVar.zzb().zzd()).zzb(), zzgfuVar.zzc());
        }
    }, zzgfu.class, zzgbv.class);
    private static final zzgcg zzc = zzgkc.zzd("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzgbv.class, zzgrc.REMOTE, zzgry.zzg());
    private static final zzgkt zzd = new zzgkt() { // from class: com.google.android.gms.internal.ads.zzgfo
        @Override // com.google.android.gms.internal.ads.zzgkt
        public final zzgcf zza(zzgcs zzgcsVar, Integer num) {
            int i10 = zzgfp.zza;
            return zzgfu.zza((zzgfw) zzgcsVar, num);
        }
    };

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (zzgjk.zza(1)) {
            int i10 = zzggb.zza;
            zzggb.zze(zzgle.zzc());
            zzglb.zza().zzc(zzb);
            zzgku.zzb().zzc(zzd, zzgfw.class);
            zzgjt.zzc().zzd(zzc, true);
            return;
        }
        throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
    }
}

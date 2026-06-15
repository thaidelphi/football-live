package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgft {
    public static final /* synthetic */ int zza = 0;
    private static final zzgcg zzb = zzgkc.zzd("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzgbv.class, zzgrc.SYMMETRIC, zzgse.zzg());
    private static final zzgkt zzc = new zzgkt() { // from class: com.google.android.gms.internal.ads.zzgfr
        @Override // com.google.android.gms.internal.ads.zzgkt
        public final zzgcf zza(zzgcs zzgcsVar, Integer num) {
            int i10 = zzgft.zza;
            return zzggc.zza((zzggh) zzgcsVar, num);
        }
    };
    private static final zzglr zzd = zzglr.zzb(new zzglp() { // from class: com.google.android.gms.internal.ads.zzgfs
        @Override // com.google.android.gms.internal.ads.zzglp
        public final Object zza(zzgcf zzgcfVar) {
            zzggc zzggcVar = (zzggc) zzgcfVar;
            int i10 = zzgft.zza;
            String zzd2 = zzggcVar.zzb().zzd();
            zzgdk zzb2 = zzggcVar.zzb().zzb();
            zzgbv zzb3 = zzgcq.zza(zzd2).zzb();
            int i11 = zzgfq.zza;
            try {
                return zzgiu.zzc(new zzgfq(zzgri.zzf(zzgcy.zzb(zzb2), zzgvu.zza()), zzb3), zzggcVar.zzc());
            } catch (zzgwz e8) {
                throw new GeneralSecurityException(e8);
            }
        }
    }, zzggc.class, zzgbv.class);

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (zzgjk.zza(1)) {
            int i10 = zzggm.zza;
            zzggm.zze(zzgle.zzc());
            zzgku.zzb().zzc(zzc, zzggh.class);
            zzglb.zza().zzc(zzd);
            zzgjt.zzc().zzd(zzb, true);
            return;
        }
        throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
    }
}

package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgfq implements zzgbv {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = new byte[0];
    private static final Set zzc;
    private final String zzd;
    private final zzgbv zze;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzc = Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public zzgfq(zzgri zzgriVar, zzgbv zzgbvVar) throws GeneralSecurityException {
        if (zzc.contains(zzgriVar.zzi())) {
            this.zzd = zzgriVar.zzi();
            zzgrg zzb2 = zzgri.zzb(zzgriVar);
            zzb2.zza(zzgsi.RAW);
            zzgcy.zza(((zzgri) zzb2.zzbr()).zzaV());
            this.zze = zzgbvVar;
            return;
        }
        String zzi = zzgriVar.zzi();
        throw new IllegalArgumentException("Unsupported DEK key type: " + zzi + ". Only Tink AEAD key types are supported.");
    }

    @Override // com.google.android.gms.internal.ads.zzgbv
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i10 = wrap.getInt();
            if (i10 > 0 && i10 <= 4096 && i10 <= bArr.length - 4) {
                byte[] bArr3 = new byte[i10];
                wrap.get(bArr3, 0, i10);
                byte[] bArr4 = new byte[wrap.remaining()];
                wrap.get(bArr4, 0, wrap.remaining());
                byte[] zza2 = this.zze.zza(bArr3, zzb);
                String str = this.zzd;
                zzgvc zzgvcVar = zzgvc.zzb;
                return ((zzgbv) zzglb.zza().zzb(zzgle.zzc().zza(zzgmb.zza(str, zzgvc.zzv(zza2, 0, zza2.length), zzgrc.SYMMETRIC, zzgsi.RAW, null), zzgce.zza()), zzgbv.class)).zza(bArr4, bArr2);
            }
            throw new GeneralSecurityException("length of encrypted DEK too large");
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e8) {
            throw new GeneralSecurityException("invalid ciphertext", e8);
        }
    }
}

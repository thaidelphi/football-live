package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgue implements zzgcr {
    private static final byte[] zza = {0};
    private final zzgor zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zzgue(zzgmq zzgmqVar) throws GeneralSecurityException {
        this.zzb = new zzgub(zzgmqVar.zzd().zzd(zzgce.zza()));
        this.zzc = zzgmqVar.zzb().zzb();
        this.zzd = zzgmqVar.zzc().zzc();
        if (zzgmqVar.zzb().zzf().equals(zzgmw.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public static zzgcr zza(zzgmq zzgmqVar) throws GeneralSecurityException {
        return new zzgue(zzgmqVar);
    }

    public static zzgcr zzb(zzgnf zzgnfVar) throws GeneralSecurityException {
        return new zzgue(zzgnfVar);
    }

    public final byte[] zzc(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.zze;
        return bArr2.length > 0 ? zzgth.zzb(this.zzd, this.zzb.zza(zzgth.zzb(bArr, bArr2), this.zzc)) : zzgth.zzb(this.zzd, this.zzb.zza(bArr, this.zzc));
    }

    private zzgue(zzgnf zzgnfVar) throws GeneralSecurityException {
        String valueOf = String.valueOf(zzgnfVar.zzb().zzf());
        this.zzb = new zzgud("HMAC".concat(valueOf), new SecretKeySpec(zzgnfVar.zzd().zzd(zzgce.zza()), "HMAC"));
        this.zzc = zzgnfVar.zzb().zzb();
        this.zzd = zzgnfVar.zzc().zzc();
        if (zzgnfVar.zzb().zzg().equals(zzgnn.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public zzgue(zzgor zzgorVar, int i10) throws GeneralSecurityException {
        this.zzb = zzgorVar;
        this.zzc = i10;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        zzgorVar.zza(new byte[0], i10);
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzghc extends zzgdk {
    private final zzghb zza;
    private final int zzb;

    private zzghc(zzghb zzghbVar, int i10) {
        this.zza = zzghbVar;
        this.zzb = i10;
    }

    public static zzghc zzd(zzghb zzghbVar, int i10) throws GeneralSecurityException {
        if (i10 < 8 || i10 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new zzghc(zzghbVar, i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzghc) {
            zzghc zzghcVar = (zzghc) obj;
            return zzghcVar.zza == this.zza && zzghcVar.zzb == this.zzb;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(zzghc.class, this.zza, Integer.valueOf(this.zzb));
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "X-AES-GCM Parameters (variant: " + obj + "salt_size_bytes: " + this.zzb + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    public final boolean zza() {
        return this.zza != zzghb.zzb;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final zzghb zzc() {
        return this.zza;
    }
}

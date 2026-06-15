package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzghj extends zzgdk {
    private final zzghi zza;

    private zzghj(zzghi zzghiVar) {
        this.zza = zzghiVar;
    }

    public static zzghj zzc(zzghi zzghiVar) {
        return new zzghj(zzghiVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzghj) && ((zzghj) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzghj.class, this.zza);
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "XChaCha20Poly1305 Parameters (variant: " + obj + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    public final boolean zza() {
        return this.zza != zzghi.zzc;
    }

    public final zzghi zzb() {
        return this.zza;
    }
}

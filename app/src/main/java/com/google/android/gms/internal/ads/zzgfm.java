package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgfm extends zzgdk {
    private final zzgfl zza;

    private zzgfm(zzgfl zzgflVar) {
        this.zza = zzgflVar;
    }

    public static zzgfm zzc(zzgfl zzgflVar) {
        return new zzgfm(zzgflVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgfm) && ((zzgfm) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzgfm.class, this.zza);
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "ChaCha20Poly1305 Parameters (variant: " + obj + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    public final boolean zza() {
        return this.zza != zzgfl.zzc;
    }

    public final zzgfl zzb() {
        return this.zza;
    }
}

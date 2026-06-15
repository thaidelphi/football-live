package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgek extends zzgdk {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzgei zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgek(int i10, int i11, int i12, zzgei zzgeiVar, zzgej zzgejVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzd = zzgeiVar;
    }

    public static zzgeh zzd() {
        return new zzgeh(null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgek) {
            zzgek zzgekVar = (zzgek) obj;
            return zzgekVar.zza == this.zza && zzgekVar.zzb == this.zzb && zzgekVar.zzd == this.zzd;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(zzgek.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        return "AesEax Parameters (variant: " + valueOf + ", " + this.zzb + "-byte IV, 16-byte tag, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    public final boolean zza() {
        return this.zzd != zzgei.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzgei zze() {
        return this.zzd;
    }
}

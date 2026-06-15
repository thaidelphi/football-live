package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgea extends zzgdk {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzgdy zze;
    private final zzgdx zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgea(int i10, int i11, int i12, int i13, zzgdy zzgdyVar, zzgdx zzgdxVar, zzgdz zzgdzVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = zzgdyVar;
        this.zzf = zzgdxVar;
    }

    public static zzgdw zzf() {
        return new zzgdw(null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgea) {
            zzgea zzgeaVar = (zzgea) obj;
            return zzgeaVar.zza == this.zza && zzgeaVar.zzb == this.zzb && zzgeaVar.zzc == this.zzc && zzgeaVar.zzd == this.zzd && zzgeaVar.zze == this.zze && zzgeaVar.zzf == this.zzf;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(zzgea.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final String toString() {
        zzgdx zzgdxVar = this.zzf;
        String valueOf = String.valueOf(this.zze);
        String valueOf2 = String.valueOf(zzgdxVar);
        return "AesCtrHmacAead Parameters (variant: " + valueOf + ", hashType: " + valueOf2 + ", " + this.zzc + "-byte IV, and " + this.zzd + "-byte tags, and " + this.zza + "-byte AES key, and " + this.zzb + "-byte HMAC key)";
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    public final boolean zza() {
        return this.zze != zzgdy.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final int zze() {
        return this.zzd;
    }

    public final zzgdx zzg() {
        return this.zzf;
    }

    public final zzgdy zzh() {
        return this.zze;
    }
}

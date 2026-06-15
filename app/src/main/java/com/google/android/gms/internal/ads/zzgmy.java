package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgmy extends zzgns {
    private final int zza;
    private final int zzb;
    private final zzgmw zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgmy(int i10, int i11, zzgmw zzgmwVar, zzgmx zzgmxVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzgmwVar;
    }

    public static zzgmv zze() {
        return new zzgmv(null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgmy) {
            zzgmy zzgmyVar = (zzgmy) obj;
            return zzgmyVar.zza == this.zza && zzgmyVar.zzd() == zzd() && zzgmyVar.zzc == this.zzc;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(zzgmy.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        return "AES-CMAC Parameters (variant: " + valueOf + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    public final boolean zza() {
        return this.zzc != zzgmw.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgmw zzgmwVar = this.zzc;
        if (zzgmwVar == zzgmw.zzd) {
            return this.zzb;
        }
        if (zzgmwVar == zzgmw.zza || zzgmwVar == zzgmw.zzb || zzgmwVar == zzgmw.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgmw zzf() {
        return this.zzc;
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgnp extends zzgns {
    private final int zza;
    private final int zzb;
    private final zzgnn zzc;
    private final zzgnm zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgnp(int i10, int i11, zzgnn zzgnnVar, zzgnm zzgnmVar, zzgno zzgnoVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzgnnVar;
        this.zzd = zzgnmVar;
    }

    public static zzgnl zze() {
        return new zzgnl(null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgnp) {
            zzgnp zzgnpVar = (zzgnp) obj;
            return zzgnpVar.zza == this.zza && zzgnpVar.zzd() == zzd() && zzgnpVar.zzc == this.zzc && zzgnpVar.zzd == this.zzd;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(zzgnp.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        zzgnm zzgnmVar = this.zzd;
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(zzgnmVar);
        return "HMAC Parameters (variant: " + valueOf + ", hashType: " + valueOf2 + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    public final boolean zza() {
        return this.zzc != zzgnn.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgnn zzgnnVar = this.zzc;
        if (zzgnnVar == zzgnn.zzd) {
            return this.zzb;
        }
        if (zzgnnVar == zzgnn.zza || zzgnnVar == zzgnn.zzb || zzgnnVar == zzgnn.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgnm zzf() {
        return this.zzd;
    }

    public final zzgnn zzg() {
        return this.zzc;
    }
}

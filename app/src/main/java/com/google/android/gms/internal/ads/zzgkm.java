package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgkm {
    private final zzgch zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgkm(zzgch zzgchVar, int i10, String str, String str2, zzgkn zzgknVar) {
        this.zza = zzgchVar;
        this.zzb = i10;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgkm) {
            zzgkm zzgkmVar = (zzgkm) obj;
            return this.zza == zzgkmVar.zza && this.zzb == zzgkmVar.zzb && this.zzc.equals(zzgkmVar.zzc) && this.zzd.equals(zzgkmVar.zzd);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final int zza() {
        return this.zzb;
    }
}

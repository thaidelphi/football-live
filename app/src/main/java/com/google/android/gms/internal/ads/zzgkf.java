package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgkf extends zzgcs {
    private final zzgmc zza;

    public zzgkf(zzgmc zzgmcVar) {
        this.zza = zzgmcVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgkf) {
            zzgmc zzgmcVar = ((zzgkf) obj).zza;
            return this.zza.zzc().zzg().equals(zzgmcVar.zzc().zzg()) && this.zza.zzc().zzi().equals(zzgmcVar.zzc().zzi()) && this.zza.zzc().zzh().equals(zzgmcVar.zzc().zzh());
        }
        return false;
    }

    public final int hashCode() {
        zzgmc zzgmcVar = this.zza;
        return Objects.hash(zzgmcVar.zzc(), zzgmcVar.zzd());
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.zza.zzc().zzi();
        int ordinal = this.zza.zzc().zzg().ordinal();
        objArr[1] = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    public final boolean zza() {
        return this.zza.zzc().zzg() != zzgsi.RAW;
    }

    public final zzgmc zzb() {
        return this.zza;
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgev extends zzgdk {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzget zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgev(int i10, int i11, int i12, zzget zzgetVar, zzgeu zzgeuVar) {
        this.zza = i10;
        this.zzd = zzgetVar;
    }

    public static zzges zzc() {
        return new zzges(null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgev) {
            zzgev zzgevVar = (zzgev) obj;
            return zzgevVar.zza == this.zza && zzgevVar.zzd == this.zzd;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(zzgev.class, Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        return "AesGcm Parameters (variant: " + valueOf + ", 12-byte IV, 16-byte tag, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    public final boolean zza() {
        return this.zzd != zzget.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzget zzd() {
        return this.zzd;
    }
}

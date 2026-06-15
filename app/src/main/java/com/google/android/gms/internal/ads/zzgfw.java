package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgfw extends zzgdk {
    private final String zza;
    private final zzgfv zzb;

    private zzgfw(String str, zzgfv zzgfvVar) {
        this.zza = str;
        this.zzb = zzgfvVar;
    }

    public static zzgfw zzc(String str, zzgfv zzgfvVar) {
        return new zzgfw(str, zzgfvVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgfw) {
            zzgfw zzgfwVar = (zzgfw) obj;
            return zzgfwVar.zza.equals(this.zza) && zzgfwVar.zzb.equals(this.zzb);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(zzgfw.class, this.zza, this.zzb);
    }

    public final String toString() {
        String obj = this.zzb.toString();
        return "LegacyKmsAead Parameters (keyUri: " + this.zza + ", variant: " + obj + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    public final boolean zza() {
        return this.zzb != zzgfv.zzb;
    }

    public final zzgfv zzb() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zza;
    }
}

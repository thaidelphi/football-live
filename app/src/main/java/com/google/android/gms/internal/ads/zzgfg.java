package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgfg extends zzgdk {
    private final int zza;
    private final zzgfe zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgfg(int i10, zzgfe zzgfeVar, zzgff zzgffVar) {
        this.zza = i10;
        this.zzb = zzgfeVar;
    }

    public static zzgfd zzc() {
        return new zzgfd(null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgfg) {
            zzgfg zzgfgVar = (zzgfg) obj;
            return zzgfgVar.zza == this.zza && zzgfgVar.zzb == this.zzb;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(zzgfg.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        return "AesGcmSiv Parameters (variant: " + valueOf + ", " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    public final boolean zza() {
        return this.zzb != zzgfe.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzgfe zzd() {
        return this.zzb;
    }
}

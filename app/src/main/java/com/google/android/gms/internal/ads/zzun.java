package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzun implements zzxp {
    private final zzxp zza;
    private final zzbo zzb;

    public zzun(zzxp zzxpVar, zzbo zzboVar) {
        this.zza = zzxpVar;
        this.zzb = zzboVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzun) {
            zzun zzunVar = (zzun) obj;
            return this.zza.equals(zzunVar.zza) && this.zzb.equals(zzunVar.zzb);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zzb.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final int zza(int i10) {
        return this.zza.zza(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzxp
    public final int zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final int zzc(int i10) {
        return this.zza.zzc(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final int zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzz zze(int i10) {
        return this.zzb.zzb(this.zza.zza(i10));
    }

    @Override // com.google.android.gms.internal.ads.zzxp
    public final zzz zzf() {
        return this.zzb.zzb(this.zza.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzbo zzg() {
        return this.zzb;
    }
}

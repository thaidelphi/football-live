package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbc {
    private final zzt zza = new zzt();

    public final zzbc zza(int i10) {
        this.zza.zza(i10);
        return this;
    }

    public final zzbc zzb(zzbd zzbdVar) {
        zzv zzvVar;
        zzvVar = zzbdVar.zza;
        for (int i10 = 0; i10 < zzvVar.zzb(); i10++) {
            this.zza.zza(zzvVar.zza(i10));
        }
        return this;
    }

    public final zzbc zzc(int... iArr) {
        for (int i10 = 0; i10 < 20; i10++) {
            this.zza.zza(iArr[i10]);
        }
        return this;
    }

    public final zzbc zzd(int i10, boolean z10) {
        if (z10) {
            this.zza.zza(i10);
        }
        return this;
    }

    public final zzbd zze() {
        return new zzbd(this.zza.zzb(), null);
    }
}

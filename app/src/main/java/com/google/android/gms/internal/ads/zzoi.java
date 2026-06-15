package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzoi {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzoi zza(boolean z10) {
        this.zza = true;
        return this;
    }

    public final zzoi zzb(boolean z10) {
        this.zzb = z10;
        return this;
    }

    public final zzoi zzc(boolean z10) {
        this.zzc = z10;
        return this;
    }

    public final zzok zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzok(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzpt {
    private final Context zza;
    private final zzob zzb;
    private boolean zzc;
    private final zzpr zzd;
    private final zzps zze;
    private zzpv zzf;
    private zzpl zzg;

    @Deprecated
    public zzpt() {
        this.zza = null;
        this.zzb = zzob.zza;
        this.zzd = zzpr.zza;
        this.zze = zzps.zza;
    }

    public static /* bridge */ /* synthetic */ Context zza(zzpt zzptVar) {
        return zzptVar.zza;
    }

    public static /* bridge */ /* synthetic */ zzob zzb(zzpt zzptVar) {
        return zzptVar.zzb;
    }

    public static /* bridge */ /* synthetic */ zzpv zzd(zzpt zzptVar) {
        return zzptVar.zzf;
    }

    public static /* bridge */ /* synthetic */ zzpl zze(zzpt zzptVar) {
        return zzptVar.zzg;
    }

    public final zzqf zzc() {
        zzcv.zzf(!this.zzc);
        this.zzc = true;
        if (this.zzf == null) {
            this.zzf = new zzpv(new zzcg[0]);
        }
        if (this.zzg == null) {
            this.zzg = new zzpl(this.zza);
        }
        return new zzqf(this, null);
    }

    public zzpt(Context context) {
        this.zza = context;
        this.zzb = zzob.zza;
        this.zzd = zzpr.zza;
        this.zze = zzps.zza;
    }
}

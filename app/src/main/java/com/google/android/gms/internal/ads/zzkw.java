package com.google.android.gms.internal.ads;

import android.os.Looper;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzkw {
    private final zzkv zza;
    private final zzku zzb;
    private final zzbn zzc;
    private int zzd;
    private Object zze;
    private final Looper zzf;
    private final int zzg;
    private boolean zzh;
    private boolean zzi;

    public zzkw(zzku zzkuVar, zzkv zzkvVar, zzbn zzbnVar, int i10, zzcw zzcwVar, Looper looper) {
        this.zzb = zzkuVar;
        this.zza = zzkvVar;
        this.zzc = zzbnVar;
        this.zzf = looper;
        this.zzg = i10;
    }

    public final int zza() {
        return this.zzd;
    }

    public final Looper zzb() {
        return this.zzf;
    }

    public final zzkv zzc() {
        return this.zza;
    }

    public final zzkw zzd() {
        zzcv.zzf(!this.zzh);
        this.zzh = true;
        this.zzb.zzn(this);
        return this;
    }

    public final zzkw zze(Object obj) {
        zzcv.zzf(!this.zzh);
        this.zze = obj;
        return this;
    }

    public final zzkw zzf(int i10) {
        zzcv.zzf(!this.zzh);
        this.zzd = i10;
        return this;
    }

    public final Object zzg() {
        return this.zze;
    }

    public final synchronized void zzh(boolean z10) {
        this.zzi = z10 | this.zzi;
        notifyAll();
    }

    public final synchronized boolean zzi() {
        return false;
    }
}

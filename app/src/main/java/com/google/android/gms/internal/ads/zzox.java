package com.google.android.gms.internal.ads;

import android.os.Handler;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzox {
    private final Handler zza;
    private final zzoy zzb;

    public zzox(Handler handler, zzoy zzoyVar) {
        this.zza = zzoyVar == null ? null : handler;
        this.zzb = zzoyVar;
    }

    public static /* synthetic */ void zza(zzox zzoxVar, zzhj zzhjVar) {
        int i10 = zzeh.zza;
        zzoxVar.zzb.zze(zzhjVar);
    }

    public static /* synthetic */ void zzb(zzox zzoxVar, String str) {
        int i10 = zzeh.zza;
        zzoxVar.zzb.zzc(str);
    }

    public static /* synthetic */ void zzc(zzox zzoxVar, long j10) {
        int i10 = zzeh.zza;
        zzoxVar.zzb.zzg(j10);
    }

    public static /* synthetic */ void zzd(zzox zzoxVar, zzoz zzozVar) {
        int i10 = zzeh.zza;
        zzoxVar.zzb.zzj(zzozVar);
    }

    public static /* synthetic */ void zze(zzox zzoxVar, int i10, long j10, long j11) {
        int i11 = zzeh.zza;
        zzoxVar.zzb.zzk(i10, j10, j11);
    }

    public static /* synthetic */ void zzf(zzox zzoxVar, Exception exc) {
        int i10 = zzeh.zza;
        zzoxVar.zzb.zzh(exc);
    }

    public static /* synthetic */ void zzg(zzox zzoxVar, Exception exc) {
        int i10 = zzeh.zza;
        zzoxVar.zzb.zza(exc);
    }

    public static /* synthetic */ void zzh(zzox zzoxVar, zzz zzzVar, zzhk zzhkVar) {
        int i10 = zzeh.zza;
        zzoxVar.zzb.zzf(zzzVar, zzhkVar);
    }

    public static /* synthetic */ void zzi(zzox zzoxVar, boolean z10) {
        int i10 = zzeh.zza;
        zzoxVar.zzb.zzn(z10);
    }

    public static /* synthetic */ void zzj(zzox zzoxVar, zzoz zzozVar) {
        int i10 = zzeh.zza;
        zzoxVar.zzb.zzi(zzozVar);
    }

    public static /* synthetic */ void zzk(zzox zzoxVar, String str, long j10, long j11) {
        int i10 = zzeh.zza;
        zzoxVar.zzb.zzb(str, j10, j11);
    }

    public static /* synthetic */ void zzl(zzox zzoxVar, zzhj zzhjVar) {
        zzhjVar.zza();
        int i10 = zzeh.zza;
        zzoxVar.zzb.zzd(zzhjVar);
    }

    public final void zzm(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzor
                @Override // java.lang.Runnable
                public final void run() {
                    zzox.zzg(zzox.this, exc);
                }
            });
        }
    }

    public final void zzn(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzos
                @Override // java.lang.Runnable
                public final void run() {
                    zzox.zzf(zzox.this, exc);
                }
            });
        }
    }

    public final void zzo(final zzoz zzozVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzop
                @Override // java.lang.Runnable
                public final void run() {
                    zzox.zzj(zzox.this, zzozVar);
                }
            });
        }
    }

    public final void zzp(final zzoz zzozVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoq
                @Override // java.lang.Runnable
                public final void run() {
                    zzox.zzd(zzox.this, zzozVar);
                }
            });
        }
    }

    public final void zzq(final String str, final long j10, final long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzov
                @Override // java.lang.Runnable
                public final void run() {
                    zzox.zzk(zzox.this, str, j10, j11);
                }
            });
        }
    }

    public final void zzr(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzow
                @Override // java.lang.Runnable
                public final void run() {
                    zzox.zzb(zzox.this, str);
                }
            });
        }
    }

    public final void zzs(final zzhj zzhjVar) {
        zzhjVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzom
                @Override // java.lang.Runnable
                public final void run() {
                    zzox.zzl(zzox.this, zzhjVar);
                }
            });
        }
    }

    public final void zzt(final zzhj zzhjVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzol
                @Override // java.lang.Runnable
                public final void run() {
                    zzox.zza(zzox.this, zzhjVar);
                }
            });
        }
    }

    public final void zzu(final zzz zzzVar, final zzhk zzhkVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzot
                @Override // java.lang.Runnable
                public final void run() {
                    zzox.zzh(zzox.this, zzzVar, zzhkVar);
                }
            });
        }
    }

    public final void zzv(final long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzon
                @Override // java.lang.Runnable
                public final void run() {
                    zzox.zzc(zzox.this, j10);
                }
            });
        }
    }

    public final void zzw(final boolean z10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzou
                @Override // java.lang.Runnable
                public final void run() {
                    zzox.zzi(zzox.this, z10);
                }
            });
        }
    }

    public final void zzx(final int i10, final long j10, final long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoo
                @Override // java.lang.Runnable
                public final void run() {
                    zzox.zze(zzox.this, i10, j10, j11);
                }
            });
        }
    }
}

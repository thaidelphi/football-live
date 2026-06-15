package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaaw {
    private final Handler zza;
    private final zzaax zzb;

    public zzaaw(Handler handler, zzaax zzaaxVar) {
        this.zza = zzaaxVar == null ? null : handler;
        this.zzb = zzaaxVar;
    }

    public static /* synthetic */ void zza(zzaaw zzaawVar, Exception exc) {
        int i10 = zzeh.zza;
        zzaawVar.zzb.zzo(exc);
    }

    public static /* synthetic */ void zzb(zzaaw zzaawVar, String str) {
        int i10 = zzeh.zza;
        zzaawVar.zzb.zzq(str);
    }

    public static /* synthetic */ void zzc(zzaaw zzaawVar, long j10, int i10) {
        int i11 = zzeh.zza;
        zzaawVar.zzb.zzt(j10, i10);
    }

    public static /* synthetic */ void zzd(zzaaw zzaawVar, int i10, long j10) {
        int i11 = zzeh.zza;
        zzaawVar.zzb.zzl(i10, j10);
    }

    public static /* synthetic */ void zze(zzaaw zzaawVar, zzcc zzccVar) {
        int i10 = zzeh.zza;
        zzaawVar.zzb.zzv(zzccVar);
    }

    public static /* synthetic */ void zzf(zzaaw zzaawVar, zzhj zzhjVar) {
        zzhjVar.zza();
        int i10 = zzeh.zza;
        zzaawVar.zzb.zzr(zzhjVar);
    }

    public static /* synthetic */ void zzg(zzaaw zzaawVar, zzz zzzVar, zzhk zzhkVar) {
        int i10 = zzeh.zza;
        zzaawVar.zzb.zzu(zzzVar, zzhkVar);
    }

    public static /* synthetic */ void zzh(zzaaw zzaawVar, Object obj, long j10) {
        int i10 = zzeh.zza;
        zzaawVar.zzb.zzm(obj, j10);
    }

    public static /* synthetic */ void zzi(zzaaw zzaawVar, zzhj zzhjVar) {
        int i10 = zzeh.zza;
        zzaawVar.zzb.zzs(zzhjVar);
    }

    public static /* synthetic */ void zzj(zzaaw zzaawVar, String str, long j10, long j11) {
        int i10 = zzeh.zza;
        zzaawVar.zzb.zzp(str, j10, j11);
    }

    public final void zzk(final String str, final long j10, final long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaam
                @Override // java.lang.Runnable
                public final void run() {
                    zzaaw.zzj(zzaaw.this, str, j10, j11);
                }
            });
        }
    }

    public final void zzl(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaav
                @Override // java.lang.Runnable
                public final void run() {
                    zzaaw.zzb(zzaaw.this, str);
                }
            });
        }
    }

    public final void zzm(final zzhj zzhjVar) {
        zzhjVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaau
                @Override // java.lang.Runnable
                public final void run() {
                    zzaaw.zzf(zzaaw.this, zzhjVar);
                }
            });
        }
    }

    public final void zzn(final int i10, final long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaao
                @Override // java.lang.Runnable
                public final void run() {
                    zzaaw.zzd(zzaaw.this, i10, j10);
                }
            });
        }
    }

    public final void zzo(final zzhj zzhjVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaas
                @Override // java.lang.Runnable
                public final void run() {
                    zzaaw.zzi(zzaaw.this, zzhjVar);
                }
            });
        }
    }

    public final void zzp(final zzz zzzVar, final zzhk zzhkVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaat
                @Override // java.lang.Runnable
                public final void run() {
                    zzaaw.zzg(zzaaw.this, zzzVar, zzhkVar);
                }
            });
        }
    }

    public final void zzq(final Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaap
                @Override // java.lang.Runnable
                public final void run() {
                    zzaaw.zzh(zzaaw.this, obj, elapsedRealtime);
                }
            });
        }
    }

    public final void zzr(final long j10, final int i10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaaq
                @Override // java.lang.Runnable
                public final void run() {
                    zzaaw.zzc(zzaaw.this, j10, i10);
                }
            });
        }
    }

    public final void zzs(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaar
                @Override // java.lang.Runnable
                public final void run() {
                    zzaaw.zza(zzaaw.this, exc);
                }
            });
        }
    }

    public final void zzt(final zzcc zzccVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaan
                @Override // java.lang.Runnable
                public final void run() {
                    zzaaw.zze(zzaaw.this, zzccVar);
                }
            });
        }
    }
}

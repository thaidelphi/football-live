package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzys {
    public static final zzyl zza = new zzyl(2, -9223372036854775807L, null);
    public static final zzyl zzb = new zzyl(3, -9223372036854775807L, null);
    private final zzza zzc;
    private zzym zzd;
    private IOException zze;

    public zzys(String str) {
        int i10 = zzeh.zza;
        this.zzc = zzyy.zza(Executors.newSingleThreadExecutor(new ThreadFactory("ExoPlayer:Loader:ProgressiveMediaPeriod") { // from class: com.google.android.gms.internal.ads.zzef
            public final /* synthetic */ String zza = "ExoPlayer:Loader:ProgressiveMediaPeriod";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                int i11 = zzeh.zza;
                return new Thread(runnable, this.zza);
            }
        }), new zzda() { // from class: com.google.android.gms.internal.ads.zzyj
            @Override // com.google.android.gms.internal.ads.zzda
            public final void zza(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        });
    }

    public static zzyl zzb(boolean z10, long j10) {
        return new zzyl(z10 ? 1 : 0, j10, null);
    }

    public final long zza(zzyn zzynVar, zzyk zzykVar, int i10) {
        Looper myLooper = Looper.myLooper();
        zzcv.zzb(myLooper);
        this.zze = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzym(this, myLooper, zzynVar, zzykVar, i10, elapsedRealtime).zzc(0L);
        return elapsedRealtime;
    }

    public final void zzg() {
        zzym zzymVar = this.zzd;
        zzcv.zzb(zzymVar);
        zzymVar.zza(false);
    }

    public final void zzh() {
        this.zze = null;
    }

    public final void zzi(int i10) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null) {
            throw iOException;
        }
        zzym zzymVar = this.zzd;
        if (zzymVar != null) {
            zzymVar.zzb(i10);
        }
    }

    public final void zzj(zzyo zzyoVar) {
        zzym zzymVar = this.zzd;
        if (zzymVar != null) {
            zzymVar.zza(true);
        }
        this.zzc.execute(new zzyp(zzyoVar));
        this.zzc.zza();
    }

    public final boolean zzk() {
        return this.zze != null;
    }

    public final boolean zzl() {
        return this.zzd != null;
    }
}

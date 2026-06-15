package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import android.os.Looper;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzkt {
    private final Object zza;
    private Looper zzb;
    private HandlerThread zzc;
    private int zzd;

    public zzkt() {
        throw null;
    }

    public zzkt(Looper looper) {
        this.zza = new Object();
        this.zzb = null;
        this.zzc = null;
        this.zzd = 0;
    }

    public final Looper zza() {
        Looper looper;
        synchronized (this.zza) {
            if (this.zzb == null) {
                boolean z10 = false;
                if (this.zzd == 0 && this.zzc == null) {
                    z10 = true;
                }
                zzcv.zzf(z10);
                HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                this.zzc = handlerThread;
                handlerThread.start();
                this.zzb = this.zzc.getLooper();
            }
            this.zzd++;
            looper = this.zzb;
        }
        return looper;
    }

    public final void zzb() {
        HandlerThread handlerThread;
        synchronized (this.zza) {
            zzcv.zzf(this.zzd > 0);
            int i10 = this.zzd - 1;
            this.zzd = i10;
            if (i10 == 0 && (handlerThread = this.zzc) != null) {
                handlerThread.quit();
                this.zzc = null;
                this.zzb = null;
            }
        }
    }
}

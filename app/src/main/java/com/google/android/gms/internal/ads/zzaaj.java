package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzaaj implements Choreographer.FrameCallback, Handler.Callback {
    private static final zzaaj zzb = new zzaaj();
    public volatile long zza = -9223372036854775807L;
    private final Handler zzc;
    private final HandlerThread zzd;
    private Choreographer zze;
    private int zzf;

    private zzaaj() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.zzd = handlerThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i10 = zzeh.zza;
        Handler handler = new Handler(looper, this);
        this.zzc = handler;
        handler.sendEmptyMessage(1);
    }

    public static zzaaj zza() {
        return zzb;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.zza = j10;
        Choreographer choreographer = this.zze;
        Objects.requireNonNull(choreographer);
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            try {
                this.zze = Choreographer.getInstance();
            } catch (RuntimeException e8) {
                zzdn.zzg("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e8);
            }
            return true;
        } else if (i10 == 2) {
            Choreographer choreographer = this.zze;
            if (choreographer != null) {
                int i11 = this.zzf + 1;
                this.zzf = i11;
                if (i11 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        } else if (i10 != 3) {
            return false;
        } else {
            Choreographer choreographer2 = this.zze;
            if (choreographer2 != null) {
                int i12 = this.zzf - 1;
                this.zzf = i12;
                if (i12 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.zza = -9223372036854775807L;
                }
            }
            return true;
        }
    }

    public final void zzb() {
        this.zzc.sendEmptyMessage(2);
    }

    public final void zzc() {
        this.zzc.sendEmptyMessage(3);
    }
}

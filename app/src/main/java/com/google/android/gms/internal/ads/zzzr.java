package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzzr extends HandlerThread implements Handler.Callback {
    private zzdc zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzzt zze;

    public zzzr() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 == 1) {
                try {
                    int i11 = message.arg1;
                    zzdc zzdcVar = this.zza;
                    Objects.requireNonNull(zzdcVar);
                    zzdcVar.zzb(i11);
                    this.zze = new zzzt(this, this.zza.zza(), i11 != 0, null);
                    synchronized (this) {
                        notify();
                    }
                } catch (zzdd e8) {
                    zzdn.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e8);
                    this.zzd = new IllegalStateException(e8);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    zzdn.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.zzc = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    zzdn.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.zzd = e11;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i10 == 2) {
                try {
                    zzdc zzdcVar2 = this.zza;
                    Objects.requireNonNull(zzdcVar2);
                    zzdcVar2.zzc();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    public final zzzt zza(int i10) {
        boolean z10;
        start();
        this.zzb = new Handler(getLooper(), this);
        this.zza = new zzdc(this.zzb, null);
        synchronized (this) {
            z10 = false;
            this.zzb.obtainMessage(1, i10, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException == null) {
            Error error = this.zzc;
            if (error == null) {
                zzzt zzztVar = this.zze;
                Objects.requireNonNull(zzztVar);
                return zzztVar;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        Objects.requireNonNull(handler);
        handler.sendEmptyMessage(2);
    }
}

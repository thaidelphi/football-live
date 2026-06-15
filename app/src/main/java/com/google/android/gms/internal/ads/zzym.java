package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@SuppressLint({"HandlerLeak"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzym extends Handler implements Runnable {
    final /* synthetic */ zzys zza;
    private final zzyn zzb;
    private final long zzc;
    private zzyk zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzym(zzys zzysVar, Looper looper, zzyn zzynVar, zzyk zzykVar, int i10, long j10) {
        super(looper);
        this.zza = zzysVar;
        this.zzb = zzynVar;
        this.zzd = zzykVar;
        this.zzc = j10;
    }

    private final void zzd() {
        zzza zzzaVar;
        zzym zzymVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.zzc;
        zzyk zzykVar = this.zzd;
        Objects.requireNonNull(zzykVar);
        zzykVar.zzL(this.zzb, elapsedRealtime, j10, this.zzf);
        this.zze = null;
        zzys zzysVar = this.zza;
        zzzaVar = zzysVar.zzc;
        zzymVar = zzysVar.zzd;
        Objects.requireNonNull(zzymVar);
        zzzaVar.execute(zzymVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10;
        int i11;
        int i12;
        long j10;
        if (this.zzi) {
            return;
        }
        int i13 = message.what;
        if (i13 == 1) {
            zzd();
        } else if (i13 != 4) {
            this.zza.zzd = null;
            long j11 = this.zzc;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j12 = elapsedRealtime - j11;
            zzyk zzykVar = this.zzd;
            Objects.requireNonNull(zzykVar);
            if (this.zzh) {
                zzykVar.zzJ(this.zzb, elapsedRealtime, j12, false);
                return;
            }
            int i14 = message.what;
            if (i14 == 2) {
                try {
                    zzykVar.zzK(this.zzb, elapsedRealtime, j12);
                } catch (RuntimeException e8) {
                    zzdn.zzd("LoadTask", "Unexpected exception handling load completed", e8);
                    this.zza.zze = new zzyq(e8);
                }
            } else if (i14 != 3) {
            } else {
                IOException iOException = (IOException) message.obj;
                this.zze = iOException;
                int i15 = this.zzf + 1;
                this.zzf = i15;
                zzyl zzu = zzykVar.zzu(this.zzb, elapsedRealtime, j12, iOException, i15);
                i10 = zzu.zza;
                if (i10 == 3) {
                    this.zza.zze = this.zze;
                    return;
                }
                i11 = zzu.zza;
                if (i11 != 2) {
                    i12 = zzu.zza;
                    if (i12 == 1) {
                        this.zzf = 1;
                    }
                    j10 = zzu.zzb;
                    zzc(j10 != -9223372036854775807L ? zzu.zzb : Math.min((this.zzf - 1) * 1000, 5000));
                }
            }
        } else {
            throw ((Error) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = !this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (z10) {
                Trace.beginSection("load:" + this.zzb.getClass().getSimpleName());
                try {
                    this.zzb.zzh();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e8) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, e8).sendToTarget();
        } catch (Exception e10) {
            if (this.zzi) {
                return;
            }
            zzdn.zzd("LoadTask", "Unexpected exception loading stream", e10);
            obtainMessage(3, new zzyq(e10)).sendToTarget();
        } catch (OutOfMemoryError e11) {
            if (this.zzi) {
                return;
            }
            zzdn.zzd("LoadTask", "OutOfMemory error loading stream", e11);
            obtainMessage(3, new zzyq(e11)).sendToTarget();
        } catch (Error e12) {
            if (!this.zzi) {
                zzdn.zzd("LoadTask", "Unexpected error loading stream", e12);
                obtainMessage(4, e12).sendToTarget();
            }
            throw e12;
        }
    }

    public final void zza(boolean z10) {
        this.zzi = z10;
        this.zze = null;
        if (hasMessages(1)) {
            this.zzh = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzg();
                Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z10) {
            this.zza.zzd = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzyk zzykVar = this.zzd;
            Objects.requireNonNull(zzykVar);
            zzykVar.zzJ(this.zzb, elapsedRealtime, elapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int i10) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i10) {
            throw iOException;
        }
    }

    public final void zzc(long j10) {
        zzym zzymVar;
        zzymVar = this.zza.zzd;
        zzcv.zzf(zzymVar == null);
        this.zza.zzd = this;
        if (j10 > 0) {
            sendEmptyMessageDelayed(1, j10);
        } else {
            zzd();
        }
    }
}

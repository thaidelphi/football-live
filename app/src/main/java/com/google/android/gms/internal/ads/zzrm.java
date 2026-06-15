package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.collection.c;
import java.util.ArrayDeque;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzrm extends MediaCodec.Callback {
    private final HandlerThread zzb;
    private Handler zzc;
    private MediaFormat zzh;
    private MediaFormat zzi;
    private MediaCodec.CodecException zzj;
    private MediaCodec.CryptoException zzk;
    private long zzl;
    private boolean zzm;
    private IllegalStateException zzn;
    private zzrv zzo;
    private final Object zza = new Object();
    private final c zzd = new c();
    private final c zze = new c();
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzrm(HandlerThread handlerThread) {
        this.zzb = handlerThread;
    }

    public static /* synthetic */ void zzd(zzrm zzrmVar) {
        synchronized (zzrmVar.zza) {
            if (zzrmVar.zzm) {
                return;
            }
            long j10 = zzrmVar.zzl - 1;
            zzrmVar.zzl = j10;
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 > 0) {
                return;
            }
            if (i10 < 0) {
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (zzrmVar.zza) {
                    zzrmVar.zzn = illegalStateException;
                }
                return;
            }
            zzrmVar.zzj();
        }
    }

    private final void zzi(MediaFormat mediaFormat) {
        this.zze.a(-2);
        this.zzg.add(mediaFormat);
    }

    private final void zzj() {
        if (!this.zzg.isEmpty()) {
            this.zzi = (MediaFormat) this.zzg.getLast();
        }
        this.zzd.b();
        this.zze.b();
        this.zzf.clear();
        this.zzg.clear();
    }

    private final void zzk() {
        IllegalStateException illegalStateException = this.zzn;
        if (illegalStateException != null) {
            this.zzn = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.zzj;
        if (codecException != null) {
            this.zzj = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.zzk;
        if (cryptoException == null) {
            return;
        }
        this.zzk = null;
        throw cryptoException;
    }

    private final boolean zzl() {
        return this.zzl > 0 || this.zzm;
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.zza) {
            this.zzk = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.zza) {
            this.zzj = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        synchronized (this.zza) {
            this.zzd.a(i10);
            zzrv zzrvVar = this.zzo;
            if (zzrvVar != null) {
                zzsg zzsgVar = ((zzsd) zzrvVar).zza;
                zzkzVar = zzsgVar.zzo;
                if (zzkzVar != null) {
                    zzkzVar2 = zzsgVar.zzo;
                    zzkzVar2.zza();
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        synchronized (this.zza) {
            MediaFormat mediaFormat = this.zzi;
            if (mediaFormat != null) {
                zzi(mediaFormat);
                this.zzi = null;
            }
            this.zze.a(i10);
            this.zzf.add(bufferInfo);
            zzrv zzrvVar = this.zzo;
            if (zzrvVar != null) {
                zzsg zzsgVar = ((zzsd) zzrvVar).zza;
                zzkzVar = zzsgVar.zzo;
                if (zzkzVar != null) {
                    zzkzVar2 = zzsgVar.zzo;
                    zzkzVar2.zza();
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.zza) {
            zzi(mediaFormat);
            this.zzi = null;
        }
    }

    public final int zza() {
        synchronized (this.zza) {
            zzk();
            int i10 = -1;
            if (zzl()) {
                return -1;
            }
            if (!this.zzd.d()) {
                i10 = this.zzd.e();
            }
            return i10;
        }
    }

    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            zzk();
            if (zzl()) {
                return -1;
            }
            if (this.zze.d()) {
                return -1;
            }
            int e8 = this.zze.e();
            if (e8 >= 0) {
                zzcv.zzb(this.zzh);
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.zzf.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (e8 == -2) {
                this.zzh = (MediaFormat) this.zzg.remove();
                e8 = -2;
            }
            return e8;
        }
    }

    public final MediaFormat zzc() {
        MediaFormat mediaFormat;
        synchronized (this.zza) {
            mediaFormat = this.zzh;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public final void zze() {
        synchronized (this.zza) {
            this.zzl++;
            Handler handler = this.zzc;
            int i10 = zzeh.zza;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrl
                @Override // java.lang.Runnable
                public final void run() {
                    zzrm.zzd(zzrm.this);
                }
            });
        }
    }

    public final void zzf(MediaCodec mediaCodec) {
        zzcv.zzf(this.zzc == null);
        this.zzb.start();
        Handler handler = new Handler(this.zzb.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzg(zzrv zzrvVar) {
        synchronized (this.zza) {
            this.zzo = zzrvVar;
        }
    }

    public final void zzh() {
        synchronized (this.zza) {
            this.zzm = true;
            this.zzb.quit();
            zzj();
        }
    }
}

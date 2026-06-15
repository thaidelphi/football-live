package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzrg implements zzrw {
    private final MediaCodec zza;
    private final zzrm zzb;
    private final zzrx zzc;
    private final zzrs zzd;
    private boolean zze;
    private int zzf = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzrg(MediaCodec mediaCodec, HandlerThread handlerThread, zzrx zzrxVar, zzrs zzrsVar, zzrf zzrfVar) {
        this.zza = mediaCodec;
        this.zzb = new zzrm(handlerThread);
        this.zzc = zzrxVar;
        this.zzd = zzrsVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String zzd(int i10) {
        return zzt(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String zze(int i10) {
        return zzt(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzh(zzrg zzrgVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        zzrs zzrsVar;
        zzrgVar.zzb.zzf(zzrgVar.zza);
        Trace.beginSection("configureCodec");
        zzrgVar.zza.configure(mediaFormat, surface, (MediaCrypto) null, i10);
        Trace.endSection();
        zzrgVar.zzc.zzh();
        Trace.beginSection("startCodec");
        zzrgVar.zza.start();
        Trace.endSection();
        if (zzeh.zza >= 35 && (zzrsVar = zzrgVar.zzd) != null) {
            zzrsVar.zza(zzrgVar.zza);
        }
        zzrgVar.zzf = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzt(int i10, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i10 == 1) {
            sb.append("Audio");
        } else if (i10 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i10);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final int zza() {
        this.zzc.zzc();
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        this.zzc.zzc();
        return this.zzb.zzb(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final MediaFormat zzc() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final ByteBuffer zzf(int i10) {
        return this.zza.getInputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final ByteBuffer zzg(int i10) {
        return this.zza.getOutputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzi() {
        this.zza.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzj() {
        this.zzc.zzb();
        this.zza.flush();
        this.zzb.zze();
        this.zza.start();
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzk(int i10, int i11, int i12, long j10, int i13) {
        this.zzc.zzd(i10, 0, i12, j10, i13);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzl(int i10, int i11, zzgx zzgxVar, long j10, int i12) {
        this.zzc.zze(i10, 0, zzgxVar, j10, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzm() {
        zzrs zzrsVar;
        zzrs zzrsVar2;
        try {
            if (this.zzf == 1) {
                this.zzc.zzg();
                this.zzb.zzh();
            }
            this.zzf = 2;
            if (this.zze) {
                return;
            }
            int i10 = zzeh.zza;
            if (i10 >= 30 && i10 < 33) {
                this.zza.stop();
            }
            if (i10 >= 35 && (zzrsVar2 = this.zzd) != null) {
                zzrsVar2.zzc(this.zza);
            }
            this.zza.release();
            this.zze = true;
        } catch (Throwable th) {
            if (zzeh.zza >= 35 && (zzrsVar = this.zzd) != null) {
                zzrsVar.zzc(this.zza);
            }
            this.zza.release();
            this.zze = true;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzn(int i10, long j10) {
        this.zza.releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzo(int i10, boolean z10) {
        this.zza.releaseOutputBuffer(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzp(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzq(Bundle bundle) {
        this.zzc.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzr(int i10) {
        this.zza.setVideoScalingMode(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final boolean zzs(zzrv zzrvVar) {
        this.zzb.zzg(zzrvVar);
        return true;
    }
}

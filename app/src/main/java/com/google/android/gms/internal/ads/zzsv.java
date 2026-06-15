package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzsv implements zzrw {
    private final MediaCodec zza;
    private final zzrs zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzsv(MediaCodec mediaCodec, zzrs zzrsVar, zzsu zzsuVar) {
        this.zza = mediaCodec;
        this.zzb = zzrsVar;
        if (zzeh.zza < 35 || zzrsVar == null) {
            return;
        }
        zzrsVar.zza(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final int zza() {
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final MediaFormat zzc() {
        return this.zza.getOutputFormat();
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
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzk(int i10, int i11, int i12, long j10, int i13) {
        this.zza.queueInputBuffer(i10, 0, i12, j10, i13);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzl(int i10, int i11, zzgx zzgxVar, long j10, int i12) {
        this.zza.queueSecureInputBuffer(i10, 0, zzgxVar.zza(), j10, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzm() {
        zzrs zzrsVar;
        zzrs zzrsVar2;
        try {
            int i10 = zzeh.zza;
            if (i10 >= 30 && i10 < 33) {
                this.zza.stop();
            }
            if (i10 >= 35 && (zzrsVar2 = this.zzb) != null) {
                zzrsVar2.zzc(this.zza);
            }
            this.zza.release();
        } catch (Throwable th) {
            if (zzeh.zza >= 35 && (zzrsVar = this.zzb) != null) {
                zzrsVar.zzc(this.zza);
            }
            this.zza.release();
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
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzr(int i10) {
        this.zza.setVideoScalingMode(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final /* synthetic */ boolean zzs(zzrv zzrvVar) {
        return false;
    }
}

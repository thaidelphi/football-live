package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzrk implements zzrx {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzcz zzg;
    private boolean zzh;

    public zzrk(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzcz zzczVar = new zzcz(zzcw.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzczVar;
        this.zzf = new AtomicReference();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ void zza(com.google.android.gms.internal.ads.zzrk r10, android.os.Message r11) {
        /*
            int r0 = r11.what
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L58
            r1 = 2
            if (r0 == r1) goto L37
            r1 = 3
            if (r0 == r1) goto L31
            r1 = 4
            if (r0 == r1) goto L20
            java.util.concurrent.atomic.AtomicReference r10 = r10.zzf
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r11 = r11.what
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r0.<init>(r11)
            com.google.android.gms.internal.ads.zzrh.zza(r10, r2, r0)
            goto L72
        L20:
            java.lang.Object r11 = r11.obj
            android.os.Bundle r11 = (android.os.Bundle) r11
            android.media.MediaCodec r0 = r10.zzc     // Catch: java.lang.RuntimeException -> L2a
            r0.setParameters(r11)     // Catch: java.lang.RuntimeException -> L2a
            goto L72
        L2a:
            r11 = move-exception
            java.util.concurrent.atomic.AtomicReference r10 = r10.zzf
            com.google.android.gms.internal.ads.zzrh.zza(r10, r2, r11)
            goto L72
        L31:
            com.google.android.gms.internal.ads.zzcz r10 = r10.zzg
            r10.zze()
            goto L72
        L37:
            java.lang.Object r11 = r11.obj
            com.google.android.gms.internal.ads.zzrj r11 = (com.google.android.gms.internal.ads.zzrj) r11
            int r4 = r11.zza
            android.media.MediaCodec$CryptoInfo r6 = r11.zzd
            long r7 = r11.zze
            int r9 = r11.zzf
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzrk.zzb     // Catch: java.lang.RuntimeException -> L51
            monitor-enter(r0)     // Catch: java.lang.RuntimeException -> L51
            android.media.MediaCodec r3 = r10.zzc     // Catch: java.lang.Throwable -> L4e
            r5 = 0
            r3.queueSecureInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            goto L71
        L4e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            throw r1     // Catch: java.lang.RuntimeException -> L51
        L51:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r10 = r10.zzf
            com.google.android.gms.internal.ads.zzrh.zza(r10, r2, r0)
            goto L71
        L58:
            java.lang.Object r11 = r11.obj
            com.google.android.gms.internal.ads.zzrj r11 = (com.google.android.gms.internal.ads.zzrj) r11
            int r4 = r11.zza
            int r6 = r11.zzc
            long r7 = r11.zze
            int r9 = r11.zzf
            android.media.MediaCodec r3 = r10.zzc     // Catch: java.lang.RuntimeException -> L6b
            r5 = 0
            r3.queueInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.RuntimeException -> L6b
            goto L71
        L6b:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r10 = r10.zzf
            com.google.android.gms.internal.ads.zzrh.zza(r10, r2, r0)
        L71:
            r2 = r11
        L72:
            if (r2 == 0) goto L7f
            java.util.ArrayDeque r10 = com.google.android.gms.internal.ads.zzrk.zza
            monitor-enter(r10)
            r10.add(r2)     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L7c
            return
        L7c:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L7c
            throw r11
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrk.zza(com.google.android.gms.internal.ads.zzrk, android.os.Message):void");
    }

    private static zzrj zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new zzrj();
            }
            return (zzrj) arrayDeque.removeFirst();
        }
    }

    private static byte[] zzj(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= (length = bArr.length)) {
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    private static int[] zzk(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null && iArr2.length >= (length = iArr.length)) {
            System.arraycopy(iArr, 0, iArr2, 0, length);
            return iArr2;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zzb() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                Objects.requireNonNull(handler);
                handler.removeCallbacksAndMessages(null);
                this.zzg.zzc();
                Handler handler2 = this.zze;
                Objects.requireNonNull(handler2);
                handler2.obtainMessage(3).sendToTarget();
                this.zzg.zza();
            } catch (InterruptedException e8) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zzd(int i10, int i11, int i12, long j10, int i13) {
        zzc();
        zzrj zzi = zzi();
        zzi.zza(i10, 0, i12, j10, i13);
        Handler handler = this.zze;
        int i14 = zzeh.zza;
        handler.obtainMessage(1, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zze(int i10, int i11, zzgx zzgxVar, long j10, int i12) {
        zzc();
        zzrj zzi = zzi();
        zzi.zza(i10, 0, 0, j10, 0);
        MediaCodec.CryptoInfo cryptoInfo = zzi.zzd;
        cryptoInfo.numSubSamples = zzgxVar.zzf;
        cryptoInfo.numBytesOfClearData = zzk(zzgxVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzk(zzgxVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] zzj = zzj(zzgxVar.zzb, cryptoInfo.key);
        Objects.requireNonNull(zzj);
        cryptoInfo.key = zzj;
        byte[] zzj2 = zzj(zzgxVar.zza, cryptoInfo.iv);
        Objects.requireNonNull(zzj2);
        cryptoInfo.iv = zzj2;
        cryptoInfo.mode = zzgxVar.zzc;
        if (zzeh.zza >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzgxVar.zzg, zzgxVar.zzh));
        }
        this.zze.obtainMessage(2, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zzf(Bundle bundle) {
        zzc();
        Handler handler = this.zze;
        int i10 = zzeh.zza;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zzg() {
        if (this.zzh) {
            zzb();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzrx
    public final void zzh() {
        if (this.zzh) {
            return;
        }
        this.zzd.start();
        this.zze = new zzri(this, this.zzd.getLooper());
        this.zzh = true;
    }
}

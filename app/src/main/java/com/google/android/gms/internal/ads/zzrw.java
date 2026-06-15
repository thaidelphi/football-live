package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface zzrw {
    int zza();

    int zzb(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzc();

    ByteBuffer zzf(int i10);

    ByteBuffer zzg(int i10);

    void zzi();

    void zzj();

    void zzk(int i10, int i11, int i12, long j10, int i13);

    void zzl(int i10, int i11, zzgx zzgxVar, long j10, int i12);

    void zzm();

    void zzn(int i10, long j10);

    void zzo(int i10, boolean z10);

    void zzp(Surface surface);

    void zzq(Bundle bundle);

    void zzr(int i10);

    boolean zzs(zzrv zzrvVar);
}

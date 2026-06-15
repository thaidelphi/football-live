package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzre implements zzru {
    private final zzftn zza;
    private final zzftn zzb;

    public zzre(int i10) {
        zzrc zzrcVar = new zzrc(i10);
        zzrd zzrdVar = new zzrd(i10);
        this.zza = zzrcVar;
        this.zzb = zzrdVar;
    }

    public static /* synthetic */ HandlerThread zza(int i10) {
        String zzt;
        zzt = zzrg.zzt(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
        return new HandlerThread(zzt);
    }

    public static /* synthetic */ HandlerThread zzb(int i10) {
        String zzt;
        zzt = zzrg.zzt(i10, "ExoPlayer:MediaCodecQueueingThread:");
        return new HandlerThread(zzt);
    }

    public final zzrg zzc(zzrt zzrtVar) throws IOException {
        MediaCodec mediaCodec;
        zzrg zzrgVar;
        String str = zzrtVar.zza.zza;
        zzrg zzrgVar2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                zzrgVar = new zzrg(mediaCodec, zza(((zzrc) this.zza).zza), new zzrk(mediaCodec, zzb(((zzrd) this.zzb).zza)), zzrtVar.zzf, null);
            } catch (Exception e8) {
                e = e8;
            }
            try {
                Trace.endSection();
                Surface surface = zzrtVar.zzd;
                int i10 = 0;
                if (surface == null && zzrtVar.zza.zzh && zzeh.zza >= 35) {
                    i10 = 8;
                }
                zzrg.zzh(zzrgVar, zzrtVar.zzb, surface, null, i10);
                return zzrgVar;
            } catch (Exception e10) {
                e = e10;
                zzrgVar2 = zzrgVar;
                if (zzrgVar2 != null) {
                    zzrgVar2.zzm();
                } else if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (Exception e11) {
            e = e11;
            mediaCodec = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzru
    public final /* bridge */ /* synthetic */ zzrw zzd(zzrt zzrtVar) throws IOException {
        throw null;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzro implements zzru {
    private final Context zza;

    @Deprecated
    public zzro() {
        this.zza = null;
    }

    public zzro(Context context, zzftn zzftnVar, zzftn zzftnVar2) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzru
    public final zzrw zzd(zzrt zzrtVar) throws IOException {
        Context context;
        MediaCodec createByCodecName;
        int i10 = zzeh.zza;
        if (i10 >= 31 || ((context = this.zza) != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int zzb = zzay.zzb(zzrtVar.zzc.zzo);
            zzdn.zze("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzeh.zzD(zzb)));
            return new zzre(zzb).zzc(zzrtVar);
        }
        MediaCodec mediaCodec = null;
        try {
            String str = zzrtVar.zza.zza;
            Trace.beginSection("createCodec:".concat(str));
            createByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
        } catch (IOException e8) {
            e = e8;
        } catch (RuntimeException e10) {
            e = e10;
        }
        try {
            Trace.beginSection("configureCodec");
            Surface surface = zzrtVar.zzd;
            int i11 = 0;
            if (surface == null && zzrtVar.zza.zzh && i10 >= 35) {
                i11 = 8;
            }
            createByCodecName.configure(zzrtVar.zzb, surface, (MediaCrypto) null, i11);
            Trace.endSection();
            Trace.beginSection("startCodec");
            createByCodecName.start();
            Trace.endSection();
            return new zzsv(createByCodecName, zzrtVar.zzf, null);
        } catch (IOException | RuntimeException e11) {
            e = e11;
            mediaCodec = createByCodecName;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }
}

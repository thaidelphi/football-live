package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import com.unity3d.services.core.device.MimeTypes;
import java.util.Objects;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzxf {
    private final Spatializer zza;
    private final boolean zzb;
    private Handler zzc;
    private Spatializer.OnSpatializerStateChangedListener zzd;

    private zzxf(Spatializer spatializer) {
        this.zza = spatializer;
        this.zzb = spatializer.getImmersiveAudioLevel() != 0;
    }

    public static zzxf zza(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return null;
        }
        return new zzxf(audioManager.getSpatializer());
    }

    public final void zzb(zzxn zzxnVar, Looper looper) {
        if (this.zzd == null && this.zzc == null) {
            this.zzd = new zzxe(this, zzxnVar);
            final Handler handler = new Handler(looper);
            this.zzc = handler;
            Spatializer spatializer = this.zza;
            Objects.requireNonNull(handler);
            spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzxd
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.zzd);
        }
    }

    public final void zzc() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.zzd;
        if (onSpatializerStateChangedListener == null || this.zzc == null) {
            return;
        }
        this.zza.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
        Handler handler = this.zzc;
        int i10 = zzeh.zza;
        handler.removeCallbacksAndMessages(null);
        this.zzc = null;
        this.zzd = null;
    }

    public final boolean zzd(zze zzeVar, zzz zzzVar) {
        int i10 = 24;
        if (Objects.equals(zzzVar.zzo, "audio/eac3-joc")) {
            i10 = zzzVar.zzE;
            if (i10 == 16) {
                i10 = 12;
            }
        } else if (Objects.equals(zzzVar.zzo, "audio/iamf")) {
            i10 = zzzVar.zzE;
            if (i10 == -1) {
                i10 = 6;
            }
        } else if (Objects.equals(zzzVar.zzo, "audio/ac4")) {
            int i11 = zzzVar.zzE;
            if (i11 != 18 && i11 != 21) {
                i10 = i11;
            }
        } else {
            i10 = zzzVar.zzE;
        }
        int zzi = zzeh.zzi(i10);
        if (zzi == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(zzi);
        int i12 = zzzVar.zzF;
        if (i12 != -1) {
            channelMask.setSampleRate(i12);
        }
        return this.zza.canBeSpatialized(zzeVar.zza().zza, channelMask.build());
    }

    public final boolean zze() {
        return this.zza.isAvailable();
    }

    public final boolean zzf() {
        return this.zza.isEnabled();
    }

    public final boolean zzg() {
        return this.zzb;
    }
}

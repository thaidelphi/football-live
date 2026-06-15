package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import com.unity3d.services.core.device.MimeTypes;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzpl {
    private final Context zza;
    private Boolean zzb;

    public zzpl() {
        this.zza = null;
    }

    public zzpl(Context context) {
        this.zza = context;
    }

    public final zzok zza(zzz zzzVar, zze zzeVar) {
        boolean booleanValue;
        Objects.requireNonNull(zzzVar);
        Objects.requireNonNull(zzeVar);
        int i10 = zzeh.zza;
        if (i10 >= 29 && zzzVar.zzF != -1) {
            Context context = this.zza;
            Boolean bool = this.zzb;
            boolean z10 = false;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                if (context != null) {
                    AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                    if (audioManager != null) {
                        String parameters = audioManager.getParameters("offloadVariableRateSupported");
                        this.zzb = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                    } else {
                        this.zzb = Boolean.FALSE;
                    }
                } else {
                    this.zzb = Boolean.FALSE;
                }
                booleanValue = this.zzb.booleanValue();
            }
            String str = zzzVar.zzo;
            Objects.requireNonNull(str);
            int zza = zzay.zza(str, zzzVar.zzk);
            if (zza != 0 && i10 >= zzeh.zzh(zza)) {
                int zzi = zzeh.zzi(zzzVar.zzE);
                if (zzi == 0) {
                    return zzok.zza;
                }
                try {
                    AudioFormat zzx = zzeh.zzx(zzzVar.zzF, zzi, zza);
                    if (i10 >= 31) {
                        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(zzx, zzeVar.zza().zza);
                        if (playbackOffloadSupport == 0) {
                            return zzok.zza;
                        }
                        zzoi zzoiVar = new zzoi();
                        if (i10 > 32 && playbackOffloadSupport == 2) {
                            z10 = true;
                        }
                        zzoiVar.zza(true);
                        zzoiVar.zzb(z10);
                        zzoiVar.zzc(booleanValue);
                        return zzoiVar.zzd();
                    } else if (!AudioManager.isOffloadedPlaybackSupported(zzx, zzeVar.zza().zza)) {
                        return zzok.zza;
                    } else {
                        zzoi zzoiVar2 = new zzoi();
                        zzoiVar2.zza(true);
                        zzoiVar2.zzc(booleanValue);
                        return zzoiVar2.zzd();
                    }
                } catch (IllegalArgumentException unused) {
                    return zzok.zza;
                }
            }
            return zzok.zza;
        }
        return zzok.zza;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.unity3d.services.core.device.MimeTypes;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzely implements zzerw {
    private final zzgba zza;
    private final Context zzb;

    public zzely(zzgba zzgbaVar, Context context) {
        this.zza = zzgbaVar;
        this.zzb = context;
    }

    public static /* synthetic */ zzelz zzc(zzely zzelyVar) {
        int i10;
        AudioManager audioManager = (AudioManager) zzelyVar.zzb.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        float zza = com.google.android.gms.ads.internal.zzv.zzs().zza();
        boolean zze = com.google.android.gms.ads.internal.zzv.zzs().zze();
        if (audioManager == null) {
            return new zzelz(-1, false, false, -1, -1, -1, -1, -1, zza, zze, true);
        }
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        int i11 = -1;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkT)).booleanValue()) {
            int zzj = com.google.android.gms.ads.internal.zzv.zzr().zzj(audioManager);
            i10 = audioManager.getStreamMaxVolume(3);
            i11 = zzj;
        } else {
            i10 = -1;
        }
        return new zzelz(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i11, i10, audioManager.getRingerMode(), audioManager.getStreamVolume(2), zza, zze, false);
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 13;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzelx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzely.zzc(zzely.this);
            }
        });
    }
}

package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import com.unity3d.services.core.device.MimeTypes;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzog {
    private final Context zza;
    private final Handler zzb;
    private final zzoc zzc;
    private final BroadcastReceiver zzd;
    private final zzod zze;
    private zzob zzf;
    private zzoh zzg;
    private zze zzh;
    private boolean zzi;
    private final zzpp zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzog(Context context, zzpp zzppVar, zze zzeVar, zzoh zzohVar) {
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzj = zzppVar;
        this.zzh = zzeVar;
        this.zzg = zzohVar;
        Handler handler = new Handler(zzeh.zzz(), null);
        this.zzb = handler;
        this.zzc = new zzoc(this, null);
        this.zzd = new zzoe(this, null);
        Uri zza = zzob.zza();
        this.zze = zza != null ? new zzod(this, handler, applicationContext.getContentResolver(), zza) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(zzob zzobVar) {
        if (!this.zzi || zzobVar.equals(this.zzf)) {
            return;
        }
        this.zzf = zzobVar;
        this.zzj.zza.zzJ(zzobVar);
    }

    public final zzob zzc() {
        if (this.zzi) {
            zzob zzobVar = this.zzf;
            Objects.requireNonNull(zzobVar);
            return zzobVar;
        }
        this.zzi = true;
        zzod zzodVar = this.zze;
        if (zzodVar != null) {
            zzodVar.zza();
        }
        int i10 = zzeh.zza;
        zzoc zzocVar = this.zzc;
        if (zzocVar != null) {
            Context context = this.zza;
            Handler handler = this.zzb;
            AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            Objects.requireNonNull(audioManager);
            audioManager.registerAudioDeviceCallback(zzocVar, handler);
        }
        zzob zzd = zzob.zzd(this.zza, this.zza.registerReceiver(this.zzd, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.zzb), this.zzh, this.zzg);
        this.zzf = zzd;
        return zzd;
    }

    public final void zzg(zze zzeVar) {
        this.zzh = zzeVar;
        zzj(zzob.zzc(this.zza, zzeVar, this.zzg));
    }

    public final void zzh(AudioDeviceInfo audioDeviceInfo) {
        zzoh zzohVar = this.zzg;
        AudioDeviceInfo audioDeviceInfo2 = zzohVar == null ? null : zzohVar.zza;
        int i10 = zzeh.zza;
        if (Objects.equals(audioDeviceInfo, audioDeviceInfo2)) {
            return;
        }
        zzoh zzohVar2 = audioDeviceInfo != null ? new zzoh(audioDeviceInfo) : null;
        this.zzg = zzohVar2;
        zzj(zzob.zzc(this.zza, this.zzh, zzohVar2));
    }

    public final void zzi() {
        if (this.zzi) {
            this.zzf = null;
            int i10 = zzeh.zza;
            zzoc zzocVar = this.zzc;
            if (zzocVar != null) {
                AudioManager audioManager = (AudioManager) this.zza.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                Objects.requireNonNull(audioManager);
                audioManager.unregisterAudioDeviceCallback(zzocVar);
            }
            this.zza.unregisterReceiver(this.zzd);
            zzod zzodVar = this.zze;
            if (zzodVar != null) {
                zzodVar.zzb();
            }
            this.zzi = false;
        }
    }
}

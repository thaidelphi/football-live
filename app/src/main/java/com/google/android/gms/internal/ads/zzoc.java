package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzoc extends AudioDeviceCallback {
    final /* synthetic */ zzog zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzoc(zzog zzogVar, zzof zzofVar) {
        this.zza = zzogVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        Context context;
        zze zzeVar;
        zzoh zzohVar;
        zzog zzogVar = this.zza;
        context = zzogVar.zza;
        zzeVar = zzogVar.zzh;
        zzohVar = zzogVar.zzg;
        this.zza.zzj(zzob.zzc(context, zzeVar, zzohVar));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzoh zzohVar;
        Context context;
        zze zzeVar;
        zzoh zzohVar2;
        zzohVar = this.zza.zzg;
        int i10 = zzeh.zza;
        int length = audioDeviceInfoArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            } else if (Objects.equals(audioDeviceInfoArr[i11], zzohVar)) {
                this.zza.zzg = null;
                break;
            } else {
                i11++;
            }
        }
        zzog zzogVar = this.zza;
        context = zzogVar.zza;
        zzeVar = zzogVar.zzh;
        zzohVar2 = zzogVar.zzg;
        zzogVar.zzj(zzob.zzc(context, zzeVar, zzohVar2));
    }
}

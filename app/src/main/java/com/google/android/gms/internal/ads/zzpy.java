package com.google.android.gms.internal.ads;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzpy {
    private final AudioTrack zza;
    private final zzog zzb;
    private AudioRouting.OnRoutingChangedListener zzc = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.zzpx
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            zzpy.zza(zzpy.this, audioRouting);
        }
    };

    public zzpy(AudioTrack audioTrack, zzog zzogVar) {
        this.zza = audioTrack;
        this.zzb = zzogVar;
        audioTrack.addOnRoutingChangedListener(this.zzc, new Handler(Looper.myLooper()));
    }

    public static /* synthetic */ void zza(zzpy zzpyVar, AudioRouting audioRouting) {
        if (zzpyVar.zzc == null || audioRouting.getRoutedDevice() == null) {
            return;
        }
        zzpyVar.zzb.zzh(audioRouting.getRoutedDevice());
    }

    public final void zzb() {
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = this.zzc;
        Objects.requireNonNull(onRoutingChangedListener);
        this.zza.removeOnRoutingChangedListener(onRoutingChangedListener);
        this.zzc = null;
    }
}

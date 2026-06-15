package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzqc extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzqd zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqc(zzqd zzqdVar) {
        this.zza = zzqdVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        AudioTrack audioTrack2;
        audioTrack2 = this.zza.zza.zzs;
        audioTrack.equals(audioTrack2);
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        audioTrack2 = this.zza.zza.zzs;
        if (audioTrack.equals(audioTrack2)) {
            this.zza.zza.zzP = true;
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        audioTrack2 = this.zza.zza.zzs;
        audioTrack.equals(audioTrack2);
    }
}

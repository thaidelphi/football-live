package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzqj implements zzpc {
    final /* synthetic */ zzql zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzqj(zzql zzqlVar, zzqk zzqkVar) {
        this.zza = zzqlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpc
    public final void zza(Exception exc) {
        zzdn.zzd("MediaCodecAudioRenderer", "Audio sink error", exc);
        zzql.zzae(this.zza).zzn(exc);
    }
}

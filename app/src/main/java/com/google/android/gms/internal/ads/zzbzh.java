package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzbzh implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzbzp zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbzh(zzbzp zzbzpVar, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        this.zzb = zzbzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbzq zzbzqVar;
        zzbzq zzbzqVar2;
        zzbzp.zzm(this.zzb, this.zza);
        zzbzp zzbzpVar = this.zzb;
        zzbzqVar = zzbzpVar.zzq;
        if (zzbzqVar != null) {
            zzbzqVar2 = zzbzpVar.zzq;
            zzbzqVar2.zzf();
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.Timer;
import java.util.TimerTask;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfje extends TimerTask {
    final /* synthetic */ Timer zza;
    final /* synthetic */ zzfjg zzb;
    final /* synthetic */ zzceh zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfje(zzfjg zzfjgVar, zzceh zzcehVar, Timer timer) {
        this.zzc = zzcehVar;
        this.zza = timer;
        this.zzb = zzfjgVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zzb.zzh();
        zzcei.zzaI(this.zzc.zza, true);
        this.zza.cancel();
    }
}

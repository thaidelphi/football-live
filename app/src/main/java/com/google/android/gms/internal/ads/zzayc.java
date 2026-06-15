package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzayc implements Runnable {
    final /* synthetic */ zzayd zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzayc(zzayd zzaydVar) {
        this.zza = zzaydVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z10;
        boolean z11;
        List<zzaye> list;
        obj = this.zza.zzc;
        synchronized (obj) {
            zzayd zzaydVar = this.zza;
            z10 = zzaydVar.zzd;
            if (z10) {
                z11 = zzaydVar.zze;
                if (z11) {
                    zzaydVar.zzd = false;
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zze("App went background");
                    list = this.zza.zzf;
                    for (zzaye zzayeVar : list) {
                        try {
                            zzayeVar.zza(false);
                        } catch (Exception e8) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
                        }
                    }
                }
            }
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("App is still foreground");
        }
    }
}

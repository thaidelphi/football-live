package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzclr implements zzbio {
    final /* synthetic */ zzclu zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzclr(zzclu zzcluVar) {
        this.zza = zzcluVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final void zza(Object obj, Map map) {
        Executor executor;
        if (zzclu.zzg(this.zza, map)) {
            executor = this.zza.zzc;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclq
                @Override // java.lang.Runnable
                public final void run() {
                    zzclz zzclzVar;
                    zzclzVar = zzclr.this.zza.zzd;
                    zzclzVar.zzg();
                }
            });
        }
    }
}

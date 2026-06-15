package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzegt implements com.google.android.gms.ads.internal.zzg {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzcud zzb;
    private final zzcux zzc;
    private final zzdcg zzd;
    private final zzdby zze;
    private final zzclz zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzegt(zzcud zzcudVar, zzcux zzcuxVar, zzdcg zzdcgVar, zzdby zzdbyVar, zzclz zzclzVar) {
        this.zzb = zzcudVar;
        this.zzc = zzcuxVar;
        this.zzd = zzdcgVar;
        this.zze = zzdbyVar;
        this.zzf = zzclzVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzr();
            this.zze.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}

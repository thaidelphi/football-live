package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcpa implements zzcvt, zzaxl {
    private final zzezu zza;
    private final zzcux zzb;
    private final zzcwc zzc;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();

    public zzcpa(zzezu zzezuVar, zzcux zzcuxVar, zzcwc zzcwcVar) {
        this.zza = zzezuVar;
        this.zzb = zzcuxVar;
        this.zzc = zzcwcVar;
    }

    private final void zza() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final void zzdn(zzaxk zzaxkVar) {
        if (this.zza.zze == 1 && zzaxkVar.zzj) {
            zza();
        }
        if (zzaxkVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final synchronized void zzs() {
        if (this.zza.zze != 1) {
            zza();
        }
    }
}

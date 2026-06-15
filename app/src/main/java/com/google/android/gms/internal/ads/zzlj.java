package com.google.android.gms.internal.ads;

import android.os.SystemClock;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzlj implements zzkb {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzbb zzd = zzbb.zza;

    public zzlj(zzcw zzcwVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final long zza() {
        long zza;
        long j10 = this.zzb;
        if (this.zza) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
            zzbb zzbbVar = this.zzd;
            if (zzbbVar.zzb == 1.0f) {
                zza = zzeh.zzs(elapsedRealtime);
            } else {
                zza = zzbbVar.zza(elapsedRealtime);
            }
            return j10 + zza;
        }
        return j10;
    }

    public final void zzb(long j10) {
        this.zzb = j10;
        if (this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final zzbb zzc() {
        return this.zzd;
    }

    public final void zzd() {
        if (this.zza) {
            return;
        }
        this.zzc = SystemClock.elapsedRealtime();
        this.zza = true;
    }

    public final void zze() {
        if (this.zza) {
            zzb(zza());
            this.zza = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final void zzg(zzbb zzbbVar) {
        if (this.zza) {
            zzb(zza());
        }
        this.zzd = zzbbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final /* synthetic */ boolean zzj() {
        return false;
    }
}

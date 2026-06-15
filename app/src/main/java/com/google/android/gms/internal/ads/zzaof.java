package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzaof implements Runnable {
    private final zzaop zza;
    private final zzaov zzb;
    private final Runnable zzc;

    public zzaof(zzaop zzaopVar, zzaov zzaovVar, Runnable runnable) {
        this.zza = zzaopVar;
        this.zzb = zzaovVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzw();
        zzaov zzaovVar = this.zzb;
        if (zzaovVar.zzc()) {
            this.zza.zzo(zzaovVar.zza);
        } else {
            this.zza.zzn(zzaovVar.zzc);
        }
        if (this.zzb.zzd) {
            this.zza.zzm("intermediate-response");
        } else {
            this.zza.zzp("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}

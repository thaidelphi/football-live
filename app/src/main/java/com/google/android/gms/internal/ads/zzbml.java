package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbml extends zzbzb {
    private final Object zza = new Object();
    private final zzbmq zzb;
    private boolean zzc;

    public zzbml(zzbmq zzbmqVar) {
        this.zzb = zzbmqVar;
    }

    public final void zzb() {
        com.google.android.gms.ads.internal.util.zze.zza("release: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("release: Lock acquired");
            if (this.zzc) {
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock already released");
                return;
            }
            this.zzc = true;
            zzj(new zzbmi(this), new zzbyx());
            zzj(new zzbmj(this), new zzbmk(this));
            com.google.android.gms.ads.internal.util.zze.zza("release: Lock released");
        }
    }
}

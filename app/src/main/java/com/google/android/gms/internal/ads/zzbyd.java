package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbyd {
    private final Object zza = new Object();
    private volatile int zzc = 1;
    private volatile long zzb = 0;

    private zzbyd() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbyd(zzbye zzbyeVar) {
    }

    public final void zza() {
        long a10 = com.google.android.gms.ads.internal.zzv.zzC().a();
        synchronized (this.zza) {
            if (this.zzc == 3) {
                if (this.zzb + ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfQ)).longValue() <= a10) {
                    this.zzc = 1;
                }
            }
        }
        long a11 = com.google.android.gms.ads.internal.zzv.zzC().a();
        synchronized (this.zza) {
            if (this.zzc != 2) {
                return;
            }
            this.zzc = 3;
            if (this.zzc == 3) {
                this.zzb = a11;
            }
        }
    }
}

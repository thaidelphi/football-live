package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcan implements Runnable {
    private final zzbzz zza;
    private boolean zzb = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcan(zzbzz zzbzzVar) {
        this.zza = zzbzzVar;
    }

    private final void zzc() {
        zzfpe zzfpeVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzfpeVar.removeCallbacks(this);
        zzfpeVar.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzt();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzt();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}

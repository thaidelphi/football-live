package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzejc implements zzejh {
    final /* synthetic */ zzejd zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzejc(zzejd zzejdVar) {
        this.zza = zzejdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejh
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejh
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcpl zzcplVar = (zzcpl) obj;
        synchronized (this.zza) {
            this.zza.zzc = zzcplVar.zzl();
            zzcplVar.zzk();
        }
    }
}

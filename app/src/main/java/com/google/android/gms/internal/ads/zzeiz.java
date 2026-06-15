package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeiz implements zzejh {
    final /* synthetic */ zzeja zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeiz(zzeja zzejaVar) {
        this.zza = zzejaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejh
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzj = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejh
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzddc zzddcVar;
        zzddc zzddcVar2 = (zzddc) obj;
        synchronized (this.zza) {
            this.zza.zzj = zzddcVar2;
            zzddcVar = this.zza.zzj;
            zzddcVar.zzk();
        }
    }
}

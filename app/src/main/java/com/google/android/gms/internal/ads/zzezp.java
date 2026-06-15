package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzezp implements zzejh {
    final /* synthetic */ zzezr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzezp(zzezr zzezrVar) {
        this.zza = zzezrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejh
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejh
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdmj zzdmjVar;
        zzfah zzfahVar;
        zzdmj zzdmjVar2 = (zzdmj) obj;
        synchronized (this.zza) {
            this.zza.zzd = zzdmjVar2;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdG)).booleanValue()) {
                zzfai zzd = zzdmjVar2.zzd();
                zzfahVar = this.zza.zzc;
                zzd.zza = zzfahVar;
            }
            zzdmjVar = this.zza.zzd;
            zzdmjVar.zzk();
        }
    }
}

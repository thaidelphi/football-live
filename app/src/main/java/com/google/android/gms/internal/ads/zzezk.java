package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzezk implements zzejh {
    final /* synthetic */ zzezl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzezk(zzezl zzezlVar) {
        this.zza = zzezlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejh
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejh
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdmj zzdmjVar;
        zzfah zzfahVar;
        zzdmj zzdmjVar2 = (zzdmj) obj;
        synchronized (this.zza) {
            this.zza.zzi = zzdmjVar2;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdG)).booleanValue()) {
                zzfai zzd = zzdmjVar2.zzd();
                zzfahVar = this.zza.zzd;
                zzd.zza = zzfahVar;
            }
            zzdmjVar = this.zza.zzi;
            zzdmjVar.zzk();
        }
    }
}

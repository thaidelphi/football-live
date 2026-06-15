package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzehx implements zzejh {
    final /* synthetic */ zzehy zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzehx(zzehy zzehyVar) {
        this.zza = zzehyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejh
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzejh
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcne zzcneVar;
        zzcne zzcneVar2;
        zzcne zzcneVar3;
        zzcne zzcneVar4 = (zzcne) obj;
        synchronized (this.zza) {
            zzehy zzehyVar = this.zza;
            zzcneVar = zzehyVar.zzi;
            if (zzcneVar != null) {
                zzcneVar3 = zzehyVar.zzi;
                zzcneVar3.zzb();
            }
            this.zza.zzi = zzcneVar4;
            zzcneVar2 = this.zza.zzi;
            zzcneVar2.zzk();
        }
    }
}

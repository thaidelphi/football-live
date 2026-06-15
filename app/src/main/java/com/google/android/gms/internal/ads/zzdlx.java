package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdlx extends zzdlh implements zzdce {
    private zzdce zza;

    @Override // com.google.android.gms.internal.ads.zzdce
    public final synchronized void zzdd() {
        zzdce zzdceVar = this.zza;
        if (zzdceVar != null) {
            zzdceVar.zzdd();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zzi(com.google.android.gms.ads.internal.client.zza zzaVar, zzbhe zzbheVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbhg zzbhgVar, com.google.android.gms.ads.internal.overlay.zzac zzacVar, zzdce zzdceVar) {
        super.zzh(zzaVar, zzbheVar, zzrVar, zzbhgVar, zzacVar);
        this.zza = zzdceVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdce
    public final synchronized void zzu() {
        zzdce zzdceVar = this.zza;
        if (zzdceVar != null) {
            zzdceVar.zzu();
        }
    }
}

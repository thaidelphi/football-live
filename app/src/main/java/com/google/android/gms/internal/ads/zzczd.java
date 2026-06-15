package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzczd implements zzcxc {
    private int zza = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbp)).intValue();
    private int zzb = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmJ)).intValue();

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzdl(zzbud zzbudVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final synchronized void zzdm(zzfag zzfagVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbq)).booleanValue()) {
            try {
                zzezx zzezxVar = zzfagVar.zzb.zzb;
                this.zza = zzezxVar.zzc;
                this.zzb = zzezxVar.zzd;
            } catch (NullPointerException unused) {
            }
        }
    }
}

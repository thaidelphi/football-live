package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzccb extends zzcbx {
    public zzccb(zzcal zzcalVar) {
        super(zzcalVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbx
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzcbx
    public final boolean zzt(String str) {
        String zzg = com.google.android.gms.ads.internal.util.client.zzf.zzg(str);
        zzcal zzcalVar = (zzcal) this.zzc.get();
        if (zzcalVar != null && zzg != null) {
            zzcalVar.zzt(zzg, this);
        }
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("VideoStreamNoopCache is doing nothing.");
        zzg(str, zzg, "noop", "Noop cache is a noop.");
        return false;
    }
}

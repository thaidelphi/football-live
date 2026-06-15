package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcof implements zzcuz {
    private final zzcdq zza;
    private final zzdqf zzb;
    private final zzezu zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcof(zzcdq zzcdqVar, zzdqf zzdqfVar, zzezu zzezuVar) {
        this.zza = zzcdqVar;
        this.zzb = zzdqfVar;
        this.zzc = zzezuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final void zzr() {
        zzcdq zzcdqVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmL)).booleanValue() || (zzcdqVar = this.zza) == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzac.zza(zzcdqVar.zzF()) ? "0" : "1";
        zzdqe zza = this.zzb.zza();
        zza.zzb("action", "hcp");
        zza.zzb("hcp", str);
        zza.zzc(this.zzc);
        zza.zzj();
    }
}

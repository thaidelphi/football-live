package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final /* synthetic */ class zzfax implements zzbio {
    public final /* synthetic */ zzdce zza;
    public final /* synthetic */ zzclc zzb;
    public final /* synthetic */ zzfhp zzc;
    public final /* synthetic */ zzdzu zzd;

    public /* synthetic */ zzfax(zzdce zzdceVar, zzclc zzclcVar, zzfhp zzfhpVar, zzdzu zzdzuVar) {
        this.zza = zzdceVar;
        this.zzb = zzclcVar;
        this.zzc = zzfhpVar;
        this.zzd = zzdzuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final void zza(Object obj, Map map) {
        zzcdq zzcdqVar = (zzcdq) obj;
        zzbin.zzc(map, this.zza);
        String str = (String) map.get("u");
        if (str == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("URL missing from click GMSG.");
            return;
        }
        zzdzu zzdzuVar = this.zzd;
        zzfhp zzfhpVar = this.zzc;
        zzgap.zzr(zzbin.zza(zzcdqVar, str), new zzfaz(zzcdqVar, this.zzb, zzfhpVar, zzdzuVar), zzbyp.zza);
    }
}

package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final /* synthetic */ class zzbhm implements zzbio {
    public final /* synthetic */ zzdce zza;
    public final /* synthetic */ zzclc zzb;

    public /* synthetic */ zzbhm(zzdce zzdceVar, zzclc zzclcVar) {
        this.zza = zzdceVar;
        this.zzb = zzclcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final void zza(Object obj, Map map) {
        zzcdq zzcdqVar = (zzcdq) obj;
        zzbin.zzc(map, this.zza);
        final String str = (String) map.get("u");
        if (str == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("URL missing from click GMSG.");
            return;
        }
        final zzclc zzclcVar = this.zzb;
        zzgag zzu = zzgag.zzu(zzbin.zza(zzcdqVar, str));
        zzfzw zzfzwVar = new zzfzw() { // from class: com.google.android.gms.internal.ads.zzbhp
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj2) {
                zzclc zzclcVar2;
                String str2 = (String) obj2;
                zzbio zzbioVar = zzbin.zza;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjW)).booleanValue() && (zzclcVar2 = zzclc.this) != null && zzclc.zzj(str)) {
                    return zzclcVar2.zze(str2, com.google.android.gms.ads.internal.client.zzbb.zze());
                }
                return zzgap.zzh(str2);
            }
        };
        zzgba zzgbaVar = zzbyp.zza;
        zzgap.zzr((zzgag) zzgap.zzn(zzu, zzfzwVar, zzgbaVar), new zzbic(zzcdqVar), zzgbaVar);
    }
}

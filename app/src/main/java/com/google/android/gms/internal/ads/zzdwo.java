package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdwo implements zzdwq {
    private final Map zza;
    private final zzgba zzb;
    private final zzcxa zzc;

    public zzdwo(Map map, zzgba zzgbaVar, zzcxa zzcxaVar) {
        this.zza = map;
        this.zzb = zzgbaVar;
        this.zzc = zzcxaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwq
    public final b6.a zzc(final zzbud zzbudVar) {
        this.zzc.zzdl(zzbudVar);
        b6.a zzg = zzgap.zzg(new zzduh(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzif)).split(",")) {
            final zzheb zzhebVar = (zzheb) this.zza.get(str.trim());
            if (zzhebVar != null) {
                zzg = zzgap.zzf(zzg, zzduh.class, new zzfzw() { // from class: com.google.android.gms.internal.ads.zzdwm
                    @Override // com.google.android.gms.internal.ads.zzfzw
                    public final b6.a zza(Object obj) {
                        zzduh zzduhVar = (zzduh) obj;
                        return ((zzdwq) zzheb.this.zzb()).zzc(zzbudVar);
                    }
                }, this.zzb);
            }
        }
        zzgap.zzr(zzg, new zzdwn(this), zzbyp.zzg);
        return zzg;
    }
}

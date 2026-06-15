package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzdev implements zzcpo {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzheb zzd;
    private final zzdhc zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdev(Map map, Map map2, Map map3, zzheb zzhebVar, zzdhc zzdhcVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzhebVar;
        this.zze = zzdhcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcpo
    public final zzebg zza(int i10, String str) {
        zzebg zza;
        zzebg zzebgVar = (zzebg) this.zza.get(str);
        if (zzebgVar != null) {
            return zzebgVar;
        }
        if (i10 != 1) {
            if (i10 != 4) {
                return null;
            }
            zzedp zzedpVar = (zzedp) this.zzc.get(str);
            if (zzedpVar != null) {
                return new zzebh(zzedpVar, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzcpq
                    @Override // com.google.android.gms.internal.ads.zzfsk
                    public final Object apply(Object obj) {
                        return new zzcpt((List) obj);
                    }
                });
            }
            zza = (zzebg) this.zzb.get(str);
            if (zza == null) {
                return null;
            }
        } else if (this.zze.zze() == null || (zza = ((zzcpo) this.zzd.zzb()).zza(i10, str)) == null) {
            return null;
        }
        return new zzebh(zza, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzcpr
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                return new zzcpt((zzcpl) obj);
            }
        });
    }
}

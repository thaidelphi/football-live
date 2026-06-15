package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfbb {
    private final zzezu zza;
    private final zzezx zzb;
    private final zzfhp zzc;
    private final zzfhg zzd;
    private final zzffn zze;
    private final zzclc zzf;

    public zzfbb(zzfhp zzfhpVar, zzfhg zzfhgVar, zzezu zzezuVar, zzezx zzezxVar, zzclc zzclcVar, zzffn zzffnVar) {
        this.zza = zzezuVar;
        this.zzb = zzezxVar;
        this.zzc = zzfhpVar;
        this.zzd = zzfhgVar;
        this.zzf = zzclcVar;
        this.zze = zzffnVar;
    }

    public final void zza(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2);
        }
    }

    public final void zzb(String str, int i10) {
        zzezu zzezuVar = this.zza;
        if (zzezuVar.zzai) {
            this.zzd.zza(str, this.zzb.zzb, i10);
            return;
        }
        this.zzc.zzd(str, zzezuVar.zzax, this.zze);
    }

    public final void zzc(List list, int i10) {
        b6.a zzh;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjW)).booleanValue() && zzclc.zzj(str)) {
                zzh = this.zzf.zze(str, com.google.android.gms.ads.internal.client.zzbb.zze());
            } else {
                zzh = zzgap.zzh(str);
            }
            zzgap.zzr(zzh, new zzfba(this, i10), zzbyp.zza);
        }
    }
}

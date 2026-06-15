package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzauz implements zzfnn {
    private final zzfls zza;
    private final zzfmh zzb;
    private final zzavm zzc;
    private final zzauy zzd;
    private final zzaui zze;
    private final zzavo zzf;
    private final zzavg zzg;
    private final zzaux zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzauz(zzfls zzflsVar, zzfmh zzfmhVar, zzavm zzavmVar, zzauy zzauyVar, zzaui zzauiVar, zzavo zzavoVar, zzavg zzavgVar, zzaux zzauxVar) {
        this.zza = zzflsVar;
        this.zzb = zzfmhVar;
        this.zzc = zzavmVar;
        this.zzd = zzauyVar;
        this.zze = zzauiVar;
        this.zzf = zzavoVar;
        this.zzg = zzavgVar;
        this.zzh = zzauxVar;
    }

    private final Map zze() {
        HashMap hashMap = new HashMap();
        zzfls zzflsVar = this.zza;
        zzasa zzb = this.zzb.zzb();
        hashMap.put("v", zzflsVar.zzd());
        hashMap.put("gms", Boolean.valueOf(this.zza.zzg()));
        hashMap.put("int", zzb.zzg());
        hashMap.put("attts", Long.valueOf(zzb.zzf().zza()));
        hashMap.put("att", zzb.zzf().zzd());
        hashMap.put("attkid", zzb.zzf().zzf());
        hashMap.put("up", Boolean.valueOf(this.zzd.zza()));
        hashMap.put("t", new Throwable());
        zzavg zzavgVar = this.zzg;
        if (zzavgVar != null) {
            hashMap.put("tcq", Long.valueOf(zzavgVar.zzc()));
            hashMap.put("tpq", Long.valueOf(this.zzg.zzg()));
            hashMap.put("tcv", Long.valueOf(this.zzg.zzd()));
            hashMap.put("tpv", Long.valueOf(this.zzg.zzh()));
            hashMap.put("tchv", Long.valueOf(this.zzg.zzb()));
            hashMap.put("tphv", Long.valueOf(this.zzg.zzf()));
            hashMap.put("tcc", Long.valueOf(this.zzg.zza()));
            hashMap.put("tpc", Long.valueOf(this.zzg.zze()));
            zzaui zzauiVar = this.zze;
            if (zzauiVar != null) {
                hashMap.put("nt", Long.valueOf(zzauiVar.zza()));
            }
            zzavo zzavoVar = this.zzf;
            if (zzavoVar != null) {
                hashMap.put("vs", Long.valueOf(zzavoVar.zzc()));
                hashMap.put("vf", Long.valueOf(this.zzf.zzb()));
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzfnn
    public final Map zza() {
        zzavm zzavmVar = this.zzc;
        Map zze = zze();
        zze.put("lts", Long.valueOf(zzavmVar.zza()));
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfnn
    public final Map zzb() {
        return zze();
    }

    @Override // com.google.android.gms.internal.ads.zzfnn
    public final Map zzc() {
        zzaux zzauxVar = this.zzh;
        Map zze = zze();
        if (zzauxVar != null) {
            zze.put("vst", zzauxVar.zza());
        }
        return zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(View view) {
        this.zzc.zzd(view);
    }
}

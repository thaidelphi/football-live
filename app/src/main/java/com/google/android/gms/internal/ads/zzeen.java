package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeen extends zzeek {
    private final zzcfq zza;
    private final zzctm zzb;
    private final zzehb zzc;
    private final zzczy zzd;
    private final zzdex zze;
    private final zzcwx zzf;
    private final ViewGroup zzg;
    private final zzczd zzh;
    private final zzeev zzi;
    private final zzebl zzj;

    public zzeen(zzcfq zzcfqVar, zzctm zzctmVar, zzehb zzehbVar, zzczy zzczyVar, zzdex zzdexVar, zzcwx zzcwxVar, ViewGroup viewGroup, zzczd zzczdVar, zzeev zzeevVar, zzebl zzeblVar) {
        this.zza = zzcfqVar;
        this.zzb = zzctmVar;
        this.zzc = zzehbVar;
        this.zzd = zzczyVar;
        this.zze = zzdexVar;
        this.zzf = zzcwxVar;
        this.zzg = viewGroup;
        this.zzh = zzczdVar;
        this.zzi = zzeevVar;
        this.zzj = zzeblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    protected final b6.a zzc(zzfap zzfapVar, Bundle bundle, zzezu zzezuVar, zzfag zzfagVar) {
        zzctm zzctmVar = this.zzb;
        zzctmVar.zzk(zzfapVar);
        zzctmVar.zzg(bundle);
        zzctmVar.zzh(new zzctf(zzfagVar, zzezuVar, this.zzi));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdI)).booleanValue()) {
            this.zzb.zze(this.zzj);
        }
        zzcfq zzcfqVar = this.zza;
        zzctm zzctmVar2 = this.zzb;
        zzcoh zze = zzcfqVar.zze();
        zze.zzi(zzctmVar2.zzl());
        zze.zzf(this.zzd);
        zze.zze(this.zzc);
        zze.zzd(this.zze);
        zze.zzg(new zzcpd(this.zzf, this.zzh));
        zze.zzc(new zzcnb(this.zzg));
        zzcqp zzc = zze.zzk().zzc();
        return zzc.zzh(zzc.zzi());
    }
}

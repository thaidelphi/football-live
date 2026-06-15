package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeei extends zzeek {
    private final zzcfq zza;
    private final zzdex zzb;
    private final zzctm zzc;
    private final zzczy zzd;
    private final zzeev zze;
    private final zzebl zzf;

    public zzeei(zzcfq zzcfqVar, zzdex zzdexVar, zzctm zzctmVar, zzczy zzczyVar, zzeev zzeevVar, zzebl zzeblVar) {
        this.zza = zzcfqVar;
        this.zzb = zzdexVar;
        this.zzc = zzctmVar;
        this.zzd = zzczyVar;
        this.zze = zzeevVar;
        this.zzf = zzeblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    protected final b6.a zzc(zzfap zzfapVar, Bundle bundle, zzezu zzezuVar, zzfag zzfagVar) {
        zzctm zzctmVar = this.zzc;
        zzctmVar.zzk(zzfapVar);
        zzctmVar.zzg(bundle);
        zzctmVar.zzh(new zzctf(zzfagVar, zzezuVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdI)).booleanValue()) {
            this.zzc.zze(this.zzf);
        }
        zzcfq zzcfqVar = this.zza;
        zzctm zzctmVar2 = this.zzc;
        zzdfb zzh = zzcfqVar.zzh();
        zzh.zzf(zzctmVar2.zzl());
        zzh.zze(this.zzd);
        zzh.zzd(this.zzb);
        zzh.zzc(new zzcnb(null));
        zzcqp zza = zzh.zzg().zza();
        return zza.zzh(zza.zzi());
    }
}

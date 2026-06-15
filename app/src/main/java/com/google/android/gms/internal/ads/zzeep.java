package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeep extends zzeek {
    private final zzcfq zza;
    private final zzctm zzb;
    private final zzehb zzc;
    private final zzczy zzd;
    private final zzeev zze;
    private final zzebl zzf;

    public zzeep(zzcfq zzcfqVar, zzctm zzctmVar, zzehb zzehbVar, zzczy zzczyVar, zzeev zzeevVar, zzebl zzeblVar) {
        this.zza = zzcfqVar;
        this.zzb = zzctmVar;
        this.zzc = zzehbVar;
        this.zzd = zzczyVar;
        this.zze = zzeevVar;
        this.zzf = zzeblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    protected final b6.a zzc(zzfap zzfapVar, Bundle bundle, zzezu zzezuVar, zzfag zzfagVar) {
        zzctm zzctmVar = this.zzb;
        zzctmVar.zzk(zzfapVar);
        zzctmVar.zzg(bundle);
        zzctmVar.zzh(new zzctf(zzfagVar, zzezuVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdI)).booleanValue()) {
            this.zzb.zze(this.zzf);
        }
        zzcfq zzcfqVar = this.zza;
        zzctm zzctmVar2 = this.zzb;
        zzdef zzg = zzcfqVar.zzg();
        zzg.zze(zzctmVar2.zzl());
        zzg.zzd(this.zzd);
        zzg.zzc(this.zzc);
        zzcqp zza = zzg.zzf().zza();
        return zza.zzh(zza.zzi());
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeer extends zzeek {
    private final zzcfq zza;
    private final zzctm zzb;
    private final zzczy zzc;
    private final zzeev zzd;
    private final zzfah zze;
    private final zzebl zzf;

    public zzeer(zzcfq zzcfqVar, zzctm zzctmVar, zzczy zzczyVar, zzfah zzfahVar, zzeev zzeevVar, zzebl zzeblVar) {
        this.zza = zzcfqVar;
        this.zzb = zzctmVar;
        this.zzc = zzczyVar;
        this.zze = zzfahVar;
        this.zzd = zzeevVar;
        this.zzf = zzeblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    protected final b6.a zzc(zzfap zzfapVar, Bundle bundle, zzezu zzezuVar, zzfag zzfagVar) {
        zzfah zzfahVar;
        zzctm zzctmVar = this.zzb;
        zzctmVar.zzk(zzfapVar);
        zzctmVar.zzg(bundle);
        zzctmVar.zzh(new zzctf(zzfagVar, zzezuVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdH)).booleanValue() && (zzfahVar = this.zze) != null) {
            this.zzb.zzj(zzfahVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdI)).booleanValue()) {
            this.zzb.zze(this.zzf);
        }
        zzcfq zzcfqVar = this.zza;
        zzctm zzctmVar2 = this.zzb;
        zzdmn zzi = zzcfqVar.zzi();
        zzi.zzd(zzctmVar2.zzl());
        zzi.zzc(this.zzc);
        zzcqp zzb = zzi.zze().zzb();
        return zzb.zzh(zzb.zzi());
    }
}

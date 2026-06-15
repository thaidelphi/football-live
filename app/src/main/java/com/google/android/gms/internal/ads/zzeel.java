package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeel extends zzeek {
    private final zzcfq zza;
    private final zzctm zzb;
    private final zzczy zzc;
    private final zzeev zzd;
    private final zzebl zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeel(zzcfq zzcfqVar, zzctm zzctmVar, zzczy zzczyVar, zzeev zzeevVar, zzebl zzeblVar) {
        this.zza = zzcfqVar;
        this.zzb = zzctmVar;
        this.zzc = zzczyVar;
        this.zzd = zzeevVar;
        this.zze = zzeblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    protected final b6.a zzc(zzfap zzfapVar, Bundle bundle, zzezu zzezuVar, zzfag zzfagVar) {
        zzctm zzctmVar = this.zzb;
        zzctmVar.zzk(zzfapVar);
        zzctmVar.zzg(bundle);
        zzctmVar.zzh(new zzctf(zzfagVar, zzezuVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdI)).booleanValue()) {
            this.zzb.zze(this.zze);
        }
        zzcfq zzcfqVar = this.zza;
        zzctm zzctmVar2 = this.zzb;
        zzcmr zzd = zzcfqVar.zzd();
        zzd.zzd(zzctmVar2.zzl());
        zzd.zzc(this.zzc);
        zzcqp zzb = zzd.zze().zzb();
        return zzb.zzh(zzb.zzi());
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzexh {
    private final zzfcc zza;
    private final zzctl zzb;
    private final Executor zzc;
    private zzexf zzd;

    public zzexh(zzfcc zzfccVar, zzctl zzctlVar, Executor executor) {
        this.zza = zzfccVar;
        this.zzb = zzctlVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzfcm zze() {
        zzfap zzg = this.zzb.zzg();
        return this.zza.zzc(zzg.zzd, zzg.zzf, zzg.zzj);
    }

    public final b6.a zzc() {
        b6.a aVar;
        zzexf zzexfVar = this.zzd;
        if (zzexfVar == null) {
            if (!((Boolean) zzbdt.zza.zze()).booleanValue()) {
                zzexf zzexfVar2 = new zzexf(null, zze(), null);
                this.zzd = zzexfVar2;
                aVar = zzgap.zzh(zzexfVar2);
            } else {
                aVar = (zzgag) zzgap.zze((zzgag) zzgap.zzm(zzgag.zzu(this.zzb.zzb().zzf(this.zza.zza())), new zzexe(this), this.zzc), zzdwr.class, new zzexd(this), this.zzc);
            }
            return zzgap.zzm(aVar, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzexc
                @Override // com.google.android.gms.internal.ads.zzfsk
                public final Object apply(Object obj) {
                    return (zzexf) obj;
                }
            }, this.zzc);
        }
        return zzgap.zzh(zzexfVar);
    }
}

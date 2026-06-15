package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzewx implements zzexl {
    private final zzfcc zza;
    private final Executor zzb;
    private final zzgal zzc = new zzewv(this);

    public zzewx(zzfcc zzfccVar, Executor executor) {
        this.zza = zzfccVar;
        this.zzb = executor;
    }

    public static /* synthetic */ b6.a zza(zzewx zzewxVar, zzctl zzctlVar, zzexf zzexfVar) {
        zzfcc zzfccVar = zzewxVar.zza;
        zzfcm zzfcmVar = zzexfVar.zzb;
        zzbud zzbudVar = zzexfVar.zza;
        zzfcl zzb = zzfccVar.zzb(zzfcmVar);
        if (zzb != null && zzbudVar != null) {
            zzgap.zzr(zzctlVar.zzb().zzg(zzbudVar), zzewxVar.zzc, zzewxVar.zzb);
        }
        return zzgap.zzh(new zzeww(zzfcmVar, zzbudVar, zzb));
    }

    public final b6.a zzb(zzexm zzexmVar, zzexk zzexkVar, final zzctl zzctlVar) {
        return (zzgag) zzgap.zze((zzgag) zzgap.zzn(zzgag.zzu(new zzexh(this.zza, zzctlVar, this.zzb).zzc()), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzewt
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzewx.zza(zzewx.this, zzctlVar, (zzexf) obj);
            }
        }, this.zzb), Exception.class, new zzewu(this), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzexl
    public final /* bridge */ /* synthetic */ b6.a zzc(zzexm zzexmVar, zzexk zzexkVar, Object obj) {
        return zzb(zzexmVar, zzexkVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzexl
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}

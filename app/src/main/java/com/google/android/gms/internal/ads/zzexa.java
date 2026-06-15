package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzexa implements zzexl {
    private zzctl zza;

    @Override // com.google.android.gms.internal.ads.zzexl
    /* renamed from: zza */
    public final synchronized zzctl zzd() {
        return this.zza;
    }

    public final synchronized b6.a zzb(zzexm zzexmVar, zzexk zzexkVar, zzctl zzctlVar) {
        zzcqp zzb;
        if (zzctlVar != null) {
            this.zza = zzctlVar;
        } else {
            this.zza = (zzctl) zzexkVar.zza(zzexmVar.zzb).zzh();
        }
        zzb = this.zza.zzb();
        return zzb.zzh(zzb.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzexl
    public final /* bridge */ /* synthetic */ b6.a zzc(zzexm zzexmVar, zzexk zzexkVar, Object obj) {
        return zzb(zzexmVar, zzexkVar, null);
    }
}

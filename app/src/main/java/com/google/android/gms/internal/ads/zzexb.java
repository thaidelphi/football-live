package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzexb implements zzexl {
    private final zzexl zza;
    private zzctl zzb;

    public zzexb(zzexl zzexlVar) {
        this.zza = zzexlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexl
    /* renamed from: zza */
    public final synchronized zzctl zzd() {
        return this.zzb;
    }

    public final synchronized b6.a zzb(zzexm zzexmVar, zzexk zzexkVar, zzctl zzctlVar) {
        zzbud zzbudVar;
        this.zzb = zzctlVar;
        if (zzctlVar != null && (zzbudVar = zzexmVar.zza) != null) {
            zzcqp zzb = zzctlVar.zzb();
            return zzb.zzh(zzb.zzj(zzgap.zzh(zzbudVar)));
        }
        return ((zzexa) this.zza).zzb(zzexmVar, zzexkVar, zzctlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzexl
    public final /* bridge */ /* synthetic */ b6.a zzc(zzexm zzexmVar, zzexk zzexkVar, Object obj) {
        return zzb(zzexmVar, zzexkVar, null);
    }
}

package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzewp implements zzfcw {
    private final zzexl zza;

    public zzewp(zzexl zzexlVar) {
        this.zza = zzexlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcw
    public final b6.a zza(zzfcx zzfcxVar) {
        zzewq zzewqVar = (zzewq) zzfcxVar;
        return ((zzewm) this.zza).zzb(zzewqVar.zzb, zzewqVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfcw
    public final void zzb(zzfcl zzfclVar) {
        zzfclVar.zza = ((zzewm) this.zza).zza();
    }
}

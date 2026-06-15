package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzebh implements zzebg {
    public final zzebg zza;
    private final zzfsk zzb;

    public zzebh(zzebg zzebgVar, zzfsk zzfskVar) {
        this.zza = zzebgVar;
        this.zzb = zzfskVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    public final b6.a zza(zzfag zzfagVar, zzezu zzezuVar) {
        return zzgap.zzm(this.zza.zza(zzfagVar, zzezuVar), this.zzb, zzbyp.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    public final boolean zzb(zzfag zzfagVar, zzezu zzezuVar) {
        return this.zza.zzb(zzfagVar, zzezuVar);
    }
}

package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzegz implements zzebg {
    private final zzbch zza;
    private final zzgba zzb;
    private final zzfet zzc;
    private final zzehi zzd;

    public zzegz(zzfet zzfetVar, zzgba zzgbaVar, zzbch zzbchVar, zzehi zzehiVar) {
        this.zzc = zzfetVar;
        this.zzb = zzgbaVar;
        this.zza = zzbchVar;
        this.zzd = zzehiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    public final b6.a zza(zzfag zzfagVar, zzezu zzezuVar) {
        zzbyu zzbyuVar = new zzbyu();
        zzehe zzeheVar = new zzehe();
        zzeheVar.zzd(new zzegy(this, zzbyuVar, zzfagVar, zzezuVar, zzeheVar));
        zzezz zzezzVar = zzezuVar.zzs;
        final zzbcc zzbccVar = new zzbcc(zzeheVar, zzezzVar.zzb, zzezzVar.zza);
        zzfen zzfenVar = zzfen.CUSTOM_RENDER_SYN;
        return zzfed.zzd(new zzfdy() { // from class: com.google.android.gms.internal.ads.zzegx
            @Override // com.google.android.gms.internal.ads.zzfdy
            public final void zza() {
                zzegz.this.zza.zze(zzbccVar);
            }
        }, this.zzb, zzfenVar, this.zzc).zzb(zzfen.CUSTOM_RENDER_ACK).zzd(zzbyuVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    public final boolean zzb(zzfag zzfagVar, zzezu zzezuVar) {
        zzezz zzezzVar;
        return (this.zza == null || (zzezzVar = zzezuVar.zzs) == null || zzezzVar.zza == null) ? false : true;
    }
}

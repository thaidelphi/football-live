package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzegu implements zzebg {
    private final Context zza;
    private final zzcoi zzb;
    private final zzbch zzc;
    private final zzgba zzd;
    private final zzfet zze;

    public zzegu(Context context, zzcoi zzcoiVar, zzfet zzfetVar, zzgba zzgbaVar, zzbch zzbchVar) {
        this.zza = context;
        this.zzb = zzcoiVar;
        this.zze = zzfetVar;
        this.zzd = zzgbaVar;
        this.zzc = zzbchVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    public final b6.a zza(zzfag zzfagVar, zzezu zzezuVar) {
        zzegs zzegsVar = new zzegs(this, new View(this.zza), null, new zzcpj() { // from class: com.google.android.gms.internal.ads.zzegq
            @Override // com.google.android.gms.internal.ads.zzcpj
            public final com.google.android.gms.ads.internal.client.zzea zza() {
                return null;
            }
        }, (zzezv) zzezuVar.zzu.get(0));
        zzcnf zza = this.zzb.zza(new zzcqb(zzfagVar, zzezuVar, null), zzegsVar);
        zzegt zzl = zza.zzl();
        zzezz zzezzVar = zzezuVar.zzs;
        final zzbcc zzbccVar = new zzbcc(zzl, zzezzVar.zzb, zzezzVar.zza);
        zzfen zzfenVar = zzfen.CUSTOM_RENDER_SYN;
        return zzfed.zzd(new zzfdy() { // from class: com.google.android.gms.internal.ads.zzegr
            @Override // com.google.android.gms.internal.ads.zzfdy
            public final void zza() {
                zzegu.this.zzc.zze(zzbccVar);
            }
        }, this.zzd, zzfenVar, this.zze).zzb(zzfen.CUSTOM_RENDER_ACK).zzd(zzgap.zzh(zza.zza())).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    public final boolean zzb(zzfag zzfagVar, zzezu zzezuVar) {
        zzezz zzezzVar;
        return (this.zzc == null || (zzezzVar = zzezuVar.zzs) == null || zzezzVar.zza == null) ? false : true;
    }
}

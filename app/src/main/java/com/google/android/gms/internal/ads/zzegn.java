package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzegn implements zzebg {
    private final zzebi zza;
    private final zzebm zzb;
    private final zzfet zzc;
    private final zzgba zzd;

    public zzegn(zzfet zzfetVar, zzgba zzgbaVar, zzebi zzebiVar, zzebm zzebmVar) {
        this.zzc = zzfetVar;
        this.zzd = zzgbaVar;
        this.zzb = zzebmVar;
        this.zza = zzebiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String zze(String str, int i10) {
        return "Error from: " + str + ", code: " + i10;
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    public final b6.a zza(final zzfag zzfagVar, final zzezu zzezuVar) {
        final zzebj zzebjVar;
        Iterator it = zzezuVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzebjVar = null;
                break;
            }
            try {
                zzebjVar = this.zza.zza((String) it.next(), zzezuVar.zzv);
                break;
            } catch (zzfaw unused) {
            }
        }
        if (zzebjVar == null) {
            return zzgap.zzg(new zzeed("Unable to instantiate mediation adapter class."));
        }
        zzbyu zzbyuVar = new zzbyu();
        zzebjVar.zzc.zza(new zzegm(this, zzebjVar, zzbyuVar));
        if (zzezuVar.zzM) {
            Bundle bundle = zzfagVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfet zzfetVar = this.zzc;
        return zzfed.zzd(new zzfdy() { // from class: com.google.android.gms.internal.ads.zzegk
            @Override // com.google.android.gms.internal.ads.zzfdy
            public final void zza() {
                zzegn.this.zzb.zzb(zzfagVar, zzezuVar, zzebjVar);
            }
        }, this.zzd, zzfen.ADAPTER_LOAD_AD_SYN, zzfetVar).zzb(zzfen.ADAPTER_LOAD_AD_ACK).zzd(zzbyuVar).zzb(zzfen.ADAPTER_WRAP_ADAPTER).zze(new zzfdx() { // from class: com.google.android.gms.internal.ads.zzegl
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final Object zza(Object obj) {
                Object zza;
                Void r52 = (Void) obj;
                zza = zzegn.this.zzb.zza(zzfagVar, zzezuVar, zzebjVar);
                return zza;
            }
        }).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    public final boolean zzb(zzfag zzfagVar, zzezu zzezuVar) {
        return !zzezuVar.zzt.isEmpty();
    }
}

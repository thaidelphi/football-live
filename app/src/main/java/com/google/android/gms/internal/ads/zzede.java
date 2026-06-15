package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzede implements zzebg {
    private final Context zza;
    private final zzdnf zzb;
    private final zzdeg zzc;
    private final zzfap zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbir zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziP)).booleanValue();
    private final zzeaf zzi;
    private final zzdpz zzj;
    private final zzdqf zzk;

    public zzede(Context context, VersionInfoParcel versionInfoParcel, zzfap zzfapVar, Executor executor, zzdeg zzdegVar, zzdnf zzdnfVar, zzbir zzbirVar, zzeaf zzeafVar, zzdpz zzdpzVar, zzdqf zzdqfVar) {
        this.zza = context;
        this.zzd = zzfapVar;
        this.zzc = zzdegVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdnfVar;
        this.zzg = zzbirVar;
        this.zzi = zzeafVar;
        this.zzj = zzdpzVar;
        this.zzk = zzdqfVar;
    }

    public static /* synthetic */ b6.a zzc(zzede zzedeVar, final zzezu zzezuVar, zzfag zzfagVar, zzdnj zzdnjVar, Object obj) {
        final zzede zzedeVar2;
        zzbbd zzbbdVar = zzbbm.zzcm;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue()) {
            zzedeVar.zzj.zza().putLong(zzdpn.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
        }
        final zzcdq zza = zzedeVar.zzb.zza(zzedeVar.zzd.zze, zzezuVar, zzfagVar.zzb.zzb);
        zza.zzac(zzezuVar.zzW);
        zzdnjVar.zza(zzedeVar.zza, zza.zzF());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue()) {
            zzedeVar.zzj.zza().putLong(zzdpn.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
        }
        zzbyu zzbyuVar = new zzbyu();
        final zzddd zze = zzedeVar.zzc.zze(new zzcqb(zzfagVar, zzezuVar, null), new zzddg(new zzedd(zzedeVar.zza, zzedeVar.zzf, zzbyuVar, zzezuVar, zza, zzedeVar.zzd, zzedeVar.zzh, zzedeVar.zzg, zzedeVar.zzi, zzedeVar.zzk), zza));
        zzbyuVar.zzc(zze);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue()) {
            zzedeVar2 = zzedeVar;
            zzedeVar2.zzj.zza().putLong(zzdpn.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
        } else {
            zzedeVar2 = zzedeVar;
        }
        zze.zzc().zzo(new zzcuz() { // from class: com.google.android.gms.internal.ads.zzedb
            @Override // com.google.android.gms.internal.ads.zzcuz
            public final void zzr() {
                zzcdq zzcdqVar = zzcdq.this;
                if (zzcdqVar.zzN() != null) {
                    zzcdqVar.zzN().zzs();
                }
            }
        }, zzbyp.zzg);
        String str = zzezuVar.zzs.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfj)).booleanValue() && zze.zzl().zze(true)) {
            str = zzcfb.zzb(str, zzcfb.zza(zzezuVar));
        }
        zze.zzi().zzi(zza, true, zzedeVar2.zzh ? zzedeVar2.zzg : null, zzedeVar2.zzj.zza());
        zze.zzi();
        return zzgap.zzm(zzdne.zzj(zza, zzezuVar.zzs.zzb, str, zzedeVar2.zzj.zza()), new zzfsk(zzedeVar2) { // from class: com.google.android.gms.internal.ads.zzedc
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj2) {
                zzcdq zzcdqVar = zza;
                if (zzezuVar.zzM) {
                    zzcdqVar.zzah();
                }
                zzddd zzdddVar = zze;
                zzcdqVar.zzab();
                zzcdqVar.onPause();
                return zzdddVar.zzg();
            }
        }, zzedeVar2.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    public final b6.a zza(final zzfag zzfagVar, final zzezu zzezuVar) {
        final zzdnj zzdnjVar = new zzdnj();
        b6.a zzn = zzgap.zzn(zzgap.zzh(null), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzecz
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzede.zzc(zzede.this, zzezuVar, zzfagVar, zzdnjVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeda
            @Override // java.lang.Runnable
            public final void run() {
                zzdnj.this.zzb();
            }
        }, this.zze);
        return zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    public final boolean zzb(zzfag zzfagVar, zzezu zzezuVar) {
        zzezz zzezzVar = zzezuVar.zzs;
        return (zzezzVar == null || zzezzVar.zza == null) ? false : true;
    }
}

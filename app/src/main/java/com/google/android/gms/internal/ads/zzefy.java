package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzefy implements zzebg {
    private final Context zza;
    private final zzdnf zzb;
    private final zzdmo zzc;
    private final zzfap zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbir zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziP)).booleanValue();
    private final zzeaf zzi;
    private final zzdpz zzj;
    private final zzdqf zzk;

    public zzefy(Context context, VersionInfoParcel versionInfoParcel, zzfap zzfapVar, Executor executor, zzdmo zzdmoVar, zzdnf zzdnfVar, zzbir zzbirVar, zzeaf zzeafVar, zzdpz zzdpzVar, zzdqf zzdqfVar) {
        this.zza = context;
        this.zzd = zzfapVar;
        this.zzc = zzdmoVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdnfVar;
        this.zzg = zzbirVar;
        this.zzi = zzeafVar;
        this.zzj = zzdpzVar;
        this.zzk = zzdqfVar;
    }

    public static /* synthetic */ b6.a zzc(zzefy zzefyVar, final zzezu zzezuVar, zzfag zzfagVar, zzdnj zzdnjVar, Object obj) {
        final zzefy zzefyVar2;
        zzbbd zzbbdVar = zzbbm.zzcm;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue()) {
            zzefyVar.zzj.zza().putLong(zzdpn.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
        }
        final zzcdq zza = zzefyVar.zzb.zza(zzefyVar.zzd.zze, zzezuVar, zzfagVar.zzb.zzb);
        zza.zzac(zzezuVar.zzW);
        zzdnjVar.zza(zzefyVar.zza, zza.zzF());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue()) {
            zzefyVar.zzj.zza().putLong(zzdpn.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
        }
        zzbyu zzbyuVar = new zzbyu();
        final zzdmk zze = zzefyVar.zzc.zze(new zzcqb(zzfagVar, zzezuVar, null), new zzdml(new zzefx(zzefyVar.zza, zzefyVar.zzb, zzefyVar.zzd, zzefyVar.zzf, zzezuVar, zzbyuVar, zza, zzefyVar.zzg, zzefyVar.zzh, zzefyVar.zzi, zzefyVar.zzj, zzefyVar.zzk), zza));
        zzbyuVar.zzc(zze);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue()) {
            zzefyVar2 = zzefyVar;
            zzefyVar2.zzj.zza().putLong(zzdpn.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
        } else {
            zzefyVar2 = zzefyVar;
        }
        zzbjg.zzb(zza, zze.zzg());
        zze.zzc().zzo(new zzcuz() { // from class: com.google.android.gms.internal.ads.zzefr
            @Override // com.google.android.gms.internal.ads.zzcuz
            public final void zzr() {
                zzcdq zzcdqVar = zzcdq.this;
                if (zzcdqVar.zzN() != null) {
                    zzcdqVar.zzN().zzs();
                }
            }
        }, zzbyp.zzg);
        zze.zzl().zzi(zza, true, zzefyVar2.zzh ? zzefyVar2.zzg : null, zzefyVar2.zzj.zza());
        String str = zzezuVar.zzs.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfj)).booleanValue() && zze.zzm().zze(true)) {
            str = zzcfb.zzb(str, zzcfb.zza(zzezuVar));
        }
        zze.zzl();
        return zzgap.zzm(zzdne.zzj(zza, zzezuVar.zzs.zzb, str, zzefyVar2.zzj.zza()), new zzfsk(zzefyVar2) { // from class: com.google.android.gms.internal.ads.zzefs
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj2) {
                zzcdq zzcdqVar = zza;
                if (zzezuVar.zzM) {
                    zzcdqVar.zzah();
                }
                zzdmk zzdmkVar = zze;
                zzcdqVar.zzab();
                zzcdqVar.onPause();
                return zzdmkVar.zzi();
            }
        }, zzefyVar2.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    public final b6.a zza(final zzfag zzfagVar, final zzezu zzezuVar) {
        final zzdnj zzdnjVar = new zzdnj();
        b6.a zzn = zzgap.zzn(zzgap.zzh(null), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzeft
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzefy.zzc(zzefy.this, zzezuVar, zzfagVar, zzdnjVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefu
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

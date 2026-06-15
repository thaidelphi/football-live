package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzebr implements zzebg {
    private final zzcms zza;
    private final Context zzb;
    private final zzdnf zzc;
    private final zzfap zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbir zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziP)).booleanValue();
    private final zzeaf zzi;
    private final zzdpz zzj;
    private final zzdqf zzk;

    public zzebr(zzcms zzcmsVar, Context context, Executor executor, zzdnf zzdnfVar, zzfap zzfapVar, VersionInfoParcel versionInfoParcel, zzbir zzbirVar, zzeaf zzeafVar, zzdpz zzdpzVar, zzdqf zzdqfVar) {
        this.zzb = context;
        this.zza = zzcmsVar;
        this.zze = executor;
        this.zzc = zzdnfVar;
        this.zzd = zzfapVar;
        this.zzf = versionInfoParcel;
        this.zzg = zzbirVar;
        this.zzi = zzeafVar;
        this.zzj = zzdpzVar;
        this.zzk = zzdqfVar;
    }

    public static /* synthetic */ b6.a zzc(zzebr zzebrVar, final zzezu zzezuVar, zzfag zzfagVar, zzdnj zzdnjVar, Object obj) {
        final zzebr zzebrVar2;
        zzbbd zzbbdVar = zzbbm.zzcm;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue()) {
            zzebrVar.zzj.zza().putLong(zzdpn.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
        }
        final zzcdq zza = zzebrVar.zzc.zza(zzebrVar.zzd.zze, zzezuVar, zzfagVar.zzb.zzb);
        zza.zzac(zzezuVar.zzW);
        zzdnjVar.zza(zzebrVar.zzb, zza.zzF());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue()) {
            zzebrVar.zzj.zza().putLong(zzdpn.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
        }
        zzbyu zzbyuVar = new zzbyu();
        final zzcmp zza2 = zzebrVar.zza.zza(new zzcqb(zzfagVar, zzezuVar, null), new zzddg(new zzebt(zzebrVar.zzf, zzbyuVar, zzezuVar, zza, zzebrVar.zzd, zzebrVar.zzh, zzebrVar.zzg, zzebrVar.zzi, zzebrVar.zzk), zza), new zzcmq(zzezuVar.zzaa));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue()) {
            zzebrVar2 = zzebrVar;
            zzebrVar2.zzj.zza().putLong(zzdpn.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
        } else {
            zzebrVar2 = zzebrVar;
        }
        zza2.zzh().zzi(zza, false, zzebrVar2.zzh ? zzebrVar2.zzg : null, zzebrVar2.zzj.zza());
        zzbyuVar.zzc(zza2);
        zza2.zzc().zzo(new zzcuz() { // from class: com.google.android.gms.internal.ads.zzebp
            @Override // com.google.android.gms.internal.ads.zzcuz
            public final void zzr() {
                zzcdq zzcdqVar = zzcdq.this;
                if (zzcdqVar.zzN() != null) {
                    zzcdqVar.zzN().zzs();
                }
            }
        }, zzbyp.zzg);
        String str = zzezuVar.zzs.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfj)).booleanValue() && zza2.zzi().zze(true)) {
            str = zzcfb.zzb(str, zzcfb.zza(zzezuVar));
        }
        zza2.zzh();
        return zzgap.zzm(zzdne.zzj(zza, zzezuVar.zzs.zzb, str, zzebrVar2.zzj.zza()), new zzfsk(zzebrVar2) { // from class: com.google.android.gms.internal.ads.zzebq
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj2) {
                zzcdq zzcdqVar = zza;
                if (zzezuVar.zzM) {
                    zzcdqVar.zzah();
                }
                zzcmp zzcmpVar = zza2;
                zzcdqVar.zzab();
                zzcdqVar.onPause();
                return zzcmpVar.zza();
            }
        }, zzebrVar2.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    public final b6.a zza(final zzfag zzfagVar, final zzezu zzezuVar) {
        final zzdnj zzdnjVar = new zzdnj();
        b6.a zzn = zzgap.zzn(zzgap.zzh(null), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzebn
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzebr.zzc(zzebr.this, zzezuVar, zzfagVar, zzdnjVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebo
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

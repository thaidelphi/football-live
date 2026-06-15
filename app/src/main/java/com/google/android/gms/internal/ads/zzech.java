package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzech implements zzebg {
    private final zzcoi zza;
    private final Context zzb;
    private final zzdnf zzc;
    private final zzfap zzd;
    private final Executor zze;
    private final zzfsk zzf;
    private final zzdpz zzg;

    public zzech(zzcoi zzcoiVar, Context context, Executor executor, zzdnf zzdnfVar, zzfap zzfapVar, zzfsk zzfskVar, zzdpz zzdpzVar) {
        this.zzb = context;
        this.zza = zzcoiVar;
        this.zze = executor;
        this.zzc = zzdnfVar;
        this.zzd = zzfapVar;
        this.zzf = zzfskVar;
        this.zzg = zzdpzVar;
    }

    public static /* synthetic */ b6.a zzc(final zzech zzechVar, zzfag zzfagVar, zzezu zzezuVar, Object obj) {
        View zzdniVar;
        zzbbd zzbbdVar = zzbbm.zzcm;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue()) {
            zzechVar.zzg.zza().putLong(zzdpn.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
        }
        com.google.android.gms.ads.internal.client.zzr zza = zzfav.zza(zzechVar.zzb, zzezuVar.zzu);
        final zzcdq zza2 = zzechVar.zzc.zza(zza, zzezuVar, zzfagVar.zzb.zzb);
        zza2.zzac(zzezuVar.zzW);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhM)).booleanValue() && zzezuVar.zzag) {
            zzdniVar = zzcox.zza(zzechVar.zzb, zza2.zzF(), zzezuVar);
        } else {
            zzdniVar = new zzdni(zzechVar.zzb, zza2.zzF(), (com.google.android.gms.ads.internal.util.zzau) zzechVar.zzf.apply(zzezuVar));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue()) {
            zzechVar.zzg.zza().putLong(zzdpn.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
        }
        final zzcnf zza3 = zzechVar.zza.zza(new zzcqb(zzfagVar, zzezuVar, null), new zzcnl(zzdniVar, zza2, new zzcpj() { // from class: com.google.android.gms.internal.ads.zzecb
            @Override // com.google.android.gms.internal.ads.zzcpj
            public final com.google.android.gms.ads.internal.client.zzea zza() {
                return zzcdq.this.zzq();
            }
        }, zzfav.zzb(zza)));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue()) {
            zzechVar.zzg.zza().putLong(zzdpn.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzv.zzC().a());
        }
        zza3.zzh().zzi(zza2, false, null, zzechVar.zzg.zza());
        zzcux zzc = zza3.zzc();
        zzcuz zzcuzVar = new zzcuz() { // from class: com.google.android.gms.internal.ads.zzecc
            @Override // com.google.android.gms.internal.ads.zzcuz
            public final void zzr() {
                zzcdq zzcdqVar = zzcdq.this;
                if (zzcdqVar.zzN() != null) {
                    zzcdqVar.zzN().zzs();
                }
            }
        };
        zzgba zzgbaVar = zzbyp.zzg;
        zzc.zzo(zzcuzVar, zzgbaVar);
        String str = zzezuVar.zzs.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfj)).booleanValue() && zza3.zzi().zze(true)) {
            str = zzcfb.zzb(str, zzcfb.zza(zzezuVar));
        }
        zza3.zzh();
        b6.a zzj = zzdne.zzj(zza2, zzezuVar.zzs.zzb, str, zzechVar.zzg.zza());
        if (zzezuVar.zzM) {
            zzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecd
                @Override // java.lang.Runnable
                public final void run() {
                    zzcdq.this.zzah();
                }
            }, zzechVar.zze);
        }
        zzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzece
            @Override // java.lang.Runnable
            public final void run() {
                zzech.zzd(zzech.this, zza2);
            }
        }, zzechVar.zze);
        return zzgap.zzm(zzj, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzecf
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj2) {
                return zzcnf.this.zza();
            }
        }, zzgbaVar);
    }

    public static /* synthetic */ void zzd(zzech zzechVar, zzcdq zzcdqVar) {
        zzcdqVar.zzab();
        zzfap zzfapVar = zzechVar.zzd;
        zzces zzq = zzcdqVar.zzq();
        com.google.android.gms.ads.internal.client.zzfx zzfxVar = zzfapVar.zza;
        if (zzfxVar != null && zzq != null) {
            zzq.zzs(zzfxVar);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbr)).booleanValue() || zzcdqVar.isAttachedToWindow()) {
            return;
        }
        zzcdqVar.onPause();
        zzcdqVar.zzav(true);
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    public final b6.a zza(final zzfag zzfagVar, final zzezu zzezuVar) {
        return zzgap.zzn(zzgap.zzh(null), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzecg
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzech.zzc(zzech.this, zzfagVar, zzezuVar, obj);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    public final boolean zzb(zzfag zzfagVar, zzezu zzezuVar) {
        zzezz zzezzVar = zzezuVar.zzs;
        return (zzezzVar == null || zzezzVar.zza == null) ? false : true;
    }
}

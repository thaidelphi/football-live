package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdmj extends zzcpl {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdeo zze;
    private final zzdbi zzf;
    private final zzcus zzg;
    private final zzcvz zzh;
    private final zzcqg zzi;
    private final zzbvf zzj;
    private final zzfmb zzk;
    private final zzfai zzl;
    private boolean zzm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdmj(zzcpk zzcpkVar, Context context, zzcdq zzcdqVar, zzdeo zzdeoVar, zzdbi zzdbiVar, zzcus zzcusVar, zzcvz zzcvzVar, zzcqg zzcqgVar, zzezu zzezuVar, zzfmb zzfmbVar, zzfai zzfaiVar) {
        super(zzcpkVar);
        this.zzm = false;
        this.zzc = context;
        this.zze = zzdeoVar;
        this.zzd = new WeakReference(zzcdqVar);
        this.zzf = zzdbiVar;
        this.zzg = zzcusVar;
        this.zzh = zzcvzVar;
        this.zzi = zzcqgVar;
        this.zzk = zzfmbVar;
        zzbvb zzbvbVar = zzezuVar.zzl;
        this.zzj = new zzbvz(zzbvbVar != null ? zzbvbVar.zza : "", zzbvbVar != null ? zzbvbVar.zzb : 1);
        this.zzl = zzfaiVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcdq zzcdqVar = (zzcdq) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgB)).booleanValue()) {
                if (!this.zzm && zzcdqVar != null) {
                    zzbyp.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcdq.this.destroy();
                        }
                    });
                }
            } else if (zzcdqVar != null) {
                zzcdqVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzbvf zzc() {
        return this.zzj;
    }

    public final zzfai zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        zzcdq zzcdqVar = (zzcdq) this.zzd.get();
        return (zzcdqVar == null || zzcdqVar.zzaG()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzh(boolean z10, Activity activity) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaM)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            if (com.google.android.gms.ads.internal.util.zzs.zzH(this.zzc)) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                this.zzg.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaN)).booleanValue()) {
                    this.zzk.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzm) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("The rewarded ad have been showed.");
            this.zzg.zza(zzfbq.zzd(10, null, null));
            return false;
        }
        this.zzm = true;
        this.zzf.zzb();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zzc;
        }
        try {
            this.zze.zza(z10, activity2, this.zzg);
            this.zzf.zza();
            return true;
        } catch (zzden e8) {
            this.zzg.zzc(e8);
            return false;
        }
    }
}

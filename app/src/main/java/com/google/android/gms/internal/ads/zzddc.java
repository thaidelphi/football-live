package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzddc extends zzcpl {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdbi zze;
    private final zzdeo zzf;
    private final zzcqg zzg;
    private final zzfmb zzh;
    private final zzcus zzi;
    private final zzbyj zzj;
    private boolean zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzddc(zzcpk zzcpkVar, Context context, zzcdq zzcdqVar, zzdbi zzdbiVar, zzdeo zzdeoVar, zzcqg zzcqgVar, zzfmb zzfmbVar, zzcus zzcusVar, zzbyj zzbyjVar) {
        super(zzcpkVar);
        this.zzk = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcdqVar);
        this.zze = zzdbiVar;
        this.zzf = zzdeoVar;
        this.zzg = zzcqgVar;
        this.zzh = zzfmbVar;
        this.zzi = zzcusVar;
        this.zzj = zzbyjVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcdq zzcdqVar = (zzcdq) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgB)).booleanValue()) {
                if (!this.zzk && zzcdqVar != null) {
                    zzbyp.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzddb
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

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzc(boolean z10, Activity activity) {
        zzezu zzD;
        this.zze.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaM)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            if (com.google.android.gms.ads.internal.util.zzs.zzH(this.zzc)) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaN)).booleanValue()) {
                    this.zzh.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        zzcdq zzcdqVar = (zzcdq) this.zzd.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlO)).booleanValue() || zzcdqVar == null || (zzD = zzcdqVar.zzD()) == null || !zzD.zzar || zzD.zzas == this.zzj.zzb()) {
            if (this.zzk) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("The interstitial ad has been shown.");
                this.zzi.zza(zzfbq.zzd(10, null, null));
            }
            Activity activity2 = activity;
            if (!this.zzk) {
                if (activity == null) {
                    activity2 = this.zzc;
                }
                try {
                    this.zzf.zza(z10, activity2, this.zzi);
                    this.zze.zza();
                    this.zzk = true;
                    return true;
                } catch (zzden e8) {
                    this.zzi.zzc(e8);
                }
            }
        } else {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("The interstitial consent form has been shown.");
            this.zzi.zza(zzfbq.zzd(12, "The consent form has already been shown.", null));
        }
        return false;
    }
}

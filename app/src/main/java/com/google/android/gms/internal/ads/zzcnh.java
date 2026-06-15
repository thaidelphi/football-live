package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcnh extends zzcne {
    private final Context zzc;
    private final View zzd;
    private final zzcdq zze;
    private final zzezv zzf;
    private final zzcpj zzg;
    private final zzdhc zzh;
    private final zzdcg zzi;
    private final zzhde zzj;
    private final Executor zzk;
    private com.google.android.gms.ads.internal.client.zzr zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcnh(zzcpk zzcpkVar, Context context, zzezv zzezvVar, View view, zzcdq zzcdqVar, zzcpj zzcpjVar, zzdhc zzdhcVar, zzdcg zzdcgVar, zzhde zzhdeVar, Executor executor) {
        super(zzcpkVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcdqVar;
        this.zzf = zzezvVar;
        this.zzg = zzcpjVar;
        this.zzh = zzdhcVar;
        this.zzi = zzdcgVar;
        this.zzj = zzhdeVar;
        this.zzk = executor;
    }

    public static /* synthetic */ void zzj(zzcnh zzcnhVar) {
        zzbgj zze = zzcnhVar.zzh.zze();
        if (zze == null) {
            return;
        }
        try {
            zze.zze((com.google.android.gms.ads.internal.client.zzbx) zzcnhVar.zzj.zzb(), ObjectWrapper.u0(zzcnhVar.zzc));
        } catch (RemoteException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("RemoteException when notifyAdLoad is called", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcne
    public final int zza() {
        return this.zza.zzb.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcne
    public final int zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhM)).booleanValue() && this.zzb.zzag) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhN)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcne
    public final View zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcne
    public final com.google.android.gms.ads.internal.client.zzea zze() {
        try {
            return this.zzg.zza();
        } catch (zzfaw unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcne
    public final zzezv zzf() {
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zzl;
        if (zzrVar != null) {
            return zzfav.zzb(zzrVar);
        }
        zzezu zzezuVar = this.zzb;
        if (zzezuVar.zzac) {
            for (String str : zzezuVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.zzd;
            return new zzezv(view.getWidth(), view.getHeight(), false);
        }
        return (zzezv) this.zzb.zzr.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcne
    public final zzezv zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcne
    public final void zzh() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcne
    public final void zzi(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzcdq zzcdqVar;
        if (viewGroup == null || (zzcdqVar = this.zze) == null) {
            return;
        }
        zzcdqVar.zzaj(zzcfk.zzc(zzrVar));
        viewGroup.setMinimumHeight(zzrVar.zzc);
        viewGroup.setMinimumWidth(zzrVar.zzf);
        this.zzl = zzrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcpl
    public final void zzk() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcng
            @Override // java.lang.Runnable
            public final void run() {
                zzcnh.zzj(zzcnh.this);
            }
        });
        super.zzk();
    }
}

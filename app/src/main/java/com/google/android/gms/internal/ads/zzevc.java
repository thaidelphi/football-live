package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class zzevc implements zzeji {
    protected final zzcfq zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzevs zzd;
    private final zzexl zze;
    private final VersionInfoParcel zzf;
    private final ViewGroup zzg;
    private final zzffq zzh;
    private final zzfan zzi;
    private b6.a zzj;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzevc(Context context, Executor executor, zzcfq zzcfqVar, zzexl zzexlVar, zzevs zzevsVar, zzfan zzfanVar, VersionInfoParcel versionInfoParcel) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcfqVar;
        this.zze = zzexlVar;
        this.zzd = zzevsVar;
        this.zzi = zzfanVar;
        this.zzf = versionInfoParcel;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcfqVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzctk zzm(zzexj zzexjVar) {
        zzeva zzevaVar = (zzeva) zzexjVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzid)).booleanValue()) {
            zzcnb zzcnbVar = new zzcnb(this.zzg);
            zzctm zzctmVar = new zzctm();
            zzctmVar.zzf(this.zzb);
            zzctmVar.zzk(zzevaVar.zza);
            zzcto zzl = zzctmVar.zzl();
            zzczw zzczwVar = new zzczw();
            zzczwVar.zzc(this.zzd, this.zzc);
            zzczwVar.zzl(this.zzd, this.zzc);
            return zze(zzcnbVar, zzl, zzczwVar.zzn());
        }
        zzevs zzi = zzevs.zzi(this.zzd);
        zzczw zzczwVar2 = new zzczw();
        zzczwVar2.zzb(zzi, this.zzc);
        zzczwVar2.zzg(zzi, this.zzc);
        zzczwVar2.zzh(zzi, this.zzc);
        zzczwVar2.zzi(zzi, this.zzc);
        zzczwVar2.zzc(zzi, this.zzc);
        zzczwVar2.zzl(zzi, this.zzc);
        zzczwVar2.zzm(zzi);
        zzcnb zzcnbVar2 = new zzcnb(this.zzg);
        zzctm zzctmVar2 = new zzctm();
        zzctmVar2.zzf(this.zzb);
        zzctmVar2.zzk(zzevaVar.zza);
        return zze(zzcnbVar2, zzctmVar2.zzl(), zzczwVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzeji
    public final boolean zza() {
        b6.a aVar = this.zzj;
        return (aVar == null || aVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeji
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzejg zzejgVar, zzejh zzejhVar) throws RemoteException {
        zzffn zzffnVar;
        zzcmo zzcmoVar;
        if (!zzmVar.zzb()) {
            boolean z10 = ((Boolean) zzbdk.zzd.zze()).booleanValue() && ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzld)).booleanValue();
            if (this.zzf.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzle)).intValue() || !z10) {
                Preconditions.f("loadAd must be called on the main UI thread.");
            }
        }
        if (str == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Ad unit ID should not be null for app open ad.");
            this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeuw
                @Override // java.lang.Runnable
                public final void run() {
                    zzevc.this.zzd.zzdz(zzfbq.zzd(6, null, null));
                }
            });
            return false;
        } else if (this.zzj != null) {
            return false;
        } else {
            if (!((Boolean) zzbdf.zzc.zze()).booleanValue() || (zzcmoVar = (zzcmo) this.zze.zzd()) == null) {
                zzffnVar = null;
            } else {
                zzffn zzh = zzcmoVar.zzh();
                zzh.zzi(7);
                zzh.zzb(zzmVar.zzp);
                zzh.zzf(zzmVar.zzm);
                zzffnVar = zzh;
            }
            zzfbm.zza(this.zzb, zzmVar.zzf);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziQ)).booleanValue() && zzmVar.zzf) {
                this.zza.zzl().zzo(true);
            }
            Bundle zza = zzdpp.zza(new Pair(zzdpn.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdpn.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().a())));
            zzfan zzfanVar = this.zzi;
            zzfanVar.zzt(str);
            zzfanVar.zzs(com.google.android.gms.ads.internal.client.zzr.zzb());
            zzfanVar.zzH(zzmVar);
            zzfanVar.zzA(zza);
            Context context = this.zzb;
            zzfap zzJ = zzfanVar.zzJ();
            zzffc zzb = zzffb.zzb(context, zzffm.zzf(zzJ), 7, zzmVar);
            zzeva zzevaVar = new zzeva(null);
            zzevaVar.zza = zzJ;
            b6.a zzc = this.zze.zzc(new zzexm(zzevaVar, null), new zzexk() { // from class: com.google.android.gms.internal.ads.zzeux
                @Override // com.google.android.gms.internal.ads.zzexk
                public final zzctk zza(zzexj zzexjVar) {
                    zzctk zzm;
                    zzm = zzevc.this.zzm(zzexjVar);
                    return zzm;
                }
            }, null);
            this.zzj = zzc;
            zzgap.zzr(zzc, new zzeuz(this, zzejhVar, zzffnVar, zzb, zzevaVar), this.zzc);
            return true;
        }
    }

    protected abstract zzctk zze(zzcnb zzcnbVar, zzcto zzctoVar, zzczy zzczyVar);

    public final void zzl(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.zzi.zzu(zzxVar);
    }
}

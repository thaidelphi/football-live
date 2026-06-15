package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzewg implements zzeji {
    private final Context zza;
    private final Executor zzb;
    private final zzcfq zzc;
    private final zzeis zzd;
    private final zzeiw zze;
    private final ViewGroup zzf;
    private zzbch zzg;
    private final zzcwx zzh;
    private final zzffq zzi;
    private final zzczd zzj;
    private final zzfan zzk;
    private b6.a zzl;
    private boolean zzm;
    private com.google.android.gms.ads.internal.client.zze zzn;
    private zzejh zzo;

    public zzewg(Context context, Executor executor, com.google.android.gms.ads.internal.client.zzr zzrVar, zzcfq zzcfqVar, zzeis zzeisVar, zzeiw zzeiwVar, zzfan zzfanVar, zzczd zzczdVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcfqVar;
        this.zzd = zzeisVar;
        this.zze = zzeiwVar;
        this.zzk = zzfanVar;
        this.zzh = zzcfqVar.zzf();
        this.zzi = zzcfqVar.zzz();
        this.zzf = new FrameLayout(context);
        this.zzj = zzczdVar;
        zzfanVar.zzs(zzrVar);
        this.zzm = true;
        this.zzn = null;
        this.zzo = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzt() {
        this.zzl = null;
        final com.google.android.gms.ads.internal.client.zze zzeVar = this.zzn;
        this.zzn = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzic)).booleanValue() && zzeVar != null) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewc
                @Override // java.lang.Runnable
                public final void run() {
                    zzewg.this.zzd.zzdz(zzeVar);
                }
            });
        }
        zzejh zzejhVar = this.zzo;
        if (zzejhVar != null) {
            zzejhVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeji
    public final boolean zza() {
        b6.a aVar = this.zzl;
        return (aVar == null || aVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeji
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzejg zzejgVar, zzejh zzejhVar) throws RemoteException {
        zzcoi zzk;
        if (str == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewe
                @Override // java.lang.Runnable
                public final void run() {
                    zzewg.this.zzd.zzdz(zzfbq.zzd(6, null, null));
                }
            });
            return false;
        }
        if (!zza()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziQ)).booleanValue() && zzmVar.zzf) {
                this.zzc.zzl().zzo(true);
            }
            Bundle zza = zzdpp.zza(new Pair(zzdpn.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdpn.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().a())));
            zzfan zzfanVar = this.zzk;
            zzfanVar.zzt(str);
            zzfanVar.zzH(zzmVar);
            zzfanVar.zzA(zza);
            Context context = this.zza;
            zzfap zzJ = zzfanVar.zzJ();
            zzffc zzb = zzffb.zzb(context, zzffm.zzf(zzJ), 3, zzmVar);
            zzffn zzffnVar = null;
            if (!((Boolean) zzbds.zzd.zze()).booleanValue() || !this.zzk.zzh().zzk) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzic)).booleanValue()) {
                    zzcoh zze = this.zzc.zze();
                    zzctm zzctmVar = new zzctm();
                    zzctmVar.zzf(this.zza);
                    zzctmVar.zzk(zzJ);
                    zze.zzi(zzctmVar.zzl());
                    zzczw zzczwVar = new zzczw();
                    zzczwVar.zzj(this.zzd, this.zzb);
                    zzczwVar.zzk(this.zzd, this.zzb);
                    zze.zzf(zzczwVar.zzn());
                    zze.zze(new zzehb(this.zzg));
                    zze.zzd(new zzdex(zzdhc.zza, null));
                    zze.zzg(new zzcpd(this.zzh, this.zzj));
                    zze.zzc(new zzcnb(this.zzf));
                    zzk = zze.zzk();
                } else {
                    zzcoh zze2 = this.zzc.zze();
                    zzctm zzctmVar2 = new zzctm();
                    zzctmVar2.zzf(this.zza);
                    zzctmVar2.zzk(zzJ);
                    zze2.zzi(zzctmVar2.zzl());
                    zzczw zzczwVar2 = new zzczw();
                    zzczwVar2.zzj(this.zzd, this.zzb);
                    zzczwVar2.zza(this.zzd, this.zzb);
                    zzczwVar2.zza(this.zze, this.zzb);
                    zzczwVar2.zzl(this.zzd, this.zzb);
                    zzczwVar2.zzd(this.zzd, this.zzb);
                    zzczwVar2.zze(this.zzd, this.zzb);
                    zzczwVar2.zzf(this.zzd, this.zzb);
                    zzczwVar2.zzb(this.zzd, this.zzb);
                    zzczwVar2.zzk(this.zzd, this.zzb);
                    zzczwVar2.zzi(this.zzd, this.zzb);
                    zze2.zzf(zzczwVar2.zzn());
                    zze2.zze(new zzehb(this.zzg));
                    zze2.zzd(new zzdex(zzdhc.zza, null));
                    zze2.zzg(new zzcpd(this.zzh, this.zzj));
                    zze2.zzc(new zzcnb(this.zzf));
                    zzk = zze2.zzk();
                }
                if (((Boolean) zzbdf.zzc.zze()).booleanValue()) {
                    zzffnVar = zzk.zzi();
                    zzffnVar.zzi(3);
                    zzffnVar.zzb(zzmVar.zzp);
                    zzffnVar.zzf(zzmVar.zzm);
                }
                this.zzo = zzejhVar;
                zzcqp zzc = zzk.zzc();
                b6.a zzh = zzc.zzh(zzc.zzi());
                this.zzl = zzh;
                zzgap.zzr(zzh, new zzewf(this, zzffnVar, zzb, zzk), this.zzb);
                return true;
            }
            zzeis zzeisVar = this.zzd;
            if (zzeisVar != null) {
                zzeisVar.zzdz(zzfbq.zzd(7, null, null));
            }
        } else if (!this.zzk.zzS()) {
            this.zzm = true;
        }
        return false;
    }

    public final ViewGroup zzc() {
        return this.zzf;
    }

    public final zzfan zzf() {
        return this.zzk;
    }

    public final void zzl() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzm() {
        this.zzh.zze(this.zzj.zzd());
    }

    public final void zzn(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zze.zza(zzbhVar);
    }

    public final void zzo(zzcwr zzcwrVar) {
        this.zzh.zzo(zzcwrVar, this.zzb);
    }

    public final void zzp(zzbch zzbchVar) {
        this.zzg = zzbchVar;
    }

    public final void zzq() {
        synchronized (this) {
            b6.a aVar = this.zzl;
            if (aVar != null && aVar.isDone()) {
                try {
                    zzcne zzcneVar = (zzcne) this.zzl.get();
                    this.zzl = null;
                    this.zzf.removeAllViews();
                    zzcneVar.zzd();
                    ViewParent parent = zzcneVar.zzd().getParent();
                    if (parent instanceof ViewGroup) {
                        String str = "Banner view provided from " + (zzcneVar.zzl() != null ? zzcneVar.zzl().zzg() : "") + " already has a parent view. Removing its old parent.";
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj(str);
                        ((ViewGroup) parent).removeView(zzcneVar.zzd());
                    }
                    zzbbd zzbbdVar = zzbbm.zzic;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue()) {
                        zzcyl zzn = zzcneVar.zzn();
                        zzn.zza(this.zzd);
                        zzn.zzc(this.zze);
                    }
                    this.zzf.addView(zzcneVar.zzd());
                    zzejh zzejhVar = this.zzo;
                    if (zzejhVar != null) {
                        zzejhVar.zzb(zzcneVar);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).booleanValue()) {
                        Executor executor = this.zzb;
                        final zzeis zzeisVar = this.zzd;
                        Objects.requireNonNull(zzeisVar);
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewd
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzeis.this.zzs();
                            }
                        });
                    }
                    if (zzcneVar.zza() >= 0) {
                        this.zzm = false;
                        this.zzh.zzd(zzcneVar.zza());
                        this.zzh.zze(zzcneVar.zzc());
                    } else {
                        this.zzm = true;
                        this.zzh.zzd(zzcneVar.zzc());
                    }
                } catch (InterruptedException | ExecutionException e8) {
                    zzt();
                    com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e8);
                    this.zzm = true;
                    this.zzh.zza();
                }
            } else if (this.zzl != null) {
                com.google.android.gms.ads.internal.util.zze.zza("Show timer went off but there is an ongoing ad request.");
                this.zzm = true;
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                this.zzm = true;
                this.zzh.zza();
            }
        }
    }

    public final boolean zzs() {
        ViewParent parent = this.zzf.getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            com.google.android.gms.ads.internal.zzv.zzq();
            return com.google.android.gms.ads.internal.util.zzs.zzW(view, view.getContext());
        }
        return false;
    }
}

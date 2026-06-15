package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzclo implements zzcuf, zzcvt, zzcuz, com.google.android.gms.ads.internal.client.zza, zzcuv, zzdbv {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzfag zze;
    private final zzezu zzf;
    private final zzfhk zzg;
    private final zzfbb zzh;
    private final zzauc zzi;
    private final zzbct zzj;
    private final WeakReference zzk;
    private final WeakReference zzl;
    private final zzctf zzm;
    private boolean zzn;
    private final AtomicBoolean zzo = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzclo(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfag zzfagVar, zzezu zzezuVar, zzfhk zzfhkVar, zzfbb zzfbbVar, View view, zzcdq zzcdqVar, zzauc zzaucVar, zzbct zzbctVar, zzbcv zzbcvVar, zzffn zzffnVar, zzctf zzctfVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfagVar;
        this.zzf = zzezuVar;
        this.zzg = zzfhkVar;
        this.zzh = zzfbbVar;
        this.zzi = zzaucVar;
        this.zzk = new WeakReference(view);
        this.zzl = new WeakReference(zzcdqVar);
        this.zzj = zzbctVar;
        this.zzm = zzctfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List zzu() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlo)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            if (com.google.android.gms.ads.internal.util.zzs.zzC(this.zza)) {
                com.google.android.gms.ads.internal.zzv.zzq();
                Integer zzt = com.google.android.gms.ads.internal.util.zzs.zzt(this.zza);
                if (zzt != null) {
                    Integer valueOf = Integer.valueOf(Math.min(zzt.intValue(), 20));
                    ArrayList arrayList = new ArrayList();
                    for (String str : this.zzf.zzd) {
                        arrayList.add(Uri.parse(str).buildUpon().appendQueryParameter("dspct", Integer.toString(valueOf.intValue())).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.zzf.zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv() {
        String str;
        int i10;
        List list = this.zzf.zzd;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdF)).booleanValue()) {
            str = this.zzi.zzc().zzh(this.zza, (View) this.zzk.get(), null);
        } else {
            str = null;
        }
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaB)).booleanValue() && this.zze.zzb.zzb.zzh) || !((Boolean) zzbdl.zzh.zze()).booleanValue()) {
            this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, false, str, null, zzu()));
            return;
        }
        if (((Boolean) zzbdl.zzg.zze()).booleanValue() && ((i10 = this.zzf.zzb) == 1 || i10 == 2 || i10 == 5)) {
            zzcdq zzcdqVar = (zzcdq) this.zzl.get();
        }
        zzgap.zzr((zzgag) zzgap.zzo(zzgag.zzu(zzgap.zzh(null)), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbe)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcln(this, str), this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzw(final int i10, final int i11) {
        View view;
        if (i10 > 0 && ((view = (View) this.zzk.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclk
                @Override // java.lang.Runnable
                public final void run() {
                    r0.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcll
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzclo.this.zzw(r2 - 1, r3);
                        }
                    });
                }
            }, i11, TimeUnit.MILLISECONDS);
        } else {
            zzv();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if ((!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaB)).booleanValue() || !this.zze.zzb.zzb.zzh) && ((Boolean) zzbdl.zzd.zze()).booleanValue()) {
            zzgap.zzr((zzgag) zzgap.zze(zzgag.zzu(this.zzj.zza()), Throwable.class, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzcli
                @Override // com.google.android.gms.internal.ads.zzfsk
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    return "failure_click_attok";
                }
            }, zzbyp.zzg), new zzclm(this), this.zzb);
            return;
        }
        zzfbb zzfbbVar = this.zzh;
        zzfhk zzfhkVar = this.zzg;
        zzfag zzfagVar = this.zze;
        zzezu zzezuVar = this.zzf;
        zzfbbVar.zzc(zzfhkVar.zzc(zzfagVar, zzezuVar, zzezuVar.zzc), true == com.google.android.gms.ads.internal.zzv.zzp().zzA(this.zza) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzdq(zzbup zzbupVar, String str, String str2) {
        zzfbb zzfbbVar = this.zzh;
        zzfhk zzfhkVar = this.zzg;
        zzezu zzezuVar = this.zzf;
        zzfbbVar.zza(zzfhkVar.zze(zzezuVar, zzezuVar.zzh, zzbupVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zze() {
        zzfbb zzfbbVar = this.zzh;
        zzfhk zzfhkVar = this.zzg;
        zzfag zzfagVar = this.zze;
        zzezu zzezuVar = this.zzf;
        zzfbbVar.zza(zzfhkVar.zzc(zzfagVar, zzezuVar, zzezuVar.zzi));
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzf() {
        zzfbb zzfbbVar = this.zzh;
        zzfhk zzfhkVar = this.zzg;
        zzfag zzfagVar = this.zze;
        zzezu zzezuVar = this.zzf;
        zzfbbVar.zza(zzfhkVar.zzc(zzfagVar, zzezuVar, zzezuVar.zzg));
    }

    @Override // com.google.android.gms.internal.ads.zzcuv
    public final void zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbD)).booleanValue()) {
            this.zzh.zza(this.zzg.zzc(this.zze, this.zzf, zzfhk.zzf(2, zzeVar.zza, this.zzf.zzo)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final void zzr() {
        if (this.zzo.compareAndSet(false, true)) {
            int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdO)).intValue();
            if (intValue > 0) {
                zzw(intValue, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdP)).intValue());
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdN)).booleanValue()) {
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclh
                    @Override // java.lang.Runnable
                    public final void run() {
                        r0.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclj
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzclo.this.zzv();
                            }
                        });
                    }
                });
            } else {
                zzv();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final synchronized void zzs() {
        zzctf zzctfVar;
        if (this.zzn) {
            ArrayList arrayList = new ArrayList(zzu());
            arrayList.addAll(this.zzf.zzf);
            this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, true, null, null, arrayList));
        } else {
            zzfbb zzfbbVar = this.zzh;
            zzfhk zzfhkVar = this.zzg;
            zzfag zzfagVar = this.zze;
            zzezu zzezuVar = this.zzf;
            zzfbbVar.zza(zzfhkVar.zzc(zzfagVar, zzezuVar, zzezuVar.zzm));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdK)).booleanValue() && (zzctfVar = this.zzm) != null) {
                List zzh = zzfhk.zzh(zzfhk.zzg(zzctfVar.zzb().zzm, zzctfVar.zza().zzg()), this.zzm.zza().zza());
                zzfbb zzfbbVar2 = this.zzh;
                zzfhk zzfhkVar2 = this.zzg;
                zzctf zzctfVar2 = this.zzm;
                zzfbbVar2.zza(zzfhkVar2.zzc(zzctfVar2.zzc(), zzctfVar2.zzb(), zzh));
            }
            zzfbb zzfbbVar3 = this.zzh;
            zzfhk zzfhkVar3 = this.zzg;
            zzfag zzfagVar2 = this.zze;
            zzezu zzezuVar2 = this.zzf;
            zzfbbVar3.zza(zzfhkVar3.zzc(zzfagVar2, zzezuVar2, zzezuVar2.zzf));
        }
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzt() {
        zzfbb zzfbbVar = this.zzh;
        zzfhk zzfhkVar = this.zzg;
        zzfag zzfagVar = this.zze;
        zzezu zzezuVar = this.zzf;
        zzfbbVar.zza(zzfhkVar.zzc(zzfagVar, zzezuVar, zzezuVar.zzau));
    }
}

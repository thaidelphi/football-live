package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzatu implements zzatx {
    private static zzatu zzb;
    private final Context zzc;
    private final zzfnd zzd;
    private final zzfnk zze;
    private final zzfnm zzf;
    private final zzauz zzg;
    private final zzflq zzh;
    private final Executor zzi;
    private final zzfnj zzj;
    private final zzavo zzl;
    private final zzavg zzm;
    private final zzaux zzn;
    private volatile boolean zzp;
    private volatile boolean zzq;
    private final int zzr;
    volatile long zza = 0;
    private final Object zzo = new Object();
    private final CountDownLatch zzk = new CountDownLatch(1);

    zzatu(Context context, zzflq zzflqVar, zzfnd zzfndVar, zzfnk zzfnkVar, zzfnm zzfnmVar, zzauz zzauzVar, Executor executor, zzfll zzfllVar, int i10, zzavo zzavoVar, zzavg zzavgVar, zzaux zzauxVar) {
        this.zzq = false;
        this.zzc = context;
        this.zzh = zzflqVar;
        this.zzd = zzfndVar;
        this.zze = zzfnkVar;
        this.zzf = zzfnmVar;
        this.zzg = zzauzVar;
        this.zzi = executor;
        this.zzr = i10;
        this.zzl = zzavoVar;
        this.zzm = zzavgVar;
        this.zzn = zzauxVar;
        this.zzq = false;
        this.zzj = new zzats(this, zzfllVar);
    }

    public static synchronized zzatu zza(Context context, zzaqj zzaqjVar, boolean z10) {
        zzatu zzs;
        synchronized (zzatu.class) {
            zzflr zzc = zzfls.zzc();
            zzc.zza(zzaqjVar.zzf());
            zzc.zzg(zzaqjVar.zzi());
            zzs = zzs(context, Executors.newCachedThreadPool(), zzc.zzh(), z10);
        }
        return zzs;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
        if (r4.zzc().zzj().equals(r5.zzj()) != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzatu r12) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzatu.zzj(com.google.android.gms.internal.ads.zzatu):void");
    }

    private static synchronized zzatu zzs(Context context, Executor executor, zzfls zzflsVar, boolean z10) {
        zzatu zzatuVar;
        zzfls zzflsVar2;
        zzaux zzauxVar;
        synchronized (zzatu.class) {
            if (zzb == null) {
                zzflq zza = zzflq.zza(context, executor, z10);
                zzaui zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdx)).booleanValue() ? zzaui.zzc(context) : null;
                zzavo zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzdy)).booleanValue() ? zzavo.zzd(context, executor) : null;
                zzavg zzavgVar = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcM)).booleanValue() ? new zzavg() : null;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcU)).booleanValue()) {
                    zzauxVar = new zzaux();
                    zzflsVar2 = zzflsVar;
                } else {
                    zzflsVar2 = zzflsVar;
                    zzauxVar = null;
                }
                zzfmh zzc2 = zzfmh.zzc(context, executor, zza, zzflsVar2);
                zzauy zzauyVar = new zzauy(context);
                zzauz zzauzVar = new zzauz(zzflsVar, zzc2, new zzavm(context, zzauyVar), zzauyVar, zzc, zzd, zzavgVar, zzauxVar);
                int zzb2 = zzfmq.zzb(context, zza);
                zzfll zzfllVar = new zzfll();
                zzatu zzatuVar2 = new zzatu(context, zza, new zzfnd(context, zzb2), new zzfnk(context, zzb2, new zzatr(zza), ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcw)).booleanValue()), new zzfnm(context, zzauzVar, zza, zzfllVar), zzauzVar, executor, zzfllVar, zzb2, zzd, zzavgVar, zzauxVar);
                zzb = zzatuVar2;
                zzatuVar2.zzm();
                zzb.zzp();
            }
            zzatuVar = zzb;
        }
        return zzatuVar;
    }

    private final void zzt() {
        zzavo zzavoVar = this.zzl;
        if (zzavoVar != null) {
            zzavoVar.zzh();
        }
    }

    private final zzfnc zzu(int i10) {
        if (zzfmq.zza(this.zzr)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcu)).booleanValue()) {
                return this.zze.zzc(1);
            }
            return this.zzd.zzc(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzatx
    public final String zzd(Context context, String str, View view) {
        return zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzatx
    public final String zze(Context context, String str, View view, Activity activity) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcM)).booleanValue()) {
            this.zzm.zzi();
        }
        zzp();
        zzflt zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zza2 = zza.zza(context, null, str, view, activity);
            this.zzh.zzf(5000, System.currentTimeMillis() - currentTimeMillis, zza2, null);
            return zza2;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzatx
    public final String zzf(Context context) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcM)).booleanValue()) {
            this.zzm.zzj();
        }
        zzp();
        zzflt zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzc = zza.zzc(context, null);
            this.zzh.zzf(IronSourceConstants.errorCode_biddingDataException, System.currentTimeMillis() - currentTimeMillis, zzc, null);
            return zzc;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzatx
    public final String zzg(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzatx
    public final String zzh(Context context, View view, Activity activity) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzcM)).booleanValue()) {
            this.zzm.zzk(context, view);
        }
        zzp();
        zzflt zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzb2 = zza.zzb(context, null, view, activity);
            this.zzh.zzf(IronSourceConstants.errorCode_isReadyException, System.currentTimeMillis() - currentTimeMillis, zzb2, null);
            return zzb2;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzatx
    public final void zzk(MotionEvent motionEvent) {
        zzflt zza = this.zzf.zza();
        if (zza != null) {
            try {
                zza.zzd(null, motionEvent);
            } catch (zzfnl e8) {
                this.zzh.zzc(e8.zza(), -1L, e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatx
    public final void zzl(int i10, int i11, int i12) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlS)).booleanValue() || (displayMetrics = this.zzc.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f10 = i10;
        float f11 = displayMetrics.density;
        float f12 = i11;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, f10 * f11, f12 * f11, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(obtain);
        obtain.recycle();
        float f13 = displayMetrics.density;
        MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 2, f10 * f13, f12 * f13, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(obtain2);
        obtain2.recycle();
        float f14 = displayMetrics.density;
        MotionEvent obtain3 = MotionEvent.obtain(0L, i12, 1, f10 * f14, f12 * f14, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(obtain3);
        obtain3.recycle();
    }

    final synchronized void zzm() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfnc zzu = zzu(1);
        if (zzu != null) {
            if (this.zzf.zzc(zzu)) {
                this.zzq = true;
                this.zzk.countDown();
                return;
            }
            return;
        }
        this.zzh.zzd(4013, System.currentTimeMillis() - currentTimeMillis);
    }

    @Override // com.google.android.gms.internal.ads.zzatx
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzaux zzauxVar = this.zzn;
        if (zzauxVar != null) {
            zzauxVar.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatx
    public final void zzo(View view) {
        this.zzg.zzd(view);
    }

    public final void zzp() {
        if (this.zzp) {
            return;
        }
        synchronized (this.zzo) {
            if (!this.zzp) {
                if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                    return;
                }
                zzfnc zzb2 = this.zzf.zzb();
                if ((zzb2 == null || zzb2.zzd(3600L)) && zzfmq.zza(this.zzr)) {
                    this.zzi.execute(new zzatt(this));
                }
            }
        }
    }

    public final synchronized boolean zzr() {
        return this.zzq;
    }
}

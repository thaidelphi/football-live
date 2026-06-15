package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbmr {
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;
    private final zzffq zze;
    private final com.google.android.gms.ads.internal.util.zzbd zzf;
    private final com.google.android.gms.ads.internal.util.zzbd zzg;
    private zzbmq zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbmr(Context context, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.util.zzbd zzbdVar, com.google.android.gms.ads.internal.util.zzbd zzbdVar2, zzffq zzffqVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = versionInfoParcel;
        this.zze = zzffqVar;
        this.zzf = zzbdVar;
        this.zzg = zzbdVar2;
    }

    public static /* synthetic */ void zzg(zzbmr zzbmrVar, zzblm zzblmVar) {
        if (zzblmVar.zzi()) {
            zzbmrVar.zzi = 1;
        }
    }

    public static /* synthetic */ void zzh(zzbmr zzbmrVar, zzauc zzaucVar, zzbmq zzbmqVar) {
        long a10 = com.google.android.gms.ads.internal.zzv.zzC().a();
        ArrayList arrayList = new ArrayList();
        try {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before createJavascriptEngine");
            zzblu zzbluVar = new zzblu(zzbmrVar.zzb, zzbmrVar.zzd, null, null);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After createJavascriptEngine");
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbluVar.zzk(new zzblx(zzbmrVar, arrayList, a10, zzbmqVar, zzbluVar));
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbluVar.zzq("/jsLoaded", new zzbmc(zzbmrVar, a10, zzbmqVar, zzbluVar));
            com.google.android.gms.ads.internal.util.zzby zzbyVar = new com.google.android.gms.ads.internal.util.zzby();
            zzbmd zzbmdVar = new zzbmd(zzbmrVar, null, zzbluVar, zzbyVar);
            zzbyVar.zzb(zzbmdVar);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            zzbluVar.zzq("/requestReload", zzbmdVar);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(zzbmrVar.zzc)));
            if (zzbmrVar.zzc.endsWith(".js")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbluVar.zzh(zzbmrVar.zzc);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (zzbmrVar.zzc.startsWith("<html>")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbluVar.zzf(zzbmrVar.zzc);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbluVar.zzg(zzbmrVar.zzc);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new zzbmf(zzbmrVar, zzbmqVar, zzbluVar, arrayList, a10), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzc)).intValue());
        } catch (Throwable th) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error creating webview.", th);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhE)).booleanValue()) {
                zzbmqVar.zzh(th, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhG)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbmqVar.zzg();
                return;
            }
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzbmqVar.zzg();
        }
    }

    public static /* synthetic */ void zzi(zzbmr zzbmrVar, zzbmq zzbmqVar, final zzblm zzblmVar, ArrayList arrayList, long j10) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (zzbmrVar.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
            if (zzbmqVar.zze() != -1 && zzbmqVar.zze() != 1) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhE)).booleanValue()) {
                    zzbmqVar.zzh(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                } else {
                    zzbmqVar.zzg();
                }
                zzgba zzgbaVar = zzbyp.zzf;
                Objects.requireNonNull(zzblmVar);
                zzgbaVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzblw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzblm.this.zzc();
                    }
                });
                String valueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzb));
                int zze = zzbmqVar.zze();
                int i10 = zzbmrVar.zzi;
                String valueOf2 = String.valueOf(arrayList.get(0));
                long a10 = com.google.android.gms.ads.internal.zzv.zzC().a() - j10;
                com.google.android.gms.ads.internal.util.zze.zza("Could not receive /jsLoaded in " + valueOf + " ms. JS engine session reference status(onEngLoadedTimeout) is " + zze + ". Update status(onEngLoadedTimeout) is " + i10 + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + valueOf2 + " ms. Total latency(onEngLoadedTimeout) is " + a10 + " ms. Rejecting.");
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
        }
    }

    public final zzbml zzb(zzauc zzaucVar) {
        com.google.android.gms.ads.internal.util.zze.zza("getEngine: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("getEngine: Lock acquired");
            com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Trying to acquire lock");
            synchronized (this.zza) {
                com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock acquired");
                zzbmq zzbmqVar = this.zzh;
                if (zzbmqVar != null && this.zzi == 0) {
                    zzbmqVar.zzj(new zzbyy() { // from class: com.google.android.gms.internal.ads.zzblz
                        @Override // com.google.android.gms.internal.ads.zzbyy
                        public final void zza(Object obj) {
                            zzbmr.zzg(zzbmr.this, (zzblm) obj);
                        }
                    }, new zzbyw() { // from class: com.google.android.gms.internal.ads.zzbma
                        @Override // com.google.android.gms.internal.ads.zzbyw
                        public final void zza() {
                        }
                    });
                }
            }
            com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock released");
            zzbmq zzbmqVar2 = this.zzh;
            if (zzbmqVar2 != null && zzbmqVar2.zze() != -1) {
                int i10 = this.zzi;
                if (i10 == 0) {
                    com.google.android.gms.ads.internal.util.zze.zza("getEngine (NO_UPDATE): Lock released");
                    return this.zzh.zza();
                } else if (i10 == 1) {
                    this.zzi = 2;
                    zzd(null);
                    com.google.android.gms.ads.internal.util.zze.zza("getEngine (PENDING_UPDATE): Lock released");
                    return this.zzh.zza();
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("getEngine (UPDATING): Lock released");
                    return this.zzh.zza();
                }
            }
            this.zzi = 2;
            this.zzh = zzd(null);
            com.google.android.gms.ads.internal.util.zze.zza("getEngine (NULL or REJECTED): Lock released");
            return this.zzh.zza();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzbmq zzd(zzauc zzaucVar) {
        zzffc zza = zzffb.zza(this.zzb, 6);
        zza.zzi();
        final zzbmq zzbmqVar = new zzbmq(this.zzg);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        zzbyp.zzf.execute(new Runnable(null, zzbmqVar) { // from class: com.google.android.gms.internal.ads.zzbmb
            public final /* synthetic */ zzbmq zzb;

            {
                this.zzb = zzbmqVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbmr.zzh(zzbmr.this, null, this.zzb);
            }
        });
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine: Promise created");
        zzbmqVar.zzj(new zzbmg(this, zzbmqVar, zza), new zzbmh(this, zzbmqVar, zza));
        return zzbmqVar;
    }
}

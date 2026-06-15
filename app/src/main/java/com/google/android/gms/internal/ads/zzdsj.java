package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdsj {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdnv zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdqq zzl;
    private final VersionInfoParcel zzm;
    private final zzdbd zzo;
    private final zzffq zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzbyu zze = new zzbyu();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzv.zzC().b();

    public zzdsj(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdnv zzdnvVar, ScheduledExecutorService scheduledExecutorService, zzdqq zzdqqVar, VersionInfoParcel versionInfoParcel, zzdbd zzdbdVar, zzffq zzffqVar) {
        this.zzh = zzdnvVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdqqVar;
        this.zzm = versionInfoParcel;
        this.zzo = zzdbdVar;
        this.zzp = zzffqVar;
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    public static /* synthetic */ Object zzf(zzdsj zzdsjVar, zzffc zzffcVar) {
        zzdsjVar.zze.zzc(Boolean.TRUE);
        zzffcVar.zzg(true);
        zzdsjVar.zzp.zzc(zzffcVar.zzm());
        return null;
    }

    public static /* synthetic */ void zzi(zzdsj zzdsjVar, Object obj, zzbyu zzbyuVar, String str, long j10, zzffc zzffcVar) {
        synchronized (obj) {
            if (!zzbyuVar.isDone()) {
                zzdsjVar.zzv(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzv.zzC().b() - j10));
                zzdsjVar.zzl.zzb(str, "timeout");
                zzdsjVar.zzo.zzb(str, "timeout");
                zzffq zzffqVar = zzdsjVar.zzp;
                zzffcVar.zzc("Timeout");
                zzffcVar.zzg(false);
                zzffqVar.zzc(zzffcVar.zzm());
                zzbyuVar.zzc(Boolean.FALSE);
            }
        }
    }

    public static /* synthetic */ void zzj(zzdsj zzdsjVar) {
        zzdsjVar.zzl.zze();
        zzdsjVar.zzo.zze();
        zzdsjVar.zzb = true;
    }

    public static /* synthetic */ void zzl(zzdsj zzdsjVar) {
        synchronized (zzdsjVar) {
            if (zzdsjVar.zzc) {
                return;
            }
            zzdsjVar.zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzv.zzC().b() - zzdsjVar.zzd));
            zzdsjVar.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            zzdsjVar.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            zzdsjVar.zze.zzd(new Exception());
        }
    }

    public static /* synthetic */ void zzm(zzdsj zzdsjVar, String str, zzbkq zzbkqVar, zzfbn zzfbnVar, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzbkqVar.zzf();
                    return;
                }
                Context context = (Context) zzdsjVar.zzg.get();
                if (context == null) {
                    context = zzdsjVar.zzf;
                }
                zzfbnVar.zzi(context, zzbkqVar, list);
            } catch (RemoteException e8) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
            }
        } catch (RemoteException e10) {
            throw new zzftt(e10);
        } catch (zzfaw unused) {
            zzbkqVar.zze("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzo(final zzdsj zzdsjVar, String str) {
        int i10 = 5;
        final zzffc zza = zzffb.zza(zzdsjVar.zzf, 5);
        zza.zzi();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final zzffc zza2 = zzffb.zza(zzdsjVar.zzf, i10);
                zza2.zzi();
                zza2.zzd(next);
                final Object obj = new Object();
                final zzbyu zzbyuVar = new zzbyu();
                b6.a zzo = zzgap.zzo(zzbyuVar, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbW)).longValue(), TimeUnit.SECONDS, zzdsjVar.zzk);
                zzdsjVar.zzl.zzc(next);
                zzdsjVar.zzo.zzc(next);
                final long b10 = com.google.android.gms.ads.internal.zzv.zzC().b();
                zzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrz
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdsj.zzi(zzdsj.this, obj, zzbyuVar, next, b10, zza2);
                    }
                }, zzdsjVar.zzi);
                arrayList.add(zzo);
                final zzdsi zzdsiVar = new zzdsi(zzdsjVar, obj, next, b10, zza2, zzbyuVar);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        int i11 = 0;
                        while (i11 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzbkw(optString, bundle));
                            i11++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzdsjVar.zzv(next, false, "", 0);
                try {
                    final zzfbn zzc = zzdsjVar.zzh.zzc(next, new JSONObject());
                    zzdsjVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdse
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdsj.zzm(zzdsj.this, next, zzdsiVar, zzc, arrayList2);
                        }
                    });
                } catch (zzfaw e8) {
                    try {
                        String str2 = "Failed to create Adapter.";
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmQ)).booleanValue()) {
                            str2 = "Failed to create Adapter. " + e8.getMessage();
                        }
                        zzdsiVar.zze(str2);
                    } catch (RemoteException e10) {
                        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("", e10);
                    }
                }
                i10 = 5;
            }
            zzgap.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdsa
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzdsj.zzf(zzdsj.this, zza);
                    return null;
                }
            }, zzdsjVar.zzi);
        } catch (JSONException e11) {
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e11);
            zzdsjVar.zzo.zza("MalformedJson");
            zzdsjVar.zzl.zza("MalformedJson");
            zzdsjVar.zze.zzd(e11);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e11, "AdapterInitializer.updateAdapterStatus");
            zzffq zzffqVar = zzdsjVar.zzp;
            zza.zzh(e11);
            zza.zzg(false);
            zzffqVar.zzc(zza.zzm());
        }
    }

    private final synchronized b6.a zzu() {
        String zzc = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc();
        if (!TextUtils.isEmpty(zzc)) {
            return zzgap.zzh(zzc);
        }
        final zzbyu zzbyuVar = new zzbyu();
        com.google.android.gms.ads.internal.zzv.zzp().zzi().zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsb
            @Override // java.lang.Runnable
            public final void run() {
                r0.zzi.execute(new Runnable(zzdsj.this, zzbyuVar) { // from class: com.google.android.gms.internal.ads.zzdsd
                    public final /* synthetic */ zzbyu zza;

                    {
                        this.zza = r2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String zzc2 = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc();
                        boolean isEmpty = TextUtils.isEmpty(zzc2);
                        zzbyu zzbyuVar2 = this.zza;
                        if (!isEmpty) {
                            zzbyuVar2.zzc(zzc2);
                        } else {
                            zzbyuVar2.zzd(new Exception());
                        }
                    }
                });
            }
        });
        return zzbyuVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(String str, boolean z10, String str2, int i10) {
        this.zzn.put(str, new zzbkm(str, z10, i10, str2));
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzbkm zzbkmVar = (zzbkm) this.zzn.get(str);
            arrayList.add(new zzbkm(str, zzbkmVar.zzb, zzbkmVar.zzc, zzbkmVar.zzd));
        }
        return arrayList;
    }

    public final void zzq() {
        this.zzq = false;
    }

    public final void zzr() {
        if (!((Boolean) zzbds.zza.zze()).booleanValue()) {
            if (this.zzm.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbV)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    if (this.zza) {
                        return;
                    }
                    this.zzl.zzf();
                    this.zzo.zzf();
                    this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsf
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdsj.zzj(zzdsj.this);
                        }
                    }, this.zzi);
                    this.zza = true;
                    b6.a zzu = zzu();
                    this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdry
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdsj.zzl(zzdsj.this);
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbX)).longValue(), TimeUnit.SECONDS);
                    zzgap.zzr(zzu, new zzdsh(this), this.zzi);
                    return;
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzc(Boolean.FALSE);
        this.zza = true;
        this.zzb = true;
    }

    public final void zzs(final zzbkt zzbktVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsc
            @Override // java.lang.Runnable
            public final void run() {
                zzdsj zzdsjVar = zzdsj.this;
                try {
                    zzbktVar.zzb(zzdsjVar.zzg());
                } catch (RemoteException e8) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("", e8);
                }
            }
        }, this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}

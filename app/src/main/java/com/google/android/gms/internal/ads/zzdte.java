package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.ironsource.fe;
import com.ironsource.m5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdte implements zzduf, zzdsp {
    private final zzdtp zza;
    private final zzdug zzb;
    private final zzdsq zzc;
    private final zzdsz zzd;
    private final zzdso zze;
    private final zzdub zzf;
    private final zzdtl zzg;
    private final zzdtl zzh;
    private final String zzi;
    private final Context zzj;
    private final String zzk;
    private JSONObject zzp;
    private boolean zzs;
    private int zzt;
    private boolean zzu;
    private final Map zzl = new HashMap();
    private final Map zzm = new HashMap();
    private final Map zzn = new HashMap();
    private String zzo = JsonUtils.EMPTY_JSON;
    private long zzq = Long.MAX_VALUE;
    private zzdta zzr = zzdta.NONE;
    private zzdtd zzv = zzdtd.UNKNOWN;
    private long zzw = 0;
    private String zzx = "";

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdte(zzdtp zzdtpVar, zzdug zzdugVar, zzdsq zzdsqVar, Context context, VersionInfoParcel versionInfoParcel, zzdsz zzdszVar, zzdub zzdubVar, zzdtl zzdtlVar, zzdtl zzdtlVar2, String str) {
        this.zza = zzdtpVar;
        this.zzb = zzdugVar;
        this.zzc = zzdsqVar;
        this.zze = new zzdso(context);
        this.zzi = versionInfoParcel.afmaVersion;
        this.zzk = str;
        this.zzd = zzdszVar;
        this.zzf = zzdubVar;
        this.zzg = zzdtlVar;
        this.zzh = zzdtlVar2;
        this.zzj = context;
        com.google.android.gms.ads.internal.zzv.zzt().zzg(this);
    }

    private final synchronized void zzA(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzx(jSONObject.optBoolean("isTestMode", false), false);
            zzw((zzdta) Enum.valueOf(zzdta.class, jSONObject.optString("gesture", "NONE")), false);
            this.zzo = jSONObject.optString("networkExtras", JsonUtils.EMPTY_JSON);
            this.zzq = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    private final synchronized JSONObject zzt() throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry entry : this.zzl.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (zzdss zzdssVar : (List) entry.getValue()) {
                if (zzdssVar.zzg()) {
                    jSONArray.put(zzdssVar.zzd());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    private final void zzu() {
        this.zzu = true;
        this.zzd.zzc();
        this.zza.zzi(this);
        this.zzb.zzd(this);
        this.zzc.zzd(this);
        this.zzf.zzf(this);
        zzbbd zzbbdVar = zzbbm.zzjt;
        if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar))) {
            this.zzg.zzb(PreferenceManager.getDefaultSharedPreferences(this.zzj), Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).split(",")));
        }
        zzbbd zzbbdVar2 = zzbbm.zzju;
        if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar2))) {
            this.zzh.zzb(this.zzj.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0), Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar2)).split(",")));
        }
        zzA(com.google.android.gms.ads.internal.zzv.zzp().zzi().zzk());
        this.zzx = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzl();
    }

    private final void zzv() {
        com.google.android.gms.ads.internal.zzv.zzp().zzi().zzB(zzd());
    }

    private final synchronized void zzw(zzdta zzdtaVar, boolean z10) {
        if (this.zzr != zzdtaVar) {
            if (zzq()) {
                zzy();
            }
            this.zzr = zzdtaVar;
            if (zzq()) {
                zzz();
            }
            if (z10) {
                zzv();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:12:0x0026, B:17:0x0035, B:13:0x002a, B:15:0x0030), top: B:25:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void zzx(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzs     // Catch: java.lang.Throwable -> L3c
            if (r0 != r2) goto L6
            goto L3a
        L6:
            r1.zzs = r2     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L2a
            com.google.android.gms.internal.ads.zzbbd r2 = com.google.android.gms.internal.ads.zzbbm.zzjf     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzbbk r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r0.zzb(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L3c
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L26
            com.google.android.gms.ads.internal.util.zzay r2 = com.google.android.gms.ads.internal.zzv.zzt()     // Catch: java.lang.Throwable -> L3c
            boolean r2 = r2.zzl()     // Catch: java.lang.Throwable -> L3c
            if (r2 != 0) goto L2a
        L26:
            r1.zzz()     // Catch: java.lang.Throwable -> L3c
            goto L33
        L2a:
            boolean r2 = r1.zzq()     // Catch: java.lang.Throwable -> L3c
            if (r2 != 0) goto L33
            r1.zzy()     // Catch: java.lang.Throwable -> L3c
        L33:
            if (r3 == 0) goto L3a
            r1.zzv()     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r1)
            return
        L3a:
            monitor-exit(r1)
            return
        L3c:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdte.zzx(boolean, boolean):void");
    }

    private final synchronized void zzy() {
        int ordinal = this.zzr.ordinal();
        if (ordinal == 1) {
            this.zzb.zzb();
        } else if (ordinal != 2) {
        } else {
            this.zzc.zzb();
        }
    }

    private final synchronized void zzz() {
        int ordinal = this.zzr.ordinal();
        if (ordinal == 1) {
            this.zzb.zzc();
        } else if (ordinal != 2) {
        } else {
            this.zzc.zzc();
        }
    }

    public final zzdta zza() {
        return this.zzr;
    }

    public final synchronized b6.a zzb(String str) {
        zzbyu zzbyuVar;
        zzbyuVar = new zzbyu();
        if (this.zzm.containsKey(str)) {
            zzbyuVar.zzc((zzdss) this.zzm.get(str));
        } else {
            if (!this.zzn.containsKey(str)) {
                this.zzn.put(str, new ArrayList());
            }
            ((List) this.zzn.get(str)).add(zzbyuVar);
        }
        return zzbyuVar;
    }

    public final synchronized String zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziQ)).booleanValue() && zzq()) {
            if (this.zzq < com.google.android.gms.ads.internal.zzv.zzC().a() / 1000) {
                this.zzo = JsonUtils.EMPTY_JSON;
                this.zzq = Long.MAX_VALUE;
                return "";
            } else if (!this.zzo.equals(JsonUtils.EMPTY_JSON)) {
                return this.zzo;
            }
        }
        return "";
    }

    public final synchronized String zzd() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzs);
            jSONObject.put("gesture", this.zzr);
            if (this.zzq > com.google.android.gms.ads.internal.zzv.zzC().a() / 1000) {
                jSONObject.put("networkExtras", this.zzo);
                jSONObject.put("networkExtrasExpirationSecs", this.zzq);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject zze() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        jSONObject = new JSONObject();
        try {
            jSONObject.put(fe.G, "ANDROID");
            if (!TextUtils.isEmpty(this.zzk)) {
                jSONObject.put("sdkVersion", "afma-sdk-a-v" + this.zzk);
            }
            jSONObject.put("internalSdkVersion", this.zzi);
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("adapters", this.zzd.zza());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjq)).booleanValue()) {
                String zzn = com.google.android.gms.ads.internal.zzv.zzp().zzn();
                if (!TextUtils.isEmpty(zzn)) {
                    jSONObject.put(fe.K, zzn);
                }
            }
            if (this.zzq < com.google.android.gms.ads.internal.zzv.zzC().a() / 1000) {
                this.zzo = JsonUtils.EMPTY_JSON;
            }
            jSONObject.put("networkExtras", this.zzo);
            jSONObject.put("adSlots", zzt());
            jSONObject.put("appInfo", this.zze.zza());
            String zzc = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc();
            if (!TextUtils.isEmpty(zzc)) {
                jSONObject.put("cld", new JSONObject(zzc));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjg)).booleanValue() && (jSONObject2 = this.zzp) != null) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Server data: " + jSONObject2.toString());
                jSONObject.put(m5.f18416s, this.zzp);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjf)).booleanValue()) {
                jSONObject.put("openAction", this.zzv);
                jSONObject.put("gesture", this.zzr);
            }
            jSONObject.put("isGamRegisteredTestDevice", com.google.android.gms.ads.internal.zzv.zzt().zzl());
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.client.zzbb.zzb();
            jSONObject.put("isSimulator", com.google.android.gms.ads.internal.util.client.zzf.zzs());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjs)).booleanValue()) {
                jSONObject.put("uiStorage", new JSONObject(this.zzx));
            }
            if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzju))) {
                jSONObject.put("gmaDisk", this.zzh.zza());
            }
            if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjt))) {
                jSONObject.put("userDisk", this.zzg.zza());
            }
        } catch (JSONException e8) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(e8, "Inspector.toJson");
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Ad inspector encountered an error", e8);
        }
        return jSONObject;
    }

    public final synchronized void zzf(String str, zzdss zzdssVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziQ)).booleanValue() && zzq()) {
            if (this.zzt >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziS)).intValue()) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.zzl.containsKey(str)) {
                this.zzl.put(str, new ArrayList());
            }
            this.zzt++;
            ((List) this.zzl.get(str)).add(zzdssVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjo)).booleanValue()) {
                String zzc = zzdssVar.zzc();
                this.zzm.put(zzc, zzdssVar);
                if (this.zzn.containsKey(zzc)) {
                    List<zzbyu> list = (List) this.zzn.get(zzc);
                    for (zzbyu zzbyuVar : list) {
                        zzbyuVar.zzc(zzdssVar);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziQ)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjf)).booleanValue() && com.google.android.gms.ads.internal.zzv.zzp().zzi().zzM()) {
                zzu();
                return;
            }
            String zzk = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzk();
            if (TextUtils.isEmpty(zzk)) {
                return;
            }
            try {
                if (new JSONObject(zzk).optBoolean("isTestMode", false)) {
                    zzu();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzdk zzdkVar, zzdtd zzdtdVar) {
        if (!zzq()) {
            try {
                zzdkVar.zze(zzfbq.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziQ)).booleanValue()) {
            try {
                zzdkVar.zze(zzfbq.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Ad inspector had an internal error.");
                return;
            }
        }
        this.zzv = zzdtdVar;
        this.zza.zzj(zzdkVar, new zzbji(this), new zzbjb(this.zzf), new zzbip(this));
        return;
    }

    public final synchronized void zzi(String str, long j10) {
        this.zzo = str;
        this.zzq = j10;
        zzv();
    }

    public final synchronized void zzj(String str) {
        this.zzx = str;
        com.google.android.gms.ads.internal.zzv.zzp().zzi().zzC(this.zzx);
    }

    public final synchronized void zzk(long j10) {
        this.zzw += j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r2 != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzl(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.zzu
            if (r0 != 0) goto La
            if (r2 == 0) goto L15
            r1.zzu()
            goto Lc
        La:
            if (r2 == 0) goto L15
        Lc:
            boolean r2 = r1.zzs
            if (r2 == 0) goto L11
            goto L15
        L11:
            r1.zzz()
            return
        L15:
            boolean r2 = r1.zzq()
            if (r2 != 0) goto L1e
            r1.zzy()
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdte.zzl(boolean):void");
    }

    public final void zzm(zzdta zzdtaVar) {
        zzw(zzdtaVar, true);
    }

    public final synchronized void zzn(JSONObject jSONObject) {
        this.zzp = jSONObject;
    }

    public final void zzo(boolean z10) {
        if (!this.zzu && z10) {
            zzu();
        }
        zzx(z10, true);
    }

    public final boolean zzp() {
        return this.zzp != null;
    }

    public final synchronized boolean zzq() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjf)).booleanValue()) {
            return this.zzs || com.google.android.gms.ads.internal.zzv.zzt().zzl();
        }
        return this.zzs;
    }

    public final synchronized boolean zzr() {
        return this.zzs;
    }

    public final boolean zzs() {
        return this.zzw < ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjl)).longValue();
    }
}

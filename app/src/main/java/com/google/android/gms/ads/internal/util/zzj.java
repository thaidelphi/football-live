package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import b6.a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzayk;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbdd;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbxz;
import com.google.android.gms.internal.ads.zzbyp;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzj implements zzg {

    /* renamed from: b  reason: collision with root package name */
    private boolean f11484b;

    /* renamed from: d  reason: collision with root package name */
    private a f11486d;

    /* renamed from: f  reason: collision with root package name */
    private SharedPreferences f11488f;

    /* renamed from: g  reason: collision with root package name */
    private SharedPreferences.Editor f11489g;

    /* renamed from: i  reason: collision with root package name */
    private String f11491i;

    /* renamed from: j  reason: collision with root package name */
    private String f11492j;

    /* renamed from: a  reason: collision with root package name */
    private final Object f11483a = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final List f11485c = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private zzayk f11487e = null;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11490h = true;

    /* renamed from: k  reason: collision with root package name */
    private boolean f11493k = true;

    /* renamed from: l  reason: collision with root package name */
    private String f11494l = "-1";

    /* renamed from: m  reason: collision with root package name */
    private int f11495m = -1;

    /* renamed from: n  reason: collision with root package name */
    private zzbxz f11496n = new zzbxz("", 0);

    /* renamed from: o  reason: collision with root package name */
    private long f11497o = 0;

    /* renamed from: p  reason: collision with root package name */
    private long f11498p = 0;

    /* renamed from: q  reason: collision with root package name */
    private int f11499q = -1;

    /* renamed from: r  reason: collision with root package name */
    private int f11500r = 0;

    /* renamed from: s  reason: collision with root package name */
    private Set f11501s = Collections.emptySet();

    /* renamed from: t  reason: collision with root package name */
    private JSONObject f11502t = new JSONObject();

    /* renamed from: u  reason: collision with root package name */
    private boolean f11503u = true;

    /* renamed from: v  reason: collision with root package name */
    private boolean f11504v = true;

    /* renamed from: w  reason: collision with root package name */
    private String f11505w = null;

    /* renamed from: x  reason: collision with root package name */
    private String f11506x = "";

    /* renamed from: y  reason: collision with root package name */
    private boolean f11507y = false;

    /* renamed from: z  reason: collision with root package name */
    private String f11508z = "";
    private String A = JsonUtils.EMPTY_JSON;
    private int B = -1;
    private int C = -1;
    private long D = 0;

    private final void a() {
        a aVar = this.f11486d;
        if (aVar == null || aVar.isDone()) {
            return;
        }
        try {
            this.f11486d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e8) {
            Thread.currentThread().interrupt();
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Interrupted while waiting for preferences loaded.", e8);
        } catch (CancellationException e10) {
            e = e10;
            int i11 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e11) {
            e = e11;
            int i112 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e12) {
            e = e12;
            int i1122 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final void b() {
        zzbyp.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzh
            @Override // java.lang.Runnable
            public final void run() {
                zzj.this.zzP();
            }
        });
    }

    public static /* synthetic */ void zzQ(zzj zzjVar, Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        try {
            synchronized (zzjVar.f11483a) {
                zzjVar.f11488f = sharedPreferences;
                zzjVar.f11489g = edit;
                if (PlatformVersion.g()) {
                    NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                }
                zzjVar.f11490h = zzjVar.f11488f.getBoolean("use_https", zzjVar.f11490h);
                zzjVar.f11503u = zzjVar.f11488f.getBoolean("content_url_opted_out", zzjVar.f11503u);
                zzjVar.f11491i = zzjVar.f11488f.getString("content_url_hashes", zzjVar.f11491i);
                zzjVar.f11493k = zzjVar.f11488f.getBoolean("gad_idless", zzjVar.f11493k);
                zzjVar.f11504v = zzjVar.f11488f.getBoolean("content_vertical_opted_out", zzjVar.f11504v);
                zzjVar.f11492j = zzjVar.f11488f.getString("content_vertical_hashes", zzjVar.f11492j);
                zzjVar.f11500r = zzjVar.f11488f.getInt("version_code", zzjVar.f11500r);
                if (((Boolean) zzbde.zzg.zze()).booleanValue() && com.google.android.gms.ads.internal.client.zzbd.zzc().zze()) {
                    zzjVar.f11496n = new zzbxz("", 0L);
                } else {
                    zzjVar.f11496n = new zzbxz(zzjVar.f11488f.getString("app_settings_json", zzjVar.f11496n.zzc()), zzjVar.f11488f.getLong("app_settings_last_update_ms", zzjVar.f11496n.zza()));
                }
                zzjVar.f11497o = zzjVar.f11488f.getLong("app_last_background_time_ms", zzjVar.f11497o);
                zzjVar.f11499q = zzjVar.f11488f.getInt("request_in_session_count", zzjVar.f11499q);
                zzjVar.f11498p = zzjVar.f11488f.getLong("first_ad_req_time_ms", zzjVar.f11498p);
                zzjVar.f11501s = zzjVar.f11488f.getStringSet("never_pool_slots", zzjVar.f11501s);
                zzjVar.f11505w = zzjVar.f11488f.getString("display_cutout", zzjVar.f11505w);
                zzjVar.B = zzjVar.f11488f.getInt("app_measurement_npa", zzjVar.B);
                zzjVar.C = zzjVar.f11488f.getInt("sd_app_measure_npa", zzjVar.C);
                zzjVar.D = zzjVar.f11488f.getLong("sd_app_measure_npa_ts", zzjVar.D);
                zzjVar.f11506x = zzjVar.f11488f.getString("inspector_info", zzjVar.f11506x);
                zzjVar.f11507y = zzjVar.f11488f.getBoolean("linked_device", zzjVar.f11507y);
                zzjVar.f11508z = zzjVar.f11488f.getString("linked_ad_unit", zzjVar.f11508z);
                zzjVar.A = zzjVar.f11488f.getString("inspector_ui_storage", zzjVar.A);
                zzjVar.f11494l = zzjVar.f11488f.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, zzjVar.f11494l);
                zzjVar.f11495m = zzjVar.f11488f.getInt("gad_has_consent_for_cookies", zzjVar.f11495m);
                try {
                    zzjVar.f11502t = new JSONObject(zzjVar.f11488f.getString("native_advanced_settings", JsonUtils.EMPTY_JSON));
                } catch (JSONException e8) {
                    int i10 = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not convert native advanced settings to json object", e8);
                }
                zzjVar.b();
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread");
            zze.zzb("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzA(int i10) {
        a();
        synchronized (this.f11483a) {
            this.f11495m = i10;
            SharedPreferences.Editor editor = this.f11489g;
            if (editor != null) {
                if (i10 == -1) {
                    editor.remove("gad_has_consent_for_cookies");
                } else {
                    editor.putInt("gad_has_consent_for_cookies", i10);
                }
                this.f11489g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzB(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziQ)).booleanValue()) {
            a();
            synchronized (this.f11483a) {
                if (this.f11506x.equals(str)) {
                    return;
                }
                this.f11506x = str;
                SharedPreferences.Editor editor = this.f11489g;
                if (editor != null) {
                    editor.putString("inspector_info", str);
                    this.f11489g.apply();
                }
                b();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzC(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjs)).booleanValue()) {
            a();
            synchronized (this.f11483a) {
                if (this.A.equals(str)) {
                    return;
                }
                this.A = str;
                SharedPreferences.Editor editor = this.f11489g;
                if (editor != null) {
                    editor.putString("inspector_ui_storage", str);
                    this.f11489g.apply();
                }
                b();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzD(boolean z10) {
        a();
        synchronized (this.f11483a) {
            if (z10 == this.f11493k) {
                return;
            }
            this.f11493k = z10;
            SharedPreferences.Editor editor = this.f11489g;
            if (editor != null) {
                editor.putBoolean("gad_idless", z10);
                this.f11489g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzE(boolean z10) {
        a();
        synchronized (this.f11483a) {
            long currentTimeMillis = System.currentTimeMillis() + ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzks)).longValue();
            SharedPreferences.Editor editor = this.f11489g;
            if (editor != null) {
                editor.putBoolean("is_topics_ad_personalization_allowed", z10);
                this.f11489g.putLong("topics_consent_expiry_time_ms", currentTimeMillis);
                this.f11489g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzF(String str, String str2, boolean z10) {
        a();
        synchronized (this.f11483a) {
            JSONArray optJSONArray = this.f11502t.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                if (optJSONObject == null) {
                    return;
                }
                if (str2.equals(optJSONObject.optString("template_id"))) {
                    if (z10 && optJSONObject.optBoolean("uses_media_view", false)) {
                        return;
                    } else {
                        length = i10;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z10);
                jSONObject.put("timestamp_ms", com.google.android.gms.ads.internal.zzv.zzC().a());
                optJSONArray.put(length, jSONObject);
                this.f11502t.put(str, optJSONArray);
            } catch (JSONException e8) {
                int i11 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not update native advanced settings", e8);
            }
            SharedPreferences.Editor editor = this.f11489g;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.f11502t.toString());
                this.f11489g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzG(int i10) {
        a();
        synchronized (this.f11483a) {
            if (this.f11499q == i10) {
                return;
            }
            this.f11499q = i10;
            SharedPreferences.Editor editor = this.f11489g;
            if (editor != null) {
                editor.putInt("request_in_session_count", i10);
                this.f11489g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzH(int i10) {
        a();
        synchronized (this.f11483a) {
            if (this.C == i10) {
                return;
            }
            this.C = i10;
            SharedPreferences.Editor editor = this.f11489g;
            if (editor != null) {
                editor.putInt("sd_app_measure_npa", i10);
                this.f11489g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzI(long j10) {
        a();
        synchronized (this.f11483a) {
            if (this.D == j10) {
                return;
            }
            this.D = j10;
            SharedPreferences.Editor editor = this.f11489g;
            if (editor != null) {
                editor.putLong("sd_app_measure_npa_ts", j10);
                this.f11489g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzJ(String str) {
        a();
        synchronized (this.f11483a) {
            this.f11494l = str;
            if (this.f11489g != null) {
                if (str.equals("-1")) {
                    this.f11489g.remove(AndroidTcfDataSource.TCF_TCSTRING_KEY);
                } else {
                    this.f11489g.putString(AndroidTcfDataSource.TCF_TCSTRING_KEY, str);
                }
                this.f11489g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzK() {
        boolean z10;
        a();
        synchronized (this.f11483a) {
            z10 = this.f11503u;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzL() {
        boolean z10;
        a();
        synchronized (this.f11483a) {
            z10 = this.f11504v;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzM() {
        boolean z10;
        a();
        synchronized (this.f11483a) {
            z10 = this.f11507y;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzN() {
        boolean z10;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaH)).booleanValue()) {
            a();
            synchronized (this.f11483a) {
                z10 = this.f11493k;
            }
            return z10;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzO() {
        a();
        synchronized (this.f11483a) {
            SharedPreferences sharedPreferences = this.f11488f;
            boolean z10 = false;
            if (sharedPreferences == null) {
                return false;
            }
            if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                return false;
            }
            if (this.f11488f.getBoolean("is_topics_ad_personalization_allowed", false) && !this.f11493k) {
                z10 = true;
            }
            return z10;
        }
    }

    public final zzayk zzP() {
        if (this.f11484b) {
            if (!(zzK() && zzL()) && ((Boolean) zzbdd.zzb.zze()).booleanValue()) {
                synchronized (this.f11483a) {
                    if (Looper.getMainLooper() == null) {
                        return null;
                    }
                    if (this.f11487e == null) {
                        this.f11487e = new zzayk();
                    }
                    this.f11487e.zzd();
                    int i10 = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("start fetching content...");
                    return this.f11487e;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zza() {
        int i10;
        a();
        synchronized (this.f11483a) {
            i10 = this.f11500r;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzb() {
        a();
        return this.f11495m;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzc() {
        int i10;
        a();
        synchronized (this.f11483a) {
            i10 = this.f11499q;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzd() {
        long j10;
        a();
        synchronized (this.f11483a) {
            j10 = this.f11497o;
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zze() {
        long j10;
        a();
        synchronized (this.f11483a) {
            j10 = this.f11498p;
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzf() {
        long j10;
        a();
        synchronized (this.f11483a) {
            j10 = this.D;
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzbxz zzg() {
        zzbxz zzbxzVar;
        a();
        synchronized (this.f11483a) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlC)).booleanValue() && this.f11496n.zzj()) {
                for (Runnable runnable : this.f11485c) {
                    runnable.run();
                }
            }
            zzbxzVar = this.f11496n;
        }
        return zzbxzVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzbxz zzh() {
        zzbxz zzbxzVar;
        synchronized (this.f11483a) {
            zzbxzVar = this.f11496n;
        }
        return zzbxzVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzi() {
        String str;
        a();
        synchronized (this.f11483a) {
            str = this.f11508z;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzj() {
        String str;
        a();
        synchronized (this.f11483a) {
            str = this.f11505w;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzk() {
        String str;
        a();
        synchronized (this.f11483a) {
            str = this.f11506x;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzl() {
        String str;
        a();
        synchronized (this.f11483a) {
            str = this.A;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzm() {
        a();
        return this.f11494l;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final JSONObject zzn() {
        JSONObject jSONObject;
        a();
        synchronized (this.f11483a) {
            jSONObject = this.f11502t;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzo(Runnable runnable) {
        this.f11485c.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzp(final Context context) {
        synchronized (this.f11483a) {
            if (this.f11488f != null) {
                return;
            }
            this.f11486d = zzbyp.zza.zza(new Runnable(context, AppLovinMediationProvider.ADMOB) { // from class: com.google.android.gms.ads.internal.util.zzi
                public final /* synthetic */ Context zzb;
                public final /* synthetic */ String zzc = AppLovinMediationProvider.ADMOB;

                @Override // java.lang.Runnable
                public final void run() {
                    zzj.zzQ(zzj.this, this.zzb, this.zzc);
                }
            });
            this.f11484b = true;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzq() {
        a();
        synchronized (this.f11483a) {
            this.f11502t = new JSONObject();
            SharedPreferences.Editor editor = this.f11489g;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.f11489g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzr(long j10) {
        a();
        synchronized (this.f11483a) {
            if (this.f11497o == j10) {
                return;
            }
            this.f11497o = j10;
            SharedPreferences.Editor editor = this.f11489g;
            if (editor != null) {
                editor.putLong("app_last_background_time_ms", j10);
                this.f11489g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzs(String str) {
        a();
        synchronized (this.f11483a) {
            long a10 = com.google.android.gms.ads.internal.zzv.zzC().a();
            if (str != null && !str.equals(this.f11496n.zzc())) {
                this.f11496n = new zzbxz(str, a10);
                SharedPreferences.Editor editor = this.f11489g;
                if (editor != null) {
                    editor.putString("app_settings_json", str);
                    this.f11489g.putLong("app_settings_last_update_ms", a10);
                    this.f11489g.apply();
                }
                b();
                for (Runnable runnable : this.f11485c) {
                    runnable.run();
                }
                return;
            }
            this.f11496n.zzg(a10);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzt(int i10) {
        a();
        synchronized (this.f11483a) {
            if (this.f11500r == i10) {
                return;
            }
            this.f11500r = i10;
            SharedPreferences.Editor editor = this.f11489g;
            if (editor != null) {
                editor.putInt("version_code", i10);
                this.f11489g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzu(boolean z10) {
        a();
        synchronized (this.f11483a) {
            if (this.f11503u == z10) {
                return;
            }
            this.f11503u = z10;
            SharedPreferences.Editor editor = this.f11489g;
            if (editor != null) {
                editor.putBoolean("content_url_opted_out", z10);
                this.f11489g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzv(boolean z10) {
        a();
        synchronized (this.f11483a) {
            if (this.f11504v == z10) {
                return;
            }
            this.f11504v = z10;
            SharedPreferences.Editor editor = this.f11489g;
            if (editor != null) {
                editor.putBoolean("content_vertical_opted_out", z10);
                this.f11489g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzw(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjf)).booleanValue()) {
            a();
            synchronized (this.f11483a) {
                if (this.f11508z.equals(str)) {
                    return;
                }
                this.f11508z = str;
                SharedPreferences.Editor editor = this.f11489g;
                if (editor != null) {
                    editor.putString("linked_ad_unit", str);
                    this.f11489g.apply();
                }
                b();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzx(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjf)).booleanValue()) {
            a();
            synchronized (this.f11483a) {
                if (this.f11507y == z10) {
                    return;
                }
                this.f11507y = z10;
                SharedPreferences.Editor editor = this.f11489g;
                if (editor != null) {
                    editor.putBoolean("linked_device", z10);
                    this.f11489g.apply();
                }
                b();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzy(String str) {
        a();
        synchronized (this.f11483a) {
            if (TextUtils.equals(this.f11505w, str)) {
                return;
            }
            this.f11505w = str;
            SharedPreferences.Editor editor = this.f11489g;
            if (editor != null) {
                editor.putString("display_cutout", str);
                this.f11489g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzz(long j10) {
        a();
        synchronized (this.f11483a) {
            if (this.f11498p == j10) {
                return;
            }
            this.f11498p = j10;
            SharedPreferences.Editor editor = this.f11489g;
            if (editor != null) {
                editor.putLong("first_ad_req_time_ms", j10);
                this.f11489g.apply();
            }
            b();
        }
    }
}

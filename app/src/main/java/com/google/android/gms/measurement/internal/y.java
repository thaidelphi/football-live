package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class y extends y0 {
    @VisibleForTesting

    /* renamed from: x  reason: collision with root package name */
    static final Pair f13228x = new Pair("", 0L);

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f13229c;

    /* renamed from: d  reason: collision with root package name */
    public zzfb f13230d;

    /* renamed from: e  reason: collision with root package name */
    public final zzez f13231e;

    /* renamed from: f  reason: collision with root package name */
    public final zzez f13232f;

    /* renamed from: g  reason: collision with root package name */
    public final zzfc f13233g;

    /* renamed from: h  reason: collision with root package name */
    private String f13234h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f13235i;

    /* renamed from: j  reason: collision with root package name */
    private long f13236j;

    /* renamed from: k  reason: collision with root package name */
    public final zzez f13237k;

    /* renamed from: l  reason: collision with root package name */
    public final zzex f13238l;

    /* renamed from: m  reason: collision with root package name */
    public final zzfc f13239m;

    /* renamed from: n  reason: collision with root package name */
    public final zzex f13240n;

    /* renamed from: o  reason: collision with root package name */
    public final zzez f13241o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f13242p;

    /* renamed from: q  reason: collision with root package name */
    public final zzex f13243q;

    /* renamed from: r  reason: collision with root package name */
    public final zzex f13244r;

    /* renamed from: s  reason: collision with root package name */
    public final zzez f13245s;

    /* renamed from: t  reason: collision with root package name */
    public final zzfc f13246t;

    /* renamed from: u  reason: collision with root package name */
    public final zzfc f13247u;

    /* renamed from: v  reason: collision with root package name */
    public final zzez f13248v;

    /* renamed from: w  reason: collision with root package name */
    public final zzey f13249w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(zzfy zzfyVar) {
        super(zzfyVar);
        this.f13237k = new zzez(this, "session_timeout", 1800000L);
        this.f13238l = new zzex(this, "start_new_session", true);
        this.f13241o = new zzez(this, "last_pause_time", 0L);
        this.f13239m = new zzfc(this, "non_personalized_ads", null);
        this.f13240n = new zzex(this, "allow_remote_dynamite", false);
        this.f13231e = new zzez(this, "first_open_time", 0L);
        this.f13232f = new zzez(this, "app_install_time", 0L);
        this.f13233g = new zzfc(this, "app_instance_id", null);
        this.f13243q = new zzex(this, "app_backgrounded", false);
        this.f13244r = new zzex(this, "deep_link_retrieval_complete", false);
        this.f13245s = new zzez(this, "deep_link_retrieval_attempts", 0L);
        this.f13246t = new zzfc(this, "firebase_feature_rollouts", null);
        this.f13247u = new zzfc(this, "deferred_attribution_cache", null);
        this.f13248v = new zzez(this, "deferred_attribution_cache_timestamp", 0L);
        this.f13249w = new zzey(this, "default_event_parameters", null);
    }

    @Override // com.google.android.gms.measurement.internal.y0
    protected final void d() {
        SharedPreferences sharedPreferences = this.f13220a.zzau().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f13229c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f13242p = z10;
        if (!z10) {
            SharedPreferences.Editor edit = this.f13229c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f13220a.u();
        this.f13230d = new zzfb(this, "health_monitor", Math.max(0L, ((Long) zzeb.f13410d.a(null)).longValue()), null);
    }

    @Override // com.google.android.gms.measurement.internal.y0
    protected final boolean e() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @VisibleForTesting
    public final SharedPreferences j() {
        c();
        f();
        Preconditions.m(this.f13229c);
        return this.f13229c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Pair k(String str) {
        c();
        long b10 = this.f13220a.zzav().b();
        String str2 = this.f13234h;
        if (str2 != null && b10 < this.f13236j) {
            return new Pair(str2, Boolean.valueOf(this.f13235i));
        }
        this.f13236j = b10 + this.f13220a.u().m(str, zzeb.f13408c);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f13220a.zzau());
            this.f13234h = "";
            String id = advertisingIdInfo.getId();
            if (id != null) {
                this.f13234h = id;
            }
            this.f13235i = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e8) {
            this.f13220a.zzay().l().b("Unable to get advertising id", e8);
            this.f13234h = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(this.f13234h, Boolean.valueOf(this.f13235i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzai l() {
        c();
        return zzai.b(j().getString("consent_settings", "G1"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean m() {
        c();
        if (j().contains("measurement_enabled")) {
            return Boolean.valueOf(j().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(Boolean bool) {
        c();
        SharedPreferences.Editor edit = j().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(boolean z10) {
        c();
        this.f13220a.zzay().q().b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor edit = j().edit();
        edit.putBoolean("deferred_analytics_collection", z10);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean p() {
        SharedPreferences sharedPreferences = this.f13229c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean q(long j10) {
        return j10 - this.f13237k.a() > this.f13241o.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean r(int i10) {
        return zzai.j(i10, j().getInt("consent_source", 100));
    }
}

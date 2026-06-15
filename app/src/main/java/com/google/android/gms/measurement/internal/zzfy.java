package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzia;
import com.google.android.gms.internal.measurement.zznv;
import com.ironsource.da;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfy implements z0 {
    private static volatile zzfy H;
    private volatile Boolean A;
    @VisibleForTesting
    protected Boolean B;
    @VisibleForTesting
    protected Boolean C;
    private volatile boolean D;
    private int E;
    @VisibleForTesting
    final long G;

    /* renamed from: a  reason: collision with root package name */
    private final Context f13553a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13554b;

    /* renamed from: c  reason: collision with root package name */
    private final String f13555c;

    /* renamed from: d  reason: collision with root package name */
    private final String f13556d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f13557e;

    /* renamed from: f  reason: collision with root package name */
    private final zzab f13558f;

    /* renamed from: g  reason: collision with root package name */
    private final zzag f13559g;

    /* renamed from: h  reason: collision with root package name */
    private final y f13560h;

    /* renamed from: i  reason: collision with root package name */
    private final zzeo f13561i;

    /* renamed from: j  reason: collision with root package name */
    private final zzfv f13562j;

    /* renamed from: k  reason: collision with root package name */
    private final zzki f13563k;

    /* renamed from: l  reason: collision with root package name */
    private final zzlh f13564l;

    /* renamed from: m  reason: collision with root package name */
    private final zzej f13565m;

    /* renamed from: n  reason: collision with root package name */
    private final Clock f13566n;

    /* renamed from: o  reason: collision with root package name */
    private final zzis f13567o;

    /* renamed from: p  reason: collision with root package name */
    private final zzid f13568p;

    /* renamed from: q  reason: collision with root package name */
    private final zzd f13569q;

    /* renamed from: r  reason: collision with root package name */
    private final zzih f13570r;

    /* renamed from: s  reason: collision with root package name */
    private final String f13571s;

    /* renamed from: t  reason: collision with root package name */
    private zzeh f13572t;

    /* renamed from: u  reason: collision with root package name */
    private zzjs f13573u;

    /* renamed from: v  reason: collision with root package name */
    private zzaq f13574v;

    /* renamed from: w  reason: collision with root package name */
    private zzef f13575w;

    /* renamed from: y  reason: collision with root package name */
    private Boolean f13577y;

    /* renamed from: z  reason: collision with root package name */
    private long f13578z;

    /* renamed from: x  reason: collision with root package name */
    private boolean f13576x = false;
    private final AtomicInteger F = new AtomicInteger(0);

    zzfy(zzhb zzhbVar) {
        long a10;
        Bundle bundle;
        boolean z10 = false;
        Preconditions.m(zzhbVar);
        Context context = zzhbVar.f13595a;
        zzab zzabVar = new zzab(context);
        this.f13558f = zzabVar;
        n.f13086a = zzabVar;
        this.f13553a = context;
        this.f13554b = zzhbVar.f13596b;
        this.f13555c = zzhbVar.f13597c;
        this.f13556d = zzhbVar.f13598d;
        this.f13557e = zzhbVar.f13602h;
        this.A = zzhbVar.f13599e;
        this.f13571s = zzhbVar.f13604j;
        this.D = true;
        com.google.android.gms.internal.measurement.zzcl zzclVar = zzhbVar.f13601g;
        if (zzclVar != null && (bundle = zzclVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = zzclVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        zzia.zze(context);
        Clock d10 = DefaultClock.d();
        this.f13566n = d10;
        Long l10 = zzhbVar.f13603i;
        if (l10 != null) {
            a10 = l10.longValue();
        } else {
            a10 = d10.a();
        }
        this.G = a10;
        this.f13559g = new zzag(this);
        y yVar = new y(this);
        yVar.g();
        this.f13560h = yVar;
        zzeo zzeoVar = new zzeo(this);
        zzeoVar.g();
        this.f13561i = zzeoVar;
        zzlh zzlhVar = new zzlh(this);
        zzlhVar.g();
        this.f13564l = zzlhVar;
        this.f13565m = new zzej(new b1(zzhbVar, this));
        this.f13569q = new zzd(this);
        zzis zzisVar = new zzis(this);
        zzisVar.e();
        this.f13567o = zzisVar;
        zzid zzidVar = new zzid(this);
        zzidVar.e();
        this.f13568p = zzidVar;
        zzki zzkiVar = new zzki(this);
        zzkiVar.e();
        this.f13563k = zzkiVar;
        zzih zzihVar = new zzih(this);
        zzihVar.g();
        this.f13570r = zzihVar;
        zzfv zzfvVar = new zzfv(this);
        zzfvVar.g();
        this.f13562j = zzfvVar;
        com.google.android.gms.internal.measurement.zzcl zzclVar2 = zzhbVar.f13601g;
        z10 = (zzclVar2 == null || zzclVar2.zzb == 0) ? true : z10;
        if (context.getApplicationContext() instanceof Application) {
            zzid D = D();
            if (D.f13220a.f13553a.getApplicationContext() instanceof Application) {
                Application application = (Application) D.f13220a.f13553a.getApplicationContext();
                if (D.f13613c == null) {
                    D.f13613c = new x1(D, null);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(D.f13613c);
                    application.registerActivityLifecycleCallbacks(D.f13613c);
                    D.f13220a.zzay().q().a("Registered activity lifecycle callback");
                }
            }
        } else {
            zzay().r().a("Application context is not an Application");
        }
        zzfvVar.u(new g0(this, zzhbVar));
    }

    public static zzfy C(Context context, com.google.android.gms.internal.measurement.zzcl zzclVar, Long l10) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.zze == null || zzclVar.zzf == null)) {
            zzclVar = new com.google.android.gms.internal.measurement.zzcl(zzclVar.zza, zzclVar.zzb, zzclVar.zzc, zzclVar.zzd, null, null, zzclVar.zzg, null);
        }
        Preconditions.m(context);
        Preconditions.m(context.getApplicationContext());
        if (H == null) {
            synchronized (zzfy.class) {
                if (H == null) {
                    H = new zzfy(new zzhb(context, zzclVar, l10));
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.m(H);
            H.A = Boolean.valueOf(zzclVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.m(H);
        return H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void a(zzfy zzfyVar, zzhb zzhbVar) {
        zzfyVar.zzaz().c();
        zzfyVar.f13559g.r();
        zzaq zzaqVar = new zzaq(zzfyVar);
        zzaqVar.g();
        zzfyVar.f13574v = zzaqVar;
        zzef zzefVar = new zzef(zzfyVar, zzhbVar.f13600f);
        zzefVar.e();
        zzfyVar.f13575w = zzefVar;
        zzeh zzehVar = new zzeh(zzfyVar);
        zzehVar.e();
        zzfyVar.f13572t = zzehVar;
        zzjs zzjsVar = new zzjs(zzfyVar);
        zzjsVar.e();
        zzfyVar.f13573u = zzjsVar;
        zzfyVar.f13564l.h();
        zzfyVar.f13560h.h();
        zzfyVar.f13575w.f();
        zzem p10 = zzfyVar.zzay().p();
        zzfyVar.f13559g.l();
        p10.b("App measurement initialized, version", 73000L);
        zzfyVar.zzay().p().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String n10 = zzefVar.n();
        if (TextUtils.isEmpty(zzfyVar.f13554b)) {
            if (zzfyVar.I().O(n10)) {
                zzfyVar.zzay().p().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzfyVar.zzay().p().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(n10)));
            }
        }
        zzfyVar.zzay().l().a("Debug-level message logging enabled");
        if (zzfyVar.E != zzfyVar.F.get()) {
            zzfyVar.zzay().m().c("Not all components initialized", Integer.valueOf(zzfyVar.E), Integer.valueOf(zzfyVar.F.get()));
        }
        zzfyVar.f13576x = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void o() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void p(x0 x0Var) {
        if (x0Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void q(x xVar) {
        if (xVar != null) {
            if (!xVar.h()) {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(xVar.getClass())));
            }
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    private static final void r(y0 y0Var) {
        if (y0Var != null) {
            if (!y0Var.i()) {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(y0Var.getClass())));
            }
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    public final y A() {
        p(this.f13560h);
        return this.f13560h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfv B() {
        return this.f13562j;
    }

    public final zzid D() {
        q(this.f13568p);
        return this.f13568p;
    }

    public final zzih E() {
        r(this.f13570r);
        return this.f13570r;
    }

    public final zzis F() {
        q(this.f13567o);
        return this.f13567o;
    }

    public final zzjs G() {
        q(this.f13573u);
        return this.f13573u;
    }

    public final zzki H() {
        q(this.f13563k);
        return this.f13563k;
    }

    public final zzlh I() {
        p(this.f13564l);
        return this.f13564l;
    }

    public final String J() {
        return this.f13554b;
    }

    public final String K() {
        return this.f13555c;
    }

    public final String L() {
        return this.f13556d;
    }

    public final String M() {
        return this.f13571s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.F.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c(String str, int i10, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        if (i10 != 200 && i10 != 204) {
            if (i10 == 304) {
                i10 = 304;
            }
            zzay().r().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th);
        }
        if (th == null) {
            A().f13244r.a(true);
            if (bArr != null && bArr.length != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String optString = jSONObject.optString("deeplink", "");
                    String optString2 = jSONObject.optString("gclid", "");
                    double optDouble = jSONObject.optDouble(da.a.f16995d, 0.0d);
                    if (TextUtils.isEmpty(optString)) {
                        zzay().l().a("Deferred Deep Link is empty.");
                        return;
                    }
                    zzlh I = I();
                    zzfy zzfyVar = I.f13220a;
                    if (!TextUtils.isEmpty(optString) && (queryIntentActivities = I.f13220a.f13553a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.f13568p.p("auto", "_cmp", bundle);
                        zzlh I2 = I();
                        if (TextUtils.isEmpty(optString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor edit = I2.f13220a.f13553a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            edit.putString("deeplink", optString);
                            edit.putLong(da.a.f16995d, Double.doubleToRawLongBits(optDouble));
                            if (edit.commit()) {
                                I2.f13220a.f13553a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                return;
                            }
                            return;
                        } catch (RuntimeException e8) {
                            I2.f13220a.zzay().m().b("Failed to persist Deferred Deep Link. exception", e8);
                            return;
                        }
                    }
                    zzay().r().c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                    return;
                } catch (JSONException e10) {
                    zzay().m().b("Failed to parse the Deferred Deep Link response. exception", e10);
                    return;
                }
            }
            zzay().l().a("Deferred Deep Link response empty.");
            return;
        }
        zzay().r().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        this.E++;
    }

    public final void e() {
        zzaz().c();
        r(E());
        String n10 = w().n();
        Pair k10 = A().k(n10);
        if (this.f13559g.v() && !((Boolean) k10.second).booleanValue() && !TextUtils.isEmpty((CharSequence) k10.first)) {
            zzih E = E();
            E.f();
            ConnectivityManager connectivityManager = (ConnectivityManager) E.f13220a.f13553a.getSystemService("connectivity");
            NetworkInfo networkInfo = null;
            if (connectivityManager != null) {
                try {
                    networkInfo = connectivityManager.getActiveNetworkInfo();
                } catch (SecurityException unused) {
                }
            }
            if (networkInfo != null && networkInfo.isConnected()) {
                zzlh I = I();
                w().f13220a.f13559g.l();
                URL n11 = I.n(73000L, n10, (String) k10.first, A().f13245s.a() - 1);
                if (n11 != null) {
                    zzih E2 = E();
                    zzfw zzfwVar = new zzfw(this);
                    E2.c();
                    E2.f();
                    Preconditions.m(n11);
                    Preconditions.m(zzfwVar);
                    E2.f13220a.zzaz().t(new y1(E2, n10, n11, null, null, zzfwVar, null));
                    return;
                }
                return;
            }
            zzay().r().a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        zzay().l().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(boolean z10) {
        this.A = Boolean.valueOf(z10);
    }

    public final void g(boolean z10) {
        zzaz().c();
        this.D = z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(com.google.android.gms.internal.measurement.zzcl zzclVar) {
        zzai zzaiVar;
        zzaz().c();
        zzai l10 = A().l();
        y A = A();
        zzfy zzfyVar = A.f13220a;
        A.c();
        int i10 = 100;
        int i11 = A.j().getInt("consent_source", 100);
        zzag zzagVar = this.f13559g;
        zzfy zzfyVar2 = zzagVar.f13220a;
        Boolean o10 = zzagVar.o("google_analytics_default_allow_ad_storage");
        zzag zzagVar2 = this.f13559g;
        zzfy zzfyVar3 = zzagVar2.f13220a;
        Boolean o11 = zzagVar2.o("google_analytics_default_allow_analytics_storage");
        if ((o10 != null || o11 != null) && A().r(-10)) {
            zzaiVar = new zzai(o10, o11);
            i10 = -10;
        } else {
            if (!TextUtils.isEmpty(w().o()) && (i11 == 0 || i11 == 30 || i11 == 10 || i11 == 30 || i11 == 30 || i11 == 40)) {
                D().B(zzai.f13293b, -10, this.G);
            } else if (TextUtils.isEmpty(w().o()) && zzclVar != null && zzclVar.zzg != null && A().r(30)) {
                zzaiVar = zzai.a(zzclVar.zzg);
                if (!zzaiVar.equals(zzai.f13293b)) {
                    i10 = 30;
                }
            }
            zzaiVar = null;
        }
        if (zzaiVar != null) {
            D().B(zzaiVar, i10, this.G);
            l10 = zzaiVar;
        }
        D().E(l10);
        if (A().f13231e.a() == 0) {
            zzay().q().b("Persisting first open", Long.valueOf(this.G));
            A().f13231e.b(this.G);
        }
        D().f13624n.c();
        if (!m()) {
            if (j()) {
                if (!I().N("android.permission.INTERNET")) {
                    zzay().m().a("App is missing INTERNET permission");
                }
                if (!I().N("android.permission.ACCESS_NETWORK_STATE")) {
                    zzay().m().a("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!Wrappers.a(this.f13553a).g() && !this.f13559g.B()) {
                    if (!zzlh.T(this.f13553a)) {
                        zzay().m().a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!zzlh.U(this.f13553a, false)) {
                        zzay().m().a("AppMeasurementService not registered/enabled");
                    }
                }
                zzay().m().a("Uploading is not possible. App measurement disabled");
            }
        } else {
            if (!TextUtils.isEmpty(w().o()) || !TextUtils.isEmpty(w().m())) {
                zzlh I = I();
                String o12 = w().o();
                y A2 = A();
                A2.c();
                String string = A2.j().getString("gmp_app_id", null);
                String m7 = w().m();
                y A3 = A();
                A3.c();
                if (I.W(o12, string, m7, A3.j().getString("admob_app_id", null))) {
                    zzay().p().a("Rechecking which service to use due to a GMP App Id change");
                    y A4 = A();
                    A4.c();
                    Boolean m10 = A4.m();
                    SharedPreferences.Editor edit = A4.j().edit();
                    edit.clear();
                    edit.apply();
                    if (m10 != null) {
                        A4.n(m10);
                    }
                    x().l();
                    this.f13573u.L();
                    this.f13573u.K();
                    A().f13231e.b(this.G);
                    A().f13233g.b(null);
                }
                y A5 = A();
                String o13 = w().o();
                A5.c();
                SharedPreferences.Editor edit2 = A5.j().edit();
                edit2.putString("gmp_app_id", o13);
                edit2.apply();
                y A6 = A();
                String m11 = w().m();
                A6.c();
                SharedPreferences.Editor edit3 = A6.j().edit();
                edit3.putString("admob_app_id", m11);
                edit3.apply();
            }
            if (!A().l().i(zzah.ANALYTICS_STORAGE)) {
                A().f13233g.b(null);
            }
            D().x(A().f13233g.a());
            zznv.zzc();
            if (this.f13559g.w(null, zzeb.f13413e0)) {
                try {
                    I().f13220a.f13553a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(A().f13246t.a())) {
                        zzay().r().a("Remote config removed with active feature rollouts");
                        A().f13246t.b(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(w().o()) || !TextUtils.isEmpty(w().m())) {
                boolean j10 = j();
                if (!A().p() && !this.f13559g.z()) {
                    A().o(!j10);
                }
                if (j10) {
                    D().a0();
                }
                H().f13674d.a();
                G().N(new AtomicReference());
                G().q(A().f13249w.a());
            }
        }
        A().f13240n.a(true);
    }

    public final boolean i() {
        return this.A != null && this.A.booleanValue();
    }

    public final boolean j() {
        return s() == 0;
    }

    public final boolean k() {
        zzaz().c();
        return this.D;
    }

    public final boolean l() {
        return TextUtils.isEmpty(this.f13554b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean m() {
        if (this.f13576x) {
            zzaz().c();
            Boolean bool = this.f13577y;
            if (bool == null || this.f13578z == 0 || (!bool.booleanValue() && Math.abs(this.f13566n.b() - this.f13578z) > 1000)) {
                this.f13578z = this.f13566n.b();
                boolean z10 = true;
                Boolean valueOf = Boolean.valueOf(I().N("android.permission.INTERNET") && I().N("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.a(this.f13553a).g() || this.f13559g.B() || (zzlh.T(this.f13553a) && zzlh.U(this.f13553a, false))));
                this.f13577y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!I().G(w().o(), w().m()) && TextUtils.isEmpty(w().m())) {
                        z10 = false;
                    }
                    this.f13577y = Boolean.valueOf(z10);
                }
            }
            return this.f13577y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    public final boolean n() {
        return this.f13557e;
    }

    public final int s() {
        zzaz().c();
        if (this.f13559g.z()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool == null || !bool.booleanValue()) {
            zzaz().c();
            if (this.D) {
                Boolean m7 = A().m();
                if (m7 != null) {
                    return m7.booleanValue() ? 0 : 3;
                }
                zzag zzagVar = this.f13559g;
                zzab zzabVar = zzagVar.f13220a.f13558f;
                Boolean o10 = zzagVar.o("firebase_analytics_collection_enabled");
                if (o10 != null) {
                    return o10.booleanValue() ? 0 : 4;
                }
                Boolean bool2 = this.B;
                return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.A == null || this.A.booleanValue()) ? 0 : 7;
            }
            return 8;
        }
        return 2;
    }

    public final zzd t() {
        zzd zzdVar = this.f13569q;
        if (zzdVar != null) {
            return zzdVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final zzag u() {
        return this.f13559g;
    }

    public final zzaq v() {
        r(this.f13574v);
        return this.f13574v;
    }

    public final zzef w() {
        q(this.f13575w);
        return this.f13575w;
    }

    public final zzeh x() {
        q(this.f13572t);
        return this.f13572t;
    }

    public final zzej y() {
        return this.f13565m;
    }

    public final zzeo z() {
        zzeo zzeoVar = this.f13561i;
        if (zzeoVar == null || !zzeoVar.i()) {
            return null;
        }
        return zzeoVar;
    }

    @Override // com.google.android.gms.measurement.internal.z0
    public final Context zzau() {
        return this.f13553a;
    }

    @Override // com.google.android.gms.measurement.internal.z0
    public final Clock zzav() {
        return this.f13566n;
    }

    @Override // com.google.android.gms.measurement.internal.z0
    public final zzab zzaw() {
        return this.f13558f;
    }

    @Override // com.google.android.gms.measurement.internal.z0
    public final zzeo zzay() {
        r(this.f13561i);
        return this.f13561i;
    }

    @Override // com.google.android.gms.measurement.internal.z0
    public final zzfv zzaz() {
        r(this.f13562j);
        return this.f13562j;
    }
}

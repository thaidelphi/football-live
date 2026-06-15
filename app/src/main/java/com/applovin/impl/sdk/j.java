package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.b8;
import com.applovin.impl.c7;
import com.applovin.impl.d3;
import com.applovin.impl.d7;
import com.applovin.impl.e2;
import com.applovin.impl.e3;
import com.applovin.impl.h4;
import com.applovin.impl.i3;
import com.applovin.impl.j3;
import com.applovin.impl.k5;
import com.applovin.impl.k6;
import com.applovin.impl.l2;
import com.applovin.impl.m3;
import com.applovin.impl.mediation.MaxSegmentCollectionImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.n3;
import com.applovin.impl.n4;
import com.applovin.impl.o3;
import com.applovin.impl.o4;
import com.applovin.impl.p4;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.q0;
import com.applovin.impl.q3;
import com.applovin.impl.q4;
import com.applovin.impl.r4;
import com.applovin.impl.r6;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t5;
import com.applovin.impl.u5;
import com.applovin.impl.v1;
import com.applovin.impl.w1;
import com.applovin.impl.x6;
import com.applovin.impl.x7;
import com.applovin.impl.y1;
import com.applovin.impl.z1;
import com.applovin.impl.z3;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class j {

    /* renamed from: u0  reason: collision with root package name */
    public static j f8884u0;

    /* renamed from: v0  reason: collision with root package name */
    protected static Context f8885v0;

    /* renamed from: x0  reason: collision with root package name */
    private static final boolean f8887x0;

    /* renamed from: y0  reason: collision with root package name */
    private static volatile com.applovin.impl.c f8888y0;

    /* renamed from: a  reason: collision with root package name */
    private String f8890a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference f8892b;

    /* renamed from: c0  reason: collision with root package name */
    private List f8895c0;

    /* renamed from: d  reason: collision with root package name */
    private long f8896d;

    /* renamed from: f  reason: collision with root package name */
    private AppLovinSdkSettings f8900f;

    /* renamed from: g  reason: collision with root package name */
    private MaxSegmentCollection f8902g;

    /* renamed from: g0  reason: collision with root package name */
    private boolean f8903g0;

    /* renamed from: h  reason: collision with root package name */
    private String f8904h;

    /* renamed from: l0  reason: collision with root package name */
    private String f8913l0;

    /* renamed from: m  reason: collision with root package name */
    private volatile AppLovinSdk f8914m;

    /* renamed from: m0  reason: collision with root package name */
    private AppLovinSdkInitializationConfiguration f8915m0;

    /* renamed from: p0  reason: collision with root package name */
    private AppLovinSdk.SdkInitializationListener f8921p0;

    /* renamed from: q0  reason: collision with root package name */
    private AppLovinSdk.SdkInitializationListener f8923q0;

    /* renamed from: z0  reason: collision with root package name */
    private static final Object f8889z0 = new Object();

    /* renamed from: w0  reason: collision with root package name */
    private static final long f8886w0 = System.currentTimeMillis();

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f8898e = new AtomicBoolean();

    /* renamed from: i  reason: collision with root package name */
    private final AtomicReference f8906i = new AtomicReference();

    /* renamed from: j  reason: collision with root package name */
    private final AtomicReference f8908j = new AtomicReference();

    /* renamed from: k  reason: collision with root package name */
    private final AtomicReference f8910k = new AtomicReference();

    /* renamed from: l  reason: collision with root package name */
    private final AtomicReference f8912l = new AtomicReference();

    /* renamed from: n  reason: collision with root package name */
    private final n f8916n = new n(this);

    /* renamed from: o  reason: collision with root package name */
    private final z1 f8918o = new z1(this);

    /* renamed from: p  reason: collision with root package name */
    private final AtomicReference f8920p = new AtomicReference();

    /* renamed from: q  reason: collision with root package name */
    private final AtomicReference f8922q = new AtomicReference();

    /* renamed from: r  reason: collision with root package name */
    private final AtomicReference f8924r = new AtomicReference();

    /* renamed from: s  reason: collision with root package name */
    private final AtomicReference f8926s = new AtomicReference();

    /* renamed from: t  reason: collision with root package name */
    private final AtomicReference f8928t = new AtomicReference();

    /* renamed from: u  reason: collision with root package name */
    private final AtomicReference f8930u = new AtomicReference();

    /* renamed from: v  reason: collision with root package name */
    private final AtomicReference f8931v = new AtomicReference();

    /* renamed from: w  reason: collision with root package name */
    private final AtomicReference f8932w = new AtomicReference();

    /* renamed from: x  reason: collision with root package name */
    private final AtomicReference f8933x = new AtomicReference();

    /* renamed from: y  reason: collision with root package name */
    private final AtomicReference f8934y = new AtomicReference();

    /* renamed from: z  reason: collision with root package name */
    private final AtomicReference f8935z = new AtomicReference();
    private final AtomicReference A = new AtomicReference();
    private final AtomicReference B = new AtomicReference();
    private final AtomicReference C = new AtomicReference();
    private final AtomicReference D = new AtomicReference();
    private final AtomicReference E = new AtomicReference();
    private final AtomicReference F = new AtomicReference();
    private final AtomicReference G = new AtomicReference();
    private final AtomicReference H = new AtomicReference();
    private final AtomicReference I = new AtomicReference();
    private final AtomicReference J = new AtomicReference();
    private final AtomicReference K = new AtomicReference();
    private final AtomicReference L = new AtomicReference();
    private final AtomicReference M = new AtomicReference();
    private final AtomicReference N = new AtomicReference();
    private final AtomicReference O = new AtomicReference();
    private final AtomicReference P = new AtomicReference();
    private final AtomicReference Q = new AtomicReference();
    private final AtomicReference R = new AtomicReference();
    private final AtomicReference S = new AtomicReference();
    private final AtomicReference T = new AtomicReference();
    private final AtomicReference U = new AtomicReference();
    private final AtomicReference V = new AtomicReference();
    private final AtomicReference W = new AtomicReference();
    private final AtomicReference X = new AtomicReference();
    private final AtomicReference Y = new AtomicReference();
    private final AtomicReference Z = new AtomicReference();

    /* renamed from: a0  reason: collision with root package name */
    private final AtomicReference f8891a0 = new AtomicReference();

    /* renamed from: b0  reason: collision with root package name */
    private final AtomicReference f8893b0 = new AtomicReference();

    /* renamed from: d0  reason: collision with root package name */
    private final Object f8897d0 = new Object();

    /* renamed from: e0  reason: collision with root package name */
    private final AtomicBoolean f8899e0 = new AtomicBoolean(true);

    /* renamed from: f0  reason: collision with root package name */
    private final AtomicBoolean f8901f0 = new AtomicBoolean();

    /* renamed from: h0  reason: collision with root package name */
    private boolean f8905h0 = false;

    /* renamed from: i0  reason: collision with root package name */
    private boolean f8907i0 = false;

    /* renamed from: j0  reason: collision with root package name */
    private boolean f8909j0 = false;

    /* renamed from: k0  reason: collision with root package name */
    private int f8911k0 = 0;

    /* renamed from: n0  reason: collision with root package name */
    private final Object f8917n0 = new Object();

    /* renamed from: o0  reason: collision with root package name */
    private AppLovinSdkConfiguration f8919o0 = new SdkConfigurationImpl(null, this);

    /* renamed from: r0  reason: collision with root package name */
    private final AtomicBoolean f8925r0 = new AtomicBoolean(false);

    /* renamed from: s0  reason: collision with root package name */
    private final z4 f8927s0 = new k6(this, true, "scheduleAdLoadIntegrationError", new Runnable() { // from class: com.applovin.impl.sdk.s0
        @Override // java.lang.Runnable
        public final void run() {
            j.this.C0();
        }
    });

    /* renamed from: t0  reason: collision with root package name */
    private final z4 f8929t0 = new k6(this, true, "sdkInit", new Runnable() { // from class: com.applovin.impl.sdk.w0
        @Override // java.lang.Runnable
        public final void run() {
            j.this.D0();
        }
    });

    /* renamed from: c  reason: collision with root package name */
    private final long f8894c = System.currentTimeMillis();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements k5.b {
        a() {
        }

        @Override // com.applovin.impl.k5.b
        public void a(JSONObject jSONObject) {
            boolean z10 = jSONObject != null && jSONObject.length() > 0;
            j.this.c(jSONObject);
            com.applovin.impl.v.b(j.this);
            com.applovin.impl.o0.a(jSONObject, z10, j.this);
            j.this.M().a(JsonUtils.getBoolean(jSONObject, "smd", Boolean.FALSE).booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
            j.this.D().a();
            j jVar = j.this;
            jVar.f8895c0 = jVar.a(jSONObject);
            if (z10) {
                List<String> explode = CollectionUtils.explode(JsonUtils.getString(jSONObject, "eaaui", ""));
                j jVar2 = j.this;
                jVar2.f8919o0 = new SdkConfigurationImpl(explode, jVar2);
            }
            j.this.k0().a(jSONObject);
            j.this.b(jSONObject);
            l2.b(((Boolean) j.this.a(o4.W5)).booleanValue());
            l2.a(((Boolean) j.this.a(o4.X5)).booleanValue());
            j.this.K0();
            if (!((Boolean) j.this.a(o4.f8102e3)).booleanValue() || z10 || !com.applovin.impl.o0.a(j.m())) {
                j.this.J0();
                return;
            }
            j.this.I();
            if (n.a()) {
                j.this.I().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
            }
            j.this.P0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements q0.b {
        b() {
        }

        @Override // com.applovin.impl.q0.b
        public void a(q0.a aVar) {
            j.this.I();
            if (n.a()) {
                n I = j.this.I();
                I.a("AppLovinSdk", "Terms and Privacy Policy flow completed with status: " + aVar);
            }
            if (aVar.c()) {
                j.this.I();
                if (n.a()) {
                    j.this.I().a("AppLovinSdk", "Re-initializing SDK with the updated privacy settings...");
                }
                j.this.O0();
                j.this.L0();
                return;
            }
            j.this.e("Initializing SDK in MAX environment...");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements k5.b {
        c() {
        }

        @Override // com.applovin.impl.k5.b
        public void a(JSONObject jSONObject) {
            if (jSONObject != null && jSONObject.length() > 0) {
                j.this.c(jSONObject);
            }
            j.this.f8898e.set(false);
            j.this.J0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements q3.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q3 f8939a;

        d(q3 q3Var) {
            this.f8939a = q3Var;
        }

        @Override // com.applovin.impl.q3.a
        public void a() {
            j.this.I();
            if (n.a()) {
                j.this.I().d("AppLovinSdk", "Connected to internet - re-initializing SDK");
            }
            synchronized (j.this.f8897d0) {
                if (!j.this.f8903g0) {
                    j.this.O0();
                }
            }
            this.f8939a.b(this);
        }

        @Override // com.applovin.impl.q3.a
        public void b() {
        }
    }

    static {
        try {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.p0
                @Override // java.lang.Runnable
                public final void run() {
                    d7.c();
                }
            });
            f8887x0 = true;
        } catch (Throwable unused) {
            f8887x0 = false;
        }
    }

    public j(Context context) {
        this.f8903g0 = false;
        this.f8900f = new AppLovinSdkSettings(context);
        this.f8903g0 = true;
        if (w0()) {
            f8885v0 = context.getApplicationContext();
            if (context instanceof Activity) {
                this.f8892b = new WeakReference((Activity) context);
            }
            if (f8884u0 == null) {
                f8884u0 = this;
                return;
            } else {
                n.h("AppLovinSdk", "Multiple SDK instances detected");
                return;
            }
        }
        throw new RuntimeException("As of version 12.0.0, the AppLovin MAX SDK requires Java 8. For more information visit our docs: https://developers.applovin.com/en/android/overview/integration");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0() {
        if (i0().d()) {
            return;
        }
        I();
        if (n.a()) {
            I().a("AppLovinSdk", "Timing out adapters init...");
        }
        i0().e();
        H0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0() {
        u5 i02 = i0();
        int i10 = this.f8911k0 + 1;
        this.f8911k0 = i10;
        i02.a((z4) new k5(i10, this, new c()), u5.b.CORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C0() {
        if (y0()) {
            e2.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D0() {
        synchronized (this.f8897d0) {
            boolean a10 = com.applovin.impl.o0.a(m());
            if (!y0()) {
                I();
                if (n.a()) {
                    n I = I();
                    I.a("AppLovinSdk", "non-MAX mediation detected, mediation provider is: " + N());
                }
            }
            if (!((Boolean) a(o4.f8110f3)).booleanValue() || a10) {
                O0();
            }
            if (((Boolean) a(o4.f8102e3)).booleanValue() && !a10) {
                I();
                if (n.a()) {
                    I().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
                }
                P0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E0() {
        if (u0()) {
            return;
        }
        this.f8927s0.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F0() {
        if (u0()) {
            return;
        }
        this.f8925r0.set(true);
        this.f8929t0.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G0() {
        c(q4.I);
    }

    private q I0() {
        if (h4.f(f8885v0)) {
            try {
                return new q(this);
            } catch (Throwable th) {
                n.b("AppLovinSdk", "Failed to initialize Privacy Sandbox Service", th);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0() {
        Long l10 = (Long) a(o4.f8174n3);
        if (l10.longValue() >= 0 && this.f8898e.compareAndSet(false, true)) {
            x7.a(l10.longValue(), false, this, new Runnable() { // from class: com.applovin.impl.sdk.t0
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.B0();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K0() {
        if (!y0()) {
            e("Initializing SDK in non-MAX environment...");
        } else if (!this.f8901f0.compareAndSet(false, true)) {
            e("Consent flow is already shown. Initializing SDK in MAX environment...");
        } else if (!u().j()) {
            e("Consent flow is not enabled. Initializing SDK in MAX environment...");
        } else {
            u().a(m0(), new b());
        }
    }

    private void M0() {
        Context context = f8885v0;
        n I = I();
        r4 h02 = h0();
        com.applovin.impl.q0 u10 = u();
        a(context);
        e0();
        i();
        n();
        U();
        K().a(MaxAdapter.InitializationStatus.INITIALIZING);
        NativeCrashReporter.a(this);
        String str = this.f8890a;
        if (str == null || str.length() != 86) {
            n.h("AppLovinSdk", "Please double-check that you entered your SDK key correctly (" + this.f8890a + ") : " + Log.getStackTraceString(new Throwable("")));
        }
        if ("HSrCHRtOan6wp2kwOIGJC1RDtuSrF2mWVbio2aBcMHX9KF3iTJ1lLSzCKP1ZSo5yNolPNw1kCTtWpxELFF4ah1".equalsIgnoreCase(this.f8890a)) {
            n.h("AppLovinSdk", "Cross Promo SDK has been deprecated and is no longer supported");
            if (d7.c(this)) {
                throw new RuntimeException("Cross Promo SDK has been deprecated and is no longer supported");
            }
            return;
        }
        if (u10.l()) {
            String str2 = "Terms Flow has been replaced. " + u10.g();
            if (!d7.c(this)) {
                n.h("AppLovinSdk", str2);
            } else {
                throw new IllegalStateException(str2);
            }
        }
        if (d7.i()) {
            n.h("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
        }
        if (!d7.b(this)) {
            n.h("AppLovinSdk", "Detected non-Android core JSON library. Please double-check that none of your third party libraries include custom implementation of org.json.JSONObject.");
        }
        if (d7.k(context)) {
            this.f8900f.setVerboseLogging(true);
        }
        g0().a(o4.f8146k, Boolean.valueOf(this.f8900f.isVerboseLoggingEnabled()));
        o3.c(this);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        q4 q4Var = q4.f8440c;
        if (TextUtils.isEmpty((String) h02.a(q4Var, (Object) null, defaultSharedPreferences))) {
            this.f8907i0 = true;
            h02.b(q4Var, Boolean.toString(true), defaultSharedPreferences);
        } else {
            h02.b(q4Var, Boolean.toString(false), defaultSharedPreferences);
        }
        q4 q4Var2 = q4.f8441d;
        if (((Boolean) h02.a(q4Var2, Boolean.FALSE)).booleanValue()) {
            if (n.a()) {
                I.a("AppLovinSdk", "Initializing SDK for non-maiden launch");
            }
            this.f8909j0 = true;
        } else {
            if (n.a()) {
                I.a("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            h02.b(q4Var2, Boolean.TRUE);
            h02.b(q4.f8452o, Boolean.valueOf(u10.j()));
        }
        q4 q4Var3 = q4.f8442e;
        String str3 = (String) h02.a(q4Var3, null);
        if (StringUtils.isValidString(str3)) {
            if (AppLovinSdk.VERSION_CODE > d7.f(str3)) {
                h02.b(q4Var3, AppLovinSdk.VERSION);
            }
        } else {
            h02.b(q4Var3, AppLovinSdk.VERSION);
        }
        D().a(y1.f9662e, (Map) null, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0() {
        M0();
        if (this.f8900f.isExceptionHandlerEnabled() && ((Boolean) a(o4.f8218t)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        int parseInt = StringUtils.parseInt(this.f8900f.getExtraParameters().get("initialization_delay_ms"), ((Integer) a(o4.f8127h4)).intValue());
        u5 i02 = i0();
        k6 k6Var = new k6(this, true, "scheduleAdLoadIntegrationErrorAuto", new Runnable() { // from class: com.applovin.impl.sdk.q0
            @Override // java.lang.Runnable
            public final void run() {
                j.this.E0();
            }
        });
        u5.b bVar = u5.b.CORE;
        long j10 = parseInt;
        i02.a(k6Var, bVar, j10);
        i0().a(new k6(this, true, "scheduleSdkInit", new Runnable() { // from class: com.applovin.impl.sdk.u0
            @Override // java.lang.Runnable
            public final void run() {
                j.this.F0();
            }
        }), bVar, j10);
    }

    private Map O() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) a(o4.f8135i4)));
        } catch (JSONException unused) {
            return Collections.emptyMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0() {
        q3 U = U();
        U.a(new d(U));
    }

    public static long l() {
        return f8886w0;
    }

    public static Context m() {
        return f8885v0;
    }

    public static boolean w0() {
        return f8887x0;
    }

    public l A() {
        Object obj = this.A.get();
        if (obj == null) {
            synchronized (this.A) {
                obj = this.A.get();
                if (obj == null) {
                    obj = new l(this);
                    this.A.set(obj);
                }
            }
        }
        if (obj == this.A) {
            obj = null;
        }
        return (l) obj;
    }

    public m B() {
        Object obj = this.C.get();
        if (obj == null) {
            synchronized (this.C) {
                obj = this.C.get();
                if (obj == null) {
                    obj = new m(this);
                    this.C.set(obj);
                }
            }
        }
        if (obj == this.C) {
            obj = null;
        }
        return (m) obj;
    }

    public w1 C() {
        Object obj = this.f8926s.get();
        if (obj == null) {
            synchronized (this.f8926s) {
                obj = this.f8926s.get();
                if (obj == null) {
                    obj = new w1(this);
                    this.f8926s.set(obj);
                }
            }
        }
        if (obj == this.f8926s) {
            obj = null;
        }
        return (w1) obj;
    }

    public z1 D() {
        return this.f8918o;
    }

    public s2 E() {
        Object obj = this.W.get();
        if (obj == null) {
            synchronized (this.W) {
                obj = this.W.get();
                if (obj == null) {
                    obj = new s2(this);
                    this.W.set(obj);
                }
            }
        }
        if (obj == this.W) {
            obj = null;
        }
        return (s2) obj;
    }

    public Activity F() {
        WeakReference weakReference = this.f8892b;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public AppLovinSdkInitializationConfiguration G() {
        return this.f8915m0;
    }

    public long H() {
        return this.f8894c;
    }

    public void H0() {
        final AppLovinSdk.SdkInitializationListener sdkInitializationListener;
        if (u().i() || (sdkInitializationListener = this.f8921p0) == null) {
            return;
        }
        if (s0()) {
            this.f8921p0 = null;
            this.f8923q0 = null;
            K().a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
        } else if (this.f8923q0 == sdkInitializationListener) {
            return;
        } else {
            K().a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
            if (((Boolean) a(o4.f8194q)).booleanValue()) {
                this.f8921p0 = null;
            } else {
                this.f8923q0 = sdkInitializationListener;
            }
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.x0
            @Override // java.lang.Runnable
            public final void run() {
                j.this.d(sdkInitializationListener);
            }
        }, Math.max(0L, ((Long) a(o4.f8202r)).longValue()));
    }

    public n I() {
        return this.f8916n;
    }

    public com.applovin.impl.mediation.d J() {
        Object obj = this.f8891a0.get();
        if (obj == null) {
            synchronized (this.f8891a0) {
                obj = this.f8891a0.get();
                if (obj == null) {
                    obj = new com.applovin.impl.mediation.d(this);
                    this.f8891a0.set(obj);
                }
            }
        }
        if (obj == this.f8891a0) {
            obj = null;
        }
        return (com.applovin.impl.mediation.d) obj;
    }

    public com.applovin.impl.mediation.e K() {
        Object obj = this.U.get();
        if (obj == null) {
            synchronized (this.U) {
                obj = this.U.get();
                if (obj == null) {
                    obj = new com.applovin.impl.mediation.e(this);
                    this.U.set(obj);
                }
            }
        }
        if (obj == this.U) {
            obj = null;
        }
        return (com.applovin.impl.mediation.e) obj;
    }

    public com.applovin.impl.mediation.f L() {
        Object obj = this.T.get();
        if (obj == null) {
            synchronized (this.T) {
                obj = this.T.get();
                if (obj == null) {
                    obj = new com.applovin.impl.mediation.f(this);
                    this.T.set(obj);
                }
            }
        }
        if (obj == this.T) {
            obj = null;
        }
        return (com.applovin.impl.mediation.f) obj;
    }

    public void L0() {
        q().a();
    }

    public i3 M() {
        Object obj = this.Y.get();
        if (obj == null) {
            synchronized (this.Y) {
                obj = this.Y.get();
                if (obj == null) {
                    obj = new i3(this);
                    this.Y.set(obj);
                }
            }
        }
        if (obj == this.Y) {
            obj = null;
        }
        return (i3) obj;
    }

    public String N() {
        String str = (String) a(q4.I);
        return StringUtils.isValidString(str) ? str : this.f8904h;
    }

    public void O0() {
        synchronized (this.f8897d0) {
            this.f8903g0 = true;
            i0().f();
            d();
        }
    }

    public MediationServiceImpl P() {
        Object obj = this.V.get();
        if (obj == null) {
            synchronized (this.V) {
                obj = this.V.get();
                if (obj == null) {
                    obj = new MediationServiceImpl(this);
                    this.V.set(obj);
                }
            }
        }
        if (obj == this.V) {
            obj = null;
        }
        return (MediationServiceImpl) obj;
    }

    public m3 Q() {
        Object obj = this.f8928t.get();
        if (obj == null) {
            synchronized (this.f8928t) {
                obj = this.f8928t.get();
                if (obj == null) {
                    obj = new m3(this);
                    this.f8928t.set(obj);
                }
            }
        }
        if (obj == this.f8928t) {
            obj = null;
        }
        return (m3) obj;
    }

    public void Q0() {
        n.h("AppLovinSdk", "Resetting SDK state...");
        w1 C = C();
        v1 v1Var = v1.f9438l;
        long b10 = C.b(v1Var);
        g0().a();
        g0().e();
        C().a();
        C().b(v1Var, b10 + 1);
        if (this.f8899e0.compareAndSet(true, false)) {
            O0();
        } else {
            this.f8899e0.set(true);
        }
    }

    public n3 R() {
        Object obj = this.X.get();
        if (obj == null) {
            synchronized (this.X) {
                obj = this.X.get();
                if (obj == null) {
                    obj = new n3();
                    this.X.set(obj);
                }
            }
        }
        if (obj == this.X) {
            obj = null;
        }
        return (n3) obj;
    }

    public void R0() {
        if (StringUtils.isValidString(this.f8913l0)) {
            return;
        }
        this.f8913l0 = AppLovinMediationProvider.MAX;
        I();
        if (n.a()) {
            I().a("AppLovinSdk", "Detected mediation provider: MAX");
        }
    }

    public o S() {
        Object obj = this.Z.get();
        if (obj == null) {
            synchronized (this.Z) {
                obj = this.Z.get();
                if (obj == null) {
                    obj = new o(this);
                    this.Z.set(obj);
                }
            }
        }
        if (obj == this.Z) {
            obj = null;
        }
        return (o) obj;
    }

    public void S0() {
        v().n();
    }

    public AppLovinNativeAdService T() {
        Object obj = this.f8908j.get();
        if (obj == null) {
            synchronized (this.f8908j) {
                obj = this.f8908j.get();
                if (obj == null) {
                    obj = new AppLovinNativeAdService(this);
                    this.f8908j.set(obj);
                }
            }
        }
        if (obj == this.f8908j) {
            obj = null;
        }
        return (AppLovinNativeAdService) obj;
    }

    public void T0() {
        a((Map) null);
    }

    public q3 U() {
        Object obj = this.F.get();
        if (obj == null) {
            synchronized (this.F) {
                obj = this.F.get();
                if (obj == null) {
                    obj = new q3(m());
                    this.F.set(obj);
                }
            }
        }
        if (obj == this.F) {
            obj = null;
        }
        return (q3) obj;
    }

    public void U0() {
        if (AppLovinMediationProvider.ADMOB.equalsIgnoreCase(this.f8904h) && ((Boolean) a(o4.K3)).booleanValue()) {
            String str = (String) a(o4.J3);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            String str2 = AppLovinSdk.VERSION;
            sb.append(str2);
            sb.append(".");
            if (str.startsWith(sb.toString())) {
                return;
            }
            final String str3 = "Mismatched AdMob adapter (" + str + ") and AppLovin SDK (" + str2 + ") versions detected, which may cause compatibility issues.";
            n.h("AppLovinSdk", str3);
            AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.n0
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.d(str3);
                }
            });
        }
    }

    public z3 V() {
        Object obj = this.M.get();
        if (obj == null) {
            synchronized (this.M) {
                obj = this.M.get();
                if (obj == null) {
                    obj = new z3(this);
                    this.M.set(obj);
                }
            }
        }
        if (obj == this.M) {
            obj = null;
        }
        return (z3) obj;
    }

    public com.applovin.impl.sdk.network.b W() {
        Object obj = this.R.get();
        if (obj == null) {
            synchronized (this.R) {
                obj = this.R.get();
                if (obj == null) {
                    obj = new com.applovin.impl.sdk.network.b(this);
                    this.R.set(obj);
                }
            }
        }
        if (obj == this.R) {
            obj = null;
        }
        return (com.applovin.impl.sdk.network.b) obj;
    }

    public PostbackServiceImpl X() {
        Object obj = this.Q.get();
        if (obj == null) {
            synchronized (this.Q) {
                obj = this.Q.get();
                if (obj == null) {
                    obj = new PostbackServiceImpl(this);
                    this.Q.set(obj);
                }
            }
        }
        if (obj == this.Q) {
            obj = null;
        }
        return (PostbackServiceImpl) obj;
    }

    public q Y() {
        Object obj = this.f8931v.get();
        if (obj == null) {
            synchronized (this.f8931v) {
                obj = this.f8931v.get();
                if (obj == null) {
                    obj = I0();
                    if (obj == null) {
                        obj = this.f8931v;
                    }
                    this.f8931v.set(obj);
                }
            }
        }
        if (obj == this.f8931v) {
            obj = null;
        }
        return (q) obj;
    }

    public String Z() {
        return o0().a();
    }

    public String a0() {
        return this.f8890a;
    }

    public MaxSegmentCollectionImpl b0() {
        return (MaxSegmentCollectionImpl) this.f8902g;
    }

    public Map c0() {
        MaxSegmentCollectionImpl b02 = b0();
        if (b02 == null) {
            return null;
        }
        return b02.getJsonData();
    }

    public n4 d0() {
        Object obj = this.H.get();
        if (obj == null) {
            synchronized (this.H) {
                obj = this.H.get();
                if (obj == null) {
                    obj = new n4(this);
                    this.H.set(obj);
                }
            }
        }
        if (obj == this.H) {
            obj = null;
        }
        return (n4) obj;
    }

    public SessionTracker e0() {
        Object obj = this.B.get();
        if (obj == null) {
            synchronized (this.B) {
                obj = this.B.get();
                if (obj == null) {
                    obj = new SessionTracker(this);
                    this.B.set(obj);
                }
            }
        }
        if (obj == this.B) {
            obj = null;
        }
        return (SessionTracker) obj;
    }

    public AppLovinSdkSettings f0() {
        return this.f8900f;
    }

    public com.applovin.impl.sdk.d g() {
        Object obj = this.P.get();
        if (obj == null) {
            synchronized (this.P) {
                obj = this.P.get();
                if (obj == null) {
                    obj = new com.applovin.impl.sdk.d(this);
                    this.P.set(obj);
                }
            }
        }
        if (obj == this.P) {
            obj = null;
        }
        return (com.applovin.impl.sdk.d) obj;
    }

    public p4 g0() {
        Object obj = this.f8922q.get();
        if (obj == null) {
            synchronized (this.f8922q) {
                obj = this.f8922q.get();
                if (obj == null) {
                    obj = new p4(this);
                    this.f8922q.set(obj);
                }
            }
        }
        if (obj == this.f8922q) {
            obj = null;
        }
        return (p4) obj;
    }

    public e h() {
        Object obj = this.f8934y.get();
        if (obj == null) {
            synchronized (this.f8934y) {
                obj = this.f8934y.get();
                if (obj == null) {
                    obj = new e(this);
                    this.f8934y.set(obj);
                }
            }
        }
        if (obj == this.f8934y) {
            obj = null;
        }
        return (e) obj;
    }

    public r4 h0() {
        Object obj = this.f8932w.get();
        if (obj == null) {
            synchronized (this.f8932w) {
                obj = this.f8932w.get();
                if (obj == null) {
                    obj = new r4(this);
                    this.f8932w.set(obj);
                }
            }
        }
        if (obj == this.f8932w) {
            obj = null;
        }
        return (r4) obj;
    }

    public com.applovin.impl.f i() {
        Object obj = this.S.get();
        if (obj == null) {
            synchronized (this.S) {
                obj = this.S.get();
                if (obj == null) {
                    obj = new com.applovin.impl.f(this);
                    this.S.set(obj);
                }
            }
        }
        if (obj == this.S) {
            obj = null;
        }
        return (com.applovin.impl.f) obj;
    }

    public u5 i0() {
        Object obj = this.f8920p.get();
        if (obj == null) {
            synchronized (this.f8920p) {
                obj = this.f8920p.get();
                if (obj == null) {
                    obj = new u5(this);
                    this.f8920p.set(obj);
                }
            }
        }
        if (obj == this.f8920p) {
            obj = null;
        }
        return (u5) obj;
    }

    public AppLovinAdServiceImpl j() {
        Object obj = this.f8906i.get();
        if (obj == null) {
            synchronized (this.f8906i) {
                obj = this.f8906i.get();
                if (obj == null) {
                    obj = new AppLovinAdServiceImpl(this);
                    this.f8906i.set(obj);
                }
            }
        }
        if (obj == this.f8906i) {
            obj = null;
        }
        return (AppLovinAdServiceImpl) obj;
    }

    public r6 j0() {
        Object obj = this.K.get();
        if (obj == null) {
            synchronized (this.K) {
                obj = this.K.get();
                if (obj == null) {
                    obj = new r6(this);
                    this.K.set(obj);
                }
            }
        }
        if (obj == this.K) {
            obj = null;
        }
        return (r6) obj;
    }

    public g k() {
        Object obj = this.D.get();
        if (obj == null) {
            synchronized (this.D) {
                obj = this.D.get();
                if (obj == null) {
                    obj = new g(this);
                    this.D.set(obj);
                }
            }
        }
        if (obj == this.D) {
            obj = null;
        }
        return (g) obj;
    }

    public x6 k0() {
        Object obj = this.f8893b0.get();
        if (obj == null) {
            synchronized (this.f8893b0) {
                obj = this.f8893b0.get();
                if (obj == null) {
                    obj = new x6(this);
                    this.f8893b0.set(obj);
                }
            }
        }
        if (obj == this.f8893b0) {
            obj = null;
        }
        return (x6) obj;
    }

    public long l0() {
        if (this.f8896d == 0) {
            return -1L;
        }
        return System.currentTimeMillis() - this.f8896d;
    }

    public Activity m0() {
        Activity b10 = a(m()).b();
        return b10 != null ? b10 : F();
    }

    public ArrayService n() {
        Object obj = this.N.get();
        if (obj == null) {
            synchronized (this.N) {
                obj = this.N.get();
                if (obj == null) {
                    obj = new ArrayService(this);
                    this.N.set(obj);
                }
            }
        }
        if (obj == this.N) {
            obj = null;
        }
        return (ArrayService) obj;
    }

    public String n0() {
        return o0().c();
    }

    public h o() {
        Object obj = this.I.get();
        if (obj == null) {
            synchronized (this.I) {
                obj = this.I.get();
                if (obj == null) {
                    obj = new h(this);
                    this.I.set(obj);
                }
            }
        }
        if (obj == this.I) {
            obj = null;
        }
        return (h) obj;
    }

    public c7 o0() {
        Object obj = this.f8933x.get();
        if (obj == null) {
            synchronized (this.f8933x) {
                obj = this.f8933x.get();
                if (obj == null) {
                    obj = new c7(this);
                    this.f8933x.set(obj);
                }
            }
        }
        if (obj == this.f8933x) {
            obj = null;
        }
        return (c7) obj;
    }

    public CmpServiceImpl p() {
        Object obj = this.f8912l.get();
        if (obj == null) {
            synchronized (this.f8912l) {
                obj = this.f8912l.get();
                if (obj == null) {
                    obj = new CmpServiceImpl(this);
                    this.f8912l.set(obj);
                }
            }
        }
        if (obj == this.f8912l) {
            obj = null;
        }
        return (CmpServiceImpl) obj;
    }

    public b8 p0() {
        Object obj = this.E.get();
        if (obj == null) {
            synchronized (this.E) {
                obj = this.E.get();
                if (obj == null) {
                    obj = new b8(this);
                    this.E.set(obj);
                }
            }
        }
        if (obj == this.E) {
            obj = null;
        }
        return (b8) obj;
    }

    public i q() {
        Object obj = this.G.get();
        if (obj == null) {
            synchronized (this.G) {
                obj = this.G.get();
                if (obj == null) {
                    obj = new i(this);
                    this.G.set(obj);
                }
            }
        }
        if (obj == this.G) {
            obj = null;
        }
        return (i) obj;
    }

    public AppLovinSdk q0() {
        return this.f8914m;
    }

    public String r() {
        return o0().b();
    }

    public boolean r0() {
        return this.f8909j0;
    }

    public AppLovinSdkConfiguration s() {
        return this.f8919o0;
    }

    public boolean s0() {
        boolean z10;
        synchronized (this.f8897d0) {
            z10 = this.f8905h0;
        }
        return z10;
    }

    public com.applovin.impl.n0 t() {
        Object obj = this.f8924r.get();
        if (obj == null) {
            synchronized (this.f8924r) {
                obj = this.f8924r.get();
                if (obj == null) {
                    obj = new com.applovin.impl.n0(this);
                    this.f8924r.set(obj);
                }
            }
        }
        if (obj == this.f8924r) {
            obj = null;
        }
        return (com.applovin.impl.n0) obj;
    }

    public boolean t0() {
        return this.f8907i0;
    }

    public String toString() {
        return "CoreSdk{sdkKey='" + this.f8890a + "', enabled=" + this.f8905h0 + ", isFirstSession=" + this.f8907i0 + '}';
    }

    public com.applovin.impl.q0 u() {
        Object obj = this.J.get();
        if (obj == null) {
            synchronized (this.J) {
                obj = this.J.get();
                if (obj == null) {
                    obj = new com.applovin.impl.q0(this);
                    this.J.set(obj);
                }
            }
        }
        if (obj == this.J) {
            obj = null;
        }
        return (com.applovin.impl.q0) obj;
    }

    public boolean u0() {
        boolean z10;
        synchronized (this.f8917n0) {
            z10 = this.f8915m0 != null;
        }
        return z10;
    }

    public com.applovin.impl.a1 v() {
        Object obj = this.L.get();
        if (obj == null) {
            synchronized (this.L) {
                obj = this.L.get();
                if (obj == null) {
                    obj = new com.applovin.impl.a1(this);
                    this.L.set(obj);
                }
            }
        }
        if (obj == this.L) {
            obj = null;
        }
        return (com.applovin.impl.a1) obj;
    }

    public boolean v0() {
        boolean z10;
        synchronized (this.f8897d0) {
            z10 = this.f8903g0;
        }
        return z10;
    }

    public com.applovin.impl.b1 w() {
        Object obj = this.O.get();
        if (obj == null) {
            synchronized (this.O) {
                obj = this.O.get();
                if (obj == null) {
                    obj = new com.applovin.impl.b1(this);
                    this.O.set(obj);
                }
            }
        }
        if (obj == this.O) {
            obj = null;
        }
        return (com.applovin.impl.b1) obj;
    }

    public k x() {
        Object obj = this.f8930u.get();
        if (obj == null) {
            synchronized (this.f8930u) {
                obj = this.f8930u.get();
                if (obj == null) {
                    obj = new k(this);
                    this.f8930u.set(obj);
                }
            }
        }
        if (obj == this.f8930u) {
            obj = null;
        }
        return (k) obj;
    }

    public AtomicBoolean x0() {
        return this.f8925r0;
    }

    public String y() {
        return this.f8913l0;
    }

    public boolean y0() {
        return StringUtils.containsIgnoreCase(N(), AppLovinMediationProvider.MAX);
    }

    public EventServiceImpl z() {
        Object obj = this.f8910k.get();
        if (obj == null) {
            synchronized (this.f8910k) {
                obj = this.f8910k.get();
                if (obj == null) {
                    obj = new EventServiceImpl(this);
                    this.f8910k.set(obj);
                }
            }
        }
        if (obj == this.f8910k) {
            obj = null;
        }
        return (EventServiceImpl) obj;
    }

    public boolean z0() {
        return d7.a("com.unity3d.player.UnityPlayerActivity");
    }

    private void d() {
        u5 i02 = i0();
        int i10 = this.f8911k0 + 1;
        this.f8911k0 = i10;
        i02.a((z4) new k5(i10, this, new a()), u5.b.CORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        I();
        if (n.a()) {
            I().a("AppLovinSdk", str);
        }
        i0().a(new t5(this));
    }

    public com.applovin.impl.sdk.a f() {
        Object obj = this.f8935z.get();
        if (obj == null) {
            synchronized (this.f8935z) {
                obj = this.f8935z.get();
                if (obj == null) {
                    obj = new com.applovin.impl.sdk.a(this);
                    this.f8935z.set(obj);
                }
            }
        }
        if (obj == this.f8935z) {
            obj = null;
        }
        return (com.applovin.impl.sdk.a) obj;
    }

    public void g(final String str) {
        n.g("AppLovinSdk", "Setting plugin version: " + str);
        if (d7.h()) {
            d7.a(new Runnable() { // from class: com.applovin.impl.sdk.o0
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.b(str);
                }
            });
        } else {
            g0().a(o4.J3, str);
        }
    }

    public void h(final String str) {
        I();
        if (n.a()) {
            n I = I();
            I.a("AppLovinSdk", "Setting user id: " + str);
        }
        if (StringUtils.isValidString(str) && str.length() > d7.b(8)) {
            n.h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + d7.b(8) + " maximum)");
        }
        if (d7.h()) {
            d7.a(new Runnable() { // from class: com.applovin.impl.sdk.m0
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.c(str);
                }
            });
        } else {
            o0().a(str);
        }
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        f8885v0 = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        this.f8896d = System.currentTimeMillis();
        com.applovin.impl.o0.c(jSONObject, this);
        com.applovin.impl.o0.b(jSONObject, this);
        com.applovin.impl.o0.a(jSONObject, this);
        e3.f(jSONObject, this);
        e3.d(jSONObject, this);
        e3.e(jSONObject, this);
        e3.g(jSONObject, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(String str) {
        if (!d7.c(this)) {
            HashMap hashMap = new HashMap();
            hashMap.put("details", AppLovinMediationProvider.ADMOB);
            hashMap.put("error_message", str);
            D().a(y1.f9677l0, "adapterVersionMismatch", hashMap);
            return;
        }
        throw new IllegalStateException(str);
    }

    public void f(String str) {
        I();
        if (n.a()) {
            n I = I();
            I.a("AppLovinSdk", "setMediationProvider(mediationProvider=" + str + ")");
        }
        if (str != null && (str.isEmpty() || str.length() > 64 || !StringUtils.isAlphaNumeric(str))) {
            n.h("AppLovinSdk", "Mediation provider set to invalid value: " + str + ". Please use a valid mediation provider (e.g., AppLovinMediationProvider.MAX)");
            return;
        }
        this.f8904h = str;
        if (d7.h()) {
            d7.a(new Runnable() { // from class: com.applovin.impl.sdk.j0
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.G0();
                }
            });
        } else {
            c(q4.I);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        sdkInitializationListener.onSdkInitialized(this.f8919o0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration) {
        M0();
        this.f8900f.attachAppLovinSdk(this);
        String pluginVersion = appLovinSdkInitializationConfiguration.getPluginVersion();
        if (pluginVersion != null) {
            n.g("AppLovinSdk", "Setting plugin version: " + pluginVersion);
            g0().a(o4.J3, pluginVersion);
        }
        if (appLovinSdkInitializationConfiguration.isExceptionHandlerEnabled() && ((Boolean) a(o4.f8218t)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        u5 i02 = i0();
        z4 z4Var = this.f8927s0;
        u5.b bVar = u5.b.CORE;
        i02.a(z4Var, bVar);
        i0().a(this.f8929t0, bVar);
    }

    public com.applovin.impl.c e() {
        return a(f8885v0);
    }

    public void a(AppLovinSdk appLovinSdk) {
        this.f8914m = appLovinSdk;
    }

    public static String a(String str) {
        return a(str, (List) null);
    }

    public static String a(int i10) {
        return a(i10, (List) null);
    }

    public static String a(String str, List list) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Context m7 = m();
        return a(m7.getResources().getIdentifier(str, "string", m7.getPackageName()), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        I();
        if (n.a()) {
            I().a("AppLovinSdk", "Calling back publisher's initialization completion handler...");
        }
        sdkInitializationListener.onSdkInitialized(this.f8919o0);
    }

    public void c() {
        synchronized (this.f8897d0) {
            if (!this.f8903g0 && !this.f8905h0) {
                O0();
            }
        }
    }

    public static String a(int i10, List list) {
        String string = m().getResources().getString(i10);
        return list != null ? String.format(string, list.toArray()) : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        for (String str : JsonUtils.getList(jSONObject, "error_messages", Collections.emptyList())) {
            n.h("AppLovinSdk", str);
        }
    }

    public static com.applovin.impl.c a(Context context) {
        if (f8888y0 == null) {
            synchronized (f8889z0) {
                if (f8888y0 == null) {
                    f8888y0 = new com.applovin.impl.c(context);
                }
            }
        }
        return f8888y0;
    }

    public List c(o4 o4Var) {
        return g0().c(o4Var);
    }

    public void c(q4 q4Var) {
        h0().b(q4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        sdkInitializationListener.onSdkInitialized(this.f8919o0);
    }

    public List b(o4 o4Var) {
        return g0().b(o4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        o0().a(str);
    }

    public void b(q4 q4Var, Object obj) {
        h0().b(q4Var, obj);
    }

    public Object b(q4 q4Var) {
        return h0().a(q4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
        r12 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
        if (r12.hasNext() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
        r13 = (java.util.Map.Entry) r12.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
        if (r11.startsWith((java.lang.String) r13.getKey()) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
        r15.f8913l0 = (java.lang.String) r13.getValue();
        I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
        if (com.applovin.impl.sdk.n.a() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
        r4 = I();
        r4.a("AppLovinSdk", "Detected mediation provider: " + r15.f8913l0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b6, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
        if (r6.booleanValue() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
        r2.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c0, code lost:
        r8 = java.lang.Integer.valueOf(r8.intValue() - 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String b() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.j.b():java.lang.String");
    }

    public void a(final AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, final AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        if (this.f8925r0.get()) {
            n.h("AppLovinSdk", "Invalid initialization process: please remove the applovin.sdk.key entry from your AndroidManifest.xml and set your SDK key with the AppLovinSdkInitializationConfiguration object. Then initialize the SDK as soon as possible with \"AppLovinSdk#initialize(AppLovinSdkInitializationConfiguration, AppLovinSdk.SdkInitializationListener)\" before accessing any SDK fields or APIs.");
            D().a(y1.f9677l0, MobileAdsBridgeBase.initializeMethodName, CollectionUtils.map("legacy", com.ironsource.mediationsdk.metadata.a.f18924g));
            if (d7.c(this)) {
                throw new IllegalStateException("Invalid initialization process: please remove the applovin.sdk.key entry from your AndroidManifest.xml and set your SDK key with the AppLovinSdkInitializationConfiguration object. Then initialize the SDK as soon as possible with \"AppLovinSdk#initialize(AppLovinSdkInitializationConfiguration, AppLovinSdk.SdkInitializationListener)\" before accessing any SDK fields or APIs.");
            }
            return;
        }
        synchronized (this.f8917n0) {
            if (this.f8915m0 != null) {
                n.h("AppLovinSdk", "AppLovin SDK already initialized with configuration: " + this.f8915m0 + ". Ignoring the provided initialization configuration.");
                if (!s0() || sdkInitializationListener == null) {
                    return;
                }
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.this.b(sdkInitializationListener);
                    }
                });
                return;
            }
            this.f8915m0 = appLovinSdkInitializationConfiguration;
            this.f8921p0 = sdkInitializationListener;
            this.f8890a = appLovinSdkInitializationConfiguration.getSdkKey();
            this.f8904h = appLovinSdkInitializationConfiguration.getMediationProvider();
            this.f8902g = appLovinSdkInitializationConfiguration.getSegmentCollection();
            d7.a(new Runnable() { // from class: com.applovin.impl.sdk.l0
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.a(appLovinSdkInitializationConfiguration);
                }
            });
        }
    }

    public void a(String str, AppLovinSdkSettings appLovinSdkSettings) {
        x0().set(true);
        this.f8890a = str;
        this.f8900f = appLovinSdkSettings;
        if (TextUtils.isEmpty(str)) {
            n.h("AppLovinSdk", "Unable to find AppLovin SDK key. Please add  meta-data android:name=\"applovin.sdk.key\" android:value=\"YOUR_SDK_KEY_HERE\" into AndroidManifest.xml.");
            n.h("AppLovinSdk", "Called with an invalid SDK key from: " + Log.getStackTraceString(new Throwable("")));
        }
        d7.a(new Runnable() { // from class: com.applovin.impl.sdk.r0
            @Override // java.lang.Runnable
            public final void run() {
                j.this.N0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        g0().a(o4.J3, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a(JSONObject jSONObject) {
        List<String> asList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", "").split(","));
        ArrayList arrayList = new ArrayList(asList.size());
        for (String str : asList) {
            MaxAdFormat formatFromString = MaxAdFormat.formatFromString(str);
            if (formatFromString != null) {
                arrayList.add(formatFromString);
            }
        }
        return arrayList;
    }

    public void a(boolean z10) {
        synchronized (this.f8897d0) {
            this.f8903g0 = false;
            this.f8905h0 = z10;
        }
        if (z10) {
            List c10 = c(j3.C6);
            if (c10.isEmpty()) {
                i0().e();
                H0();
                return;
            }
            Long l10 = (Long) a(j3.D6);
            k6 k6Var = new k6(this, true, "timeoutInitAdapters", new Runnable() { // from class: com.applovin.impl.sdk.v0
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.A0();
                }
            });
            I();
            if (n.a()) {
                n I = I();
                I.a("AppLovinSdk", "Waiting for required adapters to init: " + c10 + " - timing out in " + l10 + "ms...");
            }
            i0().a(k6Var, u5.b.TIMEOUT, l10.longValue(), true);
        }
    }

    public void a(d3 d3Var) {
        if (i0().d()) {
            return;
        }
        List c10 = c(j3.C6);
        if (c10.size() <= 0 || !K().a().containsAll(c10)) {
            return;
        }
        I();
        if (n.a()) {
            I().a("AppLovinSdk", "All required adapters initialized");
        }
        i0().e();
        H0();
    }

    public boolean a(MaxAdFormat maxAdFormat) {
        List list = this.f8895c0;
        return (list == null || list.size() <= 0 || this.f8895c0.contains(maxAdFormat)) ? false : true;
    }

    public void a() {
        String str = (String) h0().a(q4.f8442e, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE < d7.f(str)) {
                n.h("AppLovinSdk", "Current version (" + AppLovinSdk.VERSION + ") is older than earlier installed version (" + str + "), which may cause compatibility issues.");
            }
        }
    }

    public Object a(o4 o4Var) {
        return g0().a(o4Var);
    }

    public boolean a(o4 o4Var, MaxAdFormat maxAdFormat) {
        return b(o4Var).contains(maxAdFormat);
    }

    public void a(Map map) {
        M().a(map);
    }

    public void a(String str, Object obj, SharedPreferences.Editor editor) {
        h0().a(str, obj, editor);
    }

    public Object a(q4 q4Var) {
        return a(q4Var, (Object) null);
    }

    public Object a(q4 q4Var, Object obj) {
        return h0().a(q4Var, obj);
    }

    public Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return r4.a(str, obj, cls, sharedPreferences);
    }

    public void a(SharedPreferences sharedPreferences) {
        h0().a(sharedPreferences);
    }

    public void a(final AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        if (!s0()) {
            this.f8921p0 = sdkInitializationListener;
        } else if (sdkInitializationListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.k0
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.c(sdkInitializationListener);
                }
            });
        }
    }
}

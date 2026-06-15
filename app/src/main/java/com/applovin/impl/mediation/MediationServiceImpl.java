package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import com.applovin.impl.a2;
import com.applovin.impl.b3;
import com.applovin.impl.b6;
import com.applovin.impl.d3;
import com.applovin.impl.d7;
import com.applovin.impl.g6;
import com.applovin.impl.j3;
import com.applovin.impl.j4;
import com.applovin.impl.k3;
import com.applovin.impl.l2;
import com.applovin.impl.l3;
import com.applovin.impl.m6;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.o4;
import com.applovin.impl.s4;
import com.applovin.impl.s5;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.g;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t4;
import com.applovin.impl.u2;
import com.applovin.impl.u4;
import com.applovin.impl.u5;
import com.applovin.impl.v1;
import com.applovin.impl.w2;
import com.applovin.impl.y1;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.c9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MediationServiceImpl implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f7565a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.n f7566b;

    /* renamed from: c  reason: collision with root package name */
    private final s4 f7567c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference f7568d = new AtomicReference();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7569a;

        static {
            int[] iArr = new int[MaxAdapter.InitializationStatus.values().length];
            f7569a = iArr;
            try {
                iArr[MaxAdapter.InitializationStatus.DOES_NOT_APPLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7569a[MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7569a[MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7569a[MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7569a[MaxAdapter.InitializationStatus.NOT_INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7569a[MaxAdapter.InitializationStatus.INITIALIZING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements MaxAdListener, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.InterfaceC0126a {

        /* renamed from: a  reason: collision with root package name */
        private final u2 f7570a;

        /* renamed from: b  reason: collision with root package name */
        private a.InterfaceC0126a f7571b;

        public b(u2 u2Var, a.InterfaceC0126a interfaceC0126a) {
            this.f7570a = u2Var;
            this.f7571b = interfaceC0126a;
        }

        public void a(a.InterfaceC0126a interfaceC0126a) {
            this.f7571b = interfaceC0126a;
        }

        public void b(MaxAd maxAd, Bundle bundle) {
            this.f7570a.a(bundle);
            l2.b(this.f7571b, maxAd);
        }

        public void c(MaxAd maxAd, Bundle bundle) {
            this.f7570a.a(bundle);
            com.applovin.impl.sdk.n unused = MediationServiceImpl.this.f7566b;
            if (com.applovin.impl.sdk.n.a()) {
                MediationServiceImpl.this.f7566b.a("MediationService", "Scheduling impression for ad via callback...");
            }
            MediationServiceImpl.this.processCallbackAdImpressionPostback(this.f7570a, this.f7571b);
            if (!((Boolean) MediationServiceImpl.this.f7565a.a(j3.H7)).booleanValue() || this.f7570a.u().compareAndSet(false, true)) {
                MediationServiceImpl.this.f7565a.k().a(this.f7570a, g.c.SHOW);
                MediationServiceImpl.this.f7565a.C().c(v1.f9432f);
                MediationServiceImpl.this.f7565a.C().c(v1.f9435i);
                if (!maxAd.getFormat().isFullscreenAd()) {
                    MediationServiceImpl.this.f7565a.q().b(this.f7570a, "DID_DISPLAY");
                    MediationServiceImpl.this.f7565a.n().maybeSendAdEvent(this.f7570a, "DID_DISPLAY");
                    l2.c(this.f7571b, maxAd);
                    return;
                }
                w2 w2Var = (w2) maxAd;
                if (w2Var.u0()) {
                    MediationServiceImpl.this.f7565a.q().b(this.f7570a, "DID_DISPLAY");
                    MediationServiceImpl.this.f7565a.n().maybeSendAdEvent(this.f7570a, "DID_DISPLAY");
                    MediationServiceImpl.this.f7565a.B().a(this.f7570a);
                    l2.c(this.f7571b, maxAd);
                    return;
                }
                com.applovin.impl.sdk.n unused2 = MediationServiceImpl.this.f7566b;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = MediationServiceImpl.this.f7566b;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Received ad display callback before attempting show");
                    sb.append(w2Var.Z() ? " for hybrid ad" : "");
                    nVar.k("MediationService", sb.toString());
                }
            }
        }

        public void d(MaxAd maxAd, Bundle bundle) {
            this.f7570a.a(bundle);
            l2.d(this.f7571b, maxAd);
        }

        public void e(final MaxAd maxAd, Bundle bundle) {
            this.f7570a.a(bundle);
            MediationServiceImpl.this.f7565a.D().a(y1.W, this.f7570a);
            MediationServiceImpl.this.f7565a.k().a(this.f7570a, g.c.HIDE);
            u2 u2Var = (u2) maxAd;
            MediationServiceImpl.this.f7565a.q().b(u2Var, "DID_HIDE");
            MediationServiceImpl.this.f7565a.n().maybeSendAdEvent(u2Var, "DID_HIDE");
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.p
                @Override // java.lang.Runnable
                public final void run() {
                    MediationServiceImpl.b.this.a(maxAd);
                }
            }, maxAd instanceof w2 ? ((w2) maxAd).l0() : 0L);
        }

        public void f(MaxAd maxAd, Bundle bundle) {
            this.f7570a.a(bundle);
            this.f7570a.e0();
            MediationServiceImpl.this.f7565a.k().a(this.f7570a, g.c.LOAD);
            MediationServiceImpl.this.a(this.f7570a);
            l2.f(this.f7571b, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            a(maxAd, (Bundle) null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            b(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            a(maxAd, maxError, (Bundle) null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            c(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            d(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            e(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            this.f7570a.e0();
            MediationServiceImpl.this.b(this.f7570a, maxError, this.f7571b);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            f(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            a(maxAd, maxReward, (Bundle) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            if (maxAd.getFormat().isFullscreenAd()) {
                MediationServiceImpl.this.f7565a.B().b(maxAd);
            }
            l2.e(this.f7571b, maxAd);
        }

        public void a(MaxAd maxAd, Bundle bundle) {
            this.f7570a.a(bundle);
            MediationServiceImpl.this.f7565a.k().a(this.f7570a, g.c.CLICK);
            MediationServiceImpl.this.a(this.f7570a, this.f7571b);
            l2.a((MaxAdListener) this.f7571b, maxAd);
        }

        public void a(MaxAd maxAd, MaxError maxError, Bundle bundle) {
            this.f7570a.a(bundle);
            MediationServiceImpl.this.a(this.f7570a, maxError, this.f7571b);
            if (maxAd.getFormat() == MaxAdFormat.REWARDED && (maxAd instanceof w2)) {
                ((w2) maxAd).j0();
            }
        }

        public void a(MaxAd maxAd, MaxReward maxReward, Bundle bundle) {
            this.f7570a.a(bundle);
            l2.a(this.f7571b, maxAd, maxReward);
            MediationServiceImpl.this.f7565a.i0().a((z4) new g6((w2) maxAd, MediationServiceImpl.this.f7565a), u5.b.OTHER);
        }
    }

    public MediationServiceImpl(com.applovin.impl.sdk.j jVar) {
        this.f7565a = jVar;
        this.f7566b = jVar.I();
        this.f7567c = new s4(jVar);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
    }

    public void collectSignal(final String str, final MaxAdFormat maxAdFormat, final u4 u4Var, Context context, final t4.a aVar) {
        if (u4Var == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (aVar != null) {
            t4 b10 = this.f7567c.b(u4Var, str, maxAdFormat);
            if (b10 != null) {
                aVar.a(t4.a(b10));
                return;
            }
            final g a10 = this.f7565a.L().a(u4Var, u4Var.z());
            if (a10 != null) {
                final j4 j4Var = new j4("SignalCollection:" + u4Var.c());
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                Executor executor = j4.f7325i;
                j4Var.a(executor, new j4.b() { // from class: com.applovin.impl.mediation.j
                    @Override // com.applovin.impl.j4.b
                    public final void a(boolean z10, Object obj, Object obj2) {
                        MediationServiceImpl.this.a(elapsedRealtime, a10, str, u4Var, maxAdFormat, aVar, z10, (String) obj, (MaxError) obj2);
                    }
                });
                long m7 = u4Var.m();
                b6.a(m7, j4Var, new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "The adapter (" + u4Var.c() + ") timed out collecting signal"), "MediationService", this.f7565a);
                final Activity m02 = context instanceof Activity ? (Activity) context : this.f7565a.m0();
                final MaxAdapterParametersImpl a11 = MaxAdapterParametersImpl.a(u4Var, str, maxAdFormat);
                if (u4Var.v()) {
                    j4 a12 = this.f7565a.K().a(u4Var, m02);
                    a12.a(executor, new Runnable() { // from class: com.applovin.impl.mediation.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            MediationServiceImpl.this.a(j4Var, a10, a11, u4Var, m02);
                        }
                    });
                    a12.a(executor, new j4.a() { // from class: com.applovin.impl.mediation.h
                        @Override // com.applovin.impl.j4.a
                        public final void a(Object obj) {
                            MediationServiceImpl.this.a(a10, j4Var, (String) obj);
                        }
                    });
                    return;
                }
                if (u4Var.w()) {
                    j4 a13 = this.f7565a.K().a(u4Var, m02);
                    if (a13.d() && !u4Var.y()) {
                        if (com.applovin.impl.sdk.n.a()) {
                            com.applovin.impl.sdk.n nVar = this.f7566b;
                            nVar.b("MediationService", "Skip collecting signal for failed-initialized adapter: " + a10.g());
                        }
                        j4Var.a(new MaxErrorImpl("Could not initialize adapter: " + ((String) a13.a())));
                        return;
                    }
                }
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar2 = this.f7566b;
                    nVar2.a("MediationService", "Collecting signal for adapter: " + a10.g());
                }
                a10.a(a11, u4Var, m02, j4Var);
                return;
            }
            aVar.a(t4.a(u4Var, new MaxErrorImpl("Could not load adapter")));
            return;
        }
        throw new IllegalArgumentException("No callback specified");
    }

    public void destroyAd(MaxAd maxAd) {
        if (maxAd instanceof u2) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f7566b;
                nVar.d("MediationService", "Destroying " + maxAd);
            }
            u2 u2Var = (u2) maxAd;
            g A = u2Var.A();
            if (A != null) {
                A.a();
                u2Var.t();
            }
            this.f7565a.i().c(u2Var.S());
            this.f7565a.k().a(u2Var, g.c.DESTROY);
        }
    }

    public JSONObject getAndResetCustomPostBodyData() {
        return (JSONObject) this.f7568d.getAndSet(null);
    }

    public void loadAd(String str, String str2, MaxAdFormat maxAdFormat, d.b bVar, Map<String, Object> map, Map<String, Object> map2, Context context, a.InterfaceC0126a interfaceC0126a) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No Ad Unit ID specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (interfaceC0126a != null) {
            if (TextUtils.isEmpty(this.f7565a.N())) {
                com.applovin.impl.sdk.n.h("AppLovinSdk", "Mediation provider is null. Please set AppLovin SDK mediation provider via AppLovinSdk.getInstance(context).setMediationProvider()");
            }
            if (!this.f7565a.s0()) {
                com.applovin.impl.sdk.n.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
            }
            List<String> list = null;
            if (this.f7565a.x0().get()) {
                list = this.f7565a.f0().getInitializationAdUnitIds();
            } else if (this.f7565a.G() != null) {
                list = this.f7565a.G().getAdUnitIds();
            }
            boolean startsWith = str.startsWith("test_mode");
            if (list != null && list.size() > 0 && !list.contains(str) && !startsWith) {
                if (d7.c(this.f7565a)) {
                    String str3 = "Ad Unit ID " + str + " has not been initialized. When you use selective init, any ad units that you do not explicitly specify are excluded from serving ads for the current session. For more information visit our docs: https://developers.applovin.com/en/max/android/overview/advanced-settings#selective-init";
                    if (!((Boolean) this.f7565a.a(o4.f8081b6)).booleanValue()) {
                        if (com.applovin.impl.sdk.n.a()) {
                            this.f7566b.b("MediationService", str3);
                        }
                    } else {
                        throw new RuntimeException(str3);
                    }
                }
                this.f7565a.D().a(y1.f9677l0, "uninitialized_ad_unit_id", CollectionUtils.hashMap("ad_unit_id", str), "uninitialized_ad_unit_id" + str);
            }
            this.f7565a.c();
            if (str.length() != 16 && !startsWith && !this.f7565a.a0().startsWith("05TMD")) {
                com.applovin.impl.sdk.n.h("MediationService", "Please double-check the ad unit " + str + " for " + maxAdFormat.getLabel() + " : " + Log.getStackTraceString(new Throwable("")));
            }
            if (this.f7565a.a(maxAdFormat)) {
                com.applovin.impl.sdk.n.h("MediationService", "Ad load failed due to disabled ad format " + maxAdFormat.getLabel());
                l2.a(interfaceC0126a, str, new MaxErrorImpl(-1, "Disabled ad format " + maxAdFormat.getLabel()));
                return;
            }
            this.f7565a.R0();
            l2.a((MaxAdRequestListener) interfaceC0126a, str, true);
            this.f7565a.J().a(str, str2, maxAdFormat, bVar, map, map2, context, interfaceC0126a);
            return;
        }
        throw new IllegalArgumentException("No listener specified");
    }

    public void loadThirdPartyMediatedAd(final String str, final u2 u2Var, final Activity activity, final a.InterfaceC0126a interfaceC0126a) {
        if (u2Var != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f7566b.a("MediationService", "Loading " + u2Var + "...");
            }
            this.f7565a.D().a(y1.Q, u2Var);
            this.f7565a.q().b(u2Var, "WILL_LOAD");
            this.f7565a.n().maybeSendAdEvent(u2Var, "WILL_LOAD");
            final g a10 = this.f7565a.L().a(u2Var);
            if (a10 != null) {
                final MaxAdapterParametersImpl a11 = MaxAdapterParametersImpl.a(u2Var);
                j4 j4Var = null;
                if (u2Var.c0()) {
                    j4Var = this.f7565a.K().a(u2Var, activity);
                } else if (u2Var.d0()) {
                    this.f7565a.K().a(u2Var, activity);
                }
                j4 j4Var2 = j4Var;
                final u2 a12 = u2Var.a(a10);
                a10.a(str, a12);
                a12.f0();
                if (j4Var2 != null) {
                    Executor executor = j4.f7325i;
                    j4Var2.a(executor, new j4.a() { // from class: com.applovin.impl.mediation.i
                        @Override // com.applovin.impl.j4.a
                        public final void a(Object obj) {
                            MediationServiceImpl.this.a(u2Var, interfaceC0126a, (String) obj);
                        }
                    });
                    j4Var2.a(executor, new Runnable() { // from class: com.applovin.impl.mediation.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            MediationServiceImpl.this.a(a10, str, a11, a12, activity, interfaceC0126a);
                        }
                    });
                    return;
                }
                a10.a(str, a11, a12, activity, new b(a12, interfaceC0126a));
                return;
            }
            String str2 = "Failed to load " + u2Var + ": adapter not loaded";
            com.applovin.impl.sdk.n.h("MediationService", str2);
            b(u2Var, new MaxErrorImpl(-5001, str2), interfaceC0126a);
            return;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction())) {
            Object a10 = this.f7565a.B().a();
            if (a10 instanceof u2) {
                a((MaxError) MaxAdapterError.WEBVIEW_ERROR, (u2) a10, true);
            }
        }
    }

    public void processAdDisplayErrorPostbackForUserError(MaxError maxError, u2 u2Var) {
        a(maxError, u2Var, false);
    }

    public void processAdapterInitializationPostback(d3 d3Var, long j10, MaxAdapter.InitializationStatus initializationStatus, String str) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        hashMap.put("{INIT_TIME_MS}", String.valueOf(j10));
        a("minit", hashMap, new MaxErrorImpl(str), d3Var);
        Map a10 = a2.a(d3Var);
        CollectionUtils.putStringIfValid("adapter_init_status", String.valueOf(initializationStatus.getCode()), a10);
        CollectionUtils.putStringIfValid("error_message", str, a10);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(j10), a10);
        switch (a.f7569a[initializationStatus.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f7565a.D().d(y1.J, a10);
                return;
            case 4:
                this.f7565a.D().d(y1.K, a10);
                return;
            case 5:
            case 6:
                this.f7565a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f7565a.I().k("MediationService", "Adapter init postback called while the adapter is not fully initialized.");
                }
                this.f7565a.D().a(y1.f9660d, "adapterNotInitializedForPostback", a10);
                return;
            default:
                return;
        }
    }

    public void processCallbackAdImpressionPostback(u2 u2Var, a.InterfaceC0126a interfaceC0126a) {
        if (u2Var.Q().endsWith("cimp")) {
            this.f7565a.q().b(u2Var);
            l2.a((MaxAdRevenueListener) interfaceC0126a, (MaxAd) u2Var);
        }
        HashMap hashMap = new HashMap(1);
        String emptyIfNull = StringUtils.emptyIfNull(this.f7565a.o0().c());
        if (!((Boolean) this.f7565a.a(o4.H3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mcimp", hashMap, u2Var);
        this.f7565a.D().a(y1.U, u2Var);
    }

    public void processRawAdImpression(u2 u2Var, a.InterfaceC0126a interfaceC0126a) {
        this.f7565a.q().b(u2Var, "WILL_DISPLAY");
        this.f7565a.n().maybeSendAdEvent(u2Var, "WILL_DISPLAY");
        if (u2Var.Q().endsWith("mimp")) {
            this.f7565a.q().b(u2Var);
            l2.a((MaxAdRevenueListener) interfaceC0126a, (MaxAd) u2Var);
        }
        if (((Boolean) this.f7565a.a(o4.f8231u4)).booleanValue()) {
            this.f7565a.Q().a(k3.f7392d, l3.a(u2Var), Long.valueOf(System.currentTimeMillis() - this.f7565a.H()));
        }
        HashMap hashMap = new HashMap(2);
        if (u2Var instanceof w2) {
            hashMap.put("{TIME_TO_SHOW_MS}", String.valueOf(((w2) u2Var).p0()));
        }
        String emptyIfNull = StringUtils.emptyIfNull(this.f7565a.o0().c());
        if (!((Boolean) this.f7565a.a(o4.H3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mimp", hashMap, u2Var);
        this.f7565a.D().a(y1.f9680n, u2Var);
    }

    public void processViewabilityAdImpressionPostback(b3 b3Var, long j10, a.InterfaceC0126a interfaceC0126a) {
        if (b3Var.Q().endsWith("vimp")) {
            this.f7565a.q().b(b3Var);
            l2.a((MaxAdRevenueListener) interfaceC0126a, (MaxAd) b3Var);
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put("{VIEWABILITY_FLAGS}", String.valueOf(j10));
        hashMap.put("{USED_VIEWABILITY_TIMER}", String.valueOf(b3Var.q0()));
        String emptyIfNull = StringUtils.emptyIfNull(this.f7565a.o0().c());
        if (!((Boolean) this.f7565a.a(o4.H3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mvimp", hashMap, b3Var);
        this.f7565a.D().a(y1.f9684p, b3Var);
    }

    public void processWaterfallInfoPostback(String str, MaxAdFormat maxAdFormat, MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl, MaxError maxError, long j10, long j11) {
        HashMap hashMap = new HashMap();
        CollectionUtils.putStringIfValid("ad_format", maxAdFormat.getLabel(), hashMap);
        CollectionUtils.putStringIfValid("ad_unit_id", str, hashMap);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(j11), hashMap);
        if (maxError != null) {
            hashMap.putAll(a2.a(maxError));
        }
        this.f7565a.D().d(y1.T, hashMap);
        if (CollectionUtils.isEmpty(maxAdWaterfallInfoImpl.getPostbackUrls())) {
            return;
        }
        HashMap hashMap2 = new HashMap(8);
        CollectionUtils.putStringIfValid("mcode", maxAdWaterfallInfoImpl.getMCode(), hashMap2);
        CollectionUtils.putStringIfValid("ad_unit_id", str, hashMap2);
        CollectionUtils.putStringIfValid("ad_format", maxAdFormat.getLabel(), hashMap2);
        CollectionUtils.putStringIfValid("name", maxAdWaterfallInfoImpl.getName(), hashMap2);
        CollectionUtils.putLongIfValid("request_latency_ms", Long.valueOf(j11), hashMap2);
        CollectionUtils.putLongIfValid("request_start_timestamp_ms", Long.valueOf(j10), hashMap2);
        CollectionUtils.putLongIfValid("wf_latency_ms", Long.valueOf(maxAdWaterfallInfoImpl.getLatencyMillis()), hashMap2);
        List<MaxNetworkResponseInfo> networkResponses = maxAdWaterfallInfoImpl.getNetworkResponses();
        ArrayList arrayList = new ArrayList(networkResponses.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : networkResponses) {
            MaxMediatedNetworkInfo mediatedNetwork = maxNetworkResponseInfo.getMediatedNetwork();
            HashMap hashMap3 = new HashMap(5);
            CollectionUtils.putStringIfValid("bcode", ((MaxNetworkResponseInfoImpl) maxNetworkResponseInfo).getBCode(), hashMap3);
            hashMap3.put("name", mediatedNetwork.getName());
            CollectionUtils.putLongIfValid("latency_ms", Long.valueOf(maxNetworkResponseInfo.getLatencyMillis()), hashMap3);
            hashMap3.put("load_state", Integer.valueOf(maxNetworkResponseInfo.getAdLoadState().ordinal()));
            MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxNetworkResponseInfo.getError();
            if (maxErrorImpl != null) {
                HashMap hashMap4 = new HashMap(4);
                hashMap4.put("error_code", Integer.valueOf(maxErrorImpl.getCode()));
                hashMap4.put("error_message", maxErrorImpl.getMessage());
                hashMap4.put("third_party_sdk_error_code", Integer.valueOf(maxErrorImpl.getMediatedNetworkErrorCode()));
                hashMap4.put("third_party_sdk_error_message", maxErrorImpl.getMediatedNetworkErrorMessage());
                hashMap3.put("error_info", hashMap4);
            }
            arrayList.add(hashMap3);
        }
        hashMap2.put("ads_info", arrayList);
        a("mwf_info", maxAdWaterfallInfoImpl.getPostbackUrls(), Collections.EMPTY_MAP, hashMap2, null, null, false);
    }

    public void setCustomPostBodyData(JSONObject jSONObject) {
        this.f7568d.set(jSONObject);
    }

    public void showFullscreenAd(final w2 w2Var, final Activity activity, final a.InterfaceC0126a interfaceC0126a) {
        if (w2Var != null) {
            if (activity == null && MaxAdFormat.APP_OPEN != w2Var.getFormat()) {
                throw new IllegalArgumentException("No activity specified");
            }
            this.f7565a.B().a(true);
            final g b10 = b(w2Var);
            long r02 = w2Var.r0();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f7566b;
                nVar.d("MediationService", "Showing ad " + w2Var.getAdUnitId() + " with delay of " + r02 + "ms...");
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.m
                @Override // java.lang.Runnable
                public final void run() {
                    MediationServiceImpl.this.a(w2Var, b10, activity, interfaceC0126a);
                }
            }, r02);
            return;
        }
        throw new IllegalArgumentException("No ad specified");
    }

    private g b(w2 w2Var) {
        g A = w2Var.A();
        if (A == null) {
            this.f7565a.B().a(false);
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f7566b;
                nVar.k("MediationService", "Failed to show " + w2Var + ": adapter not found");
            }
            com.applovin.impl.sdk.n.h("MediationService", "There may be an integration problem with the adapter for Ad Unit ID '" + w2Var.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
            throw new IllegalStateException("Could not find adapter for provided ad");
        }
        return A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(w2 w2Var, g gVar, Activity activity, a.InterfaceC0126a interfaceC0126a) {
        w2Var.a(true);
        a(w2Var);
        gVar.c(w2Var, activity);
        a(w2Var, interfaceC0126a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(u2 u2Var, MaxError maxError, MaxAdListener maxAdListener) {
        a(maxError, u2Var);
        destroyAd(u2Var);
        l2.a(maxAdListener, u2Var.getAdUnitId(), maxError);
    }

    public void showFullscreenAd(final w2 w2Var, final ViewGroup viewGroup, final androidx.lifecycle.i iVar, final Activity activity, final a.InterfaceC0126a interfaceC0126a) {
        if (w2Var == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity != null) {
            this.f7565a.B().a(true);
            final g b10 = b(w2Var);
            long r02 = w2Var.r0();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f7566b;
                nVar.d("MediationService", "Showing ad " + w2Var.getAdUnitId() + " with delay of " + r02 + "ms...");
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.n
                @Override // java.lang.Runnable
                public final void run() {
                    MediationServiceImpl.this.a(w2Var, b10, viewGroup, iVar, activity, interfaceC0126a);
                }
            }, r02);
            return;
        }
        throw new IllegalArgumentException("No activity specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(w2 w2Var, g gVar, ViewGroup viewGroup, androidx.lifecycle.i iVar, Activity activity, a.InterfaceC0126a interfaceC0126a) {
        w2Var.a(true);
        a(w2Var);
        gVar.a(w2Var, viewGroup, iVar, activity);
        a(w2Var, interfaceC0126a);
    }

    private void a(w2 w2Var) {
        if (w2Var.getFormat() == MaxAdFormat.REWARDED) {
            this.f7565a.i0().a((z4) new m6(w2Var, this.f7565a), u5.b.OTHER);
        }
    }

    private void a(w2 w2Var, a.InterfaceC0126a interfaceC0126a) {
        this.f7565a.B().a(false);
        a(w2Var, (MaxAdListener) interfaceC0126a);
        if (com.applovin.impl.sdk.n.a()) {
            this.f7566b.a("MediationService", "Scheduling impression for ad manually...");
        }
        processRawAdImpression(w2Var, interfaceC0126a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(u2 u2Var, a.InterfaceC0126a interfaceC0126a, String str) {
        String str2 = "Failed to load " + u2Var + ": adapter init failed with error: " + str;
        if (com.applovin.impl.sdk.n.a()) {
            this.f7566b.k("MediationService", str2);
        }
        b(u2Var, new MaxErrorImpl(MaxAdapterError.NOT_INITIALIZED.getErrorCode(), "Adapter initialization failed"), interfaceC0126a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(g gVar, String str, MaxAdapterParametersImpl maxAdapterParametersImpl, u2 u2Var, Activity activity, a.InterfaceC0126a interfaceC0126a) {
        gVar.a(str, maxAdapterParametersImpl, u2Var, activity, new b(u2Var, interfaceC0126a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j10, g gVar, String str, u4 u4Var, MaxAdFormat maxAdFormat, t4.a aVar, boolean z10, String str2, MaxError maxError) {
        t4 a10;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        if (z10) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f7566b;
                nVar.a("MediationService", "Signal collection successful from: " + gVar.g() + " for Ad Unit ID: " + str + " with signal: \"" + str2 + "\"");
            }
            a10 = t4.a(u4Var, gVar, str2, j10, elapsedRealtime);
            this.f7567c.a(a10, u4Var, str, maxAdFormat);
            HashMap hashMap = new HashMap();
            CollectionUtils.putStringIfValid("network_name", u4Var.c(), hashMap);
            CollectionUtils.putStringIfValid("adapter_class", u4Var.b(), hashMap);
            CollectionUtils.putStringIfValid("adapter_version", gVar.b(), hashMap);
            CollectionUtils.putStringIfValid("duration_ms", String.valueOf(elapsedRealtime), hashMap);
            CollectionUtils.putStringIfValid("ad_format", String.valueOf(maxAdFormat.getLabel()), hashMap);
            CollectionUtils.putStringIfValid("ad_unit_id", str, hashMap);
            this.f7565a.D().d(y1.L, hashMap);
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar2 = this.f7566b;
                nVar2.b("MediationService", "Signal collection failed from: " + gVar.g() + " for Ad Unit ID: " + str + " with error message: \"" + maxError.getMessage() + "\"");
            }
            a10 = t4.a(u4Var, gVar, maxError, j10, elapsedRealtime);
            a(a10, u4Var, gVar);
        }
        aVar.a(a10);
        gVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(j4 j4Var, g gVar, MaxAdapterParametersImpl maxAdapterParametersImpl, u4 u4Var, Activity activity) {
        if (j4Var.c()) {
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f7566b;
            nVar.a("MediationService", "Collecting signal for now-initialized adapter: " + gVar.g());
        }
        gVar.a(maxAdapterParametersImpl, u4Var, activity, j4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(g gVar, j4 j4Var, String str) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f7566b;
            nVar.b("MediationService", "Skip collecting signal for failed-initialized adapter: " + gVar.g());
        }
        j4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_NOT_INITIALIZED, "Could not initialize adapter: " + str));
    }

    private void a(final w2 w2Var, final MaxAdListener maxAdListener) {
        final Long l10 = (Long) this.f7565a.a(j3.f7307i7);
        if (l10.longValue() <= 0) {
            return;
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.o
            @Override // java.lang.Runnable
            public final void run() {
                MediationServiceImpl.this.a(w2Var, l10, maxAdListener);
            }
        }, l10.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(w2 w2Var, Long l10, MaxAdListener maxAdListener) {
        if (w2Var.u().get()) {
            return;
        }
        String str = "Ad (" + w2Var.k() + ") has not been displayed after " + l10 + "ms. Failing ad display...";
        com.applovin.impl.sdk.n.h("MediationService", str);
        a(w2Var, new MaxErrorImpl(-1, str), maxAdListener);
        this.f7565a.B().b(w2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(u2 u2Var, MaxError maxError, MaxAdListener maxAdListener) {
        this.f7565a.k().a(u2Var, g.c.SHOW_ERROR);
        this.f7565a.q().b(u2Var, "DID_FAIL_DISPLAY");
        this.f7565a.n().maybeSendAdEvent(u2Var, "DID_FAIL_DISPLAY");
        a(maxError, u2Var, true);
        if (u2Var.u().compareAndSet(false, true)) {
            l2.a(maxAdListener, u2Var, maxError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(u2 u2Var) {
        this.f7565a.q().b(u2Var, "DID_LOAD");
        this.f7565a.n().maybeSendAdEvent(u2Var, "DID_LOAD");
        if (u2Var.Q().endsWith("load")) {
            this.f7565a.q().b(u2Var);
        }
        HashMap hashMap = new HashMap(3);
        long H = u2Var.H();
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(H));
        if (u2Var.getFormat().isFullscreenAd()) {
            m.a b10 = this.f7565a.B().b(u2Var.getAdUnitId());
            hashMap.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(b10.a()));
            hashMap.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(b10.b()));
        }
        a("load", hashMap, u2Var);
        Map a10 = a2.a(u2Var);
        a10.put("duration_ms", String.valueOf(H));
        this.f7565a.D().d(y1.R, a10);
    }

    private void a(MaxError maxError, u2 u2Var) {
        HashMap hashMap = new HashMap(3);
        long H = u2Var.H();
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(H));
        if (u2Var.getFormat().isFullscreenAd()) {
            m.a b10 = this.f7565a.B().b(u2Var.getAdUnitId());
            hashMap.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(b10.a()));
            hashMap.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(b10.b()));
        }
        a("mlerr", hashMap, maxError, u2Var);
        Map a10 = a2.a(u2Var);
        a10.putAll(a2.a(maxError));
        a10.put("duration_ms", String.valueOf(H));
        this.f7565a.D().d(y1.S, a10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(u2 u2Var, a.InterfaceC0126a interfaceC0126a) {
        this.f7565a.q().b(u2Var, "DID_CLICKED");
        this.f7565a.q().b(u2Var, "DID_CLICK");
        this.f7565a.n().maybeSendAdEvent(u2Var, "DID_CLICK");
        if (u2Var.Q().endsWith(c9.f16851d)) {
            this.f7565a.q().b(u2Var);
            l2.a((MaxAdRevenueListener) interfaceC0126a, (MaxAd) u2Var);
        }
        HashMap hashMap = new HashMap(1);
        String emptyIfNull = StringUtils.emptyIfNull(this.f7565a.o0().c());
        if (!((Boolean) this.f7565a.a(o4.H3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mclick", hashMap, u2Var);
    }

    private void a(MaxError maxError, u2 u2Var, boolean z10) {
        a("mierr", Collections.EMPTY_MAP, maxError, u2Var, z10);
        if (!z10 || u2Var == null) {
            return;
        }
        this.f7565a.D().a(y1.V, u2Var, maxError);
    }

    private void a(t4 t4Var, u4 u4Var, g gVar) {
        long b10 = t4Var.b();
        HashMap hashMap = new HashMap(3);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(b10));
        CollectionUtils.putStringIfValid("{ADAPTER_VERSION}", gVar.b(), hashMap);
        CollectionUtils.putStringIfValid("{SDK_VERSION}", gVar.i(), hashMap);
        a("serr", hashMap, t4Var.c(), u4Var);
        Map a10 = a2.a(t4Var.c());
        CollectionUtils.putStringIfValid("network_name", u4Var.c(), a10);
        CollectionUtils.putStringIfValid("adapter_class", u4Var.b(), a10);
        CollectionUtils.putStringIfValid("adapter_version", gVar.b(), a10);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(b10), a10);
        this.f7565a.D().d(y1.M, a10);
    }

    private void a(String str, Map map, d3 d3Var) {
        a(str, map, (MaxError) null, d3Var);
    }

    private void a(String str, Map map, MaxError maxError, d3 d3Var) {
        a(str, map, maxError, d3Var, true);
    }

    private void a(String str, Map map, MaxError maxError, d3 d3Var, boolean z10) {
        Map map2 = CollectionUtils.map(map);
        map2.put("{PLACEMENT}", z10 ? StringUtils.emptyIfNull(d3Var.getPlacement()) : "");
        map2.put("{CUSTOM_DATA}", z10 ? StringUtils.emptyIfNull(d3Var.e()) : "");
        if (d3Var instanceof u2) {
            map2.put("{CREATIVE_ID}", z10 ? StringUtils.emptyIfNull(((u2) d3Var).getCreativeId()) : "");
        }
        a(str, null, map2, null, maxError, d3Var, z10);
    }

    private void a(String str, List list, Map map, Map map2, MaxError maxError, d3 d3Var, boolean z10) {
        this.f7565a.i0().a((z4) new s5(str, list, map, map2, maxError, d3Var, this.f7565a, z10), u5.b.OTHER);
    }
}

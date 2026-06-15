package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u5;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxErrorCode;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class y5 extends z4 {

    /* renamed from: p  reason: collision with root package name */
    private static final AtomicBoolean f9751p = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    private final String f9752g;

    /* renamed from: h  reason: collision with root package name */
    private final MaxAdFormat f9753h;

    /* renamed from: i  reason: collision with root package name */
    private final JSONObject f9754i;

    /* renamed from: j  reason: collision with root package name */
    private final List f9755j;

    /* renamed from: k  reason: collision with root package name */
    private final a.InterfaceC0126a f9756k;

    /* renamed from: l  reason: collision with root package name */
    private final WeakReference f9757l;

    /* renamed from: m  reason: collision with root package name */
    private final String f9758m;

    /* renamed from: n  reason: collision with root package name */
    private long f9759n;

    /* renamed from: o  reason: collision with root package name */
    private final List f9760o;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class b extends z4 {

        /* renamed from: g  reason: collision with root package name */
        private final long f9761g;

        /* renamed from: h  reason: collision with root package name */
        private final int f9762h;

        /* renamed from: i  reason: collision with root package name */
        private final u2 f9763i;

        /* renamed from: j  reason: collision with root package name */
        private final List f9764j;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a extends c3 {
            a(a.InterfaceC0126a interfaceC0126a) {
                super(interfaceC0126a);
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str, MaxError maxError) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - b.this.f9761g;
                com.applovin.impl.sdk.n unused = b.this.f9829c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = b.this.f9829c;
                    String str2 = b.this.f9828b;
                    nVar.a(str2, "Ad failed to load in " + elapsedRealtime + " ms for " + y5.this.f9753h.getLabel() + " ad unit " + y5.this.f9752g + " with error: " + maxError);
                }
                b bVar = b.this;
                bVar.b("failed to load ad: " + maxError.getCode());
                b bVar2 = b.this;
                bVar2.a(bVar2.f9763i, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, elapsedRealtime, maxError);
                if (b.this.f9762h < b.this.f9764j.size() - 1) {
                    b bVar3 = b.this;
                    b.this.f9827a.i0().a((z4) new b(bVar3.f9762h + 1, b.this.f9764j), u5.b.MEDIATION);
                    return;
                }
                y5.this.b(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
                b.this.b("loaded ad");
                long elapsedRealtime = SystemClock.elapsedRealtime() - b.this.f9761g;
                com.applovin.impl.sdk.n unused = b.this.f9829c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = b.this.f9829c;
                    String str = b.this.f9828b;
                    nVar.a(str, "Ad loaded in " + elapsedRealtime + "ms for " + y5.this.f9753h.getLabel() + " ad unit " + y5.this.f9752g);
                }
                u2 u2Var = (u2) maxAd;
                b.this.a(u2Var, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, elapsedRealtime, null);
                int i10 = b.this.f9762h;
                while (true) {
                    i10++;
                    if (i10 >= b.this.f9764j.size()) {
                        y5.this.b(u2Var);
                        return;
                    } else {
                        b bVar = b.this;
                        bVar.a((u2) bVar.f9764j.get(i10), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f9829c;
                String str = this.f9828b;
                nVar.a(str, "Loading ad " + (this.f9762h + 1) + " of " + this.f9764j.size() + " from " + this.f9763i.c() + " for " + y5.this.f9753h.getLabel() + " ad unit " + y5.this.f9752g);
            }
            b("started to load ad");
            Context context = (Context) y5.this.f9757l.get();
            Activity m02 = context instanceof Activity ? (Activity) context : this.f9827a.m0();
            this.f9827a.S().b(this.f9763i);
            this.f9827a.P().loadThirdPartyMediatedAd(y5.this.f9752g, this.f9763i, m02, new a(y5.this.f9756k));
        }

        private b(int i10, List list) {
            super(y5.this.f9828b, y5.this.f9827a, y5.this.f9752g);
            this.f9761g = SystemClock.elapsedRealtime();
            this.f9762h = i10;
            this.f9763i = (u2) list.get(i10);
            this.f9764j = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(u2 u2Var, MaxNetworkResponseInfo.AdLoadState adLoadState, long j10, MaxError maxError) {
            y5.this.f9760o.add(new MaxNetworkResponseInfoImpl(adLoadState, o3.a(u2Var.b()), u2Var.G(), u2Var.Y(), j10, u2Var.C(), maxError));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y5(String str, MaxAdFormat maxAdFormat, Map map, JSONObject jSONObject, Context context, com.applovin.impl.sdk.j jVar, a.InterfaceC0126a interfaceC0126a) {
        super("TaskProcessMediationWaterfall", jVar, str);
        this.f9752g = str;
        this.f9753h = maxAdFormat;
        this.f9754i = jSONObject;
        this.f9756k = interfaceC0126a;
        this.f9757l = new WeakReference(context);
        this.f9758m = JsonUtils.getString(jSONObject, "mcode", "");
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ads", new JSONArray());
        this.f9755j = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            this.f9755j.add(u2.a(i10, map, JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jSONObject, jVar));
        }
        this.f9760o = new ArrayList(this.f9755j.size());
    }

    @Override // java.lang.Runnable
    public void run() {
        final MaxErrorImpl maxErrorImpl;
        this.f9759n = SystemClock.elapsedRealtime();
        if (this.f9754i.optBoolean("is_testing", false) && !this.f9827a.k0().c() && f9751p.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.rf
                @Override // java.lang.Runnable
                public final void run() {
                    y5.this.e();
                }
            });
        }
        if (this.f9755j.size() > 0) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.a(this.f9828b, "Starting waterfall for " + this.f9753h.getLabel() + " ad unit " + this.f9752g + " with " + this.f9755j.size() + " ad(s)...");
            }
            this.f9827a.i0().a(new b(0, this.f9755j));
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f9829c.k(this.f9828b, "No ads were returned from the server for " + this.f9753h.getLabel() + " ad unit " + this.f9752g);
        }
        d7.a(this.f9752g, this.f9753h, this.f9754i, this.f9827a);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f9754i, "settings", new JSONObject());
        long j10 = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        if (o3.a(this.f9754i, this.f9752g, this.f9827a)) {
            maxErrorImpl = new MaxErrorImpl(MaxErrorCode.INVALID_AD_UNIT_ID, "Ad Unit ID " + this.f9752g + " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://developers.applovin.com/en/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created");
            if (d7.c(this.f9827a) && ((Boolean) this.f9827a.a(o4.f8074a6)).booleanValue()) {
                j10 = 0;
            }
        } else {
            maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device");
        }
        if (j10 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(j10);
            Runnable runnable = new Runnable() { // from class: com.applovin.impl.sf
                @Override // java.lang.Runnable
                public final void run() {
                    y5.this.b(maxErrorImpl);
                }
            };
            if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
                d0.a(millis, this.f9827a, runnable);
                return;
            } else {
                AppLovinSdkUtils.runOnUiThreadDelayed(runnable, millis);
                return;
            }
        }
        b(maxErrorImpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        d7.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", this.f9827a.m0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(u2 u2Var) {
        this.f9827a.S().c(u2Var);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f9759n;
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str = this.f9828b;
            nVar.d(str, "Waterfall loaded in " + elapsedRealtime + "ms from " + u2Var.c() + " for " + this.f9753h.getLabel() + " ad unit " + this.f9752g);
        }
        u2Var.a(new MaxAdWaterfallInfoImpl(u2Var, elapsedRealtime, this.f9760o, this.f9758m));
        l2.f(this.f9756k, u2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void b(MaxError maxError) {
        if (maxError.getCode() == 204) {
            this.f9827a.C().c(v1.f9447u);
        } else if (maxError.getCode() == -5001) {
            this.f9827a.C().c(v1.f9448v);
        } else {
            this.f9827a.C().c(v1.f9449w);
        }
        ArrayList arrayList = new ArrayList(this.f9760o.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f9760o) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb = new StringBuilder("======FAILED AD LOADS======");
            sb.append("\n");
            int i10 = 0;
            while (i10 < arrayList.size()) {
                MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i10);
                i10++;
                sb.append(i10);
                sb.append(") ");
                sb.append(maxNetworkResponseInfo2.getMediatedNetwork().getName());
                sb.append("\n");
                sb.append("..code: ");
                sb.append(maxNetworkResponseInfo2.getError().getCode());
                sb.append("\n");
                sb.append("..message: ");
                sb.append(maxNetworkResponseInfo2.getError().getMessage());
                sb.append("\n");
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb.toString());
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f9759n;
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str = this.f9828b;
            nVar.d(str, "Waterfall failed in " + elapsedRealtime + "ms for " + this.f9753h.getLabel() + " ad unit " + this.f9752g + " with error: " + maxError);
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f9754i, "waterfall_name", ""), JsonUtils.getString(this.f9754i, "waterfall_test_name", ""), elapsedRealtime, this.f9760o, JsonUtils.optList(JsonUtils.getJSONArray(this.f9754i, "mwf_info_urls", null), Collections.EMPTY_LIST), this.f9758m));
        l2.a(this.f9756k, this.f9752g, maxError);
    }
}

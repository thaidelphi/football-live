package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.p5;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class p5 extends xv {

    /* renamed from: e  reason: collision with root package name */
    private final w2 f19672e;

    /* renamed from: f  reason: collision with root package name */
    private final w1 f19673f;

    /* renamed from: g  reason: collision with root package name */
    private final q5 f19674g;

    /* renamed from: h  reason: collision with root package name */
    private final xo f19675h;

    /* renamed from: i  reason: collision with root package name */
    private final fo f19676i;

    /* renamed from: j  reason: collision with root package name */
    private r5 f19677j;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements r5 {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d0 f19679b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ yv f19680c;

        a(d0 d0Var, yv yvVar) {
            this.f19679b = d0Var;
            this.f19680c = yvVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(p5 this$0, d0 adInstanceFactory, yv waterfallFetcherListener, int i10, String errorMessage, int i11, String auctionFallback, long j10) {
            kotlin.jvm.internal.n.f(this$0, "this$0");
            kotlin.jvm.internal.n.f(adInstanceFactory, "$adInstanceFactory");
            kotlin.jvm.internal.n.f(waterfallFetcherListener, "$waterfallFetcherListener");
            kotlin.jvm.internal.n.f(errorMessage, "$errorMessage");
            kotlin.jvm.internal.n.f(auctionFallback, "$auctionFallback");
            this$0.f19677j = null;
            this$0.a(adInstanceFactory, waterfallFetcherListener, i10, errorMessage, i11, auctionFallback, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(p5 this$0, d0 adInstanceFactory, yv waterfallFetcherListener, List newWaterfall, Map adInstancePayloads, String auctionId, m5 m5Var, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str) {
            kotlin.jvm.internal.n.f(this$0, "this$0");
            kotlin.jvm.internal.n.f(adInstanceFactory, "$adInstanceFactory");
            kotlin.jvm.internal.n.f(waterfallFetcherListener, "$waterfallFetcherListener");
            kotlin.jvm.internal.n.f(newWaterfall, "$newWaterfall");
            kotlin.jvm.internal.n.f(adInstancePayloads, "$adInstancePayloads");
            kotlin.jvm.internal.n.f(auctionId, "$auctionId");
            this$0.f19677j = null;
            this$0.a(adInstanceFactory, waterfallFetcherListener, newWaterfall, adInstancePayloads, auctionId, m5Var, jSONObject, jSONObject2, i10, j10, i11, str);
        }

        @Override // com.ironsource.r5
        public void a(int i10, String errorReason) {
            kotlin.jvm.internal.n.f(errorReason, "errorReason");
            this.f19680c.a(i10, errorReason);
        }

        @Override // com.ironsource.r5
        public void a(final int i10, final String errorMessage, final int i11, final String auctionFallback, final long j10) {
            kotlin.jvm.internal.n.f(errorMessage, "errorMessage");
            kotlin.jvm.internal.n.f(auctionFallback, "auctionFallback");
            w2 w2Var = p5.this.f19672e;
            final p5 p5Var = p5.this;
            final d0 d0Var = this.f19679b;
            final yv yvVar = this.f19680c;
            w2Var.a(new Runnable() { // from class: com.ironsource.k00
                @Override // java.lang.Runnable
                public final void run() {
                    p5.a.a(p5.this, d0Var, yvVar, i10, errorMessage, i11, auctionFallback, j10);
                }
            });
        }

        @Override // com.ironsource.r5
        public void a(final List<m5> newWaterfall, final Map<String, h0> adInstancePayloads, final String auctionId, final m5 m5Var, final JSONObject jSONObject, final JSONObject jSONObject2, final int i10, final long j10, final int i11, final String str) {
            kotlin.jvm.internal.n.f(newWaterfall, "newWaterfall");
            kotlin.jvm.internal.n.f(adInstancePayloads, "adInstancePayloads");
            kotlin.jvm.internal.n.f(auctionId, "auctionId");
            w2 w2Var = p5.this.f19672e;
            final p5 p5Var = p5.this;
            final d0 d0Var = this.f19679b;
            final yv yvVar = this.f19680c;
            w2Var.a(new Runnable() { // from class: com.ironsource.l00
                @Override // java.lang.Runnable
                public final void run() {
                    p5.a.a(p5.this, d0Var, yvVar, newWaterfall, adInstancePayloads, auctionId, m5Var, jSONObject, jSONObject2, i10, j10, i11, str);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(w2 adTools, w1 adUnitData) {
        super(adTools, adUnitData);
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        this.f19672e = adTools;
        this.f19673f = adUnitData;
        q5 q5Var = new q5(adTools, adUnitData);
        this.f19674g = q5Var;
        this.f19675h = q5Var.b();
        this.f19676i = new fo(adTools, adUnitData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(d0 d0Var, yv yvVar, int i10, String str, int i11, String str2, long j10) {
        IronLog.INTERNAL.verbose(o1.a(this.f19672e, "Auction failed | moving to fallback waterfall (error " + i10 + " - " + str + ')', (String) null, 2, (Object) null));
        this.f19672e.e().b().a(j10, i10, str);
        this.f19676i.a(yvVar, i11, str2, d0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(d0 d0Var, yv yvVar, List<m5> list, Map<String, h0> map, String str, m5 m5Var, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog.INTERNAL.verbose(o1.a(this.f19672e, (String) null, (String) null, 3, (Object) null));
        j5 j5Var = new j5(str, jSONObject, m5Var, i10, "");
        if (!TextUtils.isEmpty(str2)) {
            this.f19672e.e().h().a(i11, str2);
        }
        a(jSONObject2);
        zv a10 = a(list, map, j5Var, d0Var);
        this.f19672e.e().a(new u4(j5Var));
        this.f19672e.e().b().a(j10, this.f19673f.v());
        this.f19672e.e().b().c(a10.d());
        a(a10, yvVar);
    }

    private final void a(zv zvVar, yv yvVar) {
        this.f19672e.h().a(zvVar);
        yvVar.a(zvVar);
    }

    private final void a(JSONObject jSONObject) {
        int i10;
        try {
            if (jSONObject == null) {
                this.f19673f.b(false);
                IronLog ironLog = IronLog.INTERNAL;
                w2 w2Var = this.f19672e;
                ironLog.verbose(o1.a(w2Var, "loading configuration from auction response is null, using the following: " + this.f19673f.v(), (String) null, 2, (Object) null));
                return;
            }
            try {
                if (jSONObject.has(com.ironsource.mediationsdk.d.f18578x) && (i10 = jSONObject.getInt(com.ironsource.mediationsdk.d.f18578x)) > 0) {
                    this.f19673f.a(i10);
                }
                if (jSONObject.has(com.ironsource.mediationsdk.d.f18579y)) {
                    this.f19673f.a(jSONObject.getBoolean(com.ironsource.mediationsdk.d.f18579y));
                }
                this.f19673f.b(jSONObject.optBoolean(com.ironsource.mediationsdk.d.f18580z, false));
            } catch (JSONException e8) {
                o9.d().a(e8);
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.error("failed to update loading configuration for" + this.f19673f.b().a() + " Error: " + e8.getMessage());
                ironLog2.verbose(o1.a(this.f19672e, this.f19673f.v(), (String) null, 2, (Object) null));
            }
        } finally {
            IronLog.INTERNAL.verbose(o1.a(this.f19672e, this.f19673f.v(), (String) null, 2, (Object) null));
        }
    }

    @Override // com.ironsource.xv
    public xo a() {
        return this.f19675h;
    }

    @Override // com.ironsource.xv
    public void a(d0 adInstanceFactory, yv waterfallFetcherListener) {
        kotlin.jvm.internal.n.f(adInstanceFactory, "adInstanceFactory");
        kotlin.jvm.internal.n.f(waterfallFetcherListener, "waterfallFetcherListener");
        a aVar = new a(adInstanceFactory, waterfallFetcherListener);
        this.f19674g.a(aVar);
        this.f19677j = aVar;
    }
}

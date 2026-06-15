package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.q4;
import com.ironsource.z7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class q4 {

    /* renamed from: a  reason: collision with root package name */
    private final w2 f19821a;

    /* renamed from: b  reason: collision with root package name */
    private final w1 f19822b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, h0> f19823c;

    /* renamed from: d  reason: collision with root package name */
    private final e5 f19824d;

    /* renamed from: e  reason: collision with root package name */
    private final List<w7> f19825e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f19826f;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a extends hr {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z7 f19827a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q4 f19828b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z7.b f19829c;

        a(z7 z7Var, q4 q4Var, z7.b bVar) {
            this.f19827a = z7Var;
            this.f19828b = q4Var;
            this.f19829c = bVar;
        }

        @Override // com.ironsource.hr
        public void a() {
            this.f19827a.a(this.f19828b.e(), this.f19829c, this.f19828b.f19822b.f(), TimeUnit.MILLISECONDS);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b implements x7 {
        b() {
        }

        @Override // com.ironsource.x7
        public void a(NetworkSettings networkSettings) {
            AdapterBaseInterface adapterBaseInterface = null;
            if (q4.this.h()) {
                BaseAdAdapter b10 = q4.this.b(networkSettings != null ? networkSettings.getProviderName() : null);
                if (b10 != null) {
                    adapterBaseInterface = b10.getNetworkAdapter();
                }
            } else {
                adapterBaseInterface = q4.this.a(networkSettings);
            }
            if (adapterBaseInterface != null) {
                q4.this.f19821a.e().g().a(q4.this.a(networkSettings, adapterBaseInterface));
            }
        }

        @Override // com.ironsource.x7
        public void a(String str) {
            q4.this.f19821a.e().h().g(str);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class c implements z7.b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f19832b;

        c(d dVar) {
            this.f19832b = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(q4 this$0, long j10, List biddingDataList, List reachedTimeout, d biddingDataListener) {
            kotlin.jvm.internal.n.f(this$0, "this$0");
            kotlin.jvm.internal.n.f(biddingDataList, "$biddingDataList");
            kotlin.jvm.internal.n.f(reachedTimeout, "$reachedTimeout");
            kotlin.jvm.internal.n.f(biddingDataListener, "$biddingDataListener");
            this$0.a(j10, biddingDataList, reachedTimeout, biddingDataListener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(q4 this$0, String error, d biddingDataListener) {
            kotlin.jvm.internal.n.f(this$0, "this$0");
            kotlin.jvm.internal.n.f(error, "$error");
            kotlin.jvm.internal.n.f(biddingDataListener, "$biddingDataListener");
            this$0.f19821a.e().g().a(error);
            biddingDataListener.a(this$0, error);
        }

        @Override // com.ironsource.z7.b
        public void a(final List<? extends a8> biddingDataList, final long j10, final List<String> reachedTimeout) {
            kotlin.jvm.internal.n.f(biddingDataList, "biddingDataList");
            kotlin.jvm.internal.n.f(reachedTimeout, "reachedTimeout");
            w2 w2Var = q4.this.f19821a;
            final q4 q4Var = q4.this;
            final d dVar = this.f19832b;
            w2Var.a(new Runnable() { // from class: com.ironsource.r00
                @Override // java.lang.Runnable
                public final void run() {
                    q4.c.a(q4.this, j10, biddingDataList, reachedTimeout, dVar);
                }
            });
        }

        @Override // com.ironsource.z7.b
        public void onFailure(final String error) {
            kotlin.jvm.internal.n.f(error, "error");
            w2 w2Var = q4.this.f19821a;
            final q4 q4Var = q4.this;
            final d dVar = this.f19832b;
            w2Var.a(new Runnable() { // from class: com.ironsource.s00
                @Override // java.lang.Runnable
                public final void run() {
                    q4.c.a(q4.this, error, dVar);
                }
            });
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface d {
        void a(q4 q4Var);

        void a(q4 q4Var, String str);
    }

    public q4(w2 adTools, w1 adUnitData) {
        StringBuilder sb;
        String str;
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        this.f19821a = adTools;
        this.f19822b = adUnitData;
        this.f19823c = a();
        this.f19824d = new e5(adUnitData);
        this.f19825e = new ArrayList();
        this.f19826f = adUnitData.e().p();
        b b10 = b();
        eu f10 = adUnitData.b().f();
        for (NetworkSettings networkSettings : adUnitData.m()) {
            if (f10 == null || f10.a(networkSettings, this.f19822b.b().a())) {
                AdData a10 = this.f19822b.a(networkSettings);
                if (networkSettings.isBidder(this.f19822b.b().a())) {
                    AdapterBaseInterface b11 = this.f19826f ? b(networkSettings.getProviderName()) : a(networkSettings);
                    if (b11 instanceof y7) {
                        this.f19825e.add(new w7(networkSettings.getInstanceType(this.f19822b.b().a()), networkSettings.getProviderInstanceName(), a10, (y7) b11, b10, networkSettings));
                    } else {
                        if (b11 == null) {
                            sb = new StringBuilder();
                            sb.append("prepareAuctionCandidates - could not load network adapter ");
                            str = networkSettings.getProviderName();
                        } else {
                            sb = new StringBuilder();
                            sb.append("network adapter ");
                            sb.append(networkSettings.getProviderName());
                            str = " does not implementing BiddingDataInterface";
                        }
                        sb.append(str);
                        this.f19821a.e().h().g(sb.toString());
                    }
                } else {
                    this.f19824d.a(networkSettings);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdapterBaseInterface a(NetworkSettings networkSettings) {
        return com.ironsource.mediationsdk.c.b().b(networkSettings, this.f19822b.b().a(), this.f19822b.b().b());
    }

    private final Map<String, h0> a() {
        int k10;
        int c10;
        int a10;
        List<NetworkSettings> m7 = this.f19822b.m();
        k10 = j8.r.k(m7, 10);
        c10 = j8.i0.c(k10);
        a10 = y8.i.a(c10, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(a10);
        for (NetworkSettings networkSettings : m7) {
            h0 h0Var = new h0(this.f19821a, this.f19822b, networkSettings);
            i8.n a11 = i8.s.a(h0Var.c(), h0Var);
            linkedHashMap.put(a11.c(), a11.d());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        String providerDefaultInstance;
        HashMap hashMap = new HashMap();
        if (networkSettings != null) {
            try {
                providerDefaultInstance = networkSettings.getProviderDefaultInstance();
            } catch (Exception e8) {
                o9.d().a(e8);
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                StringBuilder sb = new StringBuilder();
                sb.append("getProviderEventData ");
                sb.append(networkSettings != null ? networkSettings.getProviderDefaultInstance() : null);
                logger.logException(ironSourceTag, sb.toString(), e8);
            }
        } else {
            providerDefaultInstance = null;
        }
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, providerDefaultInstance);
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getAdapterVersion() : null);
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getNetworkSDKVersion() : null);
        hashMap.put("spId", networkSettings != null ? networkSettings.getSubProviderId() : null);
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        hashMap.put("instanceType", networkSettings != null ? Integer.valueOf(networkSettings.getInstanceType(this.f19822b.b().a())) : null);
        return hashMap;
    }

    private final Map<String, Object> a(String str) {
        AdapterBaseInterface a10;
        NetworkSettings a11 = this.f19822b.a(str);
        if (this.f19826f) {
            BaseAdAdapter<?, ?> b10 = b(str);
            a10 = b10 != null ? b10.getNetworkAdapter() : null;
        } else {
            a10 = a(a11);
        }
        return a(a11, a10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long j10, List<? extends a8> list, List<String> list2, d dVar) {
        this.f19821a.e().g().a(j10);
        for (a8 a8Var : list) {
            String c10 = a8Var.c();
            kotlin.jvm.internal.n.e(c10, "biddingResponse.instanceName");
            Map<String, Object> a10 = a(c10);
            if (a8Var.a() != null) {
                this.f19824d.a(a8Var);
                this.f19821a.e().g().a(a10, a8Var.e());
            } else {
                this.f19821a.e().g().a(a10, a8Var.e(), a8Var.b());
            }
        }
        for (String str : list2) {
            this.f19821a.e().g().b(a(str), j10);
        }
        dVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseAdAdapter<?, ?> b(String str) {
        h0 h0Var = this.f19823c.get(str);
        if (h0Var != null) {
            return h0Var.b();
        }
        return null;
    }

    private final b b() {
        return new b();
    }

    private final z7.b b(d dVar) {
        return new c(dVar);
    }

    public final void a(d biddingDataListener) {
        kotlin.jvm.internal.n.f(biddingDataListener, "biddingDataListener");
        z7 z7Var = new z7();
        z7.b b10 = b(biddingDataListener);
        this.f19821a.e().g().a();
        this.f19821a.c((hr) new a(z7Var, this, b10));
    }

    public final Map<String, h0> c() {
        return this.f19823c;
    }

    public final e5 d() {
        return this.f19824d;
    }

    public final List<w7> e() {
        return this.f19825e;
    }

    public final boolean f() {
        return !this.f19825e.isEmpty();
    }

    public final boolean g() {
        return this.f19824d.d();
    }

    public final boolean h() {
        return this.f19826f;
    }
}

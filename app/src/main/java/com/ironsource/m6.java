package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.w1;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class m6 extends w1 {

    /* renamed from: z  reason: collision with root package name */
    public static final a f18438z = new a(null);

    /* renamed from: t  reason: collision with root package name */
    private final j6 f18439t;

    /* renamed from: u  reason: collision with root package name */
    private final boolean f18440u;

    /* renamed from: v  reason: collision with root package name */
    private final v1 f18441v;

    /* renamed from: w  reason: collision with root package name */
    private final u6 f18442w;

    /* renamed from: x  reason: collision with root package name */
    private final String f18443x;

    /* renamed from: y  reason: collision with root package name */
    private final String f18444y;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final m6 a(j6 adProperties, el elVar, boolean z10) {
            List<zn> d10;
            int k10;
            ls d11;
            kotlin.jvm.internal.n.f(adProperties, "adProperties");
            w1.a aVar = w1.f21222r;
            s8 c10 = (elVar == null || (d11 = elVar.d()) == null) ? null : d11.c();
            u6 c11 = c10 != null ? c10.c() : null;
            if (c11 == null) {
                throw new IllegalStateException("Error getting " + adProperties.a() + " configurations");
            }
            if (elVar == null || (d10 = elVar.c(adProperties.d(), adProperties.c())) == null) {
                d10 = j8.q.d();
            }
            String userIdForNetworks = IronSourceUtils.getUserIdForNetworks();
            k10 = j8.r.k(d10, 10);
            ArrayList arrayList = new ArrayList(k10);
            for (zn znVar : d10) {
                arrayList.add(znVar.f());
            }
            qk b10 = qk.b();
            kotlin.jvm.internal.n.e(b10, "getInstance()");
            return new m6(adProperties, z10, new v1(userIdForNetworks, arrayList, b10), c11);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m6(com.ironsource.j6 r25, boolean r26, com.ironsource.v1 r27, com.ironsource.u6 r28) {
        /*
            r24 = this;
            r11 = r24
            r15 = r25
            r13 = r27
            r14 = r28
            r0 = r24
            r1 = r25
            r2 = r26
            java.lang.String r3 = "adProperties"
            kotlin.jvm.internal.n.f(r15, r3)
            java.lang.String r3 = "adUnitCommonData"
            kotlin.jvm.internal.n.f(r13, r3)
            java.lang.String r3 = "configs"
            kotlin.jvm.internal.n.f(r14, r3)
            java.lang.String r3 = r27.f()
            java.util.List r4 = r27.d()
            com.ironsource.qk r5 = r27.e()
            com.ironsource.o5 r7 = r28.d()
            r6 = r7
            java.lang.String r8 = "configs.bannerAuctionSettings"
            kotlin.jvm.internal.n.e(r7, r8)
            int r7 = r28.a()
            long r8 = r28.b()
            r10 = 1000(0x3e8, float:1.401E-42)
            long r10 = (long) r10
            long r8 = r8 / r10
            int r8 = (int) r8
            boolean r9 = r28.c()
            int r10 = r28.f()
            com.ironsource.o2 r16 = new com.ironsource.o2
            r12 = r16
            com.ironsource.o2$a r17 = com.ironsource.o2.a.MANUAL_WITH_AUTOMATIC_RELOAD
            com.ironsource.o5 r11 = r28.d()
            long r18 = r11.j()
            com.ironsource.o5 r11 = r28.d()
            long r20 = r11.b()
            int r11 = r28.h()
            long r13 = (long) r11
            r22 = 1000(0x3e8, double:4.94E-321)
            long r22 = r22 * r13
            r16.<init>(r17, r18, r20, r22)
            long r13 = r28.e()
            r11 = r27
            boolean r16 = r28.l()
            r15 = r16
            boolean r16 = r28.n()
            boolean r17 = r28.m()
            r18 = -1
            r11 = r18
            r18 = 0
            r19 = 65536(0x10000, float:9.18355E-41)
            r20 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20)
            r0.f18439t = r1
            r1 = r26
            r0.f18440u = r1
            r1 = r27
            r0.f18441v = r1
            r1 = r28
            r0.f18442w = r1
            java.lang.String r1 = "BN"
            r0.f18443x = r1
            java.lang.String r1 = "MADU_BN"
            r0.f18444y = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.m6.<init>(com.ironsource.j6, boolean, com.ironsource.v1, com.ironsource.u6):void");
    }

    public static /* synthetic */ m6 a(m6 m6Var, j6 j6Var, boolean z10, v1 v1Var, u6 u6Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j6Var = m6Var.f18439t;
        }
        if ((i10 & 2) != 0) {
            z10 = m6Var.f18440u;
        }
        if ((i10 & 4) != 0) {
            v1Var = m6Var.f18441v;
        }
        if ((i10 & 8) != 0) {
            u6Var = m6Var.f18442w;
        }
        return m6Var.a(j6Var, z10, v1Var, u6Var);
    }

    @Override // com.ironsource.w1
    /* renamed from: A */
    public j6 b() {
        return this.f18439t;
    }

    public final v1 B() {
        return this.f18441v;
    }

    public final u6 C() {
        return this.f18442w;
    }

    public final m6 a(j6 adProperties, boolean z10, v1 adUnitCommonData, u6 configs) {
        kotlin.jvm.internal.n.f(adProperties, "adProperties");
        kotlin.jvm.internal.n.f(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.n.f(configs, "configs");
        return new m6(adProperties, z10, adUnitCommonData, configs);
    }

    @Override // com.ironsource.w1
    public AdData a(NetworkSettings providerSettings) {
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        AdData createAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(b(providerSettings), b().a(), r(), new IronSourceBannerLayout(ContextProvider.getInstance().getCurrentActiveActivity(), new l1().b(b().g())));
        kotlin.jvm.internal.n.e(createAdDataForNetworkAdapter, "createAdDataForNetworkAd…ze(adProperties.adSize)))");
        return createAdDataForNetworkAdapter;
    }

    @Override // com.ironsource.w1
    public JSONObject b(NetworkSettings providerSettings) {
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        JSONObject bannerSettings = providerSettings.getBannerSettings();
        kotlin.jvm.internal.n.e(bannerSettings, "providerSettings.bannerSettings");
        return bannerSettings;
    }

    @Override // com.ironsource.w1
    public String c() {
        return this.f18443x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m6) {
            m6 m6Var = (m6) obj;
            return kotlin.jvm.internal.n.a(this.f18439t, m6Var.f18439t) && this.f18440u == m6Var.f18440u && kotlin.jvm.internal.n.a(this.f18441v, m6Var.f18441v) && kotlin.jvm.internal.n.a(this.f18442w, m6Var.f18442w);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f18439t.hashCode() * 31;
        boolean z10 = this.f18440u;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((hashCode + i10) * 31) + this.f18441v.hashCode()) * 31) + this.f18442w.hashCode();
    }

    @Override // com.ironsource.w1
    public String j() {
        return this.f18444y;
    }

    public String toString() {
        return "BannerAdUnitData(adProperties=" + this.f18439t + ", isPublisherLoad=" + this.f18440u + ", adUnitCommonData=" + this.f18441v + ", configs=" + this.f18442w + ')';
    }

    @Override // com.ironsource.w1
    public boolean u() {
        return this.f18440u;
    }

    public final j6 w() {
        return this.f18439t;
    }

    public final boolean x() {
        return this.f18440u;
    }

    public final v1 y() {
        return this.f18441v;
    }

    public final u6 z() {
        return this.f18442w;
    }
}

package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.w1;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class kj extends w1 {

    /* renamed from: z  reason: collision with root package name */
    public static final a f18084z = new a(null);

    /* renamed from: t  reason: collision with root package name */
    private final f1 f18085t;

    /* renamed from: u  reason: collision with root package name */
    private final boolean f18086u;

    /* renamed from: v  reason: collision with root package name */
    private final v1 f18087v;

    /* renamed from: w  reason: collision with root package name */
    private final mj f18088w;

    /* renamed from: x  reason: collision with root package name */
    private final String f18089x;

    /* renamed from: y  reason: collision with root package name */
    private final String f18090y;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final kj a(f1 adProperties, el elVar, boolean z10) {
            List<zn> d10;
            int k10;
            ls d11;
            kotlin.jvm.internal.n.f(adProperties, "adProperties");
            w1.a aVar = w1.f21222r;
            s8 c10 = (elVar == null || (d11 = elVar.d()) == null) ? null : d11.c();
            mj d12 = c10 != null ? c10.d() : null;
            if (d12 == null) {
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
            return new kj(adProperties, z10, new v1(userIdForNetworks, arrayList, b10), d12);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kj(com.ironsource.f1 r25, boolean r26, com.ironsource.v1 r27, com.ironsource.mj r28) {
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
            com.ironsource.o5 r7 = r28.g()
            r6 = r7
            java.lang.String r8 = "configs.interstitialAuctionSettings"
            kotlin.jvm.internal.n.e(r7, r8)
            int r7 = r28.c()
            int r8 = r28.d()
            boolean r9 = r28.f()
            int r10 = r28.b()
            com.ironsource.o2 r16 = new com.ironsource.o2
            r12 = r16
            com.ironsource.o2$a r17 = com.ironsource.o2.a.MANUAL
            com.ironsource.o5 r18 = r28.g()
            long r18 = r18.j()
            com.ironsource.o5 r20 = r28.g()
            long r20 = r20.b()
            r22 = -1
            r16.<init>(r17, r18, r20, r22)
            long r16 = r28.h()
            r13 = r16
            boolean r16 = r28.k()
            r15 = r16
            boolean r16 = r28.m()
            boolean r17 = r28.l()
            r18 = -1
            r11 = r18
            r18 = 0
            r19 = 65536(0x10000, float:9.18355E-41)
            r20 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20)
            r0.f18085t = r1
            r1 = r26
            r0.f18086u = r1
            r1 = r27
            r0.f18087v = r1
            r1 = r28
            r0.f18088w = r1
            java.lang.String r1 = "IS"
            r0.f18089x = r1
            java.lang.String r1 = "MADU_IS"
            r0.f18090y = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.kj.<init>(com.ironsource.f1, boolean, com.ironsource.v1, com.ironsource.mj):void");
    }

    public static /* synthetic */ kj a(kj kjVar, f1 f1Var, boolean z10, v1 v1Var, mj mjVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f1Var = kjVar.f18085t;
        }
        if ((i10 & 2) != 0) {
            z10 = kjVar.f18086u;
        }
        if ((i10 & 4) != 0) {
            v1Var = kjVar.f18087v;
        }
        if ((i10 & 8) != 0) {
            mjVar = kjVar.f18088w;
        }
        return kjVar.a(f1Var, z10, v1Var, mjVar);
    }

    public final v1 A() {
        return this.f18087v;
    }

    public final mj B() {
        return this.f18088w;
    }

    public final kj a(f1 adProperties, boolean z10, v1 adUnitCommonData, mj configs) {
        kotlin.jvm.internal.n.f(adProperties, "adProperties");
        kotlin.jvm.internal.n.f(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.n.f(configs, "configs");
        return new kj(adProperties, z10, adUnitCommonData, configs);
    }

    @Override // com.ironsource.w1
    public f1 b() {
        return this.f18085t;
    }

    @Override // com.ironsource.w1
    public JSONObject b(NetworkSettings providerSettings) {
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        JSONObject interstitialSettings = providerSettings.getInterstitialSettings();
        kotlin.jvm.internal.n.e(interstitialSettings, "providerSettings.interstitialSettings");
        return interstitialSettings;
    }

    @Override // com.ironsource.w1
    public String c() {
        return this.f18089x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kj) {
            kj kjVar = (kj) obj;
            return kotlin.jvm.internal.n.a(this.f18085t, kjVar.f18085t) && this.f18086u == kjVar.f18086u && kotlin.jvm.internal.n.a(this.f18087v, kjVar.f18087v) && kotlin.jvm.internal.n.a(this.f18088w, kjVar.f18088w);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f18085t.hashCode() * 31;
        boolean z10 = this.f18086u;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((hashCode + i10) * 31) + this.f18087v.hashCode()) * 31) + this.f18088w.hashCode();
    }

    @Override // com.ironsource.w1
    public String j() {
        return this.f18090y;
    }

    public String toString() {
        return "InterstitialAdUnitData(adProperties=" + this.f18085t + ", isPublisherLoad=" + this.f18086u + ", adUnitCommonData=" + this.f18087v + ", configs=" + this.f18088w + ')';
    }

    @Override // com.ironsource.w1
    public boolean u() {
        return this.f18086u;
    }

    public final f1 w() {
        return this.f18085t;
    }

    public final boolean x() {
        return this.f18086u;
    }

    public final v1 y() {
        return this.f18087v;
    }

    public final mj z() {
        return this.f18088w;
    }
}

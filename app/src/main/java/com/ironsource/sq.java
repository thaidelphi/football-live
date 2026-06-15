package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.w1;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class sq extends w1 {

    /* renamed from: z  reason: collision with root package name */
    public static final a f20716z = new a(null);

    /* renamed from: t  reason: collision with root package name */
    private final f1 f20717t;

    /* renamed from: u  reason: collision with root package name */
    private final boolean f20718u;

    /* renamed from: v  reason: collision with root package name */
    private final v1 f20719v;

    /* renamed from: w  reason: collision with root package name */
    private final yq f20720w;

    /* renamed from: x  reason: collision with root package name */
    private final String f20721x;

    /* renamed from: y  reason: collision with root package name */
    private final String f20722y;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final sq a(f1 adProperties, el elVar, boolean z10) {
            List<zn> d10;
            int k10;
            ls d11;
            kotlin.jvm.internal.n.f(adProperties, "adProperties");
            w1.a aVar = w1.f21222r;
            s8 c10 = (elVar == null || (d11 = elVar.d()) == null) ? null : d11.c();
            yq f10 = c10 != null ? c10.f() : null;
            if (f10 == null) {
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
            return new sq(adProperties, z10, new v1(userIdForNetworks, arrayList, b10), f10);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public sq(com.ironsource.f1 r25, boolean r26, com.ironsource.v1 r27, com.ironsource.yq r28) {
        /*
            r24 = this;
            r15 = r24
            r13 = r25
            r14 = r27
            r12 = r28
            r0 = r24
            r1 = r25
            r2 = r26
            java.lang.String r3 = "adProperties"
            kotlin.jvm.internal.n.f(r13, r3)
            java.lang.String r3 = "adUnitCommonData"
            kotlin.jvm.internal.n.f(r14, r3)
            java.lang.String r3 = "configs"
            kotlin.jvm.internal.n.f(r12, r3)
            java.lang.String r3 = r27.f()
            java.util.List r4 = r27.d()
            com.ironsource.qk r5 = r27.e()
            com.ironsource.o5 r7 = r28.k()
            r6 = r7
            java.lang.String r8 = "configs.rewardedVideoAuctionSettings"
            kotlin.jvm.internal.n.e(r7, r8)
            int r7 = r28.g()
            int r8 = r28.h()
            boolean r9 = r28.j()
            int r10 = r28.b()
            int r11 = r28.c()
            com.ironsource.o2 r16 = new com.ironsource.o2
            r12 = r16
            com.ironsource.o2$a r17 = com.ironsource.o2.a.MANUAL
            com.ironsource.o5 r18 = r28.k()
            long r18 = r18.j()
            com.ironsource.o5 r20 = r28.k()
            long r20 = r20.b()
            r22 = -1
            r16.<init>(r17, r18, r20, r22)
            long r16 = r28.l()
            r13 = r16
            boolean r16 = r28.f()
            r15 = r16
            boolean r16 = r28.o()
            boolean r17 = r28.n()
            r18 = 0
            r19 = 65536(0x10000, float:9.18355E-41)
            r20 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20)
            r0.f20717t = r1
            r1 = r26
            r0.f20718u = r1
            r1 = r27
            r0.f20719v = r1
            r1 = r28
            r0.f20720w = r1
            java.lang.String r1 = "RV"
            r0.f20721x = r1
            java.lang.String r1 = "MADU_RV"
            r0.f20722y = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sq.<init>(com.ironsource.f1, boolean, com.ironsource.v1, com.ironsource.yq):void");
    }

    public static /* synthetic */ sq a(sq sqVar, f1 f1Var, boolean z10, v1 v1Var, yq yqVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f1Var = sqVar.f20717t;
        }
        if ((i10 & 2) != 0) {
            z10 = sqVar.f20718u;
        }
        if ((i10 & 4) != 0) {
            v1Var = sqVar.f20719v;
        }
        if ((i10 & 8) != 0) {
            yqVar = sqVar.f20720w;
        }
        return sqVar.a(f1Var, z10, v1Var, yqVar);
    }

    public final v1 A() {
        return this.f20719v;
    }

    public final yq B() {
        return this.f20720w;
    }

    public final sq a(f1 adProperties, boolean z10, v1 adUnitCommonData, yq configs) {
        kotlin.jvm.internal.n.f(adProperties, "adProperties");
        kotlin.jvm.internal.n.f(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.n.f(configs, "configs");
        return new sq(adProperties, z10, adUnitCommonData, configs);
    }

    @Override // com.ironsource.w1
    public f1 b() {
        return this.f20717t;
    }

    @Override // com.ironsource.w1
    public JSONObject b(NetworkSettings providerSettings) {
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        JSONObject rewardedVideoSettings = providerSettings.getRewardedVideoSettings();
        kotlin.jvm.internal.n.e(rewardedVideoSettings, "providerSettings.rewardedVideoSettings");
        return rewardedVideoSettings;
    }

    @Override // com.ironsource.w1
    public String c() {
        return this.f20721x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sq) {
            sq sqVar = (sq) obj;
            return kotlin.jvm.internal.n.a(this.f20717t, sqVar.f20717t) && this.f20718u == sqVar.f20718u && kotlin.jvm.internal.n.a(this.f20719v, sqVar.f20719v) && kotlin.jvm.internal.n.a(this.f20720w, sqVar.f20720w);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f20717t.hashCode() * 31;
        boolean z10 = this.f20718u;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((hashCode + i10) * 31) + this.f20719v.hashCode()) * 31) + this.f20720w.hashCode();
    }

    @Override // com.ironsource.w1
    public String j() {
        return this.f20722y;
    }

    public String toString() {
        return "RewardedAdUnitData(adProperties=" + this.f20717t + ", isPublisherLoad=" + this.f20718u + ", adUnitCommonData=" + this.f20719v + ", configs=" + this.f20720w + ')';
    }

    @Override // com.ironsource.w1
    public boolean u() {
        return this.f20718u;
    }

    public final f1 w() {
        return this.f20717t;
    }

    public final boolean x() {
        return this.f20718u;
    }

    public final v1 y() {
        return this.f20719v;
    }

    public final yq z() {
        return this.f20720w;
    }
}

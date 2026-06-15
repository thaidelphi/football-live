package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class h6 extends u0 {

    /* renamed from: s  reason: collision with root package name */
    private final String f17656s;

    /* renamed from: t  reason: collision with root package name */
    private final List<NetworkSettings> f17657t;

    /* renamed from: u  reason: collision with root package name */
    private final u6 f17658u;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h6(java.lang.String r21, java.util.List<? extends com.ironsource.mediationsdk.model.NetworkSettings> r22, com.ironsource.u6 r23) {
        /*
            r20 = this;
            r9 = r20
            r15 = r23
            r0 = r20
            r2 = r21
            r3 = r22
            java.lang.String r1 = "configs"
            kotlin.jvm.internal.n.f(r15, r1)
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER
            com.ironsource.o5 r5 = r23.d()
            r4 = r5
            java.lang.String r6 = "configs.bannerAuctionSettings"
            kotlin.jvm.internal.n.e(r5, r6)
            int r5 = r23.a()
            long r6 = r23.b()
            r8 = 1000(0x3e8, float:1.401E-42)
            long r10 = (long) r8
            long r6 = r6 / r10
            int r6 = (int) r6
            boolean r7 = r23.c()
            int r8 = r23.f()
            com.ironsource.o2 r10 = com.ironsource.i6.a(r23)
            com.ironsource.i2 r12 = new com.ironsource.i2
            r11 = r12
            long r13 = r23.j()
            r12.<init>(r13)
            long r12 = r23.e()
            boolean r14 = r23.l()
            boolean r16 = r23.n()
            r15 = r16
            boolean r16 = r23.m()
            r17 = -1
            r9 = r17
            r17 = 0
            r18 = 32768(0x8000, float:4.5918E-41)
            r19 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r1 = r21
            r0.f17656s = r1
            r1 = r22
            r0.f17657t = r1
            r1 = r23
            r0.f17658u = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.h6.<init>(java.lang.String, java.util.List, com.ironsource.u6):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h6 a(h6 h6Var, String str, List list, u6 u6Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = h6Var.f17656s;
        }
        if ((i10 & 2) != 0) {
            list = h6Var.f17657t;
        }
        if ((i10 & 4) != 0) {
            u6Var = h6Var.f17658u;
        }
        return h6Var.a(str, list, u6Var);
    }

    public final h6 a(String str, List<? extends NetworkSettings> list, u6 configs) {
        kotlin.jvm.internal.n.f(configs, "configs");
        return new h6(str, list, configs);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h6) {
            h6 h6Var = (h6) obj;
            return kotlin.jvm.internal.n.a(this.f17656s, h6Var.f17656s) && kotlin.jvm.internal.n.a(this.f17657t, h6Var.f17657t) && kotlin.jvm.internal.n.a(this.f17658u, h6Var.f17658u);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f17656s;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f17657t;
        return ((hashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f17658u.hashCode();
    }

    @Override // com.ironsource.u0
    public List<NetworkSettings> j() {
        return this.f17657t;
    }

    @Override // com.ironsource.u0
    public String o() {
        return this.f17656s;
    }

    public final String s() {
        return this.f17656s;
    }

    public final List<NetworkSettings> t() {
        return this.f17657t;
    }

    public String toString() {
        return "BannerAdManagerData(userId=" + this.f17656s + ", providerList=" + this.f17657t + ", configs=" + this.f17658u + ')';
    }

    public final u6 u() {
        return this.f17658u;
    }

    public final u6 v() {
        return this.f17658u;
    }
}

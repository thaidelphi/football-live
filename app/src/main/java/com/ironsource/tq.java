package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class tq extends u0 {

    /* renamed from: s  reason: collision with root package name */
    private final String f20853s;

    /* renamed from: t  reason: collision with root package name */
    private final List<NetworkSettings> f20854t;

    /* renamed from: u  reason: collision with root package name */
    private final yq f20855u;

    /* renamed from: v  reason: collision with root package name */
    private final boolean f20856v;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tq(java.lang.String r21, java.util.List<? extends com.ironsource.mediationsdk.model.NetworkSettings> r22, com.ironsource.yq r23, boolean r24) {
        /*
            r20 = this;
            r15 = r20
            r14 = r23
            r0 = r20
            r2 = r21
            r3 = r22
            java.lang.String r1 = "configs"
            kotlin.jvm.internal.n.f(r14, r1)
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO
            com.ironsource.o5 r5 = r23.k()
            r4 = r5
            java.lang.String r6 = "configs.rewardedVideoAuctionSettings"
            kotlin.jvm.internal.n.e(r5, r6)
            int r5 = r23.g()
            int r6 = r23.h()
            boolean r7 = r23.j()
            int r8 = r23.b()
            int r9 = r23.c()
            com.ironsource.o2 r10 = com.ironsource.uq.a(r23, r24)
            com.ironsource.i2 r12 = new com.ironsource.i2
            r11 = r12
            r13 = -1
            r12.<init>(r13)
            long r12 = r23.l()
            boolean r14 = r23.f()
            boolean r16 = r23.o()
            r15 = r16
            boolean r16 = r23.n()
            r17 = 0
            r18 = 32768(0x8000, float:4.5918E-41)
            r19 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r1 = r21
            r0.f20853s = r1
            r1 = r22
            r0.f20854t = r1
            r1 = r23
            r0.f20855u = r1
            r1 = r24
            r0.f20856v = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.tq.<init>(java.lang.String, java.util.List, com.ironsource.yq, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ tq a(tq tqVar, String str, List list, yq yqVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tqVar.f20853s;
        }
        if ((i10 & 2) != 0) {
            list = tqVar.f20854t;
        }
        if ((i10 & 4) != 0) {
            yqVar = tqVar.f20855u;
        }
        if ((i10 & 8) != 0) {
            z10 = tqVar.f20856v;
        }
        return tqVar.a(str, list, yqVar, z10);
    }

    public final tq a(String str, List<? extends NetworkSettings> list, yq configs, boolean z10) {
        kotlin.jvm.internal.n.f(configs, "configs");
        return new tq(str, list, configs, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tq) {
            tq tqVar = (tq) obj;
            return kotlin.jvm.internal.n.a(this.f20853s, tqVar.f20853s) && kotlin.jvm.internal.n.a(this.f20854t, tqVar.f20854t) && kotlin.jvm.internal.n.a(this.f20855u, tqVar.f20855u) && this.f20856v == tqVar.f20856v;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f20853s;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f20854t;
        int hashCode2 = (((hashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f20855u.hashCode()) * 31;
        boolean z10 = this.f20856v;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode2 + i10;
    }

    @Override // com.ironsource.u0
    public List<NetworkSettings> j() {
        return this.f20854t;
    }

    @Override // com.ironsource.u0
    public String o() {
        return this.f20853s;
    }

    public final String s() {
        return this.f20853s;
    }

    public final List<NetworkSettings> t() {
        return this.f20854t;
    }

    public String toString() {
        return "RewardedVideoAdDataManager(userId=" + this.f20853s + ", providerList=" + this.f20854t + ", configs=" + this.f20855u + ", isManual=" + this.f20856v + ')';
    }

    public final yq u() {
        return this.f20855u;
    }

    public final boolean v() {
        return this.f20856v;
    }

    public final yq w() {
        return this.f20855u;
    }

    public final boolean x() {
        return this.f20856v;
    }
}

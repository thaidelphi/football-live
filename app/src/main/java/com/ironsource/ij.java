package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ij extends u0 {

    /* renamed from: s  reason: collision with root package name */
    private final String f17834s;

    /* renamed from: t  reason: collision with root package name */
    private final List<NetworkSettings> f17835t;

    /* renamed from: u  reason: collision with root package name */
    private final mj f17836u;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ij(java.lang.String r25, java.util.List<? extends com.ironsource.mediationsdk.model.NetworkSettings> r26, com.ironsource.mj r27) {
        /*
            r24 = this;
            r9 = r24
            r15 = r27
            r0 = r24
            r2 = r25
            r3 = r26
            java.lang.String r1 = "configs"
            kotlin.jvm.internal.n.f(r15, r1)
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL
            com.ironsource.o5 r5 = r27.g()
            r4 = r5
            java.lang.String r6 = "configs.interstitialAuctionSettings"
            kotlin.jvm.internal.n.e(r5, r6)
            int r5 = r27.c()
            int r6 = r27.d()
            boolean r7 = r27.f()
            int r8 = r27.b()
            com.ironsource.o2 r16 = new com.ironsource.o2
            r10 = r16
            com.ironsource.o2$a r17 = com.ironsource.o2.a.MANUAL
            com.ironsource.o5 r11 = r27.g()
            long r18 = r11.j()
            com.ironsource.o5 r11 = r27.g()
            long r20 = r11.b()
            r22 = -1
            r16.<init>(r17, r18, r20, r22)
            com.ironsource.i2 r12 = new com.ironsource.i2
            r11 = r12
            r13 = -1
            r12.<init>(r13)
            long r12 = r27.h()
            boolean r14 = r27.k()
            boolean r16 = r27.m()
            r15 = r16
            boolean r16 = r27.l()
            r17 = -1
            r9 = r17
            r17 = 0
            r18 = 32768(0x8000, float:4.5918E-41)
            r19 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19)
            r1 = r25
            r0.f17834s = r1
            r1 = r26
            r0.f17835t = r1
            r1 = r27
            r0.f17836u = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.ij.<init>(java.lang.String, java.util.List, com.ironsource.mj):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ij a(ij ijVar, String str, List list, mj mjVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ijVar.f17834s;
        }
        if ((i10 & 2) != 0) {
            list = ijVar.f17835t;
        }
        if ((i10 & 4) != 0) {
            mjVar = ijVar.f17836u;
        }
        return ijVar.a(str, list, mjVar);
    }

    public final ij a(String str, List<? extends NetworkSettings> list, mj configs) {
        kotlin.jvm.internal.n.f(configs, "configs");
        return new ij(str, list, configs);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ij) {
            ij ijVar = (ij) obj;
            return kotlin.jvm.internal.n.a(this.f17834s, ijVar.f17834s) && kotlin.jvm.internal.n.a(this.f17835t, ijVar.f17835t) && kotlin.jvm.internal.n.a(this.f17836u, ijVar.f17836u);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f17834s;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f17835t;
        return ((hashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f17836u.hashCode();
    }

    @Override // com.ironsource.u0
    public List<NetworkSettings> j() {
        return this.f17835t;
    }

    @Override // com.ironsource.u0
    public String o() {
        return this.f17834s;
    }

    public final String s() {
        return this.f17834s;
    }

    public final List<NetworkSettings> t() {
        return this.f17835t;
    }

    public String toString() {
        return "InterstitialAdManagerData(userId=" + this.f17834s + ", providerList=" + this.f17835t + ", configs=" + this.f17836u + ')';
    }

    public final mj u() {
        return this.f17836u;
    }

    public final mj v() {
        return this.f17836u;
    }
}

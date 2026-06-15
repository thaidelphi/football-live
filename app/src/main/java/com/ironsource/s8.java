package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class s8 {

    /* renamed from: a  reason: collision with root package name */
    private final yq f20132a;

    /* renamed from: b  reason: collision with root package name */
    private final mj f20133b;

    /* renamed from: c  reason: collision with root package name */
    private final u6 f20134c;

    /* renamed from: d  reason: collision with root package name */
    private final rm f20135d;

    /* renamed from: e  reason: collision with root package name */
    private final a4 f20136e;

    /* renamed from: f  reason: collision with root package name */
    private final pu f20137f;

    /* renamed from: g  reason: collision with root package name */
    private final g1 f20138g;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private yq f20139a;

        /* renamed from: b  reason: collision with root package name */
        private mj f20140b;

        /* renamed from: c  reason: collision with root package name */
        private u6 f20141c;

        /* renamed from: d  reason: collision with root package name */
        private rm f20142d;

        /* renamed from: e  reason: collision with root package name */
        private a4 f20143e;

        /* renamed from: f  reason: collision with root package name */
        private pu f20144f;

        /* renamed from: g  reason: collision with root package name */
        private g1 f20145g;

        public a() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public a(yq yqVar, mj mjVar, u6 u6Var, rm rmVar, a4 a4Var, pu puVar, g1 g1Var) {
            this.f20139a = yqVar;
            this.f20140b = mjVar;
            this.f20141c = u6Var;
            this.f20142d = rmVar;
            this.f20143e = a4Var;
            this.f20144f = puVar;
            this.f20145g = g1Var;
        }

        public /* synthetic */ a(yq yqVar, mj mjVar, u6 u6Var, rm rmVar, a4 a4Var, pu puVar, g1 g1Var, int i10, kotlin.jvm.internal.h hVar) {
            this((i10 & 1) != 0 ? null : yqVar, (i10 & 2) != 0 ? null : mjVar, (i10 & 4) != 0 ? null : u6Var, (i10 & 8) != 0 ? null : rmVar, (i10 & 16) != 0 ? null : a4Var, (i10 & 32) != 0 ? null : puVar, (i10 & 64) != 0 ? null : g1Var);
        }

        public static /* synthetic */ a a(a aVar, yq yqVar, mj mjVar, u6 u6Var, rm rmVar, a4 a4Var, pu puVar, g1 g1Var, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                yqVar = aVar.f20139a;
            }
            if ((i10 & 2) != 0) {
                mjVar = aVar.f20140b;
            }
            mj mjVar2 = mjVar;
            if ((i10 & 4) != 0) {
                u6Var = aVar.f20141c;
            }
            u6 u6Var2 = u6Var;
            if ((i10 & 8) != 0) {
                rmVar = aVar.f20142d;
            }
            rm rmVar2 = rmVar;
            if ((i10 & 16) != 0) {
                a4Var = aVar.f20143e;
            }
            a4 a4Var2 = a4Var;
            if ((i10 & 32) != 0) {
                puVar = aVar.f20144f;
            }
            pu puVar2 = puVar;
            if ((i10 & 64) != 0) {
                g1Var = aVar.f20145g;
            }
            return aVar.a(yqVar, mjVar2, u6Var2, rmVar2, a4Var2, puVar2, g1Var);
        }

        public final a a(a4 a4Var) {
            this.f20143e = a4Var;
            return this;
        }

        public final a a(g1 g1Var) {
            this.f20145g = g1Var;
            return this;
        }

        public final a a(mj mjVar) {
            this.f20140b = mjVar;
            return this;
        }

        public final a a(rm rmVar) {
            this.f20142d = rmVar;
            return this;
        }

        public final a a(u6 u6Var) {
            this.f20141c = u6Var;
            return this;
        }

        public final a a(yq yqVar) {
            this.f20139a = yqVar;
            return this;
        }

        public final a a(yq yqVar, mj mjVar, u6 u6Var, rm rmVar, a4 a4Var, pu puVar, g1 g1Var) {
            return new a(yqVar, mjVar, u6Var, rmVar, a4Var, puVar, g1Var);
        }

        public final s8 a() {
            return new s8(this.f20139a, this.f20140b, this.f20141c, this.f20142d, this.f20143e, this.f20144f, this.f20145g, null);
        }

        public final void a(pu puVar) {
            this.f20144f = puVar;
        }

        public final a b(pu puVar) {
            this.f20144f = puVar;
            return this;
        }

        public final yq b() {
            return this.f20139a;
        }

        public final void b(a4 a4Var) {
            this.f20143e = a4Var;
        }

        public final void b(g1 g1Var) {
            this.f20145g = g1Var;
        }

        public final void b(mj mjVar) {
            this.f20140b = mjVar;
        }

        public final void b(rm rmVar) {
            this.f20142d = rmVar;
        }

        public final void b(u6 u6Var) {
            this.f20141c = u6Var;
        }

        public final void b(yq yqVar) {
            this.f20139a = yqVar;
        }

        public final mj c() {
            return this.f20140b;
        }

        public final u6 d() {
            return this.f20141c;
        }

        public final rm e() {
            return this.f20142d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return kotlin.jvm.internal.n.a(this.f20139a, aVar.f20139a) && kotlin.jvm.internal.n.a(this.f20140b, aVar.f20140b) && kotlin.jvm.internal.n.a(this.f20141c, aVar.f20141c) && kotlin.jvm.internal.n.a(this.f20142d, aVar.f20142d) && kotlin.jvm.internal.n.a(this.f20143e, aVar.f20143e) && kotlin.jvm.internal.n.a(this.f20144f, aVar.f20144f) && kotlin.jvm.internal.n.a(this.f20145g, aVar.f20145g);
            }
            return false;
        }

        public final a4 f() {
            return this.f20143e;
        }

        public final pu g() {
            return this.f20144f;
        }

        public final g1 h() {
            return this.f20145g;
        }

        public int hashCode() {
            yq yqVar = this.f20139a;
            int hashCode = (yqVar == null ? 0 : yqVar.hashCode()) * 31;
            mj mjVar = this.f20140b;
            int hashCode2 = (hashCode + (mjVar == null ? 0 : mjVar.hashCode())) * 31;
            u6 u6Var = this.f20141c;
            int hashCode3 = (hashCode2 + (u6Var == null ? 0 : u6Var.hashCode())) * 31;
            rm rmVar = this.f20142d;
            int hashCode4 = (hashCode3 + (rmVar == null ? 0 : rmVar.hashCode())) * 31;
            a4 a4Var = this.f20143e;
            int hashCode5 = (hashCode4 + (a4Var == null ? 0 : a4Var.hashCode())) * 31;
            pu puVar = this.f20144f;
            int hashCode6 = (hashCode5 + (puVar == null ? 0 : puVar.hashCode())) * 31;
            g1 g1Var = this.f20145g;
            return hashCode6 + (g1Var != null ? g1Var.hashCode() : 0);
        }

        public final g1 i() {
            return this.f20145g;
        }

        public final a4 j() {
            return this.f20143e;
        }

        public final u6 k() {
            return this.f20141c;
        }

        public final mj l() {
            return this.f20140b;
        }

        public final rm m() {
            return this.f20142d;
        }

        public final yq n() {
            return this.f20139a;
        }

        public final pu o() {
            return this.f20144f;
        }

        public String toString() {
            return "Builder(rewardedVideoConfigurations=" + this.f20139a + ", interstitialConfigurations=" + this.f20140b + ", bannerConfigurations=" + this.f20141c + ", nativeAdConfigurations=" + this.f20142d + ", applicationConfigurations=" + this.f20143e + ", testSuiteSettings=" + this.f20144f + ", adQualityConfigurations=" + this.f20145g + ')';
        }
    }

    private s8(yq yqVar, mj mjVar, u6 u6Var, rm rmVar, a4 a4Var, pu puVar, g1 g1Var) {
        this.f20132a = yqVar;
        this.f20133b = mjVar;
        this.f20134c = u6Var;
        this.f20135d = rmVar;
        this.f20136e = a4Var;
        this.f20137f = puVar;
        this.f20138g = g1Var;
    }

    public /* synthetic */ s8(yq yqVar, mj mjVar, u6 u6Var, rm rmVar, a4 a4Var, pu puVar, g1 g1Var, kotlin.jvm.internal.h hVar) {
        this(yqVar, mjVar, u6Var, rmVar, a4Var, puVar, g1Var);
    }

    public final g1 a() {
        return this.f20138g;
    }

    public final a4 b() {
        return this.f20136e;
    }

    public final u6 c() {
        return this.f20134c;
    }

    public final mj d() {
        return this.f20133b;
    }

    public final rm e() {
        return this.f20135d;
    }

    public final yq f() {
        return this.f20132a;
    }

    public final pu g() {
        return this.f20137f;
    }

    public String toString() {
        return "configurations(\n" + this.f20132a + '\n' + this.f20133b + '\n' + this.f20134c + '\n' + this.f20135d + ')';
    }
}

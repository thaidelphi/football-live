package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class i7 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f17806c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final b f17807a;

    /* renamed from: b  reason: collision with root package name */
    private final j6 f17808b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: com.ironsource.i7$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public /* synthetic */ class C0222a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f17809a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.TIMED_LOAD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.TIMED_SHOW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f17809a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final i7 a(o1 adTools, w6 bannerContainer, b config, j6 bannerAdProperties, j7 bannerStrategyListener, n6 createBannerAdUnitFactory) {
            kotlin.jvm.internal.n.f(adTools, "adTools");
            kotlin.jvm.internal.n.f(bannerContainer, "bannerContainer");
            kotlin.jvm.internal.n.f(config, "config");
            kotlin.jvm.internal.n.f(bannerAdProperties, "bannerAdProperties");
            kotlin.jvm.internal.n.f(bannerStrategyListener, "bannerStrategyListener");
            kotlin.jvm.internal.n.f(createBannerAdUnitFactory, "createBannerAdUnitFactory");
            int i10 = C0222a.f17809a[config.e().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return new wu(adTools, bannerContainer, config, bannerAdProperties, bannerStrategyListener, createBannerAdUnitFactory);
                }
                throw new i8.l();
            }
            return new vu(adTools, bannerContainer, config, bannerAdProperties, bannerStrategyListener, createBannerAdUnitFactory);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final c f17810a;

        /* renamed from: b  reason: collision with root package name */
        private final long f17811b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f17812c;

        public b(c strategyType, long j10, boolean z10) {
            kotlin.jvm.internal.n.f(strategyType, "strategyType");
            this.f17810a = strategyType;
            this.f17811b = j10;
            this.f17812c = z10;
        }

        public static /* synthetic */ b a(b bVar, c cVar, long j10, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cVar = bVar.f17810a;
            }
            if ((i10 & 2) != 0) {
                j10 = bVar.f17811b;
            }
            if ((i10 & 4) != 0) {
                z10 = bVar.f17812c;
            }
            return bVar.a(cVar, j10, z10);
        }

        public final b a(c strategyType, long j10, boolean z10) {
            kotlin.jvm.internal.n.f(strategyType, "strategyType");
            return new b(strategyType, j10, z10);
        }

        public final c a() {
            return this.f17810a;
        }

        public final long b() {
            return this.f17811b;
        }

        public final boolean c() {
            return this.f17812c;
        }

        public final long d() {
            return this.f17811b;
        }

        public final c e() {
            return this.f17810a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f17810a == bVar.f17810a && this.f17811b == bVar.f17811b && this.f17812c == bVar.f17812c;
            }
            return false;
        }

        public final boolean f() {
            return this.f17812c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.f17810a.hashCode() * 31) + androidx.privacysandbox.ads.adservices.topics.d.a(this.f17811b)) * 31;
            boolean z10 = this.f17812c;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode + i10;
        }

        public String toString() {
            return "Config(strategyType=" + this.f17810a + ", refreshInterval=" + this.f17811b + ", isAutoRefreshEnabled=" + this.f17812c + ')';
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum c {
        TIMED_LOAD,
        TIMED_SHOW
    }

    public i7(b config, j6 bannerAdProperties) {
        kotlin.jvm.internal.n.f(config, "config");
        kotlin.jvm.internal.n.f(bannerAdProperties, "bannerAdProperties");
        this.f17807a = config;
        this.f17808b = bannerAdProperties;
    }

    public abstract void c();

    /* JADX INFO: Access modifiers changed from: protected */
    public final long d() {
        Long i10 = this.f17808b.i();
        return i10 != null ? i10.longValue() : this.f17807a.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean e() {
        Boolean h10 = this.f17808b.h();
        return h10 != null ? h10.booleanValue() : this.f17807a.f();
    }

    public abstract void f();

    public abstract void g();

    public abstract void h();
}

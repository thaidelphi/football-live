package com.ironsource;

import com.ironsource.ff;
import i8.o;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class mt implements ff, ff.a {

    /* renamed from: a  reason: collision with root package name */
    private final q9 f19311a;

    /* renamed from: b  reason: collision with root package name */
    private final ei f19312b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, jt> f19313c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private int f19314a;

        /* renamed from: b  reason: collision with root package name */
        private long f19315b;

        /* renamed from: c  reason: collision with root package name */
        private Long f19316c;

        public a(int i10, long j10, Long l10) {
            this.f19314a = i10;
            this.f19315b = j10;
            this.f19316c = l10;
        }

        public static /* synthetic */ a a(a aVar, int i10, long j10, Long l10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = aVar.f19314a;
            }
            if ((i11 & 2) != 0) {
                j10 = aVar.f19315b;
            }
            if ((i11 & 4) != 0) {
                l10 = aVar.f19316c;
            }
            return aVar.a(i10, j10, l10);
        }

        public final int a() {
            return this.f19314a;
        }

        public final a a(int i10, long j10, Long l10) {
            return new a(i10, j10, l10);
        }

        public final void a(int i10) {
            this.f19314a = i10;
        }

        public final void a(long j10) {
            this.f19315b = j10;
        }

        public final void a(Long l10) {
            this.f19316c = l10;
        }

        public final long b() {
            return this.f19315b;
        }

        public final Long c() {
            return this.f19316c;
        }

        public final int d() {
            return this.f19314a;
        }

        public final long e() {
            return this.f19315b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f19314a == aVar.f19314a && this.f19315b == aVar.f19315b && kotlin.jvm.internal.n.a(this.f19316c, aVar.f19316c);
            }
            return false;
        }

        public final Long f() {
            return this.f19316c;
        }

        public int hashCode() {
            int a10 = ((this.f19314a * 31) + androidx.privacysandbox.ads.adservices.topics.d.a(this.f19315b)) * 31;
            Long l10 = this.f19316c;
            return a10 + (l10 == null ? 0 : l10.hashCode());
        }

        public String toString() {
            return "ShowCountCappingInfo(currentNumberOfShows=" + this.f19314a + ", currentTime=" + this.f19315b + ", currentTimeThreshold=" + this.f19316c + ')';
        }
    }

    public mt(q9 currentTimeProvider, ei serviceDataRepository) {
        kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.n.f(serviceDataRepository, "serviceDataRepository");
        this.f19311a = currentTimeProvider;
        this.f19312b = serviceDataRepository;
        this.f19313c = new LinkedHashMap();
    }

    private final boolean a(jt jtVar, String str) {
        a c10 = c(str);
        Long f10 = c10.f();
        if (f10 != null) {
            return c10.d() >= jtVar.a() && this.f19311a.a() < f10.longValue();
        }
        return false;
    }

    private final a c(String str) {
        return new a(this.f19312b.a(str), this.f19311a.a(), this.f19312b.b(str));
    }

    @Override // com.ironsource.ff
    public l8 a(String identifier) {
        kotlin.jvm.internal.n.f(identifier, "identifier");
        jt jtVar = this.f19313c.get(identifier);
        if (jtVar != null && a(jtVar, identifier)) {
            return new l8(true, n8.ShowCount);
        }
        return new l8(false, null, 2, null);
    }

    @Override // com.ironsource.ff.a
    public Object a(String identifier, n8 cappingType, df cappingConfig) {
        Object a10;
        kotlin.jvm.internal.n.f(identifier, "identifier");
        kotlin.jvm.internal.n.f(cappingType, "cappingType");
        kotlin.jvm.internal.n.f(cappingConfig, "cappingConfig");
        Object c10 = cappingConfig.c();
        if (i8.o.g(c10)) {
            jt jtVar = (jt) c10;
            if (jtVar != null) {
                this.f19313c.put(identifier, jtVar);
            }
        } else {
            Throwable d10 = i8.o.d(c10);
            if (d10 != null) {
                o.a aVar = i8.o.f26626b;
                a10 = i8.p.a(d10);
                return i8.o.b(a10);
            }
        }
        o.a aVar2 = i8.o.f26626b;
        a10 = i8.w.f26638a;
        return i8.o.b(a10);
    }

    public final Map<String, jt> a() {
        return this.f19313c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r4 >= (r2 != null ? r2.longValue() : 0)) goto L15;
     */
    @Override // com.ironsource.ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "identifier"
            kotlin.jvm.internal.n.f(r9, r0)
            java.util.Map<java.lang.String, com.ironsource.jt> r0 = r8.f19313c
            java.lang.Object r0 = r0.get(r9)
            com.ironsource.jt r0 = (com.ironsource.jt) r0
            if (r0 != 0) goto L10
            return
        L10:
            com.ironsource.mt$a r1 = r8.c(r9)
            int r2 = r1.d()
            r3 = 1
            if (r2 == 0) goto L30
            long r4 = r1.e()
            java.lang.Long r2 = r1.f()
            if (r2 == 0) goto L2a
            long r6 = r2.longValue()
            goto L2c
        L2a:
            r6 = 0
        L2c:
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L47
        L30:
            long r4 = r1.e()
            com.ironsource.m8 r0 = r0.b()
            r2 = 0
            long r6 = com.ironsource.m8.a(r0, r2, r3, r2)
            long r4 = r4 + r6
            com.ironsource.ei r0 = r8.f19312b
            r0.a(r4, r9)
            r0 = 0
            r1.a(r0)
        L47:
            int r0 = r1.d()
            int r0 = r0 + r3
            r1.a(r0)
            com.ironsource.ei r0 = r8.f19312b
            int r1 = r1.d()
            r0.a(r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mt.b(java.lang.String):void");
    }
}

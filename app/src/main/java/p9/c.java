package p9;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import n9.a0;
import n9.r;
import n9.y;
/* compiled from: CacheStrategy.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final y f29912a;

    /* renamed from: b  reason: collision with root package name */
    public final a0 f29913b;

    /* compiled from: CacheStrategy.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final long f29914a;

        /* renamed from: b  reason: collision with root package name */
        final y f29915b;

        /* renamed from: c  reason: collision with root package name */
        final a0 f29916c;

        /* renamed from: d  reason: collision with root package name */
        private Date f29917d;

        /* renamed from: e  reason: collision with root package name */
        private String f29918e;

        /* renamed from: f  reason: collision with root package name */
        private Date f29919f;

        /* renamed from: g  reason: collision with root package name */
        private String f29920g;

        /* renamed from: h  reason: collision with root package name */
        private Date f29921h;

        /* renamed from: i  reason: collision with root package name */
        private long f29922i;

        /* renamed from: j  reason: collision with root package name */
        private long f29923j;

        /* renamed from: k  reason: collision with root package name */
        private String f29924k;

        /* renamed from: l  reason: collision with root package name */
        private int f29925l;

        public a(long j10, y yVar, a0 a0Var) {
            this.f29925l = -1;
            this.f29914a = j10;
            this.f29915b = yVar;
            this.f29916c = a0Var;
            if (a0Var != null) {
                this.f29922i = a0Var.S();
                this.f29923j = a0Var.P();
                r z10 = a0Var.z();
                int g10 = z10.g();
                for (int i10 = 0; i10 < g10; i10++) {
                    String e8 = z10.e(i10);
                    String i11 = z10.i(i10);
                    if ("Date".equalsIgnoreCase(e8)) {
                        this.f29917d = r9.d.b(i11);
                        this.f29918e = i11;
                    } else if ("Expires".equalsIgnoreCase(e8)) {
                        this.f29921h = r9.d.b(i11);
                    } else if ("Last-Modified".equalsIgnoreCase(e8)) {
                        this.f29919f = r9.d.b(i11);
                        this.f29920g = i11;
                    } else if ("ETag".equalsIgnoreCase(e8)) {
                        this.f29924k = i11;
                    } else if ("Age".equalsIgnoreCase(e8)) {
                        this.f29925l = r9.e.f(i11, -1);
                    }
                }
            }
        }

        private long a() {
            Date date = this.f29917d;
            long max = date != null ? Math.max(0L, this.f29923j - date.getTime()) : 0L;
            int i10 = this.f29925l;
            if (i10 != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i10));
            }
            long j10 = this.f29923j;
            return max + (j10 - this.f29922i) + (this.f29914a - j10);
        }

        private long b() {
            long j10;
            long j11;
            n9.d b10 = this.f29916c.b();
            if (b10.d() != -1) {
                return TimeUnit.SECONDS.toMillis(b10.d());
            }
            if (this.f29921h != null) {
                Date date = this.f29917d;
                if (date != null) {
                    j11 = date.getTime();
                } else {
                    j11 = this.f29923j;
                }
                long time = this.f29921h.getTime() - j11;
                if (time > 0) {
                    return time;
                }
                return 0L;
            } else if (this.f29919f == null || this.f29916c.R().i().x() != null) {
                return 0L;
            } else {
                Date date2 = this.f29917d;
                if (date2 != null) {
                    j10 = date2.getTime();
                } else {
                    j10 = this.f29922i;
                }
                long time2 = j10 - this.f29919f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
                return 0L;
            }
        }

        private c d() {
            if (this.f29916c == null) {
                return new c(this.f29915b, null);
            }
            if (this.f29915b.f() && this.f29916c.k() == null) {
                return new c(this.f29915b, null);
            }
            if (!c.a(this.f29916c, this.f29915b)) {
                return new c(this.f29915b, null);
            }
            n9.d b10 = this.f29915b.b();
            if (!b10.h() && !e(this.f29915b)) {
                n9.d b11 = this.f29916c.b();
                long a10 = a();
                long b12 = b();
                if (b10.d() != -1) {
                    b12 = Math.min(b12, TimeUnit.SECONDS.toMillis(b10.d()));
                }
                long j10 = 0;
                long millis = b10.f() != -1 ? TimeUnit.SECONDS.toMillis(b10.f()) : 0L;
                if (!b11.g() && b10.e() != -1) {
                    j10 = TimeUnit.SECONDS.toMillis(b10.e());
                }
                if (!b11.h()) {
                    long j11 = millis + a10;
                    if (j11 < j10 + b12) {
                        a0.a J = this.f29916c.J();
                        if (j11 >= b12) {
                            J.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (a10 > 86400000 && f()) {
                            J.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new c(null, J.c());
                    }
                }
                String str = this.f29924k;
                String str2 = "If-Modified-Since";
                if (str != null) {
                    str2 = "If-None-Match";
                } else if (this.f29919f != null) {
                    str = this.f29920g;
                } else if (this.f29917d != null) {
                    str = this.f29918e;
                } else {
                    return new c(this.f29915b, null);
                }
                r.a f10 = this.f29915b.e().f();
                o9.a.f29470a.b(f10, str2, str);
                return new c(this.f29915b.h().e(f10.d()).b(), this.f29916c);
            }
            return new c(this.f29915b, null);
        }

        private static boolean e(y yVar) {
            return (yVar.c("If-Modified-Since") == null && yVar.c("If-None-Match") == null) ? false : true;
        }

        private boolean f() {
            return this.f29916c.b().d() == -1 && this.f29921h == null;
        }

        public c c() {
            c d10 = d();
            return (d10.f29912a == null || !this.f29915b.b().j()) ? d10 : new c(null, null);
        }
    }

    c(y yVar, a0 a0Var) {
        this.f29912a = yVar;
        this.f29913b = a0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
        if (r3.b().b() == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(n9.a0 r3, n9.y r4) {
        /*
            int r0 = r3.j()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L5a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L5a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L5a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L5a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L5a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L5a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L31
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L5a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L5a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L5a
            switch(r0) {
                case 300: goto L5a;
                case 301: goto L5a;
                case 302: goto L31;
                default: goto L30;
            }
        L30:
            goto L59
        L31:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.t(r0)
            if (r0 != 0) goto L5a
            n9.d r0 = r3.b()
            int r0 = r0.d()
            r1 = -1
            if (r0 != r1) goto L5a
            n9.d r0 = r3.b()
            boolean r0 = r0.c()
            if (r0 != 0) goto L5a
            n9.d r0 = r3.b()
            boolean r0 = r0.b()
            if (r0 == 0) goto L59
            goto L5a
        L59:
            return r2
        L5a:
            n9.d r3 = r3.b()
            boolean r3 = r3.i()
            if (r3 != 0) goto L6f
            n9.d r3 = r4.b()
            boolean r3 = r3.i()
            if (r3 != 0) goto L6f
            r2 = 1
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.c.a(n9.a0, n9.y):boolean");
    }
}

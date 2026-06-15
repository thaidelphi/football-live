package n3;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import f4.c;
import n3.h;
import n3.l3;
import n3.u1;
import y5.q;
/* compiled from: Timeline.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class l3 implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final l3 f28128a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final h.a<l3> f28129b = new h.a() { // from class: n3.k3
        @Override // n3.h.a
        public final h a(Bundle bundle) {
            l3 b10;
            b10 = l3.b(bundle);
            return b10;
        }
    };

    /* compiled from: Timeline.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends l3 {
        a() {
        }

        @Override // n3.l3
        public int f(Object obj) {
            return -1;
        }

        @Override // n3.l3
        public b k(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // n3.l3
        public int m() {
            return 0;
        }

        @Override // n3.l3
        public Object q(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // n3.l3
        public d s(int i10, d dVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // n3.l3
        public int t() {
            return 0;
        }
    }

    /* compiled from: Timeline.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b implements h {

        /* renamed from: h  reason: collision with root package name */
        public static final h.a<b> f28130h = new h.a() { // from class: n3.m3
            @Override // n3.h.a
            public final h a(Bundle bundle) {
                l3.b c10;
                c10 = l3.b.c(bundle);
                return c10;
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public Object f28131a;

        /* renamed from: b  reason: collision with root package name */
        public Object f28132b;

        /* renamed from: c  reason: collision with root package name */
        public int f28133c;

        /* renamed from: d  reason: collision with root package name */
        public long f28134d;

        /* renamed from: e  reason: collision with root package name */
        public long f28135e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f28136f;

        /* renamed from: g  reason: collision with root package name */
        private f4.c f28137g = f4.c.f25390g;

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(Bundle bundle) {
            f4.c cVar;
            int i10 = bundle.getInt(u(0), 0);
            long j10 = bundle.getLong(u(1), -9223372036854775807L);
            long j11 = bundle.getLong(u(2), 0L);
            boolean z10 = bundle.getBoolean(u(3));
            Bundle bundle2 = bundle.getBundle(u(4));
            if (bundle2 != null) {
                cVar = f4.c.f25392i.a(bundle2);
            } else {
                cVar = f4.c.f25390g;
            }
            f4.c cVar2 = cVar;
            b bVar = new b();
            bVar.w(null, null, i10, j10, j11, cVar2, z10);
            return bVar;
        }

        private static String u(int i10) {
            return Integer.toString(i10, 36);
        }

        public int d(int i10) {
            return this.f28137g.c(i10).f25401b;
        }

        public long e(int i10, int i11) {
            c.a c10 = this.f28137g.c(i10);
            if (c10.f25401b != -1) {
                return c10.f25405f[i11];
            }
            return -9223372036854775807L;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return a5.p0.c(this.f28131a, bVar.f28131a) && a5.p0.c(this.f28132b, bVar.f28132b) && this.f28133c == bVar.f28133c && this.f28134d == bVar.f28134d && this.f28135e == bVar.f28135e && this.f28136f == bVar.f28136f && a5.p0.c(this.f28137g, bVar.f28137g);
        }

        public int f() {
            return this.f28137g.f25394b;
        }

        public int g(long j10) {
            return this.f28137g.d(j10, this.f28134d);
        }

        public int h(long j10) {
            return this.f28137g.e(j10, this.f28134d);
        }

        public int hashCode() {
            Object obj = this.f28131a;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f28132b;
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            long j10 = this.f28134d;
            long j11 = this.f28135e;
            return ((((((((((hashCode + hashCode2) * 31) + this.f28133c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f28136f ? 1 : 0)) * 31) + this.f28137g.hashCode();
        }

        public long i(int i10) {
            return this.f28137g.c(i10).f25400a;
        }

        public long j() {
            return this.f28137g.f25395c;
        }

        public int k(int i10, int i11) {
            c.a c10 = this.f28137g.c(i10);
            if (c10.f25401b != -1) {
                return c10.f25404e[i11];
            }
            return 0;
        }

        public long l(int i10) {
            return this.f28137g.c(i10).f25406g;
        }

        public long m() {
            return this.f28134d;
        }

        public int n(int i10) {
            return this.f28137g.c(i10).e();
        }

        public int o(int i10, int i11) {
            return this.f28137g.c(i10).f(i11);
        }

        public long p() {
            return a5.p0.Z0(this.f28135e);
        }

        public long q() {
            return this.f28135e;
        }

        public int r() {
            return this.f28137g.f25397e;
        }

        public boolean s(int i10) {
            return !this.f28137g.c(i10).g();
        }

        public boolean t(int i10) {
            return this.f28137g.c(i10).f25407h;
        }

        public b v(Object obj, Object obj2, int i10, long j10, long j11) {
            return w(obj, obj2, i10, j10, j11, f4.c.f25390g, false);
        }

        public b w(Object obj, Object obj2, int i10, long j10, long j11, f4.c cVar, boolean z10) {
            this.f28131a = obj;
            this.f28132b = obj2;
            this.f28133c = i10;
            this.f28134d = j10;
            this.f28135e = j11;
            this.f28137g = cVar;
            this.f28136f = z10;
            return this;
        }
    }

    /* compiled from: Timeline.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c extends l3 {

        /* renamed from: c  reason: collision with root package name */
        private final y5.q<d> f28138c;

        /* renamed from: d  reason: collision with root package name */
        private final y5.q<b> f28139d;

        /* renamed from: e  reason: collision with root package name */
        private final int[] f28140e;

        /* renamed from: f  reason: collision with root package name */
        private final int[] f28141f;

        public c(y5.q<d> qVar, y5.q<b> qVar2, int[] iArr) {
            a5.a.a(qVar.size() == iArr.length);
            this.f28138c = qVar;
            this.f28139d = qVar2;
            this.f28140e = iArr;
            this.f28141f = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f28141f[iArr[i10]] = i10;
            }
        }

        @Override // n3.l3
        public int e(boolean z10) {
            if (u()) {
                return -1;
            }
            if (z10) {
                return this.f28140e[0];
            }
            return 0;
        }

        @Override // n3.l3
        public int f(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // n3.l3
        public int g(boolean z10) {
            if (u()) {
                return -1;
            }
            if (z10) {
                return this.f28140e[t() - 1];
            }
            return t() - 1;
        }

        @Override // n3.l3
        public int i(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != g(z10)) {
                return z10 ? this.f28140e[this.f28141f[i10] + 1] : i10 + 1;
            } else if (i11 == 2) {
                return e(z10);
            } else {
                return -1;
            }
        }

        @Override // n3.l3
        public b k(int i10, b bVar, boolean z10) {
            b bVar2 = this.f28139d.get(i10);
            bVar.w(bVar2.f28131a, bVar2.f28132b, bVar2.f28133c, bVar2.f28134d, bVar2.f28135e, bVar2.f28137g, bVar2.f28136f);
            return bVar;
        }

        @Override // n3.l3
        public int m() {
            return this.f28139d.size();
        }

        @Override // n3.l3
        public int p(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != e(z10)) {
                return z10 ? this.f28140e[this.f28141f[i10] - 1] : i10 - 1;
            } else if (i11 == 2) {
                return g(z10);
            } else {
                return -1;
            }
        }

        @Override // n3.l3
        public Object q(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // n3.l3
        public d s(int i10, d dVar, long j10) {
            d dVar2 = this.f28138c.get(i10);
            dVar.i(dVar2.f28146a, dVar2.f28148c, dVar2.f28149d, dVar2.f28150e, dVar2.f28151f, dVar2.f28152g, dVar2.f28153h, dVar2.f28154i, dVar2.f28156k, dVar2.f28158m, dVar2.f28159n, dVar2.f28160o, dVar2.f28161p, dVar2.f28162q);
            dVar.f28157l = dVar2.f28157l;
            return dVar;
        }

        @Override // n3.l3
        public int t() {
            return this.f28138c.size();
        }
    }

    /* compiled from: Timeline.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d implements h {

        /* renamed from: r  reason: collision with root package name */
        public static final Object f28142r = new Object();

        /* renamed from: s  reason: collision with root package name */
        private static final Object f28143s = new Object();

        /* renamed from: t  reason: collision with root package name */
        private static final u1 f28144t = new u1.c().c("com.google.android.exoplayer2.Timeline").f(Uri.EMPTY).a();

        /* renamed from: u  reason: collision with root package name */
        public static final h.a<d> f28145u = new h.a() { // from class: n3.n3
            @Override // n3.h.a
            public final h a(Bundle bundle) {
                l3.d b10;
                b10 = l3.d.b(bundle);
                return b10;
            }
        };
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public Object f28147b;

        /* renamed from: d  reason: collision with root package name */
        public Object f28149d;

        /* renamed from: e  reason: collision with root package name */
        public long f28150e;

        /* renamed from: f  reason: collision with root package name */
        public long f28151f;

        /* renamed from: g  reason: collision with root package name */
        public long f28152g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f28153h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f28154i;
        @Deprecated

        /* renamed from: j  reason: collision with root package name */
        public boolean f28155j;

        /* renamed from: k  reason: collision with root package name */
        public u1.g f28156k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f28157l;

        /* renamed from: m  reason: collision with root package name */
        public long f28158m;

        /* renamed from: n  reason: collision with root package name */
        public long f28159n;

        /* renamed from: o  reason: collision with root package name */
        public int f28160o;

        /* renamed from: p  reason: collision with root package name */
        public int f28161p;

        /* renamed from: q  reason: collision with root package name */
        public long f28162q;

        /* renamed from: a  reason: collision with root package name */
        public Object f28146a = f28142r;

        /* renamed from: c  reason: collision with root package name */
        public u1 f28148c = f28144t;

        /* JADX INFO: Access modifiers changed from: private */
        public static d b(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(h(1));
            u1 a10 = bundle2 != null ? u1.f28371j.a(bundle2) : null;
            long j10 = bundle.getLong(h(2), -9223372036854775807L);
            long j11 = bundle.getLong(h(3), -9223372036854775807L);
            long j12 = bundle.getLong(h(4), -9223372036854775807L);
            boolean z10 = bundle.getBoolean(h(5), false);
            boolean z11 = bundle.getBoolean(h(6), false);
            Bundle bundle3 = bundle.getBundle(h(7));
            u1.g a11 = bundle3 != null ? u1.g.f28426g.a(bundle3) : null;
            boolean z12 = bundle.getBoolean(h(8), false);
            long j13 = bundle.getLong(h(9), 0L);
            long j14 = bundle.getLong(h(10), -9223372036854775807L);
            int i10 = bundle.getInt(h(11), 0);
            int i11 = bundle.getInt(h(12), 0);
            long j15 = bundle.getLong(h(13), 0L);
            d dVar = new d();
            dVar.i(f28143s, a10, null, j10, j11, j12, z10, z11, a11, j13, j14, i10, i11, j15);
            dVar.f28157l = z12;
            return dVar;
        }

        private static String h(int i10) {
            return Integer.toString(i10, 36);
        }

        public long c() {
            return a5.p0.Z(this.f28152g);
        }

        public long d() {
            return a5.p0.Z0(this.f28158m);
        }

        public long e() {
            return this.f28158m;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            d dVar = (d) obj;
            return a5.p0.c(this.f28146a, dVar.f28146a) && a5.p0.c(this.f28148c, dVar.f28148c) && a5.p0.c(this.f28149d, dVar.f28149d) && a5.p0.c(this.f28156k, dVar.f28156k) && this.f28150e == dVar.f28150e && this.f28151f == dVar.f28151f && this.f28152g == dVar.f28152g && this.f28153h == dVar.f28153h && this.f28154i == dVar.f28154i && this.f28157l == dVar.f28157l && this.f28158m == dVar.f28158m && this.f28159n == dVar.f28159n && this.f28160o == dVar.f28160o && this.f28161p == dVar.f28161p && this.f28162q == dVar.f28162q;
        }

        public long f() {
            return a5.p0.Z0(this.f28159n);
        }

        public boolean g() {
            a5.a.f(this.f28155j == (this.f28156k != null));
            return this.f28156k != null;
        }

        public int hashCode() {
            int hashCode = (((217 + this.f28146a.hashCode()) * 31) + this.f28148c.hashCode()) * 31;
            Object obj = this.f28149d;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            u1.g gVar = this.f28156k;
            int hashCode3 = gVar != null ? gVar.hashCode() : 0;
            long j10 = this.f28150e;
            long j11 = this.f28151f;
            long j12 = this.f28152g;
            long j13 = this.f28158m;
            long j14 = this.f28159n;
            long j15 = this.f28162q;
            return ((((((((((((((((((((((hashCode2 + hashCode3) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f28153h ? 1 : 0)) * 31) + (this.f28154i ? 1 : 0)) * 31) + (this.f28157l ? 1 : 0)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f28160o) * 31) + this.f28161p) * 31) + ((int) (j15 ^ (j15 >>> 32)));
        }

        public d i(Object obj, u1 u1Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, u1.g gVar, long j13, long j14, int i10, int i11, long j15) {
            u1.h hVar;
            this.f28146a = obj;
            this.f28148c = u1Var != null ? u1Var : f28144t;
            this.f28147b = (u1Var == null || (hVar = u1Var.f28373b) == null) ? null : hVar.f28445i;
            this.f28149d = obj2;
            this.f28150e = j10;
            this.f28151f = j11;
            this.f28152g = j12;
            this.f28153h = z10;
            this.f28154i = z11;
            this.f28155j = gVar != null;
            this.f28156k = gVar;
            this.f28158m = j13;
            this.f28159n = j14;
            this.f28160o = i10;
            this.f28161p = i11;
            this.f28162q = j15;
            this.f28157l = false;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static l3 b(Bundle bundle) {
        y5.q c10 = c(d.f28145u, a5.b.a(bundle, w(0)));
        y5.q c11 = c(b.f28130h, a5.b.a(bundle, w(1)));
        int[] intArray = bundle.getIntArray(w(2));
        if (intArray == null) {
            intArray = d(c10.size());
        }
        return new c(c10, c11, intArray);
    }

    private static <T extends h> y5.q<T> c(h.a<T> aVar, IBinder iBinder) {
        if (iBinder == null) {
            return y5.q.p();
        }
        q.a aVar2 = new q.a();
        y5.q<Bundle> a10 = g.a(iBinder);
        for (int i10 = 0; i10 < a10.size(); i10++) {
            aVar2.a(aVar.a(a10.get(i10)));
        }
        return aVar2.h();
    }

    private static int[] d(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i11;
        }
        return iArr;
    }

    private static String w(int i10) {
        return Integer.toString(i10, 36);
    }

    public int e(boolean z10) {
        return u() ? -1 : 0;
    }

    public boolean equals(Object obj) {
        int g10;
        if (this == obj) {
            return true;
        }
        if (obj instanceof l3) {
            l3 l3Var = (l3) obj;
            if (l3Var.t() == t() && l3Var.m() == m()) {
                d dVar = new d();
                b bVar = new b();
                d dVar2 = new d();
                b bVar2 = new b();
                for (int i10 = 0; i10 < t(); i10++) {
                    if (!r(i10, dVar).equals(l3Var.r(i10, dVar2))) {
                        return false;
                    }
                }
                for (int i11 = 0; i11 < m(); i11++) {
                    if (!k(i11, bVar, true).equals(l3Var.k(i11, bVar2, true))) {
                        return false;
                    }
                }
                int e8 = e(true);
                if (e8 == l3Var.e(true) && (g10 = g(true)) == l3Var.g(true)) {
                    while (e8 != g10) {
                        int i12 = i(e8, 0, true);
                        if (i12 != l3Var.i(e8, 0, true)) {
                            return false;
                        }
                        e8 = i12;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public abstract int f(Object obj);

    public int g(boolean z10) {
        if (u()) {
            return -1;
        }
        return t() - 1;
    }

    public final int h(int i10, b bVar, d dVar, int i11, boolean z10) {
        int i12 = j(i10, bVar).f28133c;
        if (r(i12, dVar).f28161p == i10) {
            int i13 = i(i12, i11, z10);
            if (i13 == -1) {
                return -1;
            }
            return r(i13, dVar).f28160o;
        }
        return i10 + 1;
    }

    public int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int t10 = 217 + t();
        for (int i10 = 0; i10 < t(); i10++) {
            t10 = (t10 * 31) + r(i10, dVar).hashCode();
        }
        int m7 = (t10 * 31) + m();
        for (int i11 = 0; i11 < m(); i11++) {
            m7 = (m7 * 31) + k(i11, bVar, true).hashCode();
        }
        int e8 = e(true);
        while (e8 != -1) {
            m7 = (m7 * 31) + e8;
            e8 = i(e8, 0, true);
        }
        return m7;
    }

    public int i(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == g(z10)) {
                return -1;
            }
            return i10 + 1;
        } else if (i11 != 1) {
            if (i11 == 2) {
                return i10 == g(z10) ? e(z10) : i10 + 1;
            }
            throw new IllegalStateException();
        } else {
            return i10;
        }
    }

    public final b j(int i10, b bVar) {
        return k(i10, bVar, false);
    }

    public abstract b k(int i10, b bVar, boolean z10);

    public b l(Object obj, b bVar) {
        return k(f(obj), bVar, true);
    }

    public abstract int m();

    public final Pair<Object, Long> n(d dVar, b bVar, int i10, long j10) {
        return (Pair) a5.a.e(o(dVar, bVar, i10, j10, 0L));
    }

    public final Pair<Object, Long> o(d dVar, b bVar, int i10, long j10, long j11) {
        a5.a.c(i10, 0, t());
        s(i10, dVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = dVar.e();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = dVar.f28160o;
        j(i11, bVar);
        while (i11 < dVar.f28161p && bVar.f28135e != j10) {
            int i12 = i11 + 1;
            if (j(i12, bVar).f28135e > j10) {
                break;
            }
            i11 = i12;
        }
        k(i11, bVar, true);
        long j12 = j10 - bVar.f28135e;
        long j13 = bVar.f28134d;
        if (j13 != -9223372036854775807L) {
            j12 = Math.min(j12, j13 - 1);
        }
        return Pair.create(a5.a.e(bVar.f28132b), Long.valueOf(Math.max(0L, j12)));
    }

    public int p(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == e(z10)) {
                return -1;
            }
            return i10 - 1;
        } else if (i11 != 1) {
            if (i11 == 2) {
                return i10 == e(z10) ? g(z10) : i10 - 1;
            }
            throw new IllegalStateException();
        } else {
            return i10;
        }
    }

    public abstract Object q(int i10);

    public final d r(int i10, d dVar) {
        return s(i10, dVar, 0L);
    }

    public abstract d s(int i10, d dVar, long j10);

    public abstract int t();

    public final boolean u() {
        return t() == 0;
    }

    public final boolean v(int i10, b bVar, d dVar, int i11, boolean z10) {
        return h(i10, bVar, dVar, i11, z10) == -1;
    }
}

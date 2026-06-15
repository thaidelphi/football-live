package i4;

import a5.p0;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import n3.m1;
/* compiled from: SegmentBase.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    final i f26582a;

    /* renamed from: b  reason: collision with root package name */
    final long f26583b;

    /* renamed from: c  reason: collision with root package name */
    final long f26584c;

    /* compiled from: SegmentBase.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class a extends k {

        /* renamed from: d  reason: collision with root package name */
        final long f26585d;

        /* renamed from: e  reason: collision with root package name */
        final long f26586e;

        /* renamed from: f  reason: collision with root package name */
        final List<d> f26587f;

        /* renamed from: g  reason: collision with root package name */
        private final long f26588g;

        /* renamed from: h  reason: collision with root package name */
        private final long f26589h;

        /* renamed from: i  reason: collision with root package name */
        final long f26590i;

        public a(i iVar, long j10, long j11, long j12, long j13, List<d> list, long j14, long j15, long j16) {
            super(iVar, j10, j11);
            this.f26585d = j12;
            this.f26586e = j13;
            this.f26587f = list;
            this.f26590i = j14;
            this.f26588g = j15;
            this.f26589h = j16;
        }

        public long c(long j10, long j11) {
            long g10 = g(j10);
            return g10 != -1 ? g10 : (int) (i((j11 - this.f26589h) + this.f26590i, j10) - d(j10, j11));
        }

        public long d(long j10, long j11) {
            if (g(j10) == -1) {
                long j12 = this.f26588g;
                if (j12 != -9223372036854775807L) {
                    return Math.max(e(), i((j11 - this.f26589h) - j12, j10));
                }
            }
            return e();
        }

        public long e() {
            return this.f26585d;
        }

        public long f(long j10, long j11) {
            if (this.f26587f != null) {
                return -9223372036854775807L;
            }
            long d10 = d(j10, j11) + c(j10, j11);
            return (j(d10) + h(d10, j10)) - this.f26590i;
        }

        public abstract long g(long j10);

        public final long h(long j10, long j11) {
            List<d> list = this.f26587f;
            if (list != null) {
                return (list.get((int) (j10 - this.f26585d)).f26596b * 1000000) / this.f26583b;
            }
            long g10 = g(j11);
            if (g10 != -1 && j10 == (e() + g10) - 1) {
                return j11 - j(j10);
            }
            return (this.f26586e * 1000000) / this.f26583b;
        }

        public long i(long j10, long j11) {
            long e8 = e();
            long g10 = g(j11);
            if (g10 == 0) {
                return e8;
            }
            if (this.f26587f == null) {
                long j12 = this.f26585d + (j10 / ((this.f26586e * 1000000) / this.f26583b));
                return j12 < e8 ? e8 : g10 == -1 ? j12 : Math.min(j12, (e8 + g10) - 1);
            }
            long j13 = (g10 + e8) - 1;
            long j14 = e8;
            while (j14 <= j13) {
                long j15 = ((j13 - j14) / 2) + j14;
                int i10 = (j(j15) > j10 ? 1 : (j(j15) == j10 ? 0 : -1));
                if (i10 < 0) {
                    j14 = j15 + 1;
                } else if (i10 <= 0) {
                    return j15;
                } else {
                    j13 = j15 - 1;
                }
            }
            return j14 == e8 ? j14 : j13;
        }

        public final long j(long j10) {
            long j11;
            List<d> list = this.f26587f;
            if (list != null) {
                j11 = list.get((int) (j10 - this.f26585d)).f26595a - this.f26584c;
            } else {
                j11 = (j10 - this.f26585d) * this.f26586e;
            }
            return p0.O0(j11, 1000000L, this.f26583b);
        }

        public abstract i k(j jVar, long j10);

        public boolean l() {
            return this.f26587f != null;
        }
    }

    /* compiled from: SegmentBase.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b extends a {

        /* renamed from: j  reason: collision with root package name */
        final List<i> f26591j;

        public b(i iVar, long j10, long j11, long j12, long j13, List<d> list, long j14, List<i> list2, long j15, long j16) {
            super(iVar, j10, j11, j12, j13, list, j14, j15, j16);
            this.f26591j = list2;
        }

        @Override // i4.k.a
        public long g(long j10) {
            return this.f26591j.size();
        }

        @Override // i4.k.a
        public i k(j jVar, long j10) {
            return this.f26591j.get((int) (j10 - this.f26585d));
        }

        @Override // i4.k.a
        public boolean l() {
            return true;
        }
    }

    /* compiled from: SegmentBase.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c extends a {

        /* renamed from: j  reason: collision with root package name */
        final n f26592j;

        /* renamed from: k  reason: collision with root package name */
        final n f26593k;

        /* renamed from: l  reason: collision with root package name */
        final long f26594l;

        public c(i iVar, long j10, long j11, long j12, long j13, long j14, List<d> list, long j15, n nVar, n nVar2, long j16, long j17) {
            super(iVar, j10, j11, j12, j14, list, j15, j16, j17);
            this.f26592j = nVar;
            this.f26593k = nVar2;
            this.f26594l = j13;
        }

        @Override // i4.k
        public i a(j jVar) {
            n nVar = this.f26592j;
            if (nVar != null) {
                m1 m1Var = jVar.f26569b;
                return new i(nVar.a(m1Var.f28174a, 0L, m1Var.f28181h, 0L), 0L, -1L);
            }
            return super.a(jVar);
        }

        @Override // i4.k.a
        public long g(long j10) {
            List<d> list = this.f26587f;
            if (list != null) {
                return list.size();
            }
            long j11 = this.f26594l;
            if (j11 != -1) {
                return (j11 - this.f26585d) + 1;
            }
            if (j10 != -9223372036854775807L) {
                return z5.a.a(BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f26583b)), BigInteger.valueOf(this.f26586e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // i4.k.a
        public i k(j jVar, long j10) {
            long j11;
            List<d> list = this.f26587f;
            if (list != null) {
                j11 = list.get((int) (j10 - this.f26585d)).f26595a;
            } else {
                j11 = (j10 - this.f26585d) * this.f26586e;
            }
            long j12 = j11;
            n nVar = this.f26593k;
            m1 m1Var = jVar.f26569b;
            return new i(nVar.a(m1Var.f28174a, j10, m1Var.f28181h, j12), 0L, -1L);
        }
    }

    /* compiled from: SegmentBase.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        final long f26595a;

        /* renamed from: b  reason: collision with root package name */
        final long f26596b;

        public d(long j10, long j11) {
            this.f26595a = j10;
            this.f26596b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f26595a == dVar.f26595a && this.f26596b == dVar.f26596b;
        }

        public int hashCode() {
            return (((int) this.f26595a) * 31) + ((int) this.f26596b);
        }
    }

    public k(i iVar, long j10, long j11) {
        this.f26582a = iVar;
        this.f26583b = j10;
        this.f26584c = j11;
    }

    public i a(j jVar) {
        return this.f26582a;
    }

    public long b() {
        return p0.O0(this.f26584c, 1000000L, this.f26583b);
    }

    /* compiled from: SegmentBase.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class e extends k {

        /* renamed from: d  reason: collision with root package name */
        final long f26597d;

        /* renamed from: e  reason: collision with root package name */
        final long f26598e;

        public e(i iVar, long j10, long j11, long j12, long j13) {
            super(iVar, j10, j11);
            this.f26597d = j12;
            this.f26598e = j13;
        }

        public i c() {
            long j10 = this.f26598e;
            if (j10 <= 0) {
                return null;
            }
            return new i(null, this.f26597d, j10);
        }

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}

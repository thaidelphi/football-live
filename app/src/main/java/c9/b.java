package c9;

import b9.p;
import kotlin.jvm.internal.n;
/* compiled from: Duration.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class b implements Comparable<b> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f5600b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final long f5601c = g(0);

    /* renamed from: d  reason: collision with root package name */
    private static final long f5602d = d.b(4611686018427387903L);

    /* renamed from: e  reason: collision with root package name */
    private static final long f5603e = d.b(-4611686018427387903L);

    /* renamed from: a  reason: collision with root package name */
    private final long f5604a;

    /* compiled from: Duration.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final long a() {
            return b.f5601c;
        }
    }

    public static final long A(long j10, long j11) {
        if (y(j10)) {
            if (v(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        } else if (y(j11)) {
            return j11;
        } else {
            if ((((int) j10) & 1) == (((int) j11) & 1)) {
                long t10 = t(j10) + t(j11);
                if (x(j10)) {
                    return d.e(t10);
                }
                return d.c(t10);
            } else if (w(j10)) {
                return b(j10, t(j10), t(j11));
            } else {
                return b(j10, t(j11), t(j10));
            }
        }
    }

    public static final double B(long j10, e unit) {
        n.f(unit, "unit");
        if (j10 == f5602d) {
            return Double.POSITIVE_INFINITY;
        }
        if (j10 == f5603e) {
            return Double.NEGATIVE_INFINITY;
        }
        return f.a(t(j10), s(j10), unit);
    }

    public static final long C(long j10, e unit) {
        n.f(unit, "unit");
        if (j10 == f5602d) {
            return Long.MAX_VALUE;
        }
        if (j10 == f5603e) {
            return Long.MIN_VALUE;
        }
        return f.b(t(j10), s(j10), unit);
    }

    public static String D(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f5602d) {
            return "Infinity";
        }
        if (j10 == f5603e) {
            return "-Infinity";
        }
        boolean z10 = z(j10);
        StringBuilder sb = new StringBuilder();
        if (z10) {
            sb.append('-');
        }
        long i10 = i(j10);
        long k10 = k(i10);
        int j11 = j(i10);
        int p10 = p(i10);
        int r10 = r(i10);
        int q10 = q(i10);
        int i11 = 0;
        boolean z11 = k10 != 0;
        boolean z12 = j11 != 0;
        boolean z13 = p10 != 0;
        boolean z14 = (r10 == 0 && q10 == 0) ? false : true;
        if (z11) {
            sb.append(k10);
            sb.append('d');
            i11 = 1;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i12 = i11 + 1;
            if (i11 > 0) {
                sb.append(' ');
            }
            sb.append(j11);
            sb.append('h');
            i11 = i12;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i13 = i11 + 1;
            if (i11 > 0) {
                sb.append(' ');
            }
            sb.append(p10);
            sb.append('m');
            i11 = i13;
        }
        if (z14) {
            int i14 = i11 + 1;
            if (i11 > 0) {
                sb.append(' ');
            }
            if (r10 != 0 || z11 || z12 || z13) {
                c(j10, sb, r10, q10, 9, "s", false);
            } else if (q10 >= 1000000) {
                c(j10, sb, q10 / 1000000, q10 % 1000000, 6, "ms", false);
            } else if (q10 >= 1000) {
                c(j10, sb, q10 / 1000, q10 % 1000, 3, "us", false);
            } else {
                sb.append(q10);
                sb.append("ns");
            }
            i11 = i14;
        }
        if (z10 && i11 > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb2 = sb.toString();
        n.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final long E(long j10) {
        return d.a(-t(j10), ((int) j10) & 1);
    }

    private static final long b(long j10, long j11, long j12) {
        long f10;
        long g10 = d.g(j12);
        long j13 = j11 + g10;
        if (new y8.f(-4611686018426L, 4611686018426L).d(j13)) {
            return d.d(d.f(j13) + (j12 - d.f(g10)));
        }
        f10 = y8.i.f(j13, -4611686018427387903L, 4611686018427387903L);
        return d.b(f10);
    }

    private static final void c(long j10, StringBuilder sb, int i10, int i11, int i12, String str, boolean z10) {
        String T;
        sb.append(i10);
        if (i11 != 0) {
            sb.append('.');
            T = p.T(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = T.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (T.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (!z10 && i15 < 3) {
                sb.append((CharSequence) T, 0, i15);
                n.e(sb, "this.append(value, startIndex, endIndex)");
            } else {
                sb.append((CharSequence) T, 0, ((i15 + 2) / 3) * 3);
                n.e(sb, "this.append(value, startIndex, endIndex)");
            }
        }
        sb.append(str);
    }

    public static int f(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return n.h(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return z(j10) ? -i10 : i10;
    }

    public static long g(long j10) {
        if (c.a()) {
            if (x(j10)) {
                if (!new y8.f(-4611686018426999999L, 4611686018426999999L).d(t(j10))) {
                    throw new AssertionError(t(j10) + " ns is out of nanoseconds range");
                }
            } else if (new y8.f(-4611686018427387903L, 4611686018427387903L).d(t(j10))) {
                if (new y8.f(-4611686018426L, 4611686018426L).d(t(j10))) {
                    throw new AssertionError(t(j10) + " ms is denormalized");
                }
            } else {
                throw new AssertionError(t(j10) + " ms is out of milliseconds range");
            }
        }
        return j10;
    }

    public static boolean h(long j10, Object obj) {
        return (obj instanceof b) && j10 == ((b) obj).F();
    }

    public static final long i(long j10) {
        return z(j10) ? E(j10) : j10;
    }

    public static final int j(long j10) {
        if (y(j10)) {
            return 0;
        }
        return (int) (l(j10) % 24);
    }

    public static final long k(long j10) {
        return C(j10, e.DAYS);
    }

    public static final long l(long j10) {
        return C(j10, e.HOURS);
    }

    public static final long m(long j10) {
        return (w(j10) && v(j10)) ? t(j10) : C(j10, e.MILLISECONDS);
    }

    public static final long n(long j10) {
        return C(j10, e.MINUTES);
    }

    public static final long o(long j10) {
        return C(j10, e.SECONDS);
    }

    public static final int p(long j10) {
        if (y(j10)) {
            return 0;
        }
        return (int) (n(j10) % 60);
    }

    public static final int q(long j10) {
        if (y(j10)) {
            return 0;
        }
        return (int) (w(j10) ? d.f(t(j10) % 1000) : t(j10) % 1000000000);
    }

    public static final int r(long j10) {
        if (y(j10)) {
            return 0;
        }
        return (int) (o(j10) % 60);
    }

    private static final e s(long j10) {
        return x(j10) ? e.NANOSECONDS : e.MILLISECONDS;
    }

    private static final long t(long j10) {
        return j10 >> 1;
    }

    public static int u(long j10) {
        return androidx.privacysandbox.ads.adservices.topics.d.a(j10);
    }

    public static final boolean v(long j10) {
        return !y(j10);
    }

    private static final boolean w(long j10) {
        return (((int) j10) & 1) == 1;
    }

    private static final boolean x(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static final boolean y(long j10) {
        return j10 == f5602d || j10 == f5603e;
    }

    public static final boolean z(long j10) {
        return j10 < 0;
    }

    public final /* synthetic */ long F() {
        return this.f5604a;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(b bVar) {
        return d(bVar.F());
    }

    public int d(long j10) {
        return f(this.f5604a, j10);
    }

    public boolean equals(Object obj) {
        return h(this.f5604a, obj);
    }

    public int hashCode() {
        return u(this.f5604a);
    }

    public String toString() {
        return D(this.f5604a);
    }
}

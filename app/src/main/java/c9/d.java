package c9;

import kotlin.jvm.internal.n;
/* compiled from: Duration.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class d {
    public static final /* synthetic */ long a(long j10, int i10) {
        return h(j10, i10);
    }

    public static final /* synthetic */ long b(long j10) {
        return i(j10);
    }

    public static final /* synthetic */ long c(long j10) {
        return j(j10);
    }

    public static final /* synthetic */ long d(long j10) {
        return k(j10);
    }

    public static final /* synthetic */ long e(long j10) {
        return l(j10);
    }

    public static final /* synthetic */ long f(long j10) {
        return m(j10);
    }

    public static final /* synthetic */ long g(long j10) {
        return n(j10);
    }

    public static final long h(long j10, int i10) {
        return b.g((j10 << 1) + i10);
    }

    public static final long i(long j10) {
        return b.g((j10 << 1) + 1);
    }

    public static final long j(long j10) {
        long f10;
        if (new y8.f(-4611686018426L, 4611686018426L).d(j10)) {
            return k(m(j10));
        }
        f10 = y8.i.f(j10, -4611686018427387903L, 4611686018427387903L);
        return i(f10);
    }

    public static final long k(long j10) {
        return b.g(j10 << 1);
    }

    public static final long l(long j10) {
        if (new y8.f(-4611686018426999999L, 4611686018426999999L).d(j10)) {
            return k(j10);
        }
        return i(n(j10));
    }

    public static final long m(long j10) {
        return j10 * 1000000;
    }

    public static final long n(long j10) {
        return j10 / 1000000;
    }

    public static final long o(long j10, e unit) {
        long f10;
        n.f(unit, "unit");
        e eVar = e.NANOSECONDS;
        long c10 = f.c(4611686018426999999L, eVar, unit);
        if (new y8.f(-c10, c10).d(j10)) {
            return k(f.c(j10, unit, eVar));
        }
        f10 = y8.i.f(f.b(j10, unit, e.MILLISECONDS), -4611686018427387903L, 4611686018427387903L);
        return i(f10);
    }
}

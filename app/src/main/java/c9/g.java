package c9;

import c9.b;
/* compiled from: longSaturatedMath.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class g {
    public static final long a(long j10, long j11) {
        if ((1 | (j11 - 1)) == Long.MAX_VALUE) {
            return b.E(d.o(j11, e.DAYS));
        }
        return b(j10, j11);
    }

    private static final long b(long j10, long j11) {
        long j12 = j10 - j11;
        if (((j12 ^ j10) & (~(j12 ^ j11))) < 0) {
            long j13 = 1000000;
            long j14 = (j10 % j13) - (j11 % j13);
            b.a aVar = b.f5600b;
            return b.A(d.o((j10 / j13) - (j11 / j13), e.MILLISECONDS), d.o(j14, e.NANOSECONDS));
        }
        b.a aVar2 = b.f5600b;
        return d.o(j12, e.NANOSECONDS);
    }

    public static final long c(long j10, long j11) {
        if (((j11 - 1) | 1) == Long.MAX_VALUE) {
            if (j10 == j11) {
                return b.f5600b.a();
            }
            return b.E(d.o(j11, e.DAYS));
        }
        if ((1 | (j10 - 1)) == Long.MAX_VALUE) {
            return d.o(j10, e.DAYS);
        }
        return b(j10, j11);
    }
}

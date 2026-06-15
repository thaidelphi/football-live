package w8;

import kotlin.jvm.internal.n;
/* compiled from: Random.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class d {
    public static final String a(Object from, Object until) {
        n.f(from, "from");
        n.f(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final void b(long j10, long j11) {
        if (!(j11 > j10)) {
            throw new IllegalArgumentException(a(Long.valueOf(j10), Long.valueOf(j11)).toString());
        }
    }

    public static final int c(int i10) {
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    public static final int d(int i10, int i11) {
        return (i10 >>> (32 - i11)) & ((-i11) >> 31);
    }
}

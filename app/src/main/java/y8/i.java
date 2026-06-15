package y8;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Ranges.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class i extends h {
    public static int a(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static long b(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static int c(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static long d(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static int e(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static long f(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    public static a g(int i10, int i11) {
        return a.f33320d.a(i10, i11, -1);
    }

    public static c h(int i10, int i11) {
        if (i11 <= Integer.MIN_VALUE) {
            return c.f33328e.a();
        }
        return new c(i10, i11 - 1);
    }
}

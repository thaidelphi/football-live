package c9;

import c9.j;
/* compiled from: MonoTimeSource.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f5616a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final long f5617b = System.nanoTime();

    private h() {
    }

    private final long d() {
        return System.nanoTime() - f5617b;
    }

    public final long a(long j10, long j11) {
        return g.c(j10, j11);
    }

    public final long b(long j10) {
        return g.a(d(), j10);
    }

    public long c() {
        return j.a.d(d());
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}

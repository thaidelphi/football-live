package k9;

import i9.l0;
import i9.n0;
import java.util.concurrent.TimeUnit;
/* compiled from: Tasks.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final String f27342a = l0.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b  reason: collision with root package name */
    public static final long f27343b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f27344c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f27345d;

    /* renamed from: e  reason: collision with root package name */
    public static final long f27346e;

    /* renamed from: f  reason: collision with root package name */
    public static g f27347f;

    /* renamed from: g  reason: collision with root package name */
    public static final i f27348g;

    /* renamed from: h  reason: collision with root package name */
    public static final i f27349h;

    static {
        long f10;
        int a10;
        int e8;
        int e10;
        long f11;
        f10 = n0.f("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f27343b = f10;
        a10 = y8.i.a(l0.a(), 2);
        e8 = n0.e("kotlinx.coroutines.scheduler.core.pool.size", a10, 1, 0, 8, null);
        f27344c = e8;
        e10 = n0.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f27345d = e10;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f11 = n0.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f27346e = timeUnit.toNanos(f11);
        f27347f = e.f27332a;
        f27348g = new j(0);
        f27349h = new j(1);
    }
}

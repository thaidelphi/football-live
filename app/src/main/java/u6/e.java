package u6;

import com.google.firebase.installations.i;
import java.util.concurrent.TimeUnit;
/* compiled from: RequestLimiter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class e {

    /* renamed from: d  reason: collision with root package name */
    private static final long f31600d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e  reason: collision with root package name */
    private static final long f31601e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    private final i f31602a = i.c();

    /* renamed from: b  reason: collision with root package name */
    private long f31603b;

    /* renamed from: c  reason: collision with root package name */
    private int f31604c;

    private synchronized long a(int i10) {
        if (!c(i10)) {
            return f31600d;
        }
        return (long) Math.min(Math.pow(2.0d, this.f31604c) + this.f31602a.e(), f31601e);
    }

    private static boolean c(int i10) {
        return i10 == 429 || (i10 >= 500 && i10 < 600);
    }

    private static boolean d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    private synchronized void e() {
        this.f31604c = 0;
    }

    public synchronized boolean b() {
        boolean z10;
        if (this.f31604c != 0) {
            z10 = this.f31602a.a() > this.f31603b;
        }
        return z10;
    }

    public synchronized void f(int i10) {
        if (d(i10)) {
            e();
            return;
        }
        this.f31604c++;
        this.f31603b = this.f31602a.a() + a(i10);
    }
}

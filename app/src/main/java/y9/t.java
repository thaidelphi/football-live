package y9;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
/* compiled from: Timeout.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class t {

    /* renamed from: d  reason: collision with root package name */
    public static final t f33397d = new a();

    /* renamed from: a  reason: collision with root package name */
    private boolean f33398a;

    /* renamed from: b  reason: collision with root package name */
    private long f33399b;

    /* renamed from: c  reason: collision with root package name */
    private long f33400c;

    /* compiled from: Timeout.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    final class a extends t {
        a() {
        }

        @Override // y9.t
        public t d(long j10) {
            return this;
        }

        @Override // y9.t
        public void f() throws IOException {
        }

        @Override // y9.t
        public t g(long j10, TimeUnit timeUnit) {
            return this;
        }
    }

    public t a() {
        this.f33398a = false;
        return this;
    }

    public t b() {
        this.f33400c = 0L;
        return this;
    }

    public long c() {
        if (this.f33398a) {
            return this.f33399b;
        }
        throw new IllegalStateException("No deadline");
    }

    public t d(long j10) {
        this.f33398a = true;
        this.f33399b = j10;
        return this;
    }

    public boolean e() {
        return this.f33398a;
    }

    public void f() throws IOException {
        if (!Thread.interrupted()) {
            if (this.f33398a && this.f33399b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        Thread.currentThread().interrupt();
        throw new InterruptedIOException("interrupted");
    }

    public t g(long j10, TimeUnit timeUnit) {
        if (j10 >= 0) {
            if (timeUnit != null) {
                this.f33400c = timeUnit.toNanos(j10);
                return this;
            }
            throw new IllegalArgumentException("unit == null");
        }
        throw new IllegalArgumentException("timeout < 0: " + j10);
    }

    public long h() {
        return this.f33400c;
    }
}

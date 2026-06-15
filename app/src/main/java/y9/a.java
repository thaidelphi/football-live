package y9;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
/* compiled from: AsyncTimeout.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class a extends t {

    /* renamed from: h  reason: collision with root package name */
    private static final long f33340h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f33341i;

    /* renamed from: j  reason: collision with root package name */
    static a f33342j;

    /* renamed from: e  reason: collision with root package name */
    private boolean f33343e;

    /* renamed from: f  reason: collision with root package name */
    private a f33344f;

    /* renamed from: g  reason: collision with root package name */
    private long f33345g;

    /* compiled from: AsyncTimeout.java */
    /* renamed from: y9.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    class C0395a implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f33346a;

        C0395a(r rVar) {
            this.f33346a = rVar;
        }

        @Override // y9.r
        public void A(y9.c cVar, long j10) throws IOException {
            u.b(cVar.f33354b, 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                o oVar = cVar.f33353a;
                while (true) {
                    if (j11 >= 65536) {
                        break;
                    }
                    j11 += oVar.f33388c - oVar.f33387b;
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    }
                    oVar = oVar.f33391f;
                }
                a.this.k();
                try {
                    try {
                        this.f33346a.A(cVar, j11);
                        j10 -= j11;
                        a.this.m(true);
                    } catch (IOException e8) {
                        throw a.this.l(e8);
                    }
                } catch (Throwable th) {
                    a.this.m(false);
                    throw th;
                }
            }
        }

        @Override // y9.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a.this.k();
            try {
                try {
                    this.f33346a.close();
                    a.this.m(true);
                } catch (IOException e8) {
                    throw a.this.l(e8);
                }
            } catch (Throwable th) {
                a.this.m(false);
                throw th;
            }
        }

        @Override // y9.r
        public t e() {
            return a.this;
        }

        @Override // y9.r, java.io.Flushable
        public void flush() throws IOException {
            a.this.k();
            try {
                try {
                    this.f33346a.flush();
                    a.this.m(true);
                } catch (IOException e8) {
                    throw a.this.l(e8);
                }
            } catch (Throwable th) {
                a.this.m(false);
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f33346a + ")";
        }
    }

    /* compiled from: AsyncTimeout.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    class b implements s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f33348a;

        b(s sVar) {
            this.f33348a = sVar;
        }

        @Override // y9.s
        public long H(y9.c cVar, long j10) throws IOException {
            a.this.k();
            try {
                try {
                    long H = this.f33348a.H(cVar, j10);
                    a.this.m(true);
                    return H;
                } catch (IOException e8) {
                    throw a.this.l(e8);
                }
            } catch (Throwable th) {
                a.this.m(false);
                throw th;
            }
        }

        @Override // y9.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                try {
                    this.f33348a.close();
                    a.this.m(true);
                } catch (IOException e8) {
                    throw a.this.l(e8);
                }
            } catch (Throwable th) {
                a.this.m(false);
                throw th;
            }
        }

        @Override // y9.s
        public t e() {
            return a.this;
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f33348a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AsyncTimeout.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class c extends Thread {
        c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
            r1.t();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<y9.a> r0 = y9.a.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                y9.a r1 = y9.a.i()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                y9.a r2 = y9.a.f33342j     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                y9.a.f33342j = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.t()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: y9.a.c.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f33340h = millis;
        f33341i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    static a i() throws InterruptedException {
        a aVar = f33342j.f33344f;
        if (aVar == null) {
            long nanoTime = System.nanoTime();
            a.class.wait(f33340h);
            if (f33342j.f33344f != null || System.nanoTime() - nanoTime < f33341i) {
                return null;
            }
            return f33342j;
        }
        long p10 = aVar.p(System.nanoTime());
        if (p10 > 0) {
            long j10 = p10 / 1000000;
            a.class.wait(j10, (int) (p10 - (1000000 * j10)));
            return null;
        }
        f33342j.f33344f = aVar.f33344f;
        aVar.f33344f = null;
        return aVar;
    }

    private static synchronized boolean j(a aVar) {
        synchronized (a.class) {
            a aVar2 = f33342j;
            while (aVar2 != null) {
                a aVar3 = aVar2.f33344f;
                if (aVar3 == aVar) {
                    aVar2.f33344f = aVar.f33344f;
                    aVar.f33344f = null;
                    return false;
                }
                aVar2 = aVar3;
            }
            return true;
        }
    }

    private long p(long j10) {
        return this.f33345g - j10;
    }

    private static synchronized void q(a aVar, long j10, boolean z10) {
        synchronized (a.class) {
            if (f33342j == null) {
                f33342j = new a();
                new c().start();
            }
            long nanoTime = System.nanoTime();
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 != 0 && z10) {
                aVar.f33345g = Math.min(j10, aVar.c() - nanoTime) + nanoTime;
            } else if (i10 != 0) {
                aVar.f33345g = j10 + nanoTime;
            } else if (z10) {
                aVar.f33345g = aVar.c();
            } else {
                throw new AssertionError();
            }
            long p10 = aVar.p(nanoTime);
            a aVar2 = f33342j;
            while (true) {
                a aVar3 = aVar2.f33344f;
                if (aVar3 == null || p10 < aVar3.p(nanoTime)) {
                    break;
                }
                aVar2 = aVar2.f33344f;
            }
            aVar.f33344f = aVar2.f33344f;
            aVar2.f33344f = aVar;
            if (aVar2 == f33342j) {
                a.class.notify();
            }
        }
    }

    public final void k() {
        if (!this.f33343e) {
            long h10 = h();
            boolean e8 = e();
            if (h10 != 0 || e8) {
                this.f33343e = true;
                q(this, h10, e8);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    final IOException l(IOException iOException) throws IOException {
        return !n() ? iOException : o(iOException);
    }

    final void m(boolean z10) throws IOException {
        if (n() && z10) {
            throw o(null);
        }
    }

    public final boolean n() {
        if (this.f33343e) {
            this.f33343e = false;
            return j(this);
        }
        return false;
    }

    protected IOException o(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final r r(r rVar) {
        return new C0395a(rVar);
    }

    public final s s(s sVar) {
        return new b(sVar);
    }

    protected void t() {
    }
}

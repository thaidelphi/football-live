package z4;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
/* compiled from: Loader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class j0 implements k0 {

    /* renamed from: d  reason: collision with root package name */
    public static final c f33521d = h(false, -9223372036854775807L);

    /* renamed from: e  reason: collision with root package name */
    public static final c f33522e = h(true, -9223372036854775807L);

    /* renamed from: f  reason: collision with root package name */
    public static final c f33523f = new c(2, -9223372036854775807L);

    /* renamed from: g  reason: collision with root package name */
    public static final c f33524g = new c(3, -9223372036854775807L);

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f33525a;

    /* renamed from: b  reason: collision with root package name */
    private d<? extends e> f33526b;

    /* renamed from: c  reason: collision with root package name */
    private IOException f33527c;

    /* compiled from: Loader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b<T extends e> {
        void i(T t10, long j10, long j11);

        void m(T t10, long j10, long j11, boolean z10);

        c s(T t10, long j10, long j11, IOException iOException, int i10);
    }

    /* compiled from: Loader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final int f33528a;

        /* renamed from: b  reason: collision with root package name */
        private final long f33529b;

        public boolean c() {
            int i10 = this.f33528a;
            return i10 == 0 || i10 == 1;
        }

        private c(int i10, long j10) {
            this.f33528a = i10;
            this.f33529b = j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Loader.java */
    @SuppressLint({"HandlerLeak"})
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class d<T extends e> extends Handler implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final int f33530a;

        /* renamed from: b  reason: collision with root package name */
        private final T f33531b;

        /* renamed from: c  reason: collision with root package name */
        private final long f33532c;

        /* renamed from: d  reason: collision with root package name */
        private b<T> f33533d;

        /* renamed from: e  reason: collision with root package name */
        private IOException f33534e;

        /* renamed from: f  reason: collision with root package name */
        private int f33535f;

        /* renamed from: g  reason: collision with root package name */
        private Thread f33536g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f33537h;

        /* renamed from: i  reason: collision with root package name */
        private volatile boolean f33538i;

        public d(Looper looper, T t10, b<T> bVar, int i10, long j10) {
            super(looper);
            this.f33531b = t10;
            this.f33533d = bVar;
            this.f33530a = i10;
            this.f33532c = j10;
        }

        private void b() {
            this.f33534e = null;
            j0.this.f33525a.execute((Runnable) a5.a.e(j0.this.f33526b));
        }

        private void c() {
            j0.this.f33526b = null;
        }

        private long d() {
            return Math.min((this.f33535f - 1) * 1000, 5000);
        }

        public void a(boolean z10) {
            this.f33538i = z10;
            this.f33534e = null;
            if (hasMessages(0)) {
                this.f33537h = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f33537h = true;
                    this.f33531b.b();
                    Thread thread = this.f33536g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z10) {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) a5.a.e(this.f33533d)).m(this.f33531b, elapsedRealtime, elapsedRealtime - this.f33532c, true);
                this.f33533d = null;
            }
        }

        public void e(int i10) throws IOException {
            IOException iOException = this.f33534e;
            if (iOException != null && this.f33535f > i10) {
                throw iOException;
            }
        }

        public void f(long j10) {
            a5.a.f(j0.this.f33526b == null);
            j0.this.f33526b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            long d10;
            if (this.f33538i) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                b();
            } else if (i10 != 3) {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.f33532c;
                b bVar = (b) a5.a.e(this.f33533d);
                if (this.f33537h) {
                    bVar.m(this.f33531b, elapsedRealtime, j10, false);
                    return;
                }
                int i11 = message.what;
                if (i11 == 1) {
                    try {
                        bVar.i(this.f33531b, elapsedRealtime, j10);
                    } catch (RuntimeException e8) {
                        a5.t.d("LoadTask", "Unexpected exception handling load completed", e8);
                        j0.this.f33527c = new h(e8);
                    }
                } else if (i11 != 2) {
                } else {
                    IOException iOException = (IOException) message.obj;
                    this.f33534e = iOException;
                    int i12 = this.f33535f + 1;
                    this.f33535f = i12;
                    c s10 = bVar.s(this.f33531b, elapsedRealtime, j10, iOException, i12);
                    if (s10.f33528a != 3) {
                        if (s10.f33528a != 2) {
                            if (s10.f33528a == 1) {
                                this.f33535f = 1;
                            }
                            if (s10.f33529b != -9223372036854775807L) {
                                d10 = s10.f33529b;
                            } else {
                                d10 = d();
                            }
                            f(d10);
                            return;
                        }
                        return;
                    }
                    j0.this.f33527c = this.f33534e;
                }
            } else {
                throw ((Error) message.obj);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = !this.f33537h;
                    this.f33536g = Thread.currentThread();
                }
                if (z10) {
                    a5.m0.a("load:" + this.f33531b.getClass().getSimpleName());
                    try {
                        this.f33531b.a();
                        a5.m0.c();
                    } catch (Throwable th) {
                        a5.m0.c();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f33536g = null;
                    Thread.interrupted();
                }
                if (this.f33538i) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e8) {
                if (this.f33538i) {
                    return;
                }
                obtainMessage(2, e8).sendToTarget();
            } catch (Error e10) {
                if (!this.f33538i) {
                    a5.t.d("LoadTask", "Unexpected error loading stream", e10);
                    obtainMessage(3, e10).sendToTarget();
                }
                throw e10;
            } catch (Exception e11) {
                if (this.f33538i) {
                    return;
                }
                a5.t.d("LoadTask", "Unexpected exception loading stream", e11);
                obtainMessage(2, new h(e11)).sendToTarget();
            } catch (OutOfMemoryError e12) {
                if (this.f33538i) {
                    return;
                }
                a5.t.d("LoadTask", "OutOfMemory error loading stream", e12);
                obtainMessage(2, new h(e12)).sendToTarget();
            }
        }
    }

    /* compiled from: Loader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface e {
        void a() throws IOException;

        void b();
    }

    /* compiled from: Loader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface f {
        void n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Loader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final f f33540a;

        public g(f fVar) {
            this.f33540a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f33540a.n();
        }
    }

    /* compiled from: Loader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class h extends IOException {
        public h(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public j0(String str) {
        this.f33525a = a5.p0.D0("ExoPlayer:Loader:" + str);
    }

    public static c h(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    @Override // z4.k0
    public void a() throws IOException {
        k(RecyclerView.UNDEFINED_DURATION);
    }

    public void f() {
        ((d) a5.a.h(this.f33526b)).a(false);
    }

    public void g() {
        this.f33527c = null;
    }

    public boolean i() {
        return this.f33527c != null;
    }

    public boolean j() {
        return this.f33526b != null;
    }

    public void k(int i10) throws IOException {
        IOException iOException = this.f33527c;
        if (iOException == null) {
            d<? extends e> dVar = this.f33526b;
            if (dVar != null) {
                if (i10 == Integer.MIN_VALUE) {
                    i10 = dVar.f33530a;
                }
                dVar.e(i10);
                return;
            }
            return;
        }
        throw iOException;
    }

    public void l() {
        m(null);
    }

    public void m(f fVar) {
        d<? extends e> dVar = this.f33526b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f33525a.execute(new g(fVar));
        }
        this.f33525a.shutdown();
    }

    public <T extends e> long n(T t10, b<T> bVar, int i10) {
        this.f33527c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d((Looper) a5.a.h(Looper.myLooper()), t10, bVar, i10, elapsedRealtime).f(0L);
        return elapsedRealtime;
    }
}

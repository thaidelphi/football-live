package i9;

import d9.g1;
import d9.v0;
import d9.y0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: LimitedDispatcher.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class r extends d9.j0 implements y0 {

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f26692g = AtomicIntegerFieldUpdater.newUpdater(r.class, "runningWorkers");

    /* renamed from: b  reason: collision with root package name */
    private final d9.j0 f26693b;

    /* renamed from: c  reason: collision with root package name */
    private final int f26694c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ y0 f26695d;

    /* renamed from: e  reason: collision with root package name */
    private final w<Runnable> f26696e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f26697f;
    private volatile int runningWorkers;

    /* compiled from: LimitedDispatcher.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    private final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Runnable f26698a;

        public a(Runnable runnable) {
            this.f26698a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f26698a.run();
                } catch (Throwable th) {
                    d9.l0.a(m8.h.f27797a, th);
                }
                Runnable M0 = r.this.M0();
                if (M0 == null) {
                    return;
                }
                this.f26698a = M0;
                i10++;
                if (i10 >= 16 && r.this.f26693b.I0(r.this)) {
                    r.this.f26693b.G0(r.this, this);
                    return;
                }
            }
        }
    }

    public r(d9.j0 j0Var, int i10) {
        this.f26693b = j0Var;
        this.f26694c = i10;
        y0 y0Var = j0Var instanceof y0 ? (y0) j0Var : null;
        this.f26695d = y0Var == null ? v0.a() : y0Var;
        this.f26696e = new w<>(false);
        this.f26697f = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable M0() {
        while (true) {
            Runnable d10 = this.f26696e.d();
            if (d10 != null) {
                return d10;
            }
            synchronized (this.f26697f) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f26692g;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f26696e.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    private final boolean N0() {
        synchronized (this.f26697f) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f26692g;
            if (atomicIntegerFieldUpdater.get(this) >= this.f26694c) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // d9.j0
    public void G0(m8.g gVar, Runnable runnable) {
        Runnable M0;
        this.f26696e.a(runnable);
        if (f26692g.get(this) >= this.f26694c || !N0() || (M0 = M0()) == null) {
            return;
        }
        this.f26693b.G0(this, new a(M0));
    }

    @Override // d9.j0
    public void H0(m8.g gVar, Runnable runnable) {
        Runnable M0;
        this.f26696e.a(runnable);
        if (f26692g.get(this) >= this.f26694c || !N0() || (M0 = M0()) == null) {
            return;
        }
        this.f26693b.H0(this, new a(M0));
    }

    @Override // d9.y0
    public void R(long j10, d9.n<? super i8.w> nVar) {
        this.f26695d.R(j10, nVar);
    }

    @Override // d9.y0
    public g1 X(long j10, Runnable runnable, m8.g gVar) {
        return this.f26695d.X(j10, runnable, gVar);
    }
}

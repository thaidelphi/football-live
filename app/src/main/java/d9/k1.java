package d9;
/* compiled from: EventLoop.common.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class k1 extends j0 {

    /* renamed from: b  reason: collision with root package name */
    private long f24475b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f24476c;

    /* renamed from: d  reason: collision with root package name */
    private j8.h<c1<?>> f24477d;

    public static /* synthetic */ void L0(k1 k1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        k1Var.K0(z10);
    }

    private final long M0(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void Q0(k1 k1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        k1Var.P0(z10);
    }

    public final void K0(boolean z10) {
        long M0 = this.f24475b - M0(z10);
        this.f24475b = M0;
        if (M0 > 0) {
            return;
        }
        if (s0.a()) {
            if (!(this.f24475b == 0)) {
                throw new AssertionError();
            }
        }
        if (this.f24476c) {
            shutdown();
        }
    }

    public final void N0(c1<?> c1Var) {
        j8.h<c1<?>> hVar = this.f24477d;
        if (hVar == null) {
            hVar = new j8.h<>();
            this.f24477d = hVar;
        }
        hVar.d(c1Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long O0() {
        j8.h<c1<?>> hVar = this.f24477d;
        return (hVar == null || hVar.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void P0(boolean z10) {
        this.f24475b += M0(z10);
        if (z10) {
            return;
        }
        this.f24476c = true;
    }

    public final boolean R0() {
        return this.f24475b >= M0(true);
    }

    public final boolean S0() {
        j8.h<c1<?>> hVar = this.f24477d;
        if (hVar != null) {
            return hVar.isEmpty();
        }
        return true;
    }

    public long T0() {
        return !U0() ? Long.MAX_VALUE : 0L;
    }

    public final boolean U0() {
        c1<?> m7;
        j8.h<c1<?>> hVar = this.f24477d;
        if (hVar == null || (m7 = hVar.m()) == null) {
            return false;
        }
        m7.run();
        return true;
    }

    public boolean V0() {
        return false;
    }

    public void shutdown() {
    }
}

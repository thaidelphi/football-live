package n3;

import n3.l3;
/* compiled from: BasePlayer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class e implements p2 {

    /* renamed from: a  reason: collision with root package name */
    protected final l3.d f27938a = new l3.d();

    private int a0() {
        int Q = Q();
        if (Q == 1) {
            return 0;
        }
        return Q;
    }

    private void g0(long j10) {
        long currentPosition = getCurrentPosition() + j10;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        c0(Math.max(currentPosition, 0L));
    }

    @Override // n3.p2
    public final boolean G() {
        return Z() != -1;
    }

    @Override // n3.p2
    public final boolean L() {
        l3 t10 = t();
        return !t10.u() && t10.r(N(), this.f27938a).f28153h;
    }

    @Override // n3.p2
    public final void T() {
        g0(J());
    }

    @Override // n3.p2
    public final void U() {
        g0(-W());
    }

    @Override // n3.p2
    public final boolean X() {
        l3 t10 = t();
        return !t10.u() && t10.r(N(), this.f27938a).g();
    }

    public final int Y() {
        l3 t10 = t();
        if (t10.u()) {
            return -1;
        }
        return t10.i(N(), a0(), R());
    }

    public final int Z() {
        l3 t10 = t();
        if (t10.u()) {
            return -1;
        }
        return t10.p(N(), a0(), R());
    }

    protected abstract void b0();

    public final void c0(long j10) {
        y(N(), j10);
    }

    public final long d() {
        l3 t10 = t();
        if (t10.u()) {
            return -9223372036854775807L;
        }
        return t10.r(N(), this.f27938a).f();
    }

    public final void d0() {
        e0(N());
    }

    @Override // n3.p2
    public final void e() {
        k(true);
    }

    public final void e0(int i10) {
        y(i10, -9223372036854775807L);
    }

    public final void f0() {
        int Y = Y();
        if (Y == -1) {
            return;
        }
        if (Y == N()) {
            b0();
        } else {
            e0(Y);
        }
    }

    public final void h0() {
        int Z = Z();
        if (Z == -1) {
            return;
        }
        if (Z == N()) {
            b0();
        } else {
            e0(Z);
        }
    }

    @Override // n3.p2
    public final void i() {
        if (t().u() || f()) {
            return;
        }
        boolean G = G();
        if (X() && !L()) {
            if (G) {
                h0();
            }
        } else if (G && getCurrentPosition() <= C()) {
            h0();
        } else {
            c0(0L);
        }
    }

    @Override // n3.p2
    public final boolean isPlaying() {
        return M() == 3 && A() && s() == 0;
    }

    @Override // n3.p2
    public final boolean m() {
        return Y() != -1;
    }

    @Override // n3.p2
    public final boolean p(int i10) {
        return z().c(i10);
    }

    @Override // n3.p2
    public final void pause() {
        k(false);
    }

    @Override // n3.p2
    public final boolean r() {
        l3 t10 = t();
        return !t10.u() && t10.r(N(), this.f27938a).f28154i;
    }

    @Override // n3.p2
    public final void v() {
        if (t().u() || f()) {
            return;
        }
        if (m()) {
            f0();
        } else if (X() && r()) {
            d0();
        }
    }
}

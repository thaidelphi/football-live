package n4;

import a5.p0;
import a5.t;
import a5.x;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import n3.m1;
import n3.n1;
import n3.z2;
import y5.q;
/* compiled from: TextRenderer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class o extends n3.f implements Handler.Callback {
    private int A;
    private long B;
    private long C;
    private long D;

    /* renamed from: n  reason: collision with root package name */
    private final Handler f28650n;

    /* renamed from: o  reason: collision with root package name */
    private final n f28651o;

    /* renamed from: p  reason: collision with root package name */
    private final k f28652p;

    /* renamed from: q  reason: collision with root package name */
    private final n1 f28653q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f28654r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f28655s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f28656t;

    /* renamed from: u  reason: collision with root package name */
    private int f28657u;

    /* renamed from: v  reason: collision with root package name */
    private m1 f28658v;

    /* renamed from: w  reason: collision with root package name */
    private i f28659w;

    /* renamed from: x  reason: collision with root package name */
    private l f28660x;

    /* renamed from: y  reason: collision with root package name */
    private m f28661y;

    /* renamed from: z  reason: collision with root package name */
    private m f28662z;

    public o(n nVar, Looper looper) {
        this(nVar, looper, k.f28646a);
    }

    private void P() {
        a0(new e(q.p(), S(this.D)));
    }

    private long Q(long j10) {
        int a10 = this.f28661y.a(j10);
        if (a10 == 0) {
            return this.f28661y.f30099b;
        }
        if (a10 == -1) {
            m mVar = this.f28661y;
            return mVar.c(mVar.d() - 1);
        }
        return this.f28661y.c(a10 - 1);
    }

    private long R() {
        if (this.A == -1) {
            return Long.MAX_VALUE;
        }
        a5.a.e(this.f28661y);
        if (this.A >= this.f28661y.d()) {
            return Long.MAX_VALUE;
        }
        return this.f28661y.c(this.A);
    }

    private long S(long j10) {
        a5.a.f(j10 != -9223372036854775807L);
        a5.a.f(this.C != -9223372036854775807L);
        return j10 - this.C;
    }

    private void T(j jVar) {
        t.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f28658v, jVar);
        P();
        Y();
    }

    private void U() {
        this.f28656t = true;
        this.f28659w = this.f28652p.b((m1) a5.a.e(this.f28658v));
    }

    private void V(e eVar) {
        this.f28651o.h(eVar.f28634a);
        this.f28651o.n(eVar);
    }

    private void W() {
        this.f28660x = null;
        this.A = -1;
        m mVar = this.f28661y;
        if (mVar != null) {
            mVar.p();
            this.f28661y = null;
        }
        m mVar2 = this.f28662z;
        if (mVar2 != null) {
            mVar2.p();
            this.f28662z = null;
        }
    }

    private void X() {
        W();
        ((i) a5.a.e(this.f28659w)).release();
        this.f28659w = null;
        this.f28657u = 0;
    }

    private void Y() {
        X();
        U();
    }

    private void a0(e eVar) {
        Handler handler = this.f28650n;
        if (handler != null) {
            handler.obtainMessage(0, eVar).sendToTarget();
        } else {
            V(eVar);
        }
    }

    @Override // n3.f
    protected void F() {
        this.f28658v = null;
        this.B = -9223372036854775807L;
        P();
        this.C = -9223372036854775807L;
        this.D = -9223372036854775807L;
        X();
    }

    @Override // n3.f
    protected void H(long j10, boolean z10) {
        this.D = j10;
        P();
        this.f28654r = false;
        this.f28655s = false;
        this.B = -9223372036854775807L;
        if (this.f28657u != 0) {
            Y();
            return;
        }
        W();
        ((i) a5.a.e(this.f28659w)).flush();
    }

    @Override // n3.f
    protected void L(m1[] m1VarArr, long j10, long j11) {
        this.C = j11;
        this.f28658v = m1VarArr[0];
        if (this.f28659w != null) {
            this.f28657u = 1;
        } else {
            U();
        }
    }

    public void Z(long j10) {
        a5.a.f(m());
        this.B = j10;
    }

    @Override // n3.a3
    public int a(m1 m1Var) {
        if (this.f28652p.a(m1Var)) {
            return z2.a(m1Var.E == 0 ? 4 : 2);
        } else if (x.r(m1Var.f28185l)) {
            return z2.a(1);
        } else {
            return z2.a(0);
        }
    }

    @Override // n3.y2
    public boolean c() {
        return this.f28655s;
    }

    @Override // n3.y2, n3.a3
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            V((e) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // n3.y2
    public boolean isReady() {
        return true;
    }

    @Override // n3.y2
    public void s(long j10, long j11) {
        boolean z10;
        this.D = j10;
        if (m()) {
            long j12 = this.B;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                W();
                this.f28655s = true;
            }
        }
        if (this.f28655s) {
            return;
        }
        if (this.f28662z == null) {
            ((i) a5.a.e(this.f28659w)).a(j10);
            try {
                this.f28662z = ((i) a5.a.e(this.f28659w)).b();
            } catch (j e8) {
                T(e8);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f28661y != null) {
            long R = R();
            z10 = false;
            while (R <= j10) {
                this.A++;
                R = R();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        m mVar = this.f28662z;
        if (mVar != null) {
            if (mVar.l()) {
                if (!z10 && R() == Long.MAX_VALUE) {
                    if (this.f28657u == 2) {
                        Y();
                    } else {
                        W();
                        this.f28655s = true;
                    }
                }
            } else if (mVar.f30099b <= j10) {
                m mVar2 = this.f28661y;
                if (mVar2 != null) {
                    mVar2.p();
                }
                this.A = mVar.a(j10);
                this.f28661y = mVar;
                this.f28662z = null;
                z10 = true;
            }
        }
        if (z10) {
            a5.a.e(this.f28661y);
            a0(new e(this.f28661y.b(j10), S(Q(j10))));
        }
        if (this.f28657u == 2) {
            return;
        }
        while (!this.f28654r) {
            try {
                l lVar = this.f28660x;
                if (lVar == null) {
                    lVar = ((i) a5.a.e(this.f28659w)).d();
                    if (lVar == null) {
                        return;
                    }
                    this.f28660x = lVar;
                }
                if (this.f28657u == 1) {
                    lVar.o(4);
                    ((i) a5.a.e(this.f28659w)).c(lVar);
                    this.f28660x = null;
                    this.f28657u = 2;
                    return;
                }
                int M = M(this.f28653q, lVar, 0);
                if (M == -4) {
                    if (lVar.l()) {
                        this.f28654r = true;
                        this.f28656t = false;
                    } else {
                        m1 m1Var = this.f28653q.f28250b;
                        if (m1Var == null) {
                            return;
                        }
                        lVar.f28647i = m1Var.f28189p;
                        lVar.r();
                        this.f28656t &= !lVar.n();
                    }
                    if (!this.f28656t) {
                        ((i) a5.a.e(this.f28659w)).c(lVar);
                        this.f28660x = null;
                    }
                } else if (M == -3) {
                    return;
                }
            } catch (j e10) {
                T(e10);
                return;
            }
        }
    }

    public o(n nVar, Looper looper, k kVar) {
        super(3);
        this.f28651o = (n) a5.a.e(nVar);
        this.f28650n = looper == null ? null : p0.u(looper, this);
        this.f28652p = kVar;
        this.f28653q = new n1();
        this.B = -9223372036854775807L;
        this.C = -9223372036854775807L;
        this.D = -9223372036854775807L;
    }
}

package d9;
/* compiled from: AbstractCoroutine.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class a<T> extends g2 implements m8.d<T>, o0 {

    /* renamed from: c  reason: collision with root package name */
    private final m8.g f24404c;

    public a(m8.g gVar, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            g0((z1) gVar.get(z1.f24533t0));
        }
        this.f24404c = gVar.plus(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // d9.g2
    public String O() {
        return t0.a(this) + " was cancelled";
    }

    protected void P0(Object obj) {
        B(obj);
    }

    protected void Q0(Throwable th, boolean z10) {
    }

    protected void R0(T t10) {
    }

    public final <R> void S0(q0 q0Var, R r10, t8.p<? super R, ? super m8.d<? super T>, ? extends Object> pVar) {
        q0Var.b(pVar, r10, this);
    }

    @Override // d9.g2
    public final void f0(Throwable th) {
        l0.a(this.f24404c, th);
    }

    @Override // m8.d
    public final m8.g getContext() {
        return this.f24404c;
    }

    @Override // d9.o0
    public m8.g getCoroutineContext() {
        return this.f24404c;
    }

    @Override // d9.g2, d9.z1
    public boolean isActive() {
        return super.isActive();
    }

    @Override // d9.g2
    public String q0() {
        String b10 = i0.b(this.f24404c);
        if (b10 == null) {
            return super.q0();
        }
        return '\"' + b10 + "\":" + super.q0();
    }

    @Override // m8.d
    public final void resumeWith(Object obj) {
        Object m02 = m0(f0.d(obj, null, 1, null));
        if (m02 == h2.f24457b) {
            return;
        }
        P0(m02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d9.g2
    protected final void v0(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            Q0(b0Var.f24413a, b0Var.a());
            return;
        }
        R0(obj);
    }
}

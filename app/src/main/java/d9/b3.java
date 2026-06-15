package d9;
/* compiled from: CoroutineContext.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class b3<T> extends i9.g0<T> {

    /* renamed from: e  reason: collision with root package name */
    private final ThreadLocal<i8.n<m8.g, Object>> f24415e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b3(m8.g r3, m8.d<? super T> r4) {
        /*
            r2 = this;
            d9.c3 r0 = d9.c3.f24421a
            m8.g$b r1 = r3.get(r0)
            if (r1 != 0) goto Ld
            m8.g r0 = r3.plus(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f24415e = r0
            m8.g r4 = r4.getContext()
            m8.e$b r0 = m8.e.f27794v0
            m8.g$b r4 = r4.get(r0)
            boolean r4 = r4 instanceof d9.j0
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = i9.o0.c(r3, r4)
            i9.o0.a(r3, r4)
            r2.U0(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.b3.<init>(m8.g, m8.d):void");
    }

    @Override // i9.g0, d9.a
    protected void P0(Object obj) {
        if (this.threadLocalIsSet) {
            i8.n<m8.g, Object> nVar = this.f24415e.get();
            if (nVar != null) {
                i9.o0.a(nVar.a(), nVar.b());
            }
            this.f24415e.remove();
        }
        Object a10 = f0.a(obj, this.f26657d);
        m8.d<T> dVar = this.f26657d;
        m8.g context = dVar.getContext();
        Object c10 = i9.o0.c(context, null);
        b3<?> g10 = c10 != i9.o0.f26682a ? i0.g(dVar, context, c10) : null;
        try {
            this.f26657d.resumeWith(a10);
            i8.w wVar = i8.w.f26638a;
        } finally {
            if (g10 == null || g10.T0()) {
                i9.o0.a(context, c10);
            }
        }
    }

    public final boolean T0() {
        boolean z10 = this.threadLocalIsSet && this.f24415e.get() == null;
        this.f24415e.remove();
        return !z10;
    }

    public final void U0(m8.g gVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f24415e.set(i8.s.a(gVar, obj));
    }
}

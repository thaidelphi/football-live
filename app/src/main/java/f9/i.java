package f9;

import i9.h0;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: BufferedChannel.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class i<E> extends h0<i<E>> {

    /* renamed from: e  reason: collision with root package name */
    private final b<E> f25557e;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicReferenceArray f25558f;

    public i(long j10, i<E> iVar, b<E> bVar, int i10) {
        super(j10, iVar, i10);
        this.f25557e = bVar;
        this.f25558f = new AtomicReferenceArray(c.f25530b * 2);
    }

    private final void z(int i10, Object obj) {
        this.f25558f.lazySet(i10 * 2, obj);
    }

    public final void A(int i10, Object obj) {
        this.f25558f.set((i10 * 2) + 1, obj);
    }

    public final void B(int i10, E e8) {
        z(i10, e8);
    }

    @Override // i9.h0
    public int n() {
        return c.f25530b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
        s(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
        if (r0 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
        r4 = u().f25506b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
        if (r4 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
        i9.c0.b(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    @Override // i9.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(int r4, java.lang.Throwable r5, m8.g r6) {
        /*
            r3 = this;
            int r5 = f9.c.f25530b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.v(r4)
        Le:
            java.lang.Object r1 = r3.w(r4)
            boolean r2 = r1 instanceof d9.d3
            if (r2 != 0) goto L74
            boolean r2 = r1 instanceof f9.v
            if (r2 == 0) goto L1b
            goto L74
        L1b:
            i9.k0 r2 = f9.c.j()
            if (r1 == r2) goto L63
            i9.k0 r2 = f9.c.i()
            if (r1 != r2) goto L28
            goto L63
        L28:
            i9.k0 r2 = f9.c.p()
            if (r1 == r2) goto Le
            i9.k0 r2 = f9.c.q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            i9.k0 r4 = f9.c.f()
            if (r1 == r4) goto L62
            i9.k0 r4 = f9.c.f25532d
            if (r1 != r4) goto L40
            goto L62
        L40:
            i9.k0 r4 = f9.c.z()
            if (r1 != r4) goto L47
            return
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            return
        L63:
            r3.s(r4)
            if (r0 == 0) goto L73
            f9.b r4 = r3.u()
            t8.l<E, i8.w> r4 = r4.f25506b
            if (r4 == 0) goto L73
            i9.c0.b(r4, r5, r6)
        L73:
            return
        L74:
            if (r0 == 0) goto L7b
            i9.k0 r2 = f9.c.j()
            goto L7f
        L7b:
            i9.k0 r2 = f9.c.i()
        L7f:
            boolean r1 = r3.r(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.s(r4)
            r1 = r0 ^ 1
            r3.x(r4, r1)
            if (r0 == 0) goto L9a
            f9.b r4 = r3.u()
            t8.l<E, i8.w> r4 = r4.f25506b
            if (r4 == 0) goto L9a
            i9.c0.b(r4, r5, r6)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.i.o(int, java.lang.Throwable, m8.g):void");
    }

    public final boolean r(int i10, Object obj, Object obj2) {
        return this.f25558f.compareAndSet((i10 * 2) + 1, obj, obj2);
    }

    public final void s(int i10) {
        z(i10, null);
    }

    public final Object t(int i10, Object obj) {
        return this.f25558f.getAndSet((i10 * 2) + 1, obj);
    }

    public final b<E> u() {
        b<E> bVar = this.f25557e;
        kotlin.jvm.internal.n.c(bVar);
        return bVar;
    }

    public final E v(int i10) {
        return (E) this.f25558f.get(i10 * 2);
    }

    public final Object w(int i10) {
        return this.f25558f.get((i10 * 2) + 1);
    }

    public final void x(int i10, boolean z10) {
        if (z10) {
            u().S0((this.f26659c * c.f25530b) + i10);
        }
        p();
    }

    public final E y(int i10) {
        E v10 = v(i10);
        s(i10);
        return v10;
    }
}

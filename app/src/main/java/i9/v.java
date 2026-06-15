package i9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: LockFreeLinkedList.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f26708a = AtomicReferenceFieldUpdater.newUpdater(v.class, Object.class, "_next");

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f26709b = AtomicReferenceFieldUpdater.newUpdater(v.class, Object.class, "_prev");

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f26710c = AtomicReferenceFieldUpdater.newUpdater(v.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* compiled from: LockFreeLinkedList.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static abstract class a extends i9.b<v> {

        /* renamed from: b  reason: collision with root package name */
        public final v f26711b;

        /* renamed from: c  reason: collision with root package name */
        public v f26712c;

        public a(v vVar) {
            this.f26711b = vVar;
        }

        @Override // i9.b
        /* renamed from: e */
        public void b(v vVar, Object obj) {
            boolean z10 = obj == null;
            v vVar2 = z10 ? this.f26711b : this.f26712c;
            if (vVar2 != null && androidx.concurrent.futures.b.a(v.f26708a, vVar, this, vVar2) && z10) {
                v vVar3 = this.f26711b;
                v vVar4 = this.f26712c;
                kotlin.jvm.internal.n.c(vVar4);
                vVar3.i(vVar4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (androidx.concurrent.futures.b.a(r4, r3, r2, ((i9.e0) r5).f26654a) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final i9.v g(i9.d0 r9) {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = i9.v.f26709b
            java.lang.Object r0 = r0.get(r8)
            i9.v r0 = (i9.v) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = i9.v.f26708a
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L20
            if (r0 != r2) goto L16
            return r2
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = i9.v.f26709b
            boolean r0 = androidx.concurrent.futures.b.a(r1, r8, r0, r2)
            if (r0 != 0) goto L1f
            goto L0
        L1f:
            return r2
        L20:
            boolean r6 = r8.m()
            if (r6 == 0) goto L27
            return r1
        L27:
            if (r5 != r9) goto L2a
            return r2
        L2a:
            boolean r6 = r5 instanceof i9.d0
            if (r6 == 0) goto L34
            i9.d0 r5 = (i9.d0) r5
            r5.a(r2)
            goto L0
        L34:
            boolean r6 = r5 instanceof i9.e0
            if (r6 == 0) goto L50
            if (r3 == 0) goto L47
            i9.e0 r5 = (i9.e0) r5
            i9.v r5 = r5.f26654a
            boolean r2 = androidx.concurrent.futures.b.a(r4, r3, r2, r5)
            if (r2 != 0) goto L45
            goto L0
        L45:
            r2 = r3
            goto La
        L47:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = i9.v.f26709b
            java.lang.Object r2 = r4.get(r2)
            i9.v r2 = (i9.v) r2
            goto Lb
        L50:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.n.d(r5, r3)
            r3 = r5
            i9.v r3 = (i9.v) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.v.g(i9.d0):i9.v");
    }

    private final v h(v vVar) {
        while (vVar.m()) {
            vVar = (v) f26709b.get(vVar);
        }
        return vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(v vVar) {
        v vVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26709b;
        do {
            vVar2 = (v) atomicReferenceFieldUpdater.get(vVar);
            if (j() != vVar) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f26709b, vVar, vVar2, this));
        if (m()) {
            vVar.g(null);
        }
    }

    private final e0 p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26710c;
        e0 e0Var = (e0) atomicReferenceFieldUpdater.get(this);
        if (e0Var == null) {
            e0 e0Var2 = new e0(this);
            atomicReferenceFieldUpdater.lazySet(this, e0Var2);
            return e0Var2;
        }
        return e0Var;
    }

    public final boolean f(v vVar) {
        f26709b.lazySet(vVar, this);
        f26708a.lazySet(vVar, this);
        while (j() == this) {
            if (androidx.concurrent.futures.b.a(f26708a, this, this, vVar)) {
                vVar.i(this);
                return true;
            }
        }
        return false;
    }

    public final Object j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26708a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof d0)) {
                return obj;
            }
            ((d0) obj).a(this);
        }
    }

    public final v k() {
        return u.b(j());
    }

    public final v l() {
        v g10 = g(null);
        return g10 == null ? h((v) f26709b.get(this)) : g10;
    }

    public boolean m() {
        return j() instanceof e0;
    }

    public boolean n() {
        return o() == null;
    }

    public final v o() {
        Object j10;
        v vVar;
        do {
            j10 = j();
            if (j10 instanceof e0) {
                return ((e0) j10).f26654a;
            }
            if (j10 == this) {
                return (v) j10;
            }
            kotlin.jvm.internal.n.d(j10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            vVar = (v) j10;
        } while (!androidx.concurrent.futures.b.a(f26708a, this, j10, vVar.p()));
        vVar.g(null);
        return null;
    }

    public final int q(v vVar, v vVar2, a aVar) {
        f26709b.lazySet(vVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26708a;
        atomicReferenceFieldUpdater.lazySet(vVar, vVar2);
        aVar.f26712c = vVar2;
        if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, vVar2, aVar)) {
            return aVar.a(this) == null ? 1 : 2;
        }
        return 0;
    }

    public String toString() {
        return new kotlin.jvm.internal.u(this) { // from class: i9.v.b
            @Override // z8.i
            public Object get() {
                return d9.t0.a(this.receiver);
            }
        } + '@' + d9.t0.b(this);
    }
}

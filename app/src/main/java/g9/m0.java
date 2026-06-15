package g9;

import d9.s0;
import i8.o;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StateFlow.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class m0 extends h9.d<k0<?>> {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f25951a = AtomicReferenceFieldUpdater.newUpdater(m0.class, Object.class, "_state");
    private volatile Object _state;

    @Override // h9.d
    /* renamed from: d */
    public boolean a(k0<?> k0Var) {
        i9.k0 k0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25951a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        k0Var2 = l0.f25945a;
        atomicReferenceFieldUpdater.set(this, k0Var2);
        return true;
    }

    public final Object e(m8.d<? super i8.w> dVar) {
        m8.d b10;
        i9.k0 k0Var;
        Object c10;
        Object c11;
        i9.k0 k0Var2;
        b10 = n8.c.b(dVar);
        d9.o oVar = new d9.o(b10, 1);
        oVar.C();
        if (!s0.a() || (!(f25951a.get(this) instanceof d9.o))) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25951a;
            k0Var = l0.f25945a;
            if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, k0Var, oVar)) {
                if (s0.a()) {
                    Object obj = f25951a.get(this);
                    k0Var2 = l0.f25946b;
                    if (!(obj == k0Var2)) {
                        throw new AssertionError();
                    }
                }
                o.a aVar = i8.o.f26626b;
                oVar.resumeWith(i8.o.b(i8.w.f26638a));
            }
            Object z10 = oVar.z();
            c10 = n8.d.c();
            if (z10 == c10) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            c11 = n8.d.c();
            return z10 == c11 ? z10 : i8.w.f26638a;
        }
        throw new AssertionError();
    }

    @Override // h9.d
    /* renamed from: f */
    public m8.d<i8.w>[] b(k0<?> k0Var) {
        f25951a.set(this, null);
        return h9.c.f26272a;
    }

    public final void g() {
        i9.k0 k0Var;
        i9.k0 k0Var2;
        i9.k0 k0Var3;
        i9.k0 k0Var4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25951a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return;
            }
            k0Var = l0.f25946b;
            if (obj == k0Var) {
                return;
            }
            k0Var2 = l0.f25945a;
            if (obj == k0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f25951a;
                k0Var3 = l0.f25946b;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, obj, k0Var3)) {
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f25951a;
                k0Var4 = l0.f25945a;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater3, this, obj, k0Var4)) {
                    o.a aVar = i8.o.f26626b;
                    ((d9.o) obj).resumeWith(i8.o.b(i8.w.f26638a));
                    return;
                }
            }
        }
    }

    public final boolean h() {
        i9.k0 k0Var;
        i9.k0 k0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25951a;
        k0Var = l0.f25945a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, k0Var);
        kotlin.jvm.internal.n.c(andSet);
        if (!s0.a() || (!(andSet instanceof d9.o))) {
            k0Var2 = l0.f25946b;
            return andSet == k0Var2;
        }
        throw new AssertionError();
    }
}

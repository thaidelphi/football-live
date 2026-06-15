package m9;

import d9.d3;
import d9.j0;
import d9.n;
import d9.o;
import d9.s0;
import d9.t0;
import i8.w;
import i9.h0;
import i9.k0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.h;
import l9.j;
import m8.g;
import t8.l;
import t8.q;
/* compiled from: Mutex.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class b extends d implements m9.a {

    /* renamed from: i  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f27801i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "owner");

    /* renamed from: h  reason: collision with root package name */
    private final q<j<?>, Object, Object, l<Throwable, w>> f27802h;
    private volatile Object owner;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mutex.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public final class a implements n<w>, d3 {

        /* renamed from: a  reason: collision with root package name */
        public final o<w> f27803a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f27804b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Mutex.kt */
        /* renamed from: m9.b$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class C0317a extends kotlin.jvm.internal.o implements l<Throwable, w> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f27806a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f27807b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0317a(b bVar, a aVar) {
                super(1);
                this.f27806a = bVar;
                this.f27807b = aVar;
            }

            @Override // t8.l
            public /* bridge */ /* synthetic */ w invoke(Throwable th) {
                invoke2(th);
                return w.f26638a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f27806a.a(this.f27807b.f27804b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Mutex.kt */
        /* renamed from: m9.b$a$b  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class C0318b extends kotlin.jvm.internal.o implements l<Throwable, w> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f27808a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f27809b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0318b(b bVar, a aVar) {
                super(1);
                this.f27808a = bVar;
                this.f27809b = aVar;
            }

            @Override // t8.l
            public /* bridge */ /* synthetic */ w invoke(Throwable th) {
                invoke2(th);
                return w.f26638a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                k0 k0Var;
                b bVar = this.f27808a;
                a aVar = this.f27809b;
                if (s0.a()) {
                    Object obj = b.f27801i.get(bVar);
                    k0Var = c.f27813a;
                    if (!(obj == k0Var || obj == aVar.f27804b)) {
                        throw new AssertionError();
                    }
                }
                b.f27801i.set(this.f27808a, this.f27809b.f27804b);
                this.f27808a.a(this.f27809b.f27804b);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(o<? super w> oVar, Object obj) {
            this.f27803a = oVar;
            this.f27804b = obj;
        }

        @Override // d9.n
        /* renamed from: a */
        public void d(w wVar, l<? super Throwable, w> lVar) {
            k0 k0Var;
            b bVar = b.this;
            if (s0.a()) {
                Object obj = b.f27801i.get(bVar);
                k0Var = c.f27813a;
                if (!(obj == k0Var)) {
                    throw new AssertionError();
                }
            }
            b.f27801i.set(b.this, this.f27804b);
            this.f27803a.d(wVar, new C0317a(b.this, this));
        }

        @Override // d9.n
        public boolean b() {
            return this.f27803a.b();
        }

        @Override // d9.n
        /* renamed from: c */
        public void g(j0 j0Var, w wVar) {
            this.f27803a.g(j0Var, wVar);
        }

        @Override // d9.d3
        public void e(h0<?> h0Var, int i10) {
            this.f27803a.e(h0Var, i10);
        }

        @Override // d9.n
        public Object f(Throwable th) {
            return this.f27803a.f(th);
        }

        @Override // m8.d
        public g getContext() {
            return this.f27803a.getContext();
        }

        @Override // d9.n
        public boolean h(Throwable th) {
            return this.f27803a.h(th);
        }

        @Override // d9.n
        /* renamed from: i */
        public Object p(w wVar, Object obj, l<? super Throwable, w> lVar) {
            k0 k0Var;
            k0 k0Var2;
            b bVar = b.this;
            if (s0.a()) {
                Object obj2 = b.f27801i.get(bVar);
                k0Var2 = c.f27813a;
                if (!(obj2 == k0Var2)) {
                    throw new AssertionError();
                }
            }
            Object p10 = this.f27803a.p(wVar, obj, new C0318b(b.this, this));
            if (p10 != null) {
                b bVar2 = b.this;
                if (s0.a()) {
                    Object obj3 = b.f27801i.get(bVar2);
                    k0Var = c.f27813a;
                    if (!(obj3 == k0Var)) {
                        throw new AssertionError();
                    }
                }
                b.f27801i.set(b.this, this.f27804b);
            }
            return p10;
        }

        @Override // d9.n
        public boolean isActive() {
            return this.f27803a.isActive();
        }

        @Override // d9.n
        public void r(l<? super Throwable, w> lVar) {
            this.f27803a.r(lVar);
        }

        @Override // m8.d
        public void resumeWith(Object obj) {
            this.f27803a.resumeWith(obj);
        }

        @Override // d9.n
        public void u(Object obj) {
            this.f27803a.u(obj);
        }
    }

    /* compiled from: Mutex.kt */
    /* renamed from: m9.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class C0319b extends kotlin.jvm.internal.o implements q<j<?>, Object, Object, l<? super Throwable, ? extends w>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Mutex.kt */
        /* renamed from: m9.b$b$a */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class a extends kotlin.jvm.internal.o implements l<Throwable, w> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f27811a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object f27812b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, Object obj) {
                super(1);
                this.f27811a = bVar;
                this.f27812b = obj;
            }

            @Override // t8.l
            public /* bridge */ /* synthetic */ w invoke(Throwable th) {
                invoke2(th);
                return w.f26638a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f27811a.a(this.f27812b);
            }
        }

        C0319b() {
            super(3);
        }

        @Override // t8.q
        /* renamed from: a */
        public final l<Throwable, w> invoke(j<?> jVar, Object obj, Object obj2) {
            return new a(b.this, obj);
        }
    }

    public b(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner = z10 ? null : c.f27813a;
        this.f27802h = new C0319b();
    }

    static /* synthetic */ Object o(b bVar, Object obj, m8.d<? super w> dVar) {
        Object c10;
        if (bVar.q(obj)) {
            return w.f26638a;
        }
        Object p10 = bVar.p(obj, dVar);
        c10 = n8.d.c();
        return p10 == c10 ? p10 : w.f26638a;
    }

    private final Object p(Object obj, m8.d<? super w> dVar) {
        m8.d b10;
        Object c10;
        Object c11;
        b10 = n8.c.b(dVar);
        o b11 = d9.q.b(b10);
        try {
            c(new a(b11, obj));
            Object z10 = b11.z();
            c10 = n8.d.c();
            if (z10 == c10) {
                h.c(dVar);
            }
            c11 = n8.d.c();
            return z10 == c11 ? z10 : w.f26638a;
        } catch (Throwable th) {
            b11.K();
            throw th;
        }
    }

    private final int r(Object obj) {
        k0 k0Var;
        do {
            if (i()) {
                if (s0.a()) {
                    Object obj2 = f27801i.get(this);
                    k0Var = c.f27813a;
                    if (!(obj2 == k0Var)) {
                        throw new AssertionError();
                    }
                }
                f27801i.set(this, obj);
                return 0;
            } else if (obj == null) {
                break;
            } else if (m(obj)) {
                return 2;
            }
        } while (!n());
        return 1;
    }

    @Override // m9.a
    public void a(Object obj) {
        k0 k0Var;
        k0 k0Var2;
        while (n()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27801i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            k0Var = c.f27813a;
            if (obj2 != k0Var) {
                if (obj2 == obj || obj == null) {
                    k0Var2 = c.f27813a;
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj2, k0Var2)) {
                        h();
                        return;
                    }
                } else {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    @Override // m9.a
    public Object b(Object obj, m8.d<? super w> dVar) {
        return o(this, obj, dVar);
    }

    public boolean m(Object obj) {
        k0 k0Var;
        while (n()) {
            Object obj2 = f27801i.get(this);
            k0Var = c.f27813a;
            if (obj2 != k0Var) {
                return obj2 == obj;
            }
        }
        return false;
    }

    public boolean n() {
        return g() == 0;
    }

    public boolean q(Object obj) {
        int r10 = r(obj);
        if (r10 != 0) {
            if (r10 != 1) {
                if (r10 != 2) {
                    throw new IllegalStateException("unexpected".toString());
                }
                throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
            }
            return false;
        }
        return true;
    }

    public String toString() {
        return "Mutex@" + t0.b(this) + "[isLocked=" + n() + ",owner=" + f27801i.get(this) + ']';
    }
}

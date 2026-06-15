package y1;

import t2.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LockedResource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class u<Z> implements v<Z>, a.f {

    /* renamed from: e  reason: collision with root package name */
    private static final androidx.core.util.f<u<?>> f33019e = t2.a.d(20, new a());

    /* renamed from: a  reason: collision with root package name */
    private final t2.c f33020a = t2.c.a();

    /* renamed from: b  reason: collision with root package name */
    private v<Z> f33021b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f33022c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f33023d;

    /* compiled from: LockedResource.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements a.d<u<?>> {
        a() {
        }

        @Override // t2.a.d
        /* renamed from: b */
        public u<?> a() {
            return new u<>();
        }
    }

    u() {
    }

    private void c(v<Z> vVar) {
        this.f33023d = false;
        this.f33022c = true;
        this.f33021b = vVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <Z> u<Z> e(v<Z> vVar) {
        u<Z> uVar = (u) s2.j.d(f33019e.b());
        uVar.c(vVar);
        return uVar;
    }

    private void f() {
        this.f33021b = null;
        f33019e.a(this);
    }

    @Override // y1.v
    public synchronized void a() {
        this.f33020a.c();
        this.f33023d = true;
        if (!this.f33022c) {
            this.f33021b.a();
            f();
        }
    }

    @Override // y1.v
    public Class<Z> b() {
        return this.f33021b.b();
    }

    @Override // t2.a.f
    public t2.c d() {
        return this.f33020a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void g() {
        this.f33020a.c();
        if (this.f33022c) {
            this.f33022c = false;
            if (this.f33023d) {
                a();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @Override // y1.v
    public Z get() {
        return this.f33021b.get();
    }

    @Override // y1.v
    public int getSize() {
        return this.f33021b.getSize();
    }
}

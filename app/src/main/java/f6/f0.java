package f6;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: RestrictedComponentContainer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class f0 implements e {

    /* renamed from: a  reason: collision with root package name */
    private final Set<e0<?>> f25433a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<e0<?>> f25434b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<e0<?>> f25435c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<e0<?>> f25436d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<e0<?>> f25437e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<Class<?>> f25438f;

    /* renamed from: g  reason: collision with root package name */
    private final e f25439g;

    /* compiled from: RestrictedComponentContainer.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private static class a implements n6.c {

        /* renamed from: a  reason: collision with root package name */
        private final Set<Class<?>> f25440a;

        /* renamed from: b  reason: collision with root package name */
        private final n6.c f25441b;

        public a(Set<Class<?>> set, n6.c cVar) {
            this.f25440a = set;
            this.f25441b = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(c<?> cVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (r rVar : cVar.g()) {
            if (rVar.d()) {
                if (rVar.f()) {
                    hashSet4.add(rVar.b());
                } else {
                    hashSet.add(rVar.b());
                }
            } else if (rVar.c()) {
                hashSet3.add(rVar.b());
            } else if (rVar.f()) {
                hashSet5.add(rVar.b());
            } else {
                hashSet2.add(rVar.b());
            }
        }
        if (!cVar.k().isEmpty()) {
            hashSet.add(e0.b(n6.c.class));
        }
        this.f25433a = Collections.unmodifiableSet(hashSet);
        this.f25434b = Collections.unmodifiableSet(hashSet2);
        this.f25435c = Collections.unmodifiableSet(hashSet3);
        this.f25436d = Collections.unmodifiableSet(hashSet4);
        this.f25437e = Collections.unmodifiableSet(hashSet5);
        this.f25438f = cVar.k();
        this.f25439g = eVar;
    }

    @Override // f6.e
    public <T> T a(Class<T> cls) {
        if (this.f25433a.contains(e0.b(cls))) {
            T t10 = (T) this.f25439g.a(cls);
            return !cls.equals(n6.c.class) ? t10 : (T) new a(this.f25438f, (n6.c) t10);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // f6.e
    public /* synthetic */ Set b(Class cls) {
        return d.e(this, cls);
    }

    @Override // f6.e
    public <T> q6.b<Set<T>> c(e0<T> e0Var) {
        if (this.f25437e.contains(e0Var)) {
            return this.f25439g.c(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", e0Var));
    }

    @Override // f6.e
    public <T> T d(e0<T> e0Var) {
        if (this.f25433a.contains(e0Var)) {
            return (T) this.f25439g.d(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", e0Var));
    }

    @Override // f6.e
    public <T> q6.b<T> e(Class<T> cls) {
        return f(e0.b(cls));
    }

    @Override // f6.e
    public <T> q6.b<T> f(e0<T> e0Var) {
        if (this.f25434b.contains(e0Var)) {
            return this.f25439g.f(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<%s>.", e0Var));
    }

    @Override // f6.e
    public <T> Set<T> g(e0<T> e0Var) {
        if (this.f25436d.contains(e0Var)) {
            return this.f25439g.g(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Set<%s>.", e0Var));
    }
}

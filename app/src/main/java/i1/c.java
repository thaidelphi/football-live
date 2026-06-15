package i1;

import java.util.ArrayList;
import java.util.List;
import l1.p;
/* compiled from: ConstraintController.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class c<T> implements h1.a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f26425a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private T f26426b;

    /* renamed from: c  reason: collision with root package name */
    private j1.d<T> f26427c;

    /* renamed from: d  reason: collision with root package name */
    private a f26428d;

    /* compiled from: ConstraintController.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a(List<String> list);

        void b(List<String> list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(j1.d<T> dVar) {
        this.f26427c = dVar;
    }

    private void h(a aVar, T t10) {
        if (this.f26425a.isEmpty() || aVar == null) {
            return;
        }
        if (t10 != null && !c(t10)) {
            aVar.a(this.f26425a);
        } else {
            aVar.b(this.f26425a);
        }
    }

    @Override // h1.a
    public void a(T t10) {
        this.f26426b = t10;
        h(this.f26428d, t10);
    }

    abstract boolean b(p pVar);

    abstract boolean c(T t10);

    public boolean d(String str) {
        T t10 = this.f26426b;
        return t10 != null && c(t10) && this.f26425a.contains(str);
    }

    public void e(Iterable<p> iterable) {
        this.f26425a.clear();
        for (p pVar : iterable) {
            if (b(pVar)) {
                this.f26425a.add(pVar.f27432a);
            }
        }
        if (this.f26425a.isEmpty()) {
            this.f26427c.c(this);
        } else {
            this.f26427c.a(this);
        }
        h(this.f26428d, this.f26426b);
    }

    public void f() {
        if (this.f26425a.isEmpty()) {
            return;
        }
        this.f26425a.clear();
        this.f26427c.c(this);
    }

    public void g(a aVar) {
        if (this.f26428d != aVar) {
            this.f26428d = aVar;
            h(aVar, this.f26426b);
        }
    }
}

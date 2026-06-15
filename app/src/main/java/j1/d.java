package j1;

import android.content.Context;
import androidx.work.p;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ConstraintTracker.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class d<T> {

    /* renamed from: f  reason: collision with root package name */
    private static final String f26768f = p.f("ConstraintTracker");

    /* renamed from: a  reason: collision with root package name */
    protected final n1.a f26769a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f26770b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f26771c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Set<h1.a<T>> f26772d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    T f26773e;

    /* compiled from: ConstraintTracker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f26774a;

        a(List list) {
            this.f26774a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (h1.a aVar : this.f26774a) {
                aVar.a(d.this.f26773e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, n1.a aVar) {
        this.f26770b = context.getApplicationContext();
        this.f26769a = aVar;
    }

    public void a(h1.a<T> aVar) {
        synchronized (this.f26771c) {
            if (this.f26772d.add(aVar)) {
                if (this.f26772d.size() == 1) {
                    this.f26773e = b();
                    p.c().a(f26768f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f26773e), new Throwable[0]);
                    e();
                }
                aVar.a(this.f26773e);
            }
        }
    }

    public abstract T b();

    public void c(h1.a<T> aVar) {
        synchronized (this.f26771c) {
            if (this.f26772d.remove(aVar) && this.f26772d.isEmpty()) {
                f();
            }
        }
    }

    public void d(T t10) {
        synchronized (this.f26771c) {
            T t11 = this.f26773e;
            if (t11 != t10 && (t11 == null || !t11.equals(t10))) {
                this.f26773e = t10;
                this.f26769a.a().execute(new a(new ArrayList(this.f26772d)));
            }
        }
    }

    public abstract void e();

    public abstract void f();
}

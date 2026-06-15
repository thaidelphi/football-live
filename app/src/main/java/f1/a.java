package f1;

import androidx.work.p;
import androidx.work.x;
import java.util.HashMap;
import java.util.Map;
/* compiled from: DelayedWorkTracker.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a {

    /* renamed from: d  reason: collision with root package name */
    static final String f25272d = p.f("DelayedWorkTracker");

    /* renamed from: a  reason: collision with root package name */
    final b f25273a;

    /* renamed from: b  reason: collision with root package name */
    private final x f25274b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Runnable> f25275c = new HashMap();

    /* compiled from: DelayedWorkTracker.java */
    /* renamed from: f1.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class RunnableC0274a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l1.p f25276a;

        RunnableC0274a(l1.p pVar) {
            this.f25276a = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.c().a(a.f25272d, String.format("Scheduling work %s", this.f25276a.f27432a), new Throwable[0]);
            a.this.f25273a.a(this.f25276a);
        }
    }

    public a(b bVar, x xVar) {
        this.f25273a = bVar;
        this.f25274b = xVar;
    }

    public void a(l1.p pVar) {
        Runnable remove = this.f25275c.remove(pVar.f27432a);
        if (remove != null) {
            this.f25274b.a(remove);
        }
        RunnableC0274a runnableC0274a = new RunnableC0274a(pVar);
        this.f25275c.put(pVar.f27432a, runnableC0274a);
        long currentTimeMillis = System.currentTimeMillis();
        this.f25274b.b(pVar.a() - currentTimeMillis, runnableC0274a);
    }

    public void b(String str) {
        Runnable remove = this.f25275c.remove(str);
        if (remove != null) {
            this.f25274b.a(remove);
        }
    }
}

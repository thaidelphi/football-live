package f1;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.p;
import androidx.work.z;
import e1.e;
import e1.i;
import h1.c;
import h1.d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m1.f;
/* compiled from: GreedyScheduler.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b implements e, c, e1.b {

    /* renamed from: i  reason: collision with root package name */
    private static final String f25278i = p.f("GreedyScheduler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f25279a;

    /* renamed from: b  reason: collision with root package name */
    private final i f25280b;

    /* renamed from: c  reason: collision with root package name */
    private final d f25281c;

    /* renamed from: e  reason: collision with root package name */
    private a f25283e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f25284f;

    /* renamed from: h  reason: collision with root package name */
    Boolean f25286h;

    /* renamed from: d  reason: collision with root package name */
    private final Set<l1.p> f25282d = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private final Object f25285g = new Object();

    public b(Context context, androidx.work.b bVar, n1.a aVar, i iVar) {
        this.f25279a = context;
        this.f25280b = iVar;
        this.f25281c = new d(context, aVar, this);
        this.f25283e = new a(this, bVar.k());
    }

    private void g() {
        this.f25286h = Boolean.valueOf(f.b(this.f25279a, this.f25280b.q()));
    }

    private void h() {
        if (this.f25284f) {
            return;
        }
        this.f25280b.u().c(this);
        this.f25284f = true;
    }

    private void i(String str) {
        synchronized (this.f25285g) {
            Iterator<l1.p> it = this.f25282d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                l1.p next = it.next();
                if (next.f27432a.equals(str)) {
                    p.c().a(f25278i, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f25282d.remove(next);
                    this.f25281c.d(this.f25282d);
                    break;
                }
            }
        }
    }

    @Override // e1.e
    public void a(l1.p... pVarArr) {
        if (this.f25286h == null) {
            g();
        }
        if (!this.f25286h.booleanValue()) {
            p.c().d(f25278i, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (l1.p pVar : pVarArr) {
            long a10 = pVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.f27433b == z.a.ENQUEUED) {
                if (currentTimeMillis < a10) {
                    a aVar = this.f25283e;
                    if (aVar != null) {
                        aVar.a(pVar);
                    }
                } else if (pVar.b()) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 23 && pVar.f27441j.h()) {
                        p.c().a(f25278i, String.format("Ignoring WorkSpec %s, Requires device idle.", pVar), new Throwable[0]);
                    } else if (i10 >= 24 && pVar.f27441j.e()) {
                        p.c().a(f25278i, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", pVar), new Throwable[0]);
                    } else {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f27432a);
                    }
                } else {
                    p.c().a(f25278i, String.format("Starting work for %s", pVar.f27432a), new Throwable[0]);
                    this.f25280b.C(pVar.f27432a);
                }
            }
        }
        synchronized (this.f25285g) {
            if (!hashSet.isEmpty()) {
                p.c().a(f25278i, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f25282d.addAll(hashSet);
                this.f25281c.d(this.f25282d);
            }
        }
    }

    @Override // h1.c
    public void b(List<String> list) {
        for (String str : list) {
            p.c().a(f25278i, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f25280b.F(str);
        }
    }

    @Override // e1.e
    public void c(String str) {
        if (this.f25286h == null) {
            g();
        }
        if (!this.f25286h.booleanValue()) {
            p.c().d(f25278i, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        h();
        p.c().a(f25278i, String.format("Cancelling work ID %s", str), new Throwable[0]);
        a aVar = this.f25283e;
        if (aVar != null) {
            aVar.b(str);
        }
        this.f25280b.F(str);
    }

    @Override // e1.e
    public boolean d() {
        return false;
    }

    @Override // e1.b
    public void e(String str, boolean z10) {
        i(str);
    }

    @Override // h1.c
    public void f(List<String> list) {
        for (String str : list) {
            p.c().a(f25278i, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f25280b.C(str);
        }
    }
}

package h1;

import android.content.Context;
import androidx.work.p;
import i1.c;
import i1.e;
import i1.f;
import i1.g;
import i1.h;
import java.util.ArrayList;
import java.util.List;
/* compiled from: WorkConstraintsTracker.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d implements c.a {

    /* renamed from: d  reason: collision with root package name */
    private static final String f26180d = p.f("WorkConstraintsTracker");

    /* renamed from: a  reason: collision with root package name */
    private final c f26181a;

    /* renamed from: b  reason: collision with root package name */
    private final i1.c<?>[] f26182b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f26183c;

    public d(Context context, n1.a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f26181a = cVar;
        this.f26182b = new i1.c[]{new i1.a(applicationContext, aVar), new i1.b(applicationContext, aVar), new h(applicationContext, aVar), new i1.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
        this.f26183c = new Object();
    }

    @Override // i1.c.a
    public void a(List<String> list) {
        synchronized (this.f26183c) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (c(str)) {
                    p.c().a(f26180d, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            c cVar = this.f26181a;
            if (cVar != null) {
                cVar.f(arrayList);
            }
        }
    }

    @Override // i1.c.a
    public void b(List<String> list) {
        synchronized (this.f26183c) {
            c cVar = this.f26181a;
            if (cVar != null) {
                cVar.b(list);
            }
        }
    }

    public boolean c(String str) {
        i1.c<?>[] cVarArr;
        synchronized (this.f26183c) {
            for (i1.c<?> cVar : this.f26182b) {
                if (cVar.d(str)) {
                    p.c().a(f26180d, String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void d(Iterable<l1.p> iterable) {
        synchronized (this.f26183c) {
            for (i1.c<?> cVar : this.f26182b) {
                cVar.g(null);
            }
            for (i1.c<?> cVar2 : this.f26182b) {
                cVar2.e(iterable);
            }
            for (i1.c<?> cVar3 : this.f26182b) {
                cVar3.g(this);
            }
        }
    }

    public void e() {
        synchronized (this.f26183c) {
            for (i1.c<?> cVar : this.f26182b) {
                cVar.f();
            }
        }
    }
}

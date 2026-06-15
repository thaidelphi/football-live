package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: MenuHostHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f2903a;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList<m> f2904b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final Map<m, a> f2905c = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MenuHostHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final androidx.lifecycle.i f2906a;

        /* renamed from: b  reason: collision with root package name */
        private androidx.lifecycle.m f2907b;

        a(androidx.lifecycle.i iVar, androidx.lifecycle.m mVar) {
            this.f2906a = iVar;
            this.f2907b = mVar;
            iVar.a(mVar);
        }

        void a() {
            this.f2906a.d(this.f2907b);
            this.f2907b = null;
        }
    }

    public k(Runnable runnable) {
        this.f2903a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(m mVar, androidx.lifecycle.p pVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            l(mVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(i.b bVar, m mVar, androidx.lifecycle.p pVar, i.a aVar) {
        if (aVar == i.a.d(bVar)) {
            c(mVar);
        } else if (aVar == i.a.ON_DESTROY) {
            l(mVar);
        } else if (aVar == i.a.b(bVar)) {
            this.f2904b.remove(mVar);
            this.f2903a.run();
        }
    }

    public void c(m mVar) {
        this.f2904b.add(mVar);
        this.f2903a.run();
    }

    public void d(final m mVar, androidx.lifecycle.p pVar) {
        c(mVar);
        androidx.lifecycle.i lifecycle = pVar.getLifecycle();
        a remove = this.f2905c.remove(mVar);
        if (remove != null) {
            remove.a();
        }
        this.f2905c.put(mVar, new a(lifecycle, new androidx.lifecycle.m() { // from class: androidx.core.view.i
            @Override // androidx.lifecycle.m
            public final void onStateChanged(androidx.lifecycle.p pVar2, i.a aVar) {
                k.this.f(mVar, pVar2, aVar);
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    public void e(final m mVar, androidx.lifecycle.p pVar, final i.b bVar) {
        androidx.lifecycle.i lifecycle = pVar.getLifecycle();
        a remove = this.f2905c.remove(mVar);
        if (remove != null) {
            remove.a();
        }
        this.f2905c.put(mVar, new a(lifecycle, new androidx.lifecycle.m() { // from class: androidx.core.view.j
            @Override // androidx.lifecycle.m
            public final void onStateChanged(androidx.lifecycle.p pVar2, i.a aVar) {
                k.this.g(bVar, mVar, pVar2, aVar);
            }
        }));
    }

    public void h(Menu menu, MenuInflater menuInflater) {
        Iterator<m> it = this.f2904b.iterator();
        while (it.hasNext()) {
            it.next().d(menu, menuInflater);
        }
    }

    public void i(Menu menu) {
        Iterator<m> it = this.f2904b.iterator();
        while (it.hasNext()) {
            it.next().a(menu);
        }
    }

    public boolean j(MenuItem menuItem) {
        Iterator<m> it = this.f2904b.iterator();
        while (it.hasNext()) {
            if (it.next().c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void k(Menu menu) {
        Iterator<m> it = this.f2904b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public void l(m mVar) {
        this.f2904b.remove(mVar);
        a remove = this.f2905c.remove(mVar);
        if (remove != null) {
            remove.a();
        }
        this.f2903a.run();
    }
}

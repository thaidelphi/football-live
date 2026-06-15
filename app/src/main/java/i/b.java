package i;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
/* compiled from: ActionMode.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private Object f26358a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f26359b;

    /* compiled from: ActionMode.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        boolean a(b bVar, MenuItem menuItem);

        void b(b bVar);

        boolean c(b bVar, Menu menu);

        boolean d(b bVar, Menu menu);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.f26358a;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.f26359b;
    }

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i10);

    public abstract void o(CharSequence charSequence);

    public void p(Object obj) {
        this.f26358a = obj;
    }

    public abstract void q(int i10);

    public abstract void r(CharSequence charSequence);

    public void s(boolean z10) {
        this.f26359b = z10;
    }
}

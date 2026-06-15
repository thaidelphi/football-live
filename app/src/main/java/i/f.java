package i;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import i.b;
import java.util.ArrayList;
/* compiled from: SupportActionModeWrapper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    final Context f26372a;

    /* renamed from: b  reason: collision with root package name */
    final b f26373b;

    /* compiled from: SupportActionModeWrapper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final ActionMode.Callback f26374a;

        /* renamed from: b  reason: collision with root package name */
        final Context f26375b;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<f> f26376c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        final androidx.collection.h<Menu, Menu> f26377d = new androidx.collection.h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f26375b = context;
            this.f26374a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f26377d.get(menu);
            if (menu2 == null) {
                j.d dVar = new j.d(this.f26375b, (w.a) menu);
                this.f26377d.put(menu, dVar);
                return dVar;
            }
            return menu2;
        }

        @Override // i.b.a
        public boolean a(b bVar, MenuItem menuItem) {
            return this.f26374a.onActionItemClicked(e(bVar), new j.c(this.f26375b, (w.b) menuItem));
        }

        @Override // i.b.a
        public void b(b bVar) {
            this.f26374a.onDestroyActionMode(e(bVar));
        }

        @Override // i.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f26374a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // i.b.a
        public boolean d(b bVar, Menu menu) {
            return this.f26374a.onCreateActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f26376c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = this.f26376c.get(i10);
                if (fVar != null && fVar.f26373b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f26375b, bVar);
            this.f26376c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f26372a = context;
        this.f26373b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f26373b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f26373b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new j.d(this.f26372a, (w.a) this.f26373b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f26373b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f26373b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f26373b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f26373b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f26373b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f26373b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f26373b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f26373b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f26373b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f26373b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f26373b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f26373b.s(z10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f26373b.n(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f26373b.q(i10);
    }
}

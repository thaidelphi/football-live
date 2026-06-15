package i;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import i.b;
import java.lang.ref.WeakReference;
/* compiled from: StandaloneActionMode.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e extends b implements e.a {

    /* renamed from: c  reason: collision with root package name */
    private Context f26365c;

    /* renamed from: d  reason: collision with root package name */
    private ActionBarContextView f26366d;

    /* renamed from: e  reason: collision with root package name */
    private b.a f26367e;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<View> f26368f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f26369g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f26370h;

    /* renamed from: i  reason: collision with root package name */
    private androidx.appcompat.view.menu.e f26371i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f26365c = context;
        this.f26366d = actionBarContextView;
        this.f26367e = aVar;
        androidx.appcompat.view.menu.e S = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).S(1);
        this.f26371i = S;
        S.R(this);
        this.f26370h = z10;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f26367e.a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f26366d.l();
    }

    @Override // i.b
    public void c() {
        if (this.f26369g) {
            return;
        }
        this.f26369g = true;
        this.f26367e.b(this);
    }

    @Override // i.b
    public View d() {
        WeakReference<View> weakReference = this.f26368f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // i.b
    public Menu e() {
        return this.f26371i;
    }

    @Override // i.b
    public MenuInflater f() {
        return new g(this.f26366d.getContext());
    }

    @Override // i.b
    public CharSequence g() {
        return this.f26366d.getSubtitle();
    }

    @Override // i.b
    public CharSequence i() {
        return this.f26366d.getTitle();
    }

    @Override // i.b
    public void k() {
        this.f26367e.c(this, this.f26371i);
    }

    @Override // i.b
    public boolean l() {
        return this.f26366d.j();
    }

    @Override // i.b
    public void m(View view) {
        this.f26366d.setCustomView(view);
        this.f26368f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // i.b
    public void n(int i10) {
        o(this.f26365c.getString(i10));
    }

    @Override // i.b
    public void o(CharSequence charSequence) {
        this.f26366d.setSubtitle(charSequence);
    }

    @Override // i.b
    public void q(int i10) {
        r(this.f26365c.getString(i10));
    }

    @Override // i.b
    public void r(CharSequence charSequence) {
        this.f26366d.setTitle(charSequence);
    }

    @Override // i.b
    public void s(boolean z10) {
        super.s(z10);
        this.f26366d.setTitleOptional(z10);
    }
}

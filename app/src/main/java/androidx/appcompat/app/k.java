package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.a;
import androidx.appcompat.app.f;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.g0;
import androidx.core.view.a0;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ToolbarActionBar.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class k extends androidx.appcompat.app.a {

    /* renamed from: a  reason: collision with root package name */
    final g0 f982a;

    /* renamed from: b  reason: collision with root package name */
    final Window.Callback f983b;

    /* renamed from: c  reason: collision with root package name */
    final f.i f984c;

    /* renamed from: d  reason: collision with root package name */
    boolean f985d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f986e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f987f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<a.b> f988g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f989h = new a();

    /* renamed from: i  reason: collision with root package name */
    private final Toolbar.f f990i;

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.A();
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements Toolbar.f {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return k.this.f983b.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ToolbarActionBar.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class c implements j.a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f993a;

        c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (this.f993a) {
                return;
            }
            this.f993a = true;
            k.this.f982a.q();
            k.this.f983b.onPanelClosed(108, eVar);
            this.f993a = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            k.this.f983b.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ToolbarActionBar.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class d implements e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (k.this.f982a.e()) {
                k.this.f983b.onPanelClosed(108, eVar);
            } else if (k.this.f983b.onPreparePanel(0, null, eVar)) {
                k.this.f983b.onMenuOpened(108, eVar);
            }
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class e implements f.i {
        e() {
        }

        @Override // androidx.appcompat.app.f.i
        public boolean a(int i10) {
            if (i10 == 0) {
                k kVar = k.this;
                if (kVar.f985d) {
                    return false;
                }
                kVar.f982a.f();
                k.this.f985d = true;
                return false;
            }
            return false;
        }

        @Override // androidx.appcompat.app.f.i
        public View onCreatePanelView(int i10) {
            if (i10 == 0) {
                return new View(k.this.f982a.getContext());
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f990i = bVar;
        androidx.core.util.i.f(toolbar);
        b1 b1Var = new b1(toolbar, false);
        this.f982a = b1Var;
        this.f983b = (Window.Callback) androidx.core.util.i.f(callback);
        b1Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        b1Var.setWindowTitle(charSequence);
        this.f984c = new e();
    }

    private Menu z() {
        if (!this.f986e) {
            this.f982a.t(new c(), new d());
            this.f986e = true;
        }
        return this.f982a.j();
    }

    void A() {
        Menu z10 = z();
        androidx.appcompat.view.menu.e eVar = z10 instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) z10 : null;
        if (eVar != null) {
            eVar.d0();
        }
        try {
            z10.clear();
            if (!this.f983b.onCreatePanelMenu(0, z10) || !this.f983b.onPreparePanel(0, null, z10)) {
                z10.clear();
            }
        } finally {
            if (eVar != null) {
                eVar.c0();
            }
        }
    }

    public void B(int i10, int i11) {
        this.f982a.i((i10 & i11) | ((~i11) & this.f982a.v()));
    }

    @Override // androidx.appcompat.app.a
    public boolean f() {
        return this.f982a.b();
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        if (this.f982a.h()) {
            this.f982a.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.a
    public void h(boolean z10) {
        if (z10 == this.f987f) {
            return;
        }
        this.f987f = z10;
        int size = this.f988g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f988g.get(i10).a(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public int i() {
        return this.f982a.v();
    }

    @Override // androidx.appcompat.app.a
    public Context j() {
        return this.f982a.getContext();
    }

    @Override // androidx.appcompat.app.a
    public void k() {
        this.f982a.u(8);
    }

    @Override // androidx.appcompat.app.a
    public boolean l() {
        this.f982a.m().removeCallbacks(this.f989h);
        a0.i0(this.f982a.m(), this.f989h);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        super.m(configuration);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.app.a
    public void n() {
        this.f982a.m().removeCallbacks(this.f989h);
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i10, KeyEvent keyEvent) {
        Menu z10 = z();
        if (z10 != null) {
            z10.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            return z10.performShortcut(i10, keyEvent, 0);
        }
        return false;
    }

    @Override // androidx.appcompat.app.a
    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean q() {
        return this.f982a.c();
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z10) {
        B(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void u(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void v(CharSequence charSequence) {
        this.f982a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void w(CharSequence charSequence) {
        this.f982a.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void x() {
        this.f982a.u(0);
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
/* compiled from: ToolbarWidgetWrapper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b1 implements g0 {

    /* renamed from: a  reason: collision with root package name */
    Toolbar f1471a;

    /* renamed from: b  reason: collision with root package name */
    private int f1472b;

    /* renamed from: c  reason: collision with root package name */
    private View f1473c;

    /* renamed from: d  reason: collision with root package name */
    private View f1474d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1475e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f1476f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f1477g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1478h;

    /* renamed from: i  reason: collision with root package name */
    CharSequence f1479i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f1480j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f1481k;

    /* renamed from: l  reason: collision with root package name */
    Window.Callback f1482l;

    /* renamed from: m  reason: collision with root package name */
    boolean f1483m;

    /* renamed from: n  reason: collision with root package name */
    private c f1484n;

    /* renamed from: o  reason: collision with root package name */
    private int f1485o;

    /* renamed from: p  reason: collision with root package name */
    private int f1486p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f1487q;

    /* compiled from: ToolbarWidgetWrapper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final j.a f1488a;

        a() {
            this.f1488a = new j.a(b1.this.f1471a.getContext(), 0, 16908332, 0, 0, b1.this.f1479i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b1 b1Var = b1.this;
            Window.Callback callback = b1Var.f1482l;
            if (callback == null || !b1Var.f1483m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1488a);
        }
    }

    /* compiled from: ToolbarWidgetWrapper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b extends androidx.core.view.i0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1490a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1491b;

        b(int i10) {
            this.f1491b = i10;
        }

        @Override // androidx.core.view.i0, androidx.core.view.h0
        public void a(View view) {
            this.f1490a = true;
        }

        @Override // androidx.core.view.h0
        public void b(View view) {
            if (this.f1490a) {
                return;
            }
            b1.this.f1471a.setVisibility(this.f1491b);
        }

        @Override // androidx.core.view.i0, androidx.core.view.h0
        public void c(View view) {
            b1.this.f1471a.setVisibility(0);
        }
    }

    public b1(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, e.h.f24662a, e.e.f24603n);
    }

    private void F(CharSequence charSequence) {
        this.f1479i = charSequence;
        if ((this.f1472b & 8) != 0) {
            this.f1471a.setTitle(charSequence);
            if (this.f1478h) {
                androidx.core.view.a0.t0(this.f1471a.getRootView(), charSequence);
            }
        }
    }

    private void G() {
        if ((this.f1472b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1481k)) {
                this.f1471a.setNavigationContentDescription(this.f1486p);
            } else {
                this.f1471a.setNavigationContentDescription(this.f1481k);
            }
        }
    }

    private void H() {
        if ((this.f1472b & 4) != 0) {
            Toolbar toolbar = this.f1471a;
            Drawable drawable = this.f1477g;
            if (drawable == null) {
                drawable = this.f1487q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1471a.setNavigationIcon((Drawable) null);
    }

    private void I() {
        Drawable drawable;
        int i10 = this.f1472b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) != 0) {
            drawable = this.f1476f;
            if (drawable == null) {
                drawable = this.f1475e;
            }
        } else {
            drawable = this.f1475e;
        }
        this.f1471a.setLogo(drawable);
    }

    private int x() {
        if (this.f1471a.getNavigationIcon() != null) {
            this.f1487q = this.f1471a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    public void A(Drawable drawable) {
        this.f1476f = drawable;
        I();
    }

    public void B(int i10) {
        C(i10 == 0 ? null : getContext().getString(i10));
    }

    public void C(CharSequence charSequence) {
        this.f1481k = charSequence;
        G();
    }

    public void D(Drawable drawable) {
        this.f1477g = drawable;
        H();
    }

    public void E(CharSequence charSequence) {
        this.f1480j = charSequence;
        if ((this.f1472b & 8) != 0) {
            this.f1471a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.g0
    public boolean a() {
        return this.f1471a.d();
    }

    @Override // androidx.appcompat.widget.g0
    public boolean b() {
        return this.f1471a.w();
    }

    @Override // androidx.appcompat.widget.g0
    public boolean c() {
        return this.f1471a.Q();
    }

    @Override // androidx.appcompat.widget.g0
    public void collapseActionView() {
        this.f1471a.e();
    }

    @Override // androidx.appcompat.widget.g0
    public void d(Menu menu, j.a aVar) {
        if (this.f1484n == null) {
            c cVar = new c(this.f1471a.getContext());
            this.f1484n = cVar;
            cVar.p(e.f.f24622g);
        }
        this.f1484n.d(aVar);
        this.f1471a.K((androidx.appcompat.view.menu.e) menu, this.f1484n);
    }

    @Override // androidx.appcompat.widget.g0
    public boolean e() {
        return this.f1471a.B();
    }

    @Override // androidx.appcompat.widget.g0
    public void f() {
        this.f1483m = true;
    }

    @Override // androidx.appcompat.widget.g0
    public boolean g() {
        return this.f1471a.A();
    }

    @Override // androidx.appcompat.widget.g0
    public Context getContext() {
        return this.f1471a.getContext();
    }

    @Override // androidx.appcompat.widget.g0
    public CharSequence getTitle() {
        return this.f1471a.getTitle();
    }

    @Override // androidx.appcompat.widget.g0
    public boolean h() {
        return this.f1471a.v();
    }

    @Override // androidx.appcompat.widget.g0
    public void i(int i10) {
        View view;
        int i11 = this.f1472b ^ i10;
        this.f1472b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    G();
                }
                H();
            }
            if ((i11 & 3) != 0) {
                I();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f1471a.setTitle(this.f1479i);
                    this.f1471a.setSubtitle(this.f1480j);
                } else {
                    this.f1471a.setTitle((CharSequence) null);
                    this.f1471a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f1474d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f1471a.addView(view);
            } else {
                this.f1471a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.g0
    public Menu j() {
        return this.f1471a.getMenu();
    }

    @Override // androidx.appcompat.widget.g0
    public int k() {
        return this.f1485o;
    }

    @Override // androidx.appcompat.widget.g0
    public androidx.core.view.g0 l(int i10, long j10) {
        return androidx.core.view.a0.e(this.f1471a).b(i10 == 0 ? 1.0f : 0.0f).f(j10).h(new b(i10));
    }

    @Override // androidx.appcompat.widget.g0
    public ViewGroup m() {
        return this.f1471a;
    }

    @Override // androidx.appcompat.widget.g0
    public void n(boolean z10) {
    }

    @Override // androidx.appcompat.widget.g0
    public void o() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.g0
    public void p(boolean z10) {
        this.f1471a.setCollapsible(z10);
    }

    @Override // androidx.appcompat.widget.g0
    public void q() {
        this.f1471a.f();
    }

    @Override // androidx.appcompat.widget.g0
    public void r(s0 s0Var) {
        View view = this.f1473c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1471a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1473c);
            }
        }
        this.f1473c = s0Var;
        if (s0Var == null || this.f1485o != 2) {
            return;
        }
        this.f1471a.addView(s0Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.f1473c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.f878a = 8388691;
        s0Var.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.g0
    public void s(int i10) {
        A(i10 != 0 ? f.a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.g0
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? f.a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.g0
    public void setTitle(CharSequence charSequence) {
        this.f1478h = true;
        F(charSequence);
    }

    @Override // androidx.appcompat.widget.g0
    public void setWindowCallback(Window.Callback callback) {
        this.f1482l = callback;
    }

    @Override // androidx.appcompat.widget.g0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1478h) {
            return;
        }
        F(charSequence);
    }

    @Override // androidx.appcompat.widget.g0
    public void t(j.a aVar, e.a aVar2) {
        this.f1471a.L(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.g0
    public void u(int i10) {
        this.f1471a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.g0
    public int v() {
        return this.f1472b;
    }

    @Override // androidx.appcompat.widget.g0
    public void w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void y(View view) {
        View view2 = this.f1474d;
        if (view2 != null && (this.f1472b & 16) != 0) {
            this.f1471a.removeView(view2);
        }
        this.f1474d = view;
        if (view == null || (this.f1472b & 16) == 0) {
            return;
        }
        this.f1471a.addView(view);
    }

    public void z(int i10) {
        if (i10 == this.f1486p) {
            return;
        }
        this.f1486p = i10;
        if (TextUtils.isEmpty(this.f1471a.getNavigationContentDescription())) {
            B(this.f1486p);
        }
    }

    public b1(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f1485o = 0;
        this.f1486p = 0;
        this.f1471a = toolbar;
        this.f1479i = toolbar.getTitle();
        this.f1480j = toolbar.getSubtitle();
        this.f1478h = this.f1479i != null;
        this.f1477g = toolbar.getNavigationIcon();
        z0 v10 = z0.v(toolbar.getContext(), null, e.j.f24678a, e.a.f24542c, 0);
        this.f1487q = v10.g(e.j.f24733l);
        if (z10) {
            CharSequence p10 = v10.p(e.j.f24763r);
            if (!TextUtils.isEmpty(p10)) {
                setTitle(p10);
            }
            CharSequence p11 = v10.p(e.j.f24753p);
            if (!TextUtils.isEmpty(p11)) {
                E(p11);
            }
            Drawable g10 = v10.g(e.j.f24743n);
            if (g10 != null) {
                A(g10);
            }
            Drawable g11 = v10.g(e.j.f24738m);
            if (g11 != null) {
                setIcon(g11);
            }
            if (this.f1477g == null && (drawable = this.f1487q) != null) {
                D(drawable);
            }
            i(v10.k(e.j.f24713h, 0));
            int n10 = v10.n(e.j.f24708g, 0);
            if (n10 != 0) {
                y(LayoutInflater.from(this.f1471a.getContext()).inflate(n10, (ViewGroup) this.f1471a, false));
                i(this.f1472b | 16);
            }
            int m7 = v10.m(e.j.f24723j, 0);
            if (m7 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1471a.getLayoutParams();
                layoutParams.height = m7;
                this.f1471a.setLayoutParams(layoutParams);
            }
            int e8 = v10.e(e.j.f24703f, -1);
            int e10 = v10.e(e.j.f24698e, -1);
            if (e8 >= 0 || e10 >= 0) {
                this.f1471a.J(Math.max(e8, 0), Math.max(e10, 0));
            }
            int n11 = v10.n(e.j.f24768s, 0);
            if (n11 != 0) {
                Toolbar toolbar2 = this.f1471a;
                toolbar2.N(toolbar2.getContext(), n11);
            }
            int n12 = v10.n(e.j.f24758q, 0);
            if (n12 != 0) {
                Toolbar toolbar3 = this.f1471a;
                toolbar3.M(toolbar3.getContext(), n12);
            }
            int n13 = v10.n(e.j.f24748o, 0);
            if (n13 != 0) {
                this.f1471a.setPopupTheme(n13);
            }
        } else {
            this.f1472b = x();
        }
        v10.w();
        z(i10);
        this.f1481k = this.f1471a.getNavigationContentDescription();
        this.f1471a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.g0
    public void setIcon(Drawable drawable) {
        this.f1475e = drawable;
        I();
    }
}

package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.s0;
import androidx.core.view.a0;
import androidx.core.view.h0;
import androidx.core.view.i0;
import androidx.core.view.j0;
import i.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: WindowDecorActionBar.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class n extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator E = new AccelerateInterpolator();
    private static final Interpolator F = new DecelerateInterpolator();
    boolean A;

    /* renamed from: a  reason: collision with root package name */
    Context f1011a;

    /* renamed from: b  reason: collision with root package name */
    private Context f1012b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f1013c;

    /* renamed from: d  reason: collision with root package name */
    ActionBarOverlayLayout f1014d;

    /* renamed from: e  reason: collision with root package name */
    ActionBarContainer f1015e;

    /* renamed from: f  reason: collision with root package name */
    g0 f1016f;

    /* renamed from: g  reason: collision with root package name */
    ActionBarContextView f1017g;

    /* renamed from: h  reason: collision with root package name */
    View f1018h;

    /* renamed from: i  reason: collision with root package name */
    s0 f1019i;

    /* renamed from: l  reason: collision with root package name */
    private boolean f1022l;

    /* renamed from: m  reason: collision with root package name */
    d f1023m;

    /* renamed from: n  reason: collision with root package name */
    i.b f1024n;

    /* renamed from: o  reason: collision with root package name */
    b.a f1025o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f1026p;

    /* renamed from: r  reason: collision with root package name */
    private boolean f1028r;

    /* renamed from: u  reason: collision with root package name */
    boolean f1031u;

    /* renamed from: v  reason: collision with root package name */
    boolean f1032v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1033w;

    /* renamed from: y  reason: collision with root package name */
    i.h f1035y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f1036z;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<Object> f1020j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private int f1021k = -1;

    /* renamed from: q  reason: collision with root package name */
    private ArrayList<a.b> f1027q = new ArrayList<>();

    /* renamed from: s  reason: collision with root package name */
    private int f1029s = 0;

    /* renamed from: t  reason: collision with root package name */
    boolean f1030t = true;

    /* renamed from: x  reason: collision with root package name */
    private boolean f1034x = true;
    final h0 B = new a();
    final h0 C = new b();
    final j0 D = new c();

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends i0 {
        a() {
        }

        @Override // androidx.core.view.h0
        public void b(View view) {
            View view2;
            n nVar = n.this;
            if (nVar.f1030t && (view2 = nVar.f1018h) != null) {
                view2.setTranslationY(0.0f);
                n.this.f1015e.setTranslationY(0.0f);
            }
            n.this.f1015e.setVisibility(8);
            n.this.f1015e.setTransitioning(false);
            n nVar2 = n.this;
            nVar2.f1035y = null;
            nVar2.B();
            ActionBarOverlayLayout actionBarOverlayLayout = n.this.f1014d;
            if (actionBarOverlayLayout != null) {
                a0.n0(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b extends i0 {
        b() {
        }

        @Override // androidx.core.view.h0
        public void b(View view) {
            n nVar = n.this;
            nVar.f1035y = null;
            nVar.f1015e.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class c implements j0 {
        c() {
        }

        @Override // androidx.core.view.j0
        public void a(View view) {
            ((View) n.this.f1015e.getParent()).invalidate();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d extends i.b implements e.a {

        /* renamed from: c  reason: collision with root package name */
        private final Context f1040c;

        /* renamed from: d  reason: collision with root package name */
        private final androidx.appcompat.view.menu.e f1041d;

        /* renamed from: e  reason: collision with root package name */
        private b.a f1042e;

        /* renamed from: f  reason: collision with root package name */
        private WeakReference<View> f1043f;

        public d(Context context, b.a aVar) {
            this.f1040c = context;
            this.f1042e = aVar;
            androidx.appcompat.view.menu.e S = new androidx.appcompat.view.menu.e(context).S(1);
            this.f1041d = S;
            S.R(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            b.a aVar = this.f1042e;
            if (aVar != null) {
                return aVar.a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.f1042e == null) {
                return;
            }
            k();
            n.this.f1017g.l();
        }

        @Override // i.b
        public void c() {
            n nVar = n.this;
            if (nVar.f1023m != this) {
                return;
            }
            if (!n.A(nVar.f1031u, nVar.f1032v, false)) {
                n nVar2 = n.this;
                nVar2.f1024n = this;
                nVar2.f1025o = this.f1042e;
            } else {
                this.f1042e.b(this);
            }
            this.f1042e = null;
            n.this.z(false);
            n.this.f1017g.g();
            n nVar3 = n.this;
            nVar3.f1014d.setHideOnContentScrollEnabled(nVar3.A);
            n.this.f1023m = null;
        }

        @Override // i.b
        public View d() {
            WeakReference<View> weakReference = this.f1043f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // i.b
        public Menu e() {
            return this.f1041d;
        }

        @Override // i.b
        public MenuInflater f() {
            return new i.g(this.f1040c);
        }

        @Override // i.b
        public CharSequence g() {
            return n.this.f1017g.getSubtitle();
        }

        @Override // i.b
        public CharSequence i() {
            return n.this.f1017g.getTitle();
        }

        @Override // i.b
        public void k() {
            if (n.this.f1023m != this) {
                return;
            }
            this.f1041d.d0();
            try {
                this.f1042e.c(this, this.f1041d);
            } finally {
                this.f1041d.c0();
            }
        }

        @Override // i.b
        public boolean l() {
            return n.this.f1017g.j();
        }

        @Override // i.b
        public void m(View view) {
            n.this.f1017g.setCustomView(view);
            this.f1043f = new WeakReference<>(view);
        }

        @Override // i.b
        public void n(int i10) {
            o(n.this.f1011a.getResources().getString(i10));
        }

        @Override // i.b
        public void o(CharSequence charSequence) {
            n.this.f1017g.setSubtitle(charSequence);
        }

        @Override // i.b
        public void q(int i10) {
            r(n.this.f1011a.getResources().getString(i10));
        }

        @Override // i.b
        public void r(CharSequence charSequence) {
            n.this.f1017g.setTitle(charSequence);
        }

        @Override // i.b
        public void s(boolean z10) {
            super.s(z10);
            n.this.f1017g.setTitleOptional(z10);
        }

        public boolean t() {
            this.f1041d.d0();
            try {
                return this.f1042e.d(this, this.f1041d);
            } finally {
                this.f1041d.c0();
            }
        }
    }

    public n(Activity activity, boolean z10) {
        this.f1013c = activity;
        View decorView = activity.getWindow().getDecorView();
        H(decorView);
        if (z10) {
            return;
        }
        this.f1018h = decorView.findViewById(16908290);
    }

    static boolean A(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    private g0 E(View view) {
        if (view instanceof g0) {
            return (g0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void G() {
        if (this.f1033w) {
            this.f1033w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1014d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            O(false);
        }
    }

    private void H(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(e.f.f24631p);
        this.f1014d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f1016f = E(view.findViewById(e.f.f24616a));
        this.f1017g = (ActionBarContextView) view.findViewById(e.f.f24621f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(e.f.f24618c);
        this.f1015e = actionBarContainer;
        g0 g0Var = this.f1016f;
        if (g0Var != null && this.f1017g != null && actionBarContainer != null) {
            this.f1011a = g0Var.getContext();
            boolean z10 = (this.f1016f.v() & 4) != 0;
            if (z10) {
                this.f1022l = true;
            }
            i.a b10 = i.a.b(this.f1011a);
            t(b10.a() || z10);
            K(b10.g());
            TypedArray obtainStyledAttributes = this.f1011a.obtainStyledAttributes(null, e.j.f24678a, e.a.f24542c, 0);
            if (obtainStyledAttributes.getBoolean(e.j.f24728k, false)) {
                L(true);
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(e.j.f24718i, 0);
            if (dimensionPixelSize != 0) {
                J(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
    }

    private void K(boolean z10) {
        this.f1028r = z10;
        if (!z10) {
            this.f1016f.r(null);
            this.f1015e.setTabContainer(this.f1019i);
        } else {
            this.f1015e.setTabContainer(null);
            this.f1016f.r(this.f1019i);
        }
        boolean z11 = true;
        boolean z12 = F() == 2;
        s0 s0Var = this.f1019i;
        if (s0Var != null) {
            if (z12) {
                s0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1014d;
                if (actionBarOverlayLayout != null) {
                    a0.n0(actionBarOverlayLayout);
                }
            } else {
                s0Var.setVisibility(8);
            }
        }
        this.f1016f.p(!this.f1028r && z12);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1014d;
        if (this.f1028r || !z12) {
            z11 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z11);
    }

    private boolean M() {
        return a0.U(this.f1015e);
    }

    private void N() {
        if (this.f1033w) {
            return;
        }
        this.f1033w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1014d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        O(false);
    }

    private void O(boolean z10) {
        if (A(this.f1031u, this.f1032v, this.f1033w)) {
            if (this.f1034x) {
                return;
            }
            this.f1034x = true;
            D(z10);
        } else if (this.f1034x) {
            this.f1034x = false;
            C(z10);
        }
    }

    void B() {
        b.a aVar = this.f1025o;
        if (aVar != null) {
            aVar.b(this.f1024n);
            this.f1024n = null;
            this.f1025o = null;
        }
    }

    public void C(boolean z10) {
        View view;
        int[] iArr;
        i.h hVar = this.f1035y;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f1029s == 0 && (this.f1036z || z10)) {
            this.f1015e.setAlpha(1.0f);
            this.f1015e.setTransitioning(true);
            i.h hVar2 = new i.h();
            float f10 = -this.f1015e.getHeight();
            if (z10) {
                this.f1015e.getLocationInWindow(new int[]{0, 0});
                f10 -= iArr[1];
            }
            androidx.core.view.g0 m7 = a0.e(this.f1015e).m(f10);
            m7.k(this.D);
            hVar2.c(m7);
            if (this.f1030t && (view = this.f1018h) != null) {
                hVar2.c(a0.e(view).m(f10));
            }
            hVar2.f(E);
            hVar2.e(250L);
            hVar2.g(this.B);
            this.f1035y = hVar2;
            hVar2.h();
            return;
        }
        this.B.b(null);
    }

    public void D(boolean z10) {
        View view;
        View view2;
        int[] iArr;
        i.h hVar = this.f1035y;
        if (hVar != null) {
            hVar.a();
        }
        this.f1015e.setVisibility(0);
        if (this.f1029s == 0 && (this.f1036z || z10)) {
            this.f1015e.setTranslationY(0.0f);
            float f10 = -this.f1015e.getHeight();
            if (z10) {
                this.f1015e.getLocationInWindow(new int[]{0, 0});
                f10 -= iArr[1];
            }
            this.f1015e.setTranslationY(f10);
            i.h hVar2 = new i.h();
            androidx.core.view.g0 m7 = a0.e(this.f1015e).m(0.0f);
            m7.k(this.D);
            hVar2.c(m7);
            if (this.f1030t && (view2 = this.f1018h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(a0.e(this.f1018h).m(0.0f));
            }
            hVar2.f(F);
            hVar2.e(250L);
            hVar2.g(this.C);
            this.f1035y = hVar2;
            hVar2.h();
        } else {
            this.f1015e.setAlpha(1.0f);
            this.f1015e.setTranslationY(0.0f);
            if (this.f1030t && (view = this.f1018h) != null) {
                view.setTranslationY(0.0f);
            }
            this.C.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1014d;
        if (actionBarOverlayLayout != null) {
            a0.n0(actionBarOverlayLayout);
        }
    }

    public int F() {
        return this.f1016f.k();
    }

    public void I(int i10, int i11) {
        int v10 = this.f1016f.v();
        if ((i11 & 4) != 0) {
            this.f1022l = true;
        }
        this.f1016f.i((i10 & i11) | ((~i11) & v10));
    }

    public void J(float f10) {
        a0.y0(this.f1015e, f10);
    }

    public void L(boolean z10) {
        if (z10 && !this.f1014d.w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.A = z10;
        this.f1014d.setHideOnContentScrollEnabled(z10);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f1032v) {
            this.f1032v = false;
            O(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z10) {
        this.f1030t = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f1032v) {
            return;
        }
        this.f1032v = true;
        O(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        i.h hVar = this.f1035y;
        if (hVar != null) {
            hVar.a();
            this.f1035y = null;
        }
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        g0 g0Var = this.f1016f;
        if (g0Var == null || !g0Var.h()) {
            return false;
        }
        this.f1016f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void h(boolean z10) {
        if (z10 == this.f1026p) {
            return;
        }
        this.f1026p = z10;
        int size = this.f1027q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f1027q.get(i10).a(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public int i() {
        return this.f1016f.v();
    }

    @Override // androidx.appcompat.app.a
    public Context j() {
        if (this.f1012b == null) {
            TypedValue typedValue = new TypedValue();
            this.f1011a.getTheme().resolveAttribute(e.a.f24546g, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f1012b = new ContextThemeWrapper(this.f1011a, i10);
            } else {
                this.f1012b = this.f1011a;
            }
        }
        return this.f1012b;
    }

    @Override // androidx.appcompat.app.a
    public void k() {
        if (this.f1031u) {
            return;
        }
        this.f1031u = true;
        O(false);
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        K(i.a.b(this.f1011a).g());
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i10, KeyEvent keyEvent) {
        Menu e8;
        d dVar = this.f1023m;
        if (dVar == null || (e8 = dVar.e()) == null) {
            return false;
        }
        e8.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return e8.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i10) {
        this.f1029s = i10;
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z10) {
        if (this.f1022l) {
            return;
        }
        s(z10);
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z10) {
        I(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z10) {
        this.f1016f.n(z10);
    }

    @Override // androidx.appcompat.app.a
    public void u(boolean z10) {
        i.h hVar;
        this.f1036z = z10;
        if (z10 || (hVar = this.f1035y) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void v(CharSequence charSequence) {
        this.f1016f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void w(CharSequence charSequence) {
        this.f1016f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void x() {
        if (this.f1031u) {
            this.f1031u = false;
            O(false);
        }
    }

    @Override // androidx.appcompat.app.a
    public i.b y(b.a aVar) {
        d dVar = this.f1023m;
        if (dVar != null) {
            dVar.c();
        }
        this.f1014d.setHideOnContentScrollEnabled(false);
        this.f1017g.k();
        d dVar2 = new d(this.f1017g.getContext(), aVar);
        if (dVar2.t()) {
            this.f1023m = dVar2;
            dVar2.k();
            this.f1017g.h(dVar2);
            z(true);
            return dVar2;
        }
        return null;
    }

    public void z(boolean z10) {
        androidx.core.view.g0 l10;
        androidx.core.view.g0 f10;
        if (z10) {
            N();
        } else {
            G();
        }
        if (!M()) {
            if (z10) {
                this.f1016f.u(4);
                this.f1017g.setVisibility(0);
                return;
            }
            this.f1016f.u(0);
            this.f1017g.setVisibility(8);
            return;
        }
        if (z10) {
            f10 = this.f1016f.l(4, 100L);
            l10 = this.f1017g.f(0, 200L);
        } else {
            l10 = this.f1016f.l(0, 200L);
            f10 = this.f1017g.f(8, 100L);
        }
        i.h hVar = new i.h();
        hVar.d(f10, l10);
        hVar.h();
    }

    public n(Dialog dialog) {
        H(dialog.getWindow().getDecorView());
    }
}

package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.o0;
import androidx.core.view.a0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StandardMenuPopup.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class l extends h implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: v  reason: collision with root package name */
    private static final int f1210v = e.g.f24654m;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1211b;

    /* renamed from: c  reason: collision with root package name */
    private final e f1212c;

    /* renamed from: d  reason: collision with root package name */
    private final d f1213d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f1214e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1215f;

    /* renamed from: g  reason: collision with root package name */
    private final int f1216g;

    /* renamed from: h  reason: collision with root package name */
    private final int f1217h;

    /* renamed from: i  reason: collision with root package name */
    final o0 f1218i;

    /* renamed from: l  reason: collision with root package name */
    private PopupWindow.OnDismissListener f1221l;

    /* renamed from: m  reason: collision with root package name */
    private View f1222m;

    /* renamed from: n  reason: collision with root package name */
    View f1223n;

    /* renamed from: o  reason: collision with root package name */
    private j.a f1224o;

    /* renamed from: p  reason: collision with root package name */
    ViewTreeObserver f1225p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1226q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f1227r;

    /* renamed from: s  reason: collision with root package name */
    private int f1228s;

    /* renamed from: u  reason: collision with root package name */
    private boolean f1230u;

    /* renamed from: j  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f1219j = new a();

    /* renamed from: k  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f1220k = new b();

    /* renamed from: t  reason: collision with root package name */
    private int f1229t = 0;

    /* compiled from: StandardMenuPopup.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!l.this.a() || l.this.f1218i.A()) {
                return;
            }
            View view = l.this.f1223n;
            if (view != null && view.isShown()) {
                l.this.f1218i.show();
            } else {
                l.this.dismiss();
            }
        }
    }

    /* compiled from: StandardMenuPopup.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f1225p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f1225p = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f1225p.removeGlobalOnLayoutListener(lVar.f1219j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i10, int i11, boolean z10) {
        this.f1211b = context;
        this.f1212c = eVar;
        this.f1214e = z10;
        this.f1213d = new d(eVar, LayoutInflater.from(context), z10, f1210v);
        this.f1216g = i10;
        this.f1217h = i11;
        Resources resources = context.getResources();
        this.f1215f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(e.d.f24578d));
        this.f1222m = view;
        this.f1218i = new o0(context, null, i10, i11);
        eVar.c(this, context);
    }

    private boolean y() {
        View view;
        if (a()) {
            return true;
        }
        if (this.f1226q || (view = this.f1222m) == null) {
            return false;
        }
        this.f1223n = view;
        this.f1218i.J(this);
        this.f1218i.K(this);
        this.f1218i.I(true);
        View view2 = this.f1223n;
        boolean z10 = this.f1225p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1225p = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1219j);
        }
        view2.addOnAttachStateChangeListener(this.f1220k);
        this.f1218i.C(view2);
        this.f1218i.F(this.f1229t);
        if (!this.f1227r) {
            this.f1228s = h.m(this.f1213d, null, this.f1211b, this.f1215f);
            this.f1227r = true;
        }
        this.f1218i.E(this.f1228s);
        this.f1218i.H(2);
        this.f1218i.G(l());
        this.f1218i.show();
        ListView o10 = this.f1218i.o();
        o10.setOnKeyListener(this);
        if (this.f1230u && this.f1212c.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1211b).inflate(e.g.f24653l, (ViewGroup) o10, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f1212c.x());
            }
            frameLayout.setEnabled(false);
            o10.addHeaderView(frameLayout, null, false);
        }
        this.f1218i.m(this.f1213d);
        this.f1218i.show();
        return true;
    }

    @Override // j.e
    public boolean a() {
        return !this.f1226q && this.f1218i.a();
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        if (eVar != this.f1212c) {
            return;
        }
        dismiss();
        j.a aVar = this.f1224o;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(j.a aVar) {
        this.f1224o = aVar;
    }

    @Override // j.e
    public void dismiss() {
        if (a()) {
            this.f1218i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f1211b, mVar, this.f1223n, this.f1214e, this.f1216g, this.f1217h);
            iVar.j(this.f1224o);
            iVar.g(h.w(mVar));
            iVar.i(this.f1221l);
            this.f1221l = null;
            this.f1212c.e(false);
            int c10 = this.f1218i.c();
            int l10 = this.f1218i.l();
            if ((Gravity.getAbsoluteGravity(this.f1229t, a0.E(this.f1222m)) & 7) == 5) {
                c10 += this.f1222m.getWidth();
            }
            if (iVar.n(c10, l10)) {
                j.a aVar = this.f1224o;
                if (aVar != null) {
                    aVar.c(mVar);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z10) {
        this.f1227r = false;
        d dVar = this.f1213d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void j(e eVar) {
    }

    @Override // androidx.appcompat.view.menu.h
    public void n(View view) {
        this.f1222m = view;
    }

    @Override // j.e
    public ListView o() {
        return this.f1218i.o();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f1226q = true;
        this.f1212c.close();
        ViewTreeObserver viewTreeObserver = this.f1225p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1225p = this.f1223n.getViewTreeObserver();
            }
            this.f1225p.removeGlobalOnLayoutListener(this.f1219j);
            this.f1225p = null;
        }
        this.f1223n.removeOnAttachStateChangeListener(this.f1220k);
        PopupWindow.OnDismissListener onDismissListener = this.f1221l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i10 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void q(boolean z10) {
        this.f1213d.d(z10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(int i10) {
        this.f1229t = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i10) {
        this.f1218i.e(i10);
    }

    @Override // j.e
    public void show() {
        if (!y()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f1221l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(boolean z10) {
        this.f1230u = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(int i10) {
        this.f1218i.i(i10);
    }
}

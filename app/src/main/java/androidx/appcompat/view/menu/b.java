package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.n0;
import androidx.appcompat.widget.o0;
import androidx.core.view.a0;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CascadingMenuPopup.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b extends h implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int B = e.g.f24646e;
    boolean A;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1087b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1088c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1089d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1090e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f1091f;

    /* renamed from: g  reason: collision with root package name */
    final Handler f1092g;

    /* renamed from: o  reason: collision with root package name */
    private View f1100o;

    /* renamed from: p  reason: collision with root package name */
    View f1101p;

    /* renamed from: r  reason: collision with root package name */
    private boolean f1103r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f1104s;

    /* renamed from: t  reason: collision with root package name */
    private int f1105t;

    /* renamed from: u  reason: collision with root package name */
    private int f1106u;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1108w;

    /* renamed from: x  reason: collision with root package name */
    private j.a f1109x;

    /* renamed from: y  reason: collision with root package name */
    ViewTreeObserver f1110y;

    /* renamed from: z  reason: collision with root package name */
    private PopupWindow.OnDismissListener f1111z;

    /* renamed from: h  reason: collision with root package name */
    private final List<e> f1093h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    final List<d> f1094i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f1095j = new a();

    /* renamed from: k  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f1096k = new View$OnAttachStateChangeListenerC0020b();

    /* renamed from: l  reason: collision with root package name */
    private final n0 f1097l = new c();

    /* renamed from: m  reason: collision with root package name */
    private int f1098m = 0;

    /* renamed from: n  reason: collision with root package name */
    private int f1099n = 0;

    /* renamed from: v  reason: collision with root package name */
    private boolean f1107v = false;

    /* renamed from: q  reason: collision with root package name */
    private int f1102q = C();

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.a() || b.this.f1094i.size() <= 0 || b.this.f1094i.get(0).f1119a.A()) {
                return;
            }
            View view = b.this.f1101p;
            if (view != null && view.isShown()) {
                for (d dVar : b.this.f1094i) {
                    dVar.f1119a.show();
                }
                return;
            }
            b.this.dismiss();
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class View$OnAttachStateChangeListenerC0020b implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC0020b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f1110y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f1110y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f1110y.removeGlobalOnLayoutListener(bVar.f1095j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class c implements n0 {

        /* compiled from: CascadingMenuPopup.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f1115a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ MenuItem f1116b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ e f1117c;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f1115a = dVar;
                this.f1116b = menuItem;
                this.f1117c = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f1115a;
                if (dVar != null) {
                    b.this.A = true;
                    dVar.f1120b.e(false);
                    b.this.A = false;
                }
                if (this.f1116b.isEnabled() && this.f1116b.hasSubMenu()) {
                    this.f1117c.L(this.f1116b, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.n0
        public void d(e eVar, MenuItem menuItem) {
            b.this.f1092g.removeCallbacksAndMessages(null);
            int size = b.this.f1094i.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == b.this.f1094i.get(i10).f1120b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            b.this.f1092g.postAtTime(new a(i11 < b.this.f1094i.size() ? b.this.f1094i.get(i11) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.n0
        public void n(e eVar, MenuItem menuItem) {
            b.this.f1092g.removeCallbacksAndMessages(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final o0 f1119a;

        /* renamed from: b  reason: collision with root package name */
        public final e f1120b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1121c;

        public d(o0 o0Var, e eVar, int i10) {
            this.f1119a = o0Var;
            this.f1120b = eVar;
            this.f1121c = i10;
        }

        public ListView a() {
            return this.f1119a.o();
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z10) {
        this.f1087b = context;
        this.f1100o = view;
        this.f1089d = i10;
        this.f1090e = i11;
        this.f1091f = z10;
        Resources resources = context.getResources();
        this.f1088c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(e.d.f24578d));
        this.f1092g = new Handler();
    }

    private MenuItem A(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = eVar.getItem(i10);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View B(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int i10;
        int firstVisiblePosition;
        MenuItem A = A(dVar.f1120b, eVar);
        if (A == null) {
            return null;
        }
        ListView a10 = dVar.a();
        ListAdapter adapter = a10.getAdapter();
        int i11 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i10 = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            i10 = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i11 >= count) {
                i11 = -1;
                break;
            } else if (A == dVar2.getItem(i11)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 != -1 && (firstVisiblePosition = (i11 + i10) - a10.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a10.getChildCount()) {
            return a10.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int C() {
        return a0.E(this.f1100o) == 1 ? 0 : 1;
    }

    private int D(int i10) {
        List<d> list = this.f1094i;
        ListView a10 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a10.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1101p.getWindowVisibleDisplayFrame(rect);
        return this.f1102q == 1 ? (iArr[0] + a10.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    private void E(e eVar) {
        d dVar;
        View view;
        int i10;
        int i11;
        int i12;
        LayoutInflater from = LayoutInflater.from(this.f1087b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, from, this.f1091f, B);
        if (!a() && this.f1107v) {
            dVar2.d(true);
        } else if (a()) {
            dVar2.d(h.w(eVar));
        }
        int m7 = h.m(dVar2, null, this.f1087b, this.f1088c);
        o0 y10 = y();
        y10.m(dVar2);
        y10.E(m7);
        y10.F(this.f1099n);
        if (this.f1094i.size() > 0) {
            List<d> list = this.f1094i;
            dVar = list.get(list.size() - 1);
            view = B(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            y10.T(false);
            y10.Q(null);
            int D = D(m7);
            boolean z10 = D == 1;
            this.f1102q = D;
            if (Build.VERSION.SDK_INT >= 26) {
                y10.C(view);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f1100o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f1099n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1100o.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f1099n & 5) == 5) {
                if (!z10) {
                    m7 = view.getWidth();
                    i12 = i10 - m7;
                }
                i12 = i10 + m7;
            } else {
                if (z10) {
                    m7 = view.getWidth();
                    i12 = i10 + m7;
                }
                i12 = i10 - m7;
            }
            y10.e(i12);
            y10.L(true);
            y10.i(i11);
        } else {
            if (this.f1103r) {
                y10.e(this.f1105t);
            }
            if (this.f1104s) {
                y10.i(this.f1106u);
            }
            y10.G(l());
        }
        this.f1094i.add(new d(y10, eVar, this.f1102q));
        y10.show();
        ListView o10 = y10.o();
        o10.setOnKeyListener(this);
        if (dVar == null && this.f1108w && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(e.g.f24653l, (ViewGroup) o10, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(eVar.x());
            o10.addHeaderView(frameLayout, null, false);
            y10.show();
        }
    }

    private o0 y() {
        o0 o0Var = new o0(this.f1087b, null, this.f1089d, this.f1090e);
        o0Var.S(this.f1097l);
        o0Var.K(this);
        o0Var.J(this);
        o0Var.C(this.f1100o);
        o0Var.F(this.f1099n);
        o0Var.I(true);
        o0Var.H(2);
        return o0Var;
    }

    private int z(e eVar) {
        int size = this.f1094i.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (eVar == this.f1094i.get(i10).f1120b) {
                return i10;
            }
        }
        return -1;
    }

    @Override // j.e
    public boolean a() {
        return this.f1094i.size() > 0 && this.f1094i.get(0).f1119a.a();
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        int z11 = z(eVar);
        if (z11 < 0) {
            return;
        }
        int i10 = z11 + 1;
        if (i10 < this.f1094i.size()) {
            this.f1094i.get(i10).f1120b.e(false);
        }
        d remove = this.f1094i.remove(z11);
        remove.f1120b.O(this);
        if (this.A) {
            remove.f1119a.R(null);
            remove.f1119a.D(0);
        }
        remove.f1119a.dismiss();
        int size = this.f1094i.size();
        if (size > 0) {
            this.f1102q = this.f1094i.get(size - 1).f1121c;
        } else {
            this.f1102q = C();
        }
        if (size != 0) {
            if (z10) {
                this.f1094i.get(0).f1120b.e(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.f1109x;
        if (aVar != null) {
            aVar.b(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f1110y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f1110y.removeGlobalOnLayoutListener(this.f1095j);
            }
            this.f1110y = null;
        }
        this.f1101p.removeOnAttachStateChangeListener(this.f1096k);
        this.f1111z.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(j.a aVar) {
        this.f1109x = aVar;
    }

    @Override // j.e
    public void dismiss() {
        int size = this.f1094i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f1094i.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f1119a.a()) {
                    dVar.f1119a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        for (d dVar : this.f1094i) {
            if (mVar == dVar.f1120b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (mVar.hasVisibleItems()) {
            j(mVar);
            j.a aVar = this.f1109x;
            if (aVar != null) {
                aVar.c(mVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z10) {
        for (d dVar : this.f1094i) {
            h.x(dVar.a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void j(e eVar) {
        eVar.c(this, this.f1087b);
        if (a()) {
            E(eVar);
        } else {
            this.f1093h.add(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    protected boolean k() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void n(View view) {
        if (this.f1100o != view) {
            this.f1100o = view;
            this.f1099n = androidx.core.view.e.b(this.f1098m, a0.E(view));
        }
    }

    @Override // j.e
    public ListView o() {
        if (this.f1094i.isEmpty()) {
            return null;
        }
        List<d> list = this.f1094i;
        return list.get(list.size() - 1).a();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f1094i.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f1094i.get(i10);
            if (!dVar.f1119a.a()) {
                break;
            }
            i10++;
        }
        if (dVar != null) {
            dVar.f1120b.e(false);
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
        this.f1107v = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(int i10) {
        if (this.f1098m != i10) {
            this.f1098m = i10;
            this.f1099n = androidx.core.view.e.b(i10, a0.E(this.f1100o));
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i10) {
        this.f1103r = true;
        this.f1105t = i10;
    }

    @Override // j.e
    public void show() {
        if (a()) {
            return;
        }
        for (e eVar : this.f1093h) {
            E(eVar);
        }
        this.f1093h.clear();
        View view = this.f1100o;
        this.f1101p = view;
        if (view != null) {
            boolean z10 = this.f1110y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f1110y = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1095j);
            }
            this.f1101p.addOnAttachStateChangeListener(this.f1096k);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f1111z = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(boolean z10) {
        this.f1108w = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(int i10) {
        this.f1104s = true;
        this.f1106u = i10;
    }
}

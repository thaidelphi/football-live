package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.b;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActionMenuPresenter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c extends androidx.appcompat.view.menu.a implements b.a {
    RunnableC0022c A;
    private b B;
    final f C;
    int D;

    /* renamed from: k  reason: collision with root package name */
    d f1493k;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f1494l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1495m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f1496n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f1497o;

    /* renamed from: p  reason: collision with root package name */
    private int f1498p;

    /* renamed from: q  reason: collision with root package name */
    private int f1499q;

    /* renamed from: r  reason: collision with root package name */
    private int f1500r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f1501s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f1502t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f1503u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f1504v;

    /* renamed from: w  reason: collision with root package name */
    private int f1505w;

    /* renamed from: x  reason: collision with root package name */
    private final SparseBooleanArray f1506x;

    /* renamed from: y  reason: collision with root package name */
    e f1507y;

    /* renamed from: z  reason: collision with root package name */
    a f1508z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false, e.a.f24551l);
            if (!((androidx.appcompat.view.menu.g) mVar.getItem()).l()) {
                View view2 = c.this.f1493k;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) c.this).f1085i : view2);
            }
            j(c.this.C);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            c cVar = c.this;
            cVar.f1508z = null;
            cVar.D = 0;
            super.e();
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public j.e a() {
            a aVar = c.this.f1508z;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActionMenuPresenter.java */
    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class RunnableC0022c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private e f1511a;

        public RunnableC0022c(e eVar) {
            this.f1511a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) c.this).f1079c != null) {
                ((androidx.appcompat.view.menu.a) c.this).f1079c.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) c.this).f1085i;
            if (view != null && view.getWindowToken() != null && this.f1511a.m()) {
                c.this.f1507y = this.f1511a;
            }
            c.this.A = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d extends r implements ActionMenuView.a {

        /* compiled from: ActionMenuPresenter.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a extends k0 {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ c f1514j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, c cVar) {
                super(view);
                this.f1514j = cVar;
            }

            @Override // androidx.appcompat.widget.k0
            public j.e b() {
                e eVar = c.this.f1507y;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.k0
            public boolean c() {
                c.this.K();
                return true;
            }

            @Override // androidx.appcompat.widget.k0
            public boolean d() {
                c cVar = c.this;
                if (cVar.A != null) {
                    return false;
                }
                cVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, e.a.f24550k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            c1.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z10) {
            super(context, eVar, view, z10, e.a.f24551l);
            h(8388613);
            j(c.this.C);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            if (((androidx.appcompat.view.menu.a) c.this).f1079c != null) {
                ((androidx.appcompat.view.menu.a) c.this).f1079c.close();
            }
            c.this.f1507y = null;
            super.e();
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class f implements j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (eVar instanceof androidx.appcompat.view.menu.m) {
                eVar.D().e(false);
            }
            j.a m7 = c.this.m();
            if (m7 != null) {
                m7.b(eVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            if (eVar == ((androidx.appcompat.view.menu.a) c.this).f1079c) {
                return false;
            }
            c.this.D = ((androidx.appcompat.view.menu.m) eVar).getItem().getItemId();
            j.a m7 = c.this.m();
            if (m7 != null) {
                return m7.c(eVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, e.g.f24644c, e.g.f24643b);
        this.f1506x = new SparseBooleanArray();
        this.C = new f();
    }

    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1085i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.f1493k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1495m) {
            return this.f1494l;
        }
        return null;
    }

    public boolean B() {
        androidx.appcompat.view.menu.k kVar;
        RunnableC0022c runnableC0022c = this.A;
        if (runnableC0022c != null && (kVar = this.f1085i) != null) {
            ((View) kVar).removeCallbacks(runnableC0022c);
            this.A = null;
            return true;
        }
        e eVar = this.f1507y;
        if (eVar != null) {
            eVar.b();
            return true;
        }
        return false;
    }

    public boolean C() {
        a aVar = this.f1508z;
        if (aVar != null) {
            aVar.b();
            return true;
        }
        return false;
    }

    public boolean D() {
        return this.A != null || E();
    }

    public boolean E() {
        e eVar = this.f1507y;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.f1501s) {
            this.f1500r = i.a.b(this.f1078b).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f1079c;
        if (eVar != null) {
            eVar.K(true);
        }
    }

    public void G(boolean z10) {
        this.f1504v = z10;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f1085i = actionMenuView;
        actionMenuView.a(this.f1079c);
    }

    public void I(Drawable drawable) {
        d dVar = this.f1493k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f1495m = true;
        this.f1494l = drawable;
    }

    public void J(boolean z10) {
        this.f1496n = z10;
        this.f1497o = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f1496n || E() || (eVar = this.f1079c) == null || this.f1085i == null || this.A != null || eVar.z().isEmpty()) {
            return false;
        }
        RunnableC0022c runnableC0022c = new RunnableC0022c(new e(this.f1078b, this.f1079c, this.f1493k, true));
        this.A = runnableC0022c;
        ((View) this.f1085i).post(runnableC0022c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        y();
        super.b(eVar, z10);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean e(androidx.appcompat.view.menu.m mVar) {
        boolean z10 = false;
        if (mVar.hasVisibleItems()) {
            androidx.appcompat.view.menu.m mVar2 = mVar;
            while (mVar2.e0() != this.f1079c) {
                mVar2 = (androidx.appcompat.view.menu.m) mVar2.e0();
            }
            View z11 = z(mVar2.getItem());
            if (z11 == null) {
                return false;
            }
            this.D = mVar.getItem().getItemId();
            int size = mVar.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                MenuItem item = mVar.getItem(i10);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            a aVar = new a(this.f1078b, mVar, z11);
            this.f1508z = aVar;
            aVar.g(z10);
            this.f1508z.k();
            super.e(mVar);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void f(boolean z10) {
        super.f(z10);
        ((View) this.f1085i).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f1079c;
        boolean z11 = false;
        if (eVar != null) {
            ArrayList<androidx.appcompat.view.menu.g> s10 = eVar.s();
            int size = s10.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.core.view.b a10 = s10.get(i10).a();
                if (a10 != null) {
                    a10.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f1079c;
        ArrayList<androidx.appcompat.view.menu.g> z12 = eVar2 != null ? eVar2.z() : null;
        if (this.f1496n && z12 != null) {
            int size2 = z12.size();
            if (size2 == 1) {
                z11 = !z12.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f1493k == null) {
                this.f1493k = new d(this.f1077a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1493k.getParent();
            if (viewGroup != this.f1085i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1493k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1085i;
                actionMenuView.addView(this.f1493k, actionMenuView.F());
            }
        } else {
            d dVar = this.f1493k;
            if (dVar != null) {
                ViewParent parent = dVar.getParent();
                androidx.appcompat.view.menu.k kVar = this.f1085i;
                if (parent == kVar) {
                    ((ViewGroup) kVar).removeView(this.f1493k);
                }
            }
        }
        ((ActionMenuView) this.f1085i).setOverflowReserved(this.f1496n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.j
    public boolean g() {
        ArrayList<androidx.appcompat.view.menu.g> arrayList;
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        c cVar = this;
        androidx.appcompat.view.menu.e eVar = cVar.f1079c;
        View view = null;
        ?? r32 = 0;
        if (eVar != null) {
            arrayList = eVar.E();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i14 = cVar.f1500r;
        int i15 = cVar.f1499q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f1085i;
        boolean z11 = false;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < i10; i18++) {
            androidx.appcompat.view.menu.g gVar = arrayList.get(i18);
            if (gVar.o()) {
                i16++;
            } else if (gVar.n()) {
                i17++;
            } else {
                z11 = true;
            }
            if (cVar.f1504v && gVar.isActionViewExpanded()) {
                i14 = 0;
            }
        }
        if (cVar.f1496n && (z11 || i17 + i16 > i14)) {
            i14--;
        }
        int i19 = i14 - i16;
        SparseBooleanArray sparseBooleanArray = cVar.f1506x;
        sparseBooleanArray.clear();
        if (cVar.f1502t) {
            int i20 = cVar.f1505w;
            i12 = i15 / i20;
            i11 = i20 + ((i15 % i20) / i12);
        } else {
            i11 = 0;
            i12 = 0;
        }
        int i21 = 0;
        int i22 = 0;
        while (i21 < i10) {
            androidx.appcompat.view.menu.g gVar2 = arrayList.get(i21);
            if (gVar2.o()) {
                View n10 = cVar.n(gVar2, view, viewGroup);
                if (cVar.f1502t) {
                    i12 -= ActionMenuView.L(n10, i11, i12, makeMeasureSpec, r32);
                } else {
                    n10.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n10.getMeasuredWidth();
                i15 -= measuredWidth;
                if (i22 == 0) {
                    i22 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                z10 = r32;
                i13 = i10;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z12 = sparseBooleanArray.get(groupId2);
                boolean z13 = (i19 > 0 || z12) && i15 > 0 && (!cVar.f1502t || i12 > 0);
                boolean z14 = z13;
                i13 = i10;
                if (z13) {
                    View n11 = cVar.n(gVar2, null, viewGroup);
                    if (cVar.f1502t) {
                        int L = ActionMenuView.L(n11, i11, i12, makeMeasureSpec, 0);
                        i12 -= L;
                        if (L == 0) {
                            z14 = false;
                        }
                    } else {
                        n11.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z15 = z14;
                    int measuredWidth2 = n11.getMeasuredWidth();
                    i15 -= measuredWidth2;
                    if (i22 == 0) {
                        i22 = measuredWidth2;
                    }
                    z13 = z15 & (!cVar.f1502t ? i15 + i22 <= 0 : i15 < 0);
                }
                if (z13 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z12) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i23 = 0; i23 < i21; i23++) {
                        androidx.appcompat.view.menu.g gVar3 = arrayList.get(i23);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i19++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z13) {
                    i19--;
                }
                gVar2.u(z13);
                z10 = false;
            } else {
                z10 = r32;
                i13 = i10;
                gVar2.u(z10);
            }
            i21++;
            r32 = z10;
            i10 = i13;
            view = null;
            cVar = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void i(Context context, androidx.appcompat.view.menu.e eVar) {
        super.i(context, eVar);
        Resources resources = context.getResources();
        i.a b10 = i.a.b(context);
        if (!this.f1497o) {
            this.f1496n = b10.h();
        }
        if (!this.f1503u) {
            this.f1498p = b10.c();
        }
        if (!this.f1501s) {
            this.f1500r = b10.d();
        }
        int i10 = this.f1498p;
        if (this.f1496n) {
            if (this.f1493k == null) {
                d dVar = new d(this.f1077a);
                this.f1493k = dVar;
                if (this.f1495m) {
                    dVar.setImageDrawable(this.f1494l);
                    this.f1494l = null;
                    this.f1495m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1493k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f1493k.getMeasuredWidth();
        } else {
            this.f1493k = null;
        }
        this.f1499q = i10;
        this.f1505w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a
    public void j(androidx.appcompat.view.menu.g gVar, k.a aVar) {
        aVar.c(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1085i);
        if (this.B == null) {
            this.B = new b();
        }
        actionMenuItemView.setPopupCallback(this.B);
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean l(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f1493k) {
            return false;
        }
        return super.l(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.a
    public View n(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.o(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.k o(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.k kVar = this.f1085i;
        androidx.appcompat.view.menu.k o10 = super.o(viewGroup);
        if (kVar != o10) {
            ((ActionMenuView) o10).setPresenter(this);
        }
        return o10;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean q(int i10, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class Toolbar extends ViewGroup {
    private ColorStateList A;
    private boolean B;
    private boolean C;
    private final ArrayList<View> D;
    private final ArrayList<View> E;
    private final int[] F;
    final androidx.core.view.k G;
    private ArrayList<MenuItem> H;
    f I;
    private final ActionMenuView.e J;
    private b1 K;
    private androidx.appcompat.widget.c L;
    private d M;
    private j.a N;
    private e.a O;
    private boolean P;
    private final Runnable Q;

    /* renamed from: a  reason: collision with root package name */
    private ActionMenuView f1395a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f1396b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f1397c;

    /* renamed from: d  reason: collision with root package name */
    private ImageButton f1398d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f1399e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f1400f;

    /* renamed from: g  reason: collision with root package name */
    private CharSequence f1401g;

    /* renamed from: h  reason: collision with root package name */
    ImageButton f1402h;

    /* renamed from: i  reason: collision with root package name */
    View f1403i;

    /* renamed from: j  reason: collision with root package name */
    private Context f1404j;

    /* renamed from: k  reason: collision with root package name */
    private int f1405k;

    /* renamed from: l  reason: collision with root package name */
    private int f1406l;

    /* renamed from: m  reason: collision with root package name */
    private int f1407m;

    /* renamed from: n  reason: collision with root package name */
    int f1408n;

    /* renamed from: o  reason: collision with root package name */
    private int f1409o;

    /* renamed from: p  reason: collision with root package name */
    private int f1410p;

    /* renamed from: q  reason: collision with root package name */
    private int f1411q;

    /* renamed from: r  reason: collision with root package name */
    private int f1412r;

    /* renamed from: s  reason: collision with root package name */
    private int f1413s;

    /* renamed from: t  reason: collision with root package name */
    private r0 f1414t;

    /* renamed from: u  reason: collision with root package name */
    private int f1415u;

    /* renamed from: v  reason: collision with root package name */
    private int f1416v;

    /* renamed from: w  reason: collision with root package name */
    private int f1417w;

    /* renamed from: x  reason: collision with root package name */
    private CharSequence f1418x;

    /* renamed from: y  reason: collision with root package name */
    private CharSequence f1419y;

    /* renamed from: z  reason: collision with root package name */
    private ColorStateList f1420z;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.G.j(menuItem)) {
                return true;
            }
            f fVar = Toolbar.this.I;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements androidx.appcompat.view.menu.j {

        /* renamed from: a  reason: collision with root package name */
        androidx.appcompat.view.menu.e f1426a;

        /* renamed from: b  reason: collision with root package name */
        androidx.appcompat.view.menu.g f1427b;

        d() {
        }

        @Override // androidx.appcompat.view.menu.j
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean c(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f1402h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1402h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1402h);
            }
            Toolbar.this.f1403i = gVar.getActionView();
            this.f1427b = gVar;
            ViewParent parent2 = Toolbar.this.f1403i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1403i);
                }
                e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f878a = 8388611 | (toolbar4.f1408n & 112);
                generateDefaultLayoutParams.f1429b = 2;
                toolbar4.f1403i.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1403i);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            gVar.r(true);
            View view = Toolbar.this.f1403i;
            if (view instanceof i.c) {
                ((i.c) view).b();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean e(androidx.appcompat.view.menu.m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public void f(boolean z10) {
            if (this.f1427b != null) {
                androidx.appcompat.view.menu.e eVar = this.f1426a;
                boolean z11 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        } else if (this.f1426a.getItem(i10) == this.f1427b) {
                            z11 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (z11) {
                    return;
                }
                h(this.f1426a, this.f1427b);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean g() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean h(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            View view = Toolbar.this.f1403i;
            if (view instanceof i.c) {
                ((i.c) view).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1403i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1402h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1403i = null;
            toolbar3.a();
            this.f1427b = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void i(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f1426a;
            if (eVar2 != null && (gVar = this.f1427b) != null) {
                eVar2.f(gVar);
            }
            this.f1426a = eVar;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.N);
    }

    private int C(View view, int i10, int[] iArr, int i11) {
        e eVar = (e) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q10, max + measuredWidth, view.getMeasuredHeight() + q10);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    private int D(View view, int i10, int[] iArr, int i11) {
        e eVar = (e) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q10, max, view.getMeasuredHeight() + q10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    private int E(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void F(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void G() {
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.G.h(getMenu(), getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
    }

    private void H() {
        removeCallbacks(this.Q);
        post(this.Q);
    }

    private boolean O() {
        if (this.P) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private boolean P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i10) {
        boolean z10 = androidx.core.view.a0.E(this) == 1;
        int childCount = getChildCount();
        int b10 = androidx.core.view.e.b(i10, androidx.core.view.a0.E(this));
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f1429b == 0 && P(childAt) && p(eVar.f878a) == b10) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f1429b == 0 && P(childAt2) && p(eVar2.f878a) == b10) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z10) {
        e eVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            eVar = generateLayoutParams(layoutParams);
        } else {
            eVar = (e) layoutParams;
        }
        eVar.f1429b = 1;
        if (z10 && this.f1403i != null) {
            view.setLayoutParams(eVar);
            this.E.add(view);
            return;
        }
        addView(view, eVar);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new i.g(getContext());
    }

    private void h() {
        if (this.f1414t == null) {
            this.f1414t = new r0();
        }
    }

    private void i() {
        if (this.f1399e == null) {
            this.f1399e = new r(getContext());
        }
    }

    private void j() {
        k();
        if (this.f1395a.N() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f1395a.getMenu();
            if (this.M == null) {
                this.M = new d();
            }
            this.f1395a.setExpandedActionViewsExclusive(true);
            eVar.c(this.M, this.f1404j);
        }
    }

    private void k() {
        if (this.f1395a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1395a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1405k);
            this.f1395a.setOnMenuItemClickListener(this.J);
            this.f1395a.O(this.N, this.O);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f878a = 8388613 | (this.f1408n & 112);
            this.f1395a.setLayoutParams(generateDefaultLayoutParams);
            c(this.f1395a, false);
        }
    }

    private void l() {
        if (this.f1398d == null) {
            this.f1398d = new p(getContext(), null, e.a.M);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f878a = 8388611 | (this.f1408n & 112);
            this.f1398d.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private int p(int i10) {
        int E = androidx.core.view.a0.E(this);
        int b10 = androidx.core.view.e.b(i10, E) & 7;
        return (b10 == 1 || b10 == 3 || b10 == 5) ? b10 : E == 1 ? 5 : 3;
    }

    private int q(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int r10 = r(eVar.f878a);
        if (r10 != 48) {
            if (r10 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i13 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                if (i12 < i13) {
                    i12 = i13;
                } else {
                    int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
                    int i15 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    if (i14 < i15) {
                        i12 = Math.max(0, i12 - (i15 - i14));
                    }
                }
                return paddingTop + i12;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i11;
        }
        return getPaddingTop() - i11;
    }

    private int r(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f1417w & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.h.b(marginLayoutParams) + androidx.core.view.h.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            View view = list.get(i12);
            e eVar = (e) view.getLayoutParams();
            int i14 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i10;
            int i15 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i11;
            int max = Math.max(0, i14);
            int max2 = Math.max(0, i15);
            int max3 = Math.max(0, -i14);
            int max4 = Math.max(0, -i15);
            i13 += max + view.getMeasuredWidth() + max2;
            i12++;
            i11 = max4;
            i10 = max3;
        }
        return i13;
    }

    private boolean z(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f1395a;
        return actionMenuView != null && actionMenuView.I();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f1395a;
        return actionMenuView != null && actionMenuView.J();
    }

    void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).f1429b != 2 && childAt != this.f1395a) {
                removeViewAt(childCount);
                this.E.add(childAt);
            }
        }
    }

    public void J(int i10, int i11) {
        h();
        this.f1414t.g(i10, i11);
    }

    public void K(androidx.appcompat.view.menu.e eVar, androidx.appcompat.widget.c cVar) {
        if (eVar == null && this.f1395a == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e N = this.f1395a.N();
        if (N == eVar) {
            return;
        }
        if (N != null) {
            N.O(this.L);
            N.O(this.M);
        }
        if (this.M == null) {
            this.M = new d();
        }
        cVar.G(true);
        if (eVar != null) {
            eVar.c(cVar, this.f1404j);
            eVar.c(this.M, this.f1404j);
        } else {
            cVar.i(this.f1404j, null);
            this.M.i(this.f1404j, null);
            cVar.f(true);
            this.M.f(true);
        }
        this.f1395a.setPopupTheme(this.f1405k);
        this.f1395a.setPresenter(cVar);
        this.L = cVar;
    }

    public void L(j.a aVar, e.a aVar2) {
        this.N = aVar;
        this.O = aVar2;
        ActionMenuView actionMenuView = this.f1395a;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void M(Context context, int i10) {
        this.f1407m = i10;
        TextView textView = this.f1397c;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void N(Context context, int i10) {
        this.f1406l = i10;
        TextView textView = this.f1396b;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public boolean Q() {
        ActionMenuView actionMenuView = this.f1395a;
        return actionMenuView != null && actionMenuView.P();
    }

    void a() {
        for (int size = this.E.size() - 1; size >= 0; size--) {
            addView(this.E.get(size));
        }
        this.E.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1395a) != null && actionMenuView.K();
    }

    public void e() {
        d dVar = this.M;
        androidx.appcompat.view.menu.g gVar = dVar == null ? null : dVar.f1427b;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f1395a;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    void g() {
        if (this.f1402h == null) {
            p pVar = new p(getContext(), null, e.a.M);
            this.f1402h = pVar;
            pVar.setImageDrawable(this.f1400f);
            this.f1402h.setContentDescription(this.f1401g);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f878a = 8388611 | (this.f1408n & 112);
            generateDefaultLayoutParams.f1429b = 2;
            this.f1402h.setLayoutParams(generateDefaultLayoutParams);
            this.f1402h.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1402h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1402h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        r0 r0Var = this.f1414t;
        if (r0Var != null) {
            return r0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f1416v;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        r0 r0Var = this.f1414t;
        if (r0Var != null) {
            return r0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        r0 r0Var = this.f1414t;
        if (r0Var != null) {
            return r0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        r0 r0Var = this.f1414t;
        if (r0Var != null) {
            return r0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f1415u;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e N;
        ActionMenuView actionMenuView = this.f1395a;
        if ((actionMenuView == null || (N = actionMenuView.N()) == null || !N.hasVisibleItems()) ? false : true) {
            return Math.max(getContentInsetEnd(), Math.max(this.f1416v, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (androidx.core.view.a0.E(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (androidx.core.view.a0.E(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f1415u, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1399e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1399e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f1395a.getMenu();
    }

    View getNavButtonView() {
        return this.f1398d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1398d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1398d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.L;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f1395a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f1404j;
    }

    public int getPopupTheme() {
        return this.f1405k;
    }

    public CharSequence getSubtitle() {
        return this.f1419y;
    }

    final TextView getSubtitleTextView() {
        return this.f1397c;
    }

    public CharSequence getTitle() {
        return this.f1418x;
    }

    public int getTitleMarginBottom() {
        return this.f1413s;
    }

    public int getTitleMarginEnd() {
        return this.f1411q;
    }

    public int getTitleMarginStart() {
        return this.f1410p;
    }

    public int getTitleMarginTop() {
        return this.f1412r;
    }

    final TextView getTitleTextView() {
        return this.f1396b;
    }

    public g0 getWrapper() {
        if (this.K == null) {
            this.K = new b1(this, true);
        }
        return this.K;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof a.C0018a) {
            return new e((a.C0018a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.Q);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:105:0x029f A[LOOP:0: B:104:0x029d->B:105:0x029f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c1 A[LOOP:1: B:107:0x02bf->B:108:0x02c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02fa A[LOOP:2: B:116:0x02f8->B:117:0x02fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = this.F;
        boolean b10 = g1.b(this);
        int i19 = !b10 ? 1 : 0;
        if (P(this.f1398d)) {
            F(this.f1398d, i10, 0, i11, 0, this.f1409o);
            i12 = this.f1398d.getMeasuredWidth() + s(this.f1398d);
            i13 = Math.max(0, this.f1398d.getMeasuredHeight() + t(this.f1398d));
            i14 = View.combineMeasuredStates(0, this.f1398d.getMeasuredState());
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        if (P(this.f1402h)) {
            F(this.f1402h, i10, 0, i11, 0, this.f1409o);
            i12 = this.f1402h.getMeasuredWidth() + s(this.f1402h);
            i13 = Math.max(i13, this.f1402h.getMeasuredHeight() + t(this.f1402h));
            i14 = View.combineMeasuredStates(i14, this.f1402h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i12);
        iArr[b10 ? 1 : 0] = Math.max(0, currentContentInsetStart - i12);
        if (P(this.f1395a)) {
            F(this.f1395a, i10, max, i11, 0, this.f1409o);
            i15 = this.f1395a.getMeasuredWidth() + s(this.f1395a);
            i13 = Math.max(i13, this.f1395a.getMeasuredHeight() + t(this.f1395a));
            i14 = View.combineMeasuredStates(i14, this.f1395a.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i15);
        iArr[i19] = Math.max(0, currentContentInsetEnd - i15);
        if (P(this.f1403i)) {
            max2 += E(this.f1403i, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f1403i.getMeasuredHeight() + t(this.f1403i));
            i14 = View.combineMeasuredStates(i14, this.f1403i.getMeasuredState());
        }
        if (P(this.f1399e)) {
            max2 += E(this.f1399e, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f1399e.getMeasuredHeight() + t(this.f1399e));
            i14 = View.combineMeasuredStates(i14, this.f1399e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (((e) childAt.getLayoutParams()).f1429b == 0 && P(childAt)) {
                max2 += E(childAt, i10, max2, i11, 0, iArr);
                i13 = Math.max(i13, childAt.getMeasuredHeight() + t(childAt));
                i14 = View.combineMeasuredStates(i14, childAt.getMeasuredState());
            }
        }
        int i21 = this.f1412r + this.f1413s;
        int i22 = this.f1410p + this.f1411q;
        if (P(this.f1396b)) {
            E(this.f1396b, i10, max2 + i22, i11, i21, iArr);
            int measuredWidth = this.f1396b.getMeasuredWidth() + s(this.f1396b);
            i16 = this.f1396b.getMeasuredHeight() + t(this.f1396b);
            i17 = View.combineMeasuredStates(i14, this.f1396b.getMeasuredState());
            i18 = measuredWidth;
        } else {
            i16 = 0;
            i17 = i14;
            i18 = 0;
        }
        if (P(this.f1397c)) {
            i18 = Math.max(i18, E(this.f1397c, i10, max2 + i22, i11, i16 + i21, iArr));
            i16 += this.f1397c.getMeasuredHeight() + t(this.f1397c);
            i17 = View.combineMeasuredStates(i17, this.f1397c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i18 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & i17), O() ? 0 : View.resolveSizeAndState(Math.max(Math.max(i13, i16) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, i17 << 16));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        ActionMenuView actionMenuView = this.f1395a;
        androidx.appcompat.view.menu.e N = actionMenuView != null ? actionMenuView.N() : null;
        int i10 = savedState.f1421c;
        if (i10 != 0 && this.M != null && N != null && (findItem = N.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f1422d) {
            H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i10);
        }
        h();
        this.f1414t.f(i10 == 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        d dVar = this.M;
        if (dVar != null && (gVar = dVar.f1427b) != null) {
            savedState.f1421c = gVar.getItemId();
        }
        savedState.f1422d = B();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(f.a.b(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.P = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = RecyclerView.UNDEFINED_DURATION;
        }
        if (i10 != this.f1416v) {
            this.f1416v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = RecyclerView.UNDEFINED_DURATION;
        }
        if (i10 != this.f1415u) {
            this.f1415u = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(f.a.b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(f.a.b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f1398d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.I = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f1395a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f1405k != i10) {
            this.f1405k = i10;
            if (i10 == 0) {
                this.f1404j = getContext();
            } else {
                this.f1404j = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f1413s = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f1411q = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f1410p = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f1412r = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public boolean v() {
        d dVar = this.M;
        return (dVar == null || dVar.f1427b == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f1395a;
        return actionMenuView != null && actionMenuView.H();
    }

    public void x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void y() {
        Iterator<MenuItem> it = this.H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        G();
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class e extends a.C0018a {

        /* renamed from: b  reason: collision with root package name */
        int f1429b;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1429b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(int i10, int i11) {
            super(i10, i11);
            this.f1429b = 0;
            this.f878a = 8388627;
        }

        public e(e eVar) {
            super((a.C0018a) eVar);
            this.f1429b = 0;
            this.f1429b = eVar.f1429b;
        }

        public e(a.C0018a c0018a) {
            super(c0018a);
            this.f1429b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1429b = 0;
            a(marginLayoutParams);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1429b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1417w = 8388627;
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.F = new int[2];
        this.G = new androidx.core.view.k(new Runnable() { // from class: androidx.appcompat.widget.a1
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.y();
            }
        });
        this.H = new ArrayList<>();
        this.J = new a();
        this.Q = new b();
        Context context2 = getContext();
        int[] iArr = e.j.R2;
        z0 v10 = z0.v(context2, attributeSet, iArr, i10, 0);
        androidx.core.view.a0.o0(this, context, iArr, attributeSet, v10.r(), i10, 0);
        this.f1406l = v10.n(e.j.f24777t3, 0);
        this.f1407m = v10.n(e.j.f24732k3, 0);
        this.f1417w = v10.l(e.j.S2, this.f1417w);
        this.f1408n = v10.l(e.j.T2, 48);
        int e8 = v10.e(e.j.f24747n3, 0);
        int i11 = e.j.f24772s3;
        e8 = v10.s(i11) ? v10.e(i11, e8) : e8;
        this.f1413s = e8;
        this.f1412r = e8;
        this.f1411q = e8;
        this.f1410p = e8;
        int e10 = v10.e(e.j.f24762q3, -1);
        if (e10 >= 0) {
            this.f1410p = e10;
        }
        int e11 = v10.e(e.j.f24757p3, -1);
        if (e11 >= 0) {
            this.f1411q = e11;
        }
        int e12 = v10.e(e.j.f24767r3, -1);
        if (e12 >= 0) {
            this.f1412r = e12;
        }
        int e13 = v10.e(e.j.f24752o3, -1);
        if (e13 >= 0) {
            this.f1413s = e13;
        }
        this.f1409o = v10.f(e.j.f24702e3, -1);
        int e14 = v10.e(e.j.f24682a3, RecyclerView.UNDEFINED_DURATION);
        int e15 = v10.e(e.j.W2, RecyclerView.UNDEFINED_DURATION);
        int f10 = v10.f(e.j.Y2, 0);
        int f11 = v10.f(e.j.Z2, 0);
        h();
        this.f1414t.e(f10, f11);
        if (e14 != Integer.MIN_VALUE || e15 != Integer.MIN_VALUE) {
            this.f1414t.g(e14, e15);
        }
        this.f1415u = v10.e(e.j.f24687b3, RecyclerView.UNDEFINED_DURATION);
        this.f1416v = v10.e(e.j.X2, RecyclerView.UNDEFINED_DURATION);
        this.f1400f = v10.g(e.j.V2);
        this.f1401g = v10.p(e.j.U2);
        CharSequence p10 = v10.p(e.j.f24742m3);
        if (!TextUtils.isEmpty(p10)) {
            setTitle(p10);
        }
        CharSequence p11 = v10.p(e.j.f24727j3);
        if (!TextUtils.isEmpty(p11)) {
            setSubtitle(p11);
        }
        this.f1404j = getContext();
        setPopupTheme(v10.n(e.j.f24722i3, 0));
        Drawable g10 = v10.g(e.j.f24717h3);
        if (g10 != null) {
            setNavigationIcon(g10);
        }
        CharSequence p12 = v10.p(e.j.f24712g3);
        if (!TextUtils.isEmpty(p12)) {
            setNavigationContentDescription(p12);
        }
        Drawable g11 = v10.g(e.j.f24692c3);
        if (g11 != null) {
            setLogo(g11);
        }
        CharSequence p13 = v10.p(e.j.f24697d3);
        if (!TextUtils.isEmpty(p13)) {
            setLogoDescription(p13);
        }
        int i12 = e.j.f24782u3;
        if (v10.s(i12)) {
            setTitleTextColor(v10.c(i12));
        }
        int i13 = e.j.f24737l3;
        if (v10.s(i13)) {
            setSubtitleTextColor(v10.c(i13));
        }
        int i14 = e.j.f24707f3;
        if (v10.s(i14)) {
            x(v10.n(i14, 0));
        }
        v10.w();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f1402h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f1402h.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f1402h;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f1400f);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.f1399e)) {
                c(this.f1399e, true);
            }
        } else {
            ImageView imageView = this.f1399e;
            if (imageView != null && z(imageView)) {
                removeView(this.f1399e);
                this.E.remove(this.f1399e);
            }
        }
        ImageView imageView2 = this.f1399e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f1399e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f1398d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            c1.a(this.f1398d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.f1398d)) {
                c(this.f1398d, true);
            }
        } else {
            ImageButton imageButton = this.f1398d;
            if (imageButton != null && z(imageButton)) {
                removeView(this.f1398d);
                this.E.remove(this.f1398d);
            }
        }
        ImageButton imageButton2 = this.f1398d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1397c == null) {
                Context context = getContext();
                c0 c0Var = new c0(context);
                this.f1397c = c0Var;
                c0Var.setSingleLine();
                this.f1397c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1407m;
                if (i10 != 0) {
                    this.f1397c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f1397c.setTextColor(colorStateList);
                }
            }
            if (!z(this.f1397c)) {
                c(this.f1397c, true);
            }
        } else {
            TextView textView = this.f1397c;
            if (textView != null && z(textView)) {
                removeView(this.f1397c);
                this.E.remove(this.f1397c);
            }
        }
        TextView textView2 = this.f1397c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1419y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f1397c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1396b == null) {
                Context context = getContext();
                c0 c0Var = new c0(context);
                this.f1396b = c0Var;
                c0Var.setSingleLine();
                this.f1396b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1406l;
                if (i10 != 0) {
                    this.f1396b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f1420z;
                if (colorStateList != null) {
                    this.f1396b.setTextColor(colorStateList);
                }
            }
            if (!z(this.f1396b)) {
                c(this.f1396b, true);
            }
        } else {
            TextView textView = this.f1396b;
            if (textView != null && z(textView)) {
                removeView(this.f1396b);
                this.E.remove(this.f1396b);
            }
        }
        TextView textView2 = this.f1396b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1418x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1420z = colorStateList;
        TextView textView = this.f1396b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        int f1421c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1422d;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1421c = parcel.readInt();
            this.f1422d = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1421c);
            parcel.writeInt(this.f1422d ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}

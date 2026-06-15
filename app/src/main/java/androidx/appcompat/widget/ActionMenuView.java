package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.l0;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ActionMenuView extends l0 implements e.b, androidx.appcompat.view.menu.k {
    e A;

    /* renamed from: p  reason: collision with root package name */
    private androidx.appcompat.view.menu.e f1286p;

    /* renamed from: q  reason: collision with root package name */
    private Context f1287q;

    /* renamed from: r  reason: collision with root package name */
    private int f1288r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f1289s;

    /* renamed from: t  reason: collision with root package name */
    private androidx.appcompat.widget.c f1290t;

    /* renamed from: u  reason: collision with root package name */
    private j.a f1291u;

    /* renamed from: v  reason: collision with root package name */
    e.a f1292v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1293w;

    /* renamed from: x  reason: collision with root package name */
    private int f1294x;

    /* renamed from: y  reason: collision with root package name */
    private int f1295y;

    /* renamed from: z  reason: collision with root package name */
    private int f1296z;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        boolean a();

        boolean b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b implements j.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c extends l0.a {
        @ViewDebug.ExportedProperty

        /* renamed from: a  reason: collision with root package name */
        public boolean f1297a;
        @ViewDebug.ExportedProperty

        /* renamed from: b  reason: collision with root package name */
        public int f1298b;
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public int f1299c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public boolean f1300d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public boolean f1301e;

        /* renamed from: f  reason: collision with root package name */
        boolean f1302f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f1297a = cVar.f1297a;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f1297a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.A;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.f1292v;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int L(View view, int i10, int i11, int i12, int i13) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) - i13, View.MeasureSpec.getMode(i12));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z10 = true;
        boolean z11 = actionMenuItemView != null && actionMenuItemView.f();
        int i14 = 2;
        if (i11 <= 0 || (z11 && i11 < 2)) {
            i14 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, RecyclerView.UNDEFINED_DURATION), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i15 = measuredWidth / i10;
            if (measuredWidth % i10 != 0) {
                i15++;
            }
            if (!z11 || i15 >= 2) {
                i14 = i15;
            }
        }
        if (cVar.f1297a || !z11) {
            z10 = false;
        }
        cVar.f1300d = z10;
        cVar.f1298b = i14;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, 1073741824), makeMeasureSpec);
        return i14;
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    private void M(int i10, int i11) {
        int i12;
        int i13;
        boolean z10;
        int i14;
        int i15;
        boolean z11;
        boolean z12;
        int i16;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
        int i17 = size - paddingLeft;
        int i18 = this.f1295y;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = i18 + (i20 / i19);
        int childCount = getChildCount();
        int i22 = 0;
        int i23 = 0;
        boolean z13 = false;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        long j10 = 0;
        while (i23 < childCount) {
            View childAt = getChildAt(i23);
            int i27 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z14 = childAt instanceof ActionMenuItemView;
                int i28 = i24 + 1;
                if (z14) {
                    int i29 = this.f1296z;
                    i16 = i28;
                    r14 = 0;
                    childAt.setPadding(i29, 0, i29, 0);
                } else {
                    i16 = i28;
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f1302f = r14;
                cVar.f1299c = r14;
                cVar.f1298b = r14;
                cVar.f1300d = r14;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r14;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r14;
                cVar.f1301e = z14 && ((ActionMenuItemView) childAt).f();
                int L = L(childAt, i21, cVar.f1297a ? 1 : i19, childMeasureSpec, paddingTop);
                i25 = Math.max(i25, L);
                if (cVar.f1300d) {
                    i26++;
                }
                if (cVar.f1297a) {
                    z13 = true;
                }
                i19 -= L;
                i22 = Math.max(i22, childAt.getMeasuredHeight());
                if (L == 1) {
                    j10 |= 1 << i23;
                    i22 = i22;
                }
                i24 = i16;
            }
            i23++;
            size2 = i27;
        }
        int i30 = size2;
        boolean z15 = z13 && i24 == 2;
        boolean z16 = false;
        while (i26 > 0 && i19 > 0) {
            int i31 = Integer.MAX_VALUE;
            int i32 = 0;
            int i33 = 0;
            long j11 = 0;
            while (i33 < childCount) {
                boolean z17 = z16;
                c cVar2 = (c) getChildAt(i33).getLayoutParams();
                int i34 = i22;
                if (cVar2.f1300d) {
                    int i35 = cVar2.f1298b;
                    if (i35 < i31) {
                        j11 = 1 << i33;
                        i31 = i35;
                        i32 = 1;
                    } else if (i35 == i31) {
                        i32++;
                        j11 |= 1 << i33;
                    }
                }
                i33++;
                i22 = i34;
                z16 = z17;
            }
            z10 = z16;
            i14 = i22;
            j10 |= j11;
            if (i32 > i19) {
                i12 = mode;
                i13 = i17;
                break;
            }
            int i36 = i31 + 1;
            int i37 = 0;
            while (i37 < childCount) {
                View childAt2 = getChildAt(i37);
                c cVar3 = (c) childAt2.getLayoutParams();
                int i38 = i17;
                int i39 = mode;
                long j12 = 1 << i37;
                if ((j11 & j12) == 0) {
                    if (cVar3.f1298b == i36) {
                        j10 |= j12;
                    }
                    z12 = z15;
                } else {
                    if (z15 && cVar3.f1301e && i19 == 1) {
                        int i40 = this.f1296z;
                        z12 = z15;
                        childAt2.setPadding(i40 + i21, 0, i40, 0);
                    } else {
                        z12 = z15;
                    }
                    cVar3.f1298b++;
                    cVar3.f1302f = true;
                    i19--;
                }
                i37++;
                mode = i39;
                i17 = i38;
                z15 = z12;
            }
            i22 = i14;
            z16 = true;
        }
        i12 = mode;
        i13 = i17;
        z10 = z16;
        i14 = i22;
        boolean z18 = !z13 && i24 == 1;
        if (i19 <= 0 || j10 == 0 || (i19 >= i24 - 1 && !z18 && i25 <= 1)) {
            i15 = 0;
            z11 = z10;
        } else {
            float bitCount = Long.bitCount(j10);
            if (z18) {
                i15 = 0;
            } else {
                i15 = 0;
                if ((j10 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f1301e) {
                    bitCount -= 0.5f;
                }
                int i41 = childCount - 1;
                if ((j10 & (1 << i41)) != 0 && !((c) getChildAt(i41).getLayoutParams()).f1301e) {
                    bitCount -= 0.5f;
                }
            }
            int i42 = bitCount > 0.0f ? (int) ((i19 * i21) / bitCount) : i15;
            z11 = z10;
            for (int i43 = i15; i43 < childCount; i43++) {
                if ((j10 & (1 << i43)) != 0) {
                    View childAt3 = getChildAt(i43);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f1299c = i42;
                        cVar4.f1302f = true;
                        if (i43 == 0 && !cVar4.f1301e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i42) / 2;
                        }
                        z11 = true;
                    } else if (cVar4.f1297a) {
                        cVar4.f1299c = i42;
                        cVar4.f1302f = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i42) / 2;
                        z11 = true;
                    } else {
                        if (i43 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i42 / 2;
                        }
                        if (i43 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i42 / 2;
                        }
                    }
                }
            }
        }
        if (z11) {
            for (int i44 = i15; i44 < childCount; i44++) {
                View childAt4 = getChildAt(i44);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f1302f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f1298b * i21) + cVar5.f1299c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i13, i12 != 1073741824 ? i14 : i30);
    }

    public void B() {
        androidx.appcompat.widget.c cVar = this.f1290t;
        if (cVar != null) {
            cVar.y();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.l0
    /* renamed from: C */
    public c m() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.l0
    /* renamed from: D */
    public c n(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.l0
    /* renamed from: E */
    public c o(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams != null) {
            if (layoutParams instanceof c) {
                cVar = new c((c) layoutParams);
            } else {
                cVar = new c(layoutParams);
            }
            if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
                ((LinearLayout.LayoutParams) cVar).gravity = 16;
            }
            return cVar;
        }
        return m();
    }

    public c F() {
        c m7 = m();
        m7.f1297a = true;
        return m7;
    }

    protected boolean G(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        View childAt = getChildAt(i10 - 1);
        View childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            z10 = false | ((a) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? z10 : z10 | ((a) childAt2).b();
    }

    public boolean H() {
        androidx.appcompat.widget.c cVar = this.f1290t;
        return cVar != null && cVar.B();
    }

    public boolean I() {
        androidx.appcompat.widget.c cVar = this.f1290t;
        return cVar != null && cVar.D();
    }

    public boolean J() {
        androidx.appcompat.widget.c cVar = this.f1290t;
        return cVar != null && cVar.E();
    }

    public boolean K() {
        return this.f1289s;
    }

    public androidx.appcompat.view.menu.e N() {
        return this.f1286p;
    }

    public void O(j.a aVar, e.a aVar2) {
        this.f1291u = aVar;
        this.f1292v = aVar2;
    }

    public boolean P() {
        androidx.appcompat.widget.c cVar = this.f1290t;
        return cVar != null && cVar.K();
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(androidx.appcompat.view.menu.e eVar) {
        this.f1286p = eVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.l0, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean d(androidx.appcompat.view.menu.g gVar) {
        return this.f1286p.L(gVar, 0);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f1286p == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f1286p = eVar;
            eVar.R(new d());
            androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(context);
            this.f1290t = cVar;
            cVar.J(true);
            androidx.appcompat.widget.c cVar2 = this.f1290t;
            j.a aVar = this.f1291u;
            if (aVar == null) {
                aVar = new b();
            }
            cVar2.d(aVar);
            this.f1286p.c(this.f1290t, this.f1287q);
            this.f1290t.H(this);
        }
        return this.f1286p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1290t.A();
    }

    public int getPopupTheme() {
        return this.f1288r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.c cVar = this.f1290t;
        if (cVar != null) {
            cVar.f(false);
            if (this.f1290t.E()) {
                this.f1290t.B();
                this.f1290t.K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.l0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int i14;
        if (!this.f1293w) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i15 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i16 = i12 - i10;
        int paddingRight = (i16 - getPaddingRight()) - getPaddingLeft();
        boolean b10 = g1.b(this);
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f1297a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i19)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b10) {
                        i14 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = i14 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i14 = width - measuredWidth;
                    }
                    int i20 = i15 - (measuredHeight / 2);
                    childAt.layout(i14, i20, width, measuredHeight + i20);
                    paddingRight -= measuredWidth;
                    i17 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    G(i19);
                    i18++;
                }
            }
        }
        if (childCount == 1 && i17 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i21 = (i16 / 2) - (measuredWidth2 / 2);
            int i22 = i15 - (measuredHeight2 / 2);
            childAt2.layout(i21, i22, measuredWidth2 + i21, measuredHeight2 + i22);
            return;
        }
        int i23 = i18 - (i17 ^ 1);
        int max = Math.max(0, i23 > 0 ? paddingRight / i23 : 0);
        if (b10) {
            int width2 = getWidth() - getPaddingRight();
            for (int i24 = 0; i24 < childCount; i24++) {
                View childAt3 = getChildAt(i24);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1297a) {
                    int i25 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i26 = i15 - (measuredHeight3 / 2);
                    childAt3.layout(i25 - measuredWidth3, i26, i25, measuredHeight3 + i26);
                    width2 = i25 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt4 = getChildAt(i27);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f1297a) {
                int i28 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i29 = i15 - (measuredHeight4 / 2);
                childAt4.layout(i28, i29, i28 + measuredWidth4, measuredHeight4 + i29);
                paddingLeft = i28 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.l0, android.view.View
    public void onMeasure(int i10, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z10 = this.f1293w;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f1293w = z11;
        if (z10 != z11) {
            this.f1294x = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f1293w && (eVar = this.f1286p) != null && size != this.f1294x) {
            this.f1294x = size;
            eVar.K(true);
        }
        int childCount = getChildCount();
        if (this.f1293w && childCount > 0) {
            M(i10, i11);
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            c cVar = (c) getChildAt(i12).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f1290t.G(z10);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1290t.I(drawable);
    }

    public void setOverflowReserved(boolean z10) {
        this.f1289s = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f1288r != i10) {
            this.f1288r = i10;
            if (i10 == 0) {
                this.f1287q = getContext();
            } else {
                this.f1287q = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.c cVar) {
        this.f1290t = cVar;
        cVar.H(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f1295y = (int) (56.0f * f10);
        this.f1296z = (int) (f10 * 4.0f);
        this.f1287q = context;
        this.f1288r = 0;
    }
}

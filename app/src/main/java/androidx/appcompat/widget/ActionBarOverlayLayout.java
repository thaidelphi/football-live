package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
import androidx.core.view.l0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
@SuppressLint({"UnknownNullness"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements f0, androidx.core.view.s, androidx.core.view.q, androidx.core.view.r {
    static final int[] F = {e.a.f24541b, 16842841};
    ViewPropertyAnimator A;
    final AnimatorListenerAdapter B;
    private final Runnable C;
    private final Runnable D;
    private final androidx.core.view.t E;

    /* renamed from: a  reason: collision with root package name */
    private int f1257a;

    /* renamed from: b  reason: collision with root package name */
    private int f1258b;

    /* renamed from: c  reason: collision with root package name */
    private ContentFrameLayout f1259c;

    /* renamed from: d  reason: collision with root package name */
    ActionBarContainer f1260d;

    /* renamed from: e  reason: collision with root package name */
    private g0 f1261e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f1262f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1263g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1264h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1265i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f1266j;

    /* renamed from: k  reason: collision with root package name */
    boolean f1267k;

    /* renamed from: l  reason: collision with root package name */
    private int f1268l;

    /* renamed from: m  reason: collision with root package name */
    private int f1269m;

    /* renamed from: n  reason: collision with root package name */
    private final Rect f1270n;

    /* renamed from: o  reason: collision with root package name */
    private final Rect f1271o;

    /* renamed from: p  reason: collision with root package name */
    private final Rect f1272p;

    /* renamed from: q  reason: collision with root package name */
    private final Rect f1273q;

    /* renamed from: r  reason: collision with root package name */
    private final Rect f1274r;

    /* renamed from: s  reason: collision with root package name */
    private final Rect f1275s;

    /* renamed from: t  reason: collision with root package name */
    private final Rect f1276t;

    /* renamed from: u  reason: collision with root package name */
    private androidx.core.view.l0 f1277u;

    /* renamed from: v  reason: collision with root package name */
    private androidx.core.view.l0 f1278v;

    /* renamed from: w  reason: collision with root package name */
    private androidx.core.view.l0 f1279w;

    /* renamed from: x  reason: collision with root package name */
    private androidx.core.view.l0 f1280x;

    /* renamed from: y  reason: collision with root package name */
    private d f1281y;

    /* renamed from: z  reason: collision with root package name */
    private OverScroller f1282z;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.f1267k = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.f1267k = false;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.f1260d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.f1260d.animate().translationY(-ActionBarOverlayLayout.this.f1260d.getHeight()).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface d {
        void a();

        void b();

        void c(boolean z10);

        void d();

        void e();

        void onWindowVisibilityChanged(int i10);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1258b = 0;
        this.f1270n = new Rect();
        this.f1271o = new Rect();
        this.f1272p = new Rect();
        this.f1273q = new Rect();
        this.f1274r = new Rect();
        this.f1275s = new Rect();
        this.f1276t = new Rect();
        androidx.core.view.l0 l0Var = androidx.core.view.l0.f2908b;
        this.f1277u = l0Var;
        this.f1278v = l0Var;
        this.f1279w = l0Var;
        this.f1280x = l0Var;
        this.B = new a();
        this.C = new b();
        this.D = new c();
        v(context);
        this.E = new androidx.core.view.t(this);
    }

    private void A() {
        u();
        this.C.run();
    }

    private boolean B(float f10) {
        this.f1282z.fling(0, 0, 0, (int) f10, 0, 0, RecyclerView.UNDEFINED_DURATION, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        return this.f1282z.getFinalY() > this.f1260d.getHeight();
    }

    private void p() {
        u();
        this.D.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    private g0 t(View view) {
        if (view instanceof g0) {
            return (g0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(F);
        this.f1257a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1262f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1263g = context.getApplicationInfo().targetSdkVersion < 19;
        this.f1282z = new OverScroller(context);
    }

    private void x() {
        u();
        postDelayed(this.D, 600L);
    }

    private void y() {
        u();
        postDelayed(this.C, 600L);
    }

    @Override // androidx.appcompat.widget.f0
    public boolean a() {
        z();
        return this.f1261e.a();
    }

    @Override // androidx.appcompat.widget.f0
    public boolean b() {
        z();
        return this.f1261e.b();
    }

    @Override // androidx.appcompat.widget.f0
    public boolean c() {
        z();
        return this.f1261e.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.f0
    public void d(Menu menu, j.a aVar) {
        z();
        this.f1261e.d(menu, aVar);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1262f == null || this.f1263g) {
            return;
        }
        int bottom = this.f1260d.getVisibility() == 0 ? (int) (this.f1260d.getBottom() + this.f1260d.getTranslationY() + 0.5f) : 0;
        this.f1262f.setBounds(0, bottom, getWidth(), this.f1262f.getIntrinsicHeight() + bottom);
        this.f1262f.draw(canvas);
    }

    @Override // androidx.appcompat.widget.f0
    public boolean e() {
        z();
        return this.f1261e.e();
    }

    @Override // androidx.appcompat.widget.f0
    public void f() {
        z();
        this.f1261e.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        z();
        boolean q10 = q(this.f1260d, rect, true, true, false, true);
        this.f1273q.set(rect);
        g1.a(this, this.f1273q, this.f1270n);
        if (!this.f1274r.equals(this.f1273q)) {
            this.f1274r.set(this.f1273q);
            q10 = true;
        }
        if (!this.f1271o.equals(this.f1270n)) {
            this.f1271o.set(this.f1270n);
            q10 = true;
        }
        if (q10) {
            requestLayout();
        }
        return true;
    }

    @Override // androidx.appcompat.widget.f0
    public boolean g() {
        z();
        return this.f1261e.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1260d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.E.a();
    }

    public CharSequence getTitle() {
        z();
        return this.f1261e.getTitle();
    }

    @Override // androidx.appcompat.widget.f0
    public void h(int i10) {
        z();
        if (i10 == 2) {
            this.f1261e.o();
        } else if (i10 == 5) {
            this.f1261e.w();
        } else if (i10 != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // androidx.core.view.q
    public void i(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // androidx.core.view.q
    public void j(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.q
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // androidx.appcompat.widget.f0
    public void l() {
        z();
        this.f1261e.q();
    }

    @Override // androidx.core.view.r
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(view, i10, i11, i12, i13, i14);
    }

    @Override // androidx.core.view.q
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // androidx.core.view.q
    public boolean o(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        z();
        androidx.core.view.l0 v10 = androidx.core.view.l0.v(windowInsets, this);
        boolean q10 = q(this.f1260d, new Rect(v10.i(), v10.k(), v10.j(), v10.h()), true, true, false, true);
        androidx.core.view.a0.h(this, v10, this.f1270n);
        Rect rect = this.f1270n;
        androidx.core.view.l0 l10 = v10.l(rect.left, rect.top, rect.right, rect.bottom);
        this.f1277u = l10;
        boolean z10 = true;
        if (!this.f1278v.equals(l10)) {
            this.f1278v = this.f1277u;
            q10 = true;
        }
        if (this.f1271o.equals(this.f1270n)) {
            z10 = q10;
        } else {
            this.f1271o.set(this.f1270n);
        }
        if (z10) {
            requestLayout();
        }
        return v10.a().c().b().t();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        androidx.core.view.a0.n0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredHeight;
        z();
        measureChildWithMargins(this.f1260d, i10, 0, i11, 0);
        e eVar = (e) this.f1260d.getLayoutParams();
        int max = Math.max(0, this.f1260d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f1260d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1260d.getMeasuredState());
        boolean z10 = (androidx.core.view.a0.N(this) & 256) != 0;
        if (z10) {
            measuredHeight = this.f1257a;
            if (this.f1265i && this.f1260d.getTabContainer() != null) {
                measuredHeight += this.f1257a;
            }
        } else {
            measuredHeight = this.f1260d.getVisibility() != 8 ? this.f1260d.getMeasuredHeight() : 0;
        }
        this.f1272p.set(this.f1270n);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 21) {
            this.f1279w = this.f1277u;
        } else {
            this.f1275s.set(this.f1273q);
        }
        if (!this.f1264h && !z10) {
            Rect rect = this.f1272p;
            rect.top += measuredHeight;
            rect.bottom += 0;
            if (i12 >= 21) {
                this.f1279w = this.f1279w.l(0, measuredHeight, 0, 0);
            }
        } else if (i12 >= 21) {
            this.f1279w = new l0.b(this.f1279w).c(androidx.core.graphics.b.b(this.f1279w.i(), this.f1279w.k() + measuredHeight, this.f1279w.j(), this.f1279w.h() + 0)).a();
        } else {
            Rect rect2 = this.f1275s;
            rect2.top += measuredHeight;
            rect2.bottom += 0;
        }
        q(this.f1259c, this.f1272p, true, true, true, true);
        if (i12 >= 21 && !this.f1280x.equals(this.f1279w)) {
            androidx.core.view.l0 l0Var = this.f1279w;
            this.f1280x = l0Var;
            androidx.core.view.a0.i(this.f1259c, l0Var);
        } else if (i12 < 21 && !this.f1276t.equals(this.f1275s)) {
            this.f1276t.set(this.f1275s);
            this.f1259c.a(this.f1275s);
        }
        measureChildWithMargins(this.f1259c, i10, 0, i11, 0);
        e eVar2 = (e) this.f1259c.getLayoutParams();
        int max3 = Math.max(max, this.f1259c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f1259c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1259c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (this.f1266j && z10) {
            if (B(f11)) {
                p();
            } else {
                A();
            }
            this.f1267k = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f1268l + i11;
        this.f1268l = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.E.b(view, view2, i10);
        this.f1268l = getActionBarHideOffset();
        u();
        d dVar = this.f1281y;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f1260d.getVisibility() != 0) {
            return false;
        }
        return this.f1266j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onStopNestedScroll(View view) {
        if (this.f1266j && !this.f1267k) {
            if (this.f1268l <= this.f1260d.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.f1281y;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i10) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i10);
        }
        z();
        int i11 = this.f1269m ^ i10;
        this.f1269m = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        d dVar = this.f1281y;
        if (dVar != null) {
            dVar.c(!z11);
            if (!z10 && z11) {
                this.f1281y.d();
            } else {
                this.f1281y.a();
            }
        }
        if ((i11 & 256) == 0 || this.f1281y == null) {
            return;
        }
        androidx.core.view.a0.n0(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f1258b = i10;
        d dVar = this.f1281y;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: r */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: s */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i10) {
        u();
        this.f1260d.setTranslationY(-Math.max(0, Math.min(i10, this.f1260d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f1281y = dVar;
        if (getWindowToken() != null) {
            this.f1281y.onWindowVisibilityChanged(this.f1258b);
            int i10 = this.f1269m;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                androidx.core.view.a0.n0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f1265i = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f1266j) {
            this.f1266j = z10;
            if (z10) {
                return;
            }
            u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        z();
        this.f1261e.setIcon(i10);
    }

    public void setLogo(int i10) {
        z();
        this.f1261e.s(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f1264h = z10;
        this.f1263g = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // androidx.appcompat.widget.f0
    public void setWindowCallback(Window.Callback callback) {
        z();
        this.f1261e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.f0
    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.f1261e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    void u() {
        removeCallbacks(this.C);
        removeCallbacks(this.D);
        ViewPropertyAnimator viewPropertyAnimator = this.A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean w() {
        return this.f1264h;
    }

    void z() {
        if (this.f1259c == null) {
            this.f1259c = (ContentFrameLayout) findViewById(e.f.f24617b);
            this.f1260d = (ActionBarContainer) findViewById(e.f.f24618c);
            this.f1261e = t(findViewById(e.f.f24616a));
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.f1261e.setIcon(drawable);
    }
}

package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.a0;
import androidx.core.view.accessibility.c;
import androidx.core.view.p;
import androidx.core.view.r;
import androidx.core.view.t;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class NestedScrollView extends FrameLayout implements r, androidx.core.view.o {
    private static final float B = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final a C = new a();
    private static final int[] D = {16843130};
    private c A;

    /* renamed from: a  reason: collision with root package name */
    private final float f2959a;

    /* renamed from: b  reason: collision with root package name */
    private long f2960b;

    /* renamed from: c  reason: collision with root package name */
    private final Rect f2961c;

    /* renamed from: d  reason: collision with root package name */
    private OverScroller f2962d;

    /* renamed from: e  reason: collision with root package name */
    public EdgeEffect f2963e;

    /* renamed from: f  reason: collision with root package name */
    public EdgeEffect f2964f;

    /* renamed from: g  reason: collision with root package name */
    private int f2965g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2966h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2967i;

    /* renamed from: j  reason: collision with root package name */
    private View f2968j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f2969k;

    /* renamed from: l  reason: collision with root package name */
    private VelocityTracker f2970l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f2971m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f2972n;

    /* renamed from: o  reason: collision with root package name */
    private int f2973o;

    /* renamed from: p  reason: collision with root package name */
    private int f2974p;

    /* renamed from: q  reason: collision with root package name */
    private int f2975q;

    /* renamed from: r  reason: collision with root package name */
    private int f2976r;

    /* renamed from: s  reason: collision with root package name */
    private final int[] f2977s;

    /* renamed from: t  reason: collision with root package name */
    private final int[] f2978t;

    /* renamed from: u  reason: collision with root package name */
    private int f2979u;

    /* renamed from: v  reason: collision with root package name */
    private int f2980v;

    /* renamed from: w  reason: collision with root package name */
    private SavedState f2981w;

    /* renamed from: x  reason: collision with root package name */
    private final t f2982x;

    /* renamed from: y  reason: collision with root package name */
    private final p f2983y;

    /* renamed from: z  reason: collision with root package name */
    private float f2984z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f2985a;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f2985a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f2985a);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f2985a = parcel.readInt();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            androidx.core.view.accessibility.e.a(accessibilityEvent, nestedScrollView.getScrollX());
            androidx.core.view.accessibility.e.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.c cVar) {
            int scrollRange;
            super.g(view, cVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            cVar.X(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            cVar.p0(true);
            if (nestedScrollView.getScrollY() > 0) {
                cVar.b(c.a.f2841r);
                cVar.b(c.a.C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                cVar.b(c.a.f2840q);
                cVar.b(c.a.E);
            }
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (super.j(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (nestedScrollView.isEnabled()) {
                int height = nestedScrollView.getHeight();
                Rect rect = new Rect();
                if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                    height = rect.height();
                }
                if (i10 != 4096) {
                    if (i10 == 8192 || i10 == 16908344) {
                        int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (max != nestedScrollView.getScrollY()) {
                            nestedScrollView.T(0, max, true);
                            return true;
                        }
                        return false;
                    } else if (i10 != 16908346) {
                        return false;
                    }
                }
                int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min != nestedScrollView.getScrollY()) {
                    nestedScrollView.T(0, min, true);
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface c {
        void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, v.a.f31621c);
    }

    private void A() {
        this.f2962d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2973o = viewConfiguration.getScaledTouchSlop();
        this.f2974p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2975q = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void B() {
        if (this.f2970l == null) {
            this.f2970l = VelocityTracker.obtain();
        }
    }

    private boolean C(View view) {
        return !E(view, 0, getHeight());
    }

    private static boolean D(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && D((View) parent, view2);
    }

    private boolean E(View view, int i10, int i11) {
        view.getDrawingRect(this.f2961c);
        offsetDescendantRectToMyCoords(view, this.f2961c);
        return this.f2961c.bottom + i10 >= getScrollY() && this.f2961c.top - i10 <= getScrollY() + i11;
    }

    private void F(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2983y.e(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    private void G(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2976r) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f2965g = (int) motionEvent.getY(i10);
            this.f2976r = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f2970l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void J() {
        VelocityTracker velocityTracker = this.f2970l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2970l = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int K(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f2963e
            float r0 = androidx.core.widget.e.b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.f2963e
            float r4 = -r4
            float r4 = androidx.core.widget.e.d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f2963e
            float r5 = androidx.core.widget.e.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f2963e
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.f2964f
            float r0 = androidx.core.widget.e.b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.f2964f
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.e.d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f2964f
            float r5 = androidx.core.widget.e.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f2964f
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L63
            r3.invalidate()
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.K(int, float):int");
    }

    private void L(boolean z10) {
        if (z10) {
            U(2, 1);
        } else {
            W(1);
        }
        this.f2980v = getScrollY();
        a0.h0(this);
    }

    private boolean M(int i10, int i11, int i12) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z10 = false;
        boolean z11 = i10 == 33;
        View t10 = t(z11, i11, i12);
        if (t10 == null) {
            t10 = this;
        }
        if (i11 < scrollY || i12 > i13) {
            p(z11 ? i11 - scrollY : i12 - i13);
            z10 = true;
        }
        if (t10 != findFocus()) {
            t10.requestFocus(i10);
        }
        return z10;
    }

    private void N(View view) {
        view.getDrawingRect(this.f2961c);
        offsetDescendantRectToMyCoords(view, this.f2961c);
        int f10 = f(this.f2961c);
        if (f10 != 0) {
            scrollBy(0, f10);
        }
    }

    private boolean O(Rect rect, boolean z10) {
        int f10 = f(rect);
        boolean z11 = f10 != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, f10);
            } else {
                Q(0, f10);
            }
        }
        return z11;
    }

    private boolean P(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        return w(-i10) < e.b(edgeEffect) * ((float) getHeight());
    }

    private void R(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f2960b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.f2962d;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i12);
            L(z10);
        } else {
            if (!this.f2962d.isFinished()) {
                a();
            }
            scrollBy(i10, i11);
        }
        this.f2960b = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean V(MotionEvent motionEvent) {
        boolean z10;
        if (e.b(this.f2963e) != 0.0f) {
            e.d(this.f2963e, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        if (e.b(this.f2964f) != 0.0f) {
            e.d(this.f2964f, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z10;
    }

    private void a() {
        this.f2962d.abortAnimation();
        W(1);
    }

    private boolean c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    private boolean d() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
        }
        return false;
    }

    private static int e(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f2984z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f2984z = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f2984z;
    }

    private void p(int i10) {
        if (i10 != 0) {
            if (this.f2972n) {
                Q(0, i10);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    private boolean q(int i10) {
        if (e.b(this.f2963e) != 0.0f) {
            if (P(this.f2963e, i10)) {
                this.f2963e.onAbsorb(i10);
            } else {
                u(-i10);
            }
        } else if (e.b(this.f2964f) == 0.0f) {
            return false;
        } else {
            int i11 = -i10;
            if (P(this.f2964f, i11)) {
                this.f2964f.onAbsorb(i11);
            } else {
                u(i11);
            }
        }
        return true;
    }

    private void r() {
        this.f2969k = false;
        J();
        W(0);
        this.f2963e.onRelease();
        this.f2964f.onRelease();
    }

    private View t(boolean z10, int i10, int i11) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = (View) focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                boolean z12 = i10 < top && bottom < i11;
                if (view == null) {
                    view = view2;
                    z11 = z12;
                } else {
                    boolean z13 = (z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom());
                    if (z11) {
                        if (z12) {
                            if (!z13) {
                            }
                            view = view2;
                        }
                    } else if (z12) {
                        view = view2;
                        z11 = true;
                    } else {
                        if (!z13) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    private float w(int i10) {
        double log = Math.log((Math.abs(i10) * 0.35f) / (this.f2959a * 0.015f));
        float f10 = B;
        return (float) (this.f2959a * 0.015f * Math.exp((f10 / (f10 - 1.0d)) * log));
    }

    private boolean y(int i10, int i11) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            return i11 >= childAt.getTop() - scrollY && i11 < childAt.getBottom() - scrollY && i10 >= childAt.getLeft() && i10 < childAt.getRight();
        }
        return false;
    }

    private void z() {
        VelocityTracker velocityTracker = this.f2970l;
        if (velocityTracker == null) {
            this.f2970l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    boolean H(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        boolean z11;
        boolean z12;
        int overScrollMode = getOverScrollMode();
        boolean z13 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z14 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z15 = overScrollMode == 0 || (overScrollMode == 1 && z13);
        boolean z16 = overScrollMode == 0 || (overScrollMode == 1 && z14);
        int i18 = i12 + i10;
        int i19 = !z15 ? 0 : i16;
        int i20 = i13 + i11;
        int i21 = !z16 ? 0 : i17;
        int i22 = -i19;
        int i23 = i19 + i14;
        int i24 = -i21;
        int i25 = i21 + i15;
        if (i18 > i23) {
            i18 = i23;
            z11 = true;
        } else if (i18 < i22) {
            z11 = true;
            i18 = i22;
        } else {
            z11 = false;
        }
        if (i20 > i25) {
            i20 = i25;
            z12 = true;
        } else if (i20 < i24) {
            z12 = true;
            i20 = i24;
        } else {
            z12 = false;
        }
        if (z12 && !x(1)) {
            this.f2962d.springBack(i18, i20, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i18, i20, z11, z12);
        return z11 || z12;
    }

    public boolean I(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        if (z10) {
            this.f2961c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f2961c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f2961c.top = getScrollY() - height;
            Rect rect2 = this.f2961c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f2961c;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return M(i10, i11, i12);
    }

    public final void Q(int i10, int i11) {
        R(i10, i11, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, false);
    }

    void S(int i10, int i11, int i12, boolean z10) {
        R(i10 - getScrollX(), i11 - getScrollY(), i12, z10);
    }

    void T(int i10, int i11, boolean z10) {
        S(i10, i11, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, z10);
    }

    public boolean U(int i10, int i11) {
        return this.f2983y.q(i10, i11);
    }

    public void W(int i10) {
        this.f2983y.s(i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean b(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && E(findNextFocus, maxScrollAmount, getHeight())) {
            findNextFocus.getDrawingRect(this.f2961c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f2961c);
            p(f(this.f2961c));
            findNextFocus.requestFocus(i10);
        } else {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            p(maxScrollAmount);
        }
        if (findFocus != null && findFocus.isFocused() && C(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
            return true;
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f2962d.isFinished()) {
            return;
        }
        this.f2962d.computeScrollOffset();
        int currY = this.f2962d.getCurrY();
        int g10 = g(currY - this.f2980v);
        this.f2980v = currY;
        int[] iArr = this.f2978t;
        boolean z10 = false;
        iArr[1] = 0;
        h(0, g10, iArr, null, 1);
        int i10 = g10 - this.f2978t[1];
        int scrollRange = getScrollRange();
        if (i10 != 0) {
            int scrollY = getScrollY();
            H(0, i10, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i11 = i10 - scrollY2;
            int[] iArr2 = this.f2978t;
            iArr2[1] = 0;
            l(0, scrollY2, 0, i11, this.f2977s, 1, iArr2);
            i10 = i11 - this.f2978t[1];
        }
        if (i10 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z10 = true;
            }
            if (z10) {
                if (i10 < 0) {
                    if (this.f2963e.isFinished()) {
                        this.f2963e.onAbsorb((int) this.f2962d.getCurrVelocity());
                    }
                } else if (this.f2964f.isFinished()) {
                    this.f2964f.onAbsorb((int) this.f2962d.getCurrVelocity());
                }
            }
            a();
        }
        if (!this.f2962d.isFinished()) {
            a0.h0(this);
        } else {
            W(1);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || s(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f2983y.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f2983y.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return h(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f2983y.f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i10 = 0;
        if (!this.f2963e.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 21 || b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft() + 0;
            } else {
                paddingLeft = 0;
            }
            if (i11 >= 21 && b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(paddingLeft, min);
            this.f2963e.setSize(width, height);
            if (this.f2963e.draw(canvas)) {
                a0.h0(this);
            }
            canvas.restoreToCount(save);
        }
        if (this.f2964f.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 21 || b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i10 = 0 + getPaddingLeft();
        }
        if (i12 >= 21 && b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i10 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f2964f.setSize(width2, height2);
        if (this.f2964f.draw(canvas)) {
            a0.h0(this);
        }
        canvas.restoreToCount(save2);
    }

    protected int f(Rect rect) {
        int i10;
        int i11;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i12 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i13 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i12 - verticalFadingEdgeLength : i12;
        int i14 = rect.bottom;
        if (i14 > i13 && rect.top > scrollY) {
            if (rect.height() > height) {
                i11 = rect.top - scrollY;
            } else {
                i11 = rect.bottom - i13;
            }
            return Math.min(i11 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i12);
        } else if (rect.top >= scrollY || i14 >= i13) {
            return 0;
        } else {
            if (rect.height() > height) {
                i10 = 0 - (i13 - rect.bottom);
            } else {
                i10 = 0 - (scrollY - rect.top);
            }
            return Math.max(i10, -getScrollY());
        }
    }

    int g(int i10) {
        int height = getHeight();
        if (i10 > 0 && e.b(this.f2963e) != 0.0f) {
            int round = Math.round(((-height) / 4.0f) * e.d(this.f2963e, ((-i10) * 4.0f) / height, 0.5f));
            if (round != i10) {
                this.f2963e.finish();
            }
            return i10 - round;
        } else if (i10 >= 0 || e.b(this.f2964f) == 0.0f) {
            return i10;
        } else {
            float f10 = height;
            int round2 = Math.round((f10 / 4.0f) * e.d(this.f2964f, (i10 * 4.0f) / f10, 0.5f));
            if (round2 != i10) {
                this.f2964f.finish();
            }
            return i10 - round2;
        }
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f2982x.a();
    }

    int getScrollRange() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public boolean h(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.f2983y.d(i10, i11, iArr, iArr2, i12);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return x(0);
    }

    @Override // androidx.core.view.q
    public void i(View view, View view2, int i10, int i11) {
        this.f2982x.c(view, view2, i10, i11);
        U(2, i11);
    }

    @Override // android.view.View, androidx.core.view.o
    public boolean isNestedScrollingEnabled() {
        return this.f2983y.m();
    }

    @Override // androidx.core.view.q
    public void j(View view, int i10) {
        this.f2982x.e(view, i10);
        W(i10);
    }

    @Override // androidx.core.view.q
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        h(i10, i11, iArr, null, i12);
    }

    public void l(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.f2983y.e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // androidx.core.view.r
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        F(i13, i14, iArr);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i10, int i11) {
        view.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // androidx.core.view.q
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        F(i13, i14, null);
    }

    @Override // androidx.core.view.q
    public boolean o(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2967i = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        boolean z10;
        int i10 = 0;
        if (motionEvent.getAction() == 8 && !this.f2969k) {
            if (androidx.core.view.n.a(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
            } else {
                axisValue = androidx.core.view.n.a(motionEvent, 4194304) ? motionEvent.getAxisValue(26) : 0.0f;
            }
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    if (c() && !androidx.core.view.n.a(motionEvent, 8194)) {
                        e.d(this.f2963e, (-verticalScrollFactorCompat) / getHeight(), 0.5f);
                        this.f2963e.onRelease();
                        invalidate();
                        z10 = 1;
                    } else {
                        z10 = 0;
                    }
                } else if (verticalScrollFactorCompat > scrollRange) {
                    if (c() && !androidx.core.view.n.a(motionEvent, 8194)) {
                        e.d(this.f2964f, (verticalScrollFactorCompat - scrollRange) / getHeight(), 0.5f);
                        this.f2964f.onRelease();
                        invalidate();
                        i10 = 1;
                    }
                    z10 = i10;
                    i10 = scrollRange;
                } else {
                    z10 = 0;
                    i10 = verticalScrollFactorCompat;
                }
                if (i10 != scrollY) {
                    super.scrollTo(getScrollX(), i10);
                    return true;
                }
                return z10;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f2969k) {
            return true;
        }
        int i10 = action & 255;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    int i11 = this.f2976r;
                    if (i11 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i11);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.f2965g) > this.f2973o && (2 & getNestedScrollAxes()) == 0) {
                                this.f2969k = true;
                                this.f2965g = y10;
                                B();
                                this.f2970l.addMovement(motionEvent);
                                this.f2979u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i10 != 3) {
                    if (i10 == 6) {
                        G(motionEvent);
                    }
                }
            }
            this.f2969k = false;
            this.f2976r = -1;
            J();
            if (this.f2962d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                a0.h0(this);
            }
            W(0);
        } else {
            int y11 = (int) motionEvent.getY();
            if (!y((int) motionEvent.getX(), y11)) {
                if (!V(motionEvent) && this.f2962d.isFinished()) {
                    z10 = false;
                }
                this.f2969k = z10;
                J();
            } else {
                this.f2965g = y11;
                this.f2976r = motionEvent.getPointerId(0);
                z();
                this.f2970l.addMovement(motionEvent);
                this.f2962d.computeScrollOffset();
                if (!V(motionEvent) && this.f2962d.isFinished()) {
                    z10 = false;
                }
                this.f2969k = z10;
                U(2, 0);
            }
        }
        return this.f2969k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.f2966h = false;
        View view = this.f2968j;
        if (view != null && D(view, this)) {
            N(this.f2968j);
        }
        this.f2968j = null;
        if (!this.f2967i) {
            if (this.f2981w != null) {
                scrollTo(getScrollX(), this.f2981w.f2985a);
                this.f2981w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int e8 = e(scrollY, paddingTop, i14);
            if (e8 != scrollY) {
                scrollTo(getScrollX(), e8);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2967i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f2971m && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        u((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        k(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        F(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        i(view, view2, i10, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        View findNextFocusFromRect;
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i10);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        }
        if (findNextFocusFromRect == null || C(findNextFocusFromRect)) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f2981w = savedState;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2985a = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        c cVar = this.A;
        if (cVar != null) {
            cVar.a(this, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !E(findFocus, 0, i13)) {
            return;
        }
        findFocus.getDrawingRect(this.f2961c);
        offsetDescendantRectToMyCoords(findFocus, this.f2961c);
        p(f(this.f2961c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onStopNestedScroll(View view) {
        j(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01d8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f2966h) {
            N(view2);
        } else {
            this.f2968j = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return O(rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            J();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f2966h = true;
        super.requestLayout();
    }

    public boolean s(KeyEvent keyEvent) {
        this.f2961c.setEmpty();
        if (!d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                if (!keyEvent.isAltPressed()) {
                    return b(33);
                }
                return v(33);
            } else if (keyCode == 20) {
                if (!keyEvent.isAltPressed()) {
                    return b(130);
                }
                return v(130);
            } else if (keyCode != 62) {
                return false;
            } else {
                I(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
        } else {
            return false;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int e8 = e(i10, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int e10 = e(i11, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (e8 == getScrollX() && e10 == getScrollY()) {
                return;
            }
            super.scrollTo(e8, e10);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f2971m) {
            this.f2971m = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f2983y.n(z10);
    }

    public void setOnScrollChangeListener(c cVar) {
        this.A = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f2972n = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return U(i10, 0);
    }

    @Override // android.view.View, androidx.core.view.o
    public void stopNestedScroll() {
        W(0);
    }

    public void u(int i10) {
        if (getChildCount() > 0) {
            this.f2962d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, RecyclerView.UNDEFINED_DURATION, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, 0);
            L(true);
        }
    }

    public boolean v(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f2961c;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f2961c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f2961c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f2961c;
        return M(i10, rect3.top, rect3.bottom);
    }

    public boolean x(int i10) {
        return this.f2983y.l(i10);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2961c = new Rect();
        this.f2966h = true;
        this.f2967i = false;
        this.f2968j = null;
        this.f2969k = false;
        this.f2972n = true;
        this.f2976r = -1;
        this.f2977s = new int[2];
        this.f2978t = new int[2];
        this.f2963e = e.a(context, attributeSet);
        this.f2964f = e.a(context, attributeSet);
        this.f2959a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        A();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, D, i10, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2982x = new t(this);
        this.f2983y = new p(this);
        setNestedScrollingEnabled(true);
        a0.q0(this, C);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}

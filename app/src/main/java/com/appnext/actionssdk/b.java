package com.appnext.actionssdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.unity3d.services.UnityAdsConstants;
@SuppressLint({"NewApi"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b extends ViewGroup {
    private static final String TAG = "ResolverDrawerLayout";
    private int ab;
    private int ac;
    private int ae;
    private float af;
    private int ag;
    private int ah;
    private int ai;
    private int aj;
    private boolean ak;
    private boolean al;
    private boolean am;
    private boolean an;
    private final int ao;
    private final float ap;
    private final OverScroller aq;
    private final VelocityTracker ar;
    private InterfaceC0149b as;
    private c at;
    private float au;
    private float av;
    private float aw;
    private int ax;
    private final Rect ay;
    private final ViewTreeObserver.OnTouchModeChangeListener az;

    /* renamed from: com.appnext.actionssdk.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface InterfaceC0149b {
        void f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.this.v();
        }
    }

    public b(Context context) {
        this(context, null);
    }

    private void abortAnimation() {
        this.aq.abortAnimation();
        this.at = null;
        this.an = false;
    }

    private static float b(float f10) {
        return (float) Math.sin((float) ((f10 - 0.5f) * 0.4712389167638204d));
    }

    private static void b(boolean z10) {
    }

    private boolean c(float f10, float f11) {
        View b10 = b(f10, f11);
        return b10 != null && a(b10);
    }

    public static boolean q() {
        return false;
    }

    private boolean s() {
        return this.ak || getNestedScrollAxes() == 2;
    }

    private int t() {
        return this.ac + this.ai;
    }

    private void u() {
        this.ax = -1;
        this.ak = false;
        this.al = false;
        this.aw = 0.0f;
        this.av = 0.0f;
        this.au = 0.0f;
        this.ar.clear();
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        if (this.aq.computeScrollOffset()) {
            boolean z10 = !this.aq.isFinished();
            a(this.aq.getCurrY() - this.af);
            if (z10) {
                postInvalidateOnAnimation();
            } else if (!this.an || this.as == null) {
            } else {
                c cVar = new c();
                this.at = cVar;
                post(cVar);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return ScrollView.class.getName();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnTouchModeChangeListener(this.az);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnTouchModeChangeListener(this.az);
        abortAnimation();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.ar.clear();
        }
        this.ar.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    float f10 = y10 - this.av;
                    if (Math.abs(f10) > this.ao && a((ViewGroup) this, x10, y10) != null && (getNestedScrollAxes() & 2) == 0) {
                        this.ax = motionEvent.getPointerId(0);
                        this.ak = true;
                        float f11 = this.aw;
                        int i10 = this.ao;
                        this.aw = Math.max(f11 - i10, Math.min(f10 + f11, f11 + i10));
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        a(motionEvent);
                    }
                }
            }
            u();
        } else {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            this.au = x11;
            this.aw = y11;
            this.av = y11;
            View a10 = a((ViewGroup) this, x11, y11);
            while (true) {
                if (a10 == null) {
                    break;
                }
                x11 -= a10.getX();
                y11 -= a10.getY();
                if (a10 instanceof AbsListView) {
                    a10 = a((ViewGroup) a10, x11, y11);
                    break;
                }
                a10 = a10 instanceof ViewGroup ? a((ViewGroup) a10, x11, y11) : null;
            }
            this.al = (a10 != null && a(a10)) && this.ag > 0;
        }
        if (this.ak) {
            abortAnimation();
        }
        return this.ak || this.al;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width = getWidth();
        int i14 = this.aj;
        int paddingLeft = getPaddingLeft();
        int paddingRight = width - getPaddingRight();
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            a aVar = (a) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8) {
                int i16 = i14 + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                if (aVar.aC) {
                    i16 = (int) (i16 - this.af);
                }
                int measuredHeight = childAt.getMeasuredHeight() + i16;
                int measuredWidth = childAt.getMeasuredWidth();
                int i17 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft;
                childAt.layout(i17, i16, measuredWidth + i17, measuredHeight);
                i14 = measuredHeight + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i15 = this.ab;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15 >= 0 ? Math.min(size, i15) : size, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i16 = 0;
        while (true) {
            i12 = 8;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            if (((a) childAt.getLayoutParams()).aB && childAt.getVisibility() != 8) {
                measureChildWithMargins(childAt, makeMeasureSpec, paddingLeft, makeMeasureSpec2, paddingTop);
                paddingTop += b(childAt);
            }
            i16++;
        }
        int i17 = 0;
        int i18 = paddingTop;
        while (i17 < childCount) {
            View childAt2 = getChildAt(i17);
            if (((a) childAt2.getLayoutParams()).aB || childAt2.getVisibility() == i12) {
                i14 = i12;
            } else {
                i14 = i12;
                measureChildWithMargins(childAt2, makeMeasureSpec, paddingLeft, makeMeasureSpec2, i18);
                i18 += b(childAt2);
            }
            i17++;
            i12 = i14;
        }
        int i19 = this.ag;
        int max = Math.max(0, (i18 - paddingTop) - (this.ac + this.ai));
        this.ag = max;
        this.ah = i18 - max;
        boolean z10 = !(this.ak || getNestedScrollAxes() == 2);
        if (i19 != this.ag) {
            if (!isLaidOut()) {
                this.af = 0.0f;
            } else if (z10 && i19 < (i13 = this.ag) && this.af == i19) {
                this.af = i13;
            } else {
                this.af = Math.min(this.af, this.ag);
            }
        }
        this.aj = Math.max(0, size2 - i18) + ((int) this.af);
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10 || Math.abs(f11) <= this.ap) {
            return false;
        }
        if (this.as != null && f11 < 0.0f) {
            float f12 = this.af;
            int i10 = this.ag;
            if (f12 > i10) {
                a(i10 + this.ah, f11);
                this.an = true;
                return true;
            }
        }
        a(f11 <= 0.0f ? this.ag : 0, f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        if (f11 <= this.ap || this.af == 0.0f) {
            return false;
        }
        a(0, f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPrePerformAccessibilityAction(View view, int i10, Bundle bundle) {
        if (super.onNestedPrePerformAccessibilityAction(view, i10, bundle)) {
            return true;
        }
        if (i10 != 4096 || this.af == 0.0f) {
            return false;
        }
        a(0, 0.0f);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            iArr[1] = (int) (-a(-i11));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        if (i13 < 0) {
            a(-i13);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        super.onNestedScrollAccepted(view, view2, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return (i10 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        super.onStopNestedScroll(view);
        if (this.aq.isFinished()) {
            float f10 = this.af;
            int i10 = this.ag;
            if (f10 < i10 / 2) {
                i10 = 0;
            }
            a(i10, 0.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.actionssdk.b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean r() {
        return this.af > 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || !a(view2)) {
            return;
        }
        a(0, 0.0f);
    }

    final void v() {
        InterfaceC0149b interfaceC0149b = this.as;
        if (interfaceC0149b != null) {
            interfaceC0149b.f();
        }
        c cVar = this.at;
        if (cVar != null) {
            removeCallbacks(cVar);
            this.at = null;
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private static int b(View view) {
        int measuredHeight = view.getMeasuredHeight();
        if (view instanceof AbsListView) {
            AbsListView absListView = (AbsListView) view;
            int paddingBottom = absListView.getPaddingBottom();
            int childCount = absListView.getChildCount();
            int i10 = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                int bottom = absListView.getChildAt(i11).getBottom() + paddingBottom;
                if (bottom > i10) {
                    i10 = bottom;
                }
            }
            if (i10 < measuredHeight) {
                measuredHeight = i10;
            }
        }
        a aVar = (a) view.getLayoutParams();
        return ((ViewGroup.MarginLayoutParams) aVar).topMargin + measuredHeight + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            return new a((a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new a((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new a(layoutParams);
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, 0);
        this.am = true;
        this.ax = -1;
        this.ay = new Rect();
        this.az = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: com.appnext.actionssdk.b.1
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z10) {
                if (z10 || !b.this.hasFocus()) {
                    return;
                }
                b bVar = b.this;
                if (bVar.a(bVar.getFocusedChild())) {
                    b.this.a(0, 0.0f);
                }
            }
        };
        this.ab = -1;
        this.ac = UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
        this.ae = 300;
        this.aq = new OverScroller(context, AnimationUtils.loadInterpolator(context, 17563653));
        this.ar = VelocityTracker.obtain();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.ao = viewConfiguration.getScaledTouchSlop();
        this.ap = viewConfiguration.getScaledMinimumFlingVelocity();
        setImportantForAccessibility(1);
    }

    private boolean a(int i10, boolean z10) {
        int i11;
        if (i10 == this.ag) {
            return false;
        }
        if (!isLaidOut()) {
            this.af = 0.0f;
            return true;
        } else if (z10 && i10 < (i11 = this.ag) && this.af == i10) {
            this.af = i11;
            return true;
        } else {
            this.af = Math.min(this.af, this.ag);
            return true;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {
        public boolean aB;
        public boolean aC;
        public boolean aD;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.aB = true;
            this.aC = false;
            this.aD = false;
        }

        public a(int i10, int i11) {
            super(-1, -2);
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.aB = aVar.aB;
            this.aC = aVar.aC;
            this.aD = aVar.aD;
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public final void a(InterfaceC0149b interfaceC0149b) {
        this.as = interfaceC0149b;
    }

    private void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.ax) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.au = motionEvent.getX(i10);
            float y10 = motionEvent.getY(i10);
            this.aw = y10;
            this.av = y10;
            this.ax = motionEvent.getPointerId(i10);
        }
    }

    private View b(float f10, float f11) {
        View a10 = a((ViewGroup) this, f10, f11);
        while (a10 != null) {
            f10 -= a10.getX();
            f11 -= a10.getY();
            if (a10 instanceof AbsListView) {
                return a((ViewGroup) a10, f10, f11);
            }
            a10 = a10 instanceof ViewGroup ? a((ViewGroup) a10, f10, f11) : null;
        }
        return a10;
    }

    private float a(float f10) {
        float f11 = 0.0f;
        float max = Math.max(0.0f, Math.min(this.af + f10, this.ag + this.ah));
        float f12 = this.af;
        if (max != f12) {
            f11 = max - f12;
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (!((a) childAt.getLayoutParams()).aC) {
                    childAt.offsetTopAndBottom((int) f11);
                }
            }
            this.af = max;
            this.aj = (int) (this.aj + f11);
            postInvalidateOnAnimation();
        }
        return f11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, float f10) {
        int abs;
        abortAnimation();
        int i11 = (int) this.af;
        int i12 = i10 - i11;
        if (i12 == 0) {
            return;
        }
        int height = getHeight();
        int i13 = height / 2;
        float f11 = height;
        float f12 = i13;
        float b10 = f12 + (b(Math.min(1.0f, (Math.abs(i12) * 1.0f) / f11)) * f12);
        float abs2 = Math.abs(f10);
        if (abs2 > 0.0f) {
            abs = Math.round(Math.abs(b10 / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i12) / f11) + 1.0f) * 100.0f);
        }
        this.aq.startScroll(0, i11, 0, i12, Math.min(abs, 300));
        postInvalidateOnAnimation();
    }

    private View a(float f10, float f11) {
        return a((ViewGroup) this, f10, f11);
    }

    private static View a(ViewGroup viewGroup, float f10, float f11) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (a(childAt, f10, f11)) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(View view) {
        this.ay.set(0, 0, view.getWidth(), view.getHeight());
        offsetDescendantRectToMyCoords(view, this.ay);
        if (view.getParent() != this) {
            ViewParent parent = view.getParent();
            while (parent != this) {
                view = (View) parent;
                parent = view.getParent();
            }
        }
        int height = getHeight() - getPaddingBottom();
        int childCount = getChildCount();
        for (int indexOfChild = indexOfChild(view) + 1; indexOfChild < childCount; indexOfChild++) {
            View childAt = getChildAt(indexOfChild);
            if (childAt.getVisibility() != 8) {
                height = Math.min(height, childAt.getTop());
            }
        }
        return this.ay.bottom > height;
    }

    private static boolean a(View view, float f10, float f11) {
        float x10 = view.getX();
        float y10 = view.getY();
        return f10 >= x10 && f11 >= y10 && f10 < ((float) view.getWidth()) + x10 && f11 < ((float) view.getHeight()) + y10;
    }
}

package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.core.view.a0;
import androidx.core.view.o;
import androidx.core.view.p;
import androidx.core.view.q;
import androidx.core.view.r;
import androidx.core.view.s;
import androidx.core.view.t;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements r, q, o, s {
    private static final String Q = SwipeRefreshLayout.class.getSimpleName();
    private static final int[] R = {16842766};
    int A;
    int B;
    androidx.swiperefreshlayout.widget.b C;
    private Animation D;
    private Animation E;
    private Animation F;
    private Animation G;
    private Animation H;
    boolean I;
    private int J;
    boolean K;
    private i L;
    private boolean M;
    private Animation.AnimationListener N;
    private final Animation O;
    private final Animation P;

    /* renamed from: a  reason: collision with root package name */
    private View f4372a;

    /* renamed from: b  reason: collision with root package name */
    j f4373b;

    /* renamed from: c  reason: collision with root package name */
    boolean f4374c;

    /* renamed from: d  reason: collision with root package name */
    private int f4375d;

    /* renamed from: e  reason: collision with root package name */
    private float f4376e;

    /* renamed from: f  reason: collision with root package name */
    private float f4377f;

    /* renamed from: g  reason: collision with root package name */
    private final t f4378g;

    /* renamed from: h  reason: collision with root package name */
    private final p f4379h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f4380i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f4381j;

    /* renamed from: k  reason: collision with root package name */
    private final int[] f4382k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f4383l;

    /* renamed from: m  reason: collision with root package name */
    private int f4384m;

    /* renamed from: n  reason: collision with root package name */
    int f4385n;

    /* renamed from: o  reason: collision with root package name */
    private float f4386o;

    /* renamed from: p  reason: collision with root package name */
    private float f4387p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f4388q;

    /* renamed from: r  reason: collision with root package name */
    private int f4389r;

    /* renamed from: s  reason: collision with root package name */
    boolean f4390s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f4391t;

    /* renamed from: u  reason: collision with root package name */
    private final DecelerateInterpolator f4392u;

    /* renamed from: v  reason: collision with root package name */
    androidx.swiperefreshlayout.widget.a f4393v;

    /* renamed from: w  reason: collision with root package name */
    private int f4394w;

    /* renamed from: x  reason: collision with root package name */
    protected int f4395x;

    /* renamed from: y  reason: collision with root package name */
    float f4396y;

    /* renamed from: z  reason: collision with root package name */
    protected int f4397z;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f4374c) {
                swipeRefreshLayout.C.setAlpha(255);
                SwipeRefreshLayout.this.C.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.I && (jVar = swipeRefreshLayout2.f4373b) != null) {
                    jVar.a();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.f4385n = swipeRefreshLayout3.f4393v.getTop();
                return;
            }
            swipeRefreshLayout.r();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b extends Animation {
        b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c extends Animation {
        c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d extends Animation {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f4402a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f4403b;

        d(int i10, int i11) {
            this.f4402a = i10;
            this.f4403b = i11;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            androidx.swiperefreshlayout.widget.b bVar = SwipeRefreshLayout.this.C;
            int i10 = this.f4402a;
            bVar.setAlpha((int) (i10 + ((this.f4403b - i10) * f10)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f4390s) {
                return;
            }
            swipeRefreshLayout.x(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class f extends Animation {
        f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            int i10;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.K) {
                i10 = swipeRefreshLayout.A - Math.abs(swipeRefreshLayout.f4397z);
            } else {
                i10 = swipeRefreshLayout.A;
            }
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i11 = swipeRefreshLayout2.f4395x;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i11 + ((int) ((i10 - i11) * f10))) - swipeRefreshLayout2.f4393v.getTop());
            SwipeRefreshLayout.this.C.e(1.0f - f10);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class g extends Animation {
        g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.p(f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class h extends Animation {
        h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f11 = swipeRefreshLayout.f4396y;
            swipeRefreshLayout.setAnimationProgress(f11 + ((-f11) * f10));
            SwipeRefreshLayout.this.p(f10);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface i {
        boolean a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface j {
        void a();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4374c = false;
        this.f4376e = -1.0f;
        this.f4380i = new int[2];
        this.f4381j = new int[2];
        this.f4382k = new int[2];
        this.f4389r = -1;
        this.f4394w = -1;
        this.N = new a();
        this.O = new f();
        this.P = new g();
        this.f4375d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f4384m = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f4392u = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.J = (int) (displayMetrics.density * 40.0f);
        d();
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.A = i10;
        this.f4376e = i10;
        this.f4378g = new t(this);
        this.f4379h = new p(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.J;
        this.f4385n = i11;
        this.f4397z = i11;
        p(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void a(int i10, Animation.AnimationListener animationListener) {
        this.f4395x = i10;
        this.O.reset();
        this.O.setDuration(200L);
        this.O.setInterpolator(this.f4392u);
        if (animationListener != null) {
            this.f4393v.b(animationListener);
        }
        this.f4393v.clearAnimation();
        this.f4393v.startAnimation(this.O);
    }

    private void b(int i10, Animation.AnimationListener animationListener) {
        if (this.f4390s) {
            y(i10, animationListener);
            return;
        }
        this.f4395x = i10;
        this.P.reset();
        this.P.setDuration(200L);
        this.P.setInterpolator(this.f4392u);
        if (animationListener != null) {
            this.f4393v.b(animationListener);
        }
        this.f4393v.clearAnimation();
        this.f4393v.startAnimation(this.P);
    }

    private void d() {
        this.f4393v = new androidx.swiperefreshlayout.widget.a(getContext());
        androidx.swiperefreshlayout.widget.b bVar = new androidx.swiperefreshlayout.widget.b(getContext());
        this.C = bVar;
        bVar.l(1);
        this.f4393v.setImageDrawable(this.C);
        this.f4393v.setVisibility(8);
        addView(this.f4393v);
    }

    private void f() {
        if (this.f4372a == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.f4393v)) {
                    this.f4372a = childAt;
                    return;
                }
            }
        }
    }

    private void g(float f10) {
        if (f10 > this.f4376e) {
            s(true, true);
            return;
        }
        this.f4374c = false;
        this.C.j(0.0f, 0.0f);
        b(this.f4385n, this.f4390s ? null : new e());
        this.C.d(false);
    }

    private boolean h(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void l(float f10) {
        this.C.d(true);
        float min = Math.min(1.0f, Math.abs(f10 / this.f4376e));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f10) - this.f4376e;
        int i10 = this.B;
        if (i10 <= 0) {
            if (this.K) {
                i10 = this.A - this.f4397z;
            } else {
                i10 = this.A;
            }
        }
        float f11 = i10;
        double max2 = Math.max(0.0f, Math.min(abs, f11 * 2.0f) / f11) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i11 = this.f4397z + ((int) ((f11 * min) + (f11 * pow * 2.0f)));
        if (this.f4393v.getVisibility() != 0) {
            this.f4393v.setVisibility(0);
        }
        if (!this.f4390s) {
            this.f4393v.setScaleX(1.0f);
            this.f4393v.setScaleY(1.0f);
        }
        if (this.f4390s) {
            setAnimationProgress(Math.min(1.0f, f10 / this.f4376e));
        }
        if (f10 < this.f4376e) {
            if (this.C.getAlpha() > 76 && !h(this.F)) {
                w();
            }
        } else if (this.C.getAlpha() < 255 && !h(this.G)) {
            v();
        }
        this.C.j(0.0f, Math.min(0.8f, max * 0.8f));
        this.C.e(Math.min(1.0f, max));
        this.C.g((((max * 0.4f) - 0.25f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i11 - this.f4385n);
    }

    private void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4389r) {
            this.f4389r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void s(boolean z10, boolean z11) {
        if (this.f4374c != z10) {
            this.I = z11;
            f();
            this.f4374c = z10;
            if (z10) {
                a(this.f4385n, this.N);
            } else {
                x(this.N);
            }
        }
    }

    private void setColorViewAlpha(int i10) {
        this.f4393v.getBackground().setAlpha(i10);
        this.C.setAlpha(i10);
    }

    private Animation t(int i10, int i11) {
        d dVar = new d(i10, i11);
        dVar.setDuration(300L);
        this.f4393v.b(null);
        this.f4393v.clearAnimation();
        this.f4393v.startAnimation(dVar);
        return dVar;
    }

    private void u(float f10) {
        float f11 = this.f4387p;
        int i10 = this.f4375d;
        if (f10 - f11 <= i10 || this.f4388q) {
            return;
        }
        this.f4386o = f11 + i10;
        this.f4388q = true;
        this.C.setAlpha(76);
    }

    private void v() {
        this.G = t(this.C.getAlpha(), 255);
    }

    private void w() {
        this.F = t(this.C.getAlpha(), 76);
    }

    private void y(int i10, Animation.AnimationListener animationListener) {
        this.f4395x = i10;
        this.f4396y = this.f4393v.getScaleX();
        h hVar = new h();
        this.H = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.f4393v.b(animationListener);
        }
        this.f4393v.clearAnimation();
        this.f4393v.startAnimation(this.H);
    }

    private void z(Animation.AnimationListener animationListener) {
        this.f4393v.setVisibility(0);
        this.C.setAlpha(255);
        b bVar = new b();
        this.D = bVar;
        bVar.setDuration(this.f4384m);
        if (animationListener != null) {
            this.f4393v.b(animationListener);
        }
        this.f4393v.clearAnimation();
        this.f4393v.startAnimation(this.D);
    }

    public boolean c() {
        i iVar = this.L;
        if (iVar != null) {
            return iVar.a(this, this.f4372a);
        }
        View view = this.f4372a;
        if (view instanceof ListView) {
            return androidx.core.widget.h.a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f4379h.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f4379h.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f4379h.c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f4379h.f(i10, i11, i12, i13, iArr);
    }

    public void e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        if (i14 == 0) {
            this.f4379h.e(i10, i11, i12, i13, iArr, i14, iArr2);
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.f4394w;
        return i12 < 0 ? i11 : i11 == i10 + (-1) ? i12 : i11 >= i12 ? i11 + 1 : i11;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f4378g.a();
    }

    public int getProgressCircleDiameter() {
        return this.J;
    }

    public int getProgressViewEndOffset() {
        return this.A;
    }

    public int getProgressViewStartOffset() {
        return this.f4397z;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f4379h.k();
    }

    @Override // androidx.core.view.q
    public void i(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // android.view.View, androidx.core.view.o
    public boolean isNestedScrollingEnabled() {
        return this.f4379h.m();
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

    @Override // androidx.core.view.r
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i14 != 0) {
            return;
        }
        int i15 = iArr[1];
        e(i10, i11, i12, i13, this.f4381j, i14, iArr);
        int i16 = i13 - (iArr[1] - i15);
        int i17 = i16 == 0 ? i13 + this.f4381j[1] : i16;
        if (i17 >= 0 || c()) {
            return;
        }
        float abs = this.f4377f + Math.abs(i17);
        this.f4377f = abs;
        l(abs);
        iArr[1] = iArr[1] + i16;
    }

    @Override // androidx.core.view.q
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, i14, this.f4382k);
    }

    @Override // androidx.core.view.q
    public boolean o(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            return onStartNestedScroll(view, view2, i10);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f4391t && actionMasked == 0) {
            this.f4391t = false;
        }
        if (!isEnabled() || this.f4391t || c() || this.f4374c || this.f4383l) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i10 = this.f4389r;
                    if (i10 == -1) {
                        Log.e(Q, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    u(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        q(motionEvent);
                    }
                }
            }
            this.f4388q = false;
            this.f4389r = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f4397z - this.f4393v.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f4389r = pointerId;
            this.f4388q = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f4387p = motionEvent.getY(findPointerIndex2);
        }
        return this.f4388q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f4372a == null) {
            f();
        }
        View view = this.f4372a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f4393v.getMeasuredWidth();
        int measuredHeight2 = this.f4393v.getMeasuredHeight();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = this.f4385n;
        this.f4393v.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f4372a == null) {
            f();
        }
        View view = this.f4372a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f4393v.measure(View.MeasureSpec.makeMeasureSpec(this.J, 1073741824), View.MeasureSpec.makeMeasureSpec(this.J, 1073741824));
        this.f4394w = -1;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == this.f4393v) {
                this.f4394w = i12;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.f4377f;
            if (f10 > 0.0f) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = (int) f10;
                    this.f4377f = 0.0f;
                } else {
                    this.f4377f = f10 - f11;
                    iArr[1] = i11;
                }
                l(this.f4377f);
            }
        }
        if (this.K && i11 > 0 && this.f4377f == 0.0f && Math.abs(i11 - iArr[1]) > 0) {
            this.f4393v.setVisibility(8);
        }
        int[] iArr2 = this.f4380i;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m(view, i10, i11, i12, i13, 0, this.f4382k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f4378g.b(view, view2, i10);
        startNestedScroll(i10 & 2);
        this.f4377f = 0.0f;
        this.f4383l = true;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.f4398a);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f4374c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return (!isEnabled() || this.f4391t || this.f4374c || (i10 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onStopNestedScroll(View view) {
        this.f4378g.d(view);
        this.f4383l = false;
        float f10 = this.f4377f;
        if (f10 > 0.0f) {
            g(f10);
            this.f4377f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f4391t && actionMasked == 0) {
            this.f4391t = false;
        }
        if (!isEnabled() || this.f4391t || c() || this.f4374c || this.f4383l) {
            return false;
        }
        if (actionMasked == 0) {
            this.f4389r = motionEvent.getPointerId(0);
            this.f4388q = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f4389r);
            if (findPointerIndex < 0) {
                Log.e(Q, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f4388q) {
                this.f4388q = false;
                g((motionEvent.getY(findPointerIndex) - this.f4386o) * 0.5f);
            }
            this.f4389r = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f4389r);
            if (findPointerIndex2 < 0) {
                Log.e(Q, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y10 = motionEvent.getY(findPointerIndex2);
            u(y10);
            if (this.f4388q) {
                float f10 = (y10 - this.f4386o) * 0.5f;
                if (f10 <= 0.0f) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                l(f10);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(Q, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f4389r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                q(motionEvent);
            }
        }
        return true;
    }

    void p(float f10) {
        int i10 = this.f4395x;
        setTargetOffsetTopAndBottom((i10 + ((int) ((this.f4397z - i10) * f10))) - this.f4393v.getTop());
    }

    void r() {
        this.f4393v.clearAnimation();
        this.C.stop();
        this.f4393v.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f4390s) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f4397z - this.f4385n);
        }
        this.f4385n = this.f4393v.getTop();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        View view;
        ViewParent parent;
        if ((Build.VERSION.SDK_INT < 21 && (this.f4372a instanceof AbsListView)) || ((view = this.f4372a) != null && !a0.V(view))) {
            if (this.M || (parent = getParent()) == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(z10);
            return;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    void setAnimationProgress(float f10) {
        this.f4393v.setScaleX(f10);
        this.f4393v.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        f();
        this.C.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = androidx.core.content.a.d(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f4376e = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (z10) {
            return;
        }
        r();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z10) {
        this.M = z10;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f4379h.n(z10);
    }

    public void setOnChildScrollUpCallback(i iVar) {
        this.L = iVar;
    }

    public void setOnRefreshListener(j jVar) {
        this.f4373b = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.f4393v.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.a.d(getContext(), i10));
    }

    public void setRefreshing(boolean z10) {
        int i10;
        if (z10 && this.f4374c != z10) {
            this.f4374c = z10;
            if (!this.K) {
                i10 = this.A + this.f4397z;
            } else {
                i10 = this.A;
            }
            setTargetOffsetTopAndBottom(i10 - this.f4385n);
            this.I = false;
            z(this.N);
            return;
        }
        s(z10, false);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i10 == 0) {
                this.J = (int) (displayMetrics.density * 56.0f);
            } else {
                this.J = (int) (displayMetrics.density * 40.0f);
            }
            this.f4393v.setImageDrawable(null);
            this.C.l(i10);
            this.f4393v.setImageDrawable(this.C);
        }
    }

    public void setSlingshotDistance(int i10) {
        this.B = i10;
    }

    void setTargetOffsetTopAndBottom(int i10) {
        this.f4393v.bringToFront();
        a0.b0(this.f4393v, i10);
        this.f4385n = this.f4393v.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return this.f4379h.p(i10);
    }

    @Override // android.view.View, androidx.core.view.o
    public void stopNestedScroll() {
        this.f4379h.r();
    }

    void x(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.E = cVar;
        cVar.setDuration(150L);
        this.f4393v.b(animationListener);
        this.f4393v.clearAnimation();
        this.f4393v.startAnimation(this.E);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        final boolean f4398a;

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

        SavedState(Parcelable parcelable, boolean z10) {
            super(parcelable);
            this.f4398a = z10;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f4398a ? (byte) 1 : (byte) 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f4398a = parcel.readByte() != 0;
        }
    }
}

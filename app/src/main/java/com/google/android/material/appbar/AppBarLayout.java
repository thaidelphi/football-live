package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import androidx.core.view.accessibility.c;
import androidx.core.view.accessibility.f;
import androidx.core.view.l0;
import androidx.core.view.o;
import androidx.customview.view.AbsSavedState;
import d5.j;
import d5.k;
import java.lang.ref.WeakReference;
import java.util.List;
import u5.g;
import u5.h;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: t  reason: collision with root package name */
    private static final int f13813t = j.f24101c;

    /* renamed from: a  reason: collision with root package name */
    private int f13814a;

    /* renamed from: b  reason: collision with root package name */
    private int f13815b;

    /* renamed from: c  reason: collision with root package name */
    private int f13816c;

    /* renamed from: d  reason: collision with root package name */
    private int f13817d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13818e;

    /* renamed from: f  reason: collision with root package name */
    private int f13819f;

    /* renamed from: g  reason: collision with root package name */
    private l0 f13820g;

    /* renamed from: h  reason: collision with root package name */
    private List<b> f13821h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f13822i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f13823j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f13824k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f13825l;

    /* renamed from: m  reason: collision with root package name */
    private int f13826m;

    /* renamed from: n  reason: collision with root package name */
    private WeakReference<View> f13827n;

    /* renamed from: o  reason: collision with root package name */
    private ValueAnimator f13828o;

    /* renamed from: p  reason: collision with root package name */
    private final List<f> f13829p;

    /* renamed from: q  reason: collision with root package name */
    private int[] f13830q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f13831r;

    /* renamed from: s  reason: collision with root package name */
    private Behavior f13832s;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.a<T> {

        /* renamed from: k  reason: collision with root package name */
        private int f13833k;

        /* renamed from: l  reason: collision with root package name */
        private int f13834l;

        /* renamed from: m  reason: collision with root package name */
        private ValueAnimator f13835m;

        /* renamed from: n  reason: collision with root package name */
        private SavedState f13836n;

        /* renamed from: o  reason: collision with root package name */
        private WeakReference<View> f13837o;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f13843a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AppBarLayout f13844b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f13843a = coordinatorLayout;
                this.f13844b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.P(this.f13843a, this.f13844b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public class b implements androidx.core.view.accessibility.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f13846a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AppBarLayout f13847b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ View f13848c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f13849d;

            b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
                this.f13846a = coordinatorLayout;
                this.f13847b = appBarLayout;
                this.f13848c = view;
                this.f13849d = i10;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.core.view.accessibility.f
            public boolean a(View view, f.a aVar) {
                BaseBehavior.this.q(this.f13846a, this.f13847b, this.f13848c, 0, this.f13849d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public class c implements androidx.core.view.accessibility.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AppBarLayout f13851a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f13852b;

            c(AppBarLayout appBarLayout, boolean z10) {
                this.f13851a = appBarLayout;
                this.f13852b = z10;
            }

            @Override // androidx.core.view.accessibility.f
            public boolean a(View view, f.a aVar) {
                this.f13851a.setExpanded(this.f13852b);
                return true;
            }
        }

        public BaseBehavior() {
        }

        private void S(CoordinatorLayout coordinatorLayout, T t10, View view) {
            if (M() != (-t10.getTotalScrollRange()) && view.canScrollVertically(1)) {
                T(coordinatorLayout, t10, c.a.f2840q, false);
            }
            if (M() != 0) {
                if (view.canScrollVertically(-1)) {
                    int i10 = -t10.getDownNestedPreScrollRange();
                    if (i10 != 0) {
                        a0.m0(coordinatorLayout, c.a.f2841r, null, new b(coordinatorLayout, t10, view, i10));
                        return;
                    }
                    return;
                }
                T(coordinatorLayout, t10, c.a.f2841r, true);
            }
        }

        private void T(CoordinatorLayout coordinatorLayout, T t10, c.a aVar, boolean z10) {
            a0.m0(coordinatorLayout, aVar, null, new c(t10, z10));
        }

        private void U(CoordinatorLayout coordinatorLayout, T t10, int i10, float f10) {
            int height;
            int abs = Math.abs(M() - i10);
            float abs2 = Math.abs(f10);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / t10.getHeight()) + 1.0f) * 150.0f);
            }
            V(coordinatorLayout, t10, i10, height);
        }

        private void V(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11) {
            int M = M();
            if (M == i10) {
                ValueAnimator valueAnimator = this.f13835m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f13835m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f13835m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f13835m = valueAnimator3;
                valueAnimator3.setInterpolator(e5.a.f25173e);
                this.f13835m.addUpdateListener(new a(coordinatorLayout, t10));
            } else {
                valueAnimator2.cancel();
            }
            this.f13835m.setDuration(Math.min(i11, 600));
            this.f13835m.setIntValues(M, i10);
            this.f13835m.start();
        }

        private int W(int i10, int i11, int i12) {
            return i10 < (i11 + i12) / 2 ? i11 : i12;
        }

        private boolean Y(CoordinatorLayout coordinatorLayout, T t10, View view) {
            return t10.j() && coordinatorLayout.getHeight() - view.getHeight() <= t10.getHeight();
        }

        private static boolean Z(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        private View a0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof o) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View b0(AppBarLayout appBarLayout, int i10) {
            int abs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int c0(T t10, int i10) {
            int childCount = t10.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = t10.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                e eVar = (e) childAt.getLayoutParams();
                if (Z(eVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) eVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) eVar).bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        private int f0(T t10, int i10) {
            int abs = Math.abs(i10);
            int childCount = t10.getChildCount();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                View childAt = t10.getChildAt(i12);
                e eVar = (e) childAt.getLayoutParams();
                Interpolator d10 = eVar.d();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i12++;
                } else if (d10 != null) {
                    int c10 = eVar.c();
                    if ((c10 & 1) != 0) {
                        i11 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                        if ((c10 & 2) != 0) {
                            i11 -= a0.F(childAt);
                        }
                    }
                    if (a0.B(childAt)) {
                        i11 -= t10.getTopInset();
                    }
                    if (i11 > 0) {
                        float f10 = i11;
                        return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * d10.getInterpolation((abs - childAt.getTop()) / f10)));
                    }
                }
            }
            return i10;
        }

        private boolean s0(CoordinatorLayout coordinatorLayout, T t10) {
            List<View> s10 = coordinatorLayout.s(t10);
            int size = s10.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.c f10 = ((CoordinatorLayout.f) s10.get(i10).getLayoutParams()).f();
                if (f10 instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) f10).K() != 0;
                }
            }
            return false;
        }

        private void t0(CoordinatorLayout coordinatorLayout, T t10) {
            int topInset = t10.getTopInset() + t10.getPaddingTop();
            int M = M() - topInset;
            int c02 = c0(t10, M);
            if (c02 >= 0) {
                View childAt = t10.getChildAt(c02);
                e eVar = (e) childAt.getLayoutParams();
                int c10 = eVar.c();
                if ((c10 & 17) == 17) {
                    int i10 = -childAt.getTop();
                    int i11 = -childAt.getBottom();
                    if (c02 == 0 && a0.B(t10) && a0.B(childAt)) {
                        i10 -= t10.getTopInset();
                    }
                    if (Z(c10, 2)) {
                        i11 += a0.F(childAt);
                    } else if (Z(c10, 5)) {
                        int F = a0.F(childAt) + i11;
                        if (M < F) {
                            i10 = F;
                        } else {
                            i11 = F;
                        }
                    }
                    if (Z(c10, 32)) {
                        i10 += ((LinearLayout.LayoutParams) eVar).topMargin;
                        i11 -= ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    }
                    U(coordinatorLayout, t10, x.a.b(W(M, i11, i10) + topInset, -t10.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void u0(CoordinatorLayout coordinatorLayout, T t10) {
            a0.k0(coordinatorLayout, c.a.f2840q.b());
            a0.k0(coordinatorLayout, c.a.f2841r.b());
            View a02 = a0(coordinatorLayout);
            if (a02 == null || t10.getTotalScrollRange() == 0 || !(((CoordinatorLayout.f) a02.getLayoutParams()).f() instanceof ScrollingViewBehavior)) {
                return;
            }
            S(coordinatorLayout, t10, a02);
        }

        private void v0(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, boolean z10) {
            View b02 = b0(t10, i10);
            boolean z11 = false;
            if (b02 != null) {
                int c10 = ((e) b02.getLayoutParams()).c();
                if ((c10 & 1) != 0) {
                    int F = a0.F(b02);
                    if (i11 <= 0 || (c10 & 12) == 0 ? !((c10 & 2) == 0 || (-i10) < (b02.getBottom() - F) - t10.getTopInset()) : (-i10) >= (b02.getBottom() - F) - t10.getTopInset()) {
                        z11 = true;
                    }
                }
            }
            if (t10.l()) {
                z11 = t10.u(a0(coordinatorLayout));
            }
            boolean r10 = t10.r(z11);
            if (z10 || (r10 && s0(coordinatorLayout, t10))) {
                t10.jumpDrawablesToCurrentState();
            }
        }

        @Override // com.google.android.material.appbar.a
        int M() {
            return E() + this.f13833k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: X */
        public boolean H(T t10) {
            WeakReference<View> weakReference = this.f13837o;
            if (weakReference != null) {
                View view = weakReference.get();
                return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: d0 */
        public int K(T t10) {
            return -t10.getDownNestedScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: e0 */
        public int L(T t10) {
            return t10.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: g0 */
        public void N(CoordinatorLayout coordinatorLayout, T t10) {
            t0(coordinatorLayout, t10);
            if (t10.l()) {
                t10.r(t10.u(a0(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: h0 */
        public boolean l(CoordinatorLayout coordinatorLayout, T t10, int i10) {
            int round;
            boolean l10 = super.l(coordinatorLayout, t10, i10);
            int pendingAction = t10.getPendingAction();
            SavedState savedState = this.f13836n;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -t10.getUpNestedPreScrollRange();
                        if (z10) {
                            U(coordinatorLayout, t10, i11, 0.0f);
                        } else {
                            P(coordinatorLayout, t10, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            U(coordinatorLayout, t10, 0, 0.0f);
                        } else {
                            P(coordinatorLayout, t10, 0);
                        }
                    }
                }
            } else if (savedState.f13838c) {
                P(coordinatorLayout, t10, -t10.getTotalScrollRange());
            } else if (savedState.f13839d) {
                P(coordinatorLayout, t10, 0);
            } else {
                View childAt = t10.getChildAt(savedState.f13840e);
                int i12 = -childAt.getBottom();
                if (this.f13836n.f13842g) {
                    round = a0.F(childAt) + t10.getTopInset();
                } else {
                    round = Math.round(childAt.getHeight() * this.f13836n.f13841f);
                }
                P(coordinatorLayout, t10, i12 + round);
            }
            t10.n();
            this.f13836n = null;
            G(x.a.b(E(), -t10.getTotalScrollRange(), 0));
            v0(coordinatorLayout, t10, E(), 0, true);
            t10.m(E());
            u0(coordinatorLayout, t10);
            return l10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: i0 */
        public boolean m(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, int i12, int i13) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t10.getLayoutParams())).height == -2) {
                coordinatorLayout.J(t10, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
                return true;
            }
            return super.m(coordinatorLayout, t10, i10, i11, i12, i13);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: j0 */
        public void q(CoordinatorLayout coordinatorLayout, T t10, View view, int i10, int i11, int[] iArr, int i12) {
            int i13;
            int i14;
            if (i11 != 0) {
                if (i11 < 0) {
                    i13 = -t10.getTotalScrollRange();
                    i14 = t10.getDownNestedPreScrollRange() + i13;
                } else {
                    i13 = -t10.getUpNestedPreScrollRange();
                    i14 = 0;
                }
                int i15 = i13;
                int i16 = i14;
                if (i15 != i16) {
                    iArr[1] = O(coordinatorLayout, t10, i11, i15, i16);
                }
            }
            if (t10.l()) {
                t10.r(t10.u(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: k0 */
        public void t(CoordinatorLayout coordinatorLayout, T t10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            if (i13 < 0) {
                iArr[1] = O(coordinatorLayout, t10, i13, -t10.getDownNestedScrollRange(), 0);
            }
            if (i13 == 0) {
                u0(coordinatorLayout, t10);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: l0 */
        public void x(CoordinatorLayout coordinatorLayout, T t10, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                p0((SavedState) parcelable, true);
                super.x(coordinatorLayout, t10, this.f13836n.a());
                return;
            }
            super.x(coordinatorLayout, t10, parcelable);
            this.f13836n = null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: m0 */
        public Parcelable y(CoordinatorLayout coordinatorLayout, T t10) {
            Parcelable y10 = super.y(coordinatorLayout, t10);
            SavedState q02 = q0(y10, t10);
            return q02 == null ? y10 : q02;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: n0 */
        public boolean A(CoordinatorLayout coordinatorLayout, T t10, View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10 = (i10 & 2) != 0 && (t10.l() || Y(coordinatorLayout, t10, view));
            if (z10 && (valueAnimator = this.f13835m) != null) {
                valueAnimator.cancel();
            }
            this.f13837o = null;
            this.f13834l = i11;
            return z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: o0 */
        public void C(CoordinatorLayout coordinatorLayout, T t10, View view, int i10) {
            if (this.f13834l == 0 || i10 == 1) {
                t0(coordinatorLayout, t10);
                if (t10.l()) {
                    t10.r(t10.u(view));
                }
            }
            this.f13837o = new WeakReference<>(view);
        }

        void p0(SavedState savedState, boolean z10) {
            if (this.f13836n == null || z10) {
                this.f13836n = savedState;
            }
        }

        SavedState q0(Parcelable parcelable, T t10) {
            int E = E();
            int childCount = t10.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = t10.getChildAt(i10);
                int bottom = childAt.getBottom() + E;
                if (childAt.getTop() + E <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f3032b;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z10 = E == 0;
                    savedState.f13839d = z10;
                    savedState.f13838c = !z10 && (-E) >= t10.getTotalScrollRange();
                    savedState.f13840e = i10;
                    savedState.f13842g = bottom == a0.F(childAt) + t10.getTopInset();
                    savedState.f13841f = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: r0 */
        public int Q(CoordinatorLayout coordinatorLayout, T t10, int i10, int i11, int i12) {
            int M = M();
            int i13 = 0;
            if (i11 != 0 && M >= i11 && M <= i12) {
                int b10 = x.a.b(i10, i11, i12);
                if (M != b10) {
                    int f02 = t10.h() ? f0(t10, b10) : b10;
                    boolean G = G(f02);
                    int i14 = M - b10;
                    this.f13833k = b10 - f02;
                    if (G) {
                        while (i13 < t10.getChildCount()) {
                            e eVar = (e) t10.getChildAt(i13).getLayoutParams();
                            c b11 = eVar.b();
                            if (b11 != null && (eVar.c() & 1) != 0) {
                                b11.a(t10, t10.getChildAt(i13), E());
                            }
                            i13++;
                        }
                    }
                    if (!G && t10.h()) {
                        coordinatorLayout.f(t10);
                    }
                    t10.m(E());
                    v0(coordinatorLayout, t10, b10, b10 < M ? -1 : 1, false);
                    i13 = i14;
                }
            } else {
                this.f13833k = 0;
            }
            u0(coordinatorLayout, t10);
            return i13;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();

            /* renamed from: c  reason: collision with root package name */
            boolean f13838c;

            /* renamed from: d  reason: collision with root package name */
            boolean f13839d;

            /* renamed from: e  reason: collision with root package name */
            int f13840e;

            /* renamed from: f  reason: collision with root package name */
            float f13841f;

            /* renamed from: g  reason: collision with root package name */
            boolean f13842g;

            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
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
                this.f13838c = parcel.readByte() != 0;
                this.f13839d = parcel.readByte() != 0;
                this.f13840e = parcel.readInt();
                this.f13841f = parcel.readFloat();
                this.f13842g = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f13838c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f13839d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f13840e);
                parcel.writeFloat(this.f13841f);
                parcel.writeByte(this.f13842g ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.a, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.D(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ int E() {
            return super.E();
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ boolean G(int i10) {
            return super.G(i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean h0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            return super.l(coordinatorLayout, appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean i0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void j0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.q(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.a, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.k(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void k0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.t(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void l0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.x(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable m0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.y(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean n0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            return super.A(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void o0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            super.C(coordinatorLayout, appBarLayout, view, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class ScrollingViewBehavior extends com.google.android.material.appbar.b {
        public ScrollingViewBehavior() {
        }

        private static int R(AppBarLayout appBarLayout) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (f10 instanceof BaseBehavior) {
                return ((BaseBehavior) f10).M();
            }
            return 0;
        }

        private void S(View view, View view2) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (f10 instanceof BaseBehavior) {
                a0.b0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f10).f13833k) + M()) - I(view2));
            }
        }

        private void T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.l()) {
                    appBarLayout.r(appBarLayout.u(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.b
        float J(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int R = R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + R > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (R / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.b
        int L(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.L(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        /* renamed from: Q */
        public AppBarLayout H(List<View> list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            S(view, view2);
            T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                a0.k0(coordinatorLayout, c.a.f2840q.b());
                a0.k0(coordinatorLayout, c.a.f2841r.b());
            }
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return super.l(coordinatorLayout, view, i10);
        }

        @Override // com.google.android.material.appbar.b, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, view, i10, i11, i12, i13);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout H = H(coordinatorLayout.r(view));
            if (H != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f13872d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    H.o(false, !z10);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.T3);
            O(obtainStyledAttributes.getDimensionPixelSize(k.U3, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f13854a;

        a(g gVar) {
            this.f13854a = gVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f13854a.W(floatValue);
            if (AppBarLayout.this.f13831r instanceof g) {
                ((g) AppBarLayout.this.f13831r).W(floatValue);
            }
            for (f fVar : AppBarLayout.this.f13829p) {
                fVar.a(floatValue, this.f13854a.z());
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface b<T extends AppBarLayout> {
        void a(T t10, int i10);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static abstract class c {
        public abstract void a(AppBarLayout appBarLayout, View view, float f10);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class d extends c {

        /* renamed from: a  reason: collision with root package name */
        private final Rect f13856a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        private final Rect f13857b = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.c
        public void a(AppBarLayout appBarLayout, View view, float f10) {
            b(this.f13856a, appBarLayout, view);
            float abs = this.f13856a.top - Math.abs(f10);
            if (abs <= 0.0f) {
                float a10 = 1.0f - x.a.a(Math.abs(abs / this.f13856a.height()), 0.0f, 1.0f);
                float height = (-abs) - ((this.f13856a.height() * 0.3f) * (1.0f - (a10 * a10)));
                view.setTranslationY(height);
                view.getDrawingRect(this.f13857b);
                this.f13857b.offset(0, (int) (-height));
                a0.x0(view, this.f13857b);
                return;
            }
            a0.x0(view, null);
            view.setTranslationY(0.0f);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface f {
        void a(float f10, int i10);
    }

    private void c() {
        WeakReference<View> weakReference = this.f13827n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f13827n = null;
    }

    private View d(View view) {
        int i10;
        if (this.f13827n == null && (i10 = this.f13826m) != -1) {
            View findViewById = view != null ? view.findViewById(i10) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f13826m);
            }
            if (findViewById != null) {
                this.f13827n = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f13827n;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean i() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((e) getChildAt(i10).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void k() {
        Behavior behavior = this.f13832s;
        BaseBehavior.SavedState q02 = (behavior == null || this.f13815b == -1 || this.f13819f != 0) ? null : behavior.q0(AbsSavedState.f3032b, this);
        this.f13815b = -1;
        this.f13816c = -1;
        this.f13817d = -1;
        if (q02 != null) {
            this.f13832s.p0(q02, false);
        }
    }

    private void p(boolean z10, boolean z11, boolean z12) {
        this.f13819f = (z10 ? 1 : 2) | (z11 ? 4 : 0) | (z12 ? 8 : 0);
        requestLayout();
    }

    private boolean q(boolean z10) {
        if (this.f13823j != z10) {
            this.f13823j = z10;
            refreshDrawableState();
            return true;
        }
        return false;
    }

    private boolean t() {
        return this.f13831r != null && getTopInset() > 0;
    }

    private boolean v() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            return (childAt.getVisibility() == 8 || a0.B(childAt)) ? false : true;
        }
        return false;
    }

    private void w(g gVar, boolean z10) {
        float dimension = getResources().getDimension(d5.d.f24003a);
        float f10 = z10 ? 0.0f : dimension;
        if (!z10) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f13828o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, dimension);
        this.f13828o = ofFloat;
        ofFloat.setDuration(getResources().getInteger(d5.g.f24062a));
        this.f13828o.setInterpolator(e5.a.f25169a);
        this.f13828o.addUpdateListener(new a(gVar));
        this.f13828o.start();
    }

    private void x() {
        setWillNotDraw(!t());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (t()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f13814a);
            this.f13831r.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f13831r;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: e */
    public e generateDefaultLayoutParams() {
        return new e(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: f */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: g */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new e((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f13832s = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int i10;
        int F;
        int i11 = this.f13816c;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            e eVar = (e) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = eVar.f13858a;
            if ((i13 & 5) == 5) {
                int i14 = ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                if ((i13 & 8) != 0) {
                    F = a0.F(childAt);
                } else if ((i13 & 2) != 0) {
                    F = measuredHeight - a0.F(childAt);
                } else {
                    i10 = i14 + measuredHeight;
                    if (childCount == 0 && a0.B(childAt)) {
                        i10 = Math.min(i10, measuredHeight - getTopInset());
                    }
                    i12 += i10;
                }
                i10 = i14 + F;
                if (childCount == 0) {
                    i10 = Math.min(i10, measuredHeight - getTopInset());
                }
                i12 += i10;
            } else if (i12 > 0) {
                break;
            }
        }
        int max = Math.max(0, i12);
        this.f13816c = max;
        return max;
    }

    int getDownNestedScrollRange() {
        int i10 = this.f13817d;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            e eVar = (e) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
            int i13 = eVar.f13858a;
            if ((i13 & 1) == 0) {
                break;
            }
            i12 += measuredHeight;
            if ((i13 & 2) != 0) {
                i12 -= a0.F(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f13817d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f13826m;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int F = a0.F(this);
        if (F == 0) {
            int childCount = getChildCount();
            F = childCount >= 1 ? a0.F(getChildAt(childCount - 1)) : 0;
            if (F == 0) {
                return getHeight() / 3;
            }
        }
        return (F * 2) + topInset;
    }

    int getPendingAction() {
        return this.f13819f;
    }

    public Drawable getStatusBarForeground() {
        return this.f13831r;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        l0 l0Var = this.f13820g;
        if (l0Var != null) {
            return l0Var.k();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f13815b;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            e eVar = (e) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = eVar.f13858a;
            if ((i13 & 1) == 0) {
                break;
            }
            i12 += measuredHeight + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
            if (i11 == 0 && a0.B(childAt)) {
                i12 -= getTopInset();
            }
            if ((i13 & 2) != 0) {
                i12 -= a0.F(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f13815b = max;
        return max;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    boolean h() {
        return this.f13818e;
    }

    boolean j() {
        return getTotalScrollRange() != 0;
    }

    public boolean l() {
        return this.f13825l;
    }

    void m(int i10) {
        this.f13814a = i10;
        if (!willNotDraw()) {
            a0.h0(this);
        }
        List<b> list = this.f13821h;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f13821h.get(i11);
                if (bVar != null) {
                    bVar.a(this, i10);
                }
            }
        }
    }

    void n() {
        this.f13819f = 0;
    }

    public void o(boolean z10, boolean z11) {
        p(z10, z11, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        if (this.f13830q == null) {
            this.f13830q = new int[4];
        }
        int[] iArr = this.f13830q;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f13823j;
        int i11 = d5.b.D;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (z10 && this.f13824k) ? d5.b.E : -d5.b.E;
        int i12 = d5.b.B;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (z10 && this.f13824k) ? d5.b.A : -d5.b.A;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (a0.B(this) && v()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                a0.b0(getChildAt(childCount), topInset);
            }
        }
        k();
        this.f13818e = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            } else if (((e) getChildAt(i14).getLayoutParams()).d() != null) {
                this.f13818e = true;
                break;
            } else {
                i14++;
            }
        }
        Drawable drawable = this.f13831r;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f13822i) {
            return;
        }
        if (!this.f13825l && !i()) {
            z11 = false;
        }
        q(z11);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && a0.B(this) && v()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = x.a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        k();
    }

    boolean r(boolean z10) {
        return s(z10, !this.f13822i);
    }

    boolean s(boolean z10, boolean z11) {
        if (!z11 || this.f13824k == z10) {
            return false;
        }
        this.f13824k = z10;
        refreshDrawableState();
        if (this.f13825l && (getBackground() instanceof g)) {
            w((g) getBackground(), z10);
            return true;
        }
        return true;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        h.d(this, f10);
    }

    public void setExpanded(boolean z10) {
        o(z10, a0.U(this));
    }

    public void setLiftOnScroll(boolean z10) {
        this.f13825l = z10;
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f13826m = i10;
        c();
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f13822i = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 == 1) {
            super.setOrientation(i10);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f13831r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f13831r = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f13831r.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.f13831r, a0.E(this));
                this.f13831r.setVisible(getVisibility() == 0, false);
                this.f13831r.setCallback(this);
            }
            x();
            a0.h0(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(f.a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        if (Build.VERSION.SDK_INT >= 21) {
            com.google.android.material.appbar.e.a(this, f10);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f13831r;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    boolean u(View view) {
        View d10 = d(view);
        if (d10 != null) {
            view = d10;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f13831r;
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class e extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        int f13858a;

        /* renamed from: b  reason: collision with root package name */
        private c f13859b;

        /* renamed from: c  reason: collision with root package name */
        Interpolator f13860c;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f13858a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f24215m);
            this.f13858a = obtainStyledAttributes.getInt(k.f24231o, 0);
            f(a(obtainStyledAttributes.getInt(k.f24223n, 0)));
            int i10 = k.f24239p;
            if (obtainStyledAttributes.hasValue(i10)) {
                this.f13860c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i10, 0));
            }
            obtainStyledAttributes.recycle();
        }

        private c a(int i10) {
            if (i10 != 1) {
                return null;
            }
            return new d();
        }

        public c b() {
            return this.f13859b;
        }

        public int c() {
            return this.f13858a;
        }

        public Interpolator d() {
            return this.f13860c;
        }

        boolean e() {
            int i10 = this.f13858a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }

        public void f(c cVar) {
            this.f13859b = cVar;
        }

        public e(int i10, int i11) {
            super(i10, i11);
            this.f13858a = 1;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f13858a = 1;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f13858a = 1;
        }

        public e(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f13858a = 1;
        }
    }
}

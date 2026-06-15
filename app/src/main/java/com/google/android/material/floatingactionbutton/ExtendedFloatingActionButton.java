package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import d5.j;
import d5.k;
import e5.h;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    private static final int G = j.f24113o;
    static final Property<View, Float> H = new b(Float.class, "width");
    static final Property<View, Float> I = new c(Float.class, "height");
    static final Property<View, Float> J = new d(Float.class, "paddingStart");
    static final Property<View, Float> K = new e(Float.class, "paddingEnd");
    private int A;
    private final CoordinatorLayout.c<ExtendedFloatingActionButton> B;
    private boolean C;
    private boolean D;
    private boolean E;
    protected ColorStateList F;

    /* renamed from: t  reason: collision with root package name */
    private int f14232t;

    /* renamed from: u  reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.c f14233u;

    /* renamed from: v  reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.c f14234v;

    /* renamed from: w  reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.c f14235w;

    /* renamed from: x  reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.c f14236x;

    /* renamed from: y  reason: collision with root package name */
    private final int f14237y;

    /* renamed from: z  reason: collision with root package name */
    private int f14238z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f14244a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.google.android.material.floatingactionbutton.c f14245b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f14246c;

        a(com.google.android.material.floatingactionbutton.c cVar, f fVar) {
            this.f14245b = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f14244a = true;
            this.f14245b.e();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f14245b.f();
            if (this.f14244a) {
                return;
            }
            this.f14245b.i(this.f14246c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f14245b.onAnimationStart(animator);
            this.f14244a = false;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class b extends Property<View, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f10) {
            view.getLayoutParams().width = f10.intValue();
            view.requestLayout();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class c extends Property<View, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f10) {
            view.getLayoutParams().height = f10.intValue();
            view.requestLayout();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class d extends Property<View, Float> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(a0.J(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f10) {
            a0.D0(view, f10.intValue(), view.getPaddingTop(), a0.I(view), view.getPaddingBottom());
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class e extends Property<View, Float> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(a0.I(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f10) {
            a0.D0(view, a0.J(view), view.getPaddingTop(), f10.intValue(), view.getPaddingBottom());
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static abstract class f {
    }

    private boolean o() {
        return getVisibility() != 0 ? this.f14232t == 2 : this.f14232t != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(com.google.android.material.floatingactionbutton.c cVar, f fVar) {
        if (cVar.d()) {
            return;
        }
        if (!r()) {
            cVar.b();
            cVar.i(fVar);
            return;
        }
        measure(0, 0);
        AnimatorSet g10 = cVar.g();
        g10.addListener(new a(cVar, fVar));
        for (Animator.AnimatorListener animatorListener : cVar.h()) {
            g10.addListener(animatorListener);
        }
        g10.start();
    }

    private void q() {
        this.F = getTextColors();
    }

    private boolean r() {
        return (a0.U(this) || (!o() && this.E)) && !isInEditMode();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.B;
    }

    int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    int getCollapsedSize() {
        int i10 = this.f14237y;
        return i10 < 0 ? (Math.min(a0.J(this), a0.I(this)) * 2) + getIconSize() : i10;
    }

    public h getExtendMotionSpec() {
        return this.f14234v.c();
    }

    public h getHideMotionSpec() {
        return this.f14236x.c();
    }

    public h getShowMotionSpec() {
        return this.f14235w.c();
    }

    public h getShrinkMotionSpec() {
        return this.f14233u.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.C && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.C = false;
            this.f14233u.b();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
        this.E = z10;
    }

    public void setExtendMotionSpec(h hVar) {
        this.f14234v.a(hVar);
    }

    public void setExtendMotionSpecResource(int i10) {
        setExtendMotionSpec(h.c(getContext(), i10));
    }

    public void setExtended(boolean z10) {
        if (this.C == z10) {
            return;
        }
        com.google.android.material.floatingactionbutton.c cVar = z10 ? this.f14234v : this.f14233u;
        if (cVar.d()) {
            return;
        }
        cVar.b();
    }

    public void setHideMotionSpec(h hVar) {
        this.f14236x.a(hVar);
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(h.c(getContext(), i10));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        if (!this.C || this.D) {
            return;
        }
        this.f14238z = a0.J(this);
        this.A = a0.I(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        if (!this.C || this.D) {
            return;
        }
        this.f14238z = i10;
        this.A = i12;
    }

    public void setShowMotionSpec(h hVar) {
        this.f14235w.a(hVar);
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(h.c(getContext(), i10));
    }

    public void setShrinkMotionSpec(h hVar) {
        this.f14233u.a(hVar);
    }

    public void setShrinkMotionSpecResource(int i10) {
        setShrinkMotionSpec(h.c(getContext(), i10));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        q();
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f14239a;

        /* renamed from: b  reason: collision with root package name */
        private f f14240b;

        /* renamed from: c  reason: collision with root package name */
        private f f14241c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f14242d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f14243e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f14242d = false;
            this.f14243e = true;
        }

        private static boolean G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f14242d || this.f14243e) && ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).e() == view.getId();
        }

        private boolean L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (J(appBarLayout, extendedFloatingActionButton)) {
                if (this.f14239a == null) {
                    this.f14239a = new Rect();
                }
                Rect rect = this.f14239a;
                com.google.android.material.internal.c.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    K(extendedFloatingActionButton);
                    return true;
                }
                E(extendedFloatingActionButton);
                return true;
            }
            return false;
        }

        private boolean M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (J(view, extendedFloatingActionButton)) {
                if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                    K(extendedFloatingActionButton);
                    return true;
                }
                E(extendedFloatingActionButton);
                return true;
            }
            return false;
        }

        protected void E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            f fVar;
            boolean z10 = this.f14243e;
            if (z10) {
                fVar = this.f14241c;
            } else {
                fVar = this.f14240b;
            }
            extendedFloatingActionButton.p(z10 ? extendedFloatingActionButton.f14234v : extendedFloatingActionButton.f14235w, fVar);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: F */
        public boolean b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: H */
        public boolean h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (G(view)) {
                M(view, extendedFloatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: I */
        public boolean l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
            List<View> r10 = coordinatorLayout.r(extendedFloatingActionButton);
            int size = r10.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = r10.get(i11);
                if (view instanceof AppBarLayout) {
                    if (L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (G(view) && M(view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.I(extendedFloatingActionButton, i10);
            return true;
        }

        protected void K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            f fVar;
            boolean z10 = this.f14243e;
            if (z10) {
                fVar = this.f14241c;
            } else {
                fVar = this.f14240b;
            }
            extendedFloatingActionButton.p(z10 ? extendedFloatingActionButton.f14233u : extendedFloatingActionButton.f14236x, fVar);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f2415h == 0) {
                fVar.f2415h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f24257r1);
            this.f14242d = obtainStyledAttributes.getBoolean(k.f24265s1, false);
            this.f14243e = obtainStyledAttributes.getBoolean(k.f24273t1, true);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        q();
    }
}

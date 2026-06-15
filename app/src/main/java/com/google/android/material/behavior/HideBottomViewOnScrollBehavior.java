package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    private int f13887a;

    /* renamed from: b  reason: collision with root package name */
    private int f13888b;

    /* renamed from: c  reason: collision with root package name */
    private int f13889c;

    /* renamed from: d  reason: collision with root package name */
    private ViewPropertyAnimator f13890d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f13890d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f13887a = 0;
        this.f13888b = 2;
        this.f13889c = 0;
    }

    private void F(V v10, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f13890d = v10.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    public boolean G() {
        return this.f13888b == 1;
    }

    public boolean H() {
        return this.f13888b == 2;
    }

    public void I(V v10, int i10) {
        this.f13889c = i10;
        if (this.f13888b == 1) {
            v10.setTranslationY(this.f13887a + i10);
        }
    }

    public void J(V v10) {
        K(v10, true);
    }

    public void K(V v10, boolean z10) {
        if (G()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f13890d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        this.f13888b = 1;
        int i10 = this.f13887a + this.f13889c;
        if (z10) {
            F(v10, i10, 175L, e5.a.f25171c);
        } else {
            v10.setTranslationY(i10);
        }
    }

    public void L(V v10) {
        M(v10, true);
    }

    public void M(V v10, boolean z10) {
        if (H()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f13890d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        this.f13888b = 2;
        if (z10) {
            F(v10, 0, 225L, e5.a.f25172d);
        } else {
            v10.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        this.f13887a = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        return super.l(coordinatorLayout, v10, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            J(v10);
        } else if (i11 < 0) {
            L(v10);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13887a = 0;
        this.f13888b = 2;
        this.f13889c = 0;
    }
}

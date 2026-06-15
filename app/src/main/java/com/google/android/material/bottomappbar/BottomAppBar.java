package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.o;
import d5.j;
import e5.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u5.h;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: n0  reason: collision with root package name */
    private static final int f13909n0 = j.f24106h;
    private Integer R;
    private final int S;
    private final u5.g T;
    private Animator U;
    private Animator V;
    private int W;

    /* renamed from: a0  reason: collision with root package name */
    private int f13910a0;

    /* renamed from: b0  reason: collision with root package name */
    private boolean f13911b0;

    /* renamed from: c0  reason: collision with root package name */
    private int f13912c0;

    /* renamed from: d0  reason: collision with root package name */
    private ArrayList<g> f13913d0;

    /* renamed from: e0  reason: collision with root package name */
    private int f13914e0;

    /* renamed from: f0  reason: collision with root package name */
    private boolean f13915f0;

    /* renamed from: g0  reason: collision with root package name */
    private boolean f13916g0;

    /* renamed from: h0  reason: collision with root package name */
    private Behavior f13917h0;

    /* renamed from: i0  reason: collision with root package name */
    private int f13918i0;

    /* renamed from: j0  reason: collision with root package name */
    private int f13919j0;

    /* renamed from: k0  reason: collision with root package name */
    private int f13920k0;

    /* renamed from: l0  reason: collision with root package name */
    AnimatorListenerAdapter f13921l0;

    /* renamed from: m0  reason: collision with root package name */
    k<FloatingActionButton> f13922m0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        int f13928c;

        /* renamed from: d  reason: collision with root package name */
        boolean f13929d;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f13928c);
            parcel.writeInt(this.f13929d ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13928c = parcel.readInt();
            this.f13929d = parcel.readInt() != 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.n0();
            BottomAppBar.this.U = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.o0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b extends FloatingActionButton.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f13931a;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        class a extends FloatingActionButton.b {
            a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.n0();
            }
        }

        b(int i10) {
            this.f13931a = i10;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.s0(this.f13931a));
            floatingActionButton.s(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.n0();
            BottomAppBar.this.f13915f0 = false;
            BottomAppBar.this.V = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.o0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f13935a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ActionMenuView f13936b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f13937c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f13938d;

        d(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f13936b = actionMenuView;
            this.f13937c = i10;
            this.f13938d = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f13935a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f13935a) {
                return;
            }
            boolean z10 = BottomAppBar.this.f13914e0 != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.x0(bottomAppBar.f13914e0);
            BottomAppBar.this.D0(this.f13936b, this.f13937c, this.f13938d, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ActionMenuView f13940a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f13941b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f13942c;

        e(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f13940a = actionMenuView;
            this.f13941b = i10;
            this.f13942c = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuView actionMenuView = this.f13940a;
            actionMenuView.setTranslationX(BottomAppBar.this.r0(actionMenuView, this.f13941b, this.f13942c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f13921l0.onAnimationStart(animator);
            FloatingActionButton p02 = BottomAppBar.this.p0();
            if (p02 != null) {
                p02.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface g {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    private void C0(ActionMenuView actionMenuView, int i10, boolean z10) {
        D0(actionMenuView, i10, z10, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0(ActionMenuView actionMenuView, int i10, boolean z10, boolean z11) {
        e eVar = new e(actionMenuView, i10, z10);
        if (z11) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f13918i0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return s0(this.W);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f13920k0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f13919j0;
    }

    private com.google.android.material.bottomappbar.a getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.a) this.T.D().p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.f13921l0);
        floatingActionButton.f(new f());
        floatingActionButton.g(this.f13922m0);
    }

    private void j0() {
        Animator animator = this.V;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.U;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void l0(int i10, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(p0(), "translationX", s0(i10));
        ofFloat.setDuration(300L);
        list.add(ofFloat);
    }

    private void m0(int i10, boolean z10, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - r0(actionMenuView, i10, z10)) > 1.0f) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            ofFloat2.addListener(new d(actionMenuView, i10, z10));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(150L);
            animatorSet.playSequentially(ofFloat2, ofFloat);
            list.add(animatorSet);
        } else if (actionMenuView.getAlpha() < 1.0f) {
            list.add(ofFloat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0() {
        ArrayList<g> arrayList;
        int i10 = this.f13912c0 - 1;
        this.f13912c0 = i10;
        if (i10 != 0 || (arrayList = this.f13913d0) == null) {
            return;
        }
        Iterator<g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0() {
        ArrayList<g> arrayList;
        int i10 = this.f13912c0;
        this.f13912c0 = i10 + 1;
        if (i10 != 0 || (arrayList = this.f13913d0) == null) {
            return;
        }
        Iterator<g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FloatingActionButton p0() {
        View q02 = q0();
        if (q02 instanceof FloatingActionButton) {
            return (FloatingActionButton) q02;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View q0() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.s(r4)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L2c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L18
        L2c:
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.q0():android.view.View");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float s0(int i10) {
        boolean e8 = o.e(this);
        if (i10 == 1) {
            return ((getMeasuredWidth() / 2) - (this.S + (e8 ? this.f13920k0 : this.f13919j0))) * (e8 ? -1 : 1);
        }
        return 0.0f;
    }

    private boolean t0() {
        FloatingActionButton p02 = p0();
        return p02 != null && p02.o();
    }

    private void u0(int i10, boolean z10) {
        if (!a0.U(this)) {
            this.f13915f0 = false;
            x0(this.f13914e0);
            return;
        }
        Animator animator = this.V;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!t0()) {
            i10 = 0;
            z10 = false;
        }
        m0(i10, z10, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.V = animatorSet;
        animatorSet.addListener(new c());
        this.V.start();
    }

    private void v0(int i10) {
        if (this.W == i10 || !a0.U(this)) {
            return;
        }
        Animator animator = this.U;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f13910a0 == 1) {
            l0(i10, arrayList);
        } else {
            k0(i10, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.U = animatorSet;
        animatorSet.addListener(new a());
        this.U.start();
    }

    private Drawable w0(Drawable drawable) {
        if (drawable == null || this.R == null) {
            return drawable;
        }
        Drawable r10 = androidx.core.graphics.drawable.a.r(drawable.mutate());
        androidx.core.graphics.drawable.a.n(r10, this.R.intValue());
        return r10;
    }

    private void y0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.V != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (!t0()) {
            C0(actionMenuView, 0, false);
        } else {
            C0(actionMenuView, this.W, this.f13916g0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0() {
        getTopEdgeTreatment().o(getFabTranslationX());
        View q02 = q0();
        this.T.Y((this.f13916g0 && t0()) ? 1.0f : 0.0f);
        if (q02 != null) {
            q02.setTranslationY(getFabTranslationY());
            q02.setTranslationX(getFabTranslationX());
        }
    }

    public void A0(int i10, int i11) {
        this.f13914e0 = i11;
        this.f13915f0 = true;
        u0(i10, this.f13916g0);
        v0(i10);
        this.W = i10;
    }

    boolean B0(int i10) {
        float f10 = i10;
        if (f10 != getTopEdgeTreatment().i()) {
            getTopEdgeTreatment().n(f10);
            this.T.invalidateSelf();
            return true;
        }
        return false;
    }

    public ColorStateList getBackgroundTint() {
        return this.T.F();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().e();
    }

    public int getFabAlignmentMode() {
        return this.W;
    }

    public int getFabAnimationMode() {
        return this.f13910a0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().g();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().h();
    }

    public boolean getHideOnScroll() {
        return this.f13911b0;
    }

    protected void k0(int i10, List<Animator> list) {
        FloatingActionButton p02 = p0();
        if (p02 == null || p02.n()) {
            return;
        }
        o0();
        p02.l(new b(i10));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.f(this, this.T);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            j0();
            z0();
        }
        y0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.W = savedState.f13928c;
        this.f13916g0 = savedState.f13929d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f13928c = this.W;
        savedState.f13929d = this.f13916g0;
        return savedState;
    }

    protected int r0(ActionMenuView actionMenuView, int i10, boolean z10) {
        if (i10 == 1 && z10) {
            boolean e8 = o.e(this);
            int measuredWidth = e8 ? getMeasuredWidth() : 0;
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).f878a & 8388615) == 8388611) {
                    if (e8) {
                        measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                    } else {
                        measuredWidth = Math.max(measuredWidth, childAt.getRight());
                    }
                }
            }
            return measuredWidth - ((e8 ? actionMenuView.getRight() : actionMenuView.getLeft()) + (e8 ? this.f13919j0 : -this.f13920k0));
        }
        return 0;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        androidx.core.graphics.drawable.a.o(this.T, colorStateList);
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().j(f10);
            this.T.invalidateSelf();
            z0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        this.T.W(f10);
        getBehavior().I(this, this.T.C() - this.T.B());
    }

    public void setFabAlignmentMode(int i10) {
        A0(i10, 0);
    }

    public void setFabAnimationMode(int i10) {
        this.f13910a0 = i10;
    }

    void setFabCornerSize(float f10) {
        if (f10 != getTopEdgeTreatment().f()) {
            getTopEdgeTreatment().k(f10);
            this.T.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().l(f10);
            this.T.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().m(f10);
            this.T.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z10) {
        this.f13911b0 = z10;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(w0(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.R = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public void x0(int i10) {
        if (i10 != 0) {
            this.f13914e0 = 0;
            getMenu().clear();
            x(i10);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.f13917h0 == null) {
            this.f13917h0 = new Behavior();
        }
        return this.f13917h0;
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e  reason: collision with root package name */
        private final Rect f13923e;

        /* renamed from: f  reason: collision with root package name */
        private WeakReference<BottomAppBar> f13924f;

        /* renamed from: g  reason: collision with root package name */
        private int f13925g;

        /* renamed from: h  reason: collision with root package name */
        private final View.OnLayoutChangeListener f13926h;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f13924f.get();
                if (bottomAppBar != null && (view instanceof FloatingActionButton)) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.j(Behavior.this.f13923e);
                    int height = Behavior.this.f13923e.height();
                    bottomAppBar.B0(height);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().r().a(new RectF(Behavior.this.f13923e)));
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                    if (Behavior.this.f13925g == 0) {
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(d5.d.f24027y) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                        if (o.e(floatingActionButton)) {
                            ((ViewGroup.MarginLayoutParams) fVar).leftMargin += bottomAppBar.S;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) fVar).rightMargin += bottomAppBar.S;
                            return;
                        }
                    }
                    return;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f13926h = new a();
            this.f13923e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: Q */
        public boolean l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i10) {
            this.f13924f = new WeakReference<>(bottomAppBar);
            View q02 = bottomAppBar.q0();
            if (q02 != null && !a0.U(q02)) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) q02.getLayoutParams();
                fVar.f2411d = 49;
                this.f13925g = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                if (q02 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) q02;
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(d5.a.f23968b);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(d5.a.f23967a);
                    }
                    floatingActionButton.addOnLayoutChangeListener(this.f13926h);
                    bottomAppBar.i0(floatingActionButton);
                }
                bottomAppBar.z0();
            }
            coordinatorLayout.I(bottomAppBar, i10);
            return super.l(coordinatorLayout, bottomAppBar, i10);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: R */
        public boolean A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i10, int i11) {
            return bottomAppBar.getHideOnScroll() && super.A(coordinatorLayout, bottomAppBar, view, view2, i10, i11);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f13926h = new a();
            this.f13923e = new Rect();
        }
    }
}

package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.b;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: p  reason: collision with root package name */
    static final Handler f14467p;

    /* renamed from: q  reason: collision with root package name */
    private static final boolean f14468q;

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f14469r;

    /* renamed from: s  reason: collision with root package name */
    private static final String f14470s;

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f14471a;

    /* renamed from: b  reason: collision with root package name */
    protected final o f14472b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.android.material.snackbar.a f14473c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14474d;

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f14475e;

    /* renamed from: f  reason: collision with root package name */
    private int f14476f;

    /* renamed from: g  reason: collision with root package name */
    private int f14477g;

    /* renamed from: h  reason: collision with root package name */
    private int f14478h;

    /* renamed from: i  reason: collision with root package name */
    private int f14479i;

    /* renamed from: j  reason: collision with root package name */
    private int f14480j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f14481k;

    /* renamed from: l  reason: collision with root package name */
    private List<m<B>> f14482l;

    /* renamed from: m  reason: collision with root package name */
    private Behavior f14483m;

    /* renamed from: n  reason: collision with root package name */
    private final AccessibilityManager f14484n;

    /* renamed from: o  reason: collision with root package name */
    b.InterfaceC0190b f14485o;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k  reason: collision with root package name */
        private final n f14486k = new n(this);

        /* JADX INFO: Access modifiers changed from: private */
        public void P(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f14486k.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean E(View view) {
            return this.f14486k.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f14486k.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f14487a;

        a(int i10) {
            this.f14487a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.u(this.f14487a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f14472b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f14472b.setScaleX(floatValue);
            BaseTransientBottomBar.this.f14472b.setScaleY(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.v();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f14473c.a(70, 180);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private int f14492a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f14493b;

        e(int i10) {
            this.f14493b = i10;
            this.f14492a = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f14468q) {
                a0.b0(BaseTransientBottomBar.this.f14472b, intValue - this.f14492a);
            } else {
                BaseTransientBottomBar.this.f14472b.setTranslationY(intValue);
            }
            this.f14492a = intValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f14495a;

        f(int i10) {
            this.f14495a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.u(this.f14495a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f14473c.b(0, 180);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private int f14497a = 0;

        g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f14468q) {
                a0.b0(BaseTransientBottomBar.this.f14472b, intValue - this.f14497a);
            } else {
                BaseTransientBottomBar.this.f14472b.setTranslationY(intValue);
            }
            this.f14497a = intValue;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class h implements Handler.Callback {
        h() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                ((BaseTransientBottomBar) message.obj).A();
                return true;
            } else if (i10 != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).o(message.arg1);
                return true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.u(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class j implements SwipeDismissBehavior.c {
        j() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.i(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i10) {
            if (i10 == 0) {
                com.google.android.material.snackbar.b.c().k(BaseTransientBottomBar.this.f14485o);
            } else if (i10 == 1 || i10 == 2) {
                com.google.android.material.snackbar.b.c().j(BaseTransientBottomBar.this.f14485o);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o oVar = BaseTransientBottomBar.this.f14472b;
            if (oVar == null) {
                return;
            }
            if (oVar.getParent() != null) {
                BaseTransientBottomBar.this.f14472b.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f14472b.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.C();
            } else {
                BaseTransientBottomBar.this.E();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class l extends AnimatorListenerAdapter {
        l() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.v();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static abstract class m<B> {
        public void a(B b10, int i10) {
        }

        public void b(B b10) {
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class n {

        /* renamed from: a  reason: collision with root package name */
        private b.InterfaceC0190b f14503a;

        public n(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.L(0.1f);
            swipeDismissBehavior.J(0.6f);
            swipeDismissBehavior.M(0);
        }

        public boolean a(View view) {
            return view instanceof o;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.b.c().j(this.f14503a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.b.c().k(this.f14503a);
            }
        }

        public void c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f14503a = baseTransientBottomBar.f14485o;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class o extends FrameLayout {

        /* renamed from: k  reason: collision with root package name */
        private static final View.OnTouchListener f14504k = new a();

        /* renamed from: a  reason: collision with root package name */
        private BaseTransientBottomBar<?> f14505a;

        /* renamed from: b  reason: collision with root package name */
        private int f14506b;

        /* renamed from: c  reason: collision with root package name */
        private final float f14507c;

        /* renamed from: d  reason: collision with root package name */
        private final float f14508d;

        /* renamed from: e  reason: collision with root package name */
        private final int f14509e;

        /* renamed from: f  reason: collision with root package name */
        private final int f14510f;

        /* renamed from: g  reason: collision with root package name */
        private ColorStateList f14511g;

        /* renamed from: h  reason: collision with root package name */
        private PorterDuff.Mode f14512h;

        /* renamed from: i  reason: collision with root package name */
        private Rect f14513i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f14514j;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public o(Context context, AttributeSet attributeSet) {
            super(v5.a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, d5.k.f24276t4);
            int i10 = d5.k.A4;
            if (obtainStyledAttributes.hasValue(i10)) {
                a0.y0(this, obtainStyledAttributes.getDimensionPixelSize(i10, 0));
            }
            this.f14506b = obtainStyledAttributes.getInt(d5.k.f24300w4, 0);
            this.f14507c = obtainStyledAttributes.getFloat(d5.k.f24308x4, 1.0f);
            setBackgroundTintList(r5.c.a(context2, obtainStyledAttributes, d5.k.f24316y4));
            setBackgroundTintMode(com.google.android.material.internal.o.f(obtainStyledAttributes.getInt(d5.k.f24324z4, -1), PorterDuff.Mode.SRC_IN));
            this.f14508d = obtainStyledAttributes.getFloat(d5.k.f24292v4, 1.0f);
            this.f14509e = obtainStyledAttributes.getDimensionPixelSize(d5.k.f24284u4, -1);
            this.f14510f = obtainStyledAttributes.getDimensionPixelSize(d5.k.B4, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f14504k);
            setFocusable(true);
            if (getBackground() == null) {
                a0.u0(this, c());
            }
        }

        private Drawable c() {
            float dimension = getResources().getDimension(d5.d.O);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(j5.a.i(this, d5.b.f23981k, d5.b.f23978h, getBackgroundOverlayColorAlpha()));
            if (this.f14511g != null) {
                Drawable r10 = androidx.core.graphics.drawable.a.r(gradientDrawable);
                androidx.core.graphics.drawable.a.o(r10, this.f14511g);
                return r10;
            }
            return androidx.core.graphics.drawable.a.r(gradientDrawable);
        }

        private void d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f14513i = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f14505a = baseTransientBottomBar;
        }

        void b(ViewGroup viewGroup) {
            this.f14514j = true;
            viewGroup.addView(this);
            this.f14514j = false;
        }

        float getActionTextColorAlpha() {
            return this.f14508d;
        }

        int getAnimationMode() {
            return this.f14506b;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f14507c;
        }

        int getMaxInlineActionWidth() {
            return this.f14510f;
        }

        int getMaxWidth() {
            return this.f14509e;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f14505a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.r();
            }
            a0.n0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f14505a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.s();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f14505a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.t();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f14509e > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f14509e;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        void setAnimationMode(int i10) {
            this.f14506b = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f14511g != null) {
                drawable = androidx.core.graphics.drawable.a.r(drawable.mutate());
                androidx.core.graphics.drawable.a.o(drawable, this.f14511g);
                androidx.core.graphics.drawable.a.p(drawable, this.f14512h);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f14511g = colorStateList;
            if (getBackground() != null) {
                Drawable r10 = androidx.core.graphics.drawable.a.r(getBackground().mutate());
                androidx.core.graphics.drawable.a.o(r10, colorStateList);
                androidx.core.graphics.drawable.a.p(r10, this.f14512h);
                if (r10 != getBackground()) {
                    super.setBackgroundDrawable(r10);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f14512h = mode;
            if (getBackground() != null) {
                Drawable r10 = androidx.core.graphics.drawable.a.r(getBackground().mutate());
                androidx.core.graphics.drawable.a.p(r10, mode);
                if (r10 != getBackground()) {
                    super.setBackgroundDrawable(r10);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f14514j || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            d((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f14505a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.G();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f14504k);
            super.setOnClickListener(onClickListener);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f14468q = i10 >= 16 && i10 <= 19;
        f14469r = new int[]{d5.b.f23996z};
        f14470s = BaseTransientBottomBar.class.getSimpleName();
        f14467p = new Handler(Looper.getMainLooper(), new h());
    }

    private void B() {
        if (y()) {
            f();
            return;
        }
        if (this.f14472b.getParent() != null) {
            this.f14472b.setVisibility(0);
        }
        v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        ValueAnimator j10 = j(0.0f, 1.0f);
        ValueAnimator m7 = m(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(j10, m7);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new l());
        animatorSet.start();
    }

    private void D(int i10) {
        ValueAnimator j10 = j(1.0f, 0.0f);
        j10.setDuration(75L);
        j10.addListener(new a(i10));
        j10.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        int n10 = n();
        if (f14468q) {
            a0.b0(this.f14472b, n10);
        } else {
            this.f14472b.setTranslationY(n10);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(n10, 0);
        valueAnimator.setInterpolator(e5.a.f25170b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e(n10));
        valueAnimator.start();
    }

    private void F(int i10) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, n());
        valueAnimator.setInterpolator(e5.a.f25170b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new f(i10));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        ViewGroup.LayoutParams layoutParams = this.f14472b.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && this.f14472b.f14513i != null) {
            if (this.f14472b.getParent() == null) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = this.f14472b.f14513i.bottom + (k() != null ? this.f14480j : this.f14476f);
            marginLayoutParams.leftMargin = this.f14472b.f14513i.left + this.f14477g;
            marginLayoutParams.rightMargin = this.f14472b.f14513i.right + this.f14478h;
            marginLayoutParams.topMargin = this.f14472b.f14513i.top;
            this.f14472b.requestLayout();
            if (Build.VERSION.SDK_INT < 29 || !z()) {
                return;
            }
            this.f14472b.removeCallbacks(this.f14475e);
            this.f14472b.post(this.f14475e);
            return;
        }
        Log.w(f14470s, "Unable to update margins because layout params are not MarginLayoutParams");
    }

    private void g(int i10) {
        if (this.f14472b.getAnimationMode() == 1) {
            D(i10);
        } else {
            F(i10);
        }
    }

    private int h() {
        if (k() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        k().getLocationOnScreen(iArr);
        int i10 = iArr[1];
        int[] iArr2 = new int[2];
        this.f14471a.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f14471a.getHeight()) - i10;
    }

    private ValueAnimator j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(e5.a.f25169a);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    private ValueAnimator m(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(e5.a.f25172d);
        ofFloat.addUpdateListener(new c());
        return ofFloat;
    }

    private int n() {
        int height = this.f14472b.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f14472b.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    private boolean q() {
        ViewGroup.LayoutParams layoutParams = this.f14472b.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    private void w() {
        this.f14480j = h();
        G();
    }

    private void x(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehavior = this.f14483m;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = l();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).P(this);
        }
        swipeDismissBehavior.K(new j());
        fVar.o(swipeDismissBehavior);
        if (k() == null) {
            fVar.f2414g = 80;
        }
    }

    private boolean z() {
        return this.f14479i > 0 && !this.f14474d && q();
    }

    final void A() {
        if (this.f14472b.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f14472b.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                x((CoordinatorLayout.f) layoutParams);
            }
            this.f14472b.b(this.f14471a);
            w();
            this.f14472b.setVisibility(4);
        }
        if (a0.U(this.f14472b)) {
            B();
        } else {
            this.f14481k = true;
        }
    }

    void f() {
        this.f14472b.post(new k());
    }

    protected void i(int i10) {
        com.google.android.material.snackbar.b.c().b(this.f14485o, i10);
    }

    public View k() {
        return null;
    }

    protected SwipeDismissBehavior<? extends View> l() {
        return new Behavior();
    }

    final void o(int i10) {
        if (y() && this.f14472b.getVisibility() == 0) {
            g(i10);
        } else {
            u(i10);
        }
    }

    public boolean p() {
        return com.google.android.material.snackbar.b.c().e(this.f14485o);
    }

    void r() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f14472b.getRootWindowInsets()) == null) {
            return;
        }
        this.f14479i = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        G();
    }

    void s() {
        if (p()) {
            f14467p.post(new i());
        }
    }

    void t() {
        if (this.f14481k) {
            B();
            this.f14481k = false;
        }
    }

    void u(int i10) {
        com.google.android.material.snackbar.b.c().h(this.f14485o);
        List<m<B>> list = this.f14482l;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f14482l.get(size).a(this, i10);
            }
        }
        ViewParent parent = this.f14472b.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f14472b);
        }
    }

    void v() {
        com.google.android.material.snackbar.b.c().i(this.f14485o);
        List<m<B>> list = this.f14482l;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f14482l.get(size).b(this);
            }
        }
    }

    boolean y() {
        AccessibilityManager accessibilityManager = this.f14484n;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }
}

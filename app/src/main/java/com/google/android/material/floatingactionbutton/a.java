package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.a0;
import java.util.ArrayList;
import java.util.Iterator;
import u5.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a {
    static final TimeInterpolator C = e5.a.f25171c;
    static final int[] D = {16842919, 16842910};
    static final int[] E = {16843623, 16842908, 16842910};
    static final int[] F = {16842908, 16842910};
    static final int[] G = {16843623, 16842910};
    static final int[] H = {16842910};
    static final int[] I = new int[0];
    private ViewTreeObserver.OnPreDrawListener B;

    /* renamed from: a  reason: collision with root package name */
    u5.k f14271a;

    /* renamed from: b  reason: collision with root package name */
    u5.g f14272b;

    /* renamed from: c  reason: collision with root package name */
    Drawable f14273c;

    /* renamed from: d  reason: collision with root package name */
    Drawable f14274d;

    /* renamed from: e  reason: collision with root package name */
    boolean f14275e;

    /* renamed from: g  reason: collision with root package name */
    float f14277g;

    /* renamed from: h  reason: collision with root package name */
    float f14278h;

    /* renamed from: i  reason: collision with root package name */
    float f14279i;

    /* renamed from: j  reason: collision with root package name */
    int f14280j;

    /* renamed from: k  reason: collision with root package name */
    private final com.google.android.material.internal.i f14281k;

    /* renamed from: l  reason: collision with root package name */
    private Animator f14282l;

    /* renamed from: m  reason: collision with root package name */
    private e5.h f14283m;

    /* renamed from: n  reason: collision with root package name */
    private e5.h f14284n;

    /* renamed from: o  reason: collision with root package name */
    private float f14285o;

    /* renamed from: q  reason: collision with root package name */
    private int f14287q;

    /* renamed from: s  reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f14289s;

    /* renamed from: t  reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f14290t;

    /* renamed from: u  reason: collision with root package name */
    private ArrayList<j> f14291u;

    /* renamed from: v  reason: collision with root package name */
    final FloatingActionButton f14292v;

    /* renamed from: w  reason: collision with root package name */
    final t5.b f14293w;

    /* renamed from: f  reason: collision with root package name */
    boolean f14276f = true;

    /* renamed from: p  reason: collision with root package name */
    private float f14286p = 1.0f;

    /* renamed from: r  reason: collision with root package name */
    private int f14288r = 0;

    /* renamed from: x  reason: collision with root package name */
    private final Rect f14294x = new Rect();

    /* renamed from: y  reason: collision with root package name */
    private final RectF f14295y = new RectF();

    /* renamed from: z  reason: collision with root package name */
    private final RectF f14296z = new RectF();
    private final Matrix A = new Matrix();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class C0188a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f14297a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f14298b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f14299c;

        C0188a(boolean z10, k kVar) {
            this.f14298b = z10;
            this.f14299c = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f14297a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f14288r = 0;
            a.this.f14282l = null;
            if (this.f14297a) {
                return;
            }
            FloatingActionButton floatingActionButton = a.this.f14292v;
            boolean z10 = this.f14298b;
            floatingActionButton.b(z10 ? 8 : 4, z10);
            k kVar = this.f14299c;
            if (kVar != null) {
                kVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f14292v.b(0, this.f14298b);
            a.this.f14288r = 1;
            a.this.f14282l = animator;
            this.f14297a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f14301a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f14302b;

        b(boolean z10, k kVar) {
            this.f14301a = z10;
            this.f14302b = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f14288r = 0;
            a.this.f14282l = null;
            k kVar = this.f14302b;
            if (kVar != null) {
                kVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f14292v.b(0, this.f14301a);
            a.this.f14288r = 2;
            a.this.f14282l = animator;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class c extends e5.g {
        c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            a.this.f14286p = f10;
            return super.a(f10, matrix, matrix2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f14305a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f14306b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f14307c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f14308d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f14309e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f14310f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ float f14311g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Matrix f14312h;

        d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            this.f14305a = f10;
            this.f14306b = f11;
            this.f14307c = f12;
            this.f14308d = f13;
            this.f14309e = f14;
            this.f14310f = f15;
            this.f14311g = f16;
            this.f14312h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f14292v.setAlpha(e5.a.b(this.f14305a, this.f14306b, 0.0f, 0.2f, floatValue));
            a.this.f14292v.setScaleX(e5.a.a(this.f14307c, this.f14308d, floatValue));
            a.this.f14292v.setScaleY(e5.a.a(this.f14309e, this.f14308d, floatValue));
            a.this.f14286p = e5.a.a(this.f14310f, this.f14311g, floatValue);
            a.this.h(e5.a.a(this.f14310f, this.f14311g, floatValue), this.f14312h);
            a.this.f14292v.setImageMatrix(this.f14312h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class e implements TypeEvaluator<Float> {

        /* renamed from: a  reason: collision with root package name */
        FloatEvaluator f14314a = new FloatEvaluator();

        e() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Float evaluate(float f10, Float f11, Float f12) {
            float floatValue = this.f14314a.evaluate(f10, (Number) f11, (Number) f12).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class f implements ViewTreeObserver.OnPreDrawListener {
        f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a.this.F();
            return true;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private class g extends m {
        g() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        protected float a() {
            return 0.0f;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private class h extends m {
        h() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        protected float a() {
            a aVar = a.this;
            return aVar.f14277g + aVar.f14278h;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private class i extends m {
        i() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        protected float a() {
            a aVar = a.this;
            return aVar.f14277g + aVar.f14279i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface j {
        void a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface k {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private class l extends m {
        l() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        protected float a() {
            return a.this.f14277g;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private abstract class m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private boolean f14321a;

        /* renamed from: b  reason: collision with root package name */
        private float f14322b;

        /* renamed from: c  reason: collision with root package name */
        private float f14323c;

        private m() {
        }

        protected abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.d0((int) this.f14323c);
            this.f14321a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f14321a) {
                u5.g gVar = a.this.f14272b;
                this.f14322b = gVar == null ? 0.0f : gVar.w();
                this.f14323c = a();
                this.f14321a = true;
            }
            a aVar = a.this;
            float f10 = this.f14322b;
            aVar.d0((int) (f10 + ((this.f14323c - f10) * valueAnimator.getAnimatedFraction())));
        }

        /* synthetic */ m(a aVar, C0188a c0188a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(FloatingActionButton floatingActionButton, t5.b bVar) {
        this.f14292v = floatingActionButton;
        this.f14293w = bVar;
        com.google.android.material.internal.i iVar = new com.google.android.material.internal.i();
        this.f14281k = iVar;
        iVar.a(D, k(new i()));
        iVar.a(E, k(new h()));
        iVar.a(F, k(new h()));
        iVar.a(G, k(new h()));
        iVar.a(H, k(new l()));
        iVar.a(I, k(new g()));
        this.f14285o = floatingActionButton.getRotation();
    }

    private boolean X() {
        return a0.U(this.f14292v) && !this.f14292v.isInEditMode();
    }

    private void e0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f14292v.getDrawable();
        if (drawable == null || this.f14287q == 0) {
            return;
        }
        RectF rectF = this.f14295y;
        RectF rectF2 = this.f14296z;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i10 = this.f14287q;
        rectF2.set(0.0f, 0.0f, i10, i10);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i11 = this.f14287q;
        matrix.postScale(f10, f10, i11 / 2.0f, i11 / 2.0f);
    }

    private AnimatorSet i(e5.h hVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f14292v, View.ALPHA, f10);
        hVar.e("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f14292v, View.SCALE_X, f11);
        hVar.e("scale").a(ofFloat2);
        e0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f14292v, View.SCALE_Y, f11);
        hVar.e("scale").a(ofFloat3);
        e0(ofFloat3);
        arrayList.add(ofFloat3);
        h(f12, this.A);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f14292v, new e5.f(), new c(), new Matrix(this.A));
        hVar.e("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        e5.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet j(float f10, float f11, float f12) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new d(this.f14292v.getAlpha(), f10, this.f14292v.getScaleX(), f11, this.f14292v.getScaleY(), this.f14286p, f12, new Matrix(this.A)));
        arrayList.add(ofFloat);
        e5.b.a(animatorSet, arrayList);
        animatorSet.setDuration(p5.a.d(this.f14292v.getContext(), d5.b.f23992v, this.f14292v.getContext().getResources().getInteger(d5.g.f24063b)));
        animatorSet.setInterpolator(p5.a.e(this.f14292v.getContext(), d5.b.f23993w, e5.a.f25170b));
        return animatorSet;
    }

    private ValueAnimator k(m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(C);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private ViewTreeObserver.OnPreDrawListener q() {
        if (this.B == null) {
            this.B = new f();
        }
        return this.B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B() {
        ViewTreeObserver viewTreeObserver = this.f14292v.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.B;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.B = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C(int[] iArr) {
        this.f14281k.d(iArr);
    }

    void D(float f10, float f11, float f12) {
        c0();
        d0(f10);
    }

    void E(Rect rect) {
        androidx.core.util.i.g(this.f14274d, "Didn't initialize content background");
        if (W()) {
            this.f14293w.b(new InsetDrawable(this.f14274d, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.f14293w.b(this.f14274d);
    }

    void F() {
        float rotation = this.f14292v.getRotation();
        if (this.f14285o != rotation) {
            this.f14285o = rotation;
            a0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G() {
        ArrayList<j> arrayList = this.f14291u;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H() {
        ArrayList<j> arrayList = this.f14291u;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    boolean I() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(ColorStateList colorStateList) {
        u5.g gVar = this.f14272b;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(PorterDuff.Mode mode) {
        u5.g gVar = this.f14272b;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void L(float f10) {
        if (this.f14277g != f10) {
            this.f14277g = f10;
            D(f10, this.f14278h, this.f14279i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M(boolean z10) {
        this.f14275e = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void N(e5.h hVar) {
        this.f14284n = hVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void O(float f10) {
        if (this.f14278h != f10) {
            this.f14278h = f10;
            D(this.f14277g, f10, this.f14279i);
        }
    }

    final void P(float f10) {
        this.f14286p = f10;
        Matrix matrix = this.A;
        h(f10, matrix);
        this.f14292v.setImageMatrix(matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Q(int i10) {
        if (this.f14287q != i10) {
            this.f14287q = i10;
            b0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void R(float f10) {
        if (this.f14279i != f10) {
            this.f14279i = f10;
            D(this.f14277g, this.f14278h, f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S(ColorStateList colorStateList) {
        Drawable drawable = this.f14273c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, s5.b.a(colorStateList));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(boolean z10) {
        this.f14276f = z10;
        c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void U(u5.k kVar) {
        this.f14271a = kVar;
        u5.g gVar = this.f14272b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Drawable drawable = this.f14273c;
        if (drawable instanceof n) {
            ((n) drawable).setShapeAppearanceModel(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void V(e5.h hVar) {
        this.f14283m = hVar;
    }

    boolean W() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Y() {
        return !this.f14275e || this.f14292v.getSizeDimension() >= this.f14280j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z(k kVar, boolean z10) {
        AnimatorSet j10;
        if (x()) {
            return;
        }
        Animator animator = this.f14282l;
        if (animator != null) {
            animator.cancel();
        }
        boolean z11 = this.f14283m == null;
        if (X()) {
            if (this.f14292v.getVisibility() != 0) {
                this.f14292v.setAlpha(0.0f);
                this.f14292v.setScaleY(z11 ? 0.4f : 0.0f);
                this.f14292v.setScaleX(z11 ? 0.4f : 0.0f);
                P(z11 ? 0.4f : 0.0f);
            }
            e5.h hVar = this.f14283m;
            if (hVar != null) {
                j10 = i(hVar, 1.0f, 1.0f, 1.0f);
            } else {
                j10 = j(1.0f, 1.0f, 1.0f);
            }
            j10.addListener(new b(z10, kVar));
            ArrayList<Animator.AnimatorListener> arrayList = this.f14289s;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    j10.addListener(it.next());
                }
            }
            j10.start();
            return;
        }
        this.f14292v.b(0, z10);
        this.f14292v.setAlpha(1.0f);
        this.f14292v.setScaleY(1.0f);
        this.f14292v.setScaleX(1.0f);
        P(1.0f);
        if (kVar != null) {
            kVar.a();
        }
    }

    void a0() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f14285o % 90.0f != 0.0f) {
                if (this.f14292v.getLayerType() != 1) {
                    this.f14292v.setLayerType(1, null);
                }
            } else if (this.f14292v.getLayerType() != 0) {
                this.f14292v.setLayerType(0, null);
            }
        }
        u5.g gVar = this.f14272b;
        if (gVar != null) {
            gVar.b0((int) this.f14285o);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b0() {
        P(this.f14286p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c0() {
        Rect rect = this.f14294x;
        r(rect);
        E(rect);
        this.f14293w.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d0(float f10) {
        u5.g gVar = this.f14272b;
        if (gVar != null) {
            gVar.W(f10);
        }
    }

    public void e(Animator.AnimatorListener animatorListener) {
        if (this.f14290t == null) {
            this.f14290t = new ArrayList<>();
        }
        this.f14290t.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Animator.AnimatorListener animatorListener) {
        if (this.f14289s == null) {
            this.f14289s = new ArrayList<>();
        }
        this.f14289s.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(j jVar) {
        if (this.f14291u == null) {
            this.f14291u = new ArrayList<>();
        }
        this.f14291u.add(jVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Drawable l() {
        return this.f14274d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float m() {
        return this.f14277g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n() {
        return this.f14275e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final e5.h o() {
        return this.f14284n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float p() {
        return this.f14278h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(Rect rect) {
        int sizeDimension = this.f14275e ? (this.f14280j - this.f14292v.getSizeDimension()) / 2 : 0;
        float m7 = this.f14276f ? m() + this.f14279i : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil(m7));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(m7 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float s() {
        return this.f14279i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final u5.k t() {
        return this.f14271a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final e5.h u() {
        return this.f14283m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(k kVar, boolean z10) {
        AnimatorSet j10;
        if (w()) {
            return;
        }
        Animator animator = this.f14282l;
        if (animator != null) {
            animator.cancel();
        }
        if (X()) {
            e5.h hVar = this.f14284n;
            if (hVar != null) {
                j10 = i(hVar, 0.0f, 0.0f, 0.0f);
            } else {
                j10 = j(0.0f, 0.4f, 0.4f);
            }
            j10.addListener(new C0188a(z10, kVar));
            ArrayList<Animator.AnimatorListener> arrayList = this.f14290t;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    j10.addListener(it.next());
                }
            }
            j10.start();
            return;
        }
        this.f14292v.b(z10 ? 8 : 4, z10);
        if (kVar != null) {
            kVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean w() {
        return this.f14292v.getVisibility() == 0 ? this.f14288r == 1 : this.f14288r != 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x() {
        return this.f14292v.getVisibility() != 0 ? this.f14288r == 2 : this.f14288r != 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y() {
        this.f14281k.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z() {
        u5.g gVar = this.f14272b;
        if (gVar != null) {
            u5.h.f(this.f14292v, gVar);
        }
        if (I()) {
            this.f14292v.getViewTreeObserver().addOnPreDrawListener(q());
        }
    }
}

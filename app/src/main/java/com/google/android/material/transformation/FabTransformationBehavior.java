package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.ironsource.b9;
import d5.f;
import e5.h;
import e5.i;
import e5.j;
import h5.d;
import java.util.ArrayList;
import java.util.List;
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    private final Rect f14738c;

    /* renamed from: d  reason: collision with root package name */
    private final RectF f14739d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f14740e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f14741f;

    /* renamed from: g  reason: collision with root package name */
    private float f14742g;

    /* renamed from: h  reason: collision with root package name */
    private float f14743h;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f14744a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f14745b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f14746c;

        a(boolean z10, View view, View view2) {
            this.f14744a = z10;
            this.f14745b = view;
            this.f14746c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f14744a) {
                return;
            }
            this.f14745b.setVisibility(4);
            this.f14746c.setAlpha(1.0f);
            this.f14746c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f14744a) {
                this.f14745b.setVisibility(0);
                this.f14746c.setAlpha(0.0f);
                this.f14746c.setVisibility(4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f14748a;

        b(View view) {
            this.f14748a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f14748a.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h5.d f14750a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Drawable f14751b;

        c(h5.d dVar, Drawable drawable) {
            this.f14750a = dVar;
            this.f14751b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f14750a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f14750a.setCircularRevealOverlayDrawable(this.f14751b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h5.d f14753a;

        d(h5.d dVar) {
            this.f14753a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.e revealInfo = this.f14753a.getRevealInfo();
            revealInfo.f26227c = Float.MAX_VALUE;
            this.f14753a.setRevealInfo(revealInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public h f14755a;

        /* renamed from: b  reason: collision with root package name */
        public j f14756b;
    }

    public FabTransformationBehavior() {
        this.f14738c = new Rect();
        this.f14739d = new RectF();
        this.f14740e = new RectF();
        this.f14741f = new int[2];
    }

    private ViewGroup K(View view) {
        View findViewById = view.findViewById(f.A);
        if (findViewById != null) {
            return f0(findViewById);
        }
        if (!(view instanceof w5.b) && !(view instanceof w5.a)) {
            return f0(view);
        }
        return f0(((ViewGroup) view).getChildAt(0));
    }

    private void L(View view, e eVar, i iVar, i iVar2, float f10, float f11, float f12, float f13, RectF rectF) {
        float S = S(eVar, iVar, f10, f12);
        float S2 = S(eVar, iVar2, f11, f13);
        Rect rect = this.f14738c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f14739d;
        rectF2.set(rect);
        RectF rectF3 = this.f14740e;
        T(view, rectF3);
        rectF3.offset(S, S2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void M(View view, RectF rectF) {
        T(view, rectF);
        rectF.offset(this.f14742g, this.f14743h);
    }

    private Pair<i, i> N(float f10, float f11, boolean z10, e eVar) {
        i e8;
        i e10;
        int i10;
        if (f10 == 0.0f || f11 == 0.0f) {
            e8 = eVar.f14755a.e("translationXLinear");
            e10 = eVar.f14755a.e("translationYLinear");
        } else if ((z10 && f11 < 0.0f) || (!z10 && i10 > 0)) {
            e8 = eVar.f14755a.e("translationXCurveUpwards");
            e10 = eVar.f14755a.e("translationYCurveUpwards");
        } else {
            e8 = eVar.f14755a.e("translationXCurveDownwards");
            e10 = eVar.f14755a.e("translationYCurveDownwards");
        }
        return new Pair<>(e8, e10);
    }

    private float O(View view, View view2, j jVar) {
        RectF rectF = this.f14739d;
        RectF rectF2 = this.f14740e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(-Q(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float P(View view, View view2, j jVar) {
        RectF rectF = this.f14739d;
        RectF rectF2 = this.f14740e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(0.0f, -R(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    private float Q(View view, View view2, j jVar) {
        float centerX;
        float centerX2;
        float f10;
        RectF rectF = this.f14739d;
        RectF rectF2 = this.f14740e;
        M(view, rectF);
        T(view2, rectF2);
        int i10 = jVar.f25189a & 7;
        if (i10 == 1) {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        } else if (i10 == 3) {
            centerX = rectF2.left;
            centerX2 = rectF.left;
        } else if (i10 == 5) {
            centerX = rectF2.right;
            centerX2 = rectF.right;
        } else {
            f10 = 0.0f;
            return f10 + jVar.f25190b;
        }
        f10 = centerX - centerX2;
        return f10 + jVar.f25190b;
    }

    private float R(View view, View view2, j jVar) {
        float centerY;
        float centerY2;
        float f10;
        RectF rectF = this.f14739d;
        RectF rectF2 = this.f14740e;
        M(view, rectF);
        T(view2, rectF2);
        int i10 = jVar.f25189a & 112;
        if (i10 == 16) {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        } else if (i10 == 48) {
            centerY = rectF2.top;
            centerY2 = rectF.top;
        } else if (i10 == 80) {
            centerY = rectF2.bottom;
            centerY2 = rectF.bottom;
        } else {
            f10 = 0.0f;
            return f10 + jVar.f25191c;
        }
        f10 = centerY - centerY2;
        return f10 + jVar.f25191c;
    }

    private float S(e eVar, i iVar, float f10, float f11) {
        long c10 = iVar.c();
        long d10 = iVar.d();
        i e8 = eVar.f14755a.e("expansion");
        return e5.a.a(f10, f11, iVar.e().getInterpolation(((float) (((e8.c() + e8.d()) + 17) - c10)) / ((float) d10)));
    }

    private void T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f14741f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void U(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup K;
        ObjectAnimator ofFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof h5.d) && h5.c.f26220a == 0) || (K = K(view2)) == null) {
                return;
            }
            if (z10) {
                if (!z11) {
                    e5.d.f25175a.set(K, Float.valueOf(0.0f));
                }
                ofFloat = ObjectAnimator.ofFloat(K, e5.d.f25175a, 1.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(K, e5.d.f25175a, 0.0f);
            }
            eVar.f14755a.e("contentFade").a(ofFloat);
            list.add(ofFloat);
        }
    }

    private void V(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if (view2 instanceof h5.d) {
            h5.d dVar = (h5.d) view2;
            int d02 = d0(view);
            int i10 = 16777215 & d02;
            if (z10) {
                if (!z11) {
                    dVar.setCircularRevealScrimColor(d02);
                }
                ofInt = ObjectAnimator.ofInt(dVar, d.C0295d.f26224a, i10);
            } else {
                ofInt = ObjectAnimator.ofInt(dVar, d.C0295d.f26224a, d02);
            }
            ofInt.setEvaluator(e5.c.b());
            eVar.f14755a.e(b9.h.S).a(ofInt);
            list.add(ofInt);
        }
    }

    private void W(View view, View view2, boolean z10, e eVar, List<Animator> list) {
        float Q = Q(view, view2, eVar.f14756b);
        float R = R(view, view2, eVar.f14756b);
        Pair<i, i> N = N(Q, R, z10, eVar);
        i iVar = (i) N.first;
        i iVar2 = (i) N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z10) {
            Q = this.f14742g;
        }
        fArr[0] = Q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z10) {
            R = this.f14743h;
        }
        fArr2[0] = R;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        iVar.a(ofFloat);
        iVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    private void X(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        float y10 = a0.y(view2) - a0.y(view);
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-y10);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -y10);
        }
        eVar.f14755a.e("elevation").a(ofFloat);
        list.add(ofFloat);
    }

    private void Y(View view, View view2, boolean z10, boolean z11, e eVar, float f10, float f11, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (view2 instanceof h5.d) {
            h5.d dVar = (h5.d) view2;
            float O = O(view, view2, eVar.f14756b);
            float P = P(view, view2, eVar.f14756b);
            ((FloatingActionButton) view).i(this.f14738c);
            float width = this.f14738c.width() / 2.0f;
            i e8 = eVar.f14755a.e("expansion");
            if (z10) {
                if (!z11) {
                    dVar.setRevealInfo(new d.e(O, P, width));
                }
                if (z11) {
                    width = dVar.getRevealInfo().f26227c;
                }
                animator = h5.a.a(dVar, O, P, o5.a.b(O, P, 0.0f, 0.0f, f10, f11));
                animator.addListener(new d(dVar));
                b0(view2, e8.c(), (int) O, (int) P, width, list);
            } else {
                float f12 = dVar.getRevealInfo().f26227c;
                Animator a10 = h5.a.a(dVar, O, P, width);
                int i10 = (int) O;
                int i11 = (int) P;
                b0(view2, e8.c(), i10, i11, f12, list);
                a0(view2, e8.c(), e8.d(), eVar.f14755a.f(), i10, i11, width, list);
                animator = a10;
            }
            e8.a(animator);
            list.add(animator);
            list2.add(h5.a.b(dVar));
        }
    }

    private void Z(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if ((view2 instanceof h5.d) && (view instanceof ImageView)) {
            h5.d dVar = (h5.d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z10) {
                if (!z11) {
                    drawable.setAlpha(255);
                }
                ofInt = ObjectAnimator.ofInt(drawable, e5.e.f25176b, 0);
            } else {
                ofInt = ObjectAnimator.ofInt(drawable, e5.e.f25176b, 255);
            }
            ofInt.addUpdateListener(new b(view2));
            eVar.f14755a.e("iconFade").a(ofInt);
            list.add(ofInt);
            list2.add(new c(dVar, drawable));
        }
    }

    private void a0(View view, long j10, long j11, long j12, int i10, int i11, float f10, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j13 = j10 + j11;
            if (j13 < j12) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
                createCircularReveal.setStartDelay(j13);
                createCircularReveal.setDuration(j12 - j13);
                list.add(createCircularReveal);
            }
        }
    }

    private void b0(View view, long j10, int i10, int i11, float f10, List<Animator> list) {
        if (Build.VERSION.SDK_INT < 21 || j10 <= 0) {
            return;
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
        createCircularReveal.setStartDelay(0L);
        createCircularReveal.setDuration(j10);
        list.add(createCircularReveal);
    }

    private void c0(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float Q = Q(view, view2, eVar.f14756b);
        float R = R(view, view2, eVar.f14756b);
        Pair<i, i> N = N(Q, R, z10, eVar);
        i iVar = (i) N.first;
        i iVar2 = (i) N.second;
        if (z10) {
            if (!z11) {
                view2.setTranslationX(-Q);
                view2.setTranslationY(-R);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            L(view2, eVar, iVar, iVar2, -Q, -R, 0.0f, 0.0f, rectF);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -Q);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -R);
        }
        iVar.a(ofFloat);
        iVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    private int d0(View view) {
        ColorStateList u10 = a0.u(view);
        if (u10 != null) {
            return u10.getColorForState(view.getDrawableState(), u10.getDefaultColor());
        }
        return 0;
    }

    private ViewGroup f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected AnimatorSet J(View view, View view2, boolean z10, boolean z11) {
        e e02 = e0(view2.getContext(), z10);
        if (z10) {
            this.f14742g = view.getTranslationX();
            this.f14743h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            X(view, view2, z10, z11, e02, arrayList, arrayList2);
        }
        RectF rectF = this.f14739d;
        c0(view, view2, z10, z11, e02, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        W(view, view2, z10, e02, arrayList);
        Z(view, view2, z10, z11, e02, arrayList, arrayList2);
        Y(view, view2, z10, z11, e02, width, height, arrayList, arrayList2);
        V(view, view2, z10, z11, e02, arrayList, arrayList2);
        U(view, view2, z10, z11, e02, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        e5.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z10, view2, view));
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            animatorSet.addListener(arrayList2.get(i10));
        }
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (view2 instanceof FloatingActionButton) {
                int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
                return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
            }
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    protected abstract e e0(Context context, boolean z10);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        if (fVar.f2415h == 0) {
            fVar.f2415h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14738c = new Rect();
        this.f14739d = new RectF();
        this.f14740e = new RectF();
        this.f14741f = new int[2];
    }
}

package a1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: Fade.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d extends j0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Fade.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f76a;

        a(View view) {
            this.f76a = view;
        }

        @Override // a1.m.f
        public void d(m mVar) {
            c0.g(this.f76a, 1.0f);
            c0.a(this.f76a);
            mVar.R(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Fade.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private final View f78a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f79b = false;

        b(View view) {
            this.f78a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c0.g(this.f78a, 1.0f);
            if (this.f79b) {
                this.f78a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (androidx.core.view.a0.Q(this.f78a) && this.f78a.getLayerType() == 0) {
                this.f79b = true;
                this.f78a.setLayerType(2, null);
            }
        }
    }

    public d(int i10) {
        k0(i10);
    }

    private Animator l0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        c0.g(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, c0.f74b, f11);
        ofFloat.addListener(new b(view));
        c(new a(view));
        return ofFloat;
    }

    private static float m0(s sVar, float f10) {
        Float f11;
        return (sVar == null || (f11 = (Float) sVar.f181a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // a1.j0
    public Animator h0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float m02 = m0(sVar, 0.0f);
        return l0(view, m02 != 1.0f ? m02 : 0.0f, 1.0f);
    }

    @Override // a1.j0
    public Animator j0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        c0.e(view);
        return l0(view, m0(sVar, 1.0f), 0.0f);
    }

    @Override // a1.j0, a1.m
    public void l(s sVar) {
        super.l(sVar);
        sVar.f181a.put("android:fade:transitionAlpha", Float.valueOf(c0.c(sVar.f182b)));
    }

    public d() {
    }
}

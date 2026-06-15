package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.os.e;
import androidx.fragment.app.r;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentAnim.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentAnim.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f3347a;

        a(Fragment fragment) {
            this.f3347a = fragment;
        }

        @Override // androidx.core.os.e.b
        public void a() {
            if (this.f3347a.l() != null) {
                View l10 = this.f3347a.l();
                this.f3347a.B1(null);
                l10.clearAnimation();
            }
            this.f3347a.D1(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentAnim.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f3348a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f3349b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r.g f3350c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.e f3351d;

        /* compiled from: FragmentAnim.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f3349b.l() != null) {
                    b.this.f3349b.B1(null);
                    b bVar = b.this;
                    bVar.f3350c.a(bVar.f3349b, bVar.f3351d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, r.g gVar, androidx.core.os.e eVar) {
            this.f3348a = viewGroup;
            this.f3349b = fragment;
            this.f3350c = gVar;
            this.f3351d = eVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f3348a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentAnim.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f3353a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f3354b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f3355c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r.g f3356d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.e f3357e;

        c(ViewGroup viewGroup, View view, Fragment fragment, r.g gVar, androidx.core.os.e eVar) {
            this.f3353a = viewGroup;
            this.f3354b = view;
            this.f3355c = fragment;
            this.f3356d = gVar;
            this.f3357e = eVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3353a.endViewTransition(this.f3354b);
            Animator m7 = this.f3355c.m();
            this.f3355c.D1(null);
            if (m7 == null || this.f3353a.indexOfChild(this.f3354b) >= 0) {
                return;
            }
            this.f3356d.a(this.f3355c, this.f3357e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Fragment fragment, C0059d c0059d, r.g gVar) {
        View view = fragment.H;
        ViewGroup viewGroup = fragment.G;
        viewGroup.startViewTransition(view);
        androidx.core.os.e eVar = new androidx.core.os.e();
        eVar.c(new a(fragment));
        gVar.b(fragment, eVar);
        if (c0059d.f3358a != null) {
            e eVar2 = new e(c0059d.f3358a, viewGroup, view);
            fragment.B1(fragment.H);
            eVar2.setAnimationListener(new b(viewGroup, fragment, gVar, eVar));
            fragment.H.startAnimation(eVar2);
            return;
        }
        Animator animator = c0059d.f3359b;
        fragment.D1(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, eVar));
        animator.setTarget(fragment.H);
        animator.start();
    }

    private static int b(Fragment fragment, boolean z10, boolean z11) {
        if (z11) {
            if (z10) {
                return fragment.G();
            }
            return fragment.H();
        } else if (z10) {
            return fragment.q();
        } else {
            return fragment.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C0059d c(Context context, Fragment fragment, boolean z10, boolean z11) {
        int C = fragment.C();
        int b10 = b(fragment, z10, z11);
        boolean z12 = false;
        fragment.C1(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.G;
        if (viewGroup != null) {
            int i10 = g0.b.f25684c;
            if (viewGroup.getTag(i10) != null) {
                fragment.G.setTag(i10, null);
            }
        }
        ViewGroup viewGroup2 = fragment.G;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation w02 = fragment.w0(C, z10, b10);
            if (w02 != null) {
                return new C0059d(w02);
            }
            Animator x02 = fragment.x0(C, z10, b10);
            if (x02 != null) {
                return new C0059d(x02);
            }
            if (b10 == 0 && C != 0) {
                b10 = d(C, z10);
            }
            if (b10 != 0) {
                boolean equals = "anim".equals(context.getResources().getResourceTypeName(b10));
                if (equals) {
                    try {
                        Animation loadAnimation = AnimationUtils.loadAnimation(context, b10);
                        if (loadAnimation != null) {
                            return new C0059d(loadAnimation);
                        }
                        z12 = true;
                    } catch (Resources.NotFoundException e8) {
                        throw e8;
                    } catch (RuntimeException unused) {
                    }
                }
                if (!z12) {
                    try {
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, b10);
                        if (loadAnimator != null) {
                            return new C0059d(loadAnimator);
                        }
                    } catch (RuntimeException e10) {
                        if (!equals) {
                            Animation loadAnimation2 = AnimationUtils.loadAnimation(context, b10);
                            if (loadAnimation2 != null) {
                                return new C0059d(loadAnimation2);
                            }
                        } else {
                            throw e10;
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    private static int d(int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? g0.a.f25680e : g0.a.f25681f;
        } else if (i10 == 4099) {
            return z10 ? g0.a.f25678c : g0.a.f25679d;
        } else if (i10 != 8194) {
            return -1;
        } else {
            return z10 ? g0.a.f25676a : g0.a.f25677b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentAnim.java */
    /* renamed from: androidx.fragment.app.d$d  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class C0059d {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f3358a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f3359b;

        C0059d(Animation animation) {
            this.f3358a = animation;
            this.f3359b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        C0059d(Animator animator) {
            this.f3358a = null;
            this.f3359b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentAnim.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class e extends AnimationSet implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final ViewGroup f3360a;

        /* renamed from: b  reason: collision with root package name */
        private final View f3361b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f3362c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f3363d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f3364e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f3364e = true;
            this.f3360a = viewGroup;
            this.f3361b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation) {
            this.f3364e = true;
            if (this.f3362c) {
                return !this.f3363d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f3362c = true;
                androidx.core.view.x.a(this.f3360a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f3362c && this.f3364e) {
                this.f3364e = false;
                this.f3360a.post(this);
                return;
            }
            this.f3360a.endViewTransition(this.f3361b);
            this.f3363d = true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f3364e = true;
            if (this.f3362c) {
                return !this.f3363d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f3362c = true;
                androidx.core.view.x.a(this.f3360a, this);
            }
            return true;
        }
    }
}

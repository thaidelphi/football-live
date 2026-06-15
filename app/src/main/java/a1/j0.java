package a1;

import a1.a;
import a1.m;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: Visibility.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class j0 extends m {
    private static final String[] L = {"android:visibility:visibility", "android:visibility:parent"};
    private int K = 3;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Visibility.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f113a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f114b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f115c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f113a = viewGroup;
            this.f114b = view;
            this.f115c = view2;
        }

        @Override // a1.n, a1.m.f
        public void a(m mVar) {
            if (this.f114b.getParent() == null) {
                x.a(this.f113a).c(this.f114b);
            } else {
                j0.this.h();
            }
        }

        @Override // a1.m.f
        public void d(m mVar) {
            this.f115c.setTag(j.f110b, null);
            x.a(this.f113a).d(this.f114b);
            mVar.R(this);
        }

        @Override // a1.n, a1.m.f
        public void e(m mVar) {
            x.a(this.f113a).d(this.f114b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Visibility.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b extends AnimatorListenerAdapter implements m.f, a.InterfaceC0003a {

        /* renamed from: a  reason: collision with root package name */
        private final View f117a;

        /* renamed from: b  reason: collision with root package name */
        private final int f118b;

        /* renamed from: c  reason: collision with root package name */
        private final ViewGroup f119c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f120d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f121e;

        /* renamed from: f  reason: collision with root package name */
        boolean f122f = false;

        b(View view, int i10, boolean z10) {
            this.f117a = view;
            this.f118b = i10;
            this.f119c = (ViewGroup) view.getParent();
            this.f120d = z10;
            g(true);
        }

        private void f() {
            if (!this.f122f) {
                c0.h(this.f117a, this.f118b);
                ViewGroup viewGroup = this.f119c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f120d || this.f121e == z10 || (viewGroup = this.f119c) == null) {
                return;
            }
            this.f121e = z10;
            x.c(viewGroup, z10);
        }

        @Override // a1.m.f
        public void a(m mVar) {
            g(true);
        }

        @Override // a1.m.f
        public void b(m mVar) {
        }

        @Override // a1.m.f
        public void c(m mVar) {
        }

        @Override // a1.m.f
        public void d(m mVar) {
            f();
            mVar.R(this);
        }

        @Override // a1.m.f
        public void e(m mVar) {
            g(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f122f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, a1.a.InterfaceC0003a
        public void onAnimationPause(Animator animator) {
            if (this.f122f) {
                return;
            }
            c0.h(this.f117a, this.f118b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, a1.a.InterfaceC0003a
        public void onAnimationResume(Animator animator) {
            if (this.f122f) {
                return;
            }
            c0.h(this.f117a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Visibility.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f123a;

        /* renamed from: b  reason: collision with root package name */
        boolean f124b;

        /* renamed from: c  reason: collision with root package name */
        int f125c;

        /* renamed from: d  reason: collision with root package name */
        int f126d;

        /* renamed from: e  reason: collision with root package name */
        ViewGroup f127e;

        /* renamed from: f  reason: collision with root package name */
        ViewGroup f128f;

        c() {
        }
    }

    private void e0(s sVar) {
        sVar.f181a.put("android:visibility:visibility", Integer.valueOf(sVar.f182b.getVisibility()));
        sVar.f181a.put("android:visibility:parent", sVar.f182b.getParent());
        int[] iArr = new int[2];
        sVar.f182b.getLocationOnScreen(iArr);
        sVar.f181a.put("android:visibility:screenLocation", iArr);
    }

    private c f0(s sVar, s sVar2) {
        c cVar = new c();
        cVar.f123a = false;
        cVar.f124b = false;
        if (sVar != null && sVar.f181a.containsKey("android:visibility:visibility")) {
            cVar.f125c = ((Integer) sVar.f181a.get("android:visibility:visibility")).intValue();
            cVar.f127e = (ViewGroup) sVar.f181a.get("android:visibility:parent");
        } else {
            cVar.f125c = -1;
            cVar.f127e = null;
        }
        if (sVar2 != null && sVar2.f181a.containsKey("android:visibility:visibility")) {
            cVar.f126d = ((Integer) sVar2.f181a.get("android:visibility:visibility")).intValue();
            cVar.f128f = (ViewGroup) sVar2.f181a.get("android:visibility:parent");
        } else {
            cVar.f126d = -1;
            cVar.f128f = null;
        }
        if (sVar != null && sVar2 != null) {
            int i10 = cVar.f125c;
            int i11 = cVar.f126d;
            if (i10 == i11 && cVar.f127e == cVar.f128f) {
                return cVar;
            }
            if (i10 != i11) {
                if (i10 == 0) {
                    cVar.f124b = false;
                    cVar.f123a = true;
                } else if (i11 == 0) {
                    cVar.f124b = true;
                    cVar.f123a = true;
                }
            } else if (cVar.f128f == null) {
                cVar.f124b = false;
                cVar.f123a = true;
            } else if (cVar.f127e == null) {
                cVar.f124b = true;
                cVar.f123a = true;
            }
        } else if (sVar == null && cVar.f126d == 0) {
            cVar.f124b = true;
            cVar.f123a = true;
        } else if (sVar2 == null && cVar.f125c == 0) {
            cVar.f124b = false;
            cVar.f123a = true;
        }
        return cVar;
    }

    @Override // a1.m
    public String[] F() {
        return L;
    }

    @Override // a1.m
    public boolean H(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar == null || sVar2 == null || sVar2.f181a.containsKey("android:visibility:visibility") == sVar.f181a.containsKey("android:visibility:visibility")) {
            c f02 = f0(sVar, sVar2);
            if (f02.f123a) {
                return f02.f125c == 0 || f02.f126d == 0;
            }
            return false;
        }
        return false;
    }

    public Animator g0(ViewGroup viewGroup, s sVar, int i10, s sVar2, int i11) {
        if ((this.K & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f182b.getParent();
            if (f0(v(view, false), G(view, false)).f123a) {
                return null;
            }
        }
        return h0(viewGroup, sVar2.f182b, sVar, sVar2);
    }

    public abstract Animator h0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    @Override // a1.m
    public void i(s sVar) {
        e0(sVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
        if (r17.f156w != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator i0(android.view.ViewGroup r18, a1.s r19, int r20, a1.s r21, int r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.j0.i0(android.view.ViewGroup, a1.s, int, a1.s, int):android.animation.Animator");
    }

    public abstract Animator j0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    public void k0(int i10) {
        if ((i10 & (-4)) == 0) {
            this.K = i10;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // a1.m
    public void l(s sVar) {
        e0(sVar);
    }

    @Override // a1.m
    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        c f02 = f0(sVar, sVar2);
        if (f02.f123a) {
            if (f02.f127e == null && f02.f128f == null) {
                return null;
            }
            if (f02.f124b) {
                return g0(viewGroup, sVar, f02.f125c, sVar2, f02.f126d);
            }
            return i0(viewGroup, sVar, f02.f125c, sVar2, f02.f126d);
        }
        return null;
    }
}

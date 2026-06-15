package com.google.android.material.behavior;

import a0.c;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import androidx.core.view.accessibility.c;
import androidx.core.view.accessibility.f;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    a0.c f13892a;

    /* renamed from: b  reason: collision with root package name */
    c f13893b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13894c;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13896e;

    /* renamed from: d  reason: collision with root package name */
    private float f13895d = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    int f13897f = 2;

    /* renamed from: g  reason: collision with root package name */
    float f13898g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    float f13899h = 0.0f;

    /* renamed from: i  reason: collision with root package name */
    float f13900i = 0.5f;

    /* renamed from: j  reason: collision with root package name */
    private final c.AbstractC0002c f13901j = new a();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends c.AbstractC0002c {

        /* renamed from: a  reason: collision with root package name */
        private int f13902a;

        /* renamed from: b  reason: collision with root package name */
        private int f13903b = -1;

        a() {
        }

        private boolean n(View view, float f10) {
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i10 == 0) {
                return Math.abs(view.getLeft() - this.f13902a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f13898g);
            }
            boolean z10 = a0.E(view) == 1;
            int i11 = SwipeDismissBehavior.this.f13897f;
            if (i11 == 2) {
                return true;
            }
            if (i11 == 0) {
                if (z10) {
                    if (f10 >= 0.0f) {
                        return false;
                    }
                } else if (i10 <= 0) {
                    return false;
                }
                return true;
            } else if (i11 == 1) {
                if (z10) {
                    if (i10 <= 0) {
                        return false;
                    }
                } else if (f10 >= 0.0f) {
                    return false;
                }
                return true;
            } else {
                return false;
            }
        }

        @Override // a0.c.AbstractC0002c
        public int a(View view, int i10, int i11) {
            int width;
            int width2;
            int width3;
            boolean z10 = a0.E(view) == 1;
            int i12 = SwipeDismissBehavior.this.f13897f;
            if (i12 == 0) {
                if (z10) {
                    width = this.f13902a - view.getWidth();
                    width2 = this.f13902a;
                } else {
                    width = this.f13902a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i12 != 1) {
                width = this.f13902a - view.getWidth();
                width2 = view.getWidth() + this.f13902a;
            } else if (z10) {
                width = this.f13902a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f13902a - view.getWidth();
                width2 = this.f13902a;
            }
            return SwipeDismissBehavior.G(width, i10, width2);
        }

        @Override // a0.c.AbstractC0002c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // a0.c.AbstractC0002c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // a0.c.AbstractC0002c
        public void i(View view, int i10) {
            this.f13903b = i10;
            this.f13902a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // a0.c.AbstractC0002c
        public void j(int i10) {
            c cVar = SwipeDismissBehavior.this.f13893b;
            if (cVar != null) {
                cVar.b(i10);
            }
        }

        @Override // a0.c.AbstractC0002c
        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = this.f13902a + (view.getWidth() * SwipeDismissBehavior.this.f13899h);
            float width2 = this.f13902a + (view.getWidth() * SwipeDismissBehavior.this.f13900i);
            float f10 = i10;
            if (f10 <= width) {
                view.setAlpha(1.0f);
            } else if (f10 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.F(0.0f, 1.0f - SwipeDismissBehavior.I(width, width2, f10), 1.0f));
            }
        }

        @Override // a0.c.AbstractC0002c
        public void l(View view, float f10, float f11) {
            int i10;
            boolean z10;
            c cVar;
            this.f13903b = -1;
            int width = view.getWidth();
            if (n(view, f10)) {
                int left = view.getLeft();
                int i11 = this.f13902a;
                i10 = left < i11 ? i11 - width : i11 + width;
                z10 = true;
            } else {
                i10 = this.f13902a;
                z10 = false;
            }
            if (SwipeDismissBehavior.this.f13892a.F(i10, view.getTop())) {
                a0.i0(view, new d(view, z10));
            } else if (!z10 || (cVar = SwipeDismissBehavior.this.f13893b) == null) {
            } else {
                cVar.a(view);
            }
        }

        @Override // a0.c.AbstractC0002c
        public boolean m(View view, int i10) {
            int i11 = this.f13903b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.E(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b implements f {
        b() {
        }

        @Override // androidx.core.view.accessibility.f
        public boolean a(View view, f.a aVar) {
            boolean z10 = false;
            if (SwipeDismissBehavior.this.E(view)) {
                boolean z11 = a0.E(view) == 1;
                int i10 = SwipeDismissBehavior.this.f13897f;
                if ((i10 == 0 && z11) || (i10 == 1 && !z11)) {
                    z10 = true;
                }
                int width = view.getWidth();
                if (z10) {
                    width = -width;
                }
                a0.a0(view, width);
                view.setAlpha(0.0f);
                c cVar = SwipeDismissBehavior.this.f13893b;
                if (cVar != null) {
                    cVar.a(view);
                }
                return true;
            }
            return false;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface c {
        void a(View view);

        void b(int i10);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final View f13906a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f13907b;

        d(View view, boolean z10) {
            this.f13906a = view;
            this.f13907b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            a0.c cVar2 = SwipeDismissBehavior.this.f13892a;
            if (cVar2 != null && cVar2.k(true)) {
                a0.i0(this.f13906a, this);
            } else if (!this.f13907b || (cVar = SwipeDismissBehavior.this.f13893b) == null) {
            } else {
                cVar.a(this.f13906a);
            }
        }
    }

    static float F(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    static int G(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    private void H(ViewGroup viewGroup) {
        a0.c m7;
        if (this.f13892a == null) {
            if (this.f13896e) {
                m7 = a0.c.l(viewGroup, this.f13895d, this.f13901j);
            } else {
                m7 = a0.c.m(viewGroup, this.f13901j);
            }
            this.f13892a = m7;
        }
    }

    static float I(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    private void N(View view) {
        a0.k0(view, 1048576);
        if (E(view)) {
            a0.m0(view, c.a.f2848y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        a0.c cVar = this.f13892a;
        if (cVar != null) {
            cVar.z(motionEvent);
            return true;
        }
        return false;
    }

    public boolean E(View view) {
        return true;
    }

    public void J(float f10) {
        this.f13900i = F(0.0f, f10, 1.0f);
    }

    public void K(c cVar) {
        this.f13893b = cVar;
    }

    public void L(float f10) {
        this.f13899h = F(0.0f, f10, 1.0f);
    }

    public void M(int i10) {
        this.f13897f = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10 = this.f13894c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z10 = coordinatorLayout.B(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f13894c = z10;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f13894c = false;
        }
        if (z10) {
            H(coordinatorLayout);
            return this.f13892a.G(motionEvent);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        boolean l10 = super.l(coordinatorLayout, v10, i10);
        if (a0.C(v10) == 0) {
            a0.A0(v10, 1);
            N(v10);
        }
        return l10;
    }
}

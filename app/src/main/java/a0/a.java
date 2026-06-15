package a0;

import a0.b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.i;
import androidx.core.view.a0;
import androidx.core.view.accessibility.d;
import androidx.core.view.accessibility.e;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ExploreByTouchHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a extends androidx.core.view.a {

    /* renamed from: n  reason: collision with root package name */
    private static final Rect f3n = new Rect(Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);

    /* renamed from: o  reason: collision with root package name */
    private static final b.a<androidx.core.view.accessibility.c> f4o = new C0000a();

    /* renamed from: p  reason: collision with root package name */
    private static final b.InterfaceC0001b<i<androidx.core.view.accessibility.c>, androidx.core.view.accessibility.c> f5p = new b();

    /* renamed from: h  reason: collision with root package name */
    private final AccessibilityManager f10h;

    /* renamed from: i  reason: collision with root package name */
    private final View f11i;

    /* renamed from: j  reason: collision with root package name */
    private c f12j;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f6d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    private final Rect f7e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private final Rect f8f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    private final int[] f9g = new int[2];

    /* renamed from: k  reason: collision with root package name */
    int f13k = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: l  reason: collision with root package name */
    int f14l = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: m  reason: collision with root package name */
    private int f15m = RecyclerView.UNDEFINED_DURATION;

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: a0.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class C0000a implements b.a<androidx.core.view.accessibility.c> {
        C0000a() {
        }

        @Override // a0.b.a
        /* renamed from: b */
        public void a(androidx.core.view.accessibility.c cVar, Rect rect) {
            cVar.l(rect);
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements b.InterfaceC0001b<i<androidx.core.view.accessibility.c>, androidx.core.view.accessibility.c> {
        b() {
        }

        @Override // a0.b.InterfaceC0001b
        /* renamed from: c */
        public androidx.core.view.accessibility.c a(i<androidx.core.view.accessibility.c> iVar, int i10) {
            return iVar.m(i10);
        }

        @Override // a0.b.InterfaceC0001b
        /* renamed from: d */
        public int b(i<androidx.core.view.accessibility.c> iVar) {
            return iVar.l();
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class c extends d {
        c() {
        }

        @Override // androidx.core.view.accessibility.d
        public androidx.core.view.accessibility.c b(int i10) {
            return androidx.core.view.accessibility.c.N(a.this.H(i10));
        }

        @Override // androidx.core.view.accessibility.d
        public androidx.core.view.accessibility.c d(int i10) {
            int i11 = i10 == 2 ? a.this.f13k : a.this.f14l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        @Override // androidx.core.view.accessibility.d
        public boolean f(int i10, int i11, Bundle bundle) {
            return a.this.P(i10, i11, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f11i = view;
            this.f10h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (a0.C(view) == 0) {
                a0.A0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private static Rect D(View view, int i10, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
        } else if (i10 == 33) {
            rect.set(0, height, width, height);
        } else if (i10 == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i10 == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    private boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f11i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f11i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int F(int i10) {
        if (i10 != 19) {
            if (i10 != 21) {
                return i10 != 22 ? 130 : 66;
            }
            return 17;
        }
        return 33;
    }

    private boolean G(int i10, Rect rect) {
        androidx.core.view.accessibility.c cVar;
        i<androidx.core.view.accessibility.c> y10 = y();
        int i11 = this.f14l;
        int i12 = RecyclerView.UNDEFINED_DURATION;
        androidx.core.view.accessibility.c g10 = i11 == Integer.MIN_VALUE ? null : y10.g(i11);
        if (i10 == 1 || i10 == 2) {
            cVar = (androidx.core.view.accessibility.c) a0.b.d(y10, f5p, f4o, g10, i10, a0.E(this.f11i) == 1, false);
        } else if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            Rect rect2 = new Rect();
            int i13 = this.f14l;
            if (i13 != Integer.MIN_VALUE) {
                z(i13, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f11i, i10, rect2);
            }
            cVar = (androidx.core.view.accessibility.c) a0.b.c(y10, f5p, f4o, g10, rect2, i10);
        }
        if (cVar != null) {
            i12 = y10.j(y10.i(cVar));
        }
        return T(i12);
    }

    private boolean Q(int i10, int i11, Bundle bundle) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 64) {
                    if (i11 != 128) {
                        return J(i10, i11, bundle);
                    }
                    return n(i10);
                }
                return S(i10);
            }
            return o(i10);
        }
        return T(i10);
    }

    private boolean R(int i10, Bundle bundle) {
        return a0.f0(this.f11i, i10, bundle);
    }

    private boolean S(int i10) {
        int i11;
        if (this.f10h.isEnabled() && this.f10h.isTouchExplorationEnabled() && (i11 = this.f13k) != i10) {
            if (i11 != Integer.MIN_VALUE) {
                n(i11);
            }
            this.f13k = i10;
            this.f11i.invalidate();
            U(i10, 32768);
            return true;
        }
        return false;
    }

    private void V(int i10) {
        int i11 = this.f15m;
        if (i11 == i10) {
            return;
        }
        this.f15m = i10;
        U(i10, 128);
        U(i11, 256);
    }

    private boolean n(int i10) {
        if (this.f13k == i10) {
            this.f13k = RecyclerView.UNDEFINED_DURATION;
            this.f11i.invalidate();
            U(i10, 65536);
            return true;
        }
        return false;
    }

    private boolean p() {
        int i10 = this.f14l;
        return i10 != Integer.MIN_VALUE && J(i10, 16, null);
    }

    private AccessibilityEvent q(int i10, int i11) {
        if (i10 != -1) {
            return r(i10, i11);
        }
        return s(i11);
    }

    private AccessibilityEvent r(int i10, int i11) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        androidx.core.view.accessibility.c H = H(i10);
        obtain.getText().add(H.v());
        obtain.setContentDescription(H.q());
        obtain.setScrollable(H.I());
        obtain.setPassword(H.H());
        obtain.setEnabled(H.D());
        obtain.setChecked(H.B());
        L(i10, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(H.o());
        e.c(obtain, this.f11i, i10);
        obtain.setPackageName(this.f11i.getContext().getPackageName());
        return obtain;
    }

    private AccessibilityEvent s(int i10) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
        this.f11i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private androidx.core.view.accessibility.c t(int i10) {
        androidx.core.view.accessibility.c L = androidx.core.view.accessibility.c.L();
        L.c0(true);
        L.e0(true);
        L.X("android.view.View");
        Rect rect = f3n;
        L.T(rect);
        L.U(rect);
        L.m0(this.f11i);
        N(i10, L);
        if (L.v() == null && L.q() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        L.l(this.f7e);
        if (!this.f7e.equals(rect)) {
            int j10 = L.j();
            if ((j10 & 64) == 0) {
                if ((j10 & 128) == 0) {
                    L.k0(this.f11i.getContext().getPackageName());
                    L.r0(this.f11i, i10);
                    if (this.f13k == i10) {
                        L.R(true);
                        L.a(128);
                    } else {
                        L.R(false);
                        L.a(64);
                    }
                    boolean z10 = this.f14l == i10;
                    if (z10) {
                        L.a(2);
                    } else if (L.E()) {
                        L.a(1);
                    }
                    L.f0(z10);
                    this.f11i.getLocationOnScreen(this.f9g);
                    L.m(this.f6d);
                    if (this.f6d.equals(rect)) {
                        L.l(this.f6d);
                        if (L.f2826b != -1) {
                            androidx.core.view.accessibility.c L2 = androidx.core.view.accessibility.c.L();
                            for (int i11 = L.f2826b; i11 != -1; i11 = L2.f2826b) {
                                L2.n0(this.f11i, -1);
                                L2.T(f3n);
                                N(i11, L2);
                                L2.l(this.f7e);
                                Rect rect2 = this.f6d;
                                Rect rect3 = this.f7e;
                                rect2.offset(rect3.left, rect3.top);
                            }
                            L2.P();
                        }
                        this.f6d.offset(this.f9g[0] - this.f11i.getScrollX(), this.f9g[1] - this.f11i.getScrollY());
                    }
                    if (this.f11i.getLocalVisibleRect(this.f8f)) {
                        this.f8f.offset(this.f9g[0] - this.f11i.getScrollX(), this.f9g[1] - this.f11i.getScrollY());
                        if (this.f6d.intersect(this.f8f)) {
                            L.U(this.f6d);
                            if (E(this.f6d)) {
                                L.v0(true);
                            }
                        }
                    }
                    return L;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    private androidx.core.view.accessibility.c u() {
        androidx.core.view.accessibility.c M = androidx.core.view.accessibility.c.M(this.f11i);
        a0.d0(this.f11i, M);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (M.n() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            M.c(this.f11i, ((Integer) arrayList.get(i10)).intValue());
        }
        return M;
    }

    private i<androidx.core.view.accessibility.c> y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        i<androidx.core.view.accessibility.c> iVar = new i<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            iVar.k(arrayList.get(i10).intValue(), t(arrayList.get(i10).intValue()));
        }
        return iVar;
    }

    private void z(int i10, Rect rect) {
        H(i10).l(rect);
    }

    public final int A() {
        return this.f14l;
    }

    protected abstract int B(float f10, float f11);

    protected abstract void C(List<Integer> list);

    androidx.core.view.accessibility.c H(int i10) {
        if (i10 == -1) {
            return u();
        }
        return t(i10);
    }

    public final void I(boolean z10, int i10, Rect rect) {
        int i11 = this.f14l;
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (z10) {
            G(i10, rect);
        }
    }

    protected abstract boolean J(int i10, int i11, Bundle bundle);

    protected void K(AccessibilityEvent accessibilityEvent) {
    }

    protected void L(int i10, AccessibilityEvent accessibilityEvent) {
    }

    protected abstract void M(androidx.core.view.accessibility.c cVar);

    protected abstract void N(int i10, androidx.core.view.accessibility.c cVar);

    protected abstract void O(int i10, boolean z10);

    boolean P(int i10, int i11, Bundle bundle) {
        if (i10 != -1) {
            return Q(i10, i11, bundle);
        }
        return R(i11, bundle);
    }

    public final boolean T(int i10) {
        int i11;
        if ((this.f11i.isFocused() || this.f11i.requestFocus()) && (i11 = this.f14l) != i10) {
            if (i11 != Integer.MIN_VALUE) {
                o(i11);
            }
            if (i10 == Integer.MIN_VALUE) {
                return false;
            }
            this.f14l = i10;
            O(i10, true);
            U(i10, 8);
            return true;
        }
        return false;
    }

    public final boolean U(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f10h.isEnabled() || (parent = this.f11i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f11i, q(i10, i11));
    }

    @Override // androidx.core.view.a
    public d b(View view) {
        if (this.f12j == null) {
            this.f12j = new c();
        }
        return this.f12j;
    }

    @Override // androidx.core.view.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // androidx.core.view.a
    public void g(View view, androidx.core.view.accessibility.c cVar) {
        super.g(view, cVar);
        M(cVar);
    }

    public final boolean o(int i10) {
        if (this.f14l != i10) {
            return false;
        }
        this.f14l = RecyclerView.UNDEFINED_DURATION;
        O(i10, false);
        U(i10, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (this.f10h.isEnabled() && this.f10h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action == 10 && this.f15m != Integer.MIN_VALUE) {
                    V(RecyclerView.UNDEFINED_DURATION);
                    return true;
                }
                return false;
            }
            int B = B(motionEvent.getX(), motionEvent.getY());
            V(B);
            return B != Integer.MIN_VALUE;
        }
        return false;
    }

    public final boolean w(KeyEvent keyEvent) {
        int i10 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                int F = F(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z10 = false;
                                while (i10 < repeatCount && G(F, null)) {
                                    i10++;
                                    z10 = true;
                                }
                                return z10;
                            }
                            return false;
                        case 23:
                            break;
                        default:
                            return false;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    p();
                    return true;
                }
                return false;
            } else if (keyEvent.hasNoModifiers()) {
                return G(2, null);
            } else {
                if (keyEvent.hasModifiers(1)) {
                    return G(1, null);
                }
                return false;
            }
        }
        return false;
    }

    public final int x() {
        return this.f13k;
    }
}

package com.google.android.material.bottomsheet;

import a0.c;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import androidx.core.view.accessibility.c;
import androidx.core.view.accessibility.f;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.o;
import d5.i;
import d5.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import u5.k;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: d0  reason: collision with root package name */
    private static final int f13951d0 = j.f24102d;
    private ValueAnimator A;
    int B;
    int C;
    int D;
    float E;
    int F;
    float G;
    boolean H;
    private boolean I;
    private boolean J;
    int K;
    int L;
    a0.c M;
    private boolean N;
    private int O;
    private boolean P;
    private int Q;
    int R;
    int S;
    WeakReference<V> T;
    WeakReference<View> U;
    private final ArrayList<f> V;
    private VelocityTracker W;
    int X;
    private int Y;
    boolean Z;

    /* renamed from: a  reason: collision with root package name */
    private int f13952a;

    /* renamed from: a0  reason: collision with root package name */
    private Map<View, Integer> f13953a0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f13954b;

    /* renamed from: b0  reason: collision with root package name */
    private int f13955b0;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13956c;

    /* renamed from: c0  reason: collision with root package name */
    private final c.AbstractC0002c f13957c0;

    /* renamed from: d  reason: collision with root package name */
    private float f13958d;

    /* renamed from: e  reason: collision with root package name */
    private int f13959e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13960f;

    /* renamed from: g  reason: collision with root package name */
    private int f13961g;

    /* renamed from: h  reason: collision with root package name */
    private int f13962h;

    /* renamed from: i  reason: collision with root package name */
    private u5.g f13963i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f13964j;

    /* renamed from: k  reason: collision with root package name */
    private int f13965k;

    /* renamed from: l  reason: collision with root package name */
    private int f13966l;

    /* renamed from: m  reason: collision with root package name */
    private int f13967m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f13968n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13969o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f13970p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f13971q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f13972r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f13973s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f13974t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f13975u;

    /* renamed from: v  reason: collision with root package name */
    private int f13976v;

    /* renamed from: w  reason: collision with root package name */
    private int f13977w;

    /* renamed from: x  reason: collision with root package name */
    private k f13978x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f13979y;

    /* renamed from: z  reason: collision with root package name */
    private final BottomSheetBehavior<V>.g f13980z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f13986a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f13987b;

        a(View view, int i10) {
            this.f13986a = view;
            this.f13987b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.J0(this.f13986a, this.f13987b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f13963i != null) {
                BottomSheetBehavior.this.f13963i.Y(floatValue);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class c implements o.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f13990a;

        c(boolean z10) {
            this.f13990a = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
        @Override // com.google.android.material.internal.o.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.core.view.l0 a(android.view.View r11, androidx.core.view.l0 r12, com.google.android.material.internal.o.e r13) {
            /*
                r10 = this;
                int r0 = androidx.core.view.l0.m.c()
                androidx.core.graphics.b r0 = r12.f(r0)
                int r1 = androidx.core.view.l0.m.b()
                androidx.core.graphics.b r1 = r12.f(r1)
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r3 = r0.f2612b
                com.google.android.material.bottomsheet.BottomSheetBehavior.N(r2, r3)
                boolean r2 = com.google.android.material.internal.o.e(r11)
                int r3 = r11.getPaddingBottom()
                int r4 = r11.getPaddingLeft()
                int r5 = r11.getPaddingRight()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.O(r6)
                if (r6 == 0) goto L41
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r12.h()
                com.google.android.material.bottomsheet.BottomSheetBehavior.Q(r3, r6)
                int r3 = r13.f14465d
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.P(r6)
                int r3 = r3 + r6
            L41:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.R(r6)
                if (r6 == 0) goto L53
                if (r2 == 0) goto L4e
                int r4 = r13.f14464c
                goto L50
            L4e:
                int r4 = r13.f14462a
            L50:
                int r6 = r0.f2611a
                int r4 = r4 + r6
            L53:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.S(r6)
                if (r6 == 0) goto L66
                if (r2 == 0) goto L60
                int r13 = r13.f14462a
                goto L62
            L60:
                int r13 = r13.f14464c
            L62:
                int r2 = r0.f2613c
                int r5 = r13 + r2
            L66:
                android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.T(r2)
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L80
                int r2 = r13.leftMargin
                int r8 = r0.f2611a
                if (r2 == r8) goto L80
                r13.leftMargin = r8
                r2 = r7
                goto L81
            L80:
                r2 = r6
            L81:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.U(r8)
                if (r8 == 0) goto L92
                int r8 = r13.rightMargin
                int r9 = r0.f2613c
                if (r8 == r9) goto L92
                r13.rightMargin = r9
                r2 = r7
            L92:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.F(r8)
                if (r8 == 0) goto La3
                int r8 = r13.topMargin
                int r0 = r0.f2612b
                if (r8 == r0) goto La3
                r13.topMargin = r0
                goto La4
            La3:
                r7 = r2
            La4:
                if (r7 == 0) goto La9
                r11.setLayoutParams(r13)
            La9:
                int r13 = r11.getPaddingTop()
                r11.setPadding(r4, r13, r5, r3)
                boolean r11 = r10.f13990a
                if (r11 == 0) goto Lbb
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r13 = r1.f2614d
                com.google.android.material.bottomsheet.BottomSheetBehavior.G(r11, r13)
            Lbb:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.O(r11)
                if (r11 != 0) goto Lc7
                boolean r11 = r10.f13990a
                if (r11 == 0) goto Lcc
            Lc7:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                com.google.android.material.bottomsheet.BottomSheetBehavior.H(r11, r6)
            Lcc:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c.a(android.view.View, androidx.core.view.l0, com.google.android.material.internal.o$e):androidx.core.view.l0");
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class d extends c.AbstractC0002c {

        /* renamed from: a  reason: collision with root package name */
        private long f13992a;

        d() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.S + bottomSheetBehavior.f0()) / 2;
        }

        @Override // a0.c.AbstractC0002c
        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // a0.c.AbstractC0002c
        public int b(View view, int i10, int i11) {
            int f02 = BottomSheetBehavior.this.f0();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return x.a.b(i10, f02, bottomSheetBehavior.H ? bottomSheetBehavior.S : bottomSheetBehavior.F);
        }

        @Override // a0.c.AbstractC0002c
        public int e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.H) {
                return bottomSheetBehavior.S;
            }
            return bottomSheetBehavior.F;
        }

        @Override // a0.c.AbstractC0002c
        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.J) {
                BottomSheetBehavior.this.C0(1);
            }
        }

        @Override // a0.c.AbstractC0002c
        public void k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.c0(i11);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
            if (r7.f13993b.E0(r0, (r9 * 100.0f) / r10.S) != false) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
            if (r9 > r7.f13993b.D) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
            if (java.lang.Math.abs(r8.getTop() - r7.f13993b.f0()) < java.lang.Math.abs(r8.getTop() - r7.f13993b.D)) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
            if (r7.f13993b.H0() == false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00eb, code lost:
            if (java.lang.Math.abs(r9 - r7.f13993b.C) < java.lang.Math.abs(r9 - r7.f13993b.F)) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0107, code lost:
            if (r7.f13993b.H0() != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0121, code lost:
            if (r7.f13993b.H0() == false) goto L6;
         */
        @Override // a0.c.AbstractC0002c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void l(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 302
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.l(android.view.View, float, float):void");
        }

        @Override // a0.c.AbstractC0002c
        public boolean m(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.K;
            if (i11 == 1 || bottomSheetBehavior.Z) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.X == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.U;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f13992a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.T;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class e implements androidx.core.view.accessibility.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f13994a;

        e(int i10) {
            this.f13994a = i10;
        }

        @Override // androidx.core.view.accessibility.f
        public boolean a(View view, f.a aVar) {
            BottomSheetBehavior.this.B0(this.f13994a);
            return true;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static abstract class f {
        void a(View view) {
        }

        public abstract void b(View view, float f10);

        public abstract void c(View view, int i10);
    }

    public BottomSheetBehavior() {
        this.f13952a = 0;
        this.f13954b = true;
        this.f13956c = false;
        this.f13965k = -1;
        this.f13966l = -1;
        this.f13980z = new g(this, null);
        this.E = 0.5f;
        this.G = -1.0f;
        this.J = true;
        this.K = 4;
        this.L = 4;
        this.V = new ArrayList<>();
        this.f13955b0 = -1;
        this.f13957c0 = new d();
    }

    private void D0(View view) {
        boolean z10 = (Build.VERSION.SDK_INT < 29 || i0() || this.f13960f) ? false : true;
        if (this.f13969o || this.f13970p || this.f13971q || this.f13973s || this.f13974t || this.f13975u || z10) {
            o.a(view, new c(z10));
        }
    }

    private boolean F0() {
        return this.M != null && (this.J || this.K == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0(View view, int i10, boolean z10) {
        int g02 = g0(i10);
        a0.c cVar = this.M;
        if (cVar != null && (!z10 ? !cVar.H(view, view.getLeft(), g02) : !cVar.F(view.getLeft(), g02))) {
            C0(2);
            L0(i10);
            this.f13980z.c(i10);
            return;
        }
        C0(i10);
    }

    private void K0() {
        V v10;
        WeakReference<V> weakReference = this.T;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        a0.k0(v10, 524288);
        a0.k0(v10, 262144);
        a0.k0(v10, 1048576);
        int i10 = this.f13955b0;
        if (i10 != -1) {
            a0.k0(v10, i10);
        }
        if (!this.f13954b && this.K != 6) {
            this.f13955b0 = V(v10, i.f24083a, 6);
        }
        if (this.H && this.K != 5) {
            l0(v10, c.a.f2848y, 5);
        }
        int i11 = this.K;
        if (i11 == 3) {
            l0(v10, c.a.f2847x, this.f13954b ? 4 : 6);
        } else if (i11 == 4) {
            l0(v10, c.a.f2846w, this.f13954b ? 3 : 6);
        } else if (i11 != 6) {
        } else {
            l0(v10, c.a.f2847x, 4);
            l0(v10, c.a.f2846w, 3);
        }
    }

    private void L0(int i10) {
        ValueAnimator valueAnimator;
        if (i10 == 2) {
            return;
        }
        boolean z10 = i10 == 3;
        if (this.f13979y != z10) {
            this.f13979y = z10;
            if (this.f13963i == null || (valueAnimator = this.A) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.A.reverse();
                return;
            }
            float f10 = z10 ? 0.0f : 1.0f;
            this.A.setFloatValues(1.0f - f10, f10);
            this.A.start();
        }
    }

    private void M0(boolean z10) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.T;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z10) {
                if (this.f13953a0 != null) {
                    return;
                }
                this.f13953a0 = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.T.get()) {
                    if (z10) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f13953a0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        if (this.f13956c) {
                            a0.A0(childAt, 4);
                        }
                    } else if (this.f13956c && (map = this.f13953a0) != null && map.containsKey(childAt)) {
                        a0.A0(childAt, this.f13953a0.get(childAt).intValue());
                    }
                }
            }
            if (!z10) {
                this.f13953a0 = null;
            } else if (this.f13956c) {
                this.T.get().sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0(boolean z10) {
        V v10;
        if (this.T != null) {
            W();
            if (this.K != 4 || (v10 = this.T.get()) == null) {
                return;
            }
            if (z10) {
                B0(4);
            } else {
                v10.requestLayout();
            }
        }
    }

    private int V(V v10, int i10, int i11) {
        return a0.c(v10, v10.getResources().getString(i10), Z(i11));
    }

    private void W() {
        int Y = Y();
        if (this.f13954b) {
            this.F = Math.max(this.S - Y, this.C);
        } else {
            this.F = this.S - Y;
        }
    }

    private void X() {
        this.D = (int) (this.S * (1.0f - this.E));
    }

    private int Y() {
        int i10;
        if (this.f13960f) {
            return Math.min(Math.max(this.f13961g, this.S - ((this.R * 9) / 16)), this.Q) + this.f13976v;
        }
        if (!this.f13968n && !this.f13969o && (i10 = this.f13967m) > 0) {
            return Math.max(this.f13959e, i10 + this.f13962h);
        }
        return this.f13959e + this.f13976v;
    }

    private androidx.core.view.accessibility.f Z(int i10) {
        return new e(i10);
    }

    private void a0(Context context) {
        if (this.f13978x == null) {
            return;
        }
        u5.g gVar = new u5.g(this.f13978x);
        this.f13963i = gVar;
        gVar.N(context);
        ColorStateList colorStateList = this.f13964j;
        if (colorStateList != null) {
            this.f13963i.X(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842801, typedValue, true);
        this.f13963i.setTint(typedValue.data);
    }

    private void b0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A = ofFloat;
        ofFloat.setDuration(500L);
        this.A.addUpdateListener(new b());
    }

    private int e0(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i12 = Math.min(size, i12);
            }
            return View.MeasureSpec.makeMeasureSpec(i12, RecyclerView.UNDEFINED_DURATION);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
    }

    private int g0(int i10) {
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 == 6) {
                        return this.D;
                    }
                    throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
                }
                return this.S;
            }
            return this.F;
        }
        return f0();
    }

    private float h0() {
        VelocityTracker velocityTracker = this.W;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f13958d);
        return this.W.getYVelocity(this.X);
    }

    private boolean j0(V v10) {
        ViewParent parent = v10.getParent();
        return parent != null && parent.isLayoutRequested() && a0.T(v10);
    }

    private void l0(V v10, c.a aVar, int i10) {
        a0.m0(v10, aVar, null, Z(i10));
    }

    private void m0() {
        this.X = -1;
        VelocityTracker velocityTracker = this.W;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.W = null;
        }
    }

    private void n0(SavedState savedState) {
        int i10 = this.f13952a;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f13959e = savedState.f13982d;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.f13954b = savedState.f13983e;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.H = savedState.f13984f;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.I = savedState.f13985g;
        }
    }

    private void o0(V v10, Runnable runnable) {
        if (j0(v10)) {
            v10.post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        this.O = 0;
        this.P = false;
        return (i10 & 2) != 0;
    }

    public void A0(boolean z10) {
        this.I = z10;
    }

    public void B0(int i10) {
        if (i10 != 1 && i10 != 2) {
            if (!this.H && i10 == 5) {
                Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
                return;
            }
            int i11 = (i10 == 6 && this.f13954b && g0(i10) <= this.C) ? 3 : i10;
            WeakReference<V> weakReference = this.T;
            if (weakReference != null && weakReference.get() != null) {
                V v10 = this.T.get();
                o0(v10, new a(v10, i11));
                return;
            }
            C0(i10);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("STATE_");
        sb.append(i10 == 1 ? "DRAGGING" : "SETTLING");
        sb.append(" should not be set externally.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
        if (r4.getTop() <= r2.D) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
        if (java.lang.Math.abs(r3 - r2.C) < java.lang.Math.abs(r3 - r2.F)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
        if (H0() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.F)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a7, code lost:
        if (java.lang.Math.abs(r3 - r2.D) < java.lang.Math.abs(r3 - r2.F)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
        r0 = 6;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.f0()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.C0(r0)
            return
        Lf:
            boolean r3 = r2.k0()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference<android.view.View> r3 = r2.U
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.P
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.O
            r5 = 6
            r6 = 4
            if (r3 <= 0) goto L3a
            boolean r3 = r2.f13954b
            if (r3 == 0) goto L30
            goto Laa
        L30:
            int r3 = r4.getTop()
            int r6 = r2.D
            if (r3 <= r6) goto Laa
            goto La9
        L3a:
            boolean r3 = r2.H
            if (r3 == 0) goto L4a
            float r3 = r2.h0()
            boolean r3 = r2.G0(r4, r3)
            if (r3 == 0) goto L4a
            r0 = 5
            goto Laa
        L4a:
            int r3 = r2.O
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.f13954b
            if (r1 == 0) goto L68
            int r5 = r2.C
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.D
            if (r3 >= r1) goto L7e
            int r1 = r2.F
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.H0()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.f13954b
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.D
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.J0(r4, r0, r3)
            r2.P = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    void C0(int i10) {
        V v10;
        if (this.K == i10) {
            return;
        }
        this.K = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.H && i10 == 5)) {
            this.L = i10;
        }
        WeakReference<V> weakReference = this.T;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            M0(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            M0(false);
        }
        L0(i10);
        for (int i11 = 0; i11 < this.V.size(); i11++) {
            this.V.get(i11).c(v10, i10);
        }
        K0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (v10.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (this.K == 1 && actionMasked == 0) {
                return true;
            }
            if (F0()) {
                this.M.z(motionEvent);
            }
            if (actionMasked == 0) {
                m0();
            }
            if (this.W == null) {
                this.W = VelocityTracker.obtain();
            }
            this.W.addMovement(motionEvent);
            if (F0() && actionMasked == 2 && !this.N && Math.abs(this.Y - motionEvent.getY()) > this.M.u()) {
                this.M.b(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            return !this.N;
        }
        return false;
    }

    public boolean E0(long j10, float f10) {
        return false;
    }

    boolean G0(View view, float f10) {
        if (this.I) {
            return true;
        }
        if (view.getTop() < this.F) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f10 * 0.1f)) - ((float) this.F)) / ((float) Y()) > 0.5f;
    }

    public boolean H0() {
        return false;
    }

    public boolean I0() {
        return true;
    }

    void c0(int i10) {
        float f10;
        float f11;
        V v10 = this.T.get();
        if (v10 == null || this.V.isEmpty()) {
            return;
        }
        int i11 = this.F;
        if (i10 <= i11 && i11 != f0()) {
            int i12 = this.F;
            f10 = i12 - i10;
            f11 = i12 - f0();
        } else {
            int i13 = this.F;
            f10 = i13 - i10;
            f11 = this.S - i13;
        }
        float f12 = f10 / f11;
        for (int i14 = 0; i14 < this.V.size(); i14++) {
            this.V.get(i14).b(v10, f12);
        }
    }

    View d0(View view) {
        if (a0.V(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View d02 = d0(viewGroup.getChildAt(i10));
                if (d02 != null) {
                    return d02;
                }
            }
            return null;
        }
        return null;
    }

    public int f0() {
        if (this.f13954b) {
            return this.C;
        }
        return Math.max(this.B, this.f13972r ? 0 : this.f13977w);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.T = null;
        this.M = null;
    }

    public boolean i0() {
        return this.f13968n;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.T = null;
        this.M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        a0.c cVar;
        if (v10.isShown() && this.J) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                m0();
            }
            if (this.W == null) {
                this.W = VelocityTracker.obtain();
            }
            this.W.addMovement(motionEvent);
            if (actionMasked == 0) {
                int x10 = (int) motionEvent.getX();
                this.Y = (int) motionEvent.getY();
                if (this.K != 2) {
                    WeakReference<View> weakReference = this.U;
                    View view = weakReference != null ? weakReference.get() : null;
                    if (view != null && coordinatorLayout.B(view, x10, this.Y)) {
                        this.X = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.Z = true;
                    }
                }
                this.N = this.X == -1 && !coordinatorLayout.B(v10, x10, this.Y);
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.Z = false;
                this.X = -1;
                if (this.N) {
                    this.N = false;
                    return false;
                }
            }
            if (this.N || (cVar = this.M) == null || !cVar.G(motionEvent)) {
                WeakReference<View> weakReference2 = this.U;
                View view2 = weakReference2 != null ? weakReference2.get() : null;
                return (actionMasked != 2 || view2 == null || this.N || this.K == 1 || coordinatorLayout.B(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.M == null || Math.abs(((float) this.Y) - motionEvent.getY()) <= ((float) this.M.u())) ? false : true;
            }
            return true;
        }
        this.N = true;
        return false;
    }

    public boolean k0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        if (a0.B(coordinatorLayout) && !a0.B(v10)) {
            v10.setFitsSystemWindows(true);
        }
        if (this.T == null) {
            this.f13961g = coordinatorLayout.getResources().getDimensionPixelSize(d5.d.f24004b);
            D0(v10);
            this.T = new WeakReference<>(v10);
            u5.g gVar = this.f13963i;
            if (gVar != null) {
                a0.u0(v10, gVar);
                u5.g gVar2 = this.f13963i;
                float f10 = this.G;
                if (f10 == -1.0f) {
                    f10 = a0.y(v10);
                }
                gVar2.W(f10);
                boolean z10 = this.K == 3;
                this.f13979y = z10;
                this.f13963i.Y(z10 ? 0.0f : 1.0f);
            } else {
                ColorStateList colorStateList = this.f13964j;
                if (colorStateList != null) {
                    a0.v0(v10, colorStateList);
                }
            }
            K0();
            if (a0.C(v10) == 0) {
                a0.A0(v10, 1);
            }
        }
        if (this.M == null) {
            this.M = a0.c.m(coordinatorLayout, this.f13957c0);
        }
        int top = v10.getTop();
        coordinatorLayout.I(v10, i10);
        this.R = coordinatorLayout.getWidth();
        this.S = coordinatorLayout.getHeight();
        int height = v10.getHeight();
        this.Q = height;
        int i11 = this.S;
        int i12 = i11 - height;
        int i13 = this.f13977w;
        if (i12 < i13) {
            if (this.f13972r) {
                this.Q = i11;
            } else {
                this.Q = i11 - i13;
            }
        }
        this.C = Math.max(0, i11 - this.Q);
        X();
        W();
        int i14 = this.K;
        if (i14 == 3) {
            a0.b0(v10, f0());
        } else if (i14 == 6) {
            a0.b0(v10, this.D);
        } else if (this.H && i14 == 5) {
            a0.b0(v10, this.S);
        } else if (i14 == 4) {
            a0.b0(v10, this.F);
        } else if (i14 == 1 || i14 == 2) {
            a0.b0(v10, top - v10.getTop());
        }
        this.U = new WeakReference<>(d0(v10));
        for (int i15 = 0; i15 < this.V.size(); i15++) {
            this.V.get(i15).a(v10);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        v10.measure(e0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f13965k, marginLayoutParams.width), e0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f13966l, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11) {
        WeakReference<View> weakReference;
        if (k0() && (weakReference = this.U) != null && view == weakReference.get()) {
            return this.K != 3 || super.o(coordinatorLayout, v10, view, f10, f11);
        }
        return false;
    }

    public void p0(boolean z10) {
        this.J = z10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.U;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!k0() || view == view2) {
            int top = v10.getTop();
            int i13 = top - i11;
            if (i11 > 0) {
                if (i13 < f0()) {
                    iArr[1] = top - f0();
                    a0.b0(v10, -iArr[1]);
                    C0(3);
                } else if (!this.J) {
                    return;
                } else {
                    iArr[1] = i11;
                    a0.b0(v10, -i11);
                    C0(1);
                }
            } else if (i11 < 0 && !view.canScrollVertically(-1)) {
                int i14 = this.F;
                if (i13 > i14 && !this.H) {
                    iArr[1] = top - i14;
                    a0.b0(v10, -iArr[1]);
                    C0(4);
                } else if (!this.J) {
                    return;
                } else {
                    iArr[1] = i11;
                    a0.b0(v10, -i11);
                    C0(1);
                }
            }
            c0(v10.getTop());
            this.O = i11;
            this.P = true;
        }
    }

    public void q0(int i10) {
        if (i10 >= 0) {
            this.B = i10;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void r0(boolean z10) {
        if (this.f13954b == z10) {
            return;
        }
        this.f13954b = z10;
        if (this.T != null) {
            W();
        }
        C0((this.f13954b && this.K == 6) ? 3 : this.K);
        K0();
    }

    public void s0(boolean z10) {
        this.f13968n = z10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }

    public void t0(float f10) {
        if (f10 > 0.0f && f10 < 1.0f) {
            this.E = f10;
            if (this.T != null) {
                X();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    public void u0(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            if (!z10 && this.K == 5) {
                B0(4);
            }
            K0();
        }
    }

    public void v0(int i10) {
        this.f13966l = i10;
    }

    public void w0(int i10) {
        this.f13965k = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.x(coordinatorLayout, v10, savedState.a());
        n0(savedState);
        int i10 = savedState.f13981c;
        if (i10 != 1 && i10 != 2) {
            this.K = i10;
            this.L = i10;
            return;
        }
        this.K = 4;
        this.L = 4;
    }

    public void x0(int i10) {
        y0(i10, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, V v10) {
        return new SavedState(super.y(coordinatorLayout, v10), (BottomSheetBehavior<?>) this);
    }

    public final void y0(int i10, boolean z10) {
        boolean z11 = true;
        if (i10 == -1) {
            if (!this.f13960f) {
                this.f13960f = true;
            }
            z11 = false;
        } else {
            if (this.f13960f || this.f13959e != i10) {
                this.f13960f = false;
                this.f13959e = Math.max(0, i10);
            }
            z11 = false;
        }
        if (z11) {
            N0(z10);
        }
    }

    public void z0(int i10) {
        this.f13952a = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class g {

        /* renamed from: a  reason: collision with root package name */
        private int f13996a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f13997b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f13998c;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.f13997b = false;
                a0.c cVar = BottomSheetBehavior.this.M;
                if (cVar != null && cVar.k(true)) {
                    g gVar = g.this;
                    gVar.c(gVar.f13996a);
                    return;
                }
                g gVar2 = g.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.K == 2) {
                    bottomSheetBehavior.C0(gVar2.f13996a);
                }
            }
        }

        private g() {
            this.f13998c = new a();
        }

        void c(int i10) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.T;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f13996a = i10;
            if (this.f13997b) {
                return;
            }
            a0.i0(BottomSheetBehavior.this.T.get(), this.f13998c);
            this.f13997b = true;
        }

        /* synthetic */ g(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        final int f13981c;

        /* renamed from: d  reason: collision with root package name */
        int f13982d;

        /* renamed from: e  reason: collision with root package name */
        boolean f13983e;

        /* renamed from: f  reason: collision with root package name */
        boolean f13984f;

        /* renamed from: g  reason: collision with root package name */
        boolean f13985g;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13981c = parcel.readInt();
            this.f13982d = parcel.readInt();
            this.f13983e = parcel.readInt() == 1;
            this.f13984f = parcel.readInt() == 1;
            this.f13985g = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f13981c);
            parcel.writeInt(this.f13982d);
            parcel.writeInt(this.f13983e ? 1 : 0);
            parcel.writeInt(this.f13984f ? 1 : 0);
            parcel.writeInt(this.f13985g ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f13981c = bottomSheetBehavior.K;
            this.f13982d = ((BottomSheetBehavior) bottomSheetBehavior).f13959e;
            this.f13983e = ((BottomSheetBehavior) bottomSheetBehavior).f13954b;
            this.f13984f = bottomSheetBehavior.H;
            this.f13985g = ((BottomSheetBehavior) bottomSheetBehavior).I;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        this.f13952a = 0;
        this.f13954b = true;
        this.f13956c = false;
        this.f13965k = -1;
        this.f13966l = -1;
        this.f13980z = new g(this, null);
        this.E = 0.5f;
        this.G = -1.0f;
        this.J = true;
        this.K = 4;
        this.L = 4;
        this.V = new ArrayList<>();
        this.f13955b0 = -1;
        this.f13957c0 = new d();
        this.f13962h = context.getResources().getDimensionPixelSize(d5.d.M);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d5.k.f24319z);
        int i11 = d5.k.D;
        if (obtainStyledAttributes.hasValue(i11)) {
            this.f13964j = r5.c.a(context, obtainStyledAttributes, i11);
        }
        if (obtainStyledAttributes.hasValue(d5.k.U)) {
            this.f13978x = k.e(context, attributeSet, d5.b.f23972b, f13951d0).m();
        }
        a0(context);
        b0();
        if (Build.VERSION.SDK_INT >= 21) {
            this.G = obtainStyledAttributes.getDimension(d5.k.C, -1.0f);
        }
        int i12 = d5.k.A;
        if (obtainStyledAttributes.hasValue(i12)) {
            w0(obtainStyledAttributes.getDimensionPixelSize(i12, -1));
        }
        int i13 = d5.k.B;
        if (obtainStyledAttributes.hasValue(i13)) {
            v0(obtainStyledAttributes.getDimensionPixelSize(i13, -1));
        }
        int i14 = d5.k.J;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i14);
        if (peekValue != null && (i10 = peekValue.data) == -1) {
            x0(i10);
        } else {
            x0(obtainStyledAttributes.getDimensionPixelSize(i14, -1));
        }
        u0(obtainStyledAttributes.getBoolean(d5.k.I, false));
        s0(obtainStyledAttributes.getBoolean(d5.k.M, false));
        r0(obtainStyledAttributes.getBoolean(d5.k.G, true));
        A0(obtainStyledAttributes.getBoolean(d5.k.L, false));
        p0(obtainStyledAttributes.getBoolean(d5.k.E, true));
        z0(obtainStyledAttributes.getInt(d5.k.K, 0));
        t0(obtainStyledAttributes.getFloat(d5.k.H, 0.5f));
        int i15 = d5.k.F;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i15);
        if (peekValue2 != null && peekValue2.type == 16) {
            q0(peekValue2.data);
        } else {
            q0(obtainStyledAttributes.getDimensionPixelOffset(i15, 0));
        }
        this.f13969o = obtainStyledAttributes.getBoolean(d5.k.Q, false);
        this.f13970p = obtainStyledAttributes.getBoolean(d5.k.R, false);
        this.f13971q = obtainStyledAttributes.getBoolean(d5.k.S, false);
        this.f13972r = obtainStyledAttributes.getBoolean(d5.k.T, true);
        this.f13973s = obtainStyledAttributes.getBoolean(d5.k.N, false);
        this.f13974t = obtainStyledAttributes.getBoolean(d5.k.O, false);
        this.f13975u = obtainStyledAttributes.getBoolean(d5.k.P, false);
        obtainStyledAttributes.recycle();
        this.f13958d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}

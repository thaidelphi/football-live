package com.google.android.exoplayer2.ui;

import a5.e0;
import a5.p0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b5.a0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.ui.k;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import n3.j1;
import n3.l2;
import n3.l3;
import n3.o;
import n3.o2;
import n3.p2;
import n3.q3;
import n3.r2;
import n3.u1;
import n3.z1;
import y4.m;
import y4.n;
/* compiled from: PlayerControlView.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c extends FrameLayout {
    private final Drawable A;
    private final Drawable B;
    private final float C;
    private final float D;
    private final String E;
    private final String F;
    private p2 G;
    private d H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private int M;
    private int N;
    private int O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private long U;
    private long[] V;
    private boolean[] W;

    /* renamed from: a  reason: collision with root package name */
    private final View$OnClickListenerC0176c f10964a;

    /* renamed from: a0  reason: collision with root package name */
    private long[] f10965a0;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList<e> f10966b;

    /* renamed from: b0  reason: collision with root package name */
    private boolean[] f10967b0;

    /* renamed from: c  reason: collision with root package name */
    private final View f10968c;

    /* renamed from: c0  reason: collision with root package name */
    private long f10969c0;

    /* renamed from: d  reason: collision with root package name */
    private final View f10970d;

    /* renamed from: d0  reason: collision with root package name */
    private long f10971d0;

    /* renamed from: e  reason: collision with root package name */
    private final View f10972e;

    /* renamed from: e0  reason: collision with root package name */
    private long f10973e0;

    /* renamed from: f  reason: collision with root package name */
    private final View f10974f;

    /* renamed from: g  reason: collision with root package name */
    private final View f10975g;

    /* renamed from: h  reason: collision with root package name */
    private final View f10976h;

    /* renamed from: i  reason: collision with root package name */
    private final ImageView f10977i;

    /* renamed from: j  reason: collision with root package name */
    private final ImageView f10978j;

    /* renamed from: k  reason: collision with root package name */
    private final View f10979k;

    /* renamed from: l  reason: collision with root package name */
    private final TextView f10980l;

    /* renamed from: m  reason: collision with root package name */
    private final TextView f10981m;

    /* renamed from: n  reason: collision with root package name */
    private final k f10982n;

    /* renamed from: o  reason: collision with root package name */
    private final StringBuilder f10983o;

    /* renamed from: p  reason: collision with root package name */
    private final Formatter f10984p;

    /* renamed from: q  reason: collision with root package name */
    private final l3.b f10985q;

    /* renamed from: r  reason: collision with root package name */
    private final l3.d f10986r;

    /* renamed from: s  reason: collision with root package name */
    private final Runnable f10987s;

    /* renamed from: t  reason: collision with root package name */
    private final Runnable f10988t;

    /* renamed from: u  reason: collision with root package name */
    private final Drawable f10989u;

    /* renamed from: v  reason: collision with root package name */
    private final Drawable f10990v;

    /* renamed from: w  reason: collision with root package name */
    private final Drawable f10991w;

    /* renamed from: x  reason: collision with root package name */
    private final String f10992x;

    /* renamed from: y  reason: collision with root package name */
    private final String f10993y;

    /* renamed from: z  reason: collision with root package name */
    private final String f10994z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PlayerControlView.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {
        public static boolean a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    /* compiled from: PlayerControlView.java */
    /* renamed from: com.google.android.exoplayer2.ui.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private final class View$OnClickListenerC0176c implements p2.d, k.a, View.OnClickListener {
        private View$OnClickListenerC0176c() {
        }

        @Override // n3.p2.d
        public /* synthetic */ void B(boolean z10) {
            r2.i(this, z10);
        }

        @Override // com.google.android.exoplayer2.ui.k.a
        public void C(k kVar, long j10) {
            if (c.this.f10981m != null) {
                c.this.f10981m.setText(p0.f0(c.this.f10983o, c.this.f10984p, j10));
            }
        }

        @Override // n3.p2.d
        public /* synthetic */ void D(o oVar) {
            r2.d(this, oVar);
        }

        @Override // com.google.android.exoplayer2.ui.k.a
        public void E(k kVar, long j10, boolean z10) {
            c.this.L = false;
            if (z10 || c.this.G == null) {
                return;
            }
            c cVar = c.this;
            cVar.N(cVar.G, j10);
        }

        @Override // n3.p2.d
        public /* synthetic */ void F(int i10) {
            r2.o(this, i10);
        }

        @Override // com.google.android.exoplayer2.ui.k.a
        public void G(k kVar, long j10) {
            c.this.L = true;
            if (c.this.f10981m != null) {
                c.this.f10981m.setText(p0.f0(c.this.f10983o, c.this.f10984p, j10));
            }
        }

        @Override // n3.p2.d
        public /* synthetic */ void K(boolean z10) {
            r2.y(this, z10);
        }

        @Override // n3.p2.d
        public /* synthetic */ void L(int i10, boolean z10) {
            r2.e(this, i10, z10);
        }

        @Override // n3.p2.d
        public /* synthetic */ void N(l3 l3Var, int i10) {
            r2.B(this, l3Var, i10);
        }

        @Override // n3.p2.d
        public /* synthetic */ void O(z1 z1Var) {
            r2.k(this, z1Var);
        }

        @Override // n3.p2.d
        public /* synthetic */ void P(l2 l2Var) {
            r2.q(this, l2Var);
        }

        @Override // n3.p2.d
        public /* synthetic */ void Q() {
            r2.v(this);
        }

        @Override // n3.p2.d
        public void R(p2 p2Var, p2.c cVar) {
            if (cVar.b(4, 5)) {
                c.this.T();
            }
            if (cVar.b(4, 5, 7)) {
                c.this.U();
            }
            if (cVar.a(8)) {
                c.this.V();
            }
            if (cVar.a(9)) {
                c.this.W();
            }
            if (cVar.b(8, 9, 11, 0, 13)) {
                c.this.S();
            }
            if (cVar.b(11, 0)) {
                c.this.X();
            }
        }

        @Override // n3.p2.d
        public /* synthetic */ void T(u1 u1Var, int i10) {
            r2.j(this, u1Var, i10);
        }

        @Override // n3.p2.d
        public /* synthetic */ void U(int i10, int i11) {
            r2.A(this, i10, i11);
        }

        @Override // n3.p2.d
        public /* synthetic */ void V(p2.e eVar, p2.e eVar2, int i10) {
            r2.u(this, eVar, eVar2, i10);
        }

        @Override // n3.p2.d
        public /* synthetic */ void W(p2.b bVar) {
            r2.a(this, bVar);
        }

        @Override // n3.p2.d
        public /* synthetic */ void Y(int i10) {
            r2.t(this, i10);
        }

        @Override // n3.p2.d
        public /* synthetic */ void a(boolean z10) {
            r2.z(this, z10);
        }

        @Override // n3.p2.d
        public /* synthetic */ void a0(boolean z10) {
            r2.g(this, z10);
        }

        @Override // n3.p2.d
        public /* synthetic */ void b0() {
            r2.x(this);
        }

        @Override // n3.p2.d
        public /* synthetic */ void d0(boolean z10, int i10) {
            r2.s(this, z10, i10);
        }

        @Override // n3.p2.d
        public /* synthetic */ void g(Metadata metadata) {
            r2.l(this, metadata);
        }

        @Override // n3.p2.d
        public /* synthetic */ void g0(boolean z10, int i10) {
            r2.m(this, z10, i10);
        }

        @Override // n3.p2.d
        public /* synthetic */ void h(List list) {
            r2.b(this, list);
        }

        @Override // n3.p2.d
        public /* synthetic */ void k0(l2 l2Var) {
            r2.r(this, l2Var);
        }

        @Override // n3.p2.d
        public /* synthetic */ void m0(q3 q3Var) {
            r2.C(this, q3Var);
        }

        @Override // n3.p2.d
        public /* synthetic */ void n(n4.e eVar) {
            r2.c(this, eVar);
        }

        @Override // n3.p2.d
        public /* synthetic */ void n0(boolean z10) {
            r2.h(this, z10);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p2 p2Var = c.this.G;
            if (p2Var == null) {
                return;
            }
            if (c.this.f10970d != view) {
                if (c.this.f10968c != view) {
                    if (c.this.f10975g != view) {
                        if (c.this.f10976h != view) {
                            if (c.this.f10972e == view) {
                                c.this.C(p2Var);
                                return;
                            } else if (c.this.f10974f == view) {
                                c.this.B(p2Var);
                                return;
                            } else if (c.this.f10977i != view) {
                                if (c.this.f10978j == view) {
                                    p2Var.B(!p2Var.R());
                                    return;
                                }
                                return;
                            } else {
                                p2Var.O(e0.a(p2Var.Q(), c.this.O));
                                return;
                            }
                        }
                        p2Var.U();
                        return;
                    } else if (p2Var.M() != 4) {
                        p2Var.T();
                        return;
                    } else {
                        return;
                    }
                }
                p2Var.i();
                return;
            }
            p2Var.v();
        }

        @Override // n3.p2.d
        public /* synthetic */ void t(int i10) {
            r2.w(this, i10);
        }

        @Override // n3.p2.d
        public /* synthetic */ void u(a0 a0Var) {
            r2.D(this, a0Var);
        }

        @Override // n3.p2.d
        public /* synthetic */ void w(o2 o2Var) {
            r2.n(this, o2Var);
        }

        @Override // n3.p2.d
        public /* synthetic */ void z(int i10) {
            r2.p(this, i10);
        }
    }

    /* compiled from: PlayerControlView.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface d {
        void a(long j10, long j11);
    }

    /* compiled from: PlayerControlView.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface e {
        void C(int i10);
    }

    static {
        j1.a("goog.exo.ui");
    }

    public c(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) {
        super(context, attributeSet, i10);
        int i11 = y4.l.f33104b;
        this.M = 5000;
        this.O = 0;
        this.N = 200;
        this.U = -9223372036854775807L;
        this.P = true;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = false;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, n.f33151x, i10, 0);
            try {
                this.M = obtainStyledAttributes.getInt(n.F, this.M);
                i11 = obtainStyledAttributes.getResourceId(n.f33152y, i11);
                this.O = E(obtainStyledAttributes, this.O);
                this.P = obtainStyledAttributes.getBoolean(n.D, this.P);
                this.Q = obtainStyledAttributes.getBoolean(n.A, this.Q);
                this.R = obtainStyledAttributes.getBoolean(n.C, this.R);
                this.S = obtainStyledAttributes.getBoolean(n.B, this.S);
                this.T = obtainStyledAttributes.getBoolean(n.E, this.T);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(n.G, this.N));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f10966b = new CopyOnWriteArrayList<>();
        this.f10985q = new l3.b();
        this.f10986r = new l3.d();
        StringBuilder sb = new StringBuilder();
        this.f10983o = sb;
        this.f10984p = new Formatter(sb, Locale.getDefault());
        this.V = new long[0];
        this.W = new boolean[0];
        this.f10965a0 = new long[0];
        this.f10967b0 = new boolean[0];
        View$OnClickListenerC0176c view$OnClickListenerC0176c = new View$OnClickListenerC0176c();
        this.f10964a = view$OnClickListenerC0176c;
        this.f10987s = new Runnable() { // from class: y4.g
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.exoplayer2.ui.c.this.U();
            }
        };
        this.f10988t = new Runnable() { // from class: y4.f
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.exoplayer2.ui.c.this.F();
            }
        };
        LayoutInflater.from(context).inflate(i11, this);
        setDescendantFocusability(262144);
        int i12 = y4.j.f33093p;
        k kVar = (k) findViewById(i12);
        View findViewById = findViewById(y4.j.f33094q);
        if (kVar != null) {
            this.f10982n = kVar;
        } else if (findViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2);
            defaultTimeBar.setId(i12);
            defaultTimeBar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.f10982n = defaultTimeBar;
        } else {
            this.f10982n = null;
        }
        this.f10980l = (TextView) findViewById(y4.j.f33084g);
        this.f10981m = (TextView) findViewById(y4.j.f33091n);
        k kVar2 = this.f10982n;
        if (kVar2 != null) {
            kVar2.a(view$OnClickListenerC0176c);
        }
        View findViewById2 = findViewById(y4.j.f33090m);
        this.f10972e = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(view$OnClickListenerC0176c);
        }
        View findViewById3 = findViewById(y4.j.f33089l);
        this.f10974f = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(view$OnClickListenerC0176c);
        }
        View findViewById4 = findViewById(y4.j.f33092o);
        this.f10968c = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(view$OnClickListenerC0176c);
        }
        View findViewById5 = findViewById(y4.j.f33087j);
        this.f10970d = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(view$OnClickListenerC0176c);
        }
        View findViewById6 = findViewById(y4.j.f33096s);
        this.f10976h = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(view$OnClickListenerC0176c);
        }
        View findViewById7 = findViewById(y4.j.f33086i);
        this.f10975g = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(view$OnClickListenerC0176c);
        }
        ImageView imageView = (ImageView) findViewById(y4.j.f33095r);
        this.f10977i = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(view$OnClickListenerC0176c);
        }
        ImageView imageView2 = (ImageView) findViewById(y4.j.f33097t);
        this.f10978j = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(view$OnClickListenerC0176c);
        }
        View findViewById8 = findViewById(y4.j.f33100w);
        this.f10979k = findViewById8;
        setShowVrButton(false);
        R(false, false, findViewById8);
        Resources resources = context.getResources();
        this.C = resources.getInteger(y4.k.f33102b) / 100.0f;
        this.D = resources.getInteger(y4.k.f33101a) / 100.0f;
        this.f10989u = resources.getDrawable(y4.i.f33073b);
        this.f10990v = resources.getDrawable(y4.i.f33074c);
        this.f10991w = resources.getDrawable(y4.i.f33072a);
        this.A = resources.getDrawable(y4.i.f33076e);
        this.B = resources.getDrawable(y4.i.f33075d);
        this.f10992x = resources.getString(m.f33108c);
        this.f10993y = resources.getString(m.f33109d);
        this.f10994z = resources.getString(m.f33107b);
        this.E = resources.getString(m.f33112g);
        this.F = resources.getString(m.f33111f);
        this.f10971d0 = -9223372036854775807L;
        this.f10973e0 = -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(p2 p2Var) {
        p2Var.pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(p2 p2Var) {
        int M = p2Var.M();
        if (M == 1) {
            p2Var.a();
        } else if (M == 4) {
            M(p2Var, p2Var.N(), -9223372036854775807L);
        }
        p2Var.e();
    }

    private void D(p2 p2Var) {
        int M = p2Var.M();
        if (M != 1 && M != 4 && p2Var.A()) {
            B(p2Var);
        } else {
            C(p2Var);
        }
    }

    private static int E(TypedArray typedArray, int i10) {
        return typedArray.getInt(n.f33153z, i10);
    }

    private void G() {
        removeCallbacks(this.f10988t);
        if (this.M > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            int i10 = this.M;
            this.U = uptimeMillis + i10;
            if (this.I) {
                postDelayed(this.f10988t, i10);
                return;
            }
            return;
        }
        this.U = -9223372036854775807L;
    }

    @SuppressLint({"InlinedApi"})
    private static boolean H(int i10) {
        return i10 == 90 || i10 == 89 || i10 == 85 || i10 == 79 || i10 == 126 || i10 == 127 || i10 == 87 || i10 == 88;
    }

    private void K() {
        View view;
        View view2;
        boolean O = O();
        if (!O && (view2 = this.f10972e) != null) {
            view2.sendAccessibilityEvent(8);
        } else if (!O || (view = this.f10974f) == null) {
        } else {
            view.sendAccessibilityEvent(8);
        }
    }

    private void L() {
        View view;
        View view2;
        boolean O = O();
        if (!O && (view2 = this.f10972e) != null) {
            view2.requestFocus();
        } else if (!O || (view = this.f10974f) == null) {
        } else {
            view.requestFocus();
        }
    }

    private void M(p2 p2Var, int i10, long j10) {
        p2Var.y(i10, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(p2 p2Var, long j10) {
        int N;
        l3 t10 = p2Var.t();
        if (this.K && !t10.u()) {
            int t11 = t10.t();
            N = 0;
            while (true) {
                long f10 = t10.r(N, this.f10986r).f();
                if (j10 < f10) {
                    break;
                } else if (N == t11 - 1) {
                    j10 = f10;
                    break;
                } else {
                    j10 -= f10;
                    N++;
                }
            }
        } else {
            N = p2Var.N();
        }
        M(p2Var, N, j10);
        U();
    }

    private boolean O() {
        p2 p2Var = this.G;
        return (p2Var == null || p2Var.M() == 4 || this.G.M() == 1 || !this.G.A()) ? false : true;
    }

    private void Q() {
        T();
        S();
        V();
        W();
        X();
    }

    private void R(boolean z10, boolean z11, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z11);
        view.setAlpha(z11 ? this.C : this.D);
        view.setVisibility(z10 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (I() && this.I) {
            p2 p2Var = this.G;
            boolean z14 = false;
            if (p2Var != null) {
                boolean p10 = p2Var.p(5);
                boolean p11 = p2Var.p(7);
                z12 = p2Var.p(11);
                z13 = p2Var.p(12);
                z10 = p2Var.p(9);
                z11 = p10;
                z14 = p11;
            } else {
                z10 = false;
                z11 = false;
                z12 = false;
                z13 = false;
            }
            R(this.R, z14, this.f10968c);
            R(this.P, z12, this.f10976h);
            R(this.Q, z13, this.f10975g);
            R(this.S, z10, this.f10970d);
            k kVar = this.f10982n;
            if (kVar != null) {
                kVar.setEnabled(z11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (I() && this.I) {
            boolean O = O();
            View view = this.f10972e;
            boolean z13 = true;
            if (view != null) {
                z10 = (O && view.isFocused()) | false;
                if (p0.f482a < 21) {
                    z12 = z10;
                } else {
                    z12 = O && b.a(this.f10972e);
                }
                z11 = z12 | false;
                this.f10972e.setVisibility(O ? 8 : 0);
            } else {
                z10 = false;
                z11 = false;
            }
            View view2 = this.f10974f;
            if (view2 != null) {
                z10 |= !O && view2.isFocused();
                if (p0.f482a < 21) {
                    z13 = z10;
                } else if (O || !b.a(this.f10974f)) {
                    z13 = false;
                }
                z11 |= z13;
                this.f10974f.setVisibility(O ? 0 : 8);
            }
            if (z10) {
                L();
            }
            if (z11) {
                K();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        long j10;
        float f10;
        if (I() && this.I) {
            p2 p2Var = this.G;
            long j11 = 0;
            if (p2Var != null) {
                j11 = this.f10969c0 + p2Var.K();
                j10 = this.f10969c0 + p2Var.S();
            } else {
                j10 = 0;
            }
            boolean z10 = j11 != this.f10971d0;
            boolean z11 = j10 != this.f10973e0;
            this.f10971d0 = j11;
            this.f10973e0 = j10;
            TextView textView = this.f10981m;
            if (textView != null && !this.L && z10) {
                textView.setText(p0.f0(this.f10983o, this.f10984p, j11));
            }
            k kVar = this.f10982n;
            if (kVar != null) {
                kVar.setPosition(j11);
                this.f10982n.setBufferedPosition(j10);
            }
            d dVar = this.H;
            if (dVar != null && (z10 || z11)) {
                dVar.a(j11, j10);
            }
            removeCallbacks(this.f10987s);
            int M = p2Var == null ? 1 : p2Var.M();
            if (p2Var == null || !p2Var.isPlaying()) {
                if (M == 4 || M == 1) {
                    return;
                }
                postDelayed(this.f10987s, 1000L);
                return;
            }
            k kVar2 = this.f10982n;
            long min = Math.min(kVar2 != null ? kVar2.getPreferredUpdateDelay() : 1000L, 1000 - (j11 % 1000));
            postDelayed(this.f10987s, p0.r(p2Var.b().f28262a > 0.0f ? ((float) min) / f10 : 1000L, this.N, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        ImageView imageView;
        if (I() && this.I && (imageView = this.f10977i) != null) {
            if (this.O == 0) {
                R(false, false, imageView);
                return;
            }
            p2 p2Var = this.G;
            if (p2Var == null) {
                R(true, false, imageView);
                this.f10977i.setImageDrawable(this.f10989u);
                this.f10977i.setContentDescription(this.f10992x);
                return;
            }
            R(true, true, imageView);
            int Q = p2Var.Q();
            if (Q == 0) {
                this.f10977i.setImageDrawable(this.f10989u);
                this.f10977i.setContentDescription(this.f10992x);
            } else if (Q == 1) {
                this.f10977i.setImageDrawable(this.f10990v);
                this.f10977i.setContentDescription(this.f10993y);
            } else if (Q == 2) {
                this.f10977i.setImageDrawable(this.f10991w);
                this.f10977i.setContentDescription(this.f10994z);
            }
            this.f10977i.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        ImageView imageView;
        String str;
        if (I() && this.I && (imageView = this.f10978j) != null) {
            p2 p2Var = this.G;
            if (!this.T) {
                R(false, false, imageView);
            } else if (p2Var == null) {
                R(true, false, imageView);
                this.f10978j.setImageDrawable(this.B);
                this.f10978j.setContentDescription(this.F);
            } else {
                R(true, true, imageView);
                this.f10978j.setImageDrawable(p2Var.R() ? this.A : this.B);
                ImageView imageView2 = this.f10978j;
                if (p2Var.R()) {
                    str = this.E;
                } else {
                    str = this.F;
                }
                imageView2.setContentDescription(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        int i10;
        l3.d dVar;
        p2 p2Var = this.G;
        if (p2Var == null) {
            return;
        }
        boolean z10 = true;
        this.K = this.J && z(p2Var.t(), this.f10986r);
        long j10 = 0;
        this.f10969c0 = 0L;
        l3 t10 = p2Var.t();
        if (t10.u()) {
            i10 = 0;
        } else {
            int N = p2Var.N();
            boolean z11 = this.K;
            int i11 = z11 ? 0 : N;
            int t11 = z11 ? t10.t() - 1 : N;
            long j11 = 0;
            i10 = 0;
            while (true) {
                if (i11 > t11) {
                    break;
                }
                if (i11 == N) {
                    this.f10969c0 = p0.Z0(j11);
                }
                t10.r(i11, this.f10986r);
                l3.d dVar2 = this.f10986r;
                if (dVar2.f28159n == -9223372036854775807L) {
                    a5.a.f(this.K ^ z10);
                    break;
                }
                int i12 = dVar2.f28160o;
                while (true) {
                    dVar = this.f10986r;
                    if (i12 <= dVar.f28161p) {
                        t10.j(i12, this.f10985q);
                        int f10 = this.f10985q.f();
                        for (int r10 = this.f10985q.r(); r10 < f10; r10++) {
                            long i13 = this.f10985q.i(r10);
                            if (i13 == Long.MIN_VALUE) {
                                long j12 = this.f10985q.f28134d;
                                if (j12 != -9223372036854775807L) {
                                    i13 = j12;
                                }
                            }
                            long q10 = i13 + this.f10985q.q();
                            if (q10 >= 0) {
                                long[] jArr = this.V;
                                if (i10 == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.V = Arrays.copyOf(jArr, length);
                                    this.W = Arrays.copyOf(this.W, length);
                                }
                                this.V[i10] = p0.Z0(j11 + q10);
                                this.W[i10] = this.f10985q.s(r10);
                                i10++;
                            }
                        }
                        i12++;
                    }
                }
                j11 += dVar.f28159n;
                i11++;
                z10 = true;
            }
            j10 = j11;
        }
        long Z0 = p0.Z0(j10);
        TextView textView = this.f10980l;
        if (textView != null) {
            textView.setText(p0.f0(this.f10983o, this.f10984p, Z0));
        }
        k kVar = this.f10982n;
        if (kVar != null) {
            kVar.setDuration(Z0);
            int length2 = this.f10965a0.length;
            int i14 = i10 + length2;
            long[] jArr2 = this.V;
            if (i14 > jArr2.length) {
                this.V = Arrays.copyOf(jArr2, i14);
                this.W = Arrays.copyOf(this.W, i14);
            }
            System.arraycopy(this.f10965a0, 0, this.V, i10, length2);
            System.arraycopy(this.f10967b0, 0, this.W, i10, length2);
            this.f10982n.b(this.V, this.W, i14);
        }
        U();
    }

    private static boolean z(l3 l3Var, l3.d dVar) {
        if (l3Var.t() > 100) {
            return false;
        }
        int t10 = l3Var.t();
        for (int i10 = 0; i10 < t10; i10++) {
            if (l3Var.r(i10, dVar).f28159n == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    public boolean A(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        p2 p2Var = this.G;
        if (p2Var == null || !H(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (p2Var.M() != 4) {
                    p2Var.T();
                    return true;
                }
                return true;
            } else if (keyCode == 89) {
                p2Var.U();
                return true;
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    D(p2Var);
                    return true;
                } else if (keyCode == 87) {
                    p2Var.v();
                    return true;
                } else if (keyCode == 88) {
                    p2Var.i();
                    return true;
                } else if (keyCode == 126) {
                    C(p2Var);
                    return true;
                } else if (keyCode != 127) {
                    return true;
                } else {
                    B(p2Var);
                    return true;
                }
            } else {
                return true;
            }
        }
        return true;
    }

    public void F() {
        if (I()) {
            setVisibility(8);
            Iterator<e> it = this.f10966b.iterator();
            while (it.hasNext()) {
                it.next().C(getVisibility());
            }
            removeCallbacks(this.f10987s);
            removeCallbacks(this.f10988t);
            this.U = -9223372036854775807L;
        }
    }

    public boolean I() {
        return getVisibility() == 0;
    }

    public void J(e eVar) {
        this.f10966b.remove(eVar);
    }

    public void P() {
        if (!I()) {
            setVisibility(0);
            Iterator<e> it = this.f10966b.iterator();
            while (it.hasNext()) {
                it.next().C(getVisibility());
            }
            Q();
            L();
            K();
        }
        G();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return A(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f10988t);
        } else if (motionEvent.getAction() == 1) {
            G();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public p2 getPlayer() {
        return this.G;
    }

    public int getRepeatToggleModes() {
        return this.O;
    }

    public boolean getShowShuffleButton() {
        return this.T;
    }

    public int getShowTimeoutMs() {
        return this.M;
    }

    public boolean getShowVrButton() {
        View view = this.f10979k;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        long j10 = this.U;
        if (j10 != -9223372036854775807L) {
            long uptimeMillis = j10 - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                F();
            } else {
                postDelayed(this.f10988t, uptimeMillis);
            }
        } else if (I()) {
            G();
        }
        Q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I = false;
        removeCallbacks(this.f10987s);
        removeCallbacks(this.f10988t);
    }

    public void setPlayer(p2 p2Var) {
        boolean z10 = true;
        a5.a.f(Looper.myLooper() == Looper.getMainLooper());
        if (p2Var != null && p2Var.u() != Looper.getMainLooper()) {
            z10 = false;
        }
        a5.a.a(z10);
        p2 p2Var2 = this.G;
        if (p2Var2 == p2Var) {
            return;
        }
        if (p2Var2 != null) {
            p2Var2.q(this.f10964a);
        }
        this.G = p2Var;
        if (p2Var != null) {
            p2Var.x(this.f10964a);
        }
        Q();
    }

    public void setProgressUpdateListener(d dVar) {
        this.H = dVar;
    }

    public void setRepeatToggleModes(int i10) {
        this.O = i10;
        p2 p2Var = this.G;
        if (p2Var != null) {
            int Q = p2Var.Q();
            if (i10 == 0 && Q != 0) {
                this.G.O(0);
            } else if (i10 == 1 && Q == 2) {
                this.G.O(1);
            } else if (i10 == 2 && Q == 1) {
                this.G.O(2);
            }
        }
        V();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.Q = z10;
        S();
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        this.J = z10;
        X();
    }

    public void setShowNextButton(boolean z10) {
        this.S = z10;
        S();
    }

    public void setShowPreviousButton(boolean z10) {
        this.R = z10;
        S();
    }

    public void setShowRewindButton(boolean z10) {
        this.P = z10;
        S();
    }

    public void setShowShuffleButton(boolean z10) {
        this.T = z10;
        W();
    }

    public void setShowTimeoutMs(int i10) {
        this.M = i10;
        if (I()) {
            G();
        }
    }

    public void setShowVrButton(boolean z10) {
        View view = this.f10979k;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.N = p0.q(i10, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.f10979k;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            R(getShowVrButton(), onClickListener != null, this.f10979k);
        }
    }

    public void y(e eVar) {
        a5.a.e(eVar);
        this.f10966b.add(eVar);
    }
}

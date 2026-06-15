package n3;

import a5.s;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import c5.l;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.b9;
import com.unity3d.services.UnityAdsConstants;
import e4.g0;
import e4.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import n3.b;
import n3.d;
import n3.g2;
import n3.g3;
import n3.i1;
import n3.l3;
import n3.p2;
import n3.s;
import n3.t2;
import n3.x0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExoPlayerImpl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class x0 extends n3.e implements s {
    private final n3.d A;
    private final g3 B;
    private final r3 C;
    private final s3 D;
    private final long E;
    private int F;
    private boolean G;
    private int H;
    private int I;
    private boolean J;
    private int K;
    private d3 L;
    private e4.g0 M;
    private boolean N;
    private p2.b O;
    private z1 P;
    private z1 Q;
    private m1 R;
    private m1 S;
    private AudioTrack T;
    private Object U;
    private Surface V;
    private SurfaceHolder W;
    private c5.l X;
    private boolean Y;
    private TextureView Z;

    /* renamed from: a0  reason: collision with root package name */
    private int f28484a0;

    /* renamed from: b  reason: collision with root package name */
    final x4.c0 f28485b;

    /* renamed from: b0  reason: collision with root package name */
    private int f28486b0;

    /* renamed from: c  reason: collision with root package name */
    final p2.b f28487c;

    /* renamed from: c0  reason: collision with root package name */
    private a5.f0 f28488c0;

    /* renamed from: d  reason: collision with root package name */
    private final a5.g f28489d;

    /* renamed from: d0  reason: collision with root package name */
    private q3.e f28490d0;

    /* renamed from: e  reason: collision with root package name */
    private final Context f28491e;

    /* renamed from: e0  reason: collision with root package name */
    private q3.e f28492e0;

    /* renamed from: f  reason: collision with root package name */
    private final p2 f28493f;

    /* renamed from: f0  reason: collision with root package name */
    private int f28494f0;

    /* renamed from: g  reason: collision with root package name */
    private final y2[] f28495g;

    /* renamed from: g0  reason: collision with root package name */
    private p3.e f28496g0;

    /* renamed from: h  reason: collision with root package name */
    private final x4.b0 f28497h;

    /* renamed from: h0  reason: collision with root package name */
    private float f28498h0;

    /* renamed from: i  reason: collision with root package name */
    private final a5.p f28499i;

    /* renamed from: i0  reason: collision with root package name */
    private boolean f28500i0;

    /* renamed from: j  reason: collision with root package name */
    private final i1.f f28501j;

    /* renamed from: j0  reason: collision with root package name */
    private n4.e f28502j0;

    /* renamed from: k  reason: collision with root package name */
    private final i1 f28503k;

    /* renamed from: k0  reason: collision with root package name */
    private boolean f28504k0;

    /* renamed from: l  reason: collision with root package name */
    private final a5.s<p2.d> f28505l;

    /* renamed from: l0  reason: collision with root package name */
    private boolean f28506l0;

    /* renamed from: m  reason: collision with root package name */
    private final CopyOnWriteArraySet<s.a> f28507m;

    /* renamed from: m0  reason: collision with root package name */
    private o f28508m0;

    /* renamed from: n  reason: collision with root package name */
    private final l3.b f28509n;

    /* renamed from: n0  reason: collision with root package name */
    private b5.a0 f28510n0;

    /* renamed from: o  reason: collision with root package name */
    private final List<e> f28511o;

    /* renamed from: o0  reason: collision with root package name */
    private z1 f28512o0;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f28513p;

    /* renamed from: p0  reason: collision with root package name */
    private m2 f28514p0;

    /* renamed from: q  reason: collision with root package name */
    private final t.a f28515q;

    /* renamed from: q0  reason: collision with root package name */
    private int f28516q0;

    /* renamed from: r  reason: collision with root package name */
    private final o3.a f28517r;

    /* renamed from: r0  reason: collision with root package name */
    private int f28518r0;

    /* renamed from: s  reason: collision with root package name */
    private final Looper f28519s;

    /* renamed from: s0  reason: collision with root package name */
    private long f28520s0;

    /* renamed from: t  reason: collision with root package name */
    private final z4.f f28521t;

    /* renamed from: u  reason: collision with root package name */
    private final long f28522u;

    /* renamed from: v  reason: collision with root package name */
    private final long f28523v;

    /* renamed from: w  reason: collision with root package name */
    private final a5.d f28524w;

    /* renamed from: x  reason: collision with root package name */
    private final c f28525x;

    /* renamed from: y  reason: collision with root package name */
    private final d f28526y;

    /* renamed from: z  reason: collision with root package name */
    private final n3.b f28527z;

    /* compiled from: ExoPlayerImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class b {
        public static o3.q1 a(Context context, x0 x0Var, boolean z10) {
            o3.o1 y02 = o3.o1.y0(context);
            if (y02 == null) {
                a5.t.i("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new o3.q1(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z10) {
                x0Var.f1(y02);
            }
            return new o3.q1(y02.F0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExoPlayerImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class c implements b5.y, p3.t, n4.n, y3.e, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, l.b, d.b, b.InterfaceC0321b, g3.b, s.a {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void S(p2.d dVar) {
            dVar.O(x0.this.P);
        }

        @Override // c5.l.b
        public void A(Surface surface) {
            x0.this.l2(surface);
        }

        @Override // n3.g3.b
        public void B(final int i10, final boolean z10) {
            x0.this.f28505l.k(30, new s.a() { // from class: n3.y0
                @Override // a5.s.a
                public final void invoke(Object obj) {
                    ((p2.d) obj).L(i10, z10);
                }
            });
        }

        @Override // n3.s.a
        public /* synthetic */ void C(boolean z10) {
            r.a(this, z10);
        }

        @Override // b5.y
        public /* synthetic */ void D(m1 m1Var) {
            b5.n.a(this, m1Var);
        }

        @Override // p3.t
        public /* synthetic */ void E(m1 m1Var) {
            p3.i.a(this, m1Var);
        }

        @Override // n3.s.a
        public void F(boolean z10) {
            x0.this.t2();
        }

        @Override // n3.d.b
        public void G(float f10) {
            x0.this.e2();
        }

        @Override // n3.d.b
        public void H(int i10) {
            boolean A = x0.this.A();
            x0.this.q2(A, i10, x0.s1(A, i10));
        }

        @Override // p3.t
        public void a(final boolean z10) {
            if (x0.this.f28500i0 == z10) {
                return;
            }
            x0.this.f28500i0 = z10;
            x0.this.f28505l.k(23, new s.a() { // from class: n3.f1
                @Override // a5.s.a
                public final void invoke(Object obj) {
                    ((p2.d) obj).a(z10);
                }
            });
        }

        @Override // p3.t
        public void b(Exception exc) {
            x0.this.f28517r.b(exc);
        }

        @Override // b5.y
        public void c(String str) {
            x0.this.f28517r.c(str);
        }

        @Override // b5.y
        public void d(String str, long j10, long j11) {
            x0.this.f28517r.d(str, j10, j11);
        }

        @Override // p3.t
        public void e(String str) {
            x0.this.f28517r.e(str);
        }

        @Override // p3.t
        public void f(String str, long j10, long j11) {
            x0.this.f28517r.f(str, j10, j11);
        }

        @Override // y3.e
        public void g(final Metadata metadata) {
            x0 x0Var = x0.this;
            x0Var.f28512o0 = x0Var.f28512o0.b().I(metadata).F();
            z1 i12 = x0.this.i1();
            if (!i12.equals(x0.this.P)) {
                x0.this.P = i12;
                x0.this.f28505l.i(14, new s.a() { // from class: n3.d1
                    @Override // a5.s.a
                    public final void invoke(Object obj) {
                        x0.c.this.S((p2.d) obj);
                    }
                });
            }
            x0.this.f28505l.i(28, new s.a() { // from class: n3.a1
                @Override // a5.s.a
                public final void invoke(Object obj) {
                    ((p2.d) obj).g(Metadata.this);
                }
            });
            x0.this.f28505l.f();
        }

        @Override // n4.n
        public void h(final List<n4.b> list) {
            x0.this.f28505l.k(27, new s.a() { // from class: n3.b1
                @Override // a5.s.a
                public final void invoke(Object obj) {
                    ((p2.d) obj).h(list);
                }
            });
        }

        @Override // p3.t
        public void i(long j10) {
            x0.this.f28517r.i(j10);
        }

        @Override // b5.y
        public void j(q3.e eVar) {
            x0.this.f28490d0 = eVar;
            x0.this.f28517r.j(eVar);
        }

        @Override // b5.y
        public void k(Exception exc) {
            x0.this.f28517r.k(exc);
        }

        @Override // b5.y
        public void l(m1 m1Var, q3.i iVar) {
            x0.this.R = m1Var;
            x0.this.f28517r.l(m1Var, iVar);
        }

        @Override // p3.t
        public void m(q3.e eVar) {
            x0.this.f28492e0 = eVar;
            x0.this.f28517r.m(eVar);
        }

        @Override // n4.n
        public void n(final n4.e eVar) {
            x0.this.f28502j0 = eVar;
            x0.this.f28505l.k(27, new s.a() { // from class: n3.e1
                @Override // a5.s.a
                public final void invoke(Object obj) {
                    ((p2.d) obj).n(n4.e.this);
                }
            });
        }

        @Override // b5.y
        public void o(q3.e eVar) {
            x0.this.f28517r.o(eVar);
            x0.this.R = null;
            x0.this.f28490d0 = null;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            x0.this.k2(surfaceTexture);
            x0.this.X1(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            x0.this.l2(null);
            x0.this.X1(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            x0.this.X1(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // p3.t
        public void p(q3.e eVar) {
            x0.this.f28517r.p(eVar);
            x0.this.S = null;
            x0.this.f28492e0 = null;
        }

        @Override // b5.y
        public void q(int i10, long j10) {
            x0.this.f28517r.q(i10, j10);
        }

        @Override // b5.y
        public void r(Object obj, long j10) {
            x0.this.f28517r.r(obj, j10);
            if (x0.this.U == obj) {
                x0.this.f28505l.k(26, new s.a() { // from class: n3.g1
                    @Override // a5.s.a
                    public final void invoke(Object obj2) {
                        ((p2.d) obj2).Q();
                    }
                });
            }
        }

        @Override // p3.t
        public void s(m1 m1Var, q3.i iVar) {
            x0.this.S = m1Var;
            x0.this.f28517r.s(m1Var, iVar);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            x0.this.X1(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (x0.this.Y) {
                x0.this.l2(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (x0.this.Y) {
                x0.this.l2(null);
            }
            x0.this.X1(0, 0);
        }

        @Override // n3.g3.b
        public void t(int i10) {
            final o k12 = x0.k1(x0.this.B);
            if (k12.equals(x0.this.f28508m0)) {
                return;
            }
            x0.this.f28508m0 = k12;
            x0.this.f28505l.k(29, new s.a() { // from class: n3.c1
                @Override // a5.s.a
                public final void invoke(Object obj) {
                    ((p2.d) obj).D(o.this);
                }
            });
        }

        @Override // b5.y
        public void u(final b5.a0 a0Var) {
            x0.this.f28510n0 = a0Var;
            x0.this.f28505l.k(25, new s.a() { // from class: n3.z0
                @Override // a5.s.a
                public final void invoke(Object obj) {
                    ((p2.d) obj).u(b5.a0.this);
                }
            });
        }

        @Override // p3.t
        public void v(Exception exc) {
            x0.this.f28517r.v(exc);
        }

        @Override // n3.b.InterfaceC0321b
        public void w() {
            x0.this.q2(false, -1, 3);
        }

        @Override // p3.t
        public void x(int i10, long j10, long j11) {
            x0.this.f28517r.x(i10, j10, j11);
        }

        @Override // b5.y
        public void y(long j10, int i10) {
            x0.this.f28517r.y(j10, i10);
        }

        @Override // c5.l.b
        public void z(Surface surface) {
            x0.this.l2(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExoPlayerImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d implements b5.k, c5.a, t2.b {

        /* renamed from: a  reason: collision with root package name */
        private b5.k f28529a;

        /* renamed from: b  reason: collision with root package name */
        private c5.a f28530b;

        /* renamed from: c  reason: collision with root package name */
        private b5.k f28531c;

        /* renamed from: d  reason: collision with root package name */
        private c5.a f28532d;

        private d() {
        }

        @Override // b5.k
        public void a(long j10, long j11, m1 m1Var, MediaFormat mediaFormat) {
            b5.k kVar = this.f28531c;
            if (kVar != null) {
                kVar.a(j10, j11, m1Var, mediaFormat);
            }
            b5.k kVar2 = this.f28529a;
            if (kVar2 != null) {
                kVar2.a(j10, j11, m1Var, mediaFormat);
            }
        }

        @Override // c5.a
        public void b(long j10, float[] fArr) {
            c5.a aVar = this.f28532d;
            if (aVar != null) {
                aVar.b(j10, fArr);
            }
            c5.a aVar2 = this.f28530b;
            if (aVar2 != null) {
                aVar2.b(j10, fArr);
            }
        }

        @Override // c5.a
        public void d() {
            c5.a aVar = this.f28532d;
            if (aVar != null) {
                aVar.d();
            }
            c5.a aVar2 = this.f28530b;
            if (aVar2 != null) {
                aVar2.d();
            }
        }

        @Override // n3.t2.b
        public void j(int i10, Object obj) {
            if (i10 == 7) {
                this.f28529a = (b5.k) obj;
            } else if (i10 == 8) {
                this.f28530b = (c5.a) obj;
            } else if (i10 != 10000) {
            } else {
                c5.l lVar = (c5.l) obj;
                if (lVar == null) {
                    this.f28531c = null;
                    this.f28532d = null;
                    return;
                }
                this.f28531c = lVar.getVideoFrameMetadataListener();
                this.f28532d = lVar.getCameraMotionListener();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExoPlayerImpl.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class e implements e2 {

        /* renamed from: a  reason: collision with root package name */
        private final Object f28533a;

        /* renamed from: b  reason: collision with root package name */
        private l3 f28534b;

        public e(Object obj, l3 l3Var) {
            this.f28533a = obj;
            this.f28534b = l3Var;
        }

        @Override // n3.e2
        public Object a() {
            return this.f28533a;
        }

        @Override // n3.e2
        public l3 b() {
            return this.f28534b;
        }
    }

    static {
        j1.a("goog.exo.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public x0(s.b bVar, p2 p2Var) {
        x0 x0Var;
        o3.q1 a10;
        a5.g gVar = new a5.g();
        this.f28489d = gVar;
        try {
            a5.t.f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.2] [" + a5.p0.f486e + b9.i.f16698e);
            Context applicationContext = bVar.f28319a.getApplicationContext();
            this.f28491e = applicationContext;
            o3.a apply = bVar.f28327i.apply(bVar.f28320b);
            this.f28517r = apply;
            this.f28496g0 = bVar.f28329k;
            this.f28484a0 = bVar.f28334p;
            this.f28486b0 = bVar.f28335q;
            this.f28500i0 = bVar.f28333o;
            this.E = bVar.f28342x;
            c cVar = new c();
            this.f28525x = cVar;
            d dVar = new d();
            this.f28526y = dVar;
            Handler handler = new Handler(bVar.f28328j);
            y2[] a11 = bVar.f28322d.get().a(handler, cVar, cVar, cVar, cVar);
            this.f28495g = a11;
            a5.a.f(a11.length > 0);
            x4.b0 b0Var = bVar.f28324f.get();
            this.f28497h = b0Var;
            this.f28515q = bVar.f28323e.get();
            z4.f fVar = bVar.f28326h.get();
            this.f28521t = fVar;
            this.f28513p = bVar.f28336r;
            this.L = bVar.f28337s;
            this.f28522u = bVar.f28338t;
            this.f28523v = bVar.f28339u;
            this.N = bVar.f28343y;
            Looper looper = bVar.f28328j;
            this.f28519s = looper;
            a5.d dVar2 = bVar.f28320b;
            this.f28524w = dVar2;
            p2 p2Var2 = p2Var == null ? this : p2Var;
            this.f28493f = p2Var2;
            this.f28505l = new a5.s<>(looper, dVar2, new s.b() { // from class: n3.l0
                @Override // a5.s.b
                public final void a(Object obj, a5.m mVar) {
                    x0.this.B1((p2.d) obj, mVar);
                }
            });
            this.f28507m = new CopyOnWriteArraySet<>();
            this.f28511o = new ArrayList();
            this.M = new g0.a(0);
            x4.c0 c0Var = new x4.c0(new b3[a11.length], new x4.s[a11.length], q3.f28304b, null);
            this.f28485b = c0Var;
            this.f28509n = new l3.b();
            p2.b e8 = new p2.b.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28).d(29, b0Var.d()).e();
            this.f28487c = e8;
            this.O = new p2.b.a().b(e8).a(4).a(10).e();
            this.f28499i = dVar2.d(looper, null);
            i1.f fVar2 = new i1.f() { // from class: n3.o0
                @Override // n3.i1.f
                public final void a(i1.e eVar) {
                    x0.this.D1(eVar);
                }
            };
            this.f28501j = fVar2;
            this.f28514p0 = m2.j(c0Var);
            apply.h0(p2Var2, looper);
            int i10 = a5.p0.f482a;
            if (i10 < 31) {
                a10 = new o3.q1();
            } else {
                a10 = b.a(applicationContext, this, bVar.f28344z);
            }
            try {
                i1 i1Var = new i1(a11, b0Var, c0Var, bVar.f28325g.get(), fVar, this.F, this.G, apply, this.L, bVar.f28340v, bVar.f28341w, this.N, looper, dVar2, fVar2, a10);
                x0Var = this;
                try {
                    x0Var.f28503k = i1Var;
                    x0Var.f28498h0 = 1.0f;
                    x0Var.F = 0;
                    z1 z1Var = z1.G;
                    x0Var.P = z1Var;
                    x0Var.Q = z1Var;
                    x0Var.f28512o0 = z1Var;
                    x0Var.f28516q0 = -1;
                    if (i10 < 21) {
                        x0Var.f28494f0 = x0Var.y1(0);
                    } else {
                        x0Var.f28494f0 = a5.p0.E(applicationContext);
                    }
                    x0Var.f28502j0 = n4.e.f28632c;
                    x0Var.f28504k0 = true;
                    x0Var.x(apply);
                    fVar.b(new Handler(looper), apply);
                    x0Var.g1(cVar);
                    long j10 = bVar.f28321c;
                    if (j10 > 0) {
                        i1Var.s(j10);
                    }
                    n3.b bVar2 = new n3.b(bVar.f28319a, handler, cVar);
                    x0Var.f28527z = bVar2;
                    bVar2.b(bVar.f28332n);
                    n3.d dVar3 = new n3.d(bVar.f28319a, handler, cVar);
                    x0Var.A = dVar3;
                    dVar3.l(bVar.f28330l ? x0Var.f28496g0 : null);
                    g3 g3Var = new g3(bVar.f28319a, handler, cVar);
                    x0Var.B = g3Var;
                    g3Var.g(a5.p0.e0(x0Var.f28496g0.f29653c));
                    r3 r3Var = new r3(bVar.f28319a);
                    x0Var.C = r3Var;
                    r3Var.a(bVar.f28331m != 0);
                    s3 s3Var = new s3(bVar.f28319a);
                    x0Var.D = s3Var;
                    s3Var.a(bVar.f28331m == 2);
                    x0Var.f28508m0 = k1(g3Var);
                    x0Var.f28510n0 = b5.a0.f5095e;
                    x0Var.f28488c0 = a5.f0.f423c;
                    b0Var.g(x0Var.f28496g0);
                    x0Var.d2(1, 10, Integer.valueOf(x0Var.f28494f0));
                    x0Var.d2(2, 10, Integer.valueOf(x0Var.f28494f0));
                    x0Var.d2(1, 3, x0Var.f28496g0);
                    x0Var.d2(2, 4, Integer.valueOf(x0Var.f28484a0));
                    x0Var.d2(2, 5, Integer.valueOf(x0Var.f28486b0));
                    x0Var.d2(1, 9, Boolean.valueOf(x0Var.f28500i0));
                    x0Var.d2(2, 7, dVar);
                    x0Var.d2(6, 8, dVar);
                    gVar.e();
                } catch (Throwable th) {
                    th = th;
                    x0Var.f28489d.e();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                x0Var = this;
            }
        } catch (Throwable th3) {
            th = th3;
            x0Var = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B1(p2.d dVar, a5.m mVar) {
        dVar.R(this.f28493f, new p2.c(mVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D1(final i1.e eVar) {
        this.f28499i.f(new Runnable() { // from class: n3.n0
            @Override // java.lang.Runnable
            public final void run() {
                x0.this.C1(eVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G1(p2.d dVar) {
        dVar.W(this.O);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H1(m2 m2Var, int i10, p2.d dVar) {
        dVar.N(m2Var.f28227a, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void I1(int i10, p2.e eVar, p2.e eVar2, p2.d dVar) {
        dVar.Y(i10);
        dVar.V(eVar, eVar2, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K1(m2 m2Var, p2.d dVar) {
        dVar.k0(m2Var.f28232f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L1(m2 m2Var, p2.d dVar) {
        dVar.P(m2Var.f28232f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void M1(m2 m2Var, p2.d dVar) {
        dVar.m0(m2Var.f28235i.f32592d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void O1(m2 m2Var, p2.d dVar) {
        dVar.B(m2Var.f28233g);
        dVar.a0(m2Var.f28233g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void P1(m2 m2Var, p2.d dVar) {
        dVar.d0(m2Var.f28238l, m2Var.f28231e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Q1(m2 m2Var, p2.d dVar) {
        dVar.F(m2Var.f28231e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void R1(m2 m2Var, int i10, p2.d dVar) {
        dVar.g0(m2Var.f28238l, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void S1(m2 m2Var, p2.d dVar) {
        dVar.z(m2Var.f28239m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void T1(m2 m2Var, p2.d dVar) {
        dVar.n0(z1(m2Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void U1(m2 m2Var, p2.d dVar) {
        dVar.w(m2Var.f28240n);
    }

    private m2 V1(m2 m2Var, l3 l3Var, Pair<Object, Long> pair) {
        int i10;
        long j10;
        a5.a.a(l3Var.u() || pair != null);
        l3 l3Var2 = m2Var.f28227a;
        m2 i11 = m2Var.i(l3Var);
        if (l3Var.u()) {
            t.b k10 = m2.k();
            long C0 = a5.p0.C0(this.f28520s0);
            m2 b10 = i11.c(k10, C0, C0, C0, 0L, e4.m0.f25104d, this.f28485b, y5.q.p()).b(k10);
            b10.f28242p = b10.f28244r;
            return b10;
        }
        Object obj = i11.f28228b.f25139a;
        boolean z10 = !obj.equals(((Pair) a5.p0.j(pair)).first);
        t.b bVar = z10 ? new t.b(pair.first) : i11.f28228b;
        long longValue = ((Long) pair.second).longValue();
        long C02 = a5.p0.C0(K());
        if (!l3Var2.u()) {
            C02 -= l3Var2.l(obj, this.f28509n).q();
        }
        if (z10 || longValue < C02) {
            a5.a.f(!bVar.b());
            m2 b11 = i11.c(bVar, longValue, longValue, longValue, 0L, z10 ? e4.m0.f25104d : i11.f28234h, z10 ? this.f28485b : i11.f28235i, z10 ? y5.q.p() : i11.f28236j).b(bVar);
            b11.f28242p = longValue;
            return b11;
        }
        if (i10 == 0) {
            int f10 = l3Var.f(i11.f28237k.f25139a);
            if (f10 == -1 || l3Var.j(f10, this.f28509n).f28133c != l3Var.l(bVar.f25139a, this.f28509n).f28133c) {
                l3Var.l(bVar.f25139a, this.f28509n);
                if (bVar.b()) {
                    j10 = this.f28509n.e(bVar.f25140b, bVar.f25141c);
                } else {
                    j10 = this.f28509n.f28134d;
                }
                i11 = i11.c(bVar, i11.f28244r, i11.f28244r, i11.f28230d, j10 - i11.f28244r, i11.f28234h, i11.f28235i, i11.f28236j).b(bVar);
                i11.f28242p = j10;
            }
        } else {
            a5.a.f(!bVar.b());
            long max = Math.max(0L, i11.f28243q - (longValue - C02));
            long j11 = i11.f28242p;
            if (i11.f28237k.equals(i11.f28228b)) {
                j11 = longValue + max;
            }
            i11 = i11.c(bVar, longValue, longValue, longValue, max, i11.f28234h, i11.f28235i, i11.f28236j);
            i11.f28242p = j11;
        }
        return i11;
    }

    private Pair<Object, Long> W1(l3 l3Var, int i10, long j10) {
        if (l3Var.u()) {
            this.f28516q0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f28520s0 = j10;
            this.f28518r0 = 0;
            return null;
        }
        if (i10 == -1 || i10 >= l3Var.t()) {
            i10 = l3Var.e(this.G);
            j10 = l3Var.r(i10, this.f27938a).d();
        }
        return l3Var.n(this.f27938a, this.f28509n, i10, a5.p0.C0(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X1(final int i10, final int i11) {
        if (i10 == this.f28488c0.b() && i11 == this.f28488c0.a()) {
            return;
        }
        this.f28488c0 = new a5.f0(i10, i11);
        this.f28505l.k(24, new s.a() { // from class: n3.m0
            @Override // a5.s.a
            public final void invoke(Object obj) {
                ((p2.d) obj).U(i10, i11);
            }
        });
    }

    private long Y1(l3 l3Var, t.b bVar, long j10) {
        l3Var.l(bVar.f25139a, this.f28509n);
        return j10 + this.f28509n.q();
    }

    private m2 Z1(int i10, int i11) {
        boolean z10 = false;
        a5.a.a(i10 >= 0 && i11 >= i10 && i11 <= this.f28511o.size());
        int N = N();
        l3 t10 = t();
        int size = this.f28511o.size();
        this.H++;
        a2(i10, i11);
        l3 l12 = l1();
        m2 V1 = V1(this.f28514p0, l12, r1(t10, l12));
        int i12 = V1.f28231e;
        if (i12 != 1 && i12 != 4 && i10 < i11 && i11 == size && N >= V1.f28227a.t()) {
            z10 = true;
        }
        if (z10) {
            V1 = V1.g(4);
        }
        this.f28503k.k0(i10, i11, this.M);
        return V1;
    }

    private void a2(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f28511o.remove(i12);
        }
        this.M = this.M.b(i10, i11);
    }

    private void b2() {
        if (this.X != null) {
            m1(this.f28526y).n(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS).m(null).l();
            this.X.i(this.f28525x);
            this.X = null;
        }
        TextureView textureView = this.Z;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f28525x) {
                a5.t.i("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.Z.setSurfaceTextureListener(null);
            }
            this.Z = null;
        }
        SurfaceHolder surfaceHolder = this.W;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f28525x);
            this.W = null;
        }
    }

    private void c2(int i10, long j10, boolean z10) {
        this.f28517r.J();
        l3 l3Var = this.f28514p0.f28227a;
        if (i10 >= 0 && (l3Var.u() || i10 < l3Var.t())) {
            this.H++;
            if (f()) {
                a5.t.i("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                i1.e eVar = new i1.e(this.f28514p0);
                eVar.b(1);
                this.f28501j.a(eVar);
                return;
            }
            int i11 = M() != 1 ? 2 : 1;
            int N = N();
            m2 V1 = V1(this.f28514p0.g(i11), l3Var, W1(l3Var, i10, j10));
            this.f28503k.x0(l3Var, i10, a5.p0.C0(j10));
            r2(V1, 0, 1, true, true, 1, p1(V1), N, z10);
            return;
        }
        throw new q1(l3Var, i10, j10);
    }

    private void d2(int i10, int i11, Object obj) {
        y2[] y2VarArr;
        for (y2 y2Var : this.f28495g) {
            if (y2Var.f() == i10) {
                m1(y2Var).n(i11).m(obj).l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e2() {
        d2(1, 2, Float.valueOf(this.f28498h0 * this.A.g()));
    }

    private List<g2.c> h1(int i10, List<e4.t> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            g2.c cVar = new g2.c(list.get(i11), this.f28513p);
            arrayList.add(cVar);
            this.f28511o.add(i11 + i10, new e(cVar.f27984b, cVar.f27983a.Y()));
        }
        this.M = this.M.h(i10, arrayList.size());
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public z1 i1() {
        l3 t10 = t();
        if (t10.u()) {
            return this.f28512o0;
        }
        return this.f28512o0.b().H(t10.r(N(), this.f27938a).f28148c.f28376e).F();
    }

    private void i2(List<e4.t> list, int i10, long j10, boolean z10) {
        int i11;
        long j11;
        int q12 = q1();
        long currentPosition = getCurrentPosition();
        boolean z11 = true;
        this.H++;
        if (!this.f28511o.isEmpty()) {
            a2(0, this.f28511o.size());
        }
        List<g2.c> h12 = h1(0, list);
        l3 l12 = l1();
        if (!l12.u() && i10 >= l12.t()) {
            throw new q1(l12, i10, j10);
        }
        if (z10) {
            j11 = -9223372036854775807L;
            i11 = l12.e(this.G);
        } else if (i10 == -1) {
            i11 = q12;
            j11 = currentPosition;
        } else {
            i11 = i10;
            j11 = j10;
        }
        m2 V1 = V1(this.f28514p0, l12, W1(l12, i11, j11));
        int i12 = V1.f28231e;
        if (i11 != -1 && i12 != 1) {
            i12 = (l12.u() || i11 >= l12.t()) ? 4 : 2;
        }
        m2 g10 = V1.g(i12);
        this.f28503k.J0(h12, i11, a5.p0.C0(j11), this.M);
        if (this.f28514p0.f28228b.f25139a.equals(g10.f28228b.f25139a) || this.f28514p0.f28227a.u()) {
            z11 = false;
        }
        r2(g10, 0, 1, false, z11, 4, p1(g10), -1, false);
    }

    private void j2(SurfaceHolder surfaceHolder) {
        this.Y = false;
        this.W = surfaceHolder;
        surfaceHolder.addCallback(this.f28525x);
        Surface surface = this.W.getSurface();
        if (surface != null && surface.isValid()) {
            Rect surfaceFrame = this.W.getSurfaceFrame();
            X1(surfaceFrame.width(), surfaceFrame.height());
            return;
        }
        X1(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static o k1(g3 g3Var) {
        return new o(0, g3Var.d(), g3Var.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k2(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        l2(surface);
        this.V = surface;
    }

    private l3 l1() {
        return new u2(this.f28511o, this.M);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l2(Object obj) {
        boolean z10;
        ArrayList<t2> arrayList = new ArrayList();
        y2[] y2VarArr = this.f28495g;
        int length = y2VarArr.length;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= length) {
                break;
            }
            y2 y2Var = y2VarArr[i10];
            if (y2Var.f() == 2) {
                arrayList.add(m1(y2Var).n(1).m(obj).l());
            }
            i10++;
        }
        Object obj2 = this.U;
        if (obj2 == null || obj2 == obj) {
            z10 = false;
        } else {
            try {
                for (t2 t2Var : arrayList) {
                    t2Var.a(this.E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z10 = false;
            Object obj3 = this.U;
            Surface surface = this.V;
            if (obj3 == surface) {
                surface.release();
                this.V = null;
            }
        }
        this.U = obj;
        if (z10) {
            o2(false, q.j(new k1(3), 1003));
        }
    }

    private t2 m1(t2.b bVar) {
        int q12 = q1();
        i1 i1Var = this.f28503k;
        l3 l3Var = this.f28514p0.f28227a;
        if (q12 == -1) {
            q12 = 0;
        }
        return new t2(i1Var, bVar, l3Var, q12, this.f28524w, i1Var.A());
    }

    private Pair<Boolean, Integer> n1(m2 m2Var, m2 m2Var2, boolean z10, int i10, boolean z11, boolean z12) {
        l3 l3Var = m2Var2.f28227a;
        l3 l3Var2 = m2Var.f28227a;
        if (l3Var2.u() && l3Var.u()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (l3Var2.u() != l3Var.u()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (!l3Var.r(l3Var.l(m2Var2.f28228b.f25139a, this.f28509n).f28133c, this.f27938a).f28146a.equals(l3Var2.r(l3Var2.l(m2Var.f28228b.f25139a, this.f28509n).f28133c, this.f27938a).f28146a)) {
            if (z10 && i10 == 0) {
                i11 = 1;
            } else if (z10 && i10 == 1) {
                i11 = 2;
            } else if (!z11) {
                throw new IllegalStateException();
            }
            return new Pair<>(Boolean.TRUE, Integer.valueOf(i11));
        } else if (z10 && i10 == 0 && m2Var2.f28228b.f25142d < m2Var.f28228b.f25142d) {
            return new Pair<>(Boolean.TRUE, 0);
        } else {
            if (z10 && i10 == 1 && z12) {
                return new Pair<>(Boolean.TRUE, 2);
            }
            return new Pair<>(Boolean.FALSE, -1);
        }
    }

    private void o2(boolean z10, q qVar) {
        m2 b10;
        if (z10) {
            b10 = Z1(0, this.f28511o.size()).e(null);
        } else {
            m2 m2Var = this.f28514p0;
            b10 = m2Var.b(m2Var.f28228b);
            b10.f28242p = b10.f28244r;
            b10.f28243q = 0L;
        }
        m2 g10 = b10.g(1);
        if (qVar != null) {
            g10 = g10.e(qVar);
        }
        m2 m2Var2 = g10;
        this.H++;
        this.f28503k.c1();
        r2(m2Var2, 0, 1, false, m2Var2.f28227a.u() && !this.f28514p0.f28227a.u(), 4, p1(m2Var2), -1, false);
    }

    private long p1(m2 m2Var) {
        if (m2Var.f28227a.u()) {
            return a5.p0.C0(this.f28520s0);
        }
        if (m2Var.f28228b.b()) {
            return m2Var.f28244r;
        }
        return Y1(m2Var.f28227a, m2Var.f28228b, m2Var.f28244r);
    }

    private void p2() {
        p2.b bVar = this.O;
        p2.b G = a5.p0.G(this.f28493f, this.f28487c);
        this.O = G;
        if (G.equals(bVar)) {
            return;
        }
        this.f28505l.i(13, new s.a() { // from class: n3.q0
            @Override // a5.s.a
            public final void invoke(Object obj) {
                x0.this.G1((p2.d) obj);
            }
        });
    }

    private int q1() {
        if (this.f28514p0.f28227a.u()) {
            return this.f28516q0;
        }
        m2 m2Var = this.f28514p0;
        return m2Var.f28227a.l(m2Var.f28228b.f25139a, this.f28509n).f28133c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q2(boolean z10, int i10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        m2 m2Var = this.f28514p0;
        if (m2Var.f28238l == z11 && m2Var.f28239m == i12) {
            return;
        }
        this.H++;
        m2 d10 = m2Var.d(z11, i12);
        this.f28503k.M0(z11, i12);
        r2(d10, 0, i11, false, false, 5, -9223372036854775807L, -1, false);
    }

    private Pair<Object, Long> r1(l3 l3Var, l3 l3Var2) {
        long K = K();
        if (!l3Var.u() && !l3Var2.u()) {
            Pair<Object, Long> n10 = l3Var.n(this.f27938a, this.f28509n, N(), a5.p0.C0(K));
            Object obj = ((Pair) a5.p0.j(n10)).first;
            if (l3Var2.f(obj) != -1) {
                return n10;
            }
            Object v02 = i1.v0(this.f27938a, this.f28509n, this.F, this.G, obj, l3Var, l3Var2);
            if (v02 != null) {
                l3Var2.l(v02, this.f28509n);
                int i10 = this.f28509n.f28133c;
                return W1(l3Var2, i10, l3Var2.r(i10, this.f27938a).d());
            }
            return W1(l3Var2, -1, -9223372036854775807L);
        }
        boolean z10 = !l3Var.u() && l3Var2.u();
        int q12 = z10 ? -1 : q1();
        if (z10) {
            K = -9223372036854775807L;
        }
        return W1(l3Var2, q12, K);
    }

    private void r2(final m2 m2Var, final int i10, final int i11, boolean z10, boolean z11, final int i12, long j10, int i13, boolean z12) {
        m2 m2Var2 = this.f28514p0;
        this.f28514p0 = m2Var;
        boolean z13 = !m2Var2.f28227a.equals(m2Var.f28227a);
        Pair<Boolean, Integer> n12 = n1(m2Var, m2Var2, z11, i12, z13, z12);
        boolean booleanValue = ((Boolean) n12.first).booleanValue();
        final int intValue = ((Integer) n12.second).intValue();
        z1 z1Var = this.P;
        if (booleanValue) {
            r3 = m2Var.f28227a.u() ? null : m2Var.f28227a.r(m2Var.f28227a.l(m2Var.f28228b.f25139a, this.f28509n).f28133c, this.f27938a).f28148c;
            this.f28512o0 = z1.G;
        }
        if (booleanValue || !m2Var2.f28236j.equals(m2Var.f28236j)) {
            this.f28512o0 = this.f28512o0.b().J(m2Var.f28236j).F();
            z1Var = i1();
        }
        boolean z14 = !z1Var.equals(this.P);
        this.P = z1Var;
        boolean z15 = m2Var2.f28238l != m2Var.f28238l;
        boolean z16 = m2Var2.f28231e != m2Var.f28231e;
        if (z16 || z15) {
            t2();
        }
        boolean z17 = m2Var2.f28233g;
        boolean z18 = m2Var.f28233g;
        boolean z19 = z17 != z18;
        if (z19) {
            s2(z18);
        }
        if (z13) {
            this.f28505l.i(0, new s.a() { // from class: n3.h0
                @Override // a5.s.a
                public final void invoke(Object obj) {
                    x0.H1(m2.this, i10, (p2.d) obj);
                }
            });
        }
        if (z11) {
            final p2.e v12 = v1(i12, m2Var2, i13);
            final p2.e u12 = u1(j10);
            this.f28505l.i(11, new s.a() { // from class: n3.p0
                @Override // a5.s.a
                public final void invoke(Object obj) {
                    x0.I1(i12, v12, u12, (p2.d) obj);
                }
            });
        }
        if (booleanValue) {
            this.f28505l.i(1, new s.a() { // from class: n3.r0
                @Override // a5.s.a
                public final void invoke(Object obj) {
                    ((p2.d) obj).T(u1.this, intValue);
                }
            });
        }
        if (m2Var2.f28232f != m2Var.f28232f) {
            this.f28505l.i(10, new s.a() { // from class: n3.t0
                @Override // a5.s.a
                public final void invoke(Object obj) {
                    x0.K1(m2.this, (p2.d) obj);
                }
            });
            if (m2Var.f28232f != null) {
                this.f28505l.i(10, new s.a() { // from class: n3.e0
                    @Override // a5.s.a
                    public final void invoke(Object obj) {
                        x0.L1(m2.this, (p2.d) obj);
                    }
                });
            }
        }
        x4.c0 c0Var = m2Var2.f28235i;
        x4.c0 c0Var2 = m2Var.f28235i;
        if (c0Var != c0Var2) {
            this.f28497h.e(c0Var2.f32593e);
            this.f28505l.i(2, new s.a() { // from class: n3.v0
                @Override // a5.s.a
                public final void invoke(Object obj) {
                    x0.M1(m2.this, (p2.d) obj);
                }
            });
        }
        if (z14) {
            final z1 z1Var2 = this.P;
            this.f28505l.i(14, new s.a() { // from class: n3.s0
                @Override // a5.s.a
                public final void invoke(Object obj) {
                    ((p2.d) obj).O(z1.this);
                }
            });
        }
        if (z19) {
            this.f28505l.i(3, new s.a() { // from class: n3.g0
                @Override // a5.s.a
                public final void invoke(Object obj) {
                    x0.O1(m2.this, (p2.d) obj);
                }
            });
        }
        if (z16 || z15) {
            this.f28505l.i(-1, new s.a() { // from class: n3.f0
                @Override // a5.s.a
                public final void invoke(Object obj) {
                    x0.P1(m2.this, (p2.d) obj);
                }
            });
        }
        if (z16) {
            this.f28505l.i(4, new s.a() { // from class: n3.u0
                @Override // a5.s.a
                public final void invoke(Object obj) {
                    x0.Q1(m2.this, (p2.d) obj);
                }
            });
        }
        if (z15) {
            this.f28505l.i(5, new s.a() { // from class: n3.i0
                @Override // a5.s.a
                public final void invoke(Object obj) {
                    x0.R1(m2.this, i11, (p2.d) obj);
                }
            });
        }
        if (m2Var2.f28239m != m2Var.f28239m) {
            this.f28505l.i(6, new s.a() { // from class: n3.w0
                @Override // a5.s.a
                public final void invoke(Object obj) {
                    x0.S1(m2.this, (p2.d) obj);
                }
            });
        }
        if (z1(m2Var2) != z1(m2Var)) {
            this.f28505l.i(7, new s.a() { // from class: n3.d0
                @Override // a5.s.a
                public final void invoke(Object obj) {
                    x0.T1(m2.this, (p2.d) obj);
                }
            });
        }
        if (!m2Var2.f28240n.equals(m2Var.f28240n)) {
            this.f28505l.i(12, new s.a() { // from class: n3.c0
                @Override // a5.s.a
                public final void invoke(Object obj) {
                    x0.U1(m2.this, (p2.d) obj);
                }
            });
        }
        if (z10) {
            this.f28505l.i(-1, new s.a() { // from class: n3.k0
                @Override // a5.s.a
                public final void invoke(Object obj) {
                    ((p2.d) obj).b0();
                }
            });
        }
        p2();
        this.f28505l.f();
        if (m2Var2.f28241o != m2Var.f28241o) {
            Iterator<s.a> it = this.f28507m.iterator();
            while (it.hasNext()) {
                it.next().F(m2Var.f28241o);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int s1(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    private void s2(boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t2() {
        int M = M();
        boolean z10 = true;
        if (M != 1) {
            if (M == 2 || M == 3) {
                boolean o12 = o1();
                r3 r3Var = this.C;
                if (!A() || o12) {
                    z10 = false;
                }
                r3Var.b(z10);
                this.D.b(A());
                return;
            } else if (M != 4) {
                throw new IllegalStateException();
            }
        }
        this.C.b(false);
        this.D.b(false);
    }

    private p2.e u1(long j10) {
        int i10;
        u1 u1Var;
        Object obj;
        int N = N();
        Object obj2 = null;
        if (this.f28514p0.f28227a.u()) {
            i10 = -1;
            u1Var = null;
            obj = null;
        } else {
            m2 m2Var = this.f28514p0;
            Object obj3 = m2Var.f28228b.f25139a;
            m2Var.f28227a.l(obj3, this.f28509n);
            i10 = this.f28514p0.f28227a.f(obj3);
            obj = obj3;
            obj2 = this.f28514p0.f28227a.r(N, this.f27938a).f28146a;
            u1Var = this.f27938a.f28148c;
        }
        long Z0 = a5.p0.Z0(j10);
        long Z02 = this.f28514p0.f28228b.b() ? a5.p0.Z0(w1(this.f28514p0)) : Z0;
        t.b bVar = this.f28514p0.f28228b;
        return new p2.e(obj2, N, u1Var, obj, i10, Z0, Z02, bVar.f25140b, bVar.f25141c);
    }

    private void u2() {
        this.f28489d.b();
        if (Thread.currentThread() != u().getThread()) {
            String B = a5.p0.B("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), u().getThread().getName());
            if (!this.f28504k0) {
                a5.t.j("ExoPlayerImpl", B, this.f28506l0 ? null : new IllegalStateException());
                this.f28506l0 = true;
                return;
            }
            throw new IllegalStateException(B);
        }
    }

    private p2.e v1(int i10, m2 m2Var, int i11) {
        int i12;
        int i13;
        Object obj;
        u1 u1Var;
        Object obj2;
        long j10;
        long w12;
        l3.b bVar = new l3.b();
        if (m2Var.f28227a.u()) {
            i12 = i11;
            i13 = -1;
            obj = null;
            u1Var = null;
            obj2 = null;
        } else {
            Object obj3 = m2Var.f28228b.f25139a;
            m2Var.f28227a.l(obj3, bVar);
            int i14 = bVar.f28133c;
            i12 = i14;
            obj2 = obj3;
            i13 = m2Var.f28227a.f(obj3);
            obj = m2Var.f28227a.r(i14, this.f27938a).f28146a;
            u1Var = this.f27938a.f28148c;
        }
        if (i10 == 0) {
            if (m2Var.f28228b.b()) {
                t.b bVar2 = m2Var.f28228b;
                j10 = bVar.e(bVar2.f25140b, bVar2.f25141c);
                w12 = w1(m2Var);
            } else {
                if (m2Var.f28228b.f25143e != -1) {
                    j10 = w1(this.f28514p0);
                } else {
                    j10 = bVar.f28135e + bVar.f28134d;
                }
                w12 = j10;
            }
        } else if (m2Var.f28228b.b()) {
            j10 = m2Var.f28244r;
            w12 = w1(m2Var);
        } else {
            j10 = bVar.f28135e + m2Var.f28244r;
            w12 = j10;
        }
        long Z0 = a5.p0.Z0(j10);
        long Z02 = a5.p0.Z0(w12);
        t.b bVar3 = m2Var.f28228b;
        return new p2.e(obj, i12, u1Var, obj2, i13, Z0, Z02, bVar3.f25140b, bVar3.f25141c);
    }

    private static long w1(m2 m2Var) {
        l3.d dVar = new l3.d();
        l3.b bVar = new l3.b();
        m2Var.f28227a.l(m2Var.f28228b.f25139a, bVar);
        if (m2Var.f28229c == -9223372036854775807L) {
            return m2Var.f28227a.r(bVar.f28133c, dVar).e();
        }
        return bVar.q() + m2Var.f28229c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x1 */
    public void C1(i1.e eVar) {
        long j10;
        boolean z10;
        long j11;
        int i10 = this.H - eVar.f28052c;
        this.H = i10;
        boolean z11 = true;
        if (eVar.f28053d) {
            this.I = eVar.f28054e;
            this.J = true;
        }
        if (eVar.f28055f) {
            this.K = eVar.f28056g;
        }
        if (i10 == 0) {
            l3 l3Var = eVar.f28051b.f28227a;
            if (!this.f28514p0.f28227a.u() && l3Var.u()) {
                this.f28516q0 = -1;
                this.f28520s0 = 0L;
                this.f28518r0 = 0;
            }
            if (!l3Var.u()) {
                List<l3> J = ((u2) l3Var).J();
                a5.a.f(J.size() == this.f28511o.size());
                for (int i11 = 0; i11 < J.size(); i11++) {
                    this.f28511o.get(i11).f28534b = J.get(i11);
                }
            }
            if (this.J) {
                if (eVar.f28051b.f28228b.equals(this.f28514p0.f28228b) && eVar.f28051b.f28230d == this.f28514p0.f28244r) {
                    z11 = false;
                }
                if (z11) {
                    if (!l3Var.u() && !eVar.f28051b.f28228b.b()) {
                        m2 m2Var = eVar.f28051b;
                        j11 = Y1(l3Var, m2Var.f28228b, m2Var.f28230d);
                    } else {
                        j11 = eVar.f28051b.f28230d;
                    }
                    j10 = j11;
                } else {
                    j10 = -9223372036854775807L;
                }
                z10 = z11;
            } else {
                j10 = -9223372036854775807L;
                z10 = false;
            }
            this.J = false;
            r2(eVar.f28051b, 1, this.K, false, z10, this.I, j10, -1, false);
        }
    }

    private int y1(int i10) {
        AudioTrack audioTrack = this.T;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i10) {
            this.T.release();
            this.T = null;
        }
        if (this.T == null) {
            this.T = new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
        }
        return this.T.getAudioSessionId();
    }

    private static boolean z1(m2 m2Var) {
        return m2Var.f28231e == 3 && m2Var.f28238l && m2Var.f28239m == 0;
    }

    @Override // n3.p2
    public boolean A() {
        u2();
        return this.f28514p0.f28238l;
    }

    @Override // n3.p2
    public void B(final boolean z10) {
        u2();
        if (this.G != z10) {
            this.G = z10;
            this.f28503k.S0(z10);
            this.f28505l.i(9, new s.a() { // from class: n3.j0
                @Override // a5.s.a
                public final void invoke(Object obj) {
                    ((p2.d) obj).K(z10);
                }
            });
            p2();
            this.f28505l.f();
        }
    }

    @Override // n3.p2
    public long C() {
        u2();
        return 3000L;
    }

    @Override // n3.p2
    public int D() {
        u2();
        if (this.f28514p0.f28227a.u()) {
            return this.f28518r0;
        }
        m2 m2Var = this.f28514p0;
        return m2Var.f28227a.f(m2Var.f28228b.f25139a);
    }

    @Override // n3.p2
    public void E(TextureView textureView) {
        u2();
        if (textureView == null || textureView != this.Z) {
            return;
        }
        I();
    }

    @Override // n3.p2
    public b5.a0 F() {
        u2();
        return this.f28510n0;
    }

    @Override // n3.p2
    public int H() {
        u2();
        if (f()) {
            return this.f28514p0.f28228b.f25141c;
        }
        return -1;
    }

    @Override // n3.p2
    public void I() {
        u2();
        b2();
        l2(null);
        X1(0, 0);
    }

    @Override // n3.p2
    public long J() {
        u2();
        return this.f28523v;
    }

    @Override // n3.p2
    public long K() {
        u2();
        if (f()) {
            m2 m2Var = this.f28514p0;
            m2Var.f28227a.l(m2Var.f28228b.f25139a, this.f28509n);
            m2 m2Var2 = this.f28514p0;
            if (m2Var2.f28229c == -9223372036854775807L) {
                return m2Var2.f28227a.r(N(), this.f27938a).d();
            }
            return this.f28509n.p() + a5.p0.Z0(this.f28514p0.f28229c);
        }
        return getCurrentPosition();
    }

    @Override // n3.p2
    public int M() {
        u2();
        return this.f28514p0.f28231e;
    }

    @Override // n3.p2
    public int N() {
        u2();
        int q12 = q1();
        if (q12 == -1) {
            return 0;
        }
        return q12;
    }

    @Override // n3.p2
    public void O(final int i10) {
        u2();
        if (this.F != i10) {
            this.F = i10;
            this.f28503k.P0(i10);
            this.f28505l.i(8, new s.a() { // from class: n3.b0
                @Override // a5.s.a
                public final void invoke(Object obj) {
                    ((p2.d) obj).t(i10);
                }
            });
            p2();
            this.f28505l.f();
        }
    }

    @Override // n3.p2
    public void P(SurfaceView surfaceView) {
        u2();
        j1(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // n3.p2
    public int Q() {
        u2();
        return this.F;
    }

    @Override // n3.p2
    public boolean R() {
        u2();
        return this.G;
    }

    @Override // n3.p2
    public long S() {
        u2();
        if (this.f28514p0.f28227a.u()) {
            return this.f28520s0;
        }
        m2 m2Var = this.f28514p0;
        if (m2Var.f28237k.f25142d != m2Var.f28228b.f25142d) {
            return m2Var.f28227a.r(N(), this.f27938a).f();
        }
        long j10 = m2Var.f28242p;
        if (this.f28514p0.f28237k.b()) {
            m2 m2Var2 = this.f28514p0;
            l3.b l10 = m2Var2.f28227a.l(m2Var2.f28237k.f25139a, this.f28509n);
            long i10 = l10.i(this.f28514p0.f28237k.f25140b);
            j10 = i10 == Long.MIN_VALUE ? l10.f28134d : i10;
        }
        m2 m2Var3 = this.f28514p0;
        return a5.p0.Z0(Y1(m2Var3.f28227a, m2Var3.f28237k, j10));
    }

    @Override // n3.p2
    public z1 V() {
        u2();
        return this.P;
    }

    @Override // n3.p2
    public long W() {
        u2();
        return this.f28522u;
    }

    @Override // n3.p2
    public void a() {
        u2();
        boolean A = A();
        int o10 = this.A.o(A, 2);
        q2(A, o10, s1(A, o10));
        m2 m2Var = this.f28514p0;
        if (m2Var.f28231e != 1) {
            return;
        }
        m2 e8 = m2Var.e(null);
        m2 g10 = e8.g(e8.f28227a.u() ? 4 : 2);
        this.H++;
        this.f28503k.g0();
        r2(g10, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // n3.p2
    public o2 b() {
        u2();
        return this.f28514p0.f28240n;
    }

    @Override // n3.e
    protected void b0() {
        u2();
        c2(N(), -9223372036854775807L, true);
    }

    @Override // n3.s
    @Deprecated
    public void c(e4.t tVar) {
        u2();
        f2(tVar);
        a();
    }

    @Override // n3.p2
    public boolean f() {
        u2();
        return this.f28514p0.f28228b.b();
    }

    public void f1(o3.c cVar) {
        this.f28517r.i0((o3.c) a5.a.e(cVar));
    }

    public void f2(e4.t tVar) {
        u2();
        g2(Collections.singletonList(tVar));
    }

    @Override // n3.p2
    public long g() {
        u2();
        return a5.p0.Z0(this.f28514p0.f28243q);
    }

    public void g1(s.a aVar) {
        this.f28507m.add(aVar);
    }

    public void g2(List<e4.t> list) {
        u2();
        h2(list, true);
    }

    @Override // n3.p2
    public long getCurrentPosition() {
        u2();
        return a5.p0.Z0(p1(this.f28514p0));
    }

    @Override // n3.p2
    public long getDuration() {
        u2();
        if (f()) {
            m2 m2Var = this.f28514p0;
            t.b bVar = m2Var.f28228b;
            m2Var.f28227a.l(bVar.f25139a, this.f28509n);
            return a5.p0.Z0(this.f28509n.e(bVar.f25140b, bVar.f25141c));
        }
        return d();
    }

    @Override // n3.p2
    public void h(SurfaceView surfaceView) {
        u2();
        if (surfaceView instanceof b5.j) {
            b2();
            l2(surfaceView);
            j2(surfaceView.getHolder());
        } else if (surfaceView instanceof c5.l) {
            b2();
            this.X = (c5.l) surfaceView;
            m1(this.f28526y).n(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS).m(this.X).l();
            this.X.d(this.f28525x);
            l2(this.X.getVideoSurface());
            j2(surfaceView.getHolder());
        } else {
            m2(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    public void h2(List<e4.t> list, boolean z10) {
        u2();
        i2(list, -1, -9223372036854775807L, z10);
    }

    public void j1(SurfaceHolder surfaceHolder) {
        u2();
        if (surfaceHolder == null || surfaceHolder != this.W) {
            return;
        }
        I();
    }

    @Override // n3.p2
    public void k(boolean z10) {
        u2();
        int o10 = this.A.o(z10, M());
        q2(z10, o10, s1(z10, o10));
    }

    @Override // n3.p2
    public q3 l() {
        u2();
        return this.f28514p0.f28235i.f32592d;
    }

    public void m2(SurfaceHolder surfaceHolder) {
        u2();
        if (surfaceHolder == null) {
            I();
            return;
        }
        b2();
        this.Y = true;
        this.W = surfaceHolder;
        surfaceHolder.addCallback(this.f28525x);
        Surface surface = surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            l2(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            X1(surfaceFrame.width(), surfaceFrame.height());
            return;
        }
        l2(null);
        X1(0, 0);
    }

    @Override // n3.p2
    public n4.e n() {
        u2();
        return this.f28502j0;
    }

    public void n2(boolean z10) {
        u2();
        this.A.o(A(), 1);
        o2(z10, null);
        this.f28502j0 = new n4.e(y5.q.p(), this.f28514p0.f28244r);
    }

    @Override // n3.p2
    public int o() {
        u2();
        if (f()) {
            return this.f28514p0.f28228b.f25140b;
        }
        return -1;
    }

    public boolean o1() {
        u2();
        return this.f28514p0.f28241o;
    }

    @Override // n3.p2
    public void q(p2.d dVar) {
        a5.a.e(dVar);
        this.f28505l.j(dVar);
    }

    @Override // n3.p2
    public int s() {
        u2();
        return this.f28514p0.f28239m;
    }

    @Override // n3.p2
    public void stop() {
        u2();
        n2(false);
    }

    @Override // n3.p2
    public l3 t() {
        u2();
        return this.f28514p0.f28227a;
    }

    @Override // n3.p2
    /* renamed from: t1 */
    public q j() {
        u2();
        return this.f28514p0.f28232f;
    }

    @Override // n3.p2
    public Looper u() {
        return this.f28519s;
    }

    @Override // n3.p2
    public void w(TextureView textureView) {
        u2();
        if (textureView == null) {
            I();
            return;
        }
        b2();
        this.Z = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            a5.t.i("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f28525x);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            l2(null);
            X1(0, 0);
            return;
        }
        k2(surfaceTexture);
        X1(textureView.getWidth(), textureView.getHeight());
    }

    @Override // n3.p2
    public void x(p2.d dVar) {
        this.f28505l.c((p2.d) a5.a.e(dVar));
    }

    @Override // n3.p2
    public void y(int i10, long j10) {
        u2();
        c2(i10, j10, false);
    }

    @Override // n3.p2
    public p2.b z() {
        u2();
        return this.O;
    }
}

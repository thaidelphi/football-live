package n3;

import android.content.Context;
import android.os.Looper;
import com.unity3d.services.core.di.ServiceProvider;
import e4.t;
import n3.j;
import n3.s;
/* compiled from: ExoPlayer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface s extends p2 {

    /* compiled from: ExoPlayer.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void C(boolean z10);

        void F(boolean z10);
    }

    /* compiled from: ExoPlayer.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {
        boolean A;

        /* renamed from: a  reason: collision with root package name */
        final Context f28319a;

        /* renamed from: b  reason: collision with root package name */
        a5.d f28320b;

        /* renamed from: c  reason: collision with root package name */
        long f28321c;

        /* renamed from: d  reason: collision with root package name */
        x5.k<c3> f28322d;

        /* renamed from: e  reason: collision with root package name */
        x5.k<t.a> f28323e;

        /* renamed from: f  reason: collision with root package name */
        x5.k<x4.b0> f28324f;

        /* renamed from: g  reason: collision with root package name */
        x5.k<s1> f28325g;

        /* renamed from: h  reason: collision with root package name */
        x5.k<z4.f> f28326h;

        /* renamed from: i  reason: collision with root package name */
        x5.d<a5.d, o3.a> f28327i;

        /* renamed from: j  reason: collision with root package name */
        Looper f28328j;

        /* renamed from: k  reason: collision with root package name */
        p3.e f28329k;

        /* renamed from: l  reason: collision with root package name */
        boolean f28330l;

        /* renamed from: m  reason: collision with root package name */
        int f28331m;

        /* renamed from: n  reason: collision with root package name */
        boolean f28332n;

        /* renamed from: o  reason: collision with root package name */
        boolean f28333o;

        /* renamed from: p  reason: collision with root package name */
        int f28334p;

        /* renamed from: q  reason: collision with root package name */
        int f28335q;

        /* renamed from: r  reason: collision with root package name */
        boolean f28336r;

        /* renamed from: s  reason: collision with root package name */
        d3 f28337s;

        /* renamed from: t  reason: collision with root package name */
        long f28338t;

        /* renamed from: u  reason: collision with root package name */
        long f28339u;

        /* renamed from: v  reason: collision with root package name */
        r1 f28340v;

        /* renamed from: w  reason: collision with root package name */
        long f28341w;

        /* renamed from: x  reason: collision with root package name */
        long f28342x;

        /* renamed from: y  reason: collision with root package name */
        boolean f28343y;

        /* renamed from: z  reason: collision with root package name */
        boolean f28344z;

        public b(final Context context) {
            this(context, new x5.k() { // from class: n3.v
                @Override // x5.k
                public final Object get() {
                    c3 h10;
                    h10 = s.b.h(context);
                    return h10;
                }
            }, new x5.k() { // from class: n3.x
                @Override // x5.k
                public final Object get() {
                    t.a i10;
                    i10 = s.b.i(context);
                    return i10;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ c3 h(Context context) {
            return new m(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ t.a i(Context context) {
            return new e4.i(context, new s3.g());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ x4.b0 j(Context context) {
            return new x4.m(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ s1 l(s1 s1Var) {
            return s1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ x4.b0 m(x4.b0 b0Var) {
            return b0Var;
        }

        public s g() {
            a5.a.f(!this.A);
            this.A = true;
            return new x0(this, null);
        }

        public b n(final s1 s1Var) {
            a5.a.f(!this.A);
            a5.a.e(s1Var);
            this.f28325g = new x5.k() { // from class: n3.y
                @Override // x5.k
                public final Object get() {
                    s1 l10;
                    l10 = s.b.l(s1.this);
                    return l10;
                }
            };
            return this;
        }

        public b o(final x4.b0 b0Var) {
            a5.a.f(!this.A);
            a5.a.e(b0Var);
            this.f28324f = new x5.k() { // from class: n3.z
                @Override // x5.k
                public final Object get() {
                    x4.b0 m7;
                    m7 = s.b.m(x4.b0.this);
                    return m7;
                }
            };
            return this;
        }

        private b(final Context context, x5.k<c3> kVar, x5.k<t.a> kVar2) {
            this(context, kVar, kVar2, new x5.k() { // from class: n3.w
                @Override // x5.k
                public final Object get() {
                    x4.b0 j10;
                    j10 = s.b.j(context);
                    return j10;
                }
            }, new x5.k() { // from class: n3.a0
                @Override // x5.k
                public final Object get() {
                    return new k();
                }
            }, new x5.k() { // from class: n3.u
                @Override // x5.k
                public final Object get() {
                    z4.f m7;
                    m7 = z4.s.m(context);
                    return m7;
                }
            }, new x5.d() { // from class: n3.t
                @Override // x5.d
                public final Object apply(Object obj) {
                    return new o3.l1((a5.d) obj);
                }
            });
        }

        private b(Context context, x5.k<c3> kVar, x5.k<t.a> kVar2, x5.k<x4.b0> kVar3, x5.k<s1> kVar4, x5.k<z4.f> kVar5, x5.d<a5.d, o3.a> dVar) {
            this.f28319a = (Context) a5.a.e(context);
            this.f28322d = kVar;
            this.f28323e = kVar2;
            this.f28324f = kVar3;
            this.f28325g = kVar4;
            this.f28326h = kVar5;
            this.f28327i = dVar;
            this.f28328j = a5.p0.O();
            this.f28329k = p3.e.f29649g;
            this.f28331m = 0;
            this.f28334p = 1;
            this.f28335q = 0;
            this.f28336r = true;
            this.f28337s = d3.f27935g;
            this.f28338t = ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT;
            this.f28339u = 15000L;
            this.f28340v = new j.b().a();
            this.f28320b = a5.d.f412a;
            this.f28341w = 500L;
            this.f28342x = 2000L;
            this.f28344z = true;
        }
    }

    @Deprecated
    void c(e4.t tVar);
}

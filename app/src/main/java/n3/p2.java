package n3;

import a5.m;
import android.os.Bundle;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.List;
import n3.h;
import n3.p2;
/* compiled from: Player.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface p2 {

    /* compiled from: Player.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b implements h {

        /* renamed from: b  reason: collision with root package name */
        public static final b f28273b = new a().e();

        /* renamed from: c  reason: collision with root package name */
        public static final h.a<b> f28274c = new h.a() { // from class: n3.q2
            @Override // n3.h.a
            public final h a(Bundle bundle) {
                p2.b d10;
                d10 = p2.b.d(bundle);
                return d10;
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private final a5.m f28275a;

        /* compiled from: Player.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class a {

            /* renamed from: b  reason: collision with root package name */
            private static final int[] f28276b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

            /* renamed from: a  reason: collision with root package name */
            private final m.b f28277a = new m.b();

            public a a(int i10) {
                this.f28277a.a(i10);
                return this;
            }

            public a b(b bVar) {
                this.f28277a.b(bVar.f28275a);
                return this;
            }

            public a c(int... iArr) {
                this.f28277a.c(iArr);
                return this;
            }

            public a d(int i10, boolean z10) {
                this.f28277a.d(i10, z10);
                return this;
            }

            public b e() {
                return new b(this.f28277a.e());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b d(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(e(0));
            if (integerArrayList == null) {
                return f28273b;
            }
            a aVar = new a();
            for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
                aVar.a(integerArrayList.get(i10).intValue());
            }
            return aVar.e();
        }

        private static String e(int i10) {
            return Integer.toString(i10, 36);
        }

        public boolean c(int i10) {
            return this.f28275a.a(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f28275a.equals(((b) obj).f28275a);
            }
            return false;
        }

        public int hashCode() {
            return this.f28275a.hashCode();
        }

        private b(a5.m mVar) {
            this.f28275a = mVar;
        }
    }

    /* compiled from: Player.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final a5.m f28278a;

        public c(a5.m mVar) {
            this.f28278a = mVar;
        }

        public boolean a(int i10) {
            return this.f28278a.a(i10);
        }

        public boolean b(int... iArr) {
            return this.f28278a.b(iArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f28278a.equals(((c) obj).f28278a);
            }
            return false;
        }

        public int hashCode() {
            return this.f28278a.hashCode();
        }
    }

    /* compiled from: Player.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface d {
        @Deprecated
        void B(boolean z10);

        void D(o oVar);

        void F(int i10);

        void K(boolean z10);

        void L(int i10, boolean z10);

        void N(l3 l3Var, int i10);

        void O(z1 z1Var);

        void P(l2 l2Var);

        void Q();

        void R(p2 p2Var, c cVar);

        void T(u1 u1Var, int i10);

        void U(int i10, int i11);

        void V(e eVar, e eVar2, int i10);

        void W(b bVar);

        @Deprecated
        void Y(int i10);

        void a(boolean z10);

        void a0(boolean z10);

        @Deprecated
        void b0();

        @Deprecated
        void d0(boolean z10, int i10);

        void g(Metadata metadata);

        void g0(boolean z10, int i10);

        @Deprecated
        void h(List<n4.b> list);

        void k0(l2 l2Var);

        void m0(q3 q3Var);

        void n(n4.e eVar);

        void n0(boolean z10);

        void t(int i10);

        void u(b5.a0 a0Var);

        void w(o2 o2Var);

        void z(int i10);
    }

    /* compiled from: Player.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class e implements h {

        /* renamed from: k  reason: collision with root package name */
        public static final h.a<e> f28279k = new h.a() { // from class: n3.s2
            @Override // n3.h.a
            public final h a(Bundle bundle) {
                p2.e b10;
                b10 = p2.e.b(bundle);
                return b10;
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public final Object f28280a;
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public final int f28281b;

        /* renamed from: c  reason: collision with root package name */
        public final int f28282c;

        /* renamed from: d  reason: collision with root package name */
        public final u1 f28283d;

        /* renamed from: e  reason: collision with root package name */
        public final Object f28284e;

        /* renamed from: f  reason: collision with root package name */
        public final int f28285f;

        /* renamed from: g  reason: collision with root package name */
        public final long f28286g;

        /* renamed from: h  reason: collision with root package name */
        public final long f28287h;

        /* renamed from: i  reason: collision with root package name */
        public final int f28288i;

        /* renamed from: j  reason: collision with root package name */
        public final int f28289j;

        public e(Object obj, int i10, u1 u1Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f28280a = obj;
            this.f28281b = i10;
            this.f28282c = i10;
            this.f28283d = u1Var;
            this.f28284e = obj2;
            this.f28285f = i11;
            this.f28286g = j10;
            this.f28287h = j11;
            this.f28288i = i12;
            this.f28289j = i13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static e b(Bundle bundle) {
            int i10 = bundle.getInt(c(0), -1);
            Bundle bundle2 = bundle.getBundle(c(1));
            return new e(null, i10, bundle2 == null ? null : u1.f28371j.a(bundle2), null, bundle.getInt(c(2), -1), bundle.getLong(c(3), -9223372036854775807L), bundle.getLong(c(4), -9223372036854775807L), bundle.getInt(c(5), -1), bundle.getInt(c(6), -1));
        }

        private static String c(int i10) {
            return Integer.toString(i10, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f28282c == eVar.f28282c && this.f28285f == eVar.f28285f && this.f28286g == eVar.f28286g && this.f28287h == eVar.f28287h && this.f28288i == eVar.f28288i && this.f28289j == eVar.f28289j && x5.f.a(this.f28280a, eVar.f28280a) && x5.f.a(this.f28284e, eVar.f28284e) && x5.f.a(this.f28283d, eVar.f28283d);
        }

        public int hashCode() {
            return x5.f.b(this.f28280a, Integer.valueOf(this.f28282c), this.f28283d, this.f28284e, Integer.valueOf(this.f28285f), Long.valueOf(this.f28286g), Long.valueOf(this.f28287h), Integer.valueOf(this.f28288i), Integer.valueOf(this.f28289j));
        }
    }

    boolean A();

    void B(boolean z10);

    long C();

    int D();

    void E(TextureView textureView);

    b5.a0 F();

    boolean G();

    int H();

    void I();

    long J();

    long K();

    boolean L();

    int M();

    int N();

    void O(int i10);

    void P(SurfaceView surfaceView);

    int Q();

    boolean R();

    long S();

    void T();

    void U();

    z1 V();

    long W();

    boolean X();

    void a();

    o2 b();

    void e();

    boolean f();

    long g();

    long getCurrentPosition();

    long getDuration();

    void h(SurfaceView surfaceView);

    void i();

    boolean isPlaying();

    l2 j();

    void k(boolean z10);

    q3 l();

    boolean m();

    n4.e n();

    int o();

    boolean p(int i10);

    void pause();

    void q(d dVar);

    boolean r();

    int s();

    void stop();

    l3 t();

    Looper u();

    void v();

    void w(TextureView textureView);

    void x(d dVar);

    void y(int i10, long j10);

    b z();
}

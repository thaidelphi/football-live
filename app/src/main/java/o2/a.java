package o2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.ads.AdRequest;
import com.google.protobuf.CodedOutputStream;
import f2.o;
import f2.q;
import java.util.Map;
import o2.a;
import s2.k;
import w1.l;
import y1.j;
/* compiled from: BaseRequestOptions.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a<T extends a<T>> implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private int f29063a;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f29067e;

    /* renamed from: f  reason: collision with root package name */
    private int f29068f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f29069g;

    /* renamed from: h  reason: collision with root package name */
    private int f29070h;

    /* renamed from: m  reason: collision with root package name */
    private boolean f29075m;

    /* renamed from: o  reason: collision with root package name */
    private Drawable f29077o;

    /* renamed from: p  reason: collision with root package name */
    private int f29078p;

    /* renamed from: t  reason: collision with root package name */
    private boolean f29082t;

    /* renamed from: u  reason: collision with root package name */
    private Resources.Theme f29083u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f29084v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f29085w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f29086x;

    /* renamed from: z  reason: collision with root package name */
    private boolean f29088z;

    /* renamed from: b  reason: collision with root package name */
    private float f29064b = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    private j f29065c = j.f32928e;

    /* renamed from: d  reason: collision with root package name */
    private com.bumptech.glide.g f29066d = com.bumptech.glide.g.NORMAL;

    /* renamed from: i  reason: collision with root package name */
    private boolean f29071i = true;

    /* renamed from: j  reason: collision with root package name */
    private int f29072j = -1;

    /* renamed from: k  reason: collision with root package name */
    private int f29073k = -1;

    /* renamed from: l  reason: collision with root package name */
    private w1.f f29074l = r2.c.c();

    /* renamed from: n  reason: collision with root package name */
    private boolean f29076n = true;

    /* renamed from: q  reason: collision with root package name */
    private w1.h f29079q = new w1.h();

    /* renamed from: r  reason: collision with root package name */
    private Map<Class<?>, l<?>> f29080r = new s2.b();

    /* renamed from: s  reason: collision with root package name */
    private Class<?> f29081s = Object.class;

    /* renamed from: y  reason: collision with root package name */
    private boolean f29087y = true;

    private boolean G(int i10) {
        return H(this.f29063a, i10);
    }

    private static boolean H(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    private T Q(f2.l lVar, l<Bitmap> lVar2) {
        return V(lVar, lVar2, false);
    }

    private T V(f2.l lVar, l<Bitmap> lVar2, boolean z10) {
        T R;
        if (z10) {
            R = c0(lVar, lVar2);
        } else {
            R = R(lVar, lVar2);
        }
        R.f29087y = true;
        return R;
    }

    private T W() {
        return this;
    }

    public final boolean A() {
        return this.f29088z;
    }

    public final boolean B() {
        return this.f29085w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean C() {
        return this.f29084v;
    }

    public final boolean D() {
        return this.f29071i;
    }

    public final boolean E() {
        return G(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean F() {
        return this.f29087y;
    }

    public final boolean I() {
        return this.f29076n;
    }

    public final boolean J() {
        return this.f29075m;
    }

    public final boolean K() {
        return G(com.ironsource.mediationsdk.metadata.a.f18931n);
    }

    public final boolean L() {
        return k.t(this.f29073k, this.f29072j);
    }

    public T M() {
        this.f29082t = true;
        return W();
    }

    public T N() {
        return R(f2.l.f25327e, new f2.i());
    }

    public T O() {
        return Q(f2.l.f25326d, new f2.j());
    }

    public T P() {
        return Q(f2.l.f25325c, new q());
    }

    final T R(f2.l lVar, l<Bitmap> lVar2) {
        if (this.f29084v) {
            return (T) clone().R(lVar, lVar2);
        }
        h(lVar);
        return f0(lVar2, false);
    }

    public T S(int i10, int i11) {
        if (this.f29084v) {
            return (T) clone().S(i10, i11);
        }
        this.f29073k = i10;
        this.f29072j = i11;
        this.f29063a |= AdRequest.MAX_CONTENT_URL_LENGTH;
        return X();
    }

    public T T(int i10) {
        if (this.f29084v) {
            return (T) clone().T(i10);
        }
        this.f29070h = i10;
        int i11 = this.f29063a | 128;
        this.f29063a = i11;
        this.f29069g = null;
        this.f29063a = i11 & (-65);
        return X();
    }

    public T U(com.bumptech.glide.g gVar) {
        if (this.f29084v) {
            return (T) clone().U(gVar);
        }
        this.f29066d = (com.bumptech.glide.g) s2.j.d(gVar);
        this.f29063a |= 8;
        return X();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final T X() {
        if (!this.f29082t) {
            return W();
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public <Y> T Y(w1.g<Y> gVar, Y y10) {
        if (this.f29084v) {
            return (T) clone().Y(gVar, y10);
        }
        s2.j.d(gVar);
        s2.j.d(y10);
        this.f29079q.e(gVar, y10);
        return X();
    }

    public T Z(w1.f fVar) {
        if (this.f29084v) {
            return (T) clone().Z(fVar);
        }
        this.f29074l = (w1.f) s2.j.d(fVar);
        this.f29063a |= 1024;
        return X();
    }

    public T a0(float f10) {
        if (this.f29084v) {
            return (T) clone().a0(f10);
        }
        if (f10 >= 0.0f && f10 <= 1.0f) {
            this.f29064b = f10;
            this.f29063a |= 2;
            return X();
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    public T b0(boolean z10) {
        if (this.f29084v) {
            return (T) clone().b0(true);
        }
        this.f29071i = !z10;
        this.f29063a |= 256;
        return X();
    }

    public T c(a<?> aVar) {
        if (this.f29084v) {
            return (T) clone().c(aVar);
        }
        if (H(aVar.f29063a, 2)) {
            this.f29064b = aVar.f29064b;
        }
        if (H(aVar.f29063a, 262144)) {
            this.f29085w = aVar.f29085w;
        }
        if (H(aVar.f29063a, 1048576)) {
            this.f29088z = aVar.f29088z;
        }
        if (H(aVar.f29063a, 4)) {
            this.f29065c = aVar.f29065c;
        }
        if (H(aVar.f29063a, 8)) {
            this.f29066d = aVar.f29066d;
        }
        if (H(aVar.f29063a, 16)) {
            this.f29067e = aVar.f29067e;
            this.f29068f = 0;
            this.f29063a &= -33;
        }
        if (H(aVar.f29063a, 32)) {
            this.f29068f = aVar.f29068f;
            this.f29067e = null;
            this.f29063a &= -17;
        }
        if (H(aVar.f29063a, 64)) {
            this.f29069g = aVar.f29069g;
            this.f29070h = 0;
            this.f29063a &= -129;
        }
        if (H(aVar.f29063a, 128)) {
            this.f29070h = aVar.f29070h;
            this.f29069g = null;
            this.f29063a &= -65;
        }
        if (H(aVar.f29063a, 256)) {
            this.f29071i = aVar.f29071i;
        }
        if (H(aVar.f29063a, AdRequest.MAX_CONTENT_URL_LENGTH)) {
            this.f29073k = aVar.f29073k;
            this.f29072j = aVar.f29072j;
        }
        if (H(aVar.f29063a, 1024)) {
            this.f29074l = aVar.f29074l;
        }
        if (H(aVar.f29063a, CodedOutputStream.DEFAULT_BUFFER_SIZE)) {
            this.f29081s = aVar.f29081s;
        }
        if (H(aVar.f29063a, 8192)) {
            this.f29077o = aVar.f29077o;
            this.f29078p = 0;
            this.f29063a &= -16385;
        }
        if (H(aVar.f29063a, 16384)) {
            this.f29078p = aVar.f29078p;
            this.f29077o = null;
            this.f29063a &= -8193;
        }
        if (H(aVar.f29063a, 32768)) {
            this.f29083u = aVar.f29083u;
        }
        if (H(aVar.f29063a, 65536)) {
            this.f29076n = aVar.f29076n;
        }
        if (H(aVar.f29063a, 131072)) {
            this.f29075m = aVar.f29075m;
        }
        if (H(aVar.f29063a, com.ironsource.mediationsdk.metadata.a.f18931n)) {
            this.f29080r.putAll(aVar.f29080r);
            this.f29087y = aVar.f29087y;
        }
        if (H(aVar.f29063a, 524288)) {
            this.f29086x = aVar.f29086x;
        }
        if (!this.f29076n) {
            this.f29080r.clear();
            int i10 = this.f29063a & (-2049);
            this.f29063a = i10;
            this.f29075m = false;
            this.f29063a = i10 & (-131073);
            this.f29087y = true;
        }
        this.f29063a |= aVar.f29063a;
        this.f29079q.d(aVar.f29079q);
        return X();
    }

    final T c0(f2.l lVar, l<Bitmap> lVar2) {
        if (this.f29084v) {
            return (T) clone().c0(lVar, lVar2);
        }
        h(lVar);
        return e0(lVar2);
    }

    public T d() {
        if (this.f29082t && !this.f29084v) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f29084v = true;
        return M();
    }

    <Y> T d0(Class<Y> cls, l<Y> lVar, boolean z10) {
        if (this.f29084v) {
            return (T) clone().d0(cls, lVar, z10);
        }
        s2.j.d(cls);
        s2.j.d(lVar);
        this.f29080r.put(cls, lVar);
        int i10 = this.f29063a | com.ironsource.mediationsdk.metadata.a.f18931n;
        this.f29063a = i10;
        this.f29076n = true;
        int i11 = i10 | 65536;
        this.f29063a = i11;
        this.f29087y = false;
        if (z10) {
            this.f29063a = i11 | 131072;
            this.f29075m = true;
        }
        return X();
    }

    @Override // 
    /* renamed from: e */
    public T clone() {
        try {
            T t10 = (T) super.clone();
            w1.h hVar = new w1.h();
            t10.f29079q = hVar;
            hVar.d(this.f29079q);
            s2.b bVar = new s2.b();
            t10.f29080r = bVar;
            bVar.putAll(this.f29080r);
            t10.f29082t = false;
            t10.f29084v = false;
            return t10;
        } catch (CloneNotSupportedException e8) {
            throw new RuntimeException(e8);
        }
    }

    public T e0(l<Bitmap> lVar) {
        return f0(lVar, true);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return Float.compare(aVar.f29064b, this.f29064b) == 0 && this.f29068f == aVar.f29068f && k.c(this.f29067e, aVar.f29067e) && this.f29070h == aVar.f29070h && k.c(this.f29069g, aVar.f29069g) && this.f29078p == aVar.f29078p && k.c(this.f29077o, aVar.f29077o) && this.f29071i == aVar.f29071i && this.f29072j == aVar.f29072j && this.f29073k == aVar.f29073k && this.f29075m == aVar.f29075m && this.f29076n == aVar.f29076n && this.f29085w == aVar.f29085w && this.f29086x == aVar.f29086x && this.f29065c.equals(aVar.f29065c) && this.f29066d == aVar.f29066d && this.f29079q.equals(aVar.f29079q) && this.f29080r.equals(aVar.f29080r) && this.f29081s.equals(aVar.f29081s) && k.c(this.f29074l, aVar.f29074l) && k.c(this.f29083u, aVar.f29083u);
        }
        return false;
    }

    public T f(Class<?> cls) {
        if (this.f29084v) {
            return (T) clone().f(cls);
        }
        this.f29081s = (Class) s2.j.d(cls);
        this.f29063a |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
        return X();
    }

    /* JADX WARN: Multi-variable type inference failed */
    T f0(l<Bitmap> lVar, boolean z10) {
        if (this.f29084v) {
            return (T) clone().f0(lVar, z10);
        }
        o oVar = new o(lVar, z10);
        d0(Bitmap.class, lVar, z10);
        d0(Drawable.class, oVar, z10);
        d0(BitmapDrawable.class, oVar.c(), z10);
        d0(j2.c.class, new j2.f(lVar), z10);
        return X();
    }

    public T g(j jVar) {
        if (this.f29084v) {
            return (T) clone().g(jVar);
        }
        this.f29065c = (j) s2.j.d(jVar);
        this.f29063a |= 4;
        return X();
    }

    public T g0(boolean z10) {
        if (this.f29084v) {
            return (T) clone().g0(z10);
        }
        this.f29088z = z10;
        this.f29063a |= 1048576;
        return X();
    }

    public T h(f2.l lVar) {
        return Y(f2.l.f25330h, s2.j.d(lVar));
    }

    public int hashCode() {
        return k.o(this.f29083u, k.o(this.f29074l, k.o(this.f29081s, k.o(this.f29080r, k.o(this.f29079q, k.o(this.f29066d, k.o(this.f29065c, k.p(this.f29086x, k.p(this.f29085w, k.p(this.f29076n, k.p(this.f29075m, k.n(this.f29073k, k.n(this.f29072j, k.p(this.f29071i, k.o(this.f29077o, k.n(this.f29078p, k.o(this.f29069g, k.n(this.f29070h, k.o(this.f29067e, k.n(this.f29068f, k.k(this.f29064b)))))))))))))))))))));
    }

    public T i(int i10) {
        if (this.f29084v) {
            return (T) clone().i(i10);
        }
        this.f29068f = i10;
        int i11 = this.f29063a | 32;
        this.f29063a = i11;
        this.f29067e = null;
        this.f29063a = i11 & (-17);
        return X();
    }

    public final j j() {
        return this.f29065c;
    }

    public final int k() {
        return this.f29068f;
    }

    public final Drawable l() {
        return this.f29067e;
    }

    public final Drawable m() {
        return this.f29077o;
    }

    public final int n() {
        return this.f29078p;
    }

    public final boolean o() {
        return this.f29086x;
    }

    public final w1.h p() {
        return this.f29079q;
    }

    public final int q() {
        return this.f29072j;
    }

    public final int r() {
        return this.f29073k;
    }

    public final Drawable s() {
        return this.f29069g;
    }

    public final int t() {
        return this.f29070h;
    }

    public final com.bumptech.glide.g u() {
        return this.f29066d;
    }

    public final Class<?> v() {
        return this.f29081s;
    }

    public final w1.f w() {
        return this.f29074l;
    }

    public final float x() {
        return this.f29064b;
    }

    public final Resources.Theme y() {
        return this.f29083u;
    }

    public final Map<Class<?>, l<?>> z() {
        return this.f29080r;
    }
}

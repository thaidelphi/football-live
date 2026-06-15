package o2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.c;
import com.ironsource.b9;
import java.util.List;
import java.util.concurrent.Executor;
import y1.k;
import y1.q;
import y1.v;
/* compiled from: SingleRequest.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class h<R> implements c, p2.g, g {
    private static final boolean D = Log.isLoggable("Request", 2);
    private int A;
    private boolean B;
    private RuntimeException C;

    /* renamed from: a  reason: collision with root package name */
    private final String f29102a;

    /* renamed from: b  reason: collision with root package name */
    private final t2.c f29103b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f29104c;

    /* renamed from: d  reason: collision with root package name */
    private final e<R> f29105d;

    /* renamed from: e  reason: collision with root package name */
    private final d f29106e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f29107f;

    /* renamed from: g  reason: collision with root package name */
    private final com.bumptech.glide.d f29108g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f29109h;

    /* renamed from: i  reason: collision with root package name */
    private final Class<R> f29110i;

    /* renamed from: j  reason: collision with root package name */
    private final o2.a<?> f29111j;

    /* renamed from: k  reason: collision with root package name */
    private final int f29112k;

    /* renamed from: l  reason: collision with root package name */
    private final int f29113l;

    /* renamed from: m  reason: collision with root package name */
    private final com.bumptech.glide.g f29114m;

    /* renamed from: n  reason: collision with root package name */
    private final p2.h<R> f29115n;

    /* renamed from: o  reason: collision with root package name */
    private final List<e<R>> f29116o;

    /* renamed from: p  reason: collision with root package name */
    private final q2.c<? super R> f29117p;

    /* renamed from: q  reason: collision with root package name */
    private final Executor f29118q;

    /* renamed from: r  reason: collision with root package name */
    private v<R> f29119r;

    /* renamed from: s  reason: collision with root package name */
    private k.d f29120s;

    /* renamed from: t  reason: collision with root package name */
    private long f29121t;

    /* renamed from: u  reason: collision with root package name */
    private volatile k f29122u;

    /* renamed from: v  reason: collision with root package name */
    private a f29123v;

    /* renamed from: w  reason: collision with root package name */
    private Drawable f29124w;

    /* renamed from: x  reason: collision with root package name */
    private Drawable f29125x;

    /* renamed from: y  reason: collision with root package name */
    private Drawable f29126y;

    /* renamed from: z  reason: collision with root package name */
    private int f29127z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SingleRequest.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private h(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class<R> cls, o2.a<?> aVar, int i10, int i11, com.bumptech.glide.g gVar, p2.h<R> hVar, e<R> eVar, List<e<R>> list, d dVar2, k kVar, q2.c<? super R> cVar, Executor executor) {
        this.f29102a = D ? String.valueOf(super.hashCode()) : null;
        this.f29103b = t2.c.a();
        this.f29104c = obj;
        this.f29107f = context;
        this.f29108g = dVar;
        this.f29109h = obj2;
        this.f29110i = cls;
        this.f29111j = aVar;
        this.f29112k = i10;
        this.f29113l = i11;
        this.f29114m = gVar;
        this.f29115n = hVar;
        this.f29105d = eVar;
        this.f29116o = list;
        this.f29106e = dVar2;
        this.f29122u = kVar;
        this.f29117p = cVar;
        this.f29118q = executor;
        this.f29123v = a.PENDING;
        if (this.C == null && dVar.g().a(c.C0168c.class)) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    private void A() {
        if (l()) {
            Drawable p10 = this.f29109h == null ? p() : null;
            if (p10 == null) {
                p10 = o();
            }
            if (p10 == null) {
                p10 = q();
            }
            this.f29115n.h(p10);
        }
    }

    private void i() {
        if (this.B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean k() {
        d dVar = this.f29106e;
        return dVar == null || dVar.a(this);
    }

    private boolean l() {
        d dVar = this.f29106e;
        return dVar == null || dVar.d(this);
    }

    private boolean m() {
        d dVar = this.f29106e;
        return dVar == null || dVar.c(this);
    }

    private void n() {
        i();
        this.f29103b.c();
        this.f29115n.b(this);
        k.d dVar = this.f29120s;
        if (dVar != null) {
            dVar.a();
            this.f29120s = null;
        }
    }

    private Drawable o() {
        if (this.f29124w == null) {
            Drawable l10 = this.f29111j.l();
            this.f29124w = l10;
            if (l10 == null && this.f29111j.k() > 0) {
                this.f29124w = s(this.f29111j.k());
            }
        }
        return this.f29124w;
    }

    private Drawable p() {
        if (this.f29126y == null) {
            Drawable m7 = this.f29111j.m();
            this.f29126y = m7;
            if (m7 == null && this.f29111j.n() > 0) {
                this.f29126y = s(this.f29111j.n());
            }
        }
        return this.f29126y;
    }

    private Drawable q() {
        if (this.f29125x == null) {
            Drawable s10 = this.f29111j.s();
            this.f29125x = s10;
            if (s10 == null && this.f29111j.t() > 0) {
                this.f29125x = s(this.f29111j.t());
            }
        }
        return this.f29125x;
    }

    private boolean r() {
        d dVar = this.f29106e;
        return dVar == null || !dVar.getRoot().b();
    }

    private Drawable s(int i10) {
        return h2.a.a(this.f29108g, i10, this.f29111j.y() != null ? this.f29111j.y() : this.f29107f.getTheme());
    }

    private void t(String str) {
        Log.v("Request", str + " this: " + this.f29102a);
    }

    private static int u(int i10, float f10) {
        return i10 == Integer.MIN_VALUE ? i10 : Math.round(f10 * i10);
    }

    private void v() {
        d dVar = this.f29106e;
        if (dVar != null) {
            dVar.f(this);
        }
    }

    private void w() {
        d dVar = this.f29106e;
        if (dVar != null) {
            dVar.i(this);
        }
    }

    public static <R> h<R> x(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class<R> cls, o2.a<?> aVar, int i10, int i11, com.bumptech.glide.g gVar, p2.h<R> hVar, e<R> eVar, List<e<R>> list, d dVar2, k kVar, q2.c<? super R> cVar, Executor executor) {
        return new h<>(context, dVar, obj, obj2, cls, aVar, i10, i11, gVar, hVar, eVar, list, dVar2, kVar, cVar, executor);
    }

    private void y(q qVar, int i10) {
        boolean z10;
        this.f29103b.c();
        synchronized (this.f29104c) {
            qVar.k(this.C);
            int h10 = this.f29108g.h();
            if (h10 <= i10) {
                Log.w("Glide", "Load failed for " + this.f29109h + " with size [" + this.f29127z + "x" + this.A + b9.i.f16698e, qVar);
                if (h10 <= 4) {
                    qVar.g("Glide");
                }
            }
            this.f29120s = null;
            this.f29123v = a.FAILED;
            boolean z11 = true;
            this.B = true;
            List<e<R>> list = this.f29116o;
            if (list != null) {
                z10 = false;
                for (e<R> eVar : list) {
                    z10 |= eVar.onLoadFailed(qVar, this.f29109h, this.f29115n, r());
                }
            } else {
                z10 = false;
            }
            e<R> eVar2 = this.f29105d;
            if (eVar2 == null || !eVar2.onLoadFailed(qVar, this.f29109h, this.f29115n, r())) {
                z11 = false;
            }
            if (!(z10 | z11)) {
                A();
            }
            this.B = false;
            v();
        }
    }

    private void z(v<R> vVar, R r10, w1.a aVar, boolean z10) {
        boolean z11;
        boolean r11 = r();
        this.f29123v = a.COMPLETE;
        this.f29119r = vVar;
        if (this.f29108g.h() <= 3) {
            Log.d("Glide", "Finished loading " + r10.getClass().getSimpleName() + " from " + aVar + " for " + this.f29109h + " with size [" + this.f29127z + "x" + this.A + "] in " + s2.f.a(this.f29121t) + " ms");
        }
        boolean z12 = true;
        this.B = true;
        try {
            List<e<R>> list = this.f29116o;
            if (list != null) {
                z11 = false;
                for (e<R> eVar : list) {
                    z11 |= eVar.onResourceReady(r10, this.f29109h, this.f29115n, aVar, r11);
                }
            } else {
                z11 = false;
            }
            e<R> eVar2 = this.f29105d;
            if (eVar2 == null || !eVar2.onResourceReady(r10, this.f29109h, this.f29115n, aVar, r11)) {
                z12 = false;
            }
            if (!(z12 | z11)) {
                this.f29115n.a(r10, this.f29117p.a(aVar, r11));
            }
            this.B = false;
            w();
        } catch (Throwable th) {
            this.B = false;
            throw th;
        }
    }

    @Override // o2.g
    public void a(q qVar) {
        y(qVar, 5);
    }

    @Override // o2.c
    public boolean b() {
        boolean z10;
        synchronized (this.f29104c) {
            z10 = this.f29123v == a.COMPLETE;
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o2.g
    public void c(v<?> vVar, w1.a aVar, boolean z10) {
        this.f29103b.c();
        v<?> vVar2 = null;
        try {
            synchronized (this.f29104c) {
                try {
                    this.f29120s = null;
                    if (vVar == null) {
                        a(new q("Expected to receive a Resource<R> with an object of " + this.f29110i + " inside, but instead got null."));
                        return;
                    }
                    Object obj = vVar.get();
                    try {
                        if (obj != null && this.f29110i.isAssignableFrom(obj.getClass())) {
                            if (!m()) {
                                this.f29119r = null;
                                this.f29123v = a.COMPLETE;
                                this.f29122u.k(vVar);
                                return;
                            }
                            z(vVar, obj, aVar, z10);
                            return;
                        }
                        this.f29119r = null;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected to receive an object of ");
                        sb.append(this.f29110i);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(vVar);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        a(new q(sb.toString()));
                        this.f29122u.k(vVar);
                    } catch (Throwable th) {
                        vVar2 = vVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (vVar2 != null) {
                this.f29122u.k(vVar2);
            }
            throw th3;
        }
    }

    @Override // o2.c
    public void clear() {
        synchronized (this.f29104c) {
            i();
            this.f29103b.c();
            a aVar = this.f29123v;
            a aVar2 = a.CLEARED;
            if (aVar == aVar2) {
                return;
            }
            n();
            v<R> vVar = this.f29119r;
            if (vVar != null) {
                this.f29119r = null;
            } else {
                vVar = null;
            }
            if (k()) {
                this.f29115n.f(q());
            }
            this.f29123v = aVar2;
            if (vVar != null) {
                this.f29122u.k(vVar);
            }
        }
    }

    @Override // p2.g
    public void d(int i10, int i11) {
        Object obj;
        this.f29103b.c();
        Object obj2 = this.f29104c;
        synchronized (obj2) {
            try {
                try {
                    boolean z10 = D;
                    if (z10) {
                        t("Got onSizeReady in " + s2.f.a(this.f29121t));
                    }
                    if (this.f29123v == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        this.f29123v = aVar;
                        float x10 = this.f29111j.x();
                        this.f29127z = u(i10, x10);
                        this.A = u(i11, x10);
                        if (z10) {
                            t("finished setup for calling load in " + s2.f.a(this.f29121t));
                        }
                        obj = obj2;
                        try {
                            this.f29120s = this.f29122u.f(this.f29108g, this.f29109h, this.f29111j.w(), this.f29127z, this.A, this.f29111j.v(), this.f29110i, this.f29114m, this.f29111j.j(), this.f29111j.z(), this.f29111j.J(), this.f29111j.F(), this.f29111j.p(), this.f29111j.D(), this.f29111j.B(), this.f29111j.A(), this.f29111j.o(), this, this.f29118q);
                            if (this.f29123v != aVar) {
                                this.f29120s = null;
                            }
                            if (z10) {
                                t("finished onSizeReady in " + s2.f.a(this.f29121t));
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
            }
        }
    }

    @Override // o2.c
    public boolean e() {
        boolean z10;
        synchronized (this.f29104c) {
            z10 = this.f29123v == a.CLEARED;
        }
        return z10;
    }

    @Override // o2.g
    public Object f() {
        this.f29103b.c();
        return this.f29104c;
    }

    @Override // o2.c
    public boolean g(c cVar) {
        int i10;
        int i11;
        Object obj;
        Class<R> cls;
        o2.a<?> aVar;
        com.bumptech.glide.g gVar;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class<R> cls2;
        o2.a<?> aVar2;
        com.bumptech.glide.g gVar2;
        int size2;
        if (cVar instanceof h) {
            synchronized (this.f29104c) {
                i10 = this.f29112k;
                i11 = this.f29113l;
                obj = this.f29109h;
                cls = this.f29110i;
                aVar = this.f29111j;
                gVar = this.f29114m;
                List<e<R>> list = this.f29116o;
                size = list != null ? list.size() : 0;
            }
            h hVar = (h) cVar;
            synchronized (hVar.f29104c) {
                i12 = hVar.f29112k;
                i13 = hVar.f29113l;
                obj2 = hVar.f29109h;
                cls2 = hVar.f29110i;
                aVar2 = hVar.f29111j;
                gVar2 = hVar.f29114m;
                List<e<R>> list2 = hVar.f29116o;
                size2 = list2 != null ? list2.size() : 0;
            }
            return i10 == i12 && i11 == i13 && s2.k.b(obj, obj2) && cls.equals(cls2) && aVar.equals(aVar2) && gVar == gVar2 && size == size2;
        }
        return false;
    }

    @Override // o2.c
    public boolean h() {
        boolean z10;
        synchronized (this.f29104c) {
            z10 = this.f29123v == a.COMPLETE;
        }
        return z10;
    }

    @Override // o2.c
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f29104c) {
            a aVar = this.f29123v;
            z10 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
        }
        return z10;
    }

    @Override // o2.c
    public void j() {
        synchronized (this.f29104c) {
            i();
            this.f29103b.c();
            this.f29121t = s2.f.b();
            if (this.f29109h == null) {
                if (s2.k.t(this.f29112k, this.f29113l)) {
                    this.f29127z = this.f29112k;
                    this.A = this.f29113l;
                }
                y(new q("Received null model"), p() == null ? 5 : 3);
                return;
            }
            a aVar = this.f29123v;
            a aVar2 = a.RUNNING;
            if (aVar != aVar2) {
                if (aVar == a.COMPLETE) {
                    c(this.f29119r, w1.a.MEMORY_CACHE, false);
                    return;
                }
                a aVar3 = a.WAITING_FOR_SIZE;
                this.f29123v = aVar3;
                if (s2.k.t(this.f29112k, this.f29113l)) {
                    d(this.f29112k, this.f29113l);
                } else {
                    this.f29115n.g(this);
                }
                a aVar4 = this.f29123v;
                if ((aVar4 == aVar2 || aVar4 == aVar3) && l()) {
                    this.f29115n.d(q());
                }
                if (D) {
                    t("finished run method in " + s2.f.a(this.f29121t));
                }
                return;
            }
            throw new IllegalArgumentException("Cannot restart a running request");
        }
    }

    @Override // o2.c
    public void pause() {
        synchronized (this.f29104c) {
            if (isRunning()) {
                clear();
            }
        }
    }
}

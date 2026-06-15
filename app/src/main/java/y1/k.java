package y1;

import a2.a;
import a2.h;
import android.util.Log;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import java.util.concurrent.Executor;
import t2.a;
import y1.h;
import y1.p;
/* compiled from: Engine.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class k implements m, h.a, p.a {

    /* renamed from: i  reason: collision with root package name */
    private static final boolean f32929i = Log.isLoggable("Engine", 2);

    /* renamed from: a  reason: collision with root package name */
    private final s f32930a;

    /* renamed from: b  reason: collision with root package name */
    private final o f32931b;

    /* renamed from: c  reason: collision with root package name */
    private final a2.h f32932c;

    /* renamed from: d  reason: collision with root package name */
    private final b f32933d;

    /* renamed from: e  reason: collision with root package name */
    private final y f32934e;

    /* renamed from: f  reason: collision with root package name */
    private final c f32935f;

    /* renamed from: g  reason: collision with root package name */
    private final a f32936g;

    /* renamed from: h  reason: collision with root package name */
    private final y1.a f32937h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Engine.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final h.e f32938a;

        /* renamed from: b  reason: collision with root package name */
        final androidx.core.util.f<h<?>> f32939b = t2.a.d(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, new C0384a());

        /* renamed from: c  reason: collision with root package name */
        private int f32940c;

        /* compiled from: Engine.java */
        /* renamed from: y1.k$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class C0384a implements a.d<h<?>> {
            C0384a() {
            }

            @Override // t2.a.d
            /* renamed from: b */
            public h<?> a() {
                a aVar = a.this;
                return new h<>(aVar.f32938a, aVar.f32939b);
            }
        }

        a(h.e eVar) {
            this.f32938a = eVar;
        }

        <R> h<R> a(com.bumptech.glide.d dVar, Object obj, n nVar, w1.f fVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, j jVar, Map<Class<?>, w1.l<?>> map, boolean z10, boolean z11, boolean z12, w1.h hVar, h.b<R> bVar) {
            h hVar2 = (h) s2.j.d(this.f32939b.b());
            int i12 = this.f32940c;
            this.f32940c = i12 + 1;
            return hVar2.o(dVar, obj, nVar, fVar, i10, i11, cls, cls2, gVar, jVar, map, z10, z11, z12, hVar, bVar, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Engine.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final b2.a f32942a;

        /* renamed from: b  reason: collision with root package name */
        final b2.a f32943b;

        /* renamed from: c  reason: collision with root package name */
        final b2.a f32944c;

        /* renamed from: d  reason: collision with root package name */
        final b2.a f32945d;

        /* renamed from: e  reason: collision with root package name */
        final m f32946e;

        /* renamed from: f  reason: collision with root package name */
        final p.a f32947f;

        /* renamed from: g  reason: collision with root package name */
        final androidx.core.util.f<l<?>> f32948g = t2.a.d(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, new a());

        /* compiled from: Engine.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements a.d<l<?>> {
            a() {
            }

            @Override // t2.a.d
            /* renamed from: b */
            public l<?> a() {
                b bVar = b.this;
                return new l<>(bVar.f32942a, bVar.f32943b, bVar.f32944c, bVar.f32945d, bVar.f32946e, bVar.f32947f, bVar.f32948g);
            }
        }

        b(b2.a aVar, b2.a aVar2, b2.a aVar3, b2.a aVar4, m mVar, p.a aVar5) {
            this.f32942a = aVar;
            this.f32943b = aVar2;
            this.f32944c = aVar3;
            this.f32945d = aVar4;
            this.f32946e = mVar;
            this.f32947f = aVar5;
        }

        <R> l<R> a(w1.f fVar, boolean z10, boolean z11, boolean z12, boolean z13) {
            return ((l) s2.j.d(this.f32948g.b())).l(fVar, z10, z11, z12, z13);
        }
    }

    /* compiled from: Engine.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class c implements h.e {

        /* renamed from: a  reason: collision with root package name */
        private final a.InterfaceC0006a f32950a;

        /* renamed from: b  reason: collision with root package name */
        private volatile a2.a f32951b;

        c(a.InterfaceC0006a interfaceC0006a) {
            this.f32950a = interfaceC0006a;
        }

        @Override // y1.h.e
        public a2.a a() {
            if (this.f32951b == null) {
                synchronized (this) {
                    if (this.f32951b == null) {
                        this.f32951b = this.f32950a.build();
                    }
                    if (this.f32951b == null) {
                        this.f32951b = new a2.b();
                    }
                }
            }
            return this.f32951b;
        }
    }

    /* compiled from: Engine.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        private final l<?> f32952a;

        /* renamed from: b  reason: collision with root package name */
        private final o2.g f32953b;

        d(o2.g gVar, l<?> lVar) {
            this.f32953b = gVar;
            this.f32952a = lVar;
        }

        public void a() {
            synchronized (k.this) {
                this.f32952a.r(this.f32953b);
            }
        }
    }

    public k(a2.h hVar, a.InterfaceC0006a interfaceC0006a, b2.a aVar, b2.a aVar2, b2.a aVar3, b2.a aVar4, boolean z10) {
        this(hVar, interfaceC0006a, aVar, aVar2, aVar3, aVar4, null, null, null, null, null, null, z10);
    }

    private p<?> e(w1.f fVar) {
        v<?> e8 = this.f32932c.e(fVar);
        if (e8 == null) {
            return null;
        }
        if (e8 instanceof p) {
            return (p) e8;
        }
        return new p<>(e8, true, true, fVar, this);
    }

    private p<?> g(w1.f fVar) {
        p<?> e8 = this.f32937h.e(fVar);
        if (e8 != null) {
            e8.c();
        }
        return e8;
    }

    private p<?> h(w1.f fVar) {
        p<?> e8 = e(fVar);
        if (e8 != null) {
            e8.c();
            this.f32937h.a(fVar, e8);
        }
        return e8;
    }

    private p<?> i(n nVar, boolean z10, long j10) {
        if (z10) {
            p<?> g10 = g(nVar);
            if (g10 != null) {
                if (f32929i) {
                    j("Loaded resource from active resources", j10, nVar);
                }
                return g10;
            }
            p<?> h10 = h(nVar);
            if (h10 != null) {
                if (f32929i) {
                    j("Loaded resource from cache", j10, nVar);
                }
                return h10;
            }
            return null;
        }
        return null;
    }

    private static void j(String str, long j10, w1.f fVar) {
        Log.v("Engine", str + " in " + s2.f.a(j10) + "ms, key: " + fVar);
    }

    private <R> d l(com.bumptech.glide.d dVar, Object obj, w1.f fVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, j jVar, Map<Class<?>, w1.l<?>> map, boolean z10, boolean z11, w1.h hVar, boolean z12, boolean z13, boolean z14, boolean z15, o2.g gVar2, Executor executor, n nVar, long j10) {
        l<?> a10 = this.f32930a.a(nVar, z15);
        if (a10 != null) {
            a10.e(gVar2, executor);
            if (f32929i) {
                j("Added to existing load", j10, nVar);
            }
            return new d(gVar2, a10);
        }
        l<R> a11 = this.f32933d.a(nVar, z12, z13, z14, z15);
        h<R> a12 = this.f32936g.a(dVar, obj, nVar, fVar, i10, i11, cls, cls2, gVar, jVar, map, z10, z11, z15, hVar, a11);
        this.f32930a.c(nVar, a11);
        a11.e(gVar2, executor);
        a11.s(a12);
        if (f32929i) {
            j("Started new load", j10, nVar);
        }
        return new d(gVar2, a11);
    }

    @Override // a2.h.a
    public void a(v<?> vVar) {
        this.f32934e.a(vVar, true);
    }

    @Override // y1.m
    public synchronized void b(l<?> lVar, w1.f fVar, p<?> pVar) {
        if (pVar != null) {
            if (pVar.e()) {
                this.f32937h.a(fVar, pVar);
            }
        }
        this.f32930a.d(fVar, lVar);
    }

    @Override // y1.m
    public synchronized void c(l<?> lVar, w1.f fVar) {
        this.f32930a.d(fVar, lVar);
    }

    @Override // y1.p.a
    public void d(w1.f fVar, p<?> pVar) {
        this.f32937h.d(fVar);
        if (pVar.e()) {
            this.f32932c.c(fVar, pVar);
        } else {
            this.f32934e.a(pVar, false);
        }
    }

    public <R> d f(com.bumptech.glide.d dVar, Object obj, w1.f fVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, j jVar, Map<Class<?>, w1.l<?>> map, boolean z10, boolean z11, w1.h hVar, boolean z12, boolean z13, boolean z14, boolean z15, o2.g gVar2, Executor executor) {
        long b10 = f32929i ? s2.f.b() : 0L;
        n a10 = this.f32931b.a(obj, fVar, i10, i11, map, cls, cls2, hVar);
        synchronized (this) {
            p<?> i12 = i(a10, z12, b10);
            if (i12 == null) {
                return l(dVar, obj, fVar, i10, i11, cls, cls2, gVar, jVar, map, z10, z11, hVar, z12, z13, z14, z15, gVar2, executor, a10, b10);
            }
            gVar2.c(i12, w1.a.MEMORY_CACHE, false);
            return null;
        }
    }

    public void k(v<?> vVar) {
        if (vVar instanceof p) {
            ((p) vVar).f();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    k(a2.h hVar, a.InterfaceC0006a interfaceC0006a, b2.a aVar, b2.a aVar2, b2.a aVar3, b2.a aVar4, s sVar, o oVar, y1.a aVar5, b bVar, a aVar6, y yVar, boolean z10) {
        this.f32932c = hVar;
        c cVar = new c(interfaceC0006a);
        this.f32935f = cVar;
        y1.a aVar7 = aVar5 == null ? new y1.a(z10) : aVar5;
        this.f32937h = aVar7;
        aVar7.f(this);
        this.f32931b = oVar == null ? new o() : oVar;
        this.f32930a = sVar == null ? new s() : sVar;
        this.f32933d = bVar == null ? new b(aVar, aVar2, aVar3, aVar4, this, this) : bVar;
        this.f32936g = aVar6 == null ? new a(cVar) : aVar6;
        this.f32934e = yVar == null ? new y() : yVar;
        hVar.d(this);
    }
}

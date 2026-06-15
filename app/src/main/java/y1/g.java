package y1;

import c2.n;
import com.bumptech.glide.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import y1.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DecodeHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g<Transcode> {

    /* renamed from: a  reason: collision with root package name */
    private final List<n.a<?>> f32853a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final List<w1.f> f32854b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private com.bumptech.glide.d f32855c;

    /* renamed from: d  reason: collision with root package name */
    private Object f32856d;

    /* renamed from: e  reason: collision with root package name */
    private int f32857e;

    /* renamed from: f  reason: collision with root package name */
    private int f32858f;

    /* renamed from: g  reason: collision with root package name */
    private Class<?> f32859g;

    /* renamed from: h  reason: collision with root package name */
    private h.e f32860h;

    /* renamed from: i  reason: collision with root package name */
    private w1.h f32861i;

    /* renamed from: j  reason: collision with root package name */
    private Map<Class<?>, w1.l<?>> f32862j;

    /* renamed from: k  reason: collision with root package name */
    private Class<Transcode> f32863k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f32864l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f32865m;

    /* renamed from: n  reason: collision with root package name */
    private w1.f f32866n;

    /* renamed from: o  reason: collision with root package name */
    private com.bumptech.glide.g f32867o;

    /* renamed from: p  reason: collision with root package name */
    private j f32868p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f32869q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f32870r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f32855c = null;
        this.f32856d = null;
        this.f32866n = null;
        this.f32859g = null;
        this.f32863k = null;
        this.f32861i = null;
        this.f32867o = null;
        this.f32862j = null;
        this.f32868p = null;
        this.f32853a.clear();
        this.f32864l = false;
        this.f32854b.clear();
        this.f32865m = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z1.b b() {
        return this.f32855c.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<w1.f> c() {
        if (!this.f32865m) {
            this.f32865m = true;
            this.f32854b.clear();
            List<n.a<?>> g10 = g();
            int size = g10.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.a<?> aVar = g10.get(i10);
                if (!this.f32854b.contains(aVar.f5372a)) {
                    this.f32854b.add(aVar.f5372a);
                }
                for (int i11 = 0; i11 < aVar.f5373b.size(); i11++) {
                    if (!this.f32854b.contains(aVar.f5373b.get(i11))) {
                        this.f32854b.add(aVar.f5373b.get(i11));
                    }
                }
            }
        }
        return this.f32854b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a2.a d() {
        return this.f32860h.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j e() {
        return this.f32868p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f32858f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<n.a<?>> g() {
        if (!this.f32864l) {
            this.f32864l = true;
            this.f32853a.clear();
            List i10 = this.f32855c.i().i(this.f32856d);
            int size = i10.size();
            for (int i11 = 0; i11 < size; i11++) {
                n.a<?> b10 = ((c2.n) i10.get(i11)).b(this.f32856d, this.f32857e, this.f32858f, this.f32861i);
                if (b10 != null) {
                    this.f32853a.add(b10);
                }
            }
        }
        return this.f32853a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <Data> t<Data, ?, Transcode> h(Class<Data> cls) {
        return this.f32855c.i().h(cls, this.f32859g, this.f32863k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Class<?> i() {
        return this.f32856d.getClass();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<c2.n<File, ?>> j(File file) throws i.c {
        return this.f32855c.i().i(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w1.h k() {
        return this.f32861i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.bumptech.glide.g l() {
        return this.f32867o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Class<?>> m() {
        return this.f32855c.i().j(this.f32856d.getClass(), this.f32859g, this.f32863k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <Z> w1.k<Z> n(v<Z> vVar) {
        return this.f32855c.i().k(vVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w1.f o() {
        return this.f32866n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <X> w1.d<X> p(X x10) throws i.e {
        return this.f32855c.i().m(x10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Class<?> q() {
        return (Class<Transcode>) this.f32863k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <Z> w1.l<Z> r(Class<Z> cls) {
        w1.l<Z> lVar = (w1.l<Z>) this.f32862j.get(cls);
        if (lVar == null) {
            Iterator<Map.Entry<Class<?>, w1.l<?>>> it = this.f32862j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, w1.l<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    lVar = (w1.l<Z>) next.getValue();
                    break;
                }
            }
        }
        if (lVar == null) {
            if (this.f32862j.isEmpty() && this.f32869q) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return e2.c.c();
        }
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int s() {
        return this.f32857e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean t(Class<?> cls) {
        return h(cls) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public <R> void u(com.bumptech.glide.d dVar, Object obj, w1.f fVar, int i10, int i11, j jVar, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, w1.h hVar, Map<Class<?>, w1.l<?>> map, boolean z10, boolean z11, h.e eVar) {
        this.f32855c = dVar;
        this.f32856d = obj;
        this.f32866n = fVar;
        this.f32857e = i10;
        this.f32858f = i11;
        this.f32868p = jVar;
        this.f32859g = cls;
        this.f32860h = eVar;
        this.f32863k = cls2;
        this.f32867o = gVar;
        this.f32861i = hVar;
        this.f32862j = map;
        this.f32869q = z10;
        this.f32870r = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean v(v<?> vVar) {
        return this.f32855c.i().n(vVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean w() {
        return this.f32870r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x(w1.f fVar) {
        List<n.a<?>> g10 = g();
        int size = g10.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (g10.get(i10).f5372a.equals(fVar)) {
                return true;
            }
        }
        return false;
    }
}

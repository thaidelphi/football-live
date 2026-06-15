package com.bumptech.glide;

import c2.n;
import c2.o;
import c2.p;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import y1.t;
import y1.v;
/* compiled from: Registry.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final p f10300a;

    /* renamed from: b  reason: collision with root package name */
    private final n2.a f10301b;

    /* renamed from: c  reason: collision with root package name */
    private final n2.e f10302c;

    /* renamed from: d  reason: collision with root package name */
    private final n2.f f10303d;

    /* renamed from: e  reason: collision with root package name */
    private final com.bumptech.glide.load.data.f f10304e;

    /* renamed from: f  reason: collision with root package name */
    private final k2.f f10305f;

    /* renamed from: g  reason: collision with root package name */
    private final n2.b f10306g;

    /* renamed from: h  reason: collision with root package name */
    private final n2.d f10307h = new n2.d();

    /* renamed from: i  reason: collision with root package name */
    private final n2.c f10308i = new n2.c();

    /* renamed from: j  reason: collision with root package name */
    private final androidx.core.util.f<List<Throwable>> f10309j;

    /* compiled from: Registry.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* compiled from: Registry.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    /* compiled from: Registry.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c extends a {
        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> c(M m7, List<n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m7);
        }

        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* compiled from: Registry.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* compiled from: Registry.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public i() {
        androidx.core.util.f<List<Throwable>> e8 = t2.a.e();
        this.f10309j = e8;
        this.f10300a = new p(e8);
        this.f10301b = new n2.a();
        this.f10302c = new n2.e();
        this.f10303d = new n2.f();
        this.f10304e = new com.bumptech.glide.load.data.f();
        this.f10305f = new k2.f();
        this.f10306g = new n2.b();
        r(Arrays.asList("Gif", "Bitmap", "BitmapDrawable"));
    }

    private <Data, TResource, Transcode> List<y1.i<Data, TResource, Transcode>> f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f10302c.d(cls, cls2)) {
            for (Class cls5 : this.f10305f.b(cls4, cls3)) {
                arrayList.add(new y1.i(cls, cls4, cls5, this.f10302c.b(cls, cls4), this.f10305f.a(cls4, cls5), this.f10309j));
            }
        }
        return arrayList;
    }

    public <Model, Data> i a(Class<Model> cls, Class<Data> cls2, o<Model, Data> oVar) {
        this.f10300a.a(cls, cls2, oVar);
        return this;
    }

    public <Data, TResource> i b(Class<Data> cls, Class<TResource> cls2, w1.j<Data, TResource> jVar) {
        e("legacy_append", cls, cls2, jVar);
        return this;
    }

    public <Data> i c(Class<Data> cls, w1.d<Data> dVar) {
        this.f10301b.a(cls, dVar);
        return this;
    }

    public <TResource> i d(Class<TResource> cls, w1.k<TResource> kVar) {
        this.f10303d.a(cls, kVar);
        return this;
    }

    public <Data, TResource> i e(String str, Class<Data> cls, Class<TResource> cls2, w1.j<Data, TResource> jVar) {
        this.f10302c.a(str, jVar, cls, cls2);
        return this;
    }

    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> b10 = this.f10306g.b();
        if (b10.isEmpty()) {
            throw new b();
        }
        return b10;
    }

    public <Data, TResource, Transcode> t<Data, TResource, Transcode> h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        t<Data, TResource, Transcode> a10 = this.f10308i.a(cls, cls2, cls3);
        if (this.f10308i.c(a10)) {
            return null;
        }
        if (a10 == null) {
            List<y1.i<Data, TResource, Transcode>> f10 = f(cls, cls2, cls3);
            a10 = f10.isEmpty() ? null : new t<>(cls, cls2, cls3, f10, this.f10309j);
            this.f10308i.d(cls, cls2, cls3, a10);
        }
        return a10;
    }

    public <Model> List<n<Model, ?>> i(Model model) {
        return this.f10300a.d(model);
    }

    public <Model, TResource, Transcode> List<Class<?>> j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a10 = this.f10307h.a(cls, cls2, cls3);
        if (a10 == null) {
            a10 = new ArrayList<>();
            for (Class<?> cls4 : this.f10300a.c(cls)) {
                for (Class<?> cls5 : this.f10302c.d(cls4, cls2)) {
                    if (!this.f10305f.b(cls5, cls3).isEmpty() && !a10.contains(cls5)) {
                        a10.add(cls5);
                    }
                }
            }
            this.f10307h.b(cls, cls2, cls3, Collections.unmodifiableList(a10));
        }
        return a10;
    }

    public <X> w1.k<X> k(v<X> vVar) throws d {
        w1.k<X> b10 = this.f10303d.b(vVar.b());
        if (b10 != null) {
            return b10;
        }
        throw new d(vVar.b());
    }

    public <X> com.bumptech.glide.load.data.e<X> l(X x10) {
        return this.f10304e.a(x10);
    }

    public <X> w1.d<X> m(X x10) throws e {
        w1.d<X> b10 = this.f10301b.b(x10.getClass());
        if (b10 != null) {
            return b10;
        }
        throw new e(x10.getClass());
    }

    public boolean n(v<?> vVar) {
        return this.f10303d.b(vVar.b()) != null;
    }

    public i o(ImageHeaderParser imageHeaderParser) {
        this.f10306g.a(imageHeaderParser);
        return this;
    }

    public i p(e.a<?> aVar) {
        this.f10304e.b(aVar);
        return this;
    }

    public <TResource, Transcode> i q(Class<TResource> cls, Class<Transcode> cls2, k2.e<TResource, Transcode> eVar) {
        this.f10305f.c(cls, cls2, eVar);
        return this;
    }

    public final i r(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        for (String str : list) {
            arrayList.add(str);
        }
        arrayList.add("legacy_append");
        this.f10302c.e(arrayList);
        return this;
    }
}

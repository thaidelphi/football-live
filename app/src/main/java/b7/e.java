package b7;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
/* compiled from: Gson.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class e {

    /* renamed from: v  reason: collision with root package name */
    private static final g7.a<?> f5245v = g7.a.a(Object.class);

    /* renamed from: a  reason: collision with root package name */
    private final ThreadLocal<Map<g7.a<?>, f<?>>> f5246a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<g7.a<?>, t<?>> f5247b;

    /* renamed from: c  reason: collision with root package name */
    private final d7.c f5248c;

    /* renamed from: d  reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f5249d;

    /* renamed from: e  reason: collision with root package name */
    final List<u> f5250e;

    /* renamed from: f  reason: collision with root package name */
    final Excluder f5251f;

    /* renamed from: g  reason: collision with root package name */
    final b7.d f5252g;

    /* renamed from: h  reason: collision with root package name */
    final Map<Type, b7.f<?>> f5253h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f5254i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f5255j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f5256k;

    /* renamed from: l  reason: collision with root package name */
    final boolean f5257l;

    /* renamed from: m  reason: collision with root package name */
    final boolean f5258m;

    /* renamed from: n  reason: collision with root package name */
    final boolean f5259n;

    /* renamed from: o  reason: collision with root package name */
    final boolean f5260o;

    /* renamed from: p  reason: collision with root package name */
    final String f5261p;

    /* renamed from: q  reason: collision with root package name */
    final int f5262q;

    /* renamed from: r  reason: collision with root package name */
    final int f5263r;

    /* renamed from: s  reason: collision with root package name */
    final s f5264s;

    /* renamed from: t  reason: collision with root package name */
    final List<u> f5265t;

    /* renamed from: u  reason: collision with root package name */
    final List<u> f5266u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a extends t<Number> {
        a() {
        }

        @Override // b7.t
        /* renamed from: e */
        public Double b(h7.a aVar) throws IOException {
            if (aVar.C0() == h7.b.NULL) {
                aVar.n0();
                return null;
            }
            return Double.valueOf(aVar.L());
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.K();
                return;
            }
            e.d(number.doubleValue());
            cVar.G0(number);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b extends t<Number> {
        b() {
        }

        @Override // b7.t
        /* renamed from: e */
        public Float b(h7.a aVar) throws IOException {
            if (aVar.C0() == h7.b.NULL) {
                aVar.n0();
                return null;
            }
            return Float.valueOf((float) aVar.L());
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.K();
                return;
            }
            e.d(number.floatValue());
            cVar.G0(number);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class c extends t<Number> {
        c() {
        }

        @Override // b7.t
        /* renamed from: e */
        public Number b(h7.a aVar) throws IOException {
            if (aVar.C0() == h7.b.NULL) {
                aVar.n0();
                return null;
            }
            return Long.valueOf(aVar.R());
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.K();
            } else {
                cVar.H0(number.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class d extends t<AtomicLong> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f5269a;

        d(t tVar) {
            this.f5269a = tVar;
        }

        @Override // b7.t
        /* renamed from: e */
        public AtomicLong b(h7.a aVar) throws IOException {
            return new AtomicLong(((Number) this.f5269a.b(aVar)).longValue());
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, AtomicLong atomicLong) throws IOException {
            this.f5269a.d(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* renamed from: b7.e$e  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class C0104e extends t<AtomicLongArray> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f5270a;

        C0104e(t tVar) {
            this.f5270a = tVar;
        }

        @Override // b7.t
        /* renamed from: e */
        public AtomicLongArray b(h7.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.E()) {
                arrayList.add(Long.valueOf(((Number) this.f5270a.b(aVar)).longValue()));
            }
            aVar.t();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
            }
            return atomicLongArray;
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, AtomicLongArray atomicLongArray) throws IOException {
            cVar.f();
            int length = atomicLongArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                this.f5270a.d(cVar, Long.valueOf(atomicLongArray.get(i10)));
            }
            cVar.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class f<T> extends t<T> {

        /* renamed from: a  reason: collision with root package name */
        private t<T> f5271a;

        f() {
        }

        @Override // b7.t
        public T b(h7.a aVar) throws IOException {
            t<T> tVar = this.f5271a;
            if (tVar != null) {
                return tVar.b(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // b7.t
        public void d(h7.c cVar, T t10) throws IOException {
            t<T> tVar = this.f5271a;
            if (tVar != null) {
                tVar.d(cVar, t10);
                return;
            }
            throw new IllegalStateException();
        }

        public void e(t<T> tVar) {
            if (this.f5271a == null) {
                this.f5271a = tVar;
                return;
            }
            throw new AssertionError();
        }
    }

    public e() {
        this(Excluder.f15098g, b7.c.f5238a, Collections.emptyMap(), false, false, false, true, false, false, false, s.f5277a, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    private static void a(Object obj, h7.a aVar) {
        if (obj != null) {
            try {
                if (aVar.C0() == h7.b.END_DOCUMENT) {
                    return;
                }
                throw new k("JSON document was not fully consumed.");
            } catch (h7.d e8) {
                throw new r(e8);
            } catch (IOException e10) {
                throw new k(e10);
            }
        }
    }

    private static t<AtomicLong> b(t<Number> tVar) {
        return new d(tVar).a();
    }

    private static t<AtomicLongArray> c(t<Number> tVar) {
        return new C0104e(tVar).a();
    }

    static void d(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private t<Number> e(boolean z10) {
        if (z10) {
            return TypeAdapters.f15184v;
        }
        return new a();
    }

    private t<Number> f(boolean z10) {
        if (z10) {
            return TypeAdapters.f15183u;
        }
        return new b();
    }

    private static t<Number> n(s sVar) {
        if (sVar == s.f5277a) {
            return TypeAdapters.f15182t;
        }
        return new c();
    }

    public <T> T g(h7.a aVar, Type type) throws k, r {
        boolean F = aVar.F();
        boolean z10 = true;
        aVar.J0(true);
        try {
            try {
                try {
                    aVar.C0();
                    z10 = false;
                    T b10 = k(g7.a.b(type)).b(aVar);
                    aVar.J0(F);
                    return b10;
                } catch (IOException e8) {
                    throw new r(e8);
                }
            } catch (EOFException e10) {
                if (z10) {
                    aVar.J0(F);
                    return null;
                }
                throw new r(e10);
            } catch (IllegalStateException e11) {
                throw new r(e11);
            }
        } catch (Throwable th) {
            aVar.J0(F);
            throw th;
        }
    }

    public <T> T h(Reader reader, Type type) throws k, r {
        h7.a o10 = o(reader);
        T t10 = (T) g(o10, type);
        a(t10, o10);
        return t10;
    }

    public <T> T i(String str, Class<T> cls) throws r {
        return (T) d7.i.c(cls).cast(j(str, cls));
    }

    public <T> T j(String str, Type type) throws r {
        if (str == null) {
            return null;
        }
        return (T) h(new StringReader(str), type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> t<T> k(g7.a<T> aVar) {
        t<T> tVar = (t<T>) this.f5247b.get(aVar == null ? f5245v : aVar);
        if (tVar != null) {
            return tVar;
        }
        Map<g7.a<?>, f<?>> map = this.f5246a.get();
        boolean z10 = false;
        if (map == null) {
            map = new HashMap<>();
            this.f5246a.set(map);
            z10 = true;
        }
        f<?> fVar = map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            f<?> fVar2 = new f<>();
            map.put(aVar, fVar2);
            for (u uVar : this.f5250e) {
                t tVar2 = (t<T>) uVar.c(this, aVar);
                if (tVar2 != null) {
                    fVar2.e(tVar2);
                    this.f5247b.put(aVar, tVar2);
                    return tVar2;
                }
            }
            throw new IllegalArgumentException("GSON cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z10) {
                this.f5246a.remove();
            }
        }
    }

    public <T> t<T> l(Class<T> cls) {
        return k(g7.a.a(cls));
    }

    public <T> t<T> m(u uVar, g7.a<T> aVar) {
        if (!this.f5250e.contains(uVar)) {
            uVar = this.f5249d;
        }
        boolean z10 = false;
        for (u uVar2 : this.f5250e) {
            if (z10) {
                t<T> c10 = uVar2.c(this, aVar);
                if (c10 != null) {
                    return c10;
                }
            } else if (uVar2 == uVar) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public h7.a o(Reader reader) {
        h7.a aVar = new h7.a(reader);
        aVar.J0(this.f5259n);
        return aVar;
    }

    public h7.c p(Writer writer) throws IOException {
        if (this.f5256k) {
            writer.write(")]}'\n");
        }
        h7.c cVar = new h7.c(writer);
        if (this.f5258m) {
            cVar.n0("  ");
        }
        cVar.y0(this.f5254i);
        return cVar;
    }

    public String q(j jVar) {
        StringWriter stringWriter = new StringWriter();
        u(jVar, stringWriter);
        return stringWriter.toString();
    }

    public String r(Object obj) {
        if (obj == null) {
            return q(l.f5273a);
        }
        return s(obj, obj.getClass());
    }

    public String s(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        w(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void t(j jVar, h7.c cVar) throws k {
        boolean F = cVar.F();
        cVar.o0(true);
        boolean E = cVar.E();
        cVar.X(this.f5257l);
        boolean z10 = cVar.z();
        cVar.y0(this.f5254i);
        try {
            try {
                d7.j.b(jVar, cVar);
            } catch (IOException e8) {
                throw new k(e8);
            }
        } finally {
            cVar.o0(F);
            cVar.X(E);
            cVar.y0(z10);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f5254i + ",factories:" + this.f5250e + ",instanceCreators:" + this.f5248c + "}";
    }

    public void u(j jVar, Appendable appendable) throws k {
        try {
            t(jVar, p(d7.j.c(appendable)));
        } catch (IOException e8) {
            throw new k(e8);
        }
    }

    public void v(Object obj, Type type, h7.c cVar) throws k {
        t k10 = k(g7.a.b(type));
        boolean F = cVar.F();
        cVar.o0(true);
        boolean E = cVar.E();
        cVar.X(this.f5257l);
        boolean z10 = cVar.z();
        cVar.y0(this.f5254i);
        try {
            try {
                k10.d(cVar, obj);
            } catch (IOException e8) {
                throw new k(e8);
            }
        } finally {
            cVar.o0(F);
            cVar.X(E);
            cVar.y0(z10);
        }
    }

    public void w(Object obj, Type type, Appendable appendable) throws k {
        try {
            v(obj, type, p(d7.j.c(appendable)));
        } catch (IOException e8) {
            throw new k(e8);
        }
    }

    e(Excluder excluder, b7.d dVar, Map<Type, b7.f<?>> map, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, s sVar, String str, int i10, int i11, List<u> list, List<u> list2, List<u> list3) {
        this.f5246a = new ThreadLocal<>();
        this.f5247b = new ConcurrentHashMap();
        this.f5251f = excluder;
        this.f5252g = dVar;
        this.f5253h = map;
        d7.c cVar = new d7.c(map);
        this.f5248c = cVar;
        this.f5254i = z10;
        this.f5255j = z11;
        this.f5256k = z12;
        this.f5257l = z13;
        this.f5258m = z14;
        this.f5259n = z15;
        this.f5260o = z16;
        this.f5264s = sVar;
        this.f5261p = str;
        this.f5262q = i10;
        this.f5263r = i11;
        this.f5265t = list;
        this.f5266u = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.Y);
        arrayList.add(ObjectTypeAdapter.f15126b);
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.D);
        arrayList.add(TypeAdapters.f15175m);
        arrayList.add(TypeAdapters.f15169g);
        arrayList.add(TypeAdapters.f15171i);
        arrayList.add(TypeAdapters.f15173k);
        t<Number> n10 = n(sVar);
        arrayList.add(TypeAdapters.b(Long.TYPE, Long.class, n10));
        arrayList.add(TypeAdapters.b(Double.TYPE, Double.class, e(z16)));
        arrayList.add(TypeAdapters.b(Float.TYPE, Float.class, f(z16)));
        arrayList.add(TypeAdapters.f15186x);
        arrayList.add(TypeAdapters.f15177o);
        arrayList.add(TypeAdapters.f15179q);
        arrayList.add(TypeAdapters.a(AtomicLong.class, b(n10)));
        arrayList.add(TypeAdapters.a(AtomicLongArray.class, c(n10)));
        arrayList.add(TypeAdapters.f15181s);
        arrayList.add(TypeAdapters.f15188z);
        arrayList.add(TypeAdapters.F);
        arrayList.add(TypeAdapters.H);
        arrayList.add(TypeAdapters.a(BigDecimal.class, TypeAdapters.B));
        arrayList.add(TypeAdapters.a(BigInteger.class, TypeAdapters.C));
        arrayList.add(TypeAdapters.J);
        arrayList.add(TypeAdapters.L);
        arrayList.add(TypeAdapters.P);
        arrayList.add(TypeAdapters.R);
        arrayList.add(TypeAdapters.W);
        arrayList.add(TypeAdapters.N);
        arrayList.add(TypeAdapters.f15166d);
        arrayList.add(DateTypeAdapter.f15117b);
        arrayList.add(TypeAdapters.U);
        arrayList.add(TimeTypeAdapter.f15148b);
        arrayList.add(SqlDateTypeAdapter.f15146b);
        arrayList.add(TypeAdapters.S);
        arrayList.add(ArrayTypeAdapter.f15111c);
        arrayList.add(TypeAdapters.f15164b);
        arrayList.add(new CollectionTypeAdapterFactory(cVar));
        arrayList.add(new MapTypeAdapterFactory(cVar, z11));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(cVar);
        this.f5249d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.Z);
        arrayList.add(new ReflectiveTypeAdapterFactory(cVar, dVar, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f5250e = Collections.unmodifiableList(arrayList);
    }
}

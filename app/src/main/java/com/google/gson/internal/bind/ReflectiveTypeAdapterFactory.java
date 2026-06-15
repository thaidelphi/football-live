package com.google.gson.internal.bind;

import b7.d;
import b7.e;
import b7.r;
import b7.t;
import b7.u;
import com.google.gson.internal.Excluder;
import d7.g;
import d7.i;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ReflectiveTypeAdapterFactory implements u {

    /* renamed from: a  reason: collision with root package name */
    private final d7.c f15129a;

    /* renamed from: b  reason: collision with root package name */
    private final d f15130b;

    /* renamed from: c  reason: collision with root package name */
    private final Excluder f15131c;

    /* renamed from: d  reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f15132d;

    /* renamed from: e  reason: collision with root package name */
    private final f7.b f15133e = f7.b.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a extends c {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Field f15134d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f15135e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ t f15136f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e f15137g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g7.a f15138h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f15139i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z10, boolean z11, Field field, boolean z12, t tVar, e eVar, g7.a aVar, boolean z13) {
            super(str, z10, z11);
            this.f15134d = field;
            this.f15135e = z12;
            this.f15136f = tVar;
            this.f15137g = eVar;
            this.f15138h = aVar;
            this.f15139i = z13;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c
        void a(h7.a aVar, Object obj) throws IOException, IllegalAccessException {
            Object b10 = this.f15136f.b(aVar);
            if (b10 == null && this.f15139i) {
                return;
            }
            this.f15134d.set(obj, b10);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c
        void b(h7.c cVar, Object obj) throws IOException, IllegalAccessException {
            (this.f15135e ? this.f15136f : new com.google.gson.internal.bind.c(this.f15137g, this.f15136f, this.f15138h.e())).d(cVar, this.f15134d.get(obj));
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c
        public boolean c(Object obj) throws IOException, IllegalAccessException {
            return this.f15144b && this.f15134d.get(obj) != obj;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b<T> extends t<T> {

        /* renamed from: a  reason: collision with root package name */
        private final g<T> f15141a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, c> f15142b;

        b(g<T> gVar, Map<String, c> map) {
            this.f15141a = gVar;
            this.f15142b = map;
        }

        @Override // b7.t
        public T b(h7.a aVar) throws IOException {
            if (aVar.C0() == h7.b.NULL) {
                aVar.n0();
                return null;
            }
            T a10 = this.f15141a.a();
            try {
                aVar.b();
                while (aVar.E()) {
                    c cVar = this.f15142b.get(aVar.S());
                    if (cVar != null && cVar.f15145c) {
                        cVar.a(aVar, a10);
                    }
                    aVar.O0();
                }
                aVar.w();
                return a10;
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            } catch (IllegalStateException e10) {
                throw new r(e10);
            }
        }

        @Override // b7.t
        public void d(h7.c cVar, T t10) throws IOException {
            if (t10 == null) {
                cVar.K();
                return;
            }
            cVar.j();
            try {
                for (c cVar2 : this.f15142b.values()) {
                    if (cVar2.c(t10)) {
                        cVar.G(cVar2.f15143a);
                        cVar2.b(cVar, t10);
                    }
                }
                cVar.w();
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final String f15143a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f15144b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f15145c;

        protected c(String str, boolean z10, boolean z11) {
            this.f15143a = str;
            this.f15144b = z10;
            this.f15145c = z11;
        }

        abstract void a(h7.a aVar, Object obj) throws IOException, IllegalAccessException;

        abstract void b(h7.c cVar, Object obj) throws IOException, IllegalAccessException;

        abstract boolean c(Object obj) throws IOException, IllegalAccessException;
    }

    public ReflectiveTypeAdapterFactory(d7.c cVar, d dVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f15129a = cVar;
        this.f15130b = dVar;
        this.f15131c = excluder;
        this.f15132d = jsonAdapterAnnotationTypeAdapterFactory;
    }

    private c a(e eVar, Field field, String str, g7.a<?> aVar, boolean z10, boolean z11) {
        boolean b10 = i.b(aVar.c());
        c7.b bVar = (c7.b) field.getAnnotation(c7.b.class);
        t<?> a10 = bVar != null ? this.f15132d.a(this.f15129a, eVar, aVar, bVar) : null;
        boolean z12 = a10 != null;
        if (a10 == null) {
            a10 = eVar.k(aVar);
        }
        return new a(str, z10, z11, field, z12, a10, eVar, aVar, b10);
    }

    static boolean d(Field field, boolean z10, Excluder excluder) {
        return (excluder.e(field.getType(), z10) || excluder.h(field, z10)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    private Map<String, c> e(e eVar, g7.a<?> aVar, Class<?> cls) {
        c cVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type e8 = aVar.e();
        g7.a<?> aVar2 = aVar;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z10 = false;
            int i10 = 0;
            while (i10 < length) {
                Field field = declaredFields[i10];
                boolean b10 = b(field, true);
                boolean b11 = b(field, z10);
                if (b10 || b11) {
                    this.f15133e.b(field);
                    Type p10 = d7.b.p(aVar2.e(), cls2, field.getGenericType());
                    List<String> f10 = f(field);
                    int size = f10.size();
                    c cVar2 = null;
                    int i11 = z10;
                    while (i11 < size) {
                        String str = f10.get(i11);
                        boolean z11 = i11 != 0 ? z10 : b10;
                        int i12 = i11;
                        c cVar3 = cVar2;
                        int i13 = size;
                        List<String> list = f10;
                        Field field2 = field;
                        cVar2 = cVar3 == null ? (c) linkedHashMap.put(str, a(eVar, field, str, g7.a.b(p10), z11, b11)) : cVar3;
                        b10 = z11;
                        f10 = list;
                        size = i13;
                        field = field2;
                        z10 = false;
                        i11 = i12 + 1;
                    }
                    if (cVar2 != null) {
                        throw new IllegalArgumentException(e8 + " declares multiple JSON fields named " + cVar.f15143a);
                    }
                }
                i10++;
                z10 = false;
            }
            aVar2 = g7.a.b(d7.b.p(aVar2.e(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.c();
        }
        return linkedHashMap;
    }

    private List<String> f(Field field) {
        c7.c cVar = (c7.c) field.getAnnotation(c7.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f15130b.a(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    public boolean b(Field field, boolean z10) {
        return d(field, z10, this.f15131c);
    }

    @Override // b7.u
    public <T> t<T> c(e eVar, g7.a<T> aVar) {
        Class<? super T> c10 = aVar.c();
        if (Object.class.isAssignableFrom(c10)) {
            return new b(this.f15129a.a(aVar), e(eVar, aVar, c10));
        }
        return null;
    }
}

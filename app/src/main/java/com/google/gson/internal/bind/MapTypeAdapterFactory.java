package com.google.gson.internal.bind;

import b7.e;
import b7.j;
import b7.o;
import b7.r;
import b7.t;
import b7.u;
import d7.d;
import d7.g;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class MapTypeAdapterFactory implements u {

    /* renamed from: a  reason: collision with root package name */
    private final d7.c f15120a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f15121b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private final class a<K, V> extends t<Map<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private final t<K> f15122a;

        /* renamed from: b  reason: collision with root package name */
        private final t<V> f15123b;

        /* renamed from: c  reason: collision with root package name */
        private final g<? extends Map<K, V>> f15124c;

        public a(e eVar, Type type, t<K> tVar, Type type2, t<V> tVar2, g<? extends Map<K, V>> gVar) {
            this.f15122a = new c(eVar, tVar, type);
            this.f15123b = new c(eVar, tVar2, type2);
            this.f15124c = gVar;
        }

        private String e(j jVar) {
            if (jVar.g()) {
                o c10 = jVar.c();
                if (c10.q()) {
                    return String.valueOf(c10.m());
                }
                if (c10.o()) {
                    return Boolean.toString(c10.h());
                }
                if (c10.s()) {
                    return c10.n();
                }
                throw new AssertionError();
            } else if (jVar.e()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        @Override // b7.t
        /* renamed from: f */
        public Map<K, V> b(h7.a aVar) throws IOException {
            h7.b C0 = aVar.C0();
            if (C0 == h7.b.NULL) {
                aVar.n0();
                return null;
            }
            Map<K, V> a10 = this.f15124c.a();
            if (C0 == h7.b.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.E()) {
                    aVar.a();
                    K b10 = this.f15122a.b(aVar);
                    if (a10.put(b10, this.f15123b.b(aVar)) == null) {
                        aVar.t();
                    } else {
                        throw new r("duplicate key: " + b10);
                    }
                }
                aVar.t();
            } else {
                aVar.b();
                while (aVar.E()) {
                    d.f24364a.a(aVar);
                    K b11 = this.f15122a.b(aVar);
                    if (a10.put(b11, this.f15123b.b(aVar)) != null) {
                        throw new r("duplicate key: " + b11);
                    }
                }
                aVar.w();
            }
            return a10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // b7.t
        /* renamed from: g */
        public void d(h7.c cVar, Map<K, V> map) throws IOException {
            if (map == null) {
                cVar.K();
            } else if (!MapTypeAdapterFactory.this.f15121b) {
                cVar.j();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.G(String.valueOf(entry.getKey()));
                    this.f15123b.d(cVar, entry.getValue());
                }
                cVar.w();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i10 = 0;
                boolean z10 = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    j c10 = this.f15122a.c(entry2.getKey());
                    arrayList.add(c10);
                    arrayList2.add(entry2.getValue());
                    z10 |= c10.d() || c10.f();
                }
                if (z10) {
                    cVar.f();
                    int size = arrayList.size();
                    while (i10 < size) {
                        cVar.f();
                        d7.j.b((j) arrayList.get(i10), cVar);
                        this.f15123b.d(cVar, arrayList2.get(i10));
                        cVar.t();
                        i10++;
                    }
                    cVar.t();
                    return;
                }
                cVar.j();
                int size2 = arrayList.size();
                while (i10 < size2) {
                    cVar.G(e((j) arrayList.get(i10)));
                    this.f15123b.d(cVar, arrayList2.get(i10));
                    i10++;
                }
                cVar.w();
            }
        }
    }

    public MapTypeAdapterFactory(d7.c cVar, boolean z10) {
        this.f15120a = cVar;
        this.f15121b = z10;
    }

    private t<?> a(e eVar, Type type) {
        if (type != Boolean.TYPE && type != Boolean.class) {
            return eVar.k(g7.a.b(type));
        }
        return TypeAdapters.f15168f;
    }

    @Override // b7.u
    public <T> t<T> c(e eVar, g7.a<T> aVar) {
        Type e8 = aVar.e();
        if (Map.class.isAssignableFrom(aVar.c())) {
            Type[] j10 = d7.b.j(e8, d7.b.k(e8));
            return new a(eVar, j10[0], a(eVar, j10[0]), j10[1], eVar.k(g7.a.b(j10[1])), this.f15120a.a(aVar));
        }
        return null;
    }
}

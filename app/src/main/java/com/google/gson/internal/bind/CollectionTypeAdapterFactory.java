package com.google.gson.internal.bind;

import b7.e;
import b7.t;
import b7.u;
import d7.g;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class CollectionTypeAdapterFactory implements u {

    /* renamed from: a  reason: collision with root package name */
    private final d7.c f15114a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private static final class a<E> extends t<Collection<E>> {

        /* renamed from: a  reason: collision with root package name */
        private final t<E> f15115a;

        /* renamed from: b  reason: collision with root package name */
        private final g<? extends Collection<E>> f15116b;

        public a(e eVar, Type type, t<E> tVar, g<? extends Collection<E>> gVar) {
            this.f15115a = new c(eVar, tVar, type);
            this.f15116b = gVar;
        }

        @Override // b7.t
        /* renamed from: e */
        public Collection<E> b(h7.a aVar) throws IOException {
            if (aVar.C0() == h7.b.NULL) {
                aVar.n0();
                return null;
            }
            Collection<E> a10 = this.f15116b.a();
            aVar.a();
            while (aVar.E()) {
                a10.add(this.f15115a.b(aVar));
            }
            aVar.t();
            return a10;
        }

        @Override // b7.t
        /* renamed from: f */
        public void d(h7.c cVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                cVar.K();
                return;
            }
            cVar.f();
            for (E e8 : collection) {
                this.f15115a.d(cVar, e8);
            }
            cVar.t();
        }
    }

    public CollectionTypeAdapterFactory(d7.c cVar) {
        this.f15114a = cVar;
    }

    @Override // b7.u
    public <T> t<T> c(e eVar, g7.a<T> aVar) {
        Type e8 = aVar.e();
        Class<? super T> c10 = aVar.c();
        if (Collection.class.isAssignableFrom(c10)) {
            Type h10 = d7.b.h(e8, c10);
            return new a(eVar, h10, eVar.k(g7.a.b(h10)), this.f15114a.a(aVar));
        }
        return null;
    }
}

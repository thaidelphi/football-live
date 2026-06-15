package com.google.gson.internal.bind;

import b7.e;
import b7.t;
import b7.u;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ArrayTypeAdapter<E> extends t<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final u f15111c = new u() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // b7.u
        public <T> t<T> c(e eVar, g7.a<T> aVar) {
            Type e8 = aVar.e();
            if ((e8 instanceof GenericArrayType) || ((e8 instanceof Class) && ((Class) e8).isArray())) {
                Type g10 = d7.b.g(e8);
                return new ArrayTypeAdapter(eVar, eVar.k(g7.a.b(g10)), d7.b.k(g10));
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final Class<E> f15112a;

    /* renamed from: b  reason: collision with root package name */
    private final t<E> f15113b;

    public ArrayTypeAdapter(e eVar, t<E> tVar, Class<E> cls) {
        this.f15113b = new c(eVar, tVar, cls);
        this.f15112a = cls;
    }

    @Override // b7.t
    public Object b(h7.a aVar) throws IOException {
        if (aVar.C0() == h7.b.NULL) {
            aVar.n0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.E()) {
            arrayList.add(this.f15113b.b(aVar));
        }
        aVar.t();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f15112a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b7.t
    public void d(h7.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.K();
            return;
        }
        cVar.f();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f15113b.d(cVar, Array.get(obj, i10));
        }
        cVar.t();
    }
}

package com.google.gson.internal.bind;

import b7.e;
import b7.t;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TypeAdapterRuntimeTypeWrapper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class c<T> extends t<T> {

    /* renamed from: a  reason: collision with root package name */
    private final e f15219a;

    /* renamed from: b  reason: collision with root package name */
    private final t<T> f15220b;

    /* renamed from: c  reason: collision with root package name */
    private final Type f15221c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(e eVar, t<T> tVar, Type type) {
        this.f15219a = eVar;
        this.f15220b = tVar;
        this.f15221c = type;
    }

    private Type e(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    @Override // b7.t
    public T b(h7.a aVar) throws IOException {
        return this.f15220b.b(aVar);
    }

    @Override // b7.t
    public void d(h7.c cVar, T t10) throws IOException {
        t<T> tVar = this.f15220b;
        Type e8 = e(this.f15221c, t10);
        if (e8 != this.f15221c) {
            tVar = this.f15219a.k(g7.a.b(e8));
            if (tVar instanceof ReflectiveTypeAdapterFactory.b) {
                t<T> tVar2 = this.f15220b;
                if (!(tVar2 instanceof ReflectiveTypeAdapterFactory.b)) {
                    tVar = tVar2;
                }
            }
        }
        tVar.d(cVar, t10);
    }
}

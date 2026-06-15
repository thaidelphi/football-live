package com.google.gson.internal;

import b7.b;
import b7.e;
import b7.t;
import b7.u;
import c7.d;
import h7.c;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class Excluder implements u, Cloneable {

    /* renamed from: g  reason: collision with root package name */
    public static final Excluder f15098g = new Excluder();

    /* renamed from: d  reason: collision with root package name */
    private boolean f15102d;

    /* renamed from: a  reason: collision with root package name */
    private double f15099a = -1.0d;

    /* renamed from: b  reason: collision with root package name */
    private int f15100b = 136;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15101c = true;

    /* renamed from: e  reason: collision with root package name */
    private List<b7.a> f15103e = Collections.emptyList();

    /* renamed from: f  reason: collision with root package name */
    private List<b7.a> f15104f = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a<T> extends t<T> {

        /* renamed from: a  reason: collision with root package name */
        private t<T> f15105a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f15106b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f15107c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f15108d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g7.a f15109e;

        a(boolean z10, boolean z11, e eVar, g7.a aVar) {
            this.f15106b = z10;
            this.f15107c = z11;
            this.f15108d = eVar;
            this.f15109e = aVar;
        }

        private t<T> e() {
            t<T> tVar = this.f15105a;
            if (tVar != null) {
                return tVar;
            }
            t<T> m7 = this.f15108d.m(Excluder.this, this.f15109e);
            this.f15105a = m7;
            return m7;
        }

        @Override // b7.t
        public T b(h7.a aVar) throws IOException {
            if (this.f15106b) {
                aVar.O0();
                return null;
            }
            return e().b(aVar);
        }

        @Override // b7.t
        public void d(c cVar, T t10) throws IOException {
            if (this.f15107c) {
                cVar.K();
            } else {
                e().d(cVar, t10);
            }
        }
    }

    private boolean f(Class<?> cls) {
        if (this.f15099a == -1.0d || n((d) cls.getAnnotation(d.class), (c7.e) cls.getAnnotation(c7.e.class))) {
            return (!this.f15101c && j(cls)) || i(cls);
        }
        return true;
    }

    private boolean g(Class<?> cls, boolean z10) {
        for (b7.a aVar : z10 ? this.f15103e : this.f15104f) {
            if (aVar.a(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean i(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    private boolean j(Class<?> cls) {
        return cls.isMemberClass() && !k(cls);
    }

    private boolean k(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean l(d dVar) {
        return dVar == null || dVar.value() <= this.f15099a;
    }

    private boolean m(c7.e eVar) {
        return eVar == null || eVar.value() > this.f15099a;
    }

    private boolean n(d dVar, c7.e eVar) {
        return l(dVar) && m(eVar);
    }

    @Override // b7.u
    public <T> t<T> c(e eVar, g7.a<T> aVar) {
        Class<? super T> c10 = aVar.c();
        boolean f10 = f(c10);
        boolean z10 = f10 || g(c10, true);
        boolean z11 = f10 || g(c10, false);
        if (z10 || z11) {
            return new a(z11, z10, eVar, aVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e8) {
            throw new AssertionError(e8);
        }
    }

    public boolean e(Class<?> cls, boolean z10) {
        return f(cls) || g(cls, z10);
    }

    public boolean h(Field field, boolean z10) {
        c7.a aVar;
        if ((this.f15100b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f15099a == -1.0d || n((d) field.getAnnotation(d.class), (c7.e) field.getAnnotation(c7.e.class))) && !field.isSynthetic()) {
            if (!this.f15102d || ((aVar = (c7.a) field.getAnnotation(c7.a.class)) != null && (!z10 ? !aVar.deserialize() : !aVar.serialize()))) {
                if ((this.f15101c || !j(field.getType())) && !i(field.getType())) {
                    List<b7.a> list = z10 ? this.f15103e : this.f15104f;
                    if (list.isEmpty()) {
                        return false;
                    }
                    b bVar = new b(field);
                    for (b7.a aVar2 : list) {
                        if (aVar2.b(bVar)) {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }
}

package com.google.gson.internal.bind;

import b7.e;
import b7.h;
import b7.i;
import b7.j;
import b7.p;
import b7.q;
import b7.t;
import b7.u;
import java.io.IOException;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class TreeTypeAdapter<T> extends t<T> {

    /* renamed from: a  reason: collision with root package name */
    private final q<T> f15150a;

    /* renamed from: b  reason: collision with root package name */
    private final i<T> f15151b;

    /* renamed from: c  reason: collision with root package name */
    final e f15152c;

    /* renamed from: d  reason: collision with root package name */
    private final g7.a<T> f15153d;

    /* renamed from: e  reason: collision with root package name */
    private final u f15154e;

    /* renamed from: f  reason: collision with root package name */
    private final TreeTypeAdapter<T>.b f15155f = new b();

    /* renamed from: g  reason: collision with root package name */
    private t<T> f15156g;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private static final class SingleTypeFactory implements u {

        /* renamed from: a  reason: collision with root package name */
        private final g7.a<?> f15157a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f15158b;

        /* renamed from: c  reason: collision with root package name */
        private final Class<?> f15159c;

        /* renamed from: d  reason: collision with root package name */
        private final q<?> f15160d;

        /* renamed from: e  reason: collision with root package name */
        private final i<?> f15161e;

        @Override // b7.u
        public <T> t<T> c(e eVar, g7.a<T> aVar) {
            boolean isAssignableFrom;
            g7.a<?> aVar2 = this.f15157a;
            if (aVar2 != null) {
                isAssignableFrom = aVar2.equals(aVar) || (this.f15158b && this.f15157a.e() == aVar.c());
            } else {
                isAssignableFrom = this.f15159c.isAssignableFrom(aVar.c());
            }
            if (isAssignableFrom) {
                return new TreeTypeAdapter(this.f15160d, this.f15161e, eVar, aVar, this);
            }
            return null;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private final class b implements p, h {
        private b() {
        }
    }

    public TreeTypeAdapter(q<T> qVar, i<T> iVar, e eVar, g7.a<T> aVar, u uVar) {
        this.f15150a = qVar;
        this.f15151b = iVar;
        this.f15152c = eVar;
        this.f15153d = aVar;
        this.f15154e = uVar;
    }

    private t<T> e() {
        t<T> tVar = this.f15156g;
        if (tVar != null) {
            return tVar;
        }
        t<T> m7 = this.f15152c.m(this.f15154e, this.f15153d);
        this.f15156g = m7;
        return m7;
    }

    @Override // b7.t
    public T b(h7.a aVar) throws IOException {
        if (this.f15151b == null) {
            return e().b(aVar);
        }
        j a10 = d7.j.a(aVar);
        if (a10.e()) {
            return null;
        }
        return this.f15151b.a(a10, this.f15153d.e(), this.f15155f);
    }

    @Override // b7.t
    public void d(h7.c cVar, T t10) throws IOException {
        q<T> qVar = this.f15150a;
        if (qVar == null) {
            e().d(cVar, t10);
        } else if (t10 == null) {
            cVar.K();
        } else {
            d7.j.b(qVar.a(t10, this.f15153d.e(), this.f15155f), cVar);
        }
    }
}

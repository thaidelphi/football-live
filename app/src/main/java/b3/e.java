package b3;

import android.content.Context;
import b3.u;
import i3.w;
import i3.x;
import i3.y;
import j3.m0;
import j3.n0;
import j3.u0;
import java.util.concurrent.Executor;
/* compiled from: DaggerTransportRuntimeComponent.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class e extends u {

    /* renamed from: a  reason: collision with root package name */
    private h8.a<Executor> f5047a;

    /* renamed from: b  reason: collision with root package name */
    private h8.a<Context> f5048b;

    /* renamed from: c  reason: collision with root package name */
    private h8.a f5049c;

    /* renamed from: d  reason: collision with root package name */
    private h8.a f5050d;

    /* renamed from: e  reason: collision with root package name */
    private h8.a f5051e;

    /* renamed from: f  reason: collision with root package name */
    private h8.a<String> f5052f;

    /* renamed from: g  reason: collision with root package name */
    private h8.a<m0> f5053g;

    /* renamed from: h  reason: collision with root package name */
    private h8.a<i3.g> f5054h;

    /* renamed from: i  reason: collision with root package name */
    private h8.a<y> f5055i;

    /* renamed from: j  reason: collision with root package name */
    private h8.a<h3.c> f5056j;

    /* renamed from: k  reason: collision with root package name */
    private h8.a<i3.s> f5057k;

    /* renamed from: l  reason: collision with root package name */
    private h8.a<w> f5058l;

    /* renamed from: m  reason: collision with root package name */
    private h8.a<t> f5059m;

    /* compiled from: DaggerTransportRuntimeComponent.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class b implements u.a {

        /* renamed from: a  reason: collision with root package name */
        private Context f5060a;

        private b() {
        }

        @Override // b3.u.a
        /* renamed from: b */
        public b a(Context context) {
            this.f5060a = (Context) d3.d.b(context);
            return this;
        }

        @Override // b3.u.a
        public u build() {
            d3.d.a(this.f5060a, Context.class);
            return new e(this.f5060a);
        }
    }

    public static u.a f() {
        return new b();
    }

    private void j(Context context) {
        this.f5047a = d3.a.a(k.a());
        d3.b a10 = d3.c.a(context);
        this.f5048b = a10;
        c3.j a11 = c3.j.a(a10, l3.c.a(), l3.d.a());
        this.f5049c = a11;
        this.f5050d = d3.a.a(c3.l.a(this.f5048b, a11));
        this.f5051e = u0.a(this.f5048b, j3.g.a(), j3.i.a());
        this.f5052f = d3.a.a(j3.h.a(this.f5048b));
        this.f5053g = d3.a.a(n0.a(l3.c.a(), l3.d.a(), j3.j.a(), this.f5051e, this.f5052f));
        h3.g b10 = h3.g.b(l3.c.a());
        this.f5054h = b10;
        h3.i a12 = h3.i.a(this.f5048b, this.f5053g, b10, l3.d.a());
        this.f5055i = a12;
        h8.a<Executor> aVar = this.f5047a;
        h8.a aVar2 = this.f5050d;
        h8.a<m0> aVar3 = this.f5053g;
        this.f5056j = h3.d.a(aVar, aVar2, a12, aVar3, aVar3);
        h8.a<Context> aVar4 = this.f5048b;
        h8.a aVar5 = this.f5050d;
        h8.a<m0> aVar6 = this.f5053g;
        this.f5057k = i3.t.a(aVar4, aVar5, aVar6, this.f5055i, this.f5047a, aVar6, l3.c.a(), l3.d.a(), this.f5053g);
        h8.a<Executor> aVar7 = this.f5047a;
        h8.a<m0> aVar8 = this.f5053g;
        this.f5058l = x.a(aVar7, aVar8, this.f5055i, aVar8);
        this.f5059m = d3.a.a(v.a(l3.c.a(), l3.d.a(), this.f5056j, this.f5057k, this.f5058l));
    }

    @Override // b3.u
    j3.d a() {
        return this.f5053g.get();
    }

    @Override // b3.u
    t b() {
        return this.f5059m.get();
    }

    private e(Context context) {
        j(context);
    }
}

package i3;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: Uploader_Factory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class t implements d3.b<s> {

    /* renamed from: a  reason: collision with root package name */
    private final h8.a<Context> f26490a;

    /* renamed from: b  reason: collision with root package name */
    private final h8.a<c3.e> f26491b;

    /* renamed from: c  reason: collision with root package name */
    private final h8.a<j3.d> f26492c;

    /* renamed from: d  reason: collision with root package name */
    private final h8.a<y> f26493d;

    /* renamed from: e  reason: collision with root package name */
    private final h8.a<Executor> f26494e;

    /* renamed from: f  reason: collision with root package name */
    private final h8.a<k3.b> f26495f;

    /* renamed from: g  reason: collision with root package name */
    private final h8.a<l3.a> f26496g;

    /* renamed from: h  reason: collision with root package name */
    private final h8.a<l3.a> f26497h;

    /* renamed from: i  reason: collision with root package name */
    private final h8.a<j3.c> f26498i;

    public t(h8.a<Context> aVar, h8.a<c3.e> aVar2, h8.a<j3.d> aVar3, h8.a<y> aVar4, h8.a<Executor> aVar5, h8.a<k3.b> aVar6, h8.a<l3.a> aVar7, h8.a<l3.a> aVar8, h8.a<j3.c> aVar9) {
        this.f26490a = aVar;
        this.f26491b = aVar2;
        this.f26492c = aVar3;
        this.f26493d = aVar4;
        this.f26494e = aVar5;
        this.f26495f = aVar6;
        this.f26496g = aVar7;
        this.f26497h = aVar8;
        this.f26498i = aVar9;
    }

    public static t a(h8.a<Context> aVar, h8.a<c3.e> aVar2, h8.a<j3.d> aVar3, h8.a<y> aVar4, h8.a<Executor> aVar5, h8.a<k3.b> aVar6, h8.a<l3.a> aVar7, h8.a<l3.a> aVar8, h8.a<j3.c> aVar9) {
        return new t(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static s c(Context context, c3.e eVar, j3.d dVar, y yVar, Executor executor, k3.b bVar, l3.a aVar, l3.a aVar2, j3.c cVar) {
        return new s(context, eVar, dVar, yVar, executor, bVar, aVar, aVar2, cVar);
    }

    @Override // h8.a
    /* renamed from: b */
    public s get() {
        return c(this.f26490a.get(), this.f26491b.get(), this.f26492c.get(), this.f26493d.get(), this.f26494e.get(), this.f26495f.get(), this.f26496g.get(), this.f26497h.get(), this.f26498i.get());
    }
}

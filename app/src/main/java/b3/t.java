package b3;

import android.content.Context;
import i3.w;
import java.util.Collections;
import java.util.Set;
/* compiled from: TransportRuntime.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class t implements s {

    /* renamed from: e  reason: collision with root package name */
    private static volatile u f5076e;

    /* renamed from: a  reason: collision with root package name */
    private final l3.a f5077a;

    /* renamed from: b  reason: collision with root package name */
    private final l3.a f5078b;

    /* renamed from: c  reason: collision with root package name */
    private final h3.e f5079c;

    /* renamed from: d  reason: collision with root package name */
    private final i3.s f5080d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(l3.a aVar, l3.a aVar2, h3.e eVar, i3.s sVar, w wVar) {
        this.f5077a = aVar;
        this.f5078b = aVar2;
        this.f5079c = eVar;
        this.f5080d = sVar;
        wVar.c();
    }

    private i b(n nVar) {
        return i.a().i(this.f5077a.a()).k(this.f5078b.a()).j(nVar.g()).h(new h(nVar.b(), nVar.d())).g(nVar.c().a()).d();
    }

    public static t c() {
        u uVar = f5076e;
        if (uVar != null) {
            return uVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<z2.b> d(f fVar) {
        if (fVar instanceof g) {
            return Collections.unmodifiableSet(((g) fVar).a());
        }
        return Collections.singleton(z2.b.b("proto"));
    }

    public static void f(Context context) {
        if (f5076e == null) {
            synchronized (t.class) {
                if (f5076e == null) {
                    f5076e = e.f().a(context).build();
                }
            }
        }
    }

    @Override // b3.s
    public void a(n nVar, z2.h hVar) {
        this.f5079c.a(nVar.f().f(nVar.c().c()), b(nVar), hVar);
    }

    public i3.s e() {
        return this.f5080d;
    }

    public z2.g g(f fVar) {
        return new p(d(fVar), o.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}

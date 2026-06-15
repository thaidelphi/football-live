package e1;

import androidx.lifecycle.w;
import androidx.work.s;
/* compiled from: OperationImpl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c implements s {

    /* renamed from: c  reason: collision with root package name */
    private final w<s.b> f24838c = new w<>();

    /* renamed from: d  reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c<s.b.c> f24839d = androidx.work.impl.utils.futures.c.s();

    public c() {
        a(s.f4823b);
    }

    public void a(s.b bVar) {
        this.f24838c.h(bVar);
        if (bVar instanceof s.b.c) {
            this.f24839d.o((s.b.c) bVar);
        } else if (bVar instanceof s.b.a) {
            this.f24839d.p(((s.b.a) bVar).a());
        }
    }
}

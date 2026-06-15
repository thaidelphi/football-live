package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.n;
import m8.g;
/* compiled from: ContinuationImpl.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class d extends a {
    private final m8.g _context;
    private transient m8.d<Object> intercepted;

    public d(m8.d<Object> dVar, m8.g gVar) {
        super(dVar);
        this._context = gVar;
    }

    @Override // m8.d
    public m8.g getContext() {
        m8.g gVar = this._context;
        n.c(gVar);
        return gVar;
    }

    public final m8.d<Object> intercepted() {
        m8.d<Object> dVar = this.intercepted;
        if (dVar == null) {
            m8.e eVar = (m8.e) getContext().get(m8.e.f27794v0);
            if (eVar == null || (dVar = eVar.w(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        m8.d<?> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            g.b bVar = getContext().get(m8.e.f27794v0);
            n.c(bVar);
            ((m8.e) bVar).z(dVar);
        }
        this.intercepted = c.f27356a;
    }

    public d(m8.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}

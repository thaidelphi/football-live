package n2;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import k2.g;
import y1.i;
import y1.t;
/* compiled from: LoadPathCache.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c {

    /* renamed from: c  reason: collision with root package name */
    private static final t<?, ?, ?> f27846c = new t<>(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.emptyList(), new g(), null)), null);

    /* renamed from: a  reason: collision with root package name */
    private final androidx.collection.a<s2.i, t<?, ?, ?>> f27847a = new androidx.collection.a<>();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<s2.i> f27848b = new AtomicReference<>();

    private s2.i b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        s2.i andSet = this.f27848b.getAndSet(null);
        if (andSet == null) {
            andSet = new s2.i();
        }
        andSet.a(cls, cls2, cls3);
        return andSet;
    }

    public <Data, TResource, Transcode> t<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        t<Data, TResource, Transcode> tVar;
        s2.i b10 = b(cls, cls2, cls3);
        synchronized (this.f27847a) {
            tVar = (t<Data, TResource, Transcode>) this.f27847a.get(b10);
        }
        this.f27848b.set(b10);
        return tVar;
    }

    public boolean c(t<?, ?, ?> tVar) {
        return f27846c.equals(tVar);
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, t<?, ?, ?> tVar) {
        synchronized (this.f27847a) {
            androidx.collection.a<s2.i, t<?, ?, ?>> aVar = this.f27847a;
            s2.i iVar = new s2.i(cls, cls2, cls3);
            if (tVar == null) {
                tVar = f27846c;
            }
            aVar.put(iVar, tVar);
        }
    }
}

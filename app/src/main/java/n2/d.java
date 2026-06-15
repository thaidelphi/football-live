package n2;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import s2.i;
/* compiled from: ModelToResourceClassCache.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<i> f27849a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    private final androidx.collection.a<i, List<Class<?>>> f27850b = new androidx.collection.a<>();

    public List<Class<?>> a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        i andSet = this.f27849a.getAndSet(null);
        if (andSet == null) {
            andSet = new i(cls, cls2, cls3);
        } else {
            andSet.a(cls, cls2, cls3);
        }
        synchronized (this.f27850b) {
            list = this.f27850b.get(andSet);
        }
        this.f27849a.set(andSet);
        return list;
    }

    public void b(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f27850b) {
            this.f27850b.put(new i(cls, cls2, cls3), list);
        }
    }
}

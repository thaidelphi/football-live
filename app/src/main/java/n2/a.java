package n2;

import java.util.ArrayList;
import java.util.List;
/* compiled from: EncoderRegistry.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final List<C0320a<?>> f27842a = new ArrayList();

    /* compiled from: EncoderRegistry.java */
    /* renamed from: n2.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class C0320a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f27843a;

        /* renamed from: b  reason: collision with root package name */
        final w1.d<T> f27844b;

        C0320a(Class<T> cls, w1.d<T> dVar) {
            this.f27843a = cls;
            this.f27844b = dVar;
        }

        boolean a(Class<?> cls) {
            return this.f27843a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(Class<T> cls, w1.d<T> dVar) {
        this.f27842a.add(new C0320a<>(cls, dVar));
    }

    public synchronized <T> w1.d<T> b(Class<T> cls) {
        for (C0320a<?> c0320a : this.f27842a) {
            if (c0320a.a(cls)) {
                return (w1.d<T>) c0320a.f27844b;
            }
        }
        return null;
    }
}

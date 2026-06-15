package n2;

import java.util.ArrayList;
import java.util.List;
import w1.k;
/* compiled from: ResourceEncoderRegistry.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final List<a<?>> f27856a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceEncoderRegistry.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f27857a;

        /* renamed from: b  reason: collision with root package name */
        final k<T> f27858b;

        a(Class<T> cls, k<T> kVar) {
            this.f27857a = cls;
            this.f27858b = kVar;
        }

        boolean a(Class<?> cls) {
            return this.f27857a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void a(Class<Z> cls, k<Z> kVar) {
        this.f27856a.add(new a<>(cls, kVar));
    }

    public synchronized <Z> k<Z> b(Class<Z> cls) {
        int size = this.f27856a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a<?> aVar = this.f27856a.get(i10);
            if (aVar.a(cls)) {
                return (k<Z>) aVar.f27858b;
            }
        }
        return null;
    }
}

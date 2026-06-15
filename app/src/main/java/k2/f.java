package k2;

import java.util.ArrayList;
import java.util.List;
/* compiled from: TranscoderRegistry.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final List<a<?, ?>> f27128a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TranscoderRegistry.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a<Z, R> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<Z> f27129a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<R> f27130b;

        /* renamed from: c  reason: collision with root package name */
        final e<Z, R> f27131c;

        a(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
            this.f27129a = cls;
            this.f27130b = cls2;
            this.f27131c = eVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f27129a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f27130b);
        }
    }

    public synchronized <Z, R> e<Z, R> a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.b();
        }
        for (a<?, ?> aVar : this.f27128a) {
            if (aVar.a(cls, cls2)) {
                return (e<Z, R>) aVar.f27131c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized <Z, R> List<Class<R>> b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> aVar : this.f27128a) {
            if (aVar.a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void c(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
        this.f27128a.add(new a<>(cls, cls2, eVar));
    }
}

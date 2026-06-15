package i9;

import d9.k2;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
/* compiled from: MainDispatchers.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final z f26723a;

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f26724b;

    /* renamed from: c  reason: collision with root package name */
    public static final k2 f26725c;

    static {
        z zVar = new z();
        f26723a = zVar;
        f26724b = l0.f("kotlinx.coroutines.fast.service.loader", true);
        f26725c = zVar.a();
    }

    private z() {
    }

    private final k2 a() {
        a9.f c10;
        List<y> r10;
        Object next;
        k2 e8;
        try {
            if (f26724b) {
                r10 = o.f26681a.c();
            } else {
                c10 = a9.l.c(ServiceLoader.load(y.class, y.class.getClassLoader()).iterator());
                r10 = a9.n.r(c10);
            }
            Iterator<T> it = r10.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int c11 = ((y) next).c();
                    do {
                        Object next2 = it.next();
                        int c12 = ((y) next2).c();
                        if (c11 < c12) {
                            next = next2;
                            c11 = c12;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            y yVar = (y) next;
            return (yVar == null || (e8 = a0.e(yVar, r10)) == null) ? a0.b(null, null, 3, null) : e8;
        } catch (Throwable th) {
            return a0.b(th, null, 2, null);
        }
    }
}

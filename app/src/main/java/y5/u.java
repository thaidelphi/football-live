package y5;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: Iterators.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class u {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterators.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a<T> extends y5.b<T> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Iterator f33273c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ x5.h f33274d;

        a(Iterator it, x5.h hVar) {
            this.f33273c = it;
            this.f33274d = hVar;
        }

        @Override // y5.b
        protected T a() {
            while (this.f33273c.hasNext()) {
                T t10 = (T) this.f33273c.next();
                if (this.f33274d.apply(t10)) {
                    return t10;
                }
            }
            return b();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterators.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class b<T> extends s0<T> {

        /* renamed from: a  reason: collision with root package name */
        boolean f33275a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f33276b;

        b(Object obj) {
            this.f33276b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f33275a;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f33275a) {
                this.f33275a = true;
                return (T) this.f33276b;
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Iterators.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum c implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            h.c(false);
        }
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        x5.g.i(collection);
        x5.g.i(it);
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= collection.add(it.next());
        }
        return z10;
    }

    public static <T> boolean b(Iterator<T> it, x5.h<? super T> hVar) {
        return l(it, hVar) != -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Iterator<?> it) {
        x5.g.i(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean d(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = x5.f.a(r0, r2)
            if (r0 != 0) goto L0
            return r1
        L1d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.u.e(java.util.Iterator, java.util.Iterator):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> Iterator<T> f() {
        return c.INSTANCE;
    }

    public static <T> s0<T> g(Iterator<T> it, x5.h<? super T> hVar) {
        x5.g.i(it);
        x5.g.i(hVar);
        return new a(it, hVar);
    }

    public static <T> T h(Iterator<T> it, x5.h<? super T> hVar) {
        x5.g.i(it);
        x5.g.i(hVar);
        while (it.hasNext()) {
            T next = it.next();
            if (hVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static <T> T i(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T j(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? (T) i(it) : t10;
    }

    public static <T> T k(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? it.next() : t10;
    }

    public static <T> int l(Iterator<T> it, x5.h<? super T> hVar) {
        x5.g.j(hVar, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (hVar.apply(it.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T m(Iterator<T> it) {
        if (it.hasNext()) {
            T next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    public static boolean n(Iterator<?> it, Collection<?> collection) {
        x5.g.i(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> boolean o(Iterator<T> it, x5.h<? super T> hVar) {
        x5.g.i(hVar);
        boolean z10 = false;
        while (it.hasNext()) {
            if (hVar.apply(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> s0<T> p(T t10) {
        return new b(t10);
    }
}

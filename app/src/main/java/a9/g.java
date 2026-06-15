package a9;

import i8.o;
import i8.w;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: SequenceBuilder.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class g<T> extends h<T> implements Iterator<T>, m8.d<w> {

    /* renamed from: a  reason: collision with root package name */
    private int f589a;

    /* renamed from: b  reason: collision with root package name */
    private T f590b;

    /* renamed from: c  reason: collision with root package name */
    private Iterator<? extends T> f591c;

    /* renamed from: d  reason: collision with root package name */
    private m8.d<? super w> f592d;

    private final Throwable c() {
        int i10 = this.f589a;
        if (i10 != 4) {
            if (i10 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f589a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    private final T e() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // a9.h
    public Object a(T t10, m8.d<? super w> dVar) {
        this.f590b = t10;
        this.f589a = 3;
        this.f592d = dVar;
        Object c10 = n8.b.c();
        if (c10 == n8.b.c()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return c10 == n8.b.c() ? c10 : w.f26638a;
    }

    @Override // m8.d
    public m8.g getContext() {
        return m8.h.f27797a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i10 = this.f589a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator<? extends T> it = this.f591c;
                kotlin.jvm.internal.n.c(it);
                if (it.hasNext()) {
                    this.f589a = 2;
                    return true;
                }
                this.f591c = null;
            }
            this.f589a = 5;
            m8.d<? super w> dVar = this.f592d;
            kotlin.jvm.internal.n.c(dVar);
            this.f592d = null;
            o.a aVar = i8.o.f26626b;
            dVar.resumeWith(i8.o.b(w.f26638a));
        }
    }

    public final void i(m8.d<? super w> dVar) {
        this.f592d = dVar;
    }

    @Override // java.util.Iterator
    public T next() {
        int i10 = this.f589a;
        if (i10 == 0 || i10 == 1) {
            return e();
        }
        if (i10 == 2) {
            this.f589a = 1;
            Iterator<? extends T> it = this.f591c;
            kotlin.jvm.internal.n.c(it);
            return it.next();
        } else if (i10 == 3) {
            this.f589a = 0;
            T t10 = this.f590b;
            this.f590b = null;
            return t10;
        } else {
            throw c();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // m8.d
    public void resumeWith(Object obj) {
        i8.p.b(obj);
        this.f589a = 4;
    }
}

package a9;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sequences.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class l extends k {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a<T> implements f<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterator f594a;

        public a(Iterator it) {
            this.f594a = it;
        }

        @Override // a9.f
        public Iterator<T> iterator() {
            return this.f594a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class b<T> extends kotlin.jvm.internal.o implements t8.l<T, T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t8.a<T> f595a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(t8.a<? extends T> aVar) {
            super(1);
            this.f595a = aVar;
        }

        @Override // t8.l
        public final T invoke(T it) {
            kotlin.jvm.internal.n.f(it, "it");
            return this.f595a.invoke();
        }
    }

    public static <T> f<T> c(Iterator<? extends T> it) {
        f<T> d10;
        kotlin.jvm.internal.n.f(it, "<this>");
        d10 = d(new a(it));
        return d10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> f<T> d(f<? extends T> fVar) {
        kotlin.jvm.internal.n.f(fVar, "<this>");
        return fVar instanceof a9.a ? fVar : new a9.a(fVar);
    }

    public static final <T> f<T> e() {
        return c.f576a;
    }

    public static <T> f<T> f(t8.a<? extends T> nextFunction) {
        f<T> d10;
        kotlin.jvm.internal.n.f(nextFunction, "nextFunction");
        d10 = d(new e(nextFunction, new b(nextFunction)));
        return d10;
    }
}

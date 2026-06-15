package a9;

import i8.w;
import j8.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: R
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Sequences.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class n extends m {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterables.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a<T> implements Iterable<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f596a;

        public a(f fVar) {
            this.f596a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f596a.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: _Sequences.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", f = "_Sequences.kt", l = {2290, 2294}, m = "invokeSuspend")
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class b<R> extends kotlin.coroutines.jvm.internal.k implements t8.p<h<? super R>, m8.d<? super w>, Object> {

        /* renamed from: b  reason: collision with root package name */
        Object f597b;

        /* renamed from: c  reason: collision with root package name */
        Object f598c;

        /* renamed from: d  reason: collision with root package name */
        int f599d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f600e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ R f601f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f<T> f602g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ t8.p<R, T, R> f603h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(R r10, f<? extends T> fVar, t8.p<? super R, ? super T, ? extends R> pVar, m8.d<? super b> dVar) {
            super(2, dVar);
            this.f601f = r10;
            this.f602g = fVar;
            this.f603h = pVar;
        }

        public final Object a(h<? super R> hVar, m8.d<? super w> dVar) {
            return ((b) create(hVar, dVar)).invokeSuspend(w.f26638a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final m8.d<w> create(Object obj, m8.d<?> dVar) {
            b bVar = new b(this.f601f, this.f602g, this.f603h, dVar);
            bVar.f600e = obj;
            return bVar;
        }

        @Override // t8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, m8.d<? super w> dVar) {
            return a((h) obj, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = n8.b.c()
                int r1 = r7.f599d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2d
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r7.f598c
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r7.f597b
                java.lang.Object r4 = r7.f600e
                a9.h r4 = (a9.h) r4
                i8.p.b(r8)
                r8 = r3
                goto L4c
            L1d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L25:
                java.lang.Object r1 = r7.f600e
                a9.h r1 = (a9.h) r1
                i8.p.b(r8)
                goto L42
            L2d:
                i8.p.b(r8)
                java.lang.Object r8 = r7.f600e
                r1 = r8
                a9.h r1 = (a9.h) r1
                R r8 = r7.f601f
                r7.f600e = r1
                r7.f599d = r3
                java.lang.Object r8 = r1.a(r8, r7)
                if (r8 != r0) goto L42
                return r0
            L42:
                R r8 = r7.f601f
                a9.f<T> r3 = r7.f602g
                java.util.Iterator r3 = r3.iterator()
                r4 = r1
                r1 = r3
            L4c:
                r3 = r7
            L4d:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L6c
                java.lang.Object r5 = r1.next()
                t8.p<R, T, R> r6 = r3.f603h
                java.lang.Object r8 = r6.invoke(r8, r5)
                r3.f600e = r4
                r3.f597b = r8
                r3.f598c = r1
                r3.f599d = r2
                java.lang.Object r5 = r4.a(r8, r3)
                if (r5 != r0) goto L4d
                return r0
            L6c:
                i8.w r8 = i8.w.f26638a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: a9.n.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: _Sequences.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class c<T> implements f<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f<T> f604a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Comparator<? super T> f605b;

        /* JADX WARN: Multi-variable type inference failed */
        c(f<? extends T> fVar, Comparator<? super T> comparator) {
            this.f604a = fVar;
            this.f605b = comparator;
        }

        @Override // a9.f
        public Iterator<T> iterator() {
            List s10 = n.s(this.f604a);
            u.m(s10, this.f605b);
            return s10.iterator();
        }
    }

    public static <T> Iterable<T> g(f<? extends T> fVar) {
        kotlin.jvm.internal.n.f(fVar, "<this>");
        return new a(fVar);
    }

    public static <T> f<T> h(f<? extends T> fVar, t8.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.n.f(fVar, "<this>");
        kotlin.jvm.internal.n.f(predicate, "predicate");
        return new d(fVar, true, predicate);
    }

    public static final <T, A extends Appendable> A i(f<? extends T> fVar, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, t8.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.n.f(fVar, "<this>");
        kotlin.jvm.internal.n.f(buffer, "buffer");
        kotlin.jvm.internal.n.f(separator, "separator");
        kotlin.jvm.internal.n.f(prefix, "prefix");
        kotlin.jvm.internal.n.f(postfix, "postfix");
        kotlin.jvm.internal.n.f(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t10 : fVar) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            b9.g.a(buffer, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T> String j(f<? extends T> fVar, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, t8.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.n.f(fVar, "<this>");
        kotlin.jvm.internal.n.f(separator, "separator");
        kotlin.jvm.internal.n.f(prefix, "prefix");
        kotlin.jvm.internal.n.f(postfix, "postfix");
        kotlin.jvm.internal.n.f(truncated, "truncated");
        String sb = ((StringBuilder) i(fVar, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.n.e(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String k(f fVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, t8.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i11 & 2) != 0 ? "" : charSequence2;
        String str2 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return j(fVar, charSequence, str, str2, i12, charSequence5, lVar);
    }

    public static <T, R> f<R> l(f<? extends T> fVar, t8.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.n.f(fVar, "<this>");
        kotlin.jvm.internal.n.f(transform, "transform");
        return new q(fVar, transform);
    }

    public static <T, R> f<R> m(f<? extends T> fVar, R r10, t8.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.n.f(fVar, "<this>");
        kotlin.jvm.internal.n.f(operation, "operation");
        return j.b(new b(r10, fVar, operation, null));
    }

    public static <T> f<T> n(f<? extends T> fVar, Comparator<? super T> comparator) {
        kotlin.jvm.internal.n.f(fVar, "<this>");
        kotlin.jvm.internal.n.f(comparator, "comparator");
        return new c(fVar, comparator);
    }

    public static <T> f<T> o(f<? extends T> fVar, int i10) {
        kotlin.jvm.internal.n.f(fVar, "<this>");
        if (i10 >= 0) {
            if (i10 == 0) {
                return l.e();
            }
            return fVar instanceof a9.b ? ((a9.b) fVar).a(i10) : new o(fVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static <T> f<T> p(f<? extends T> fVar, t8.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.n.f(fVar, "<this>");
        kotlin.jvm.internal.n.f(predicate, "predicate");
        return new p(fVar, predicate);
    }

    public static final <T, C extends Collection<? super T>> C q(f<? extends T> fVar, C destination) {
        kotlin.jvm.internal.n.f(fVar, "<this>");
        kotlin.jvm.internal.n.f(destination, "destination");
        for (T t10 : fVar) {
            destination.add(t10);
        }
        return destination;
    }

    public static <T> List<T> r(f<? extends T> fVar) {
        List<T> h10;
        kotlin.jvm.internal.n.f(fVar, "<this>");
        h10 = j8.q.h(s(fVar));
        return h10;
    }

    public static final <T> List<T> s(f<? extends T> fVar) {
        kotlin.jvm.internal.n.f(fVar, "<this>");
        return (List) q(fVar, new ArrayList());
    }
}

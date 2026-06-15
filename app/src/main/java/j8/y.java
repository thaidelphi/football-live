package j8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
/* compiled from: _Collections.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class y extends x {

    /* compiled from: Sequences.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a<T> implements a9.f<T> {

        /* renamed from: a */
        final /* synthetic */ Iterable f27101a;

        public a(Iterable iterable) {
            this.f27101a = iterable;
        }

        @Override // a9.f
        public Iterator<T> iterator() {
            return this.f27101a.iterator();
        }
    }

    public static /* synthetic */ String A(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, t8.l lVar, int i11, Object obj) {
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
        return z(iterable, charSequence, str, str2, i12, charSequence5, lVar);
    }

    public static <T> T B(List<? extends T> list) {
        int e8;
        kotlin.jvm.internal.n.f(list, "<this>");
        if (!list.isEmpty()) {
            e8 = q.e(list);
            return list.get(e8);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T extends Comparable<? super T>> T C(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        return null;
    }

    public static <T> List<T> D(Iterable<? extends T> iterable, T t10) {
        int k10;
        kotlin.jvm.internal.n.f(iterable, "<this>");
        k10 = r.k(iterable, 10);
        ArrayList arrayList = new ArrayList(k10);
        boolean z10 = false;
        for (T t11 : iterable) {
            boolean z11 = true;
            if (!z10 && kotlin.jvm.internal.n.a(t11, t10)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    public static <T> List<T> E(Collection<? extends T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.n.f(collection, "<this>");
        kotlin.jvm.internal.n.f(elements, "elements");
        if (elements instanceof Collection) {
            Collection collection2 = (Collection) elements;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        v.n(arrayList2, elements);
        return arrayList2;
    }

    public static <T> List<T> F(Collection<? extends T> collection, T t10) {
        kotlin.jvm.internal.n.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t10);
        return arrayList;
    }

    public static <T> T G(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) H((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                throw new IllegalArgumentException("Collection has more than one element.");
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T H(List<? extends T> list) {
        kotlin.jvm.internal.n.f(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> I(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        List<T> b10;
        List<T> M;
        kotlin.jvm.internal.n.f(iterable, "<this>");
        kotlin.jvm.internal.n.f(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                M = M(iterable);
                return M;
            }
            Object[] array = collection.toArray(new Object[0]);
            l.h(array, comparator);
            b10 = l.b(array);
            return b10;
        }
        List<T> N = N(iterable);
        u.m(N, comparator);
        return N;
    }

    public static <T> List<T> J(Iterable<? extends T> iterable, int i10) {
        List<T> h10;
        List<T> b10;
        List<T> M;
        List<T> d10;
        kotlin.jvm.internal.n.f(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            d10 = q.d();
            return d10;
        } else {
            if (iterable instanceof Collection) {
                if (i10 >= ((Collection) iterable).size()) {
                    M = M(iterable);
                    return M;
                } else if (i10 == 1) {
                    b10 = p.b(u(iterable));
                    return b10;
                }
            }
            ArrayList arrayList = new ArrayList(i10);
            for (T t10 : iterable) {
                arrayList.add(t10);
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            h10 = q.h(arrayList);
            return h10;
        }
    }

    public static final <T, C extends Collection<? super T>> C K(Iterable<? extends T> iterable, C destination) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        kotlin.jvm.internal.n.f(destination, "destination");
        for (T t10 : iterable) {
            destination.add(t10);
        }
        return destination;
    }

    public static <T> HashSet<T> L(Iterable<? extends T> iterable) {
        int k10;
        int c10;
        kotlin.jvm.internal.n.f(iterable, "<this>");
        k10 = r.k(iterable, 12);
        c10 = i0.c(k10);
        return (HashSet) K(iterable, new HashSet(c10));
    }

    public static <T> List<T> M(Iterable<? extends T> iterable) {
        List<T> h10;
        List<T> d10;
        List<T> b10;
        List<T> O;
        kotlin.jvm.internal.n.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                d10 = q.d();
                return d10;
            } else if (size != 1) {
                O = O(collection);
                return O;
            } else {
                b10 = p.b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
                return b10;
            }
        }
        h10 = q.h(N(iterable));
        return h10;
    }

    public static final <T> List<T> N(Iterable<? extends T> iterable) {
        List<T> O;
        kotlin.jvm.internal.n.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            O = O((Collection) iterable);
            return O;
        }
        return (List) K(iterable, new ArrayList());
    }

    public static <T> List<T> O(Collection<? extends T> collection) {
        kotlin.jvm.internal.n.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final <T> Set<T> P(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) K(iterable, new LinkedHashSet());
    }

    public static <T> Set<T> Q(Iterable<? extends T> iterable) {
        Set<T> b10;
        Set<T> a10;
        int c10;
        kotlin.jvm.internal.n.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                b10 = o0.b();
                return b10;
            } else if (size != 1) {
                c10 = i0.c(collection.size());
                return (Set) K(iterable, new LinkedHashSet(c10));
            } else {
                a10 = n0.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
                return a10;
            }
        }
        return o0.c((Set) K(iterable, new LinkedHashSet()));
    }

    public static <T, R> List<i8.n<T, R>> R(Iterable<? extends T> iterable, Iterable<? extends R> other) {
        int k10;
        int k11;
        kotlin.jvm.internal.n.f(iterable, "<this>");
        kotlin.jvm.internal.n.f(other, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        k10 = r.k(iterable, 10);
        k11 = r.k(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(k10, k11));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(i8.s.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static <T> a9.f<T> p(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        return new a(iterable);
    }

    public static <T> boolean q(Iterable<? extends T> iterable, T t10) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t10);
        }
        return w(iterable, t10) >= 0;
    }

    public static <T> List<T> r(Iterable<? extends T> iterable) {
        List<T> M;
        kotlin.jvm.internal.n.f(iterable, "<this>");
        M = M(P(iterable));
        return M;
    }

    public static <T> List<T> s(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        return (List) t(iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C t(Iterable<? extends T> iterable, C destination) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        kotlin.jvm.internal.n.f(destination, "destination");
        for (T t10 : iterable) {
            if (t10 != null) {
                destination.add(t10);
            }
        }
        return destination;
    }

    public static final <T> T u(Iterable<? extends T> iterable) {
        Object v10;
        kotlin.jvm.internal.n.f(iterable, "<this>");
        if (iterable instanceof List) {
            v10 = v((List) iterable);
            return (T) v10;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T v(List<? extends T> list) {
        kotlin.jvm.internal.n.f(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> int w(Iterable<? extends T> iterable, T t10) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t10);
        }
        int i10 = 0;
        for (T t11 : iterable) {
            if (i10 < 0) {
                q.j();
            }
            if (kotlin.jvm.internal.n.a(t10, t11)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final <T, A extends Appendable> A x(Iterable<? extends T> iterable, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, t8.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        kotlin.jvm.internal.n.f(buffer, "buffer");
        kotlin.jvm.internal.n.f(separator, "separator");
        kotlin.jvm.internal.n.f(prefix, "prefix");
        kotlin.jvm.internal.n.f(postfix, "postfix");
        kotlin.jvm.internal.n.f(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t10 : iterable) {
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

    public static final <T> String z(Iterable<? extends T> iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, t8.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        kotlin.jvm.internal.n.f(separator, "separator");
        kotlin.jvm.internal.n.f(prefix, "prefix");
        kotlin.jvm.internal.n.f(postfix, "postfix");
        kotlin.jvm.internal.n.f(truncated, "truncated");
        String sb = ((StringBuilder) x(iterable, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.n.e(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }
}

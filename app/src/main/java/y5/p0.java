package y5;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import y5.i;
/* compiled from: Sets.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class p0 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Sets.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a<E> extends e<E> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Set f33249a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Set f33250b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Sets.java */
        /* renamed from: y5.p0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public class C0390a extends y5.b<E> {

            /* renamed from: c  reason: collision with root package name */
            final Iterator<E> f33251c;

            C0390a() {
                this.f33251c = a.this.f33249a.iterator();
            }

            @Override // y5.b
            protected E a() {
                while (this.f33251c.hasNext()) {
                    E next = this.f33251c.next();
                    if (a.this.f33250b.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.f33249a = set;
            this.f33250b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a */
        public s0<E> iterator() {
            return new C0390a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f33249a.contains(obj) && this.f33250b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f33249a.containsAll(collection) && this.f33250b.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f33250b, this.f33249a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int i10 = 0;
            for (E e8 : this.f33249a) {
                if (this.f33250b.contains(e8)) {
                    i10++;
                }
            }
            return i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Sets.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class b<E> extends i.a<E> implements Set<E> {
        b(Set<E> set, x5.h<? super E> hVar) {
            super(set, hVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return p0.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return p0.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Sets.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class c<E> extends b<E> implements SortedSet<E> {
        c(SortedSet<E> sortedSet, x5.h<? super E> hVar) {
            super(sortedSet, hVar);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f33210a).comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) u.h(this.f33210a.iterator(), this.f33211b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e8) {
            return new c(((SortedSet) this.f33210a).headSet(e8), this.f33211b);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [E, java.lang.Object] */
        @Override // java.util.SortedSet
        public E last() {
            SortedSet sortedSet = (SortedSet) this.f33210a;
            while (true) {
                ?? r12 = (Object) sortedSet.last();
                if (this.f33211b.apply(r12)) {
                    return r12;
                }
                sortedSet = sortedSet.headSet(r12);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e8, E e10) {
            return new c(((SortedSet) this.f33210a).subSet(e8, e10), this.f33211b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e8) {
            return new c(((SortedSet) this.f33210a).tailSet(e8), this.f33211b);
        }
    }

    /* compiled from: Sets.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static abstract class d<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return p0.i(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) x5.g.i(collection));
        }
    }

    /* compiled from: Sets.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static abstract class e<E> extends AbstractSet<E> {
        /* synthetic */ e(o0 o0Var) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e8) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        private e() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <E> Set<E> b(Set<E> set, x5.h<? super E> hVar) {
        if (set instanceof SortedSet) {
            return c((SortedSet) set, hVar);
        }
        if (set instanceof b) {
            b bVar = (b) set;
            return new b((Set) bVar.f33210a, x5.i.b(bVar.f33211b, hVar));
        }
        return new b((Set) x5.g.i(set), (x5.h) x5.g.i(hVar));
    }

    public static <E> SortedSet<E> c(SortedSet<E> sortedSet, x5.h<? super E> hVar) {
        if (sortedSet instanceof b) {
            b bVar = (b) sortedSet;
            return new c((SortedSet) bVar.f33210a, x5.i.b(bVar.f33211b, hVar));
        }
        return new c((SortedSet) x5.g.i(sortedSet), (x5.h) x5.g.i(hVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static <E> e<E> e(Set<E> set, Set<?> set2) {
        x5.g.j(set, "set1");
        x5.g.j(set2, "set2");
        return new a(set, set2);
    }

    public static <E> HashSet<E> f() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> g(int i10) {
        return new HashSet<>(y.a(i10));
    }

    public static <E> Set<E> h() {
        return Collections.newSetFromMap(y.e());
    }

    static boolean i(Set<?> set, Collection<?> collection) {
        x5.g.i(collection);
        if (collection instanceof d0) {
            collection = ((d0) collection).t();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            return u.n(set.iterator(), collection);
        }
        return j(set, collection.iterator());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean j(Set<?> set, Iterator<?> it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }
}

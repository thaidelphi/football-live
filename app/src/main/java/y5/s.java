package y5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
/* compiled from: ImmutableSet.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class s<E> extends o<E> implements Set<E> {

    /* renamed from: b  reason: collision with root package name */
    private transient q<E> f33272b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(int i10) {
        int max = Math.max(i10, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        x5.g.e(max < 1073741824, "collection too large");
        return 1073741824;
    }

    private static <E> s<E> i(int i10, Object... objArr) {
        if (i10 != 0) {
            if (i10 != 1) {
                int h10 = h(i10);
                Object[] objArr2 = new Object[h10];
                int i11 = h10 - 1;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    Object a10 = g0.a(objArr[i14], i14);
                    int hashCode = a10.hashCode();
                    int a11 = n.a(hashCode);
                    while (true) {
                        int i15 = a11 & i11;
                        Object obj = objArr2[i15];
                        if (obj == null) {
                            objArr[i13] = a10;
                            objArr2[i15] = a10;
                            i12 += hashCode;
                            i13++;
                            break;
                        } else if (obj.equals(a10)) {
                            break;
                        } else {
                            a11++;
                        }
                    }
                }
                Arrays.fill(objArr, i13, i10, (Object) null);
                if (i13 == 1) {
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    return new q0(obj2);
                } else if (h(i13) < h10 / 2) {
                    return i(i13, objArr);
                } else {
                    if (r(i13, objArr.length)) {
                        objArr = Arrays.copyOf(objArr, i13);
                    }
                    return new l0(objArr, i12, objArr2, i11, i13);
                }
            }
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return o(obj3);
        }
        return n();
    }

    public static <E> s<E> j(Collection<? extends E> collection) {
        if ((collection instanceof s) && !(collection instanceof SortedSet)) {
            s<E> sVar = (s) collection;
            if (!sVar.f()) {
                return sVar;
            }
        }
        Object[] array = collection.toArray();
        return i(array.length, array);
    }

    public static <E> s<E> k(E[] eArr) {
        int length = eArr.length;
        if (length != 0) {
            if (length != 1) {
                return i(eArr.length, (Object[]) eArr.clone());
            }
            return o(eArr[0]);
        }
        return n();
    }

    public static <E> s<E> n() {
        return l0.f33235i;
    }

    public static <E> s<E> o(E e8) {
        return new q0(e8);
    }

    public static <E> s<E> p(E e8, E e10) {
        return i(2, e8, e10);
    }

    public static <E> s<E> q(E e8, E e10, E e11) {
        return i(3, e8, e10, e11);
    }

    private static boolean r(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    @Override // y5.o
    public q<E> a() {
        q<E> qVar = this.f33272b;
        if (qVar == null) {
            q<E> l10 = l();
            this.f33272b = l10;
            return l10;
        }
        return qVar;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof s) && m() && ((s) obj).m() && hashCode() != obj.hashCode()) {
            return false;
        }
        return p0.a(this, obj);
    }

    @Override // y5.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: g */
    public abstract s0<E> iterator();

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return p0.d(this);
    }

    q<E> l() {
        return q.h(toArray());
    }

    boolean m() {
        return false;
    }
}

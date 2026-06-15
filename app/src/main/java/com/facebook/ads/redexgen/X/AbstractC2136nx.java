package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;
@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.nx  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC2136nx {
    public static byte[] A00;
    public static String[] A01 = {"QMNv5OeLi", "JpCyGMjCH0qsxjrywkKfLwsh76HDYAsW", "KBfMQLxtUMBpcerO39v", "kcWpGIrroOmjfPs85a", "Ek92TFQTKr4621X3uMn", "aSOd7mkF1z21DVbAzu", "Gro5DGcboyXTTqFPFEdSQ7qnAhBJScvW", "47M7luGjiBOnZ0iOunZSyxDazaCqRcyy"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A00(Set<?> s10) {
        int i10 = 0;
        Iterator<?> it = s10.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static <E> SortedSet<E> A03(SortedSet<E> unfiltered, InterfaceC1791iE<? super E> predicate) {
        if (unfiltered instanceof C0988Nq) {
            C0988Nq c0988Nq = (C0988Nq) unfiltered;
            return new C04762y((SortedSet) c0988Nq.A01, AbstractC1793iG.A00(c0988Nq.A00, predicate));
        }
        return new C04762y((SortedSet) AbstractC1790iD.A04(unfiltered), (InterfaceC1791iE) AbstractC1790iD.A04(predicate));
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 125);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static <E> Set<E> A07(Set<E> unfiltered, InterfaceC1791iE<? super E> predicate) {
        if (unfiltered instanceof SortedSet) {
            return A03((SortedSet) unfiltered, predicate);
        }
        if (unfiltered instanceof C0988Nq) {
            C0988Nq c0988Nq = (C0988Nq) unfiltered;
            return new C0988Nq((Set) c0988Nq.A01, AbstractC1793iG.A00(c0988Nq.A00, predicate));
        }
        return new C0988Nq((Set) AbstractC1790iD.A04(unfiltered), (InterfaceC1791iE) AbstractC1790iD.A04(predicate));
    }

    public static void A08() {
        A00 = new byte[]{25, 16, 25, 17, 25, 18, 8, 47, 25, 8, 121, 111, 126, 59, 19, 5, 20, 82};
    }

    static {
        A08();
    }

    public static <E> AbstractC2135nv<E> A01(final Set<? extends E> set1, final Set<? extends E> set2) {
        AbstractC1790iD.A05(set1, A04(10, 4, 119));
        AbstractC1790iD.A05(set2, A04(14, 4, 29));
        return new C0990Ns(set1, set2);
    }

    public static <E> AbstractC2135nv<E> A02(final Set<E> set1, final Set<?> set2) {
        AbstractC1790iD.A05(set1, A04(10, 4, 119));
        AbstractC1790iD.A05(set2, A04(14, 4, 29));
        return new C0989Nr(set1, set2);
    }

    public static <E> HashSet<E> A05() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> A06(int expectedSize) {
        return new HashSet<>(AbstractC2083n2.A00(expectedSize));
    }

    public static boolean A09(@CheckForNull Set<?> s10, Object object) {
        if (s10 == object) {
            return true;
        }
        if (object instanceof Set) {
            if (A01[0].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "mkkUVP7U2mO33UgVMEf";
            strArr[4] = "sZqEaXQqwVxNGw5Qr8W";
            Set set = (Set) object;
            try {
                if (s10.size() == set.size()) {
                    if (s10.containsAll(set)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
        return false;
    }

    public static boolean A0A(Set<?> set, Collection<?> collection) {
        AbstractC1790iD.A04(collection);
        if (0 != 0) {
            throw new NullPointerException(A04(0, 10, 1));
        }
        if (collection instanceof Set) {
            int size = collection.size();
            int size2 = set.size();
            if (A01[0].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "1Hjzr9oWssjCwBhAVsj";
            strArr[4] = "95dUReBvqcjLhc0vRoV";
            if (size > size2) {
                return AbstractC2043mO.A0F(set.iterator(), collection);
            }
        }
        Iterator<?> it = collection.iterator();
        String[] strArr2 = A01;
        if (strArr2[2].length() != strArr2[4].length()) {
            A01[1] = "sptQvlXJPhLrnOvdD6zGRYz2Tqrv0eAh";
            return A0B(set, it);
        }
        String[] strArr3 = A01;
        strArr3[2] = "FhrMChMKSM6HFLoTDqL";
        strArr3[4] = "aqz5QQGy23EnDjT9ypo";
        return A0B(set, it);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0B(java.util.Set<?> r2, java.util.Iterator<?> r3) {
        /*
            r1 = 0
        L1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L11
            java.lang.Object r0 = r3.next()
            boolean r0 = r2.remove(r0)
            r1 = r1 | r0
            goto L1
        L11:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC2136nx.A0B(java.util.Set, java.util.Iterator):boolean");
    }
}

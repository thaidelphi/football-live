package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;
@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.mO  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC2043mO {
    public static byte[] A00;
    public static String[] A01 = {"K5wWXkn1kn3vTm5TWZRpAJ13TGij4Off", "na1woSjLgBJfLtqhSRSkwOGg", "PhLAgNdVWkw0DSh4SzNoPunxC5fhlr", "P2EphC6Qbo", "AgH7SjrpzHTBb", "6lZG", "iuGyz0SG3T5uD6f3liiVpcsGpl9NN6eU", "8JXy4no7J"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static <T> AbstractC2173oj<T> A03(@ParametricNullness T value) {
        return value != null ? new OE(value) : new OC(null);
    }

    public static String A08(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 50);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{-67, -65, -78, -79, -74, -80, -82, -63, -78};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static <T> boolean A0C(Iterator<T> iterator, InterfaceC1791iE<? super T> predicate) {
        return A00(iterator, predicate) != -1;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0G(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            boolean r0 = r4.hasNext()
            r2 = 0
            if (r0 != 0) goto Le
            return r2
        Le:
            java.lang.Object r1 = r3.next()
            java.lang.Object r0 = r4.next()
            boolean r0 = com.facebook.ads.redexgen.X.AbstractC1013Or.A01(r1, r0)
            if (r0 != 0) goto L0
            return r2
        L1d:
            boolean r0 = r4.hasNext()
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC2043mO.A0G(java.util.Iterator, java.util.Iterator):boolean");
    }

    static {
        A09();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iE != com.google.common.base.Predicate<? super T> */
    public static <T> int A00(Iterator<T> iterator, InterfaceC1791iE<? super T> predicate) {
        AbstractC1790iD.A05(predicate, A08(0, 9, 27));
        int i10 = 0;
        while (iterator.hasNext()) {
            if (predicate.A42(iterator.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iE != com.google.common.base.Predicate<? super T> */
    public static <T> AbstractC2173oj<T> A01(final Iterator<T> unfiltered, final InterfaceC1791iE<? super T> retainIfTrue) {
        AbstractC1790iD.A04(unfiltered);
        AbstractC1790iD.A04(retainIfTrue);
        return new On<T>() { // from class: com.facebook.ads.redexgen.X.4O
            @Override // com.facebook.ads.redexgen.X.On
            @CheckForNull
            public final T A02() {
                while (unfiltered.hasNext()) {
                    T t10 = (T) unfiltered.next();
                    if (retainIfTrue.A42(t10)) {
                        return t10;
                    }
                }
                T element = A01();
                return element;
            }
        };
    }

    public static <T> Iterator<T> A02() {
        return EnumC2041mM.A03;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oj != com.google.common.collect.UnmodifiableIterator<T> */
    public static <T> AbstractC2173oj<T> A04(Iterator<? extends T> iterator) {
        AbstractC1790iD.A04(iterator);
        if (iterator instanceof AbstractC2173oj) {
            return (AbstractC2173oj) iterator;
        }
        return new OF(iterator);
    }

    @CheckForNull
    public static <T> T A05(Iterator<T> iterator) {
        if (iterator.hasNext()) {
            T result = iterator.next();
            iterator.remove();
            return result;
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iE != com.google.common.base.Predicate<? super T> */
    @ParametricNullness
    public static <T> T A06(Iterator<T> iterator, InterfaceC1791iE<? super T> predicate) {
        AbstractC1790iD.A04(iterator);
        AbstractC1790iD.A04(predicate);
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (predicate.A42(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @ParametricNullness
    public static <T> T A07(@ParametricNullness Iterator<? extends T> iterator, T defaultValue) {
        if (iterator.hasNext()) {
            T defaultValue2 = iterator.next();
            return defaultValue2;
        }
        return defaultValue;
    }

    public static void A0A(Iterator<?> iterator) {
        AbstractC1790iD.A04(iterator);
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> boolean A0B(java.util.Collection<T> r2, java.util.Iterator<? extends T> r3) {
        /*
            com.facebook.ads.redexgen.X.AbstractC1790iD.A04(r2)
            com.facebook.ads.redexgen.X.AbstractC1790iD.A04(r3)
            r1 = 0
        L7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L17
            java.lang.Object r0 = r3.next()
            boolean r0 = r2.add(r0)
            r1 = r1 | r0
            goto L7
        L17:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC2043mO.A0B(java.util.Collection, java.util.Iterator):boolean");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iE != com.google.common.base.Predicate<? super T> */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> boolean A0D(java.util.Iterator<T> r3, com.facebook.ads.redexgen.X.InterfaceC1791iE<? super T> r4) {
        /*
            com.facebook.ads.redexgen.X.AbstractC1790iD.A04(r4)
            r1 = 0
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r3.next()
            boolean r0 = r4.A42(r0)
            if (r0 == 0) goto L4
            r3.remove()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AbstractC2043mO.A01
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 4
            if (r1 == r0) goto L29
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L29:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AbstractC2043mO.A01
            java.lang.String r1 = "wI9B4C2he"
            r0 = 7
            r2[r0] = r1
            r1 = 1
            goto L4
        L32:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC2043mO.A0D(java.util.Iterator, com.facebook.ads.redexgen.X.iE):boolean");
    }

    public static boolean A0E(@CheckForNull Iterator<?> iterator, Object element) {
        if (element == null) {
            while (iterator.hasNext()) {
                if (iterator.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (iterator.hasNext()) {
            if (element.equals(iterator.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0F(java.util.Iterator<?> r2, java.util.Collection<?> r3) {
        /*
            com.facebook.ads.redexgen.X.AbstractC1790iD.A04(r3)
            r1 = 0
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r2.next()
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L4
            r2.remove()
            r1 = 1
            goto L4
        L19:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC2043mO.A0F(java.util.Iterator, java.util.Collection):boolean");
    }
}

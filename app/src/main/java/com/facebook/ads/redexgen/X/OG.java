package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;
@ElementTypesAreNonnullByDefault
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class OG<E> extends AbstractC1996ld<E> implements Set<E> {
    public static byte[] A01 = null;
    public static String[] A02 = {"tpMJzZrhhsrMkwhOFEYR9GbFlaKVIskH", "YlBA8T7Fro2", "USXGP8OuBAzNSq5CbRyfQ0SKNWZdvns1", "IwkjEd2x85ogj6Hkpqc", "vhSxYEQIRpWfy1n6I2fIJfhoZxh6fLOY", "PMh9AUA5ndLdUxX8KVZJ5S1GU2oeFGKJ", "nfsou9g6KKUnvuudu0UQjvY", "janJ9NtfQ2imEKBo1ypA"};
    public static final long serialVersionUID = 912559;
    @CheckForNull
    @LazyInit
    public transient OI<E> A00;

    public static String A0B(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 70);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A01 = new byte[]{-55, -25, -39, -108, -57, -39, -26, -35, -43, -32, -35, -18, -39, -40, -70, -29, -26, -31, -67, -55, -58, -58, -65, -67, -50, -61, -55, -56, 122, -50, -55, -55, 122, -58, -69, -52, -63, -65};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC1996ld
    public OI<E> A0J() {
        OI<E> oi = this.A00;
        if (oi == null) {
            OI<E> A0M = A0M();
            this.A00 = A0M;
            return A0M;
        }
        return oi;
    }

    public abstract AbstractC2173oj<E> A0N();

    static {
        A0C();
    }

    /* JADX WARN: Incorrect condition in loop: B:6:0x001c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A03(int r6) {
        /*
            r0 = 2
            int r6 = java.lang.Math.max(r6, r0)
            r0 = 751619276(0x2ccccccc, float:5.8207657E-12)
            r4 = 1
            if (r6 >= r0) goto L22
            int r0 = r6 + (-1)
            int r5 = java.lang.Integer.highestOneBit(r0)
            int r5 = r5 << r4
        L12:
            double r3 = (double) r5
            r0 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r3 = r3 * r0
            double r1 = (double) r6
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L21
            int r5 = r5 << 1
            goto L12
        L21:
            return r5
        L22:
            r3 = 1073741824(0x40000000, float:2.0)
            if (r6 >= r3) goto L34
        L26:
            r2 = 18
            r1 = 20
            r0 = 20
            java.lang.String r0 = A0B(r2, r1, r0)
            com.facebook.ads.redexgen.X.AbstractC1790iD.A0E(r4, r0)
            return r3
        L34:
            r4 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.OG.A03(int):int");
    }

    public static <E> OG<E> A04(int n10, Object... elements) {
        Object[] objArr = elements;
        switch (n10) {
            case 0:
                C3V A09 = A09();
                if (A02[1].length() == 11) {
                    A02[6] = "xMSzqHeYX9fl0z6G3xaNHOB";
                    return A09;
                }
                break;
            case 1:
                return A0A(Objects.requireNonNull(objArr[0]));
            default:
                int A03 = A03(n10);
                Object[] objArr2 = new Object[A03];
                int i10 = A03 - 1;
                int uniques = 0;
                int i11 = 0;
                for (int j10 = 0; j10 < n10; j10++) {
                    Object A00 = AbstractC2111nU.A00(objArr[j10], j10);
                    int hashCode = A00.hashCode();
                    int tableSize = AbstractC1990lX.A00(hashCode);
                    while (true) {
                        int i12 = tableSize & i10;
                        Object obj = objArr2[i12];
                        if (obj == null) {
                            int index = i11 + 1;
                            int tableSize2 = A02[3].length();
                            if (tableSize2 == 32) {
                                break;
                            } else {
                                String[] strArr = A02;
                                strArr[0] = "Zw143axrDatzvvuiLOoxXPNJBQDLOllI";
                                strArr[2] = "imRh362HWPXwfaqxgHfljoqeqcFI5Kex";
                                objArr[i11] = A00;
                                objArr2[i12] = A00;
                                uniques += hashCode;
                                i11 = index;
                            }
                        } else if (obj.equals(A00)) {
                            break;
                        } else {
                            tableSize++;
                        }
                    }
                }
                Arrays.fill(objArr, i11, n10, (Object) null);
                if (i11 == 1) {
                    return new C04752x(Objects.requireNonNull(objArr[0]));
                }
                int tableSize3 = A03(i11);
                if (tableSize3 < A03 / 2) {
                    return A04(i11, objArr);
                }
                if (A0D(i11, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i11);
                }
                return new C3V(objArr, uniques, objArr2, i10, i11);
        }
        throw new RuntimeException();
    }

    public static <E> OG<E> A05(E e12, E e22) {
        return A04(2, e12, e22);
    }

    public static <E> OG<E> A06(E e12, E e22, E e32) {
        return A04(3, e12, e22, e32);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OG != com.google.common.collect.ImmutableSet<E> */
    public static <E> OG<E> A07(Collection<? extends E> elements) {
        if ((elements instanceof OG) && !(elements instanceof SortedSet)) {
            OG<E> og = (OG) elements;
            if (!og.A0K()) {
                return og;
            }
        }
        Object[] array = elements.toArray();
        int length = array.length;
        if (A02[3].length() != 32) {
            A02[4] = "vJyPhnBCGNruVJXdAMH0mrO2J76B9Swt";
            return A04(length, array);
        }
        throw new RuntimeException();
    }

    public static <E> OG<E> A08(E[] elements) {
        switch (elements.length) {
            case 0:
                return A09();
            case 1:
                C04752x A0A = A0A(elements[0]);
                if (A02[3].length() != 32) {
                    A02[7] = "14gyZ0VPjhYiFYlwFK2N";
                    return A0A;
                }
                throw new RuntimeException();
            default:
                return A04(elements.length, (Object[]) elements.clone());
        }
    }

    public static <E> OG<E> A09() {
        return C3V.A05;
    }

    public static <E> OG<E> A0A(E element) {
        return new C04752x(element);
    }

    public static boolean A0D(int actualUnique, int expectedUnique) {
        return actualUnique < (expectedUnique >> 1) + (expectedUnique >> 2);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OG != com.google.common.collect.ImmutableSet<E> */
    public OI<E> A0M() {
        return OI.A06(toArray());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OG != com.google.common.collect.ImmutableSet<E> */
    public boolean A0O() {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OG != com.google.common.collect.ImmutableSet<E> */
    @Override // java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if ((object instanceof OG) && A0O() && ((OG) object).A0O() && hashCode() != object.hashCode()) {
            return false;
        }
        return AbstractC2136nx.A09(this, object);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OG != com.google.common.collect.ImmutableSet<E> */
    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC2136nx.A00(this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OG != com.google.common.collect.ImmutableSet<E> */
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException(A0B(0, 18, 46));
    }
}

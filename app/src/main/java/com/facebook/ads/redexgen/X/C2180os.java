package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
/* renamed from: com.facebook.ads.redexgen.X.os  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2180os extends AbstractList<Integer> implements RandomAccess, Serializable {
    public static byte[] A03;
    public static String[] A04 = {"YU1VDkaJfx0npt5ZCy0wfRWqTvB0gzrf", "HnEPzK", "p4nBQ52ikpMWjKifemE03jhF", "yEe4449S5FSBazETcjdBTZewZPLdBAWq", "Xlyhv", "2ScPcgGnYkk5iwJP9xeXeJNhXWw9hNmB", "BfGEj8ajDZOUDr9MhSeGOx8aXIdVpKot", "7ounehwY5pAPt7bmg9fcb1FAHFBm19vl"};
    public static final long serialVersionUID = 0;
    public final int A00;
    public final int A01;
    public final int[] A02;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 102);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-87, -99};
    }

    static {
        A03();
    }

    public C2180os(int[] array) {
        this(array, 0, array.length);
    }

    public C2180os(int[] array, int start, int end) {
        this.A02 = array;
        this.A01 = start;
        this.A00 = end;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* renamed from: A00 */
    public final Integer get(int index) {
        AbstractC1790iD.A00(index, size());
        return Integer.valueOf(this.A02[this.A01 + index]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* renamed from: A01 */
    public final Integer set(int index, Integer element) {
        AbstractC1790iD.A00(index, size());
        int i10 = this.A02[this.A01 + index];
        int oldValue = ((Integer) AbstractC1790iD.A04(element)).intValue();
        this.A02[this.A01 + index] = oldValue;
        return Integer.valueOf(i10);
    }

    public final int[] A04() {
        return Arrays.copyOfRange(this.A02, this.A01, this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@CheckForNull Object target) {
        int A05;
        if (target instanceof Integer) {
            A05 = AbstractC0985Nn.A05(this.A02, ((Integer) target).intValue(), this.A01, this.A00);
            if (A05 != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        boolean z10 = object instanceof C2180os;
        if (A04[2].length() != 24) {
            throw new RuntimeException();
        }
        A04[2] = "hkNtVJfoNZugUfjtOIkeX8Ri";
        if (z10) {
            C2180os c2180os = (C2180os) object;
            int size = size();
            if (c2180os.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int size2 = this.A02[this.A01 + i10];
                if (size2 != c2180os.A02[c2180os.A01 + i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(object);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r3 = this;
            r1 = 1
            int r2 = r3.A01
        L3:
            int r0 = r3.A00
            if (r2 >= r0) goto L15
            int r1 = r1 * 31
            int[] r0 = r3.A02
            r0 = r0[r2]
            int r0 = com.facebook.ads.redexgen.X.AbstractC0985Nn.A00(r0)
            int r1 = r1 + r0
            int r2 = r2 + 1
            goto L3
        L15:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C2180os.hashCode():int");
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(@CheckForNull Object target) {
        int i10;
        if (target instanceof Integer) {
            int[] iArr = this.A02;
            String[] strArr = A04;
            if (strArr[6].charAt(15) != strArr[5].charAt(15)) {
                String[] strArr2 = A04;
                strArr2[6] = "lB9Ee3UdEb1Lo8jQSlnhxnRY63rogU68";
                strArr2[5] = "23HXI0mrZUyV0MEjy70kUSUiY9qLKHl0";
                i10 = AbstractC0985Nn.A05(iArr, ((Integer) target).intValue(), this.A01, this.A00);
                if (i10 >= 0) {
                    return i10 - this.A01;
                }
                return -1;
            }
            throw new RuntimeException();
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0004, code lost:
        r1 = com.facebook.ads.redexgen.X.AbstractC0985Nn.A06(r4.A02, ((java.lang.Integer) r5).intValue(), r4.A01, r4.A00);
     */
    @Override // java.util.AbstractList, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 == 0) goto L1a
            int[] r3 = r4.A02
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r2 = r5.intValue()
            int r1 = r4.A01
            int r0 = r4.A00
            int r1 = com.facebook.ads.redexgen.X.AbstractC0985Nn.A08(r3, r2, r1, r0)
            if (r1 < 0) goto L1a
            int r0 = r4.A01
            int r1 = r1 - r0
            return r1
        L1a:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C2180os.lastIndexOf(java.lang.Object):int");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00 - this.A01;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<Integer> subList(int fromIndex, int toIndex) {
        int size = size();
        AbstractC1790iD.A0B(fromIndex, toIndex, size);
        if (fromIndex == toIndex) {
            return Collections.emptyList();
        }
        return new C2180os(this.A02, this.A01 + fromIndex, this.A01 + toIndex);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[').append(this.A02[this.A01]);
        for (int i10 = this.A01 + 1; i10 < this.A00; i10++) {
            sb.append(A02(0, 2, 23)).append(this.A02[i10]);
        }
        StringBuilder builder = sb.append(']');
        return builder.toString();
    }
}

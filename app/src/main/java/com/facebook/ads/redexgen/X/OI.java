package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
@ElementTypesAreNonnullByDefault
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class OI<E> extends AbstractC1996ld<E> implements List<E>, RandomAccess {
    public static byte[] A00 = null;
    public static String[] A01 = {"fHdUBkHaeOb", "RH", "RyMA6PTlrDF2m99nGPMPg2CjhSKVyaSQ", "ENegzNvFlexY3BR2RKk1z4PrLej5P8FF", "wggVriGK93MfFtYQABEEs6Hvem71Ew8R", "ul6RrA3f2JvHqPW8xA7h0PXskLz1uboQ", "Eo8bayYlVcx2q99x4ketqZKtcr", "wTUtZUDKElMjm9Nu5uZgljoHw4l"};
    public static final AbstractC0987Np<Object> A02;
    public static final long serialVersionUID = -889275714;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static <E> OI<E> A05(Collection<? extends E> elements) {
        if (elements instanceof AbstractC1996ld) {
            OI<E> A0J = ((AbstractC1996ld) elements).A0J();
            return A0J.A0K() ? A06(A0J.toArray()) : A0J;
        }
        return A08(elements.toArray());
    }

    public static String A0A(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[0].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A01[1] = "b9";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 22);
            i13++;
        }
    }

    public static void A0B() {
        A00 = new byte[]{120, 94, 72, 13, 126, 72, 95, 68, 76, 65, 68, 87, 72, 73, 107, 66, 95, 64};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    static {
        A0B();
        A02 = new C04070g(C04953r.A02, 0);
    }

    public static <E> C4T<E> A01() {
        return new C4T<>();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<E> */
    private final OI<E> A02(final int fromIndex, int toIndex) {
        final int i10 = toIndex - fromIndex;
        return new OI<E>(fromIndex, i10) { // from class: com.facebook.ads.redexgen.X.4Q
            public final transient int A00;
            public final transient int A01;

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4Q != com.google.common.collect.ImmutableList<E>$SubList */
            {
                this.A01 = fromIndex;
                this.A00 = i10;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4Q != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.X.AbstractC1996ld
            public final int A0G() {
                return OI.this.A0H() + this.A01 + this.A00;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4Q != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.X.AbstractC1996ld
            public final int A0H() {
                return OI.this.A0H() + this.A01;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4Q != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.X.AbstractC1996ld
            public final boolean A0K() {
                return true;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4Q != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.X.AbstractC1996ld
            @CheckForNull
            public final Object[] A0L() {
                return OI.this.A0L();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4Q != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.X.OI, java.util.List
            /* renamed from: A0M */
            public final OI<E> subList(int fromIndex2, int toIndex2) {
                AbstractC1790iD.A0B(fromIndex2, toIndex2, this.A00);
                return OI.this.subList(this.A01 + fromIndex2, this.A01 + toIndex2);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4Q != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // java.util.List
            public final E get(int index) {
                AbstractC1790iD.A00(index, this.A00);
                return OI.this.get(this.A01 + index);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4Q != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.X.OI, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
            public final /* bridge */ /* synthetic */ Iterator iterator() {
                return iterator();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4Q != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.X.OI, java.util.List
            public final /* bridge */ /* synthetic */ ListIterator listIterator() {
                return listIterator();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4Q != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.X.OI, java.util.List
            public final /* bridge */ /* synthetic */ ListIterator listIterator(int index) {
                return super.listIterator(index);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4Q != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.A00;
            }
        };
    }

    public static <E> OI<E> A03() {
        return (OI<E>) C04953r.A02;
    }

    public static <E> OI<E> A04(E element) {
        return A08(element);
    }

    public static <E> OI<E> A06(Object[] elements) {
        return A09(elements, elements.length);
    }

    public static <E> OI<E> A07(E[] elements) {
        if (elements.length == 0) {
            return A03();
        }
        return A08((Object[]) elements.clone());
    }

    public static <E> OI<E> A08(Object... elements) {
        return A06(AbstractC2111nU.A03(elements));
    }

    public static <E> OI<E> A09(Object[] elements, int length) {
        if (length == 0) {
            return A03();
        }
        return new C04953r(elements, length);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<E> */
    @Override // com.facebook.ads.redexgen.X.AbstractC1996ld
    public int A0I(Object[] dst, int offset) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            int i11 = offset + i10;
            dst[i11] = get(i10);
        }
        return offset + size;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<E> */
    @Override // com.facebook.ads.redexgen.X.AbstractC1996ld
    @Deprecated
    public final OI<E> A0J() {
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    /* renamed from: A0M */
    public OI<E> subList(int fromIndex, int toIndex) {
        AbstractC1790iD.A0B(fromIndex, toIndex, size());
        int i10 = toIndex - fromIndex;
        int length = size();
        if (i10 == length) {
            return this;
        }
        if (i10 == 0) {
            return A03();
        }
        return A02(fromIndex, toIndex);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: A0N */
    public final AbstractC2173oj<E> iterator() {
        return listIterator();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    /* renamed from: A0O */
    public final AbstractC0987Np<E> listIterator() {
        return listIterator(0);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    /* renamed from: A0P */
    public AbstractC0987Np<E> listIterator(int index) {
        AbstractC1790iD.A01(index, size());
        if (isEmpty()) {
            return (AbstractC0987Np<E>) A02;
        }
        return new C04070g(this, index);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    @Deprecated
    public final void add(int index, E element) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int index, Collection<? extends E> newElements) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<E> */
    @Override // com.facebook.ads.redexgen.X.AbstractC1996ld, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object object) {
        return indexOf(object) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        return AbstractC2064mj.A06(this, obj);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    public int indexOf(@CheckForNull Object object) {
        if (object == null) {
            return -1;
        }
        return AbstractC2064mj.A00(this, object);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    public int lastIndexOf(@CheckForNull Object object) {
        if (object == null) {
            return -1;
        }
        return AbstractC2064mj.A01(this, object);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<E> */
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException(A0A(0, 18, 59));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    @Deprecated
    public final E remove(int index) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    @Deprecated
    public final E set(int index, E element) {
        throw new UnsupportedOperationException();
    }
}

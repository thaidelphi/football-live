package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.errorprone.annotations.DoNotMock;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;
import javax.annotation.CheckForNull;
@DoNotMock("Use ImmutableList.of or another implementation")
@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.ld  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1996ld<E> extends AbstractCollection<E> implements Serializable {
    public static byte[] A00 = null;
    public static final Object[] A01;
    public static final long serialVersionUID = 912559;

    public static String A0E(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 89);
        }
        return new String(copyOfRange);
    }

    public static void A0F() {
        A00 = new byte[]{-7, 23, 9, -60, -9, 9, 22, 13, 5, 16, 13, 30, 9, 8, -22, 19, 22, 17};
    }

    public abstract int A0I(Object[] dst, int offset);

    public abstract OI<E> A0J();

    public abstract boolean A0K();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(@CheckForNull Object object);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] other) {
        AbstractC1790iD.A04(other);
        int size = size();
        if (other.length < size) {
            Object[] A0L = A0L();
            if (A0L != null) {
                return (T[]) AbstractC2117nb.A02(A0L, A0H(), A0G(), other);
            }
            other = (T[]) AbstractC2111nU.A05(other, size);
        } else if (other.length > size) {
            other[size] = null;
        }
        A0I(other, 0);
        return other;
    }

    static {
        A0F();
        A01 = new Object[0];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ld != com.google.common.collect.ImmutableCollection<E> */
    public int A0G() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ld != com.google.common.collect.ImmutableCollection<E> */
    public int A0H() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ld != com.google.common.collect.ImmutableCollection<E> */
    @CheckForNull
    public Object[] A0L() {
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ld != com.google.common.collect.ImmutableCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e8) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ld != com.google.common.collect.ImmutableCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> newElements) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ld != com.google.common.collect.ImmutableCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ld != com.google.common.collect.ImmutableCollection<E> */
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException(A0E(0, 18, 75));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ld != com.google.common.collect.ImmutableCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(@CheckForNull Object object) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ld != com.google.common.collect.ImmutableCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> oldElements) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ld != com.google.common.collect.ImmutableCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> elementsToKeep) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ld != com.google.common.collect.ImmutableCollection<E> */
    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ld != com.google.common.collect.ImmutableCollection<E> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(A01);
    }
}

package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import javax.annotation.CheckForNull;
@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.2x  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C04752x<E> extends OG<E> {
    public final transient E A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.google.common.collect.SingletonImmutableSet<E> */
    public C04752x(E element) {
        this.A00 = (E) AbstractC1790iD.A04(element);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.X.AbstractC1996ld
    public final int A0I(Object[] dst, int offset) {
        dst[offset] = this.A00;
        return offset + 1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.X.OG, com.facebook.ads.redexgen.X.AbstractC1996ld
    public final OI<E> A0J() {
        return OI.A04(this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.X.AbstractC1996ld
    public final boolean A0K() {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: A0N */
    public final AbstractC2173oj<E> iterator() {
        return AbstractC2043mO.A03(this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.X.AbstractC1996ld, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object target) {
        return this.A00.equals(target);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.X.OG, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2x != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // java.util.AbstractCollection
    public final String toString() {
        return '[' + this.A00.toString() + ']';
    }
}

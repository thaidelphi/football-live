package com.facebook.ads.redexgen.X;

import com.google.common.collect.ParametricNullness;
import java.util.Comparator;
import java.util.SortedSet;
import javax.annotation.CheckForNull;
/* renamed from: com.facebook.ads.redexgen.X.2y  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C04762y<E> extends C0988Nq<E> implements SortedSet<E> {
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2y != com.google.common.collect.Sets$FilteredSortedSet<E> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.iE != com.google.common.base.Predicate<? super E> */
    public C04762y(SortedSet<E> unfiltered, InterfaceC1791iE<? super E> predicate) {
        super(unfiltered, predicate);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2y != com.google.common.collect.Sets$FilteredSortedSet<E> */
    @Override // java.util.SortedSet
    @CheckForNull
    public final Comparator<? super E> comparator() {
        return ((SortedSet) this.A01).comparator();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2y != com.google.common.collect.Sets$FilteredSortedSet<E> */
    @Override // java.util.SortedSet
    @ParametricNullness
    public final E first() {
        return (E) AbstractC2043mO.A06(this.A01.iterator(), this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2y != com.google.common.collect.Sets$FilteredSortedSet<E> */
    @Override // java.util.SortedSet
    public final SortedSet<E> headSet(@ParametricNullness E toElement) {
        return new C04762y(((SortedSet) this.A01).headSet(toElement), this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2y != com.google.common.collect.Sets$FilteredSortedSet<E> */
    /* JADX WARN: Type inference failed for: r1v0, types: [E, java.lang.Object] */
    @Override // java.util.SortedSet
    @ParametricNullness
    public E last() {
        SortedSet sortedSet = (SortedSet) this.A01;
        while (true) {
            ?? r12 = (Object) sortedSet.last();
            if (this.A00.A42(r12)) {
                return r12;
            }
            sortedSet = sortedSet.headSet(r12);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2y != com.google.common.collect.Sets$FilteredSortedSet<E> */
    @Override // java.util.SortedSet
    public final SortedSet<E> subSet(@ParametricNullness E fromElement, @ParametricNullness E toElement) {
        return new C04762y(((SortedSet) this.A01).subSet(fromElement, toElement), this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2y != com.google.common.collect.Sets$FilteredSortedSet<E> */
    @Override // java.util.SortedSet
    public final SortedSet<E> tailSet(@ParametricNullness E fromElement) {
        return new C04762y(((SortedSet) this.A01).tailSet(fromElement), this.A00);
    }
}

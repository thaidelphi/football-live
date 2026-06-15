package com.facebook.ads.redexgen.X;

import com.google.common.collect.ParametricNullness;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
/* JADX INFO: Add missing generic type declarations: [V] */
/* renamed from: com.facebook.ads.redexgen.X.jJ  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1856jJ<V> implements Iterator<V> {
    public final Collection<V> A00;
    public final Iterator<V> A01;
    public final /* synthetic */ C1857jK A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jJ != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection$WrappedIterator */
    public C1856jJ(final C1857jK this$1) {
        Iterator<V> A05;
        this.A02 = this$1;
        this.A00 = this.A02.A00;
        A05 = C4U.A05(this$1.A00);
        this.A01 = A05;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jJ != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection$WrappedIterator */
    public C1856jJ(final C1857jK this$1, Iterator<V> delegateIterator) {
        this.A02 = this$1;
        this.A00 = this.A02.A00;
        this.A01 = delegateIterator;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jJ != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection$WrappedIterator */
    private final void A01() {
        this.A02.A04();
        if (this.A02.A00 == this.A00) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jJ != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection$WrappedIterator */
    public final Iterator<V> A02() {
        A01();
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jJ != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection$WrappedIterator */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        A01();
        return this.A01.hasNext();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jJ != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection$WrappedIterator */
    @Override // java.util.Iterator
    @ParametricNullness
    public final V next() {
        A01();
        return this.A01.next();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jJ != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection$WrappedIterator */
    @Override // java.util.Iterator
    public final void remove() {
        this.A01.remove();
        C4U.A01(this.A02.A04);
        this.A02.A05();
    }
}

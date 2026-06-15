package com.facebook.ads.redexgen.X;

import com.google.common.collect.ParametricNullness;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.CheckForNull;
/* JADX INFO: Add missing generic type declarations: [V] */
/* renamed from: com.facebook.ads.redexgen.X.Oc  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1000Oc<V> extends C4U<K, V>.WrappedCollection implements List<V> {
    public final /* synthetic */ C4U A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // java.util.List
    public final boolean addAll(int index, Collection<? extends V> c10) {
        if (c10.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = A06().addAll(index, c10);
        if (addAll) {
            C4U.A02(this.A00, A02().size() - size);
            if (size == 0) {
                A03();
            }
        }
        return addAll;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Oc != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jK != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection */
    /* JADX WARN: Incorrect inner types in method signature: (TK;Ljava/util/List<TV;>;Lcom/facebook/ads/redexgen/X/4U<TK;TV;>.WrappedCollection;)V */
    public C1000Oc(@ParametricNullness final C4U this$0, @CheckForNull Object key, List delegate, C1857jK ancestor) {
        super(this$0, key, delegate, ancestor);
        this.A00 = this$0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Oc != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    public final List<V> A06() {
        return (List) A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Oc != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    @Override // java.util.List
    public final void add(@ParametricNullness int index, V element) {
        A04();
        boolean isEmpty = A02().isEmpty();
        A06().add(index, element);
        C4U.A00(this.A00);
        if (isEmpty) {
            A03();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Oc != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    @Override // java.util.List
    @ParametricNullness
    public final V get(int index) {
        A04();
        return A06().get(index);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Oc != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    @Override // java.util.List
    public final int indexOf(@CheckForNull Object o10) {
        A04();
        return A06().indexOf(o10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Oc != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object o10) {
        A04();
        return A06().lastIndexOf(o10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Oc != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    @Override // java.util.List
    public final ListIterator<V> listIterator() {
        A04();
        return new C1001Od(this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Oc != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    @Override // java.util.List
    public final ListIterator<V> listIterator(int index) {
        A04();
        return new C1001Od(this, index);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Oc != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    @Override // java.util.List
    @ParametricNullness
    public final V remove(int index) {
        A04();
        V remove = A06().remove(index);
        C4U.A01(this.A00);
        A05();
        return remove;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Oc != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    @Override // java.util.List
    @ParametricNullness
    public final V set(@ParametricNullness int index, V element) {
        A04();
        return A06().set(index, element);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Oc != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    @Override // java.util.List
    public final List<V> subList(int fromIndex, int toIndex) {
        A04();
        return this.A00.A0H(A01(), A06().subList(fromIndex, toIndex), A00() == null ? this : A00());
    }
}

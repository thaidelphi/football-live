package com.facebook.ads.redexgen.X;

import com.google.common.collect.ParametricNullness;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;
/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.4V  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C4V<K, V> extends C4U<K, V>.AsMap implements SortedMap<K, Collection<V>> {
    @CheckForNull
    public SortedSet<K> A00;
    public final /* synthetic */ C4U A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // java.util.SortedMap, java.util.Map
    /* renamed from: A0D */
    public SortedSet<K> keySet() {
        SortedSet<K> sortedSet = this.A00;
        if (sortedSet == null) {
            SortedSet<K> A0C = A0C();
            this.A00 = A0C;
            return A0C;
        }
        return sortedSet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4V != com.google.common.collect.AbstractMapBasedMultimap<K, V>$SortedAsMap */
    public C4V(final C4U this$0, SortedMap<K, Collection<V>> submap) {
        super(this$0, submap);
        this.A01 = this$0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4V != com.google.common.collect.AbstractMapBasedMultimap<K, V>$SortedAsMap */
    public SortedMap<K, Collection<V>> A0B() {
        return (SortedMap) this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4V != com.google.common.collect.AbstractMapBasedMultimap<K, V>$SortedAsMap */
    public SortedSet<K> A0C() {
        return new C04080h(this.A01, A0B());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4V != com.google.common.collect.AbstractMapBasedMultimap<K, V>$SortedAsMap */
    @Override // java.util.SortedMap
    @CheckForNull
    public final Comparator<? super K> comparator() {
        return A0B().comparator();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4V != com.google.common.collect.AbstractMapBasedMultimap<K, V>$SortedAsMap */
    @Override // java.util.SortedMap
    @ParametricNullness
    public final K firstKey() {
        return A0B().firstKey();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4V != com.google.common.collect.AbstractMapBasedMultimap<K, V>$SortedAsMap */
    @Override // java.util.SortedMap
    public SortedMap<K, Collection<V>> headMap(@ParametricNullness K toKey) {
        return new C4V(this.A01, A0B().headMap(toKey));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4V != com.google.common.collect.AbstractMapBasedMultimap<K, V>$SortedAsMap */
    @Override // java.util.SortedMap
    @ParametricNullness
    public final K lastKey() {
        return A0B().lastKey();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4V != com.google.common.collect.AbstractMapBasedMultimap<K, V>$SortedAsMap */
    @Override // java.util.SortedMap
    public SortedMap<K, Collection<V>> subMap(@ParametricNullness K fromKey, @ParametricNullness K toKey) {
        return new C4V(this.A01, A0B().subMap(fromKey, toKey));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4V != com.google.common.collect.AbstractMapBasedMultimap<K, V>$SortedAsMap */
    @Override // java.util.SortedMap
    public SortedMap<K, Collection<V>> tailMap(@ParametricNullness K fromKey) {
        return new C4V(this.A01, A0B().tailMap(fromKey));
    }
}

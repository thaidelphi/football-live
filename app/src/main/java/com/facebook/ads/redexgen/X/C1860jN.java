package com.facebook.ads.redexgen.X;

import java.util.AbstractCollection;
import java.util.Iterator;
import javax.annotation.CheckForNull;
/* JADX INFO: Add missing generic type declarations: [V] */
/* renamed from: com.facebook.ads.redexgen.X.jN  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1860jN<V> extends AbstractCollection<V> {
    public final /* synthetic */ AbstractC0999Ob A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jN != com.google.common.collect.AbstractMultimap<K, V>$Values */
    public C1860jN(final AbstractC0999Ob this$0) {
        this.A00 = this$0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jN != com.google.common.collect.AbstractMultimap<K, V>$Values */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jN != com.google.common.collect.AbstractMultimap<K, V>$Values */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object o10) {
        return this.A00.A03(o10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jN != com.google.common.collect.AbstractMultimap<K, V>$Values */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return this.A00.A0C();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jN != com.google.common.collect.AbstractMultimap<K, V>$Values */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.A00.size();
    }
}

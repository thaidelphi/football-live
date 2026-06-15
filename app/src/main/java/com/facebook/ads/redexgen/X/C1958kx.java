package com.facebook.ads.redexgen.X;

import java.util.AbstractCollection;
import java.util.Iterator;
/* JADX INFO: Add missing generic type declarations: [V] */
/* renamed from: com.facebook.ads.redexgen.X.kx  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1958kx<V> extends AbstractCollection<V> {
    public final /* synthetic */ C1959ky A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kx != com.google.common.collect.CompactHashMap<K, V>$ValuesView */
    public C1958kx(final C1959ky this$0) {
        this.A00 = this$0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kx != com.google.common.collect.CompactHashMap<K, V>$ValuesView */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kx != com.google.common.collect.CompactHashMap<K, V>$ValuesView */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return this.A00.A0f();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kx != com.google.common.collect.CompactHashMap<K, V>$ValuesView */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.A00.size();
    }
}

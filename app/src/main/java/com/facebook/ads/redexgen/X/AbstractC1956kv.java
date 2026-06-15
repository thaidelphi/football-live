package com.facebook.ads.redexgen.X;

import com.google.common.collect.ParametricNullness;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: com.facebook.ads.redexgen.X.kv  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1956kv<T> implements Iterator<T> {
    public int A00;
    public int A01;
    public int A02;
    public final /* synthetic */ C1959ky A03;

    @ParametricNullness
    public abstract T A03(int entry);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kv != com.google.common.collect.CompactHashMap<K, V>$Itr<T> */
    public AbstractC1956kv(final C1959ky this$0) {
        int i10;
        this.A03 = this$0;
        i10 = this.A03.A03;
        this.A01 = i10;
        this.A00 = this.A03.A0a();
        this.A02 = -1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kv != com.google.common.collect.CompactHashMap<K, V>$Itr<T> */
    public /* synthetic */ AbstractC1956kv(C1959ky c1959ky, OX ox) {
        this(c1959ky);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kv != com.google.common.collect.CompactHashMap<K, V>$Itr<T> */
    private void A01() {
        int i10;
        i10 = this.A03.A03;
        if (i10 == this.A01) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kv != com.google.common.collect.CompactHashMap<K, V>$Itr<T> */
    private final void A02() {
        this.A01 += 32;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kv != com.google.common.collect.CompactHashMap<K, V>$Itr<T> */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00 >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kv != com.google.common.collect.CompactHashMap<K, V>$Itr<T> */
    @Override // java.util.Iterator
    @ParametricNullness
    public final T next() {
        A01();
        if (hasNext()) {
            this.A02 = this.A00;
            T A03 = A03(this.A00);
            this.A00 = this.A03.A0b(this.A00);
            return A03;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kv != com.google.common.collect.CompactHashMap<K, V>$Itr<T> */
    @Override // java.util.Iterator
    public final void remove() {
        Object A0E;
        A01();
        AbstractC1949ko.A04(this.A02 >= 0);
        A02();
        C1959ky c1959ky = this.A03;
        A0E = this.A03.A0E(this.A02);
        c1959ky.remove(A0E);
        this.A00 = this.A03.A0c(this.A00, this.A02);
        this.A02 = -1;
    }
}

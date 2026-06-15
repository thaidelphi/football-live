package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.Ob  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC0999Ob<K, V> implements InterfaceC2098nH<K, V> {
    @CheckForNull
    @LazyInit
    public transient Collection<V> A00;
    @CheckForNull
    @LazyInit
    public transient Map<K, Collection<V>> A01;
    @CheckForNull
    @LazyInit
    public transient Set<K> A02;

    public abstract Map<K, Collection<V>> A00();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public Set<K> A01() {
        Set<K> set = this.A02;
        if (set == null) {
            Set<K> A02 = A02();
            this.A02 = A02;
            return A02;
        }
        return set;
    }

    public abstract Set<K> A02();

    public abstract Collection<V> A0B();

    public abstract Iterator<V> A0C();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC2098nH
    public Map<K, Collection<V>> A47() {
        Map<K, Collection<V>> map = this.A01;
        if (map == null) {
            Map<K, Collection<V>> A00 = A00();
            this.A01 = A00;
            return A00;
        }
        return map;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC2098nH
    public Collection<V> values() {
        Collection<V> collection = this.A00;
        if (collection == null) {
            Collection<V> A0B = A0B();
            this.A00 = A0B;
            return A0B;
        }
        return collection;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ob != com.google.common.collect.AbstractMultimap<K, V> */
    public boolean A03(@CheckForNull Object value) {
        for (Collection<V> collection : A47().values()) {
            if (collection.contains(value)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ob != com.google.common.collect.AbstractMultimap<K, V> */
    public boolean equals(@CheckForNull Object object) {
        return AbstractC2103nM.A01(this, object);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ob != com.google.common.collect.AbstractMultimap<K, V> */
    public int hashCode() {
        return A47().hashCode();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ob != com.google.common.collect.AbstractMultimap<K, V> */
    public String toString() {
        return A47().toString();
    }
}

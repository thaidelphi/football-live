package com.facebook.ads.redexgen.X;

import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
/* renamed from: com.facebook.ads.redexgen.X.n1  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC2082n1<K, V> extends AbstractMap<K, V> {
    @CheckForNull
    @LazyInit
    public transient Collection<V> A00;
    @CheckForNull
    @LazyInit
    public transient Set<Map.Entry<K, V>> A01;

    public abstract Set<Map.Entry<K, V>> A09();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.A01;
        if (set == null) {
            Set<Map.Entry<K, V>> A09 = A09();
            this.A01 = A09;
            return A09;
        }
        return set;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.A00;
        if (collection == null) {
            Collection<V> A00 = A00();
            this.A00 = A00;
            return A00;
        }
        return collection;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.n1 != com.google.common.collect.Maps$ViewCachingAbstractMap<K, V> */
    public Collection<V> A00() {
        return new C2081n0(this);
    }
}

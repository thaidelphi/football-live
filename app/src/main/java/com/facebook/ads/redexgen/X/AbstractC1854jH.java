package com.facebook.ads.redexgen.X;

import com.google.common.collect.ParametricNullness;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;
/* renamed from: com.facebook.ads.redexgen.X.jH  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1854jH<T> implements Iterator<T> {
    public static String[] A05 = {"yj7R8PNFUN0fUwX4ptDHVgb9mciI6y8S", "w28O54ZRsma9hL5SDt3wymltcx69iHvf", "YcrQeuLRolqkQfaDcqM9IKWqy1ikOF9U", "DKWy1m0QH6rgUafvBHDUPpGtl2BaSlV6", "o1aBNcvHQhMY4jdZXZXshBAdWZXBL6DV", "37Z8EQ1QZKWXRGLFu1IhCyfwxu1s5rVt", "AbJFenTKTViZI", "TvP3YStRcjl"};
    @CheckForNull
    public K A00;
    @CheckForNull
    public Collection<V> A01;
    public Iterator<V> A02;
    public final Iterator<Map.Entry<K, Collection<V>>> A03;
    public final /* synthetic */ C4U A04;

    public abstract T A00(@ParametricNullness K key, @ParametricNullness V value);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jH != com.google.common.collect.AbstractMapBasedMultimap<K, V>$Itr<T> */
    public AbstractC1854jH(final C4U this$0) {
        Map map;
        this.A04 = this$0;
        map = this$0.A01;
        this.A03 = map.entrySet().iterator();
        this.A00 = null;
        this.A01 = null;
        this.A02 = AbstractC2043mO.A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jH != com.google.common.collect.AbstractMapBasedMultimap<K, V>$Itr<T> */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.A03.hasNext()) {
            boolean hasNext = this.A02.hasNext();
            if (A05[6].length() == 21) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[5] = "pECQkiKXDW2sGX88ia3JmL5aCpMJahaX";
            strArr[4] = "40BbvxkWBVb1JaKod9nJScM88XX6buwm";
            if (!hasNext) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jH != com.google.common.collect.AbstractMapBasedMultimap<K, V>$Itr<T> */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, K] */
    @Override // java.util.Iterator
    @ParametricNullness
    public final T next() {
        if (!this.A02.hasNext()) {
            Map.Entry entry = (Map.Entry) this.A03.next();
            this.A00 = entry.getKey();
            this.A01 = (Collection) entry.getValue();
            Iterator<V> it = this.A01.iterator();
            if (A05[6].length() == 21) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[2] = "8KgPjQMUi9vsfEA6OvWHRw30OGi5ygpx";
            strArr[0] = "pWw8h70m8FKHbc1TiSoELMLej3it9wyW";
            this.A02 = it;
        }
        return A00(AbstractC2110nT.A01(this.A00), this.A02.next());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jH != com.google.common.collect.AbstractMapBasedMultimap<K, V>$Itr<T> */
    @Override // java.util.Iterator
    public final void remove() {
        this.A02.remove();
        if (((Collection) Objects.requireNonNull(this.A01)).isEmpty()) {
            this.A03.remove();
        }
        C4U.A01(this.A04);
    }
}

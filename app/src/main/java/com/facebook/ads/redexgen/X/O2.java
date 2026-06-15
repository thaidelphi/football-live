package com.facebook.ads.redexgen.X;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class O2<K, V> extends AbstractC2133nt<Map.Entry<K, V>> {
    public abstract Map<K, V> A00();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC2133nt, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> c10) {
        try {
            return super.removeAll((Collection) AbstractC1790iD.A04(c10));
        } catch (UnsupportedOperationException unused) {
            return AbstractC2136nx.A0B(this, c10.iterator());
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC2133nt, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> c10) {
        try {
            return super.retainAll((Collection) AbstractC1790iD.A04(c10));
        } catch (UnsupportedOperationException unused) {
            HashSet A06 = AbstractC2136nx.A06(c10.size());
            for (Object obj : c10) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    A06.add(((Map.Entry) obj).getKey());
                }
            }
            return A00().keySet().retainAll(A06);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.O2 != com.google.common.collect.Maps$EntrySet<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        A00().clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.O2 != com.google.common.collect.Maps$EntrySet<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return A00().isEmpty();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.O2 != com.google.common.collect.Maps$EntrySet<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return A00().size();
    }
}

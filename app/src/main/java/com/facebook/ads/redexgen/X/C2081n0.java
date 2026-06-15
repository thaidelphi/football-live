package com.facebook.ads.redexgen.X;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
/* renamed from: com.facebook.ads.redexgen.X.n0  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2081n0<K, V> extends AbstractCollection<V> {
    public static String[] A01 = {"in42tJQ01GZUPWpapY3GS1ba37Q621he", "aDWnks8SkwEFtMvER77PJBAmsGMrEJ6D", "AX4wQMRLKDeL8ngjMfYHLQFqA74wDV2X", "9hok8rTzZXESykboyURYSAJr5s9hilMu", "9Zv0w4TVYcP2oQrIhtVpC4IoTwCIn61q", "DtsNkjQzxYFKhoARFm7ioA0etAdT1uIj", "Qm8i24sVu4QbvSFZB0Cqa", "BgiAdgr6UkIVh80noo0NQyRYH0DUUQhv"};
    public final Map<K, V> A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> c10) {
        try {
            return super.retainAll((Collection) AbstractC1790iD.A04(c10));
        } catch (UnsupportedOperationException unused) {
            HashSet A05 = AbstractC2136nx.A05();
            for (Map.Entry<K, V> entry : A00().entrySet()) {
                if (c10.contains(entry.getValue())) {
                    A05.add(entry.getKey());
                }
            }
            return A00().keySet().retainAll(A05);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.n0 != com.google.common.collect.Maps$Values<K, V> */
    public C2081n0(Map<K, V> map) {
        this.A00 = (Map) AbstractC1790iD.A04(map);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.n0 != com.google.common.collect.Maps$Values<K, V> */
    private final Map<K, V> A00() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.n0 != com.google.common.collect.Maps$Values<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        A00().clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.n0 != com.google.common.collect.Maps$Values<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object o10) {
        return A00().containsValue(o10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.n0 != com.google.common.collect.Maps$Values<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return A00().isEmpty();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.n0 != com.google.common.collect.Maps$Values<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return AbstractC2083n2.A03(A00().entrySet().iterator());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.n0 != com.google.common.collect.Maps$Values<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(@CheckForNull Object o10) {
        Map.Entry<K, V> entry;
        try {
            return super.remove(o10);
        } catch (UnsupportedOperationException unused) {
            Map<K, V> A00 = A00();
            if (A01[6].length() == 21) {
                A01[6] = "aipsxbSp1tnZ2v2drkTfU";
                Iterator<Map.Entry<K, V>> it = A00.entrySet().iterator();
                do {
                    boolean hasNext = it.hasNext();
                    String[] strArr = A01;
                    if (strArr[1].charAt(18) == strArr[5].charAt(18)) {
                        String[] strArr2 = A01;
                        strArr2[0] = "hJKuR3xA1w5y7oQ8WRbWSr1qNuhor3Na";
                        strArr2[3] = "kTeXKTesQI660Qr0JB9qS0JQxEcCo8pe";
                        if (!hasNext) {
                            String[] strArr3 = A01;
                            if (strArr3[1].charAt(18) != strArr3[5].charAt(18)) {
                                A01[6] = "IeB1biIWoxDuKDO5ci7KI";
                                return false;
                            }
                            A01[6] = "wnKimEEcKP0TlLR5z0mvC";
                            return false;
                        }
                        entry = it.next();
                    }
                } while (!AbstractC1013Or.A01(o10, entry.getValue()));
                A00().remove(entry.getKey());
                return true;
            }
            throw new RuntimeException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.n0 != com.google.common.collect.Maps$Values<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> c10) {
        try {
            return super.removeAll((Collection) AbstractC1790iD.A04(c10));
        } catch (UnsupportedOperationException unused) {
            HashSet A05 = AbstractC2136nx.A05();
            Set<Map.Entry<K, V>> entrySet = A00().entrySet();
            String[] strArr = A01;
            if (strArr[2].charAt(30) != strArr[7].charAt(30)) {
                A01[6] = "ER1uMOhoexHNMxXkTRXkp";
                for (Map.Entry<K, V> entry : entrySet) {
                    if (c10.contains(entry.getValue())) {
                        A05.add(entry.getKey());
                    }
                }
                return A00().keySet().removeAll(A05);
            }
            throw new RuntimeException();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.n0 != com.google.common.collect.Maps$Values<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return A00().size();
    }
}

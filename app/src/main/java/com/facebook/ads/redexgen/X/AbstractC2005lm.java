package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.SortedMap;
import javax.annotation.CheckForNull;
@DoNotMock("Use ImmutableMap.of or another implementation")
@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.lm  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC2005lm<K, V> implements Map<K, V>, Serializable {
    public static byte[] A03 = null;
    public static String[] A04 = {"vKCQqMCBbbLRNayk93g", "pkt0IymnSuuTvT2UABZ", "PNc8ARlkPwYFJqJCIOuFP53ZqzL63Ot9", "eX2I8z36J32Go", "gIGV4Wf8BZM4VYT7BzYv5KONe75pspBB", "tYe4jTWn6nAHNSv3aqiqFSpTtkmDAUnf", "8sr0nS9u8yYglBLPy9xKZ", "QmruhXeOtXDmPURP7V7IzoRRfHSq4IXC"};
    public static final Map.Entry<?, ?>[] A05;
    public static final long serialVersionUID = 912559;
    @CheckForNull
    @LazyInit
    public transient AbstractC1996ld<V> A00;
    @CheckForNull
    @LazyInit
    public transient OG<Map.Entry<K, V>> A01;
    @CheckForNull
    @LazyInit
    public transient OG<K> A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static <K, V> AbstractC2005lm<K, V> A05(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        C2003lk c2003lk = new C2003lk(entries instanceof Collection ? ((Collection) entries).size() : 4);
        c2003lk.A04(entries);
        return c2003lk.A07();
    }

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 10);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A03 = new byte[]{103, -123, 119, 50, 101, 119, -124, 123, 115, 126, 123, -116, 119, 118, 88, -127, -124, Byte.MAX_VALUE};
    }

    public abstract AbstractC1996ld<V> A0A();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // java.util.Map
    /* renamed from: A0B */
    public OG<Map.Entry<K, V>> entrySet() {
        OG<Map.Entry<K, V>> og = this.A01;
        if (og == null) {
            OG<Map.Entry<K, V>> A0D = A0D();
            this.A01 = A0D;
            return A0D;
        }
        return og;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // java.util.Map
    /* renamed from: A0C */
    public OG<K> keySet() {
        OG<K> og = this.A02;
        if (og == null) {
            OG<K> A0E = A0E();
            this.A02 = A0E;
            return A0E;
        }
        return og;
    }

    public abstract OG<Map.Entry<K, V>> A0D();

    public abstract OG<K> A0E();

    public abstract boolean A0F();

    @Override // java.util.Map
    @CheckForNull
    public abstract V get(@CheckForNull Object key);

    static {
        A08();
        A05 = new Map.Entry[0];
    }

    public static <K, V> C2003lk<K, V> A03() {
        return new C2003lk<>();
    }

    public static <K, V> AbstractC2005lm<K, V> A04() {
        AbstractC2005lm<K, V> abstractC2005lm = (AbstractC2005lm<K, V>) C0993Nv.A04;
        if (A04[4].charAt(3) != 'V') {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[0] = "QWSx7KQEMPZzsm7sYqB";
        strArr[1] = "rV1plHJifYQu2yuYFjd";
        return abstractC2005lm;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lm != com.google.common.collect.ImmutableMap<K, V> */
    public static <K, V> AbstractC2005lm<K, V> A06(Map<? extends K, ? extends V> map) {
        if ((map instanceof AbstractC2005lm) && !(map instanceof SortedMap)) {
            AbstractC2005lm<K, V> abstractC2005lm = (AbstractC2005lm) map;
            if (!abstractC2005lm.A0F()) {
                return abstractC2005lm;
            }
        }
        return A05(map.entrySet());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ld != com.google.common.collect.ImmutableCollection<V> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lm != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    /* renamed from: A09 */
    public AbstractC1996ld<V> values() {
        AbstractC1996ld<V> abstractC1996ld = this.A00;
        if (abstractC1996ld == null) {
            abstractC1996ld = A0A();
            if (A04[3].length() == 23) {
                throw new RuntimeException();
            }
            A04[6] = "23ujWmcydF5ICCpn56C";
            this.A00 = abstractC1996ld;
        }
        return abstractC1996ld;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lm != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lm != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    public boolean containsKey(@CheckForNull Object key) {
        return get(key) != null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lm != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    public final boolean containsValue(@CheckForNull Object value) {
        return values().contains(value);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lm != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    public boolean equals(@CheckForNull Object object) {
        return AbstractC2083n2.A0B(this, object);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lm != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    @CheckForNull
    public final V getOrDefault(@CheckForNull Object key, @CheckForNull V defaultValue) {
        V result = get(key);
        if (result != null) {
            return result;
        }
        return defaultValue;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lm != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    public int hashCode() {
        return AbstractC2136nx.A00(entrySet());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lm != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lm != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lm != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lm != com.google.common.collect.ImmutableMap<K, V> */
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException(A07(0, 18, 8));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lm != com.google.common.collect.ImmutableMap<K, V> */
    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final V remove(@CheckForNull Object o10) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lm != com.google.common.collect.ImmutableMap<K, V> */
    public final String toString() {
        return AbstractC2083n2.A08(this);
    }
}

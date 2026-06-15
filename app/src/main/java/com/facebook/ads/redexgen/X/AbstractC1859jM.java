package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.CheckForNull;
@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.jM  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1859jM<K, V> implements Map.Entry<K, V> {
    public static byte[] A00;
    public static String[] A01 = {"", "AHmssJtphfILjwQVRES95tupop6kXDQQ", "yJHaEgFHh5vkWuQcGLin5fNpIgHRL", "ccyLBaVl3X5EOQ8kN1enx63wY5xQU5lC", "3LjlCH8sjLmYp1xVnKelHd59e9s4LfUj", "GQEojbmQH74RV7s", "FXhCVdruUKy9z7YPJhdtWoULoWyo0GSZ", "auhNtHWmqaxtUCEmMYI9KHEqFElVZGC8"};

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{26};
    }

    @Override // java.util.Map.Entry
    @ParametricNullness
    public abstract K getKey();

    @Override // java.util.Map.Entry
    @ParametricNullness
    public abstract V getValue();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        V value = getValue();
        return (value != null ? value.hashCode() : 0) ^ (key == null ? 0 : key.hashCode());
    }

    @Override // java.util.Map.Entry
    @ParametricNullness
    public abstract V setValue(@ParametricNullness V value);

    static {
        A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jM != com.google.common.collect.AbstractMapEntry<K, V> */
    @Override // java.util.Map.Entry
    public boolean equals(@CheckForNull Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) object;
            if (AbstractC1013Or.A01(getKey(), entry.getKey())) {
                V value = getValue();
                Object value2 = entry.getValue();
                if (A01[0].length() != 0) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[3] = "YCWNm5eFsX3xC0mwHDsNgk3AXhMAFfWj";
                strArr[6] = "Tjij5fiogIBxnlqsRAm66kaj3TK5HnAa";
                return AbstractC1013Or.A01(value, value2);
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jM != com.google.common.collect.AbstractMapEntry<K, V> */
    public final String toString() {
        return getKey() + A01(0, 1, 108) + getValue();
    }
}

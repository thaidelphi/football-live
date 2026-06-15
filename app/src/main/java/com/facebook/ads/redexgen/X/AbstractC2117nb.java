package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import java.util.Map;
@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.nb  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC2117nb {
    public static <K, V> Map<K, V> A00(int expectedSize) {
        return C1959ky.A0B(expectedSize);
    }

    public static <T> T[] A01(T[] reference, int length) {
        if (reference.length != 0) {
            reference = (T[]) Arrays.copyOf(reference, 0);
        }
        T[] empty = (T[]) Arrays.copyOf(reference, length);
        return empty;
    }

    public static <T> T[] A02(Object[] source, int from, int to, T[] arrayOfType) {
        return (T[]) Arrays.copyOfRange(source, from, to, arrayOfType.getClass());
    }
}

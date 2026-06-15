package com.facebook.ads.redexgen.X;

import com.google.common.primitives.ElementTypesAreNonnullByDefault;
@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.oq  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC2178oq {
    public static int A00(long value) {
        return (int) ((value >>> 32) ^ value);
    }

    public static int A01(long a10, long b10) {
        if (a10 < b10) {
            return -1;
        }
        return a10 > b10 ? 1 : 0;
    }
}

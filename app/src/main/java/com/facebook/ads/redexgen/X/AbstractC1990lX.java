package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import javax.annotation.CheckForNull;
@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.lX  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1990lX {
    public static int A00(int hashCode) {
        return (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
    }

    public static int A01(int expectedEntries, double loadFactor) {
        int max = Math.max(expectedEntries, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (highestOneBit * loadFactor))) {
            int tableSize = highestOneBit << 1;
            if (tableSize > 0) {
                return tableSize;
            }
            return 1073741824;
        }
        return highestOneBit;
    }

    public static int A02(@CheckForNull Object o10) {
        return A00(o10 == null ? 0 : o10.hashCode());
    }
}

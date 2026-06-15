package com.facebook.ads.redexgen.X;

import com.google.android.gms.common.api.Api;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Arrays;
@DoNotMock
/* renamed from: com.facebook.ads.redexgen.X.lc  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1995lc<E> {
    public static byte[] A00;

    static {
        A05();
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 39);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{71, 69, 74, 74, 75, 80, 4, 87, 80, 75, 86, 65, 4, 73, 75, 86, 65, 4, 80, 76, 69, 74, 4, 105, 101, 124, 123, 114, 101, 104, 113, 97, 4, 65, 72, 65, 73, 65, 74, 80, 87};
    }

    public static int A03(int oldCapacity, int minCapacity) {
        if (minCapacity >= 0) {
            int newCapacity = (oldCapacity >> 1) + oldCapacity + 1;
            if (newCapacity < minCapacity) {
                newCapacity = Integer.highestOneBit(minCapacity - 1) << 1;
            }
            if (newCapacity < 0) {
                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            return newCapacity;
        }
        throw new AssertionError(A04(0, 41, 3));
    }
}

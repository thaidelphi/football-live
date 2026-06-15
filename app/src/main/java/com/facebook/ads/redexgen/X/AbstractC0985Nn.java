package com.facebook.ads.redexgen.X;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import com.google.common.primitives.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.Nn  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC0985Nn extends AbstractC2179or {
    public static byte[] A00;
    public static String[] A01 = {"siq85GDJwTeYE", "hCeAcOWL38esGxpCGhAcOByVvpt4rkG9", "m2sukptzj10OlAU9Tp5GtC3mJBPhtf8e", "xjjTaPx7kc7NMEZNqBPsTeRSC2dGu2kw", "w", "lzhISLab9GK0zTqogctfE75BYP1X9oPw", "tkIGufAtpO8Bl63czpB", ""};

    public static String A09(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] ^ i12;
            if (A01[7].length() != 0) {
                throw new RuntimeException();
            }
            A01[7] = "";
            copyOfRange[i13] = (byte) (i14 ^ 72);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{44, 22, 23, 67, 12, 5, 67, 17, 2, 13, 4, 6, 89, 67, 70, 16, 126, 122, 125, 51, 59, 54, 96, 58, 51, 126, 102, 96, 103, 51, 113, 118, 51, Byte.MAX_VALUE, 118, 96, 96, 51, 103, 123, 114, 125, 51, 124, 97, 51, 118, 98, 102, 114, Byte.MAX_VALUE, 51, 103, 124, 51, 126, 114, 107, 51, 59, 54, 96, 58};
    }

    static {
        A0B();
    }

    public static int A00(int value) {
        return value;
    }

    public static int A01(int a10, int b10) {
        if (a10 < b10) {
            return -1;
        }
        return a10 > b10 ? 1 : 0;
    }

    public static int A02(int value, int min, int max) {
        AbstractC1790iD.A0G(min <= max, A09(16, 47, 91), min, max);
        return Math.min(Math.max(value, min), max);
    }

    public static int A03(long value) {
        int i10 = (int) value;
        int result = (i10 > value ? 1 : (i10 == value ? 0 : -1));
        AbstractC1790iD.A0H(result == 0, A09(0, 16, 43), value);
        return i10;
    }

    public static int A04(long value) {
        if (value <= 2147483647L) {
            if (value < -2147483648L) {
                return RecyclerView.UNDEFINED_DURATION;
            }
            return (int) value;
        } else if (A01[7].length() != 0) {
            throw new RuntimeException();
        } else {
            A01[1] = "nVSCb9uBdS4Z5srNqmAxsZ9hxFd1bctQ";
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
    }

    public static int A05(int[] array, int target, int start, int end) {
        while (start < end) {
            int i10 = array[start];
            if (i10 == target) {
                return start;
            }
            start++;
        }
        return -1;
    }

    public static int A06(int[] array, int target, int start, int end) {
        for (int i10 = end - 1; i10 >= start; i10--) {
            int i11 = array[i10];
            if (i11 == target) {
                return i10;
            }
        }
        return -1;
    }

    public static List<Integer> A0A(int... backingArray) {
        if (backingArray.length == 0) {
            return Collections.emptyList();
        }
        return new C2180os(backingArray);
    }

    public static int[] A0C(Collection<? extends Number> collection) {
        if (collection instanceof C2180os) {
            return ((C2180os) collection).A04();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        int len = A01[1].charAt(22);
        if (len != 108) {
            A01[1] = "hGECTcBTlZrQNB5F5BgF8ddu5i2bV8V4";
            for (int i10 = 0; i10 < length; i10++) {
                int len2 = ((Number) AbstractC1790iD.A04(array[i10])).intValue();
                iArr[i10] = len2;
            }
            return iArr;
        }
        throw new RuntimeException();
    }
}

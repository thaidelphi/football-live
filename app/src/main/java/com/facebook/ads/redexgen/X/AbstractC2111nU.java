package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import javax.annotation.CheckForNull;
@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.nU  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC2111nU {
    public static byte[] A00;
    public static String[] A01 = {"c6xksnT41HcsUKTJQNKQUUgPizIoQEq7", "WxNXiQtoIPtkZSOvfQD2WRgz0FRR9nHB", "0W3ozcXeUf0HHNgljiWCV2HF0oAsRQbi", "fgzW1UUUZ", "O0bR9ZeclLezQy3Qbc2ToHrC1rtck2lk", "lkeBgJo9Q0VPEUMwx37sMSkp8PGnIPOP", "djrdLhPsa8uKbU3eQglu3qx0uljp8azj", "xtpRaDH0t"};

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 21);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {37, 48, 100, 45, 42, 32, 33, 60, 100};
        String[] strArr = A01;
        if (strArr[7].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[1] = "M9elCsu2ZKCRxn57Vnxvtjkp0iclIc1e";
        strArr2[2] = "8jrrMw1RDLVSnYLZpZuKU5Zh0pORqyYH";
        A00 = bArr;
    }

    static {
        A02();
    }

    public static Object A00(@CheckForNull Object element, int index) {
        if (element != null) {
            return element;
        }
        throw new NullPointerException(A01(0, 9, 81) + index);
    }

    public static Object[] A03(Object... array) {
        A04(array, array.length);
        return array;
    }

    public static Object[] A04(Object[] array, int length) {
        for (int i10 = 0; i10 < length; i10++) {
            A00(array[i10], i10);
        }
        return array;
    }

    public static <T> T[] A05(T[] reference, int length) {
        return (T[]) AbstractC2117nb.A01(reference, length);
    }
}

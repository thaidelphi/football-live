package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Ny  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0996Ny<V> implements InterfaceC1801iP<List<V>>, Serializable {
    public static byte[] A01;
    public static String[] A02 = {"e5wnLSIbQxkq8Zb8jKmA", "K5DmaQySCrjWvleFa", "LWuY7vQYlXU7vsjuD", "M7ok9ovwGeM", "5nYOTBMz755", "tdWE3UbGCkl2", "in1BIrIvXgLkxgASW", "Nc3XS6cKk9DYxfmxbznhVqbsdMI4LYY"};
    public final int A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] - i12;
            if (A02[0].length() != 20) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[3] = "LeP2zF5PzD6";
            strArr[4] = "FkYvCPAL8bA";
            copyOfRange[i13] = (byte) (i14 - 73);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {10, 29, 21, 10, 8, 25, 10, 9, -5, 6, 17, 26, 10, 24, -11, 10, 23, -16, 10, 30};
        String[] strArr = A02;
        if (strArr[2].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "U6hTL0roTrM";
        strArr2[4] = "z8jhm3qQIoz";
        A01 = bArr;
    }

    static {
        A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ny != com.google.common.collect.MultimapBuilder$ArrayListSupplier<V> */
    public C0996Ny(int expectedValuesPerKey) {
        this.A00 = AbstractC1949ko.A00(expectedValuesPerKey, A00(0, 20, 92));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ny != com.google.common.collect.MultimapBuilder$ArrayListSupplier<V> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1801iP
    /* renamed from: A01 */
    public final List<V> get() {
        return new ArrayList(this.A00);
    }
}

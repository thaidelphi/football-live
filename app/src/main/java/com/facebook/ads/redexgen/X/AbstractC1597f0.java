package com.facebook.ads.redexgen.X;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.f0  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1597f0 {
    public static byte[] A00;
    public static final byte[] A01;
    public static final String[] A02;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 27);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{74, 65, 84, 86, 60, 40, 44, 64, 52, 35, 54, 100, 123, 112, 101, 103, 13, 112, 101, 103, 13, 112, 101, 103, 13, 37, 59, 46, 124, 99, 104, 62, 104, 41, 99, 104, 21, 99, 104, 46, 104, 41};
    }

    static {
        A05();
        A01 = new byte[]{0, 0, 0, 1};
        A02 = new String[]{A02(0, 0, 21), A02(5, 1, 114), A02(6, 1, 117), A02(7, 1, 24)};
    }

    public static Pair<Integer, Integer> A00(byte[] bArr) {
        C1648fq c1648fq = new C1648fq(bArr);
        c1648fq.A0f(9);
        int sampleRate = c1648fq.A0I();
        c1648fq.A0f(20);
        return Pair.create(Integer.valueOf(c1648fq.A0L()), Integer.valueOf(sampleRate));
    }

    public static String A01(int i10, int i11, int i12) {
        return String.format(A02(8, 17, 78), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static String A03(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        StringBuilder sb = new StringBuilder(AbstractC1672gE.A0n(A02(25, 17, 86), A02[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(z10 ? 'H' : 'L'), Integer.valueOf(i13)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb.append(String.format(A02(0, 5, 127), Integer.valueOf(iArr[i14])));
        }
        return sb.toString();
    }

    public static List<byte[]> A04(boolean z10) {
        byte[] bArr = new byte[1];
        if (z10) {
            bArr[0] = 1;
        } else {
            bArr[0] = 0;
        }
        return Collections.singletonList(bArr);
    }

    public static boolean A06(List<byte[]> initializationData) {
        return initializationData.size() == 1 && initializationData.get(0).length == 1 && initializationData.get(0)[0] == 1;
    }

    public static byte[] A07(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[A01.length + i11];
        byte[] bArr3 = A01;
        byte[] nalUnit = A01;
        System.arraycopy(bArr3, 0, bArr2, 0, nalUnit.length);
        byte[] nalUnit2 = A01;
        System.arraycopy(bArr, i10, bArr2, nalUnit2.length, i11);
        return bArr2;
    }
}

package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashSet;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class PS {
    public static boolean A00;
    public static String A01;
    public static byte[] A02;
    public static String[] A03 = {"y8", "W69aXxwfLdDCUuvOQnWkti4CbO80710w", "wboET6kAIPIrP0kk7nrsubpVVimjkQDJ", "qLQ3E54P9QUaqYwPtcANQ", "QmBSSuLAZYEjKuQvpgPXG3BYQbrKFxf0", "uf", "wqdBxIuKersAyrdPXMiJWEDDacu7LRyA", "8ah24QQc"};
    public static final HashSet<String> A04;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = copyOfRange[i13];
            if (A03[2].charAt(6) == 'u') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[4] = "ebeSnx53A00YUYp6cxgobwVSuLDf30R2";
            strArr[7] = "XYbVMrIk";
            copyOfRange[i13] = (byte) ((b10 - i12) - 84);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-106, -118, -67, -59, -59, -67, -124, -69, -50, -59, -124, -71, -59, -56, -69};
    }

    static {
        A02();
        A00 = true;
        A04 = new HashSet<>();
        A01 = A01(2, 13, 2);
    }

    public static synchronized String A00() {
        String str;
        synchronized (PS.class) {
            str = A01;
        }
        return str;
    }

    public static synchronized void A03(String str) {
        synchronized (PS.class) {
            if (A04.add(str)) {
                A01 += A01(0, 2, 22) + str;
            }
        }
    }
}

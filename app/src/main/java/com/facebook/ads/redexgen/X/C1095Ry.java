package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Ry  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1095Ry extends Exception {
    public static byte[] A03;
    public static String[] A04 = {"95zaM27arNp7uSxi3vUrIsngRzFo0qOY", "q3WcZWkyU3QLnqFJYKqIYpEYmmfHoHSv", "wkyi4riHgYDwpvubnd4znkepBANkUPpg", "ta7TtidUsXfHccwuvENymTSfkNOASMzl", "RKGtFRYcAnrusLQD1", "7k5DgXRqefZJ3oMoSIOwyKlSIn9cLFSz", "JCT", "T0eLYYh7EjV5mLHBQ"};
    public final int A00;
    public final ZM A01;
    public final boolean A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A04;
            if (strArr[1].charAt(3) == strArr[5].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[2] = "b0KG1800pxXMnJZWo3hLjHOoS6HNk9C0";
            strArr2[3] = "OIiXajoc9tB79oLpKaeMxZAejTuMhTM2";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 73);
            i13++;
        }
    }

    public static void A01() {
        A03 = new byte[]{-79, -27, -44, -39, -33, -60, -30, -47, -45, -37, -112, -25, -30, -39, -28, -43, -112, -42, -47, -39, -36, -43, -44, -86, -112};
    }

    static {
        A01();
    }

    public C1095Ry(int i10, ZM zm, boolean z10) {
        super(A00(0, 25, 39) + i10);
        this.A02 = z10;
        this.A00 = i10;
        this.A01 = zm;
    }
}

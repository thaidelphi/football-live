package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class RP implements InterfaceC1271Zc {
    public static byte[] A00;
    public static String[] A01 = {"0BabCAxVaGQyYcuzP7xeWcBdxpOSf2ml", "oRMIuFRtPEAQk6KdtHmuHUtsd3yuaj7l", "dg6RRMOIWj6gbHNOYfYCm2oYX7cNAWHX", "ITgKhc8UJFwx06k1Ft7TSonFfA65", "ITJXMHxcfiR8Y3vASsyQCdx9VLU05X", "gS6Yk1beCJeRoKHnFwS80ut2LUudQjpp", "OEN3mI20EU1o5H3Iy4jvAI5Wu5Uqx0Rf", "d2MLwsup9KkIRMHj4n4qkGdMuAJrn4sa"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[3].length() != 28) {
                throw new RuntimeException();
            }
            A01[4] = "rLIg3S9PC6pNqLgEJcW0";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 92);
            i13++;
        }
    }

    public static void A01() {
        A00 = new byte[]{0, 53, 53, 36, 44, 49, 53, 36, 37, 97, 53, 46, 97, 34, 51, 36, 32, 53, 36, 97, 37, 36, 34, 46, 37, 36, 51, 97, 39, 46, 51, 97, 52, 47, 50, 52, 49, 49, 46, 51, 53, 36, 37, 97, 12, 8, 12, 4, 97, 53, 56, 49, 36, 123, 97, 46, 63, 63, 35, 38, 44, 46, 59, 38, 32, 33, 96, 38, 43, 124, 38, 55, 55, 43, 46, 36, 38, 51, 46, 40, 41, 104, 63, 106, 34, 42, 52, 32, 66, 83, 83, 79, 74, 64, 66, 87, 74, 76, 77, 12, 91, 14, 74, 64, 90, 119, 102, 102, 122, Byte.MAX_VALUE, 117, 119, 98, Byte.MAX_VALUE, 121, 120, 57, 110, 59, 101, 117, 98, 115, 37, 35};
    }

    static {
        A01();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1271Zc
    public final V7 A59(ZM zm) {
        char c10;
        String str = zm.A0W;
        if (str != null) {
            switch (str.hashCode()) {
                case -1348231605:
                    String mimeType = A00(88, 17, 127);
                    if (str.equals(mimeType)) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1248341703:
                    String mimeType2 = A01[4];
                    if (mimeType2.length() != 25) {
                        String[] strArr = A01;
                        strArr[7] = "TQMUUE2b9MmImOhv3vTdA5lJniuTDE0E";
                        strArr[1] = "3AM1XustvsffLKc3yuaFNncrfmWYOQba";
                        String mimeType3 = A00(55, 15, 19);
                        if (str.equals(mimeType3)) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    } else {
                        throw new RuntimeException();
                    }
                case 1154383568:
                    String mimeType4 = A00(70, 18, 27);
                    if (str.equals(mimeType4)) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1652648887:
                    String mimeType5 = A00(105, 20, 74);
                    if (str.equals(mimeType5)) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    return new B2();
                case 1:
                    return new BU();
                case 2:
                    return new C0670Av();
                case 3:
                    return new BT();
            }
        }
        StringBuilder sb = new StringBuilder();
        String mimeType6 = A00(0, 55, 29);
        throw new IllegalArgumentException(sb.append(mimeType6).append(str).toString());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1271Zc
    public final boolean AJS(ZM zm) {
        String str = zm.A0W;
        String mimeType = A00(55, 15, 19);
        if (!mimeType.equals(str)) {
            String mimeType2 = A00(70, 18, 27);
            if (!mimeType2.equals(str)) {
                String mimeType3 = A00(105, 20, 74);
                if (!mimeType3.equals(str)) {
                    String mimeType4 = A00(88, 17, 127);
                    if (!mimeType4.equals(str)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

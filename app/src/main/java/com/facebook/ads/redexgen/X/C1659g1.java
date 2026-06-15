package com.facebook.ads.redexgen.X;

import android.view.Surface;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.g1  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1659g1 {
    public static byte[] A04;
    public static String[] A05 = {"tr7UgaBn8MfRlKzFEjPU3cNGLZ28Oxiq", "SSiyVSGJ6hQz242BOUbEdl2xF6daqtbs", "Zh6iZEy8WdNhuL5Fi6okY8bxBH7M1p5A", "Bu5RBUrmJn3X5vat6T5LSTZ5xCkJS78W", "IX6GbAQqWxeqGvRucmLoCmVNWfBshNgH", "scOk0EAj9R2FtWTpCZcRhRn7Mm1BFu2t", "J6pVImi3Vg0NVLjNOUXcRVDOu3Wp6S4P", "s0kW93upWpbEg7TlEvUSQw6A81QRyAYc"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final Surface A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A05[4].charAt(1) != 'X') {
                throw new RuntimeException();
            }
            A05[5] = "tHM7w1oJgLWGsVk4CcA3tD8cYmbx0PcV";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 62);
            i13++;
        }
    }

    public static void A01() {
        A04 = new byte[]{-1, 2, -7, -11, -2, 4, -15, 4, -7, -1, -2, -44, -11, -9, 2, -11, -11, 3, -80, -3, 5, 3, 4, -80, -14, -11, -80, -64, -68, -80, -55, -64, -68, -80, -63, -56, -64, -68, -80, -1, 2, -80, -62, -57, -64};
    }

    static {
        A01();
    }

    public C1659g1(Surface surface, int i10, int i11) {
        this(surface, i10, i11, 0);
    }

    public C1659g1(Surface surface, int i10, int i11, int i12) {
        AbstractC1589es.A09(i12 == 0 || i12 == 90 || i12 == 180 || i12 == 270, A00(0, 45, 82));
        this.A03 = surface;
        this.A02 = i10;
        this.A00 = i11;
        this.A01 = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1659g1) {
            C1659g1 c1659g1 = (C1659g1) obj;
            if (this.A02 == c1659g1.A02 && this.A00 == c1659g1.A00) {
                int i10 = this.A01;
                String[] strArr = A05;
                if (strArr[1].charAt(16) != strArr[6].charAt(16)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[7] = "KZzFtzdl5LUqpanMxhG2tbtm8pjK1JUf";
                strArr2[0] = "Y4mNCgtKissDz6OypWHyXxrA8mIT784H";
                if (i10 == c1659g1.A01 && this.A03.equals(c1659g1.A03)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A03.hashCode();
        int i10 = result * 31;
        int result2 = this.A02;
        int result3 = this.A01;
        return ((((i10 + result2) * 31) + this.A00) * 31) + result3;
    }
}

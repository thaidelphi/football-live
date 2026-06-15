package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.59  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class AnonymousClass59 implements Q7 {
    public static byte[] A00;
    public static String[] A01 = {"hQjWwUQGb27CnTfmJ2XKmwZnqV46EEaa", "XVrbUG9Ao3eeLc1ZpVYW7kgTf20WAzPg", "eTQwxvhwHGpO9b48m4zwgdTsRNTPkvyR", "GRr6DPVtSOBvOajO1LmpDItaKBISQE1K", "yS1TueJUmZoNIT1", "u6RHHQAsF2V2E1xL1UWAwJVthlm7Y08K", "nxfvFM2vY0GPqOvHEIbSGYvarBe", "pZbGhcf0UlPocr8r1ej1VuloyhfIaRAZ"};
    public static final InterfaceC1509dZ A02;
    public static final AnonymousClass59 A03;

    public static /* synthetic */ AnonymousClass59 A00() {
        return new AnonymousClass59();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[1].charAt(18) == strArr[7].charAt(18)) {
                throw new RuntimeException();
            }
            A01[4] = "iIKOhDFmwfikYV";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 15);
            i13++;
        }
    }

    public static void A02() {
        byte[] bArr = {30, 34, 47, 45, 43, 38, 33, 34, 42, 43, 60, 10, 47, 58, 47, 29, 33, 59, 60, 45, 43, 110, 45, 47, 32, 32, 33, 58, 110, 44, 43, 110, 33, 62, 43, 32, 43, 42};
        if (A01[4].length() == 28) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[1] = "WKXW0msVl14wECyhoMywifkEJ9hHjE6Q";
        strArr[7] = "PmkPELaTwO0Ry4CuVfXJdQ8K1oiqi9Y2";
        A00 = bArr;
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final /* synthetic */ Map A8j() {
        return AbstractC1508dY.A00(this);
    }

    static {
        A02();
        A03 = new AnonymousClass59();
        A02 = new InterfaceC1509dZ() { // from class: com.facebook.ads.redexgen.X.Pi
            @Override // com.facebook.ads.redexgen.X.InterfaceC1509dZ
            public final Q7 A58() {
                return AnonymousClass59.A00();
            }
        };
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final void A3t(InterfaceC1558eN interfaceC1558eN) {
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final Uri A9F() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final long AFq(C1519dj c1519dj) throws IOException {
        throw new IOException(A01(0, 38, 65));
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final void close() {
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final int read(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException();
    }
}

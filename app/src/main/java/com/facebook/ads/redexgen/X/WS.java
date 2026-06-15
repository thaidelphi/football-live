package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.UUID;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class WS {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 96);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-58, -23, -23, -34, -73, -22, -27, -29, -53, -22, -33, -30, -72, -47, -42, -40, -45, -45, -46, -43, -41, -56, -57, -125, -45, -42, -42, -53, -125, -39, -56, -43, -42, -52, -46, -47, -99, -125};
    }

    public static WR A00(byte[] bArr) {
        C1648fq c1648fq = new C1648fq(bArr);
        if (c1648fq.A0A() < 32) {
            return null;
        }
        c1648fq.A0f(0);
        if (c1648fq.A0C() == c1648fq.A07() + 4 && c1648fq.A0C() == 1886614376) {
            int dataSize = W5.A03(c1648fq.A0C());
            if (dataSize > 1) {
                AbstractC1633fb.A07(A01(0, 12, 22), A01(12, 26, 3) + dataSize);
                return null;
            }
            UUID uuid = new UUID(c1648fq.A0P(), c1648fq.A0P());
            if (dataSize == 1) {
                c1648fq.A0g(c1648fq.A0L() * 16);
            }
            int atomSize = c1648fq.A0L();
            if (atomSize != c1648fq.A07()) {
                return null;
            }
            byte[] bArr2 = new byte[atomSize];
            c1648fq.A0k(bArr2, 0, atomSize);
            return new WR(uuid, dataSize, bArr2);
        }
        return null;
    }

    public static UUID A02(byte[] bArr) {
        UUID uuid;
        WR parsedAtom = A00(bArr);
        if (parsedAtom != null) {
            uuid = parsedAtom.A01;
            return uuid;
        }
        return null;
    }
}

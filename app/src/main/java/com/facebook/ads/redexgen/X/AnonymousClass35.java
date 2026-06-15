package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.35  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AnonymousClass35 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 115);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{11, 77, 81, 72, 73};
    }

    public static void A02(C1900k1 c1900k1, AbstractC2058md abstractC2058md, boolean z10, AnonymousClass33 anonymousClass33) {
        if (!C06419m.A25(c1900k1)) {
            C05987t c05987t = new C05987t(c1900k1);
            C04672p A07 = abstractC2058md.A1b().A0F().A07();
            c05987t.A0d(new AF(abstractC2058md.A1g(), c1900k1.A0A()));
            if (A07 == null) {
                anonymousClass33.AET(AdError.CACHE_ERROR);
                return;
            } else if (A07.A0O()) {
                anonymousClass33.AEU();
                return;
            } else {
                C05947p c05947p = new C05947p(A07.A0F(), abstractC2058md.A0r(), abstractC2058md.A0i());
                c05947p.A04 = true;
                c05947p.A03 = A00(0, 5, 86);
                switch (AnonymousClass32.A00[A07.A0A().ordinal()]) {
                    case 1:
                    case 2:
                        c05987t.A0X(c05947p);
                        break;
                }
                c05987t.A0b(new C05967r(abstractC2058md.A1e().A01(), -1, -1, abstractC2058md.A0r(), abstractC2058md.A0i()));
                c05987t.A0b(new C05967r(A07.A0E(), -1, -1, abstractC2058md.A0r(), abstractC2058md.A0i()));
                c05987t.A0W(new C2045mQ(c1900k1, anonymousClass33, c05987t, A07, z10), new C05917m(abstractC2058md.A0r(), abstractC2058md.A0i()));
                return;
            }
        }
        anonymousClass33.AEU();
    }
}

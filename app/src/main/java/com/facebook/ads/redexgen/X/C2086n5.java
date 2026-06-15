package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.n5  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2086n5 extends JK {
    public static byte[] A01;
    public final /* synthetic */ N5 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{78, 77, 66, 66, 73, 94};
    }

    public C2086n5(N5 n52) {
        this.A00 = n52;
    }

    @Override // com.facebook.ads.redexgen.X.JK
    public final void A03() {
        C0710Cv c0710Cv;
        C0710Cv c0710Cv2;
        M5 m52;
        C2067mm c2067mm;
        M5 m53;
        C0969Mx c0969Mx;
        JL jl;
        C0710Cv c0710Cv3;
        C0969Mx c0969Mx2;
        A7 a72;
        C0969Mx c0969Mx3;
        M5 m54;
        C0969Mx c0969Mx4;
        C0969Mx c0969Mx5;
        C04592h A1c;
        M5 m55;
        JL jl2;
        M5 m56;
        C0969Mx c0969Mx6;
        c0710Cv = this.A00.A07;
        if (!c0710Cv.A07()) {
            c0710Cv2 = this.A00.A07;
            c0710Cv2.A05();
            m52 = this.A00.A04;
            InterfaceC2108nR A0F = m52.A0F();
            c2067mm = this.A00.A02;
            A0F.A4G(c2067mm != null);
            m53 = this.A00.A04;
            m53.A0F().A3B();
            c0969Mx = this.A00.A03;
            AbstractC04783a.A02(c0969Mx.A0g(), AbstractC0693Ce.A00(A00(0, 6, 63)));
            FB fb = new FB();
            jl = this.A00.A0C;
            FB A03 = fb.A03(jl);
            c0710Cv3 = this.A00.A07;
            FB A02 = A03.A02(c0710Cv3);
            c0969Mx2 = this.A00.A03;
            Map<String, String> A05 = A02.A04(c0969Mx2.A0h()).A05();
            a72 = this.A00.A05;
            c0969Mx3 = this.A00.A03;
            a72.AB0(c0969Mx3.A1g(), A05);
            m54 = this.A00.A04;
            if (C06419m.A18(m54)) {
                m56 = this.A00.A04;
                C0677Bh A00 = C0677Bh.A00(m56);
                String adPlacementType = AdPlacementType.BANNER.toString();
                c0969Mx6 = this.A00.A03;
                A00.A0E(adPlacementType, c0969Mx6.A1g());
            }
            c0969Mx4 = this.A00.A03;
            if (c0969Mx4 == null) {
                A1c = null;
            } else {
                c0969Mx5 = this.A00.A03;
                A1c = c0969Mx5.A1c();
            }
            m55 = this.A00.A04;
            C04592h.A07(A1c, m55);
            jl2 = this.A00.A0C;
            jl2.A0V();
        }
    }
}

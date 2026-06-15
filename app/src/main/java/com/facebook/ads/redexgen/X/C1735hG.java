package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.hG  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1735hG implements EJ {
    public static byte[] A01;
    public static String[] A02 = {"8F1ylXiPLmOJlxHuSB0OfTD8ERnub0Jc", "S6BOYeNFrgFu99vNdASrFyo", "dJPilyeR7SZ6Rr21hdX", "myhsKKLHgmC4nogMMn1nxIO", "jSXY2xjzyKT8sDO", "m4o2VQ2UIP9pfbMg6FrqdCCZlyPN5tpn", "ArrKoNW9WxnAbKv8I1vfh8MoVmXkp7wv", "MU6Xe0UyfSgNRnTq3TqZG"};
    public final /* synthetic */ EH A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{1, 13, 15, 76, 4, 3, 1, 7, 0, 13, 13, 9, 76, 3, 6, 17, 76, 3, 6, 16, 7, 18, 13, 16, 22, 11, 12, 5, 76, 36, 43, 44, 43, 49, 42, 61, 35, 38, 61, 48, 39, 50, 45, 48, 54, 43, 44, 37, 61, 36, 46, 45, 53};
    }

    static {
        A01();
    }

    public C1735hG(EH eh) {
        this.A00 = eh;
    }

    @Override // com.facebook.ads.redexgen.X.EJ
    public final void A4t() {
        DR dr;
        DR dr2;
        dr = this.A00.A07;
        if (dr != null) {
            dr2 = this.A00.A07;
            dr2.A4Z(A00(0, 53, 115));
        }
    }

    @Override // com.facebook.ads.redexgen.X.EJ
    public final void A4u() {
        DS ds;
        DS ds2;
        this.A00.A0M();
        ds = this.A00.A08;
        if (ds != null) {
            ds2 = this.A00.A08;
            ds2.AEs(true);
        }
        this.A00.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.EJ
    public final void A9S() {
        C04883k c04883k;
        C04883k c04883k2;
        C04883k c04883k3;
        C1900k1 c1900k1;
        c04883k = this.A00.A03;
        if (c04883k == null) {
            A4u();
            if (A02[0].charAt(15) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "E4Sw3glaT0j7tztglKcmJ4X";
            strArr[3] = "i6sG1P4DTWmVPFfNkRQLKmp";
            return;
        }
        EH.A01(this.A00);
        c04883k2 = this.A00.A03;
        if (c04883k2.A02() == null) {
            this.A00.A0C();
        } else {
            EH eh = this.A00;
            c04883k3 = this.A00.A03;
            eh.A0E(c04883k3.A02());
        }
        c1900k1 = this.A00.A05;
        if (C06419m.A2Q(c1900k1)) {
            this.A00.performAccessibilityAction(128, null);
        }
    }

    @Override // com.facebook.ads.redexgen.X.EJ
    public final void AAe() {
        C04843g c04843g;
        C04873j c04873j;
        C1900k1 c1900k1;
        C04843g c04843g2;
        String str;
        c04843g = this.A00.A04;
        if (!TextUtils.isEmpty(c04843g.A0I())) {
            C2 c22 = new C2();
            c1900k1 = this.A00.A05;
            c04843g2 = this.A00.A04;
            Uri A00 = C5.A00(c04843g2.A0I());
            str = this.A00.A09;
            C2.A0M(c22, c1900k1, A00, str);
        }
        c04873j = this.A00.A02;
        c04873j.A04();
    }

    @Override // com.facebook.ads.redexgen.X.EJ
    public final void AAf() {
        DS ds;
        C04843g c04843g;
        C04873j c04873j;
        C1900k1 c1900k1;
        C04843g c04843g2;
        String str;
        DS ds2;
        this.A00.A0M();
        ds = this.A00.A08;
        if (ds != null) {
            ds2 = this.A00.A08;
            ds2.AEs(true);
        }
        c04843g = this.A00.A04;
        if (!TextUtils.isEmpty(c04843g.A0C())) {
            C2 c22 = new C2();
            c1900k1 = this.A00.A05;
            c04843g2 = this.A00.A04;
            Uri A00 = C5.A00(c04843g2.A0C());
            str = this.A00.A09;
            C2.A0M(c22, c1900k1, A00, str);
        }
        c04873j = this.A00.A02;
        c04873j.A06();
        this.A00.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.EJ
    public final void AE6(EnumC04863i enumC04863i) {
        EnumC04863i enumC04863i2;
        C04843g c04843g;
        C04883k A0B;
        C04843g c04843g2;
        C04843g c04843g3;
        EH.A00(this.A00);
        this.A00.A01 = enumC04863i;
        enumC04863i2 = this.A00.A01;
        if (enumC04863i2 == EnumC04863i.A04) {
            c04843g3 = this.A00.A04;
            A0B = c04843g3.A0A();
        } else {
            EH eh = this.A00;
            if (A02[0].charAt(15) != 'S') {
                String[] strArr = A02;
                strArr[6] = "aVWWA7RlXQ4WxwD1lKH3adLgfY6YTeho";
                strArr[5] = "uW2I9G42iXHj1OU85KkNtz4HKFKkrOfh";
                c04843g2 = eh.A04;
                A0B = c04843g2.A0B();
            } else {
                c04843g = eh.A04;
                A0B = c04843g.A0B();
            }
        }
        EH eh2 = this.A00;
        String[] strArr2 = A02;
        if (strArr2[6].charAt(11) == strArr2[5].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A02;
        strArr3[1] = "uGU0gkKbqe2rkd9hIKZj6BU";
        strArr3[3] = "Cw3GzUJKwEhWx9AKZcDfceI";
        eh2.A0E(A0B);
    }

    @Override // com.facebook.ads.redexgen.X.EJ
    public final void AEJ(C04883k c04883k) {
        C04873j c04873j;
        EH.A00(this.A00);
        c04873j = this.A00.A02;
        c04873j.A07(c04883k.A01());
        if (c04883k.A05().isEmpty()) {
            this.A00.A0D(c04883k);
            return;
        }
        EH eh = this.A00;
        String[] strArr = A02;
        if (strArr[2].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[6] = "wullz3k0Ma2cYDBinBI95xBWIfHYuzlI";
        strArr2[5] = "wkJ6jlNGXVBBqnzofRVuEUhlZdNAnE5y";
        eh.A0E(c04883k);
    }
}

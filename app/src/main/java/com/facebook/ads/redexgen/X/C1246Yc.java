package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Yc  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1246Yc implements InterfaceC0973Nb {
    public static byte[] A05;
    public static String[] A06 = {"BzNXHIhDP4jUKO3IaEzAWZitFVZ8sbhY", "GRakfFI9FPjq2LDAVZgWaiyUeUWLn0Gv", "nlteVpfez7vGHON25pY0hTgww4kyiGma", "zKzrEx5KWBit9iPheUPKDiI5ze", "yGwbXfm3TfLhut9lLNbMjTeJ8o", "cWjNDhbMfFbSmS3Qo8jRCi5nvFKlSi", "0burYmisbqSgLFjAXSh5c9ALEfQ3KnVa", "TUOdy4M5FvXGBgDzF7ZieC3GBk1tNKwJ"};
    public static final InterfaceC0972Na<C1246Yc> A07;
    public static final String A08;
    public static final String A09;
    public int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final ZM[] A04;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 121);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{-58, 9, 21, 19, 8, 15, 20, 11, 10, -58, 15, 20, -58, 21, 20, 11, -58, -6, 24, 7, 9, 17, -19, 24, 21, 27, 22, -32, -58, -51, 26, 19, 27, 103, 101, 84, 86, 94, 19, 28, 21, 29, 105, 103, 86, 88, 96, 21, 37, 30, 21, 86, 99, 89, 21, 28, -42, 59, 96, 93, 93, 92, 105, 92, 101, 107, 23, -22, 8, -9, -7, 1, -35, 8, 5, 11, 6, 67, 56, 69, 62, 76, 56, 62, 60, 74, 10, 7, 4, -3, -72, -2, 4, -7, -1, 11, 82, 75, 65};
    }

    static {
        A05();
        A08 = AbstractC1672gE.A0h(0);
        A09 = AbstractC1672gE.A0h(1);
        A07 = new InterfaceC0972Na() { // from class: com.facebook.ads.redexgen.X.Yd
            @Override // com.facebook.ads.redexgen.X.InterfaceC0972Na
            public final InterfaceC0973Nb A6V(Bundle bundle) {
                return C1246Yc.A01(bundle);
            }
        };
    }

    public C1246Yc(String str, ZM... zmArr) {
        AbstractC1589es.A07(zmArr.length > 0);
        this.A03 = str;
        this.A04 = zmArr;
        this.A01 = zmArr.length;
        int A01 = Q2.A01(zmArr[0].A0W);
        this.A02 = A01 == -1 ? Q2.A01(zmArr[0].A0S) : A01;
        A04();
    }

    public C1246Yc(ZM... zmArr) {
        this(A02(0, 0, 112), zmArr);
    }

    public static int A00(int i10) {
        return i10 | 16384;
    }

    public static /* synthetic */ C1246Yc A01(Bundle bundle) {
        List A01;
        List<Format> formats = bundle.getParcelableArrayList(A08);
        if (formats == null) {
            A01 = C0958Mm.A01();
        } else {
            A01 = C1595ey.A01(ZM.A0b, formats);
        }
        String id = bundle.getString(A09, A02(0, 0, 112));
        return new C1246Yc(id, (ZM[]) A01.toArray(new ZM[0]));
    }

    public static String A03(String str) {
        return (str == null || str.equals(A02(96, 3, 100))) ? A02(0, 0, 112) : str;
    }

    private void A04() {
        String A03 = A03(this.A04[0].A0V);
        int A00 = A00(this.A04[0].A0E);
        for (int i10 = 1; i10 < this.A04.length; i10++) {
            String language = this.A04[i10].A0V;
            if (!A03.equals(A03(language))) {
                String str = this.A04[0].A0V;
                String str2 = this.A04[i10].A0V;
                String language2 = A02(77, 9, 94);
                A06(language2, str, str2, i10);
                return;
            } else if (A00 != A00(this.A04[i10].A0E)) {
                String binaryString = Integer.toBinaryString(this.A04[0].A0E);
                if (A06[7].charAt(5) == 'G') {
                    throw new RuntimeException();
                }
                A06[5] = "5G1pFatA1YKIsmcnbnabaAj6S95ZaR";
                String binaryString2 = Integer.toBinaryString(this.A04[i10].A0E);
                String language3 = A02(86, 10, 31);
                A06(language3, binaryString, binaryString2, i10);
                return;
            }
        }
    }

    public static void A06(String str, String str2, String str3, int i10) {
        AbstractC1633fb.A08(A02(67, 10, 29), A02(0, 0, 112), new IllegalStateException(A02(57, 10, 126) + str + A02(0, 30, 45) + str2 + A02(39, 17, 124) + str3 + A02(30, 9, 122) + i10 + A02(56, 1, 52)));
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A07(com.facebook.ads.redexgen.X.ZM r3) {
        /*
            r2 = this;
            r1 = 0
        L1:
            com.facebook.ads.redexgen.X.ZM[] r0 = r2.A04
            int r0 = r0.length
            if (r1 >= r0) goto L10
            com.facebook.ads.redexgen.X.ZM[] r0 = r2.A04
            r0 = r0[r1]
            if (r3 != r0) goto Ld
            return r1
        Ld:
            int r1 = r1 + 1
            goto L1
        L10:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1246Yc.A07(com.facebook.ads.redexgen.X.ZM):int");
    }

    public final ZM A08(int i10) {
        return this.A04[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (A06[5].length() != 30) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "S7LwvMci8t59umJxu6mQLsyE2lif2xMm";
        strArr[0] = "r8RL7QOuOA3et58yw44iYOJehgQ4nbbj";
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1246Yc c1246Yc = (C1246Yc) obj;
        return this.A03.equals(c1246Yc.A03) && Arrays.equals(this.A04, c1246Yc.A04);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = this.A03.hashCode();
            this.A00 = (((17 * 31) + result) * 31) + Arrays.hashCode(this.A04);
        }
        int result2 = this.A00;
        return result2;
    }
}

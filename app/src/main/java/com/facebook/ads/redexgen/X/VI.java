package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Collections;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class VI extends V5 {
    public static byte[] A03;
    public static String[] A04 = {"ExoqCKEP1YYviZfAjm", "meuuKYwZcdYDH1lhBMBz5KcUf", "YGJSDyvFfeAJ8IqF7ZlgQJka1yMfPR1L", "nMZkWl0GeAYhYumqQ8XNefyFCUrMv1cc", "iEPn60LDZetFmYuHDvpebwpFmktphkxg", "G5Hkl5LIxXcCoztxz2GRrLLNVyYf90LO", "Y0bjKK7Pp8u", "ivW"};
    public static final int[] A05;
    public int A00;
    public boolean A01;
    public boolean A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] ^ i12;
            String[] strArr = A04;
            if (strArr[7].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A04[2] = "3VP0iCFs4h7VFs3WNzW0tovH7TcGs6m4";
            copyOfRange[i13] = (byte) (i14 ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{58, 14, 31, 18, 20, 91, 29, 20, 9, 22, 26, 15, 91, 21, 20, 15, 91, 8, 14, 11, 11, 20, 9, 15, 30, 31, 65, 91, 80, 68, 85, 88, 94, 30, 86, 6, 0, 0, 28, 80, 93, 80, 70, 88, 76, 93, 80, 86, 22, 94, 14, 8, 8, 20, 84, 85, 88, 78, 19, 7, 22, 27, 29, 93, 31, 2, 70, 19, 95, 30, 19, 6, 31, 71, 83, 66, 79, 73, 9, 75, 86, 67, 65};
        if (A04[1].length() != 25) {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[7] = "Civ";
        strArr[6] = "fArBYp1JGa0";
    }

    static {
        A01();
        A05 = new int[]{5512, 11025, 22050, 44100};
    }

    public VI(InterfaceC1157Uo interfaceC1157Uo) {
        super(interfaceC1157Uo);
    }

    @Override // com.facebook.ads.redexgen.X.V5
    public final boolean A0B(C1648fq c1648fq) throws V8 {
        if (!this.A02) {
            int A0I = c1648fq.A0I();
            int header = A0I >> 4;
            this.A00 = header & 15;
            if (this.A00 == 2) {
                int header2 = A0I >> 2;
                super.A00.A6U(new P5().A11(A00(73, 10, 29)).A0b(1).A0m(A05[header2 & 3]).A14());
                this.A01 = true;
            } else if (this.A00 == 7 || this.A00 == 8) {
                super.A00.A6U(new P5().A11(this.A00 == 7 ? A00(28, 15, 10) : A00(43, 15, 2)).A0b(1).A0m(8000).A14());
                this.A01 = true;
            } else if (this.A00 != 10) {
                throw new V8(A00(0, 28, 64) + this.A00);
            }
            this.A02 = true;
        } else {
            c1648fq.A0g(1);
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.V5
    public final boolean A0C(C1648fq c1648fq, long j10) throws Q6 {
        if (this.A00 == 2) {
            int A07 = c1648fq.A07();
            super.A00.AHx(c1648fq, A07);
            InterfaceC1157Uo interfaceC1157Uo = super.A00;
            if (A04[0].length() != 18) {
                throw new RuntimeException();
            }
            A04[0] = "o26vNw9sI8tHWje8kU";
            interfaceC1157Uo.AI0(j10, 1, A07, 0, null);
            return true;
        }
        int A0I = c1648fq.A0I();
        if (A0I == 0 && !this.A01) {
            int packetType = c1648fq.A07();
            byte[] bArr = new byte[packetType];
            int packetType2 = bArr.length;
            c1648fq.A0k(bArr, 0, packetType2);
            C1144Tx A032 = AbstractC1145Ty.A03(bArr);
            P5 A0w = new P5().A11(A00(58, 15, 73)).A0w(A032.A02);
            int packetType3 = A032.A00;
            P5 A0b = A0w.A0b(packetType3);
            int packetType4 = A032.A01;
            super.A00.A6U(A0b.A0m(packetType4).A12(Collections.singletonList(bArr)).A14());
            this.A01 = true;
            return false;
        } else if (this.A00 == 10 && A0I != 1) {
            return false;
        } else {
            int A072 = c1648fq.A07();
            super.A00.AHx(c1648fq, A072);
            super.A00.AI0(j10, 1, A072, 0, null);
            return true;
        }
    }
}

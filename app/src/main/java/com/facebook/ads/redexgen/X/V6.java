package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class V6 extends V5 {
    public static byte[] A06;
    public static String[] A07 = {"H0Qz7gfJSpJVYHFxpCHJV", "K4TCSu2fCuCSqeRIfo8vEBK0wWFC5IFT", "YqfZWV2dEVEBA9EaePHtw0z0RGyvosrY", "DQI7UjVUHmwMZUN6WWsOW2E32G4jDaoy", "", "2Nyc9i8MjSf6u", "s1XhJ2IWPCV3EMQKIJRNa", "fAuG4zoTNDPPwUIrgIEyuXm0UbUBtaTu"};
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final C1648fq A04;
    public final C1648fq A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 101);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{71, 120, 117, 116, 126, 49, 119, 126, 99, 124, 112, 101, 49, Byte.MAX_VALUE, 126, 101, 49, 98, 100, 97, 97, 126, 99, 101, 116, 117, 43, 49, 82, 77, 64, 65, 75, 11, 69, 82, 71};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.V5
    public final boolean A0C(C1648fq c1648fq, long j10) throws Q6 {
        int A0I = c1648fq.A0I();
        long A0D = j10 + (c1648fq.A0D() * 1000);
        if (A0I == 0 && !this.A02) {
            C1648fq c1648fq2 = new C1648fq(new byte[c1648fq.A07()]);
            c1648fq.A0k(c1648fq2.A0l(), 0, c1648fq.A07());
            U6 A00 = U6.A00(c1648fq2);
            this.A01 = A00.A02;
            super.A00.A6U(new P5().A11(A00(28, 9, 65)).A0w(A00.A04).A0r(A00.A03).A0f(A00.A01).A0Y(A00.A00).A12(A00.A05).A14());
            this.A02 = true;
            return false;
        }
        if (A0I == 1) {
            boolean z10 = this.A02;
            String[] strArr = A07;
            if (strArr[6].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[2] = "LVH3tdmABMKqLcjNfzvqD4c0IKcuubTX";
            strArr2[1] = "bvb2EcEElrOq3mbh1IqZTqS0iNZtjcSY";
            if (z10) {
                boolean z11 = this.A00 == 1;
                if (this.A03 || z11) {
                    byte[] A0l = this.A04.A0l();
                    A0l[0] = 0;
                    A0l[1] = 0;
                    A0l[2] = 0;
                    int i10 = 4 - this.A01;
                    int i11 = 0;
                    while (c1648fq.A07() > 0) {
                        c1648fq.A0k(this.A04.A0l(), i10, this.A01);
                        this.A04.A0f(0);
                        int A0L = this.A04.A0L();
                        this.A05.A0f(0);
                        super.A00.AHx(this.A05, 4);
                        super.A00.AHx(c1648fq, A0L);
                        i11 = i11 + 4 + A0L;
                    }
                    InterfaceC1157Uo interfaceC1157Uo = super.A00;
                    int i12 = z11 ? 1 : 0;
                    String[] strArr3 = A07;
                    if (strArr3[6].length() != strArr3[0].length()) {
                        String[] strArr4 = A07;
                        strArr4[5] = "rjQO5snSi8a51";
                        strArr4[4] = "";
                        interfaceC1157Uo.AI0(A0D, i12, i11, 0, null);
                        this.A03 = true;
                        return true;
                    }
                    String[] strArr5 = A07;
                    strArr5[5] = "nKdHyKCJIeWOj";
                    strArr5[4] = "";
                    interfaceC1157Uo.AI0(A0D, i12, i11, 0, null);
                    this.A03 = true;
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    static {
        A01();
    }

    public V6(InterfaceC1157Uo interfaceC1157Uo) {
        super(interfaceC1157Uo);
        this.A05 = new C1648fq(AbstractC1149Ud.A03);
        this.A04 = new C1648fq(4);
    }

    @Override // com.facebook.ads.redexgen.X.V5
    public final boolean A0B(C1648fq c1648fq) throws V8 {
        int A0I = c1648fq.A0I();
        int header = A0I >> 4;
        int frameType = header & 15;
        int i10 = A0I & 15;
        if (i10 == 7) {
            this.A00 = frameType;
            return frameType != 5;
        }
        throw new V8(A00(0, 28, 116) + i10);
    }
}

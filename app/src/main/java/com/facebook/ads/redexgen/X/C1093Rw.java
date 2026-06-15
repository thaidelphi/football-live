package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Rw  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1093Rw implements YX {
    public static byte[] A08;
    public static String[] A09 = {"3YB8MGqCwNcEW0DMrwKIRHm1ckBrFTBA", "IkZpt8vQXgwkTV6SNbg9dFllmwZBVUt", "mRsGorhsvHmVhFUaH29UgPmeOtvHn4lN", "NZGXVerQjN", "ktEBhwdBZHicIkHEv9835rc7Bz5E4mB", "Jde05jIIt5KuIrQgX4QesNYVwpb959jW", "Ph5WWolLggrmlvQk6tNF1eIKiattDb4b", "QNl37q0upAJmuWWTurj1wDKNZ6jUozY3"};
    public int A00;
    public long A01;
    public long A02;
    public final int A03;
    public final ZM A04;
    public final UL A05;
    public final InterfaceC1157Uo A06;
    public final YZ A07;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 112);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{6, 29, 90, 82, 73, 7, 29, 13, 48, 56, 45, 43, 60, 45, 44, 104, 42, 36, 39, 43, 35, 104, 59, 33, 50, 45, 114, 104};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.YX
    public final boolean AHz(WJ wj, long j10) throws IOException {
        long j11 = j10;
        while (j11 > 0 && this.A00 < this.A03) {
            int min = (int) Math.min(this.A03 - this.A00, j11);
            InterfaceC1157Uo interfaceC1157Uo = this.A06;
            if (A09[5].charAt(24) != 'w') {
                throw new RuntimeException();
            }
            String[] strArr = A09;
            strArr[6] = "0GH7tQrl0ummAEMDPuDZZEZfCoTZGEUG";
            strArr[7] = "3NlRy6inOQbmBxPmnSpvnVgiP2E3EIKz";
            int AHv = interfaceC1157Uo.AHv(wj, min, true);
            if (AHv == -1) {
                j11 = 0;
            } else {
                this.A00 += AHv;
                j11 -= AHv;
            }
        }
        int i10 = this.A07.A02;
        int i11 = this.A00 / i10;
        if (i11 > 0) {
            long A0U = this.A02 + AbstractC1672gE.A0U(this.A01, 1000000L, this.A07.A04);
            int i12 = i11 * i10;
            int i13 = this.A00;
            String[] strArr2 = A09;
            if (strArr2[0].charAt(22) != strArr2[2].charAt(22)) {
                A09[3] = "ynB1qy4xiFaN66tDf";
                int i14 = i13 - i12;
                this.A06.AI0(A0U, 0, i12, i14, null);
                this.A01 += i11;
                this.A00 = i14;
            } else {
                String[] strArr3 = A09;
                strArr3[0] = "pUQkPna5OKFVMo6gIScxbPmwE4M8sbpQ";
                strArr3[2] = "boro4ohexmiDUCkamzw9wTmnBKi3oWmZ";
                int i15 = i13 - i12;
                this.A06.AI0(A0U, 1, i12, i15, null);
                this.A01 += i11;
                this.A00 = i15;
            }
        }
        return j11 <= 0;
    }

    static {
        A01();
    }

    public C1093Rw(UL ul, InterfaceC1157Uo interfaceC1157Uo, YZ yz, String str, int i10) throws Q6 {
        this.A05 = ul;
        this.A06 = interfaceC1157Uo;
        this.A07 = yz;
        int i11 = (yz.A05 * yz.A01) / 8;
        int bytesPerFrame = yz.A02;
        if (bytesPerFrame == i11) {
            int bytesPerFrame2 = yz.A04;
            int constantBitrate = bytesPerFrame2 * i11 * 8;
            int bytesPerFrame3 = yz.A04;
            this.A03 = Math.max(i11, (bytesPerFrame3 * i11) / 10);
            P5 A0j = new P5().A11(str).A0a(constantBitrate).A0j(constantBitrate);
            int bytesPerFrame4 = this.A03;
            P5 A0h = A0j.A0h(bytesPerFrame4);
            int bytesPerFrame5 = yz.A05;
            P5 A0b = A0h.A0b(bytesPerFrame5);
            int bytesPerFrame6 = yz.A04;
            this.A04 = A0b.A0m(bytesPerFrame6).A0i(i10).A14();
            return;
        }
        StringBuilder append = new StringBuilder().append(A00(7, 21, 56)).append(i11).append(A00(0, 7, 77));
        int bytesPerFrame7 = yz.A02;
        throw Q6.A01(append.append(bytesPerFrame7).toString(), null);
    }

    @Override // com.facebook.ads.redexgen.X.YX
    public final void A9y(int i10, long j10) {
        this.A05.AID(new C1087Rq(this.A07, 1, i10, j10));
        this.A06.A6U(this.A04);
    }

    @Override // com.facebook.ads.redexgen.X.YX
    public final void AHq(long j10) {
        this.A02 = j10;
        this.A00 = 0;
        this.A01 = 0L;
    }
}

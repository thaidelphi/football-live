package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class TR extends AbstractC1205Wm {
    public static byte[] A05;
    public static String[] A06 = {"OSBuxA8zEnRiolB6cG4uiPECo0WwUmkD", "", "xxcpUJPnTVYqEuTHrwYVOjHOAxUZFuGN", "poU66SInsspskoUBYHR1JtfFAGzPXbU6", "7pDXU75iEa8PyIUpn3YZlzs2rDl8sX26", "S76AnDIrtBEeNrQVDfr12EH7dZmda5WJ", "B8HbVAhEW7WC60T6Eda", "VpVh4192C3aIK0mfoZM1laVAC0HKAzJR"};
    public int A00;
    public C1161Us A01;
    public C1163Uu A02;
    public C1206Wn A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final C1206Wn A02(C1648fq c1648fq) throws IOException {
        if (this.A02 == null) {
            this.A02 = AbstractC1164Uv.A06(c1648fq);
            return null;
        } else if (this.A01 == null) {
            this.A01 = AbstractC1164Uv.A04(c1648fq);
            return null;
        } else {
            C1163Uu c1163Uu = this.A02;
            C1161Us c1161Us = this.A01;
            byte[] bArr = new byte[c1648fq.A0A()];
            System.arraycopy(c1648fq.A0l(), 0, bArr, 0, c1648fq.A0A());
            C1162Ut[] A0E = AbstractC1164Uv.A0E(c1648fq, c1163Uu.A05);
            return new C1206Wn(c1163Uu, c1161Us, bArr, A0E, AbstractC1164Uv.A00(A0E.length - 1));
        }
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 37);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{23, 3, 18, 31, 25, 89, 0, 25, 4, 20, 31, 5};
    }

    static {
        A04();
    }

    public static int A00(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static int A01(byte b10, C1206Wn c1206Wn) {
        if (!c1206Wn.A04[A00(b10, c1206Wn.A00, 1)].A03) {
            int modeNumber = c1206Wn.A02.A03;
            return modeNumber;
        }
        C1163Uu c1163Uu = c1206Wn.A02;
        if (A06[5].charAt(14) != 'Q') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[3] = "ty7LcGOnA759j2s1NaQCjDuGhoB8VzM6";
        strArr[2] = "FC8vzAHnHatKcIVILTws19eQHI2zvHfe";
        int modeNumber2 = c1163Uu.A04;
        return modeNumber2;
    }

    public static void A05(C1648fq c1648fq, long j10) {
        if (c1648fq.A08() < c1648fq.A0A() + 4) {
            c1648fq.A0i(Arrays.copyOf(c1648fq.A0l(), c1648fq.A0A() + 4));
        } else {
            c1648fq.A0e(c1648fq.A0A() + 4);
        }
        byte[] A0l = c1648fq.A0l();
        A0l[c1648fq.A0A() - 4] = (byte) (j10 & 255);
        A0l[c1648fq.A0A() - 3] = (byte) ((j10 >>> 8) & 255);
        A0l[c1648fq.A0A() - 2] = (byte) ((j10 >>> 16) & 255);
        A0l[c1648fq.A0A() - 1] = (byte) (255 & (j10 >>> 24));
    }

    public static boolean A06(C1648fq c1648fq) {
        try {
            return AbstractC1164Uv.A0C(1, c1648fq, true);
        } catch (Q6 unused) {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1205Wm
    public final long A0E(C1648fq c1648fq) {
        int i10 = 0;
        if ((c1648fq.A0l()[0] & 1) == 1) {
            return -1L;
        }
        int A01 = A01(c1648fq.A0l()[0], (C1206Wn) AbstractC1589es.A02(this.A03));
        if (this.A04) {
            int packetBlockSize = this.A00;
            i10 = (packetBlockSize + A01) / 4;
        }
        A05(c1648fq, i10);
        this.A04 = true;
        this.A00 = A01;
        return i10;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1205Wm
    public final void A0F(long j10) {
        super.A0F(j10);
        this.A04 = j10 != 0;
        this.A00 = this.A02 != null ? this.A02.A03 : 0;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1205Wm
    public final void A0I(boolean z10) {
        super.A0I(z10);
        if (z10) {
            if (A06[5].charAt(14) != 'Q') {
                throw new RuntimeException();
            }
            A06[5] = "KAtjHSILaIST5YQV0zAYcVVXx1PQzuJl";
            this.A03 = null;
            this.A02 = null;
            this.A01 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1205Wm
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean A0J(C1648fq c1648fq, long j10, C1204Wl c1204Wl) throws IOException {
        if (this.A03 != null) {
            AbstractC1589es.A01(c1204Wl.A00);
            return false;
        }
        this.A03 = A02(c1648fq);
        if (this.A03 == null) {
            return true;
        }
        C1206Wn c1206Wn = this.A03;
        C1163Uu c1163Uu = c1206Wn.A02;
        ArrayList<byte[]> codecInitializationData = new ArrayList<>();
        codecInitializationData.add(c1163Uu.A09);
        codecInitializationData.add(c1206Wn.A03);
        c1204Wl.A00 = new P5().A11(A03(0, 12, 83)).A0a(c1163Uu.A02).A0j(c1163Uu.A00).A0b(c1163Uu.A05).A0m(c1163Uu.A06).A12(codecInitializationData).A0v(AbstractC1164Uv.A02(C0958Mm.A02(c1206Wn.A01.A02))).A14();
        return true;
    }
}

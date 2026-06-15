package com.facebook.ads.redexgen.X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class PY implements InterfaceC1507dX {
    public static byte[] A0A;
    public static String[] A0B = {"qVKiPc72Is5lKRYjUx", "42emtlJbxk8rIv09Di6nlKdnQgt", "vgUau6UVNGNDTr4sUQY9yT1FeYehQtdo", "IQrqHyt0FagouRqTEmR4tqdwMKu6mS7k", "PjsEzwzn6OiwkzF1Le3DWSKr1T8IGCGY", "Go05HxhgiLetSRHHRbzNyDTaOFPtJnWn", "fYkoUhN9QTsT8Q8Ywid", "PjbM1ndjMIr2id5j7lRURGvcM2blLD"};
    public long A00;
    public long A01;
    public long A02;
    public C1519dj A03;
    public C1587eq A04;
    public File A05;
    public OutputStream A06;
    public final int A07;
    public final long A08;
    public final InterfaceC1562eR A09;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0B;
            if (strArr[7].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A0B[3] = "ZCN1Zjk54dCJvy1OfkYVwz4bthWY4xg6";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 100);
            i13++;
        }
    }

    public static void A02() {
        A0A = new byte[]{-41, -11, -9, -4, -7, -40, -11, 8, -11, -25, -3, 2, -1, 31, 43, 26, 32, 38, 30, 39, 45, 12, 34, 51, 30, -39, 34, 44, -39, 27, 30, 37, 40, 48, -39, 45, 33, 30, -39, 38, 34, 39, 34, 38, 46, 38, -39, 43, 30, 28, 40, 38, 38, 30, 39, 29, 30, 29, -39, 47, 26, 37, 46, 30, -39, 40, 31, -39, -21, -23, -14, -16, -22, -18, -21, -25, -39, 13, 33, 34, 44, -39, 38, 26, 50, -39, 28, 26, 46, 44, 30, -39, 41, 40, 40, 43, -39, 28, 26, 28, 33, 30, -39, 41, 30, 43, 31, 40, 43, 38, 26, 39, 28, 30, -25, 18, 30, 13, 19, 25, 17, 26, 32, -1, 21, 38, 17, -52, 25, 33, 31, 32, -52, 14, 17, -52, 28, 27, 31, 21, 32, 21, 34, 17, -52, 27, 30, -52, -17, -38, -8, -15, -6, -13, 0, -12, 11, 1, -6, -1, -15, 0, -38};
    }

    static {
        A02();
    }

    public PY(InterfaceC1562eR interfaceC1562eR, long j10, int i10) {
        AbstractC1589es.A0A(j10 > 0 || j10 == -1, A00(115, 48, 72));
        if (j10 != -1 && j10 < 2097152) {
            AbstractC1633fb.A07(A00(0, 13, 48), A00(13, 102, 85));
        }
        this.A09 = (InterfaceC1562eR) AbstractC1589es.A01(interfaceC1562eR);
        this.A08 = j10 == -1 ? Long.MAX_VALUE : j10;
        this.A07 = i10;
    }

    private void A01() throws IOException {
        if (this.A06 == null) {
            return;
        }
        try {
            this.A06.flush();
            AbstractC1672gE.A10(this.A06);
            this.A06 = null;
            File file = (File) AbstractC1672gE.A0f(this.A05);
            this.A05 = null;
            if (1 != 0) {
                this.A09.A4v(file, this.A02);
            } else {
                file.delete();
            }
        } catch (Throwable th) {
            AbstractC1672gE.A10(this.A06);
            this.A06 = null;
            File fileToCommit = (File) AbstractC1672gE.A0f(this.A05);
            this.A05 = null;
            if (0 != 0) {
                this.A09.A4v(fileToCommit, this.A02);
            } else {
                fileToCommit.delete();
            }
            throw th;
        }
    }

    private void A03(C1519dj c1519dj) throws IOException {
        this.A05 = this.A09.AJD((String) AbstractC1672gE.A0f(c1519dj.A08), c1519dj.A04 + this.A00, c1519dj.A03 != -1 ? Math.min(c1519dj.A03 - this.A00, this.A01) : -1L);
        FileOutputStream fileOutputStream = new FileOutputStream(this.A05);
        if (this.A07 > 0) {
            if (this.A04 == null) {
                this.A04 = new C1587eq(fileOutputStream, this.A07);
            } else {
                this.A04.A00(fileOutputStream);
            }
            this.A06 = this.A04;
        } else {
            this.A06 = fileOutputStream;
        }
        this.A02 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1507dX
    public final void AFs(C1519dj c1519dj) throws C1026Pe {
        AbstractC1589es.A01(c1519dj.A08);
        if (c1519dj.A03 == -1 && c1519dj.A06(2)) {
            this.A03 = null;
            return;
        }
        this.A03 = c1519dj;
        this.A01 = c1519dj.A06(4) ? this.A08 : Long.MAX_VALUE;
        if (A0B[0].length() != 18) {
            throw new RuntimeException();
        }
        A0B[4] = "GFm3ofOnFDAAk0uQ4t2jahhm2i2BLupT";
        this.A00 = 0L;
        try {
            A03(c1519dj);
        } catch (IOException e8) {
            throw new C1026Pe(e8);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1507dX
    public final void close() throws C1026Pe {
        if (this.A03 == null) {
            return;
        }
        try {
            A01();
        } catch (IOException e8) {
            throw new C1026Pe(e8);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1507dX
    public final void write(byte[] bArr, int i10, int i11) throws C1026Pe {
        C1519dj c1519dj = this.A03;
        if (c1519dj == null) {
            return;
        }
        int i12 = 0;
        while (i12 < i11) {
            try {
                if (this.A02 == this.A01) {
                    A01();
                    A03(c1519dj);
                }
                int min = (int) Math.min(i11 - i12, this.A01 - this.A02);
                ((OutputStream) AbstractC1672gE.A0f(this.A06)).write(bArr, i10 + i12, min);
                i12 += min;
                this.A02 += min;
                this.A00 += min;
            } catch (IOException e8) {
                throw new C1026Pe(e8);
            }
        }
    }
}

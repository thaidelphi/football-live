package com.facebook.ads.redexgen.X;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.bN  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1373bN {
    public static String[] A07 = {"K4xrGqafDQDRAhZSdWhuk587fTAY7MFb", "i1IysyxujImbAMMJpoCKgo8tfO0bOyoC", "rwWqJPEt5zHE5awNJTD09hJhTdsjiq1J", "kApBPijEbT2iCyiztTt35QXvkWAJXahs", "Th8C", "HcngvQofEhe8UbYnWIZRdwufCrY", "hzopP5tPacE7lb1riREOzi3", "Ox0o8AmhRhpBtQfkCDQ1Dk"};
    public long A00;
    public C1069Qy A01;
    public C1069Qy A02;
    public C1069Qy A03;
    public final int A04;
    public final InterfaceC1496dM A05;
    public final C1648fq A06 = new C1648fq(32);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1069Qy A04(C1069Qy c1069Qy, C1214Ww c1214Ww, C1375bP c1375bP, C1648fq c1648fq) {
        int i10;
        long j10 = c1375bP.A01;
        c1648fq.A0d(1);
        C1069Qy A03 = A03(c1069Qy, j10, c1648fq.A0l(), 1);
        long j11 = j10 + 1;
        byte b10 = c1648fq.A0l()[0];
        boolean z10 = (b10 & 128) != 0;
        int i11 = b10 & Byte.MAX_VALUE;
        C1107Sk c1107Sk = c1214Ww.A05;
        if (c1107Sk.A04 == null) {
            c1107Sk.A04 = new byte[16];
        } else {
            Arrays.fill(c1107Sk.A04, (byte) 0);
        }
        C1069Qy A032 = A03(A03, j11, c1107Sk.A04, i11);
        long j12 = j11 + i11;
        if (z10) {
            c1648fq.A0d(2);
            A032 = A03(A032, j12, c1648fq.A0l(), 2);
            j12 += 2;
            i10 = c1648fq.A0M();
        } else {
            i10 = 1;
        }
        int[] iArr = c1107Sk.A06;
        if (iArr == null || iArr.length < i10) {
            iArr = new int[i10];
        }
        int[] iArr2 = c1107Sk.A07;
        if (iArr2 == null || iArr2.length < i10) {
            iArr2 = new int[i10];
        }
        if (z10) {
            int i12 = i10 * 6;
            c1648fq.A0d(i12);
            A032 = A03(A032, j12, c1648fq.A0l(), i12);
            j12 += i12;
            c1648fq.A0f(0);
            for (int i13 = 0; i13 < i10; i13++) {
                iArr[i13] = c1648fq.A0M();
                iArr2[i13] = c1648fq.A0L();
            }
        } else {
            iArr[0] = 0;
            iArr2[0] = c1375bP.A00 - ((int) (j12 - c1375bP.A01));
        }
        C1156Um c1156Um = (C1156Um) AbstractC1672gE.A0f(c1375bP.A02);
        c1107Sk.A02(i10, iArr, iArr2, c1156Um.A03, c1107Sk.A04, c1156Um.A01, c1156Um.A02, c1156Um.A00);
        int i14 = (int) (j12 - c1375bP.A01);
        c1375bP.A01 += i14;
        c1375bP.A00 -= i14;
        return A032;
    }

    public C1373bN(InterfaceC1496dM interfaceC1496dM) {
        this.A05 = interfaceC1496dM;
        this.A04 = interfaceC1496dM.A88();
        this.A01 = new C1069Qy(0L, this.A04);
        this.A02 = this.A01;
        this.A03 = this.A01;
    }

    private int A00(int i10) {
        if (this.A03.A03 == null) {
            this.A03.A03(this.A05.A3z(), new C1069Qy(this.A03.A00, this.A04));
        }
        return Math.min(i10, (int) (this.A03.A00 - this.A00));
    }

    public static C1069Qy A01(C1069Qy c1069Qy, long j10) {
        while (j10 >= c1069Qy.A00) {
            c1069Qy = c1069Qy.A02;
        }
        return c1069Qy;
    }

    public static C1069Qy A02(C1069Qy c1069Qy, long j10, ByteBuffer byteBuffer, int i10) {
        C1069Qy A01 = A01(c1069Qy, j10);
        while (i10 > 0) {
            int remaining = (int) (A01.A00 - j10);
            int min = Math.min(i10, remaining);
            byte[] bArr = A01.A03.A01;
            int remaining2 = A01.A00(j10);
            byteBuffer.put(bArr, remaining2, min);
            i10 -= min;
            j10 += min;
            int remaining3 = (j10 > A01.A00 ? 1 : (j10 == A01.A00 ? 0 : -1));
            if (remaining3 == 0) {
                A01 = A01.A02;
            }
        }
        return A01;
    }

    public static C1069Qy A03(C1069Qy c1069Qy, long j10, byte[] bArr, int i10) {
        C1069Qy A01 = A01(c1069Qy, j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (A01.A00 - j10));
            byte[] bArr2 = A01.A03.A01;
            int toCopy = A01.A00(j10);
            int remaining = i10 - i11;
            System.arraycopy(bArr2, toCopy, bArr, remaining, min);
            i11 -= min;
            j10 += min;
            int remaining2 = (j10 > A01.A00 ? 1 : (j10 == A01.A00 ? 0 : -1));
            if (remaining2 == 0) {
                A01 = A01.A02;
            }
        }
        return A01;
    }

    public static C1069Qy A05(C1069Qy c1069Qy, C1214Ww c1214Ww, C1375bP c1375bP, C1648fq c1648fq) {
        if (c1214Ww.A0E()) {
            c1069Qy = A04(c1069Qy, c1214Ww, c1375bP, c1648fq);
        }
        if (c1214Ww.A03()) {
            c1648fq.A0d(4);
            C1069Qy A03 = A03(c1069Qy, c1375bP.A01, c1648fq.A0l(), 4);
            int A0L = c1648fq.A0L();
            c1375bP.A01 += 4;
            c1375bP.A00 -= 4;
            c1214Ww.A0C(A0L);
            C1069Qy A02 = A02(A03, c1375bP.A01, c1214Ww.A02, A0L);
            c1375bP.A01 += A0L;
            c1375bP.A00 -= A0L;
            String[] strArr = A07;
            String str = strArr[7];
            String str2 = strArr[4];
            int sampleSize = str.length();
            if (sampleSize != str2.length()) {
                A07[3] = "FBV6Hh7qKs7coCG2tPdPGbZ4jODJmT0u";
                c1214Ww.A0D(c1375bP.A00);
                return A02(A02, c1375bP.A01, c1214Ww.A03, c1375bP.A00);
            }
            throw new RuntimeException();
        }
        c1214Ww.A0C(c1375bP.A00);
        return A02(c1069Qy, c1375bP.A01, c1214Ww.A02, c1375bP.A00);
    }

    private void A06(int i10) {
        this.A00 += i10;
        if (this.A00 == this.A03.A00) {
            this.A03 = this.A03.A02;
        }
    }

    private void A07(C1069Qy c1069Qy) {
        if (c1069Qy.A03 == null) {
            return;
        }
        this.A05.AGm(c1069Qy);
        c1069Qy.A01();
    }

    public final int A08(O9 o92, int i10, boolean z10) throws IOException {
        int read = o92.read(this.A03.A03.A01, this.A03.A00(this.A00), A00(i10));
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        A06(read);
        return read;
    }

    public final long A09() {
        return this.A00;
    }

    public final void A0A() {
        A07(this.A01);
        this.A01.A02(0L, this.A04);
        this.A02 = this.A01;
        this.A03 = this.A01;
        this.A00 = 0L;
        this.A05.AJY();
    }

    public final void A0B() {
        this.A02 = this.A01;
    }

    public final void A0C(long j10) {
        if (j10 == -1) {
            return;
        }
        while (true) {
            int i10 = (j10 > this.A01.A00 ? 1 : (j10 == this.A01.A00 ? 0 : -1));
            String[] strArr = A07;
            if (strArr[7].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A07[6] = "Y0CaqHQLZ7PmbtNCYm";
            if (i10 >= 0) {
                this.A05.AGl(this.A01.A03);
                this.A01 = this.A01.A01();
            } else if (this.A02.A01 < this.A01.A01) {
                C1069Qy c1069Qy = this.A01;
                if (A07[6].length() != 31) {
                    String[] strArr2 = A07;
                    strArr2[1] = "dP6aAoHkUL99AaxS6PgiDBg5BTNZmNNt";
                    strArr2[0] = "grmUak7ijGAaApnjW1yWZUsAKbuAYPVj";
                    this.A02 = c1069Qy;
                    return;
                }
                this.A02 = c1069Qy;
                return;
            } else {
                return;
            }
        }
    }

    public final void A0D(C1214Ww c1214Ww, C1375bP c1375bP) {
        A05(this.A02, c1214Ww, c1375bP, this.A06);
    }

    public final void A0E(C1214Ww c1214Ww, C1375bP c1375bP) {
        this.A02 = A05(this.A02, c1214Ww, c1375bP, this.A06);
    }

    public final void A0F(C1648fq c1648fq, int i10) {
        while (i10 > 0) {
            int A00 = A00(i10);
            byte[] bArr = this.A03.A03.A01;
            int bytesAppended = this.A03.A00(this.A00);
            c1648fq.A0k(bArr, bytesAppended, A00);
            i10 -= A00;
            A06(A00);
        }
    }
}

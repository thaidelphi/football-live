package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* renamed from: com.facebook.ads.redexgen.X.Tw  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1143Tw implements InterfaceC1189Vw {
    public static byte[] A07;
    public static String[] A08 = {"AXanLBD5", "cxzcnJ5c3rtZzyOsedkRogNaZaM", "qCScgsm7gMkdzSU5flsFjq7eh73mgIkM", "qd63BdSNLygUXiUCbiklc0bSa8abxQTw", "KcQt5DBx71I6mvfrsll4kXbYQqkfCOTQ", "G3sen8OGcKNIorDp8luBv", "N0bpWUi1uCoW1VeZtln0WhJ0lPYqtIuB", "vpwm7L2h8VGBcLk4BeTJXxbvlUpiMuGj"};
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC1188Vv A03;
    public final byte[] A06 = new byte[8];
    public final ArrayDeque<C1186Vt> A05 = new ArrayDeque<>();
    public final W1 A04 = new W1();

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 14);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{73, 110, 118, 97, 108, 105, 100, 32, 101, 108, 101, 109, 101, 110, 116, 32, 116, 121, 112, 101, 32, 95, 120, 96, 119, 122, Byte.MAX_VALUE, 114, 54, 112, 122, 121, 119, 98, 54, 101, Byte.MAX_VALUE, 108, 115, 44, 54, 52, 19, 11, 28, 17, 20, 25, 93, 20, 19, 9, 24, 26, 24, 15, 93, 14, 20, 7, 24, 71, 93, 24, 63, 57, 34, 37, 44, 107, 46, 39, 46, 38, 46, 37, 63, 107, 56, 34, 49, 46, 113, 107};
    }

    static {
        A05();
    }

    private double A00(WJ wj, int i10) throws IOException {
        long A02 = A02(wj, i10);
        if (i10 == 4) {
            return Float.intBitsToFloat((int) A02);
        }
        return Double.longBitsToDouble(A02);
    }

    @RequiresNonNull({"processor"})
    private long A01(WJ wj) throws IOException {
        wj.AHr();
        while (true) {
            wj.AG1(this.A06, 0, 4);
            int A00 = W1.A00(this.A06[0]);
            if (A00 != -1 && A00 <= 4) {
                int A01 = (int) W1.A01(this.A06, A00, false);
                if (this.A03.AAL(A01)) {
                    wj.AJ9(A00);
                    return A01;
                }
            }
            wj.AJ9(1);
        }
    }

    private long A02(WJ wj, int i10) throws IOException {
        wj.readFully(this.A06, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            long j11 = j10 << 8;
            int i12 = this.A06[i11] & 255;
            if (A08[7].charAt(25) == '3') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[6] = "AAdD3Zel612Im9NGyRSCVZpBx2KnlgAo";
            strArr[2] = "t9BeebdBrqmswLEfPqj3oKG7yJWK4XZy";
            long value = i12;
            j10 = j11 | value;
        }
        return j10;
    }

    public static String A04(WJ wj, int i10) throws IOException {
        if (i10 == 0) {
            String A03 = A03(0, 0, 88);
            String[] strArr = A08;
            if (strArr[3].charAt(22) != strArr[4].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "ULSG1fTbhXZ2UFfRt5SvWpbv68GTbzNC";
            strArr2[4] = "23kZqozas7siKMKnWkE0uTb3fv3BQCc6";
            return A03;
        }
        byte[] bArr = new byte[i10];
        wj.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1189Vw
    public final void AA1(InterfaceC1188Vv interfaceC1188Vv) {
        this.A03 = interfaceC1188Vv;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00dd, code lost:
        if (r3 != 4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e3, code lost:
        if (r13.A02 != 8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e5, code lost:
        r13.A03.A6Q(r13.A00, A00(r14, (int) r13.A02));
        r13.A01 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f5, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fa, code lost:
        if (r3 != 4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011e, code lost:
        throw com.facebook.ads.redexgen.X.Q6.A01(A03(21, 20, 24) + r13.A02, null);
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1189Vw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AGW(com.facebook.ads.redexgen.X.WJ r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1143Tw.AGW(com.facebook.ads.redexgen.X.WJ):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1189Vw
    public final void reset() {
        this.A01 = 0;
        this.A05.clear();
        this.A04.A06();
    }
}

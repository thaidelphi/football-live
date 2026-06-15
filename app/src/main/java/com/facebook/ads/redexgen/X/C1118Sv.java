package com.facebook.ads.redexgen.X;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
/* renamed from: com.facebook.ads.redexgen.X.Sv  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1118Sv implements Y7 {
    public static byte[] A0G;
    public static String[] A0H = {"NmTziwrBEeleI2zcDKgDjvA7qUw", "SekJReECHdWpHb6NQB3EQL2vetQgAEWA", "BOC6ZGrpYygESGmRPyhfDjH29NzWYoEz", "2gzrqHGB1xRLBwX4mZ1qcNgV5nulxwl4", "012keUBfh6BlFxDypCEXCalykyNE0ou0", "k3zjsf7yfJHE9mBrKaEHeQpEMH63VrpT", "MFzo5Fk0RO4wlGv3ISCdCJALs2z6bwtA", "Am35bXZOBd5vSoFaqvbJwRpc9RqFsHNr"};
    public static final double[] A0I;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public InterfaceC1157Uo A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Y8 A0B;
    public final YG A0C;
    public final YV A0D;
    public final C1648fq A0E;
    public final boolean[] A0F;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<ZM, Long> A00(Y8 y82, String str) {
        int i10;
        byte[] copyOf = Arrays.copyOf(y82.A02, y82.A00);
        int i11 = copyOf[4] & 255;
        int i12 = copyOf[5] & 255;
        int i13 = (i11 << 4) | (i12 >> 4);
        int i14 = ((i12 & 15) << 8) | (copyOf[6] & 255);
        float f10 = 1.0f;
        switch ((copyOf[7] & 240) >> 4) {
            case 2:
                float f11 = i14 * 4;
                float f12 = i13 * 3;
                if (A0H[0].length() != 12) {
                    A0H[4] = "4nBX7WDv7j39O8wBvqnc7m1";
                    f10 = f11 / f12;
                    break;
                } else {
                    throw new RuntimeException();
                }
            case 3:
                f10 = (i14 * 16) / (i13 * 9);
                break;
            case 4:
                f10 = (i14 * 121) / (i13 * 100);
                break;
        }
        ZM A14 = new P5().A0y(str).A11(A01(0, 11, 106)).A0r(i13).A0f(i14).A0Y(f10).A12(Collections.singletonList(copyOf)).A14();
        long j10 = 0;
        int i15 = (copyOf[7] & 15) - 1;
        if (i15 >= 0 && i15 < A0I.length) {
            double d10 = A0I[i15];
            int i16 = y82.A01;
            int i17 = (copyOf[i16 + 9] & 96) >> 5;
            if (i17 != (copyOf[i16 + 9] & 31)) {
                d10 *= (i17 + 1.0d) / (i10 + 1);
            }
            j10 = (long) (1000000.0d / d10);
        }
        return Pair.create(A14, Long.valueOf(j10));
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 57);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0G = new byte[]{37, 58, 55, 54, 60, 124, 62, 35, 54, 52, 97};
    }

    static {
        A02();
        A0I = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    }

    public C1118Sv() {
        this(null);
    }

    public C1118Sv(YV yv) {
        this.A0D = yv;
        this.A0F = new boolean[4];
        this.A0B = new Y8(128);
        if (yv != null) {
            this.A0C = new YG(178, 128);
            this.A0E = new C1648fq();
        } else {
            this.A0C = null;
            this.A0E = null;
        }
        this.A01 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
        if (r6.A02(r7, r13) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
        r6 = A00(r20.A0B, (java.lang.String) com.facebook.ads.redexgen.X.AbstractC1589es.A01(r20.A06));
        r20.A05.A6U((com.facebook.ads.redexgen.X.ZM) r6.first);
        r20.A00 = ((java.lang.Long) r6.second).longValue();
        r20.A07 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b6, code lost:
        if (r6.A02(r7, r13) != false) goto L16;
     */
    @Override // com.facebook.ads.redexgen.X.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A50(com.facebook.ads.redexgen.X.C1648fq r21) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1118Sv.A50(com.facebook.ads.redexgen.X.fq):void");
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void A5S(UL ul, YS ys) {
        ys.A05();
        this.A06 = ys.A04();
        this.A05 = ul.AJX(ys.A03(), 2);
        if (this.A0D != null) {
            this.A0D.A03(ul, ys);
        }
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void AFx() {
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void AFy(long j10, int i10) {
        this.A01 = j10;
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void AIB() {
        AbstractC1149Ud.A0H(this.A0F);
        this.A0B.A00();
        if (this.A0C != null) {
            this.A0C.A00();
        }
        this.A04 = 0L;
        this.A0A = false;
        this.A01 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
    }
}

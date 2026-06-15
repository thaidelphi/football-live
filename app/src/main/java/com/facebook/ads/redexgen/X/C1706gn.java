package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.gn  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1706gn {
    public static byte[] A0H;
    public static String[] A0I = {"du0GCr4iaKlN", "XUJMN7HLlR8SwTpbNsNPNMZ5RZTOiWXW", "0sczhz72jaJlPK1piHSSAP7JYHMpRYdd", "jaslWVB", "EO7", "zBgDjEllCd9lrdTjtkWGgDQC9YJUY5A", "kp3LPKAZ9agggr6ZIMLQuw7glHijHNcX", "k9tONJFkf4"};
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public Surface A0C;
    public boolean A0D;
    public final C1684gR A0E = new C1684gR();
    public final InterfaceC1704gl A0F;
    public final Choreographer$FrameCallbackC1705gm A0G;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 93);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0H = new byte[]{10, 35, 22, 23, 33, 26, -43, 41, 36, -43, 38, 42, 26, 39, 46, -43, 25, 30, 40, 37, 33, 22, 46, -43, 39, 26, 27, 39, 26, 40, 29, -43, 39, 22, 41, 26, 23, 42, 37, 38, 48, 7, 51, 34, 46, 38, 19, 38, 45, 38, 34, 52, 38, 9, 38, 45, 49, 38, 51};
    }

    static {
        A06();
    }

    public C1706gn(Context context) {
        this.A0F = A01(context);
        this.A0G = this.A0F != null ? Choreographer$FrameCallbackC1705gm.A00() : null;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A00 = -1.0f;
        this.A01 = 1.0f;
        this.A04 = 0;
    }

    public static long A00(long j10, long j11, long j12) {
        long j13;
        long vsyncCount = j12 * ((j10 - j11) / j12);
        long j14 = j11 + vsyncCount;
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            j13 = j14;
            j14 += j12;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    public static InterfaceC1704gl A01(Context context) {
        C1015Ot c1015Ot = null;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (AbstractC1672gE.A02 >= 17) {
            c1015Ot = C1015Ot.A01(applicationContext);
        }
        if (c1015Ot == null) {
            return C1016Ou.A00(applicationContext);
        }
        return c1015Ot;
    }

    private void A03() {
        if (AbstractC1672gE.A02 < 30 || this.A0C == null || this.A04 == Integer.MIN_VALUE || this.A03 == 0.0f) {
            return;
        }
        this.A03 = 0.0f;
        C1702gj.A02(this.A0C, 0.0f);
    }

    private void A04() {
        this.A05 = 0L;
        this.A06 = -1L;
        this.A08 = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A05() {
        /*
            r8 = this;
            int r0 = com.facebook.ads.redexgen.X.AbstractC1672gE.A02
            r5 = 30
            if (r0 < r5) goto La
            android.view.Surface r0 = r8.A0C
            if (r0 != 0) goto Lb
        La:
            return
        Lb:
            com.facebook.ads.redexgen.X.gR r0 = r8.A0E
            boolean r0 = r0.A06()
            if (r0 == 0) goto L27
            com.facebook.ads.redexgen.X.gR r3 = r8.A0E
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1706gn.A0I
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 3
            if (r1 == r0) goto L2a
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L27:
            float r4 = r8.A00
            goto L3a
        L2a:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1706gn.A0I
            java.lang.String r1 = "C6rxC3kvLt"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "vo2xOMhV5ZKnZ0I0h3bb2qC5TnGrU5d"
            r0 = 5
            r2[r0] = r1
            float r4 = r3.A00()
        L3a:
            float r0 = r8.A02
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L41
            return
        L41:
            r7 = 1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L87
            float r0 = r8.A02
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L87
            com.facebook.ads.redexgen.X.gR r0 = r8.A0E
            boolean r0 = r0.A06()
            if (r0 == 0) goto L85
            com.facebook.ads.redexgen.X.gR r0 = r8.A0E
            long r5 = r0.A03()
            r1 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L85
            r0 = 1
        L67:
            if (r0 == 0) goto L82
            r1 = 1017370378(0x3ca3d70a, float:0.02)
        L6c:
            float r0 = r8.A02
            float r0 = r4 - r0
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L80
        L78:
            if (r7 == 0) goto L7f
            r8.A02 = r4
            r8.A09(r3)
        L7f:
            return
        L80:
            r7 = 0
            goto L78
        L82:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L6c
        L85:
            r0 = 0
            goto L67
        L87:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L8d
            r7 = 1
            goto L78
        L8d:
            com.facebook.ads.redexgen.X.gR r0 = r8.A0E
            int r0 = r0.A01()
            if (r0 < r5) goto L96
            goto L78
        L96:
            r7 = 0
            goto L78
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1706gn.A05():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(Display display) {
        if (display != null) {
            double defaultDisplayRefreshRate = display.getRefreshRate();
            this.A0A = (long) (1.0E9d / defaultDisplayRefreshRate);
            this.A0B = (this.A0A * 80) / 100;
            return;
        }
        AbstractC1633fb.A07(A02(36, 23, 100), A02(0, 36, 88));
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
    }

    private void A09(boolean z10) {
        if (AbstractC1672gE.A02 < 30 || this.A0C == null || this.A04 == Integer.MIN_VALUE) {
            return;
        }
        float f10 = 0.0f;
        if (this.A0D) {
            float f11 = this.A02;
            String[] strArr = A0I;
            if (strArr[7].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[7] = "Y9Ko4sWw8N";
            strArr2[5] = "qvFzGTXBODJMyG5diREJF0pEl1MB9hx";
            if (f11 != -1.0f) {
                float f12 = this.A02;
                float surfacePlaybackFrameRate = this.A01;
                f10 = f12 * surfacePlaybackFrameRate;
            }
        }
        if (!z10) {
            float surfacePlaybackFrameRate2 = this.A03;
            if (surfacePlaybackFrameRate2 == f10) {
                return;
            }
        }
        this.A03 = f10;
        C1702gj.A02(this.A0C, f10);
    }

    public static boolean A0A(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    public final long A0B(long j10) {
        long j11 = j10;
        if (this.A06 != -1 && this.A0E.A06()) {
            long A02 = this.A0E.A02();
            long frameDurationNs = this.A07;
            long j12 = this.A05;
            long adjustedReleaseTimeNs = this.A06;
            long frameDurationNs2 = frameDurationNs + (((float) ((j12 - adjustedReleaseTimeNs) * A02)) / this.A01);
            if (A0A(j11, frameDurationNs2)) {
                j11 = frameDurationNs2;
            } else {
                A04();
            }
        }
        long adjustedReleaseTimeNs2 = this.A05;
        this.A08 = adjustedReleaseTimeNs2;
        this.A09 = j11;
        if (this.A0G == null || this.A0A == -9223372036854775807L) {
            return j11;
        }
        long j13 = this.A0G.A04;
        int i10 = (j13 > (-9223372036854775807L) ? 1 : (j13 == (-9223372036854775807L) ? 0 : -1));
        String[] strArr = A0I;
        if (strArr[2].charAt(9) != strArr[6].charAt(9)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0I;
        strArr2[2] = "XZfN1sy6zag6ccWpZonCeAL6F7A2dhwP";
        strArr2[6] = "0Q65bcoMvaBytuYvigG0fUhEd63k8ySI";
        if (i10 == 0) {
            return j11;
        }
        long sampledVsyncTimeNs = A00(j11, j13, this.A0A);
        long adjustedReleaseTimeNs3 = this.A0B;
        return sampledVsyncTimeNs - adjustedReleaseTimeNs3;
    }

    public final void A0C() {
        A04();
    }

    public final void A0D() {
        this.A0D = true;
        A04();
        if (this.A0F != null) {
            ((Choreographer$FrameCallbackC1705gm) AbstractC1589es.A01(this.A0G)).A06();
            this.A0F.AGf(new InterfaceC1703gk() { // from class: com.facebook.ads.redexgen.X.Ov
                @Override // com.facebook.ads.redexgen.X.InterfaceC1703gk
                public final void ACs(Display display) {
                    C1706gn.this.A07(display);
                }
            });
        }
        A09(false);
    }

    public final void A0E() {
        this.A0D = false;
        if (this.A0F != null) {
            this.A0F.AJb();
            ((Choreographer$FrameCallbackC1705gm) AbstractC1589es.A01(this.A0G)).A07();
        }
        A03();
        if (A0I[4].length() != 3) {
            throw new RuntimeException();
        }
        A0I[0] = "buU96Qzpfn7b";
    }

    public final void A0F(float f10) {
        this.A00 = f10;
        this.A0E.A04();
        A05();
    }

    public final void A0G(long j10) {
        if (this.A08 != -1) {
            this.A06 = this.A08;
            long j11 = this.A09;
            if (A0I[1].charAt(1) != 'U') {
                throw new RuntimeException();
            }
            A0I[3] = "GaKGdyp";
            this.A07 = j11;
        }
        this.A05++;
        this.A0E.A05(1000 * j10);
        A05();
    }
}

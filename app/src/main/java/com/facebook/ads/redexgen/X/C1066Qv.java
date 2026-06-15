package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.DrmInitData;
import java.io.IOException;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Qv  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1066Qv implements InterfaceC1157Uo {
    public static byte[] A0Y;
    public static String[] A0Z = {"XzXkmQjlnIcOujio8W8Fy2Ah3M7hqWmA", "BQS8mfv5pZB50fcdlD1Nawg7npG607JE", "Eze6KeWuK9h2sy1NWgA09hMSo2LcYV2l", "sP1XvEFALue5112JxXwRmwtzic2f21I3", "bPz3Z", "d2bMLbuGP8ETgNUkC97KiNU83xhAlixE", "ufTGmh8dkock6vBpxGQL0lA6PNlA30Dq", "h2JN55IYyZiFdSxtszsPk2RvU5Dz"};
    public int A00;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A08;
    @MetaExoPlayerCustomization("Added in D14652852 for LiveTrace")
    public Uri A0A;
    public ZM A0B;
    public ZM A0C;
    public ZM A0D;
    public TA A0E;
    public InterfaceC1377bR A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final TJ A0T;
    public final TO A0U;
    public final C1373bN A0V;
    public final C1375bP A0W = new C1375bP();
    public int A01 = 1000;
    public int[] A0P = new int[this.A01];
    public long[] A0Q = new long[this.A01];
    public long[] A0R = new long[this.A01];
    public int[] A0N = new int[this.A01];
    public int[] A0O = new int[this.A01];
    public C1156Um[] A0S = new C1156Um[this.A01];
    public final C1392bg<C1376bQ> A0X = new C1392bg<>(new InterfaceC1600f3() { // from class: com.facebook.ads.redexgen.X.Qw
        @Override // com.facebook.ads.redexgen.X.InterfaceC1600f3
        public final void A2z(Object obj) {
            ((C1376bQ) obj).A01.AGj();
        }
    });
    public long A09 = Long.MIN_VALUE;
    public long A06 = Long.MIN_VALUE;
    public long A07 = Long.MIN_VALUE;
    public boolean A0L = true;
    public boolean A0M = true;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private synchronized int A03(P6 p62, C1214Ww c1214Ww, boolean z10, boolean z11, C1375bP c1375bP) {
        c1214Ww.A04 = false;
        if (!A0K()) {
            if (!z11 && !this.A0G) {
                if (this.A0D == null || (!z10 && this.A0D == this.A0B)) {
                    return -3;
                }
                A0H((ZM) AbstractC1589es.A01(this.A0D), p62);
                return -5;
            }
            c1214Ww.A02(4);
            return -4;
        }
        ZM zm = this.A0X.A01(A0O()).A00;
        if (z10 || zm != this.A0B) {
            A0H(zm, p62);
            return -5;
        }
        int A00 = A00(this.A03);
        if (!A0L(A00)) {
            c1214Ww.A04 = true;
            return -3;
        }
        c1214Ww.A02(this.A0N[A00]);
        c1214Ww.A01 = this.A0R[A00];
        if (c1214Ww.A01 < this.A09) {
            c1214Ww.A00(RecyclerView.UNDEFINED_DURATION);
        }
        c1375bP.A00 = this.A0O[A00];
        c1375bP.A01 = this.A0Q[A00];
        c1375bP.A02 = this.A0S[A00];
        return -4;
    }

    public static String A0C(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0Y, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0Z[2].charAt(31) != 'l') {
                throw new RuntimeException();
            }
            String[] strArr = A0Z;
            strArr[3] = "oIugEPgZKAjQ6nrqUpByKVoPWe4JYPMz";
            strArr[5] = "5cSWN0yPRhnYzoKOFrqoy8W7E0QEO8d9";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 82);
            i13++;
        }
    }

    public static void A0E() {
        A0Y = new byte[]{89, 96, 115, 100, 100, Byte.MAX_VALUE, 114, Byte.MAX_VALUE, 120, 113, 54, 99, 120, 115, 110, 102, 115, 117, 98, 115, 114, 54, 120, 121, 120, 59, 101, 111, 120, 117, 54, 101, 119, 123, 102, 122, 115, 54, 112, 121, 100, 54, 112, 121, 100, 123, 119, 98, 44, 54, 64, 114, 126, 99, Byte.MAX_VALUE, 118, 66, 102, 118, 102, 118};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private synchronized void A0G(long j10, int i10, long j11, int i11, C1156Um c1156Um) {
        if (this.A02 > 0) {
            int A00 = A00(this.A02 - 1);
            AbstractC1589es.A07(this.A0Q[A00] + ((long) this.A0O[A00]) <= j11);
        }
        this.A0G = (536870912 & i10) != 0;
        this.A07 = Math.max(this.A07, j10);
        int A002 = A00(this.A02);
        this.A0R[A002] = j10;
        this.A0Q[A002] = j11;
        this.A0O[A002] = i11;
        this.A0N[A002] = i10;
        this.A0S[A002] = c1156Um;
        this.A0P[A002] = this.A05;
        if (this.A0X.A06() || !this.A0X.A00().A00.equals(this.A0D)) {
            this.A0X.A05(A0P(), new C1376bQ((ZM) AbstractC1589es.A01(this.A0D), this.A0U != null ? this.A0U.AGB(this.A0T, this.A0D) : TN.A00));
        }
        this.A02++;
        if (this.A02 == this.A01) {
            int i12 = this.A01 + 1000;
            int[] iArr = new int[i12];
            long[] jArr = new long[i12];
            long[] jArr2 = new long[i12];
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            C1156Um[] c1156UmArr = new C1156Um[i12];
            int i13 = this.A01 - this.A04;
            System.arraycopy(this.A0Q, this.A04, jArr, 0, i13);
            System.arraycopy(this.A0R, this.A04, jArr2, 0, i13);
            System.arraycopy(this.A0N, this.A04, iArr2, 0, i13);
            System.arraycopy(this.A0O, this.A04, iArr3, 0, i13);
            System.arraycopy(this.A0S, this.A04, c1156UmArr, 0, i13);
            System.arraycopy(this.A0P, this.A04, iArr, 0, i13);
            int i14 = this.A04;
            System.arraycopy(this.A0Q, 0, jArr, i13, i14);
            System.arraycopy(this.A0R, 0, jArr2, i13, i14);
            System.arraycopy(this.A0N, 0, iArr2, i13, i14);
            System.arraycopy(this.A0O, 0, iArr3, i13, i14);
            System.arraycopy(this.A0S, 0, c1156UmArr, i13, i14);
            System.arraycopy(this.A0P, 0, iArr, i13, i14);
            this.A0Q = jArr;
            this.A0R = jArr2;
            this.A0N = iArr2;
            this.A0O = iArr3;
            this.A0S = c1156UmArr;
            this.A0P = iArr;
            this.A04 = 0;
            this.A01 = i12;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized long A0S() {
        return this.A02 == 0 ? Long.MIN_VALUE : this.A0R[this.A04];
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1157Uo
    public final /* synthetic */ int AHv(O9 o92, int i10, boolean z10) {
        return AbstractC1155Ul.A00(this, o92, i10, z10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1157Uo
    public final /* synthetic */ void AHx(C1648fq c1648fq, int i10) {
        AbstractC1155Ul.A01(this, c1648fq, i10);
    }

    static {
        A0E();
    }

    public C1066Qv(InterfaceC1496dM interfaceC1496dM, TO to, TJ tj) {
        this.A0U = to;
        this.A0T = tj;
        this.A0V = new C1373bN(interfaceC1496dM);
    }

    private int A00(int i10) {
        int i11 = this.A04 + i10;
        int relativeIndex = this.A01;
        if (i11 < relativeIndex) {
            return i11;
        }
        int i12 = this.A01;
        String[] strArr = A0Z;
        String str = strArr[3];
        String str2 = strArr[5];
        int charAt = str.charAt(0);
        int relativeIndex2 = str2.charAt(0);
        if (charAt != relativeIndex2) {
            String[] strArr2 = A0Z;
            strArr2[0] = "V9axmdcYH5ccgyaQwPRN0gbmYNo7J8z2";
            strArr2[6] = "zNKImK54Q6Ec0sLxrSbjAwJyAcsWXC5q";
            return i11 - i12;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
        if ((r0 & 1) != 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A01(int r6, int r7, long r8, boolean r10) {
        /*
            r5 = this;
            r4 = -1
            r3 = 0
        L2:
            if (r3 >= r7) goto L1f
            long[] r0 = r5.A0R
            r1 = r0[r6]
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 > 0) goto L1f
            if (r10 == 0) goto L16
            int[] r0 = r5.A0N
            r0 = r0[r6]
            r0 = r0 & 1
            if (r0 == 0) goto L20
        L16:
            r4 = r3
            long[] r0 = r5.A0R
            r1 = r0[r6]
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L20
        L1f:
            return r4
        L20:
            int r6 = r6 + 1
            int r0 = r5.A01
            if (r6 != r0) goto L27
            r6 = 0
        L27:
            int r3 = r3 + 1
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1066Qv.A01(int, int, long, boolean):int");
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A02(long r6) {
        /*
            r5 = this;
            int r4 = r5.A02
            int r0 = r5.A02
            int r0 = r0 + (-1)
            int r3 = r5.A00(r0)
        La:
            int r0 = r5.A03
            if (r4 <= r0) goto L22
            long[] r0 = r5.A0R
            r1 = r0[r3]
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L22
            int r4 = r4 + (-1)
            int r3 = r3 + (-1)
            r0 = -1
            if (r3 != r0) goto La
            int r0 = r5.A01
            int r3 = r0 + (-1)
            goto La
        L22:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1066Qv.A02(long):int");
    }

    private synchronized long A04() {
        if (this.A02 == 0) {
            return -1L;
        }
        return A06(this.A02);
    }

    private final synchronized long A05() {
        return Math.max(this.A06, A08(this.A03));
    }

    private long A06(int i10) {
        this.A06 = Math.max(this.A06, A08(i10));
        this.A02 -= i10;
        this.A00 += i10;
        this.A04 += i10;
        if (this.A04 >= this.A01) {
            this.A04 -= this.A01;
        }
        this.A03 -= i10;
        if (this.A03 < 0) {
            String[] strArr = A0Z;
            if (strArr[7].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Z;
            strArr2[3] = "WVz4D66Tj21a08Qir9ONHYdv5FLzF0KF";
            strArr2[5] = "7hudXfvUAGpuJm6Qmm0rjyWWjHZqHLp7";
            this.A03 = 0;
        }
        this.A0X.A04(this.A00);
        if (this.A02 == 0) {
            int relativeLastDiscardIndex = this.A04 == 0 ? this.A01 : this.A04;
            int i11 = relativeLastDiscardIndex - 1;
            long j10 = this.A0Q[i11];
            int relativeLastDiscardIndex2 = this.A0O[i11];
            return j10 + relativeLastDiscardIndex2;
        }
        long j11 = this.A0Q[this.A04];
        if (A0Z[2].charAt(31) != 'l') {
            return j11;
        }
        String[] strArr3 = A0Z;
        strArr3[0] = "JdwimemRFAqQR4ZZeKK3yA251rw7nGFc";
        strArr3[6] = "pnJtmtApyfrmXTRdv0WJB6lrdfNTrPJm";
        return j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long A07(int r8) {
        /*
            r7 = this;
            int r5 = r7.A0P()
            int r5 = r5 - r8
            r4 = 0
            r6 = 1
            if (r5 < 0) goto L2b
            int r1 = r7.A02
            int r0 = r7.A03
            int r1 = r1 - r0
            if (r5 > r1) goto L2b
            r0 = 1
        L11:
            com.facebook.ads.redexgen.X.AbstractC1589es.A07(r0)
            int r3 = r7.A02
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1066Qv.A0Z
            r0 = 2
            r1 = r1[r0]
            r0 = 31
            char r1 = r1.charAt(r0)
            r0 = 108(0x6c, float:1.51E-43)
            if (r1 == r0) goto L2d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2b:
            r0 = 0
            goto L11
        L2d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1066Qv.A0Z
            java.lang.String r1 = "MdlRTntXEyTeJnYTh9zs2vpgsAV6sfZa"
            r0 = 1
            r2[r0] = r1
            int r3 = r3 - r5
            r7.A02 = r3
            long r2 = r7.A06
            int r0 = r7.A02
            long r0 = r7.A08(r0)
            long r0 = java.lang.Math.max(r2, r0)
            r7.A07 = r0
            if (r5 != 0) goto L4c
            boolean r0 = r7.A0G
            if (r0 == 0) goto L4c
            r4 = 1
        L4c:
            r7.A0G = r4
            com.facebook.ads.redexgen.X.bg<com.facebook.ads.redexgen.X.bQ> r0 = r7.A0X
            r0.A03(r8)
            int r0 = r7.A02
            if (r0 == 0) goto L69
            int r0 = r7.A02
            int r0 = r0 - r6
            int r1 = r7.A00(r0)
            long[] r0 = r7.A0Q
            r2 = r0[r1]
            int[] r0 = r7.A0O
            r0 = r0[r1]
            long r0 = (long) r0
            long r2 = r2 + r0
            return r2
        L69:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1066Qv.A07(int):long");
    }

    private long A08(int i10) {
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        long j10 = Long.MIN_VALUE;
        int A00 = A00(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            long largestTimestampUs = this.A0R[A00];
            j10 = Math.max(j10, largestTimestampUs);
            if ((this.A0N[A00] & 1) != 0) {
                break;
            }
            A00--;
            String[] strArr = A0Z;
            if (strArr[3].charAt(0) == strArr[5].charAt(0)) {
                throw new RuntimeException();
            }
            A0Z[1] = "tbllSvgJ0rQ0RFVR9sk52v7wS8d6fpNv";
            if (A00 == -1) {
                A00 = this.A01 - 1;
            }
        }
        return j10;
    }

    private synchronized long A09(long j10, boolean z10, boolean z11) {
        if (this.A02 != 0 && j10 >= this.A0R[this.A04]) {
            int A01 = A01(this.A04, (!z11 || this.A03 == this.A02) ? this.A02 : this.A03 + 1, j10, z10);
            if (A01 == -1) {
                return -1L;
            }
            return A06(A01);
        }
        return -1L;
    }

    private final ZM A0A(ZM zm) {
        if (this.A08 != 0 && zm.A0M != Long.MAX_VALUE) {
            return zm.A07().A0s(zm.A0M + this.A08).A14();
        }
        return zm;
    }

    public static C1066Qv A0B(InterfaceC1496dM interfaceC1496dM, TO to, TJ tj) {
        return new C1066Qv(interfaceC1496dM, (TO) AbstractC1589es.A01(to), (TJ) AbstractC1589es.A01(tj));
    }

    private void A0D() {
        if (this.A0E != null) {
            this.A0E.AGk(this.A0T);
            this.A0E = null;
            this.A0B = null;
        }
    }

    private synchronized void A0F() {
        this.A03 = 0;
        this.A0V.A0B();
    }

    private void A0H(ZM zm, P6 p62) {
        ZM zm2;
        boolean z10 = this.A0B == null;
        DrmInitData newDrmInitData = z10 ? null : this.A0B.A0O;
        this.A0B = zm;
        DrmInitData oldDrmInitData = zm.A0O;
        if (this.A0U != null) {
            zm2 = zm.A08(this.A0U.A7M(zm));
        } else {
            zm2 = zm;
        }
        p62.A00 = zm2;
        p62.A01 = this.A0E;
        if (this.A0U == null) {
            return;
        }
        if (!z10) {
            boolean isFirstFormat = AbstractC1672gE.A1E(newDrmInitData, oldDrmInitData);
            if (isFirstFormat) {
                return;
            }
        }
        if (Looper.myLooper() == null) {
            return;
        }
        TA previousSession = this.A0E;
        this.A0E = this.A0U.A32(this.A0T, zm);
        p62.A01 = this.A0E;
        if (previousSession != null) {
            TJ tj = this.A0T;
            String[] strArr = A0Z;
            if (strArr[3].charAt(0) == strArr[5].charAt(0)) {
                throw new RuntimeException();
            }
            A0Z[1] = "kVDWtkerIPwbzelCZBhq0qaXj3x6PEQk";
            previousSession.AGk(tj);
        }
    }

    private final void A0J(boolean z10) {
        this.A0V.A0A();
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A0M = true;
        this.A09 = Long.MIN_VALUE;
        this.A06 = Long.MIN_VALUE;
        this.A07 = Long.MIN_VALUE;
        this.A0G = false;
        this.A0X.A02();
        if (z10) {
            this.A0C = null;
            this.A0D = null;
            String[] strArr = A0Z;
            if (strArr[7].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Z;
            strArr2[7] = "4MRRfSUFF0P8gspUtLKGI7bMK1Ea";
            strArr2[4] = "yMETr";
            this.A0L = true;
        }
    }

    private boolean A0K() {
        return this.A03 != this.A02;
    }

    private boolean A0L(int i10) {
        if (this.A0E != null && this.A0E.A90() != 4) {
            if ((this.A0N[i10] & 1073741824) == 0) {
                boolean AG9 = this.A0E.AG9();
                if (A0Z[1].charAt(27) != '6') {
                    throw new RuntimeException();
                }
                String[] strArr = A0Z;
                strArr[0] = "2T4AmmBguKiJYkhIse2z0F537NC4c1Fx";
                strArr[6] = "Z95wmCIcAJt5YZrTrs3JYzy5GQIbO6Lk";
                if (AG9) {
                }
            }
            return false;
        }
        return true;
    }

    private synchronized boolean A0M(long j10) {
        boolean z10 = true;
        if (this.A02 == 0) {
            if (j10 <= this.A06) {
                z10 = false;
            }
            return z10;
        } else if (A05() >= j10) {
            return false;
        } else {
            int A02 = A02(j10);
            int retainCount = this.A00;
            A07(retainCount + A02);
            return true;
        }
    }

    private synchronized boolean A0N(ZM zm) {
        this.A0L = false;
        if (AbstractC1672gE.A1E(zm, this.A0D)) {
            return false;
        }
        if (!this.A0X.A06() && this.A0X.A00().A00.equals(zm)) {
            this.A0D = this.A0X.A00().A00;
        } else {
            this.A0D = zm;
        }
        this.A0J = Q2.A0G(this.A0D.A0W, this.A0D.A0R);
        this.A0H = false;
        return true;
    }

    public final int A0O() {
        return this.A00 + this.A03;
    }

    public final int A0P() {
        return this.A00 + this.A02;
    }

    public final synchronized int A0Q(long j10, boolean z10) {
        int A00 = A00(this.A03);
        if (A0K()) {
            int relativeReadIndex = (j10 > this.A0R[A00] ? 1 : (j10 == this.A0R[A00] ? 0 : -1));
            if (relativeReadIndex >= 0) {
                int relativeReadIndex2 = (j10 > this.A07 ? 1 : (j10 == this.A07 ? 0 : -1));
                if (relativeReadIndex2 > 0 && z10) {
                    int i10 = this.A02;
                    int relativeReadIndex3 = this.A03;
                    return i10 - relativeReadIndex3;
                }
                int i11 = this.A02;
                int relativeReadIndex4 = this.A03;
                int offset = A01(A00, i11 - relativeReadIndex4, j10, true);
                if (offset == -1) {
                    return 0;
                }
                return offset;
            }
        }
        return 0;
    }

    public final int A0R(P6 p62, C1214Ww c1214Ww, int i10, boolean z10) {
        int A03 = A03(p62, c1214Ww, (i10 & 2) != 0, z10, this.A0W);
        if (A03 == -4 && !c1214Ww.A05()) {
            int i11 = i10 & 1;
            if (A0Z[2].charAt(31) != 'l') {
                throw new RuntimeException();
            }
            A0Z[2] = "FwWci1Trh12LEFPya5rTNs6Y30vMmoll";
            boolean z11 = i11 != 0;
            int result = i10 & 4;
            if (result == 0) {
                if (z11) {
                    this.A0V.A0D(c1214Ww, this.A0W);
                } else {
                    this.A0V.A0E(c1214Ww, this.A0W);
                }
            }
            if (!z11) {
                int result2 = this.A03;
                this.A03 = result2 + 1;
            }
        }
        return A03;
    }

    public final synchronized long A0T() {
        return this.A07;
    }

    public final synchronized ZM A0U() {
        return this.A0L ? null : this.A0D;
    }

    public final void A0V() {
        this.A0V.A0C(A04());
    }

    public final void A0W() throws IOException {
        if (this.A0E == null || this.A0E.A90() != 1) {
            return;
        }
        throw ((T8) AbstractC1589es.A01(this.A0E.A7q()));
    }

    public final void A0X() {
        A0V();
        A0D();
    }

    public final void A0Y() {
        A0J(true);
        A0D();
    }

    public final void A0Z() {
        A0J(false);
    }

    public final synchronized void A0a(int i10) {
        boolean z10;
        if (i10 >= 0) {
            if (this.A03 + i10 <= this.A02) {
                z10 = true;
                AbstractC1589es.A07(z10);
                this.A03 += i10;
            }
        }
        z10 = false;
        AbstractC1589es.A07(z10);
        this.A03 += i10;
    }

    public final void A0b(long j10) {
        this.A09 = j10;
    }

    public final void A0c(long j10, boolean z10, boolean z11) {
        this.A0V.A0C(A09(j10, z10, z11));
    }

    public final void A0d(InterfaceC1377bR interfaceC1377bR) {
        this.A0F = interfaceC1377bR;
    }

    public final synchronized boolean A0e() {
        return this.A0G;
    }

    public final synchronized boolean A0f(long j10, boolean z10) {
        A0F();
        int A00 = A00(this.A03);
        if (A0K()) {
            int relativeReadIndex = (j10 > this.A0R[A00] ? 1 : (j10 == this.A0R[A00] ? 0 : -1));
            if (relativeReadIndex >= 0) {
                int relativeReadIndex2 = (j10 > this.A07 ? 1 : (j10 == this.A07 ? 0 : -1));
                if (relativeReadIndex2 <= 0 || z10) {
                    int i10 = this.A02;
                    int relativeReadIndex3 = this.A03;
                    int offset = A01(A00, i10 - relativeReadIndex3, j10, true);
                    if (offset == -1) {
                        return false;
                    }
                    this.A09 = j10;
                    int relativeReadIndex4 = this.A03;
                    this.A03 = relativeReadIndex4 + offset;
                    return true;
                }
            }
        }
        return false;
    }

    public final synchronized boolean A0g(boolean z10) {
        boolean z11 = true;
        if (!A0K()) {
            if (!z10 && !this.A0G && (this.A0D == null || this.A0D == this.A0B)) {
                z11 = false;
            }
            return z11;
        } else if (this.A0X.A01(A0O()).A00 != this.A0B) {
            return true;
        } else {
            return A0L(A00(this.A03));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1157Uo
    public final void A6U(ZM zm) {
        ZM A0A = A0A(zm);
        this.A0K = false;
        this.A0C = zm;
        boolean upstreamFormatChanged = A0N(A0A);
        if (this.A0F != null && upstreamFormatChanged) {
            InterfaceC1377bR interfaceC1377bR = this.A0F;
            String[] strArr = A0Z;
            if (strArr[0].charAt(4) != strArr[6].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Z;
            strArr2[3] = "SR5M8Kc5PR5mPxcb0lhI1b4SX72sywAC";
            strArr2[5] = "Xej6uOEnPXc6rla11Ixsfdcb7q4t17tj";
            interfaceC1377bR.AFT(A0A);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1157Uo
    public final int AHw(O9 o92, int i10, boolean z10, int i11) throws IOException {
        return this.A0V.A08(o92, i10, z10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1157Uo
    public final void AHy(C1648fq c1648fq, int i10, int i11) {
        this.A0V.A0F(c1648fq, i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1157Uo
    public final void AI0(long j10, int i10, int i11, int flags, C1156Um c1156Um) {
        int i12 = i10;
        if (this.A0K) {
            A6U((ZM) AbstractC1589es.A02(this.A0C));
        }
        boolean z10 = (i12 & 1) != 0;
        if (this.A0M) {
            if (!z10) {
                return;
            }
            this.A0M = false;
        }
        long j11 = this.A08;
        String[] strArr = A0Z;
        if (strArr[3].charAt(0) == strArr[5].charAt(0)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0Z;
        strArr2[7] = "v8m2Y8KdyVxf3fEdqDJtR59XIEPU";
        strArr2[4] = "4tVyo";
        long j12 = j10 + j11;
        if (this.A0J) {
            if (j12 < this.A09) {
                return;
            }
            if ((i12 & 1) == 0) {
                if (!this.A0H) {
                    AbstractC1633fb.A07(A0C(50, 11, 65), A0C(0, 50, 68) + this.A0D);
                    this.A0H = true;
                }
                i12 |= 1;
            }
        }
        boolean z11 = this.A0I;
        String[] strArr3 = A0Z;
        String str = strArr3[3];
        String str2 = strArr3[5];
        int charAt = str.charAt(0);
        int flags2 = str2.charAt(0);
        if (charAt == flags2) {
            throw new RuntimeException();
        }
        A0Z[1] = "2fG2NVvnLUuSuv5Jt6swpqwEhJQ6dWw3";
        if (z11) {
            if (!z10) {
                return;
            }
            boolean A0M = A0M(j12);
            String[] strArr4 = A0Z;
            String str3 = strArr4[0];
            String str4 = strArr4[6];
            int charAt2 = str3.charAt(4);
            int flags3 = str4.charAt(4);
            if (charAt2 != flags3) {
                throw new RuntimeException();
            }
            String[] strArr5 = A0Z;
            strArr5[0] = "dw41mcbYwYaV8pzqWfmlHkqSmQ1KU97q";
            strArr5[6] = "R94UmEwjFkupYUWGOUdfSDQv8LXU36Fz";
            if (!A0M) {
                return;
            }
            this.A0I = false;
        }
        A0G(j12, i12, (this.A0V.A09() - i11) - flags, i11, c1156Um);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1157Uo
    @MetaExoPlayerCustomization("Added in D14652852 for LiveTrace")
    public final void AJk(Uri uri) {
        this.A0A = uri;
    }
}

package com.facebook.ads.redexgen.X;

import com.google.android.exoplayer2.Timeline;
/* renamed from: com.facebook.ads.redexgen.X.Pf  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1027Pf {
    public static String[] A0B = {"8fkFqchXUcGM3GB2ba14hXLjxjyP4Idi", "AvOIHvoZOcRClJ0G73Ag8xCmCcxwXM7O", "V5l74qymwUJRk6eelGVqnexfLvPv42ur", "EHuFCJBNSCvpunnAG12EWG8LViJ3DR8Z", "godF8uqaodEh", "1Ds6BMKRJ3GI993NLcR574jhDn4Umkmd", "BbYDBW0PzExgzpSlBB8x1sXiVd4lWXuJ", "X0psFw953nJyWmdp"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C1022Pa A04;
    public C1022Pa A05;
    public C1022Pa A06;
    public Object A07;
    public boolean A08;
    public final C1250Yh A09 = new C1250Yh();
    public final C1248Yf A0A = new C1248Yf();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static R5 A06(Timeline timeline, Object obj, long j10, long j11, C1250Yh c1250Yh) {
        timeline.A0J(obj, c1250Yh);
        int A08 = c1250Yh.A08(j10);
        return A08 == -1 ? new R5(obj, j11) : new R5(obj, A08, c1250Yh.A05(A08), j11);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final C1024Pc A0I(Timeline timeline, C1024Pc c1024Pc) {
        long j10 = c1024Pc.A01;
        boolean A09 = A09(timeline, c1024Pc.A04, j10);
        boolean A0A = A0A(timeline, c1024Pc.A04, A09);
        timeline.A0J(c1024Pc.A04.A04, this.A09);
        return new C1024Pc(c1024Pc.A04, c1024Pc.A03, j10, c1024Pc.A02, c1024Pc.A04.A00() ? this.A09.A0E(c1024Pc.A04.A00, c1024Pc.A04.A01) : j10 == Long.MIN_VALUE ? this.A09.A0A() : j10, A09, A0A);
    }

    private long A00(Timeline timeline, Object obj) {
        int oldFrontPeriodIndex;
        int holderWindowIndex = timeline.A0J(obj, this.A09).A00;
        if (this.A07 != null && (oldFrontPeriodIndex = timeline.A0A(this.A07)) != -1) {
            int windowIndex = timeline.A0H(oldFrontPeriodIndex, this.A09).A00;
            if (windowIndex == holderWindowIndex) {
                return this.A03;
            }
        }
        for (C1022Pa mediaPeriodHolder = A0D(); mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.A0I()) {
            if (mediaPeriodHolder.A08.equals(obj)) {
                return mediaPeriodHolder.A00.A04.A03;
            }
        }
        for (C1022Pa A0D = A0D(); A0D != null; A0D = A0D.A0I()) {
            int A0A = timeline.A0A(A0D.A08);
            if (A0A != -1) {
                int windowIndex2 = timeline.A0H(A0A, this.A09).A00;
                if (windowIndex2 == holderWindowIndex) {
                    return A0D.A00.A04.A03;
                }
            }
        }
        long j10 = this.A02;
        long j11 = 1 + j10;
        if (A0B[4].length() != 12) {
            throw new RuntimeException();
        }
        String[] strArr = A0B;
        strArr[5] = "Y2hl0p1SbqGAlNTWcrC2XNi8ndDCDtsR";
        strArr[0] = "Izgfn9uCHIGC9mhSAUVnemVit3EFITb3";
        this.A02 = j11;
        return j10;
    }

    private C1024Pc A01(Q9 q92) {
        return A03(q92.A04, q92.A06, q92.A01, q92.A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:?, code lost:
        return A04(r20, r1.A04, r13, r14, r3.A02, r1.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
        if (r2 == (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
        r2 = com.facebook.ads.redexgen.X.C1027Pf.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
        if (r2[1].charAt(25) == r2[2].charAt(25)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
        com.facebook.ads.redexgen.X.C1027Pf.A0B[7] = "MqLFMbnT7v3WaWrM";
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
        if (r2 == (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0102, code lost:
        if (r3 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0104, code lost:
        r4 = r3.A08.equals(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0115, code lost:
        if (com.facebook.ads.redexgen.X.C1027Pf.A0B[4].length() == 12) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0117, code lost:
        r2 = com.facebook.ads.redexgen.X.C1027Pf.A0B;
        r2[1] = "IZKtn5TUnMQ57P5mSa3ANNzxzWEbxBqQ";
        r2[2] = "eqVdGZu4zjQzFY1qj8yPYRzHDhbkRknX";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0123, code lost:
        if (r4 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0125, code lost:
        r15 = r3.A00.A04.A03;
        r0 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012e, code lost:
        com.facebook.ads.redexgen.X.C1027Pf.A0B[6] = "tpPESRoAuEAb4e69uCqZphrb99wvv2kv";
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0135, code lost:
        if (r4 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0147, code lost:
        if (r3 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x014a, code lost:
        r0 = r19;
        r15 = r0.A02;
        r1 = 1 + r15;
        r0.A02 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0166, code lost:
        r14 = r0.A09.A06(r13, r1.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x016e, code lost:
        if (r14 >= r2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0176, code lost:
        if (r0.A09.A0I(r13, r14) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0178, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0195, code lost:
        return A05(r20, r1.A04, r3.A02, r1.A03);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.facebook.ads.redexgen.X.C1024Pc A02(com.google.android.exoplayer2.Timeline r20, com.facebook.ads.redexgen.X.C1022Pa r21, long r22) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1027Pf.A02(com.google.android.exoplayer2.Timeline, com.facebook.ads.redexgen.X.Pa, long):com.facebook.ads.redexgen.X.Pc");
    }

    private C1024Pc A03(Timeline timeline, R5 r52, long j10, long j11) {
        timeline.A0J(r52.A04, this.A09);
        if (r52.A00()) {
            if (this.A09.A0I(r52.A00, r52.A01)) {
                return A04(timeline, r52.A04, r52.A00, r52.A01, j10, r52.A03);
            }
            if (A0B[3].charAt(1) != 'H') {
                throw new RuntimeException();
            }
            A0B[3] = "PH1Tjz7yfLWgyQ6PpM2ZkhsFxtYWDAK0";
            return null;
        }
        return A05(timeline, r52.A04, j11, r52.A03);
    }

    private C1024Pc A04(Timeline timeline, Object obj, int i10, int i11, long startPositionUs, long j10) {
        long j11;
        R5 r52 = new R5(obj, i10, i11, j10);
        boolean A09 = A09(timeline, r52, Long.MIN_VALUE);
        boolean A0A = A0A(timeline, r52, A09);
        long A0E = timeline.A0J(r52.A04, this.A09).A0E(r52.A00, r52.A01);
        if (i11 == this.A09.A05(i10)) {
            j11 = this.A09.A09();
        } else {
            j11 = 0;
            if (A0B[3].charAt(1) != 'H') {
                throw new RuntimeException();
            }
            A0B[7] = "xco6TO7esNuLitQ8";
        }
        return new C1024Pc(r52, j11, Long.MIN_VALUE, startPositionUs, A0E, A09, A0A);
    }

    private C1024Pc A05(Timeline timeline, Object obj, long j10, long j11) {
        long A0D;
        long j12;
        R5 r52 = new R5(obj, j11);
        timeline.A0J(r52.A04, this.A09);
        int A07 = this.A09.A07(j10);
        if (A07 == -1) {
            A0D = Long.MIN_VALUE;
        } else {
            C1250Yh c1250Yh = this.A09;
            String[] strArr = A0B;
            if (strArr[5].charAt(10) != strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[5] = "wDYImplyZDGHJhnx6RPwrAT9qMoadwYR";
            strArr2[0] = "PRFGZvYb4FGWelJr6BRaBG9ua1gE9Tz9";
            A0D = c1250Yh.A0D(A07);
        }
        boolean isLastInTimeline = A09(timeline, r52, A0D);
        boolean A0A = A0A(timeline, r52, isLastInTimeline);
        int i10 = (A0D > Long.MIN_VALUE ? 1 : (A0D == Long.MIN_VALUE ? 0 : -1));
        String[] strArr3 = A0B;
        if (strArr3[1].charAt(25) != strArr3[2].charAt(25)) {
            A0B[3] = "pHVz8oUC0qhz2c5oWjXi4aXG34tvhkfS";
            if (i10 == 0) {
                C1250Yh c1250Yh2 = this.A09;
                if (A0B[6].charAt(9) == 'E') {
                    A0B[7] = "mSPpQk354VGonlhD";
                    j12 = c1250Yh2.A0A();
                }
            } else {
                j12 = A0D;
            }
            return new C1024Pc(r52, j10, A0D, -9223372036854775807L, j12, isLastInTimeline, A0A);
        }
        throw new RuntimeException();
    }

    private boolean A07(C1022Pa c1022Pa, C1024Pc c1024Pc) {
        C1024Pc c1024Pc2 = c1022Pa.A00;
        return c1024Pc2.A03 == c1024Pc.A03 && c1024Pc2.A01 == c1024Pc.A01 && c1024Pc2.A04.equals(c1024Pc.A04);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
        r1 = A0P(r3);
        r3.A00 = A0I(r14, r3.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r1 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
        if (A0N() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
        return true;
     */
    /* JADX WARN: Incorrect condition in loop: B:8:0x001f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A08(com.google.android.exoplayer2.Timeline r14) {
        /*
            r13 = this;
            com.facebook.ads.redexgen.X.Pa r3 = r13.A0D()
            r6 = 1
            if (r3 != 0) goto L8
            return r6
        L8:
            java.lang.Object r0 = r3.A08
            r7 = r14
            int r8 = r7.A0A(r0)
        Lf:
            com.facebook.ads.redexgen.X.Yh r9 = r13.A09
            com.facebook.ads.redexgen.X.Yf r10 = r13.A0A
            int r11 = r13.A01
            boolean r12 = r13.A08
            int r8 = r7.A09(r8, r9, r10, r11, r12)
        L1b:
            com.facebook.ads.redexgen.X.Pa r0 = r3.A0I()
            if (r0 == 0) goto L2c
            com.facebook.ads.redexgen.X.Pc r0 = r3.A00
            boolean r0 = r0.A07
            if (r0 != 0) goto L2c
            com.facebook.ads.redexgen.X.Pa r3 = r3.A0I()
            goto L1b
        L2c:
            com.facebook.ads.redexgen.X.Pa r5 = r3.A0I()
            r0 = -1
            if (r8 == r0) goto L35
            if (r5 != 0) goto L4c
        L35:
            boolean r1 = r13.A0P(r3)
            com.facebook.ads.redexgen.X.Pc r0 = r3.A00
            com.facebook.ads.redexgen.X.Pc r0 = r13.A0I(r7, r0)
            r3.A00 = r0
            if (r1 == 0) goto L49
            boolean r0 = r13.A0N()
            if (r0 != 0) goto L4a
        L49:
            return r6
        L4a:
            r6 = 0
            goto L49
        L4c:
            java.lang.Object r0 = r5.A08
            int r4 = r7.A0A(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1027Pf.A0B
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 12
            if (r1 == r0) goto L65
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L65:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1027Pf.A0B
            java.lang.String r1 = "xHuyMgMzz6KTBKBqxb3PM6zQzphf6McT"
            r0 = 3
            r2[r0] = r1
            if (r4 == r8) goto L6f
            goto L35
        L6f:
            r3 = r5
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1027Pf.A08(com.google.android.exoplayer2.Timeline):boolean");
    }

    private boolean A09(Timeline timeline, R5 r52, long j10) {
        int adGroupCount = timeline.A0J(r52.A04, this.A09).A03();
        if (adGroupCount == 0) {
            return true;
        }
        int postrollAdCount = adGroupCount - 1;
        boolean A00 = r52.A00();
        long A0D = this.A09.A0D(postrollAdCount);
        if (A0B[4].length() != 12) {
            throw new RuntimeException();
        }
        String[] strArr = A0B;
        strArr[1] = "mTqZYkGC43bl3pbhwXvxRYHeHqWw3ZiT";
        strArr[2] = "zIDzl8zmG9PG4lDyHHGti1Q8hXr57aIX";
        if (A0D != Long.MIN_VALUE) {
            return !A00 && j10 == Long.MIN_VALUE;
        }
        int lastAdGroupIndex = this.A09.A04(postrollAdCount);
        if (lastAdGroupIndex == -1) {
            return false;
        }
        if (((A00 && r52.A00 == postrollAdCount && r52.A01 == lastAdGroupIndex + (-1)) ? 1 : 0) == 0) {
            return !A00 && this.A09.A05(postrollAdCount) == lastAdGroupIndex;
        }
        return true;
    }

    private boolean A0A(Timeline timeline, R5 r52, boolean z10) {
        int A0A = timeline.A0A(r52.A04);
        return !timeline.A0K(timeline.A0H(A0A, this.A09).A00, this.A0A).A0D && timeline.A0O(A0A, this.A09, this.A0A, this.A01, this.A08) && z10;
    }

    public final C1022Pa A0B() {
        if (this.A05 != null) {
            if (this.A05 == this.A06) {
                this.A06 = this.A05.A0I();
            }
            this.A05.A0M();
            this.A05 = this.A05.A0I();
            this.A00--;
            if (this.A00 == 0) {
                this.A04 = null;
            }
        } else {
            this.A05 = this.A04;
            this.A06 = this.A04;
        }
        return this.A05;
    }

    public final C1022Pa A0C() {
        AbstractC1589es.A08((this.A06 == null || this.A06.A0I() == null) ? false : true);
        this.A06 = this.A06.A0I();
        return this.A06;
    }

    public final C1022Pa A0D() {
        return A0N() ? this.A05 : this.A04;
    }

    public final C1022Pa A0E() {
        return this.A04;
    }

    public final C1022Pa A0F() {
        return this.A05;
    }

    public final C1022Pa A0G() {
        return this.A06;
    }

    public final C1024Pc A0H(long j10, Q9 q92) {
        if (this.A04 == null) {
            return A01(q92);
        }
        return A02(q92.A04, this.A04, j10);
    }

    public final R7 A0J(InterfaceC1054Qi[] interfaceC1054QiArr, long j10, AbstractC1490dG abstractC1490dG, InterfaceC1496dM interfaceC1496dM, InterfaceC1352az interfaceC1352az, C1024Pc c1024Pc, C1491dH c1491dH) {
        long j11;
        if (this.A04 == null) {
            j11 = c1024Pc.A03 + j10;
        } else {
            long A0B2 = this.A04.A0B();
            C1022Pa c1022Pa = this.A04;
            if (A0B[3].charAt(1) != 'H') {
                throw new RuntimeException();
            }
            A0B[3] = "zHWg3XufUD4x9owY3MX12sZCE1mX9C1M";
            j11 = A0B2 + c1022Pa.A00.A00;
        }
        C1022Pa c1022Pa2 = new C1022Pa(interfaceC1054QiArr, j11, abstractC1490dG, interfaceC1496dM, interfaceC1352az, c1024Pc, c1491dH);
        if (this.A04 != null) {
            AbstractC1589es.A08(A0N());
            this.A04.A0Q(c1022Pa2);
        }
        this.A07 = null;
        this.A04 = c1022Pa2;
        this.A00++;
        return c1022Pa2.A07;
    }

    public final R5 A0K(Timeline timeline, Object obj, long j10) {
        return A06(timeline, obj, j10, A00(timeline, obj), this.A09);
    }

    public final void A0L(long j10) {
        if (this.A04 != null) {
            this.A04.A0P(j10);
        }
    }

    public final void A0M(boolean z10) {
        C1022Pa A0D = A0D();
        if (A0D != null) {
            this.A07 = z10 ? A0D.A08 : null;
            this.A03 = A0D.A00.A04.A03;
            A0D.A0M();
            A0P(A0D);
        } else if (!z10) {
            this.A07 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }

    public final boolean A0N() {
        return this.A05 != null;
    }

    public final boolean A0O() {
        return this.A04 == null || (!this.A04.A00.A05 && this.A04.A0R() && this.A04.A00.A00 != -9223372036854775807L && this.A00 < 100);
    }

    public final boolean A0P(C1022Pa c1022Pa) {
        AbstractC1589es.A08(c1022Pa != null);
        boolean z10 = false;
        this.A04 = c1022Pa;
        while (c1022Pa.A0I() != null) {
            c1022Pa = c1022Pa.A0I();
            if (A0B[4].length() != 12) {
                throw new RuntimeException();
            }
            String[] strArr = A0B;
            strArr[5] = "PXXRnlvHglGbwzngMISaT0AmGuSqoNwV";
            strArr[0] = "y6YjVifC3nGC3RRKgqPm31YsH6YO2P7Q";
            if (c1022Pa == this.A06) {
                this.A06 = this.A05;
                z10 = true;
            }
            c1022Pa.A0M();
            if (A0B[6].charAt(9) != 'E') {
                this.A00--;
            } else {
                A0B[7] = "6bINXvk45MlUDGCq";
                this.A00--;
            }
        }
        this.A04.A0Q(null);
        return z10;
    }

    public final boolean A0Q(Timeline timeline, int i10) {
        this.A01 = i10;
        return A08(timeline);
    }

    public final boolean A0R(Timeline timeline, R5 r52, long j10) {
        int A0A = timeline.A0A(r52.A04);
        C1022Pa c1022Pa = null;
        for (C1022Pa A0D = A0D(); A0D != null; A0D = A0D.A0I()) {
            if (c1022Pa == null) {
                C1024Pc A0I = A0I(timeline, A0D.A00);
                String[] strArr = A0B;
                String str = strArr[1];
                String str2 = strArr[2];
                int charAt = str.charAt(25);
                int periodIndex = str2.charAt(25);
                if (charAt == periodIndex) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0B;
                strArr2[5] = "VTjbZelP28G7FA88L37nAoXgiFJBzNYI";
                strArr2[0] = "6KATzOF7QQGaxXxovrpsPaUNZg55Hmbo";
                A0D.A00 = A0I;
            } else if (A0A == -1 || !A0D.A08.equals(timeline.A0M(A0A))) {
                return true ^ A0P(c1022Pa);
            } else {
                C1024Pc A02 = A02(timeline, c1022Pa, j10);
                if (A02 == null) {
                    return true ^ A0P(c1022Pa);
                }
                C1024Pc c1024Pc = A0D.A00;
                if (A0B[7].length() != 16) {
                    A0D.A00 = A0I(timeline, c1024Pc);
                    if (!A07(A0D, A02)) {
                        return true ^ A0P(c1022Pa);
                    }
                } else {
                    A0B[6] = "nYfKrQ9J8EEoOgZWpnsyQE7dAEB6YU7S";
                    A0D.A00 = A0I(timeline, c1024Pc);
                    if (!A07(A0D, A02)) {
                        return true ^ A0P(c1022Pa);
                    }
                }
            }
            if (A0D.A00.A07) {
                A0A = timeline.A09(A0A, this.A09, this.A0A, this.A01, this.A08);
            }
            c1022Pa = A0D;
            String[] strArr3 = A0B;
            String str3 = strArr3[5];
            String str4 = strArr3[0];
            int charAt2 = str3.charAt(10);
            int periodIndex2 = str4.charAt(10);
            if (charAt2 != periodIndex2) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0B;
            strArr4[5] = "mjwvmj0ClgGUVwwCxWP9gHcghfZdz63j";
            strArr4[0] = "bNbb3gsICTG9njkqttgYr3lisYeg9cbO";
        }
        return true;
    }

    public final boolean A0S(Timeline timeline, boolean z10) {
        this.A08 = z10;
        return A08(timeline);
    }

    public final boolean A0T(R7 r72) {
        return this.A04 != null && this.A04.A07 == r72;
    }
}

package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.Timeline;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class E9 extends AbstractC1279Zl implements ZQ {
    public static byte[] A0n;
    public static String[] A0o = {"iBNHMNbHG0fKAf2eT5kteN1U39G3EcaH", "qXz", "R2ftQy6AiucGxM1Guxwgd25aR6ARlJ6P", "MxLPYGObrf", "8LF26nOw5DTYaTjfwiGKhulxAaOiFxz", "XeMY99wdFq", "3rP", "hv8hVuouCW0CllFLblAVrkZkkmaGvgpz"};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public C1280Zm A09;
    public EK A0A;
    public ZC A0B;
    public ZC A0C;
    public ZC A0D;
    public Q9 A0E;
    public C1264Yv A0F;
    public C1262Yt A0G;
    public C1059Qn A0H;
    public Y2 A0I;
    public InterfaceC1352az A0J;
    public C1051Qf A0K;
    public C1655fx A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final C1262Yt A0T;
    public final long A0U;
    public final long A0V;
    public final long A0W;
    public final Handler A0X;
    public final Handler A0Y;
    public final Looper A0Z;
    public final ZO A0a;
    public final E8 A0b;
    public final QQ A0c;
    public final C1250Yh A0d;
    public final InterfaceC1241Xx A0e;
    public final AbstractC1490dG A0f;
    public final C1491dH A0g;
    public final InterfaceC1596ez A0h;
    public final C1599f2 A0i;
    public final CopyOnWriteArraySet<OU> A0j;
    public final CopyOnWriteArraySet<QJ> A0k;
    public final boolean A0l;
    public final InterfaceC1259Yq[] A0m;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0n, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 18);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        byte[] bArr = {111, -86, 110, -95, -104, 121, -107, -118, -94, -114, -101, 114, -106, -103, -107, -49, 2, -7, -38, -10, -21, 3, -17, -4, -42, -13, -20, -71, -68, -72, -62, -72, -69, -76, -39, -44, -33, -117, -54, -26, -37, -13, -33, -20, -102, -29, -19, -102, -37, -35, -35, -33, -19, -19, -33, -34, -102, -23, -24, -102, -18, -30, -33, -102, -15, -20, -23, -24, -31, -102, -18, -30, -20, -33, -37, -34, -88, -124, -67, -17, -20, -20, -33, -24, -18, -102, -18, -30, -20, -33, -37, -34, -76, -102, -95, -97, -19, -95, -124, -65, -14, -22, -33, -35, -18, -33, -34, -102, -18, -30, -20, -33, -37, -34, -76, -102, -95, -97, -19, -95, -124, -51, -33, -33, -102, -30, -18, -18, -22, -19, -76, -87, -87, -33, -14, -23, -22, -26, -37, -13, -33, -20, -88, -34, -33, -16, -87, -29, -19, -19, -17, -33, -19, -87, -22, -26, -37, -13, -33, -20, -89, -37, -35, -35, -33, -19, -19, -33, -34, -89, -23, -24, -89, -15, -20, -23, -24, -31, -89, -18, -30, -20, -33, -37, -34, -44, -25, -18, -25, -29, -11, -25, -94, -116, -74, 121, -76, -40, -41, -71, -43, -54, -30, -50, -37, -68, -35, -54, -35, -50, -84, -47, -54, -41, -48, -50, -51, -39, -53, -53, -47, -70, -43, -122, -49, -51, -44, -43, -40, -53, -54, -122, -56, -53, -55, -57, -37, -39, -53, -122, -57, -44, -122, -57, -54, -122, -49, -39, -122, -42, -46, -57, -33, -49, -44, -51};
        if (A0o[2].charAt(13) == 'n') {
            throw new RuntimeException();
        }
        A0o[4] = "kGOG9Dkm6QjnckS7AaOGsbFtb9YG94o";
        A0n = bArr;
    }

    static {
        A06();
    }

    public E9(InterfaceC1259Yq[] interfaceC1259YqArr, AbstractC1490dG abstractC1490dG, PC pc, InterfaceC1502dS interfaceC1502dS, InterfaceC1596ez interfaceC1596ez) {
        this(interfaceC1259YqArr, abstractC1490dG, pc, interfaceC1502dS, interfaceC1596ez, false, false, false, false, false, false, 0L, false, 0, false, false, false, false, false, false, false, null);
    }

    public E9(@MetaExoPlayerCustomization("qe_android_video_exoplayer2.update_loading_priority_exo2 is consistently false. We do not need to port this in the upgrade") InterfaceC1259Yq[] interfaceC1259YqArr, @MetaExoPlayerCustomization("Introduced in D13513334 and also used in loop playing for IG: D38285740") AbstractC1490dG abstractC1490dG, @MetaExoPlayerCustomization("Currently used to load chunks while seeking on pause D13827150") PC pc, @MetaExoPlayerCustomization("D40987428 Brought in for clippingmediasource") InterfaceC1502dS interfaceC1502dS, @MetaExoPlayerCustomization("D45597293 for Oculus - allowing the start renderer offset to not be 0; Eventually changed in Exo: https://github.com/google/ExoPlayer/commit/9f352434c72da527d1fa7963447c3cf680db884f") InterfaceC1596ez interfaceC1596ez, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, long j10, boolean z16, int i10, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, QQ qq) {
        QQ qq2 = qq;
        Log.i(A04(2, 13, 23), A04(33, 5, 89) + Integer.toHexString(System.identityHashCode(this)) + A04(0, 2, 61) + A04(15, 18, 120) + A04(194, 3, 71) + AbstractC1672gE.A04 + A04(193, 1, 29));
        this.A0i = new C1599f2();
        try {
            this.A0M = z22;
            AbstractC1589es.A08(interfaceC1259YqArr.length > 0);
            this.A0m = (InterfaceC1259Yq[]) AbstractC1589es.A01(interfaceC1259YqArr);
            this.A0f = (AbstractC1490dG) AbstractC1589es.A01(abstractC1490dG);
            this.A0Q = false;
            this.A00 = 1.0f;
            this.A05 = 0;
            this.A0B = ZC.A0Z;
            this.A0C = ZC.A0Z;
            this.A0D = ZC.A0Z;
            this.A0S = false;
            this.A0V = 0L;
            this.A09 = C1280Zm.A07;
            this.A0W = 0L;
            this.A0k = new CopyOnWriteArraySet<>();
            this.A0U = 0L;
            InterfaceC1241Xx analyticsCollector = InterfaceC1241Xx.A00;
            this.A0e = analyticsCollector;
            this.A0H = C1059Qn.A04;
            this.A06 = 1;
            this.A0a = new ZO(null);
            this.A0g = new C1491dH(new C1057Ql[interfaceC1259YqArr.length], new QD[interfaceC1259YqArr.length], Y4.A02, null);
            this.A0d = new C1250Yh();
            this.A0T = new QE().A03(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28).A01(29, abstractC1490dG.A0Y()).A04();
            this.A0G = new QE().A02(this.A0T).A00(4).A00(10).A04();
            this.A0K = C1051Qf.A03;
            this.A0F = C1264Yv.A06;
            this.A0Z = Looper.myLooper();
            this.A0X = new HandlerC0998Oa(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
            this.A0h = interfaceC1596ez;
            this.A0c = qq2 == null ? this : qq2;
            this.A0E = new Q9(Timeline.A02, 0L, C1063Qs.A06, this.A0g);
            this.A0b = new E8(interfaceC1259YqArr, abstractC1490dG, this.A0g, pc, interfaceC1502dS, this.A0Q, this.A05, this.A0S, this.A0X, interfaceC1596ez, z10, z11, z12, z13, z14, z15, j10, z16, i10, z17, z18, z19, z20, z21, z23, RK.A03);
            this.A0I = Y2.A05;
            this.A0L = C1655fx.A04;
            this.A0Y = new Handler(this.A0b.A1A());
            this.A0j = new CopyOnWriteArraySet<>();
        } finally {
            this.A0i.A04();
        }
    }

    private long A00(long j10) {
        long A01 = O5.A01(j10);
        if (!this.A0E.A06.A00()) {
            Timeline timeline = this.A0E.A04;
            R5 r52 = this.A0E.A06;
            if (A0o[4].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0o;
            strArr[5] = "nyIUf2bdJl";
            strArr[3] = "LlTu7Wlurx";
            timeline.A0J(r52.A04, this.A0d);
            long positionMs = this.A0d.A0B();
            return A01 + positionMs;
        }
        return A01;
    }

    private long A01(Timeline timeline, R5 r52, long j10) {
        timeline.A0J(r52.A04, this.A0d);
        return j10 + this.A0d.A0C();
    }

    private Q9 A02(boolean z10, boolean z11, int i10) {
        C1491dH c1491dH;
        if (z10) {
            this.A02 = 0;
            this.A01 = 0;
            this.A08 = 0L;
            this.A07 = 0L;
        } else {
            this.A02 = A7X();
            this.A01 = A7S();
            this.A08 = A7U();
            this.A07 = A0J();
        }
        Timeline timeline = z11 ? Timeline.A02 : this.A0E.A04;
        R5 r52 = this.A0E.A06;
        long j10 = this.A0E.A02;
        long j11 = this.A0E.A01;
        C1063Qs c1063Qs = z11 ? C1063Qs.A06 : this.A0E.A07;
        if (z11) {
            c1491dH = this.A0g;
        } else {
            c1491dH = this.A0E.A08;
        }
        return new Q9(timeline, r52, j10, j11, i10, false, c1063Qs, c1491dH, this.A0E.A06, this.A0E.A02, 0L, this.A0E.A02);
    }

    private QT A03(QS qs) {
        int A7X = A7X();
        E8 e8 = this.A0b;
        Timeline timeline = this.A0E.A04;
        if (A7X == -1) {
            A7X = 0;
        }
        return new QT(e8, qs, timeline, A7X, this.A0h, this.A0b.A1A());
    }

    private void A05() {
        if (!this.A0M) {
            return;
        }
        this.A0i.A01();
        if (Thread.currentThread() != A0K().getThread()) {
            String A0n2 = AbstractC1672gE.A0n(A04(38, 147, 104), Thread.currentThread().getName(), A0K().getThread().getName());
            if (!this.A0l) {
                Log.w(A04(2, 13, 23), A0n2, this.A0N ? null : new IllegalStateException());
                this.A0N = true;
                return;
            }
            throw new IllegalStateException(A0n2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        if (r4 != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A07(com.facebook.ads.redexgen.X.Q9 r16, int r17, boolean r18, int r19) {
        /*
            r15 = this;
            r7 = r16
            r3 = r15
            int r0 = r3.A03
            int r0 = r0 - r17
            r3.A03 = r0
            int r0 = r3.A03
            if (r0 != 0) goto L90
            long r4 = r7.A02
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L27
            com.facebook.ads.redexgen.X.R5 r8 = r7.A06
            long r4 = r7.A01
            long r0 = r7.A0D
            r9 = 0
            r7 = r7
            r11 = r4
            r13 = r0
            com.facebook.ads.redexgen.X.Q9 r7 = r7.A06(r8, r9, r11, r13)
        L27:
            com.facebook.ads.redexgen.X.Q9 r0 = r3.A0E
            com.google.android.exoplayer2.Timeline r0 = r0.A04
            boolean r0 = r0.A0N()
            r6 = 0
            if (r0 == 0) goto L50
            boolean r4 = r3.A0O
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.E9.A0o
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 31
            if (r1 == r0) goto L47
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L47:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.E9.A0o
            java.lang.String r1 = "a7vDULVL14joxcWmr2PyM3EB0dFebfQO"
            r0 = 2
            r2[r0] = r1
            if (r4 == 0) goto L7d
        L50:
            com.google.android.exoplayer2.Timeline r0 = r7.A04
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L7d
            r3.A01 = r6
            r3.A02 = r6
            r4 = 0
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.E9.A0o
            r0 = 0
            r1 = r2[r0]
            r0 = 7
            r2 = r2[r0]
            r0 = 20
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L93
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.E9.A0o
            java.lang.String r1 = "6QAk8ka7eu8kTDBPRqcCrP3aTyr4lMJ"
            r0 = 4
            r2[r0] = r1
            r3.A08 = r4
            r3.A07 = r4
        L7d:
            boolean r0 = r3.A0O
            if (r0 == 0) goto L91
            r10 = 0
        L82:
            boolean r11 = r3.A0P
            r3.A0O = r6
            r3.A0P = r6
            r6 = r15
            r9 = r19
            r8 = r18
            r6.A08(r7, r8, r9, r10, r11)
        L90:
            return
        L91:
            r10 = 2
            goto L82
        L93:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.E9.A07(com.facebook.ads.redexgen.X.Q9, int, boolean, int):void");
    }

    /* JADX WARN: Incorrect condition in loop: B:25:0x0059 */
    /* JADX WARN: Incorrect condition in loop: B:31:0x0077 */
    /* JADX WARN: Incorrect condition in loop: B:40:0x00ae */
    /* JADX WARN: Incorrect condition in loop: B:48:0x00f2 */
    /* JADX WARN: Incorrect condition in loop: B:53:0x0104 */
    /* JADX WARN: Incorrect condition in loop: B:58:0x0122 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A08(com.facebook.ads.redexgen.X.Q9 r10, boolean r11, int r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.E9.A08(com.facebook.ads.redexgen.X.Q9, boolean, int, int, boolean):void");
    }

    @MetaExoPlayerCustomization("D31846300; Custom MediaSessionEventListener")
    private final void A09(boolean z10, boolean z11) {
        if (this.A0Q != z10) {
            this.A0Q = z10;
            this.A04++;
            this.A0b.A1F(z10);
            Q9 q92 = this.A0E;
            if (!z10) {
                this.A0R = z10;
                Iterator<QJ> it = this.A0k.iterator();
                while (it.hasNext()) {
                    QJ next = it.next();
                    if (0 != 0) {
                        throw new NullPointerException(A04(197, 20, 87));
                    }
                    next.AEZ(z10, q92.A00);
                }
            }
        }
    }

    private boolean A0A() {
        return this.A0E.A04.A0N() || this.A03 > 0;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1279Zl
    public final void A0H(int i10, long j10) {
        long A00;
        Timeline timeline = this.A0E.A04;
        if (i10 < 0 || (!timeline.A0N() && i10 >= timeline.A07())) {
            throw new P8(timeline, i10, j10);
        }
        this.A0P = true;
        this.A03++;
        if (AAS()) {
            Log.w(A04(2, 13, 23), A04(217, 39, 84));
            this.A0X.obtainMessage(0, 1, -1, this.A0E).sendToTarget();
            return;
        }
        this.A02 = i10;
        boolean A0N = timeline.A0N();
        if (A0o[2].charAt(13) != 'n') {
            A0o[4] = "XkvMJy8fgea2EYhPlO8IB7F7OucCVTK";
            if (A0N) {
                this.A08 = j10 == -9223372036854775807L ? 0L : j10;
                this.A01 = 0;
            } else {
                if (j10 == -9223372036854775807L) {
                    C1248Yf c1248Yf = super.A00;
                    String[] strArr = A0o;
                    if (strArr[5].length() == strArr[3].length()) {
                        String[] strArr2 = A0o;
                        strArr2[0] = "lvCZD1vSIIBmuJq22VWNoiUGZov24790";
                        strArr2[7] = "Xs2HyPeL7rSNTNRKWZSchYRt5D3JM17V";
                        A00 = timeline.A0K(i10, c1248Yf).A05();
                    }
                } else {
                    A00 = O5.A00(j10);
                }
                Pair<Object, Long> A0D = timeline.A0D(super.A00, this.A0d, i10, A00);
                this.A08 = O5.A01(A00);
                this.A01 = timeline.A0A(A0D.first);
            }
            this.A0b.A1D(timeline, i10, O5.A00(j10));
            Iterator<QJ> it = this.A0k.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return;
        }
        throw new RuntimeException();
    }

    public final long A0I() {
        if (A0A()) {
            return this.A08;
        }
        if (this.A0E.A05.A03 != this.A0E.A06.A03) {
            return this.A0E.A04.A0K(A7X(), super.A00).A06();
        }
        long j10 = this.A0E.A0B;
        if (this.A0E.A05.A00()) {
            C1250Yh A0J = this.A0E.A04.A0J(this.A0E.A05.A04, this.A0d);
            j10 = A0J.A0D(this.A0E.A05.A00);
            if (j10 == Long.MIN_VALUE) {
                j10 = A0J.A01;
            }
        }
        long contentBufferedPositionUs = A01(this.A0E.A04, this.A0E.A05, j10);
        return AbstractC1672gE.A0P(contentBufferedPositionUs);
    }

    public final long A0J() {
        if (A0A()) {
            return this.A07;
        }
        return O5.A01(this.A0E.A0C);
    }

    public final Looper A0K() {
        return this.A0Z;
    }

    public final QT A0L(QS qs) {
        A05();
        return A03(qs);
    }

    public final void A0M() {
        StringBuilder append = new StringBuilder().append(A04(185, 8, 112)).append(Integer.toHexString(System.identityHashCode(this))).append(A04(0, 2, 61)).append(A04(15, 18, 120));
        String A04 = A04(194, 3, 71);
        Log.i(A04(2, 13, 23), append.append(A04).append(AbstractC1672gE.A04).append(A04).append(PS.A00()).append(A04(193, 1, 29)).toString());
        this.A0J = null;
        this.A0b.A1B();
        this.A0X.removeCallbacksAndMessages(null);
        this.A0E = A02(false, false, 1);
        this.A0K = C1051Qf.A03;
    }

    public final void A0N(Message message) {
        Iterator<QJ> it;
        switch (message.what) {
            case 0:
                A07((Q9) message.obj, message.arg1, message.arg2 != -1, message.arg2);
                return;
            case 1:
                C1264Yv c1264Yv = (C1264Yv) message.obj;
                C1264Yv playbackParameters = this.A0F;
                if (!playbackParameters.equals(c1264Yv)) {
                    this.A0F = c1264Yv;
                    Iterator<QJ> it2 = this.A0k.iterator();
                    while (true) {
                        boolean hasNext = it2.hasNext();
                        if (A0o[4].length() == 31) {
                            A0o[4] = "8hk7OZfix4PEHRcTxo5SSQ62D05q6DL";
                            if (!hasNext) {
                                return;
                            }
                        } else if (!hasNext) {
                            return;
                        }
                        QJ next = it2.next();
                        String[] strArr = A0o;
                        if (strArr[6].length() != strArr[1].length()) {
                            next.AEV(c1264Yv);
                        } else {
                            A0o[2] = "oQIWwqluEBkDPEyoSxBHoh1XtEd9Y8j5";
                            next.AEV(c1264Yv);
                        }
                    }
                } else {
                    return;
                }
            case 2:
                EK ek = (EK) message.obj;
                this.A0A = ek;
                Iterator<QJ> it3 = this.A0k.iterator();
                while (it3.hasNext()) {
                    it3.next().AEX(ek);
                }
                return;
            case 3:
                int i10 = this.A04;
                if (A0o[4].length() != 31) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0o;
                strArr2[6] = "O6N";
                strArr2[1] = "3Jg";
                this.A04 = i10 - 1;
                if (this.A04 == 0) {
                    Boolean bool = (Boolean) message.obj;
                    if (A0o[4].length() != 31) {
                        this.A0R = bool.booleanValue();
                        it = this.A0k.iterator();
                    } else {
                        String[] strArr3 = A0o;
                        strArr3[6] = "xhu";
                        strArr3[1] = "AZi";
                        this.A0R = bool.booleanValue();
                        it = this.A0k.iterator();
                    }
                    while (true) {
                        boolean hasNext2 = it.hasNext();
                        if (A0o[2].charAt(13) == 'n') {
                            throw new RuntimeException();
                        }
                        A0o[2] = "bAI18KErgcwB1pfOUQtZ8fNOffY6wi9I";
                        if (hasNext2) {
                            QJ next2 = it.next();
                            if (this.A0R) {
                                next2.AEZ(this.A0R, this.A0E.A00);
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 4:
                Iterator<QJ> it4 = this.A0k.iterator();
                while (it4.hasNext()) {
                    it4.next();
                }
                return;
            case 5:
                Iterator<QJ> it5 = this.A0k.iterator();
                while (it5.hasNext()) {
                    it5.next();
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    public final void A0O(QJ qj) {
        this.A0k.add(qj);
    }

    public final void A0P(InterfaceC1352az interfaceC1352az, boolean z10, boolean z11) {
        this.A0A = null;
        this.A0J = interfaceC1352az;
        Q9 A02 = A02(z10, z11, 2);
        this.A0O = true;
        this.A03++;
        this.A0b.A1E(interfaceC1352az, z10, z11);
        A08(A02, false, 4, 1, false);
    }

    public final void A0Q(boolean z10) {
        A09(z10, false);
    }

    public final boolean A0R() {
        return this.A0Q;
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final long A6x() {
        if (AAS()) {
            if (this.A0E.A05.equals(this.A0E.A06)) {
                Q9 q92 = this.A0E;
                String[] strArr = A0o;
                if (strArr[6].length() != strArr[1].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0o;
                strArr2[6] = "cTy";
                strArr2[1] = "5QM";
                return O5.A01(q92.A0B);
            }
            return A7i();
        }
        return A0I();
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final long A7J() {
        if (AAS()) {
            this.A0E.A04.A0J(this.A0E.A06.A04, this.A0d);
            return this.A0d.A0B() + O5.A01(this.A0E.A01);
        }
        return A7U();
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final int A7O() {
        if (AAS()) {
            Q9 q92 = this.A0E;
            if (A0o[4].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0o;
            strArr[0] = "iAenHVt0sdYq3dou0rh4IyL2WiJjdGoB";
            strArr[7] = "l93O9csCcOzaoJJ8aFC8NUoFiQVq9Rur";
            return q92.A06.A00;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final int A7P() {
        if (AAS()) {
            return this.A0E.A06.A01;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    @MetaExoPlayerCustomization("getCurrentWindowIndex needs to be upgraded to getCurrentWindowIndexInternal")
    public final int A7R() {
        A05();
        int A7X = A7X();
        if (A7X == -1) {
            return 0;
        }
        return A7X;
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final int A7S() {
        if (A0A()) {
            return this.A01;
        }
        return this.A0E.A04.A0A(this.A0E.A06.A04);
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final long A7U() {
        if (A0A()) {
            long j10 = this.A08;
            String[] strArr = A0o;
            if (strArr[5].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A0o[4] = "DlIXmqb8kELGbb1APDesckXZZTp9JUX";
            return j10;
        }
        Q9 q92 = this.A0E;
        String[] strArr2 = A0o;
        if (strArr2[0].charAt(20) != strArr2[7].charAt(20)) {
            A0o[2] = "wr3YTayWHPF5AKauEOyQEp0syJahAkEO";
            if (q92.A06.A00()) {
                return O5.A01(this.A0E.A0C);
            }
            return A00(this.A0E.A0C);
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final Timeline A7W() {
        return this.A0E.A04;
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final int A7X() {
        if (A0A()) {
            int i10 = this.A02;
            String[] strArr = A0o;
            if (strArr[5].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0o;
            strArr2[6] = "5sA";
            strArr2[1] = "wYH";
            return i10;
        }
        return this.A0E.A04.A0J(this.A0E.A06.A04, this.A0d).A00;
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final long A7i() {
        Timeline timeline = this.A0E.A04;
        if (timeline.A0N()) {
            return -9223372036854775807L;
        }
        if (AAS()) {
            R5 r52 = this.A0E.A06;
            timeline.A0J(r52.A04, this.A0d);
            return O5.A01(this.A0d.A0E(r52.A00, r52.A01));
        }
        return timeline.A0K(A7X(), super.A00).A06();
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final long A99() {
        return Math.max(0L, O5.A01(this.A0E.A0D));
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final boolean AAS() {
        return !A0A() && this.A0E.A06.A00();
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public final void AJL(boolean z10) {
        if (z10) {
            this.A0A = null;
            this.A0J = null;
        }
        Q9 A02 = A02(z10, z10, 1);
        this.A03++;
        this.A0b.A1G(z10);
        A08(A02, false, 4, 1, false);
        this.A0K = new C1051Qf(C0958Mm.A01(), A02.A0C);
    }
}

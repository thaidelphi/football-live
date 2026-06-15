package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.extractor.metadata.icy.IcyHeaders;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* renamed from: com.facebook.ads.redexgen.X.7h */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C05867h implements R7, UL, InterfaceC1539e4<R3>, InterfaceC1543e8, InterfaceC1377bR {
    public static byte[] A0e;
    public static String[] A0f = {"HhHmJF5YcsWodLjf10jFDxaODElYAWQn", "5hQ1HJFIxjmVaMwcXFbTKj8OtZuuy", "kE2D10B6Ev7c6Sgq3nfBneiFw0eHk", "5uBvXgNz7EkQWm0iGI8o4E2FlOofQ", "YwGYH96vbY1RRDrN8jcX0xGsVYMCyKKC", "1BWf5FL3j4tDEkgwTw7oWfxIye2NJtmG", "7n0fNQHsxJP6Ue", "AJcAEryrL7779osUrqyWKoBm5UgSp6kX"};
    public static final ZM A0g;
    public static final Map<String, String> A0h;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public Uj A06;
    public IcyHeaders A07;
    public R8 A08;
    public C1372bM A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public C1371bL[] A0K;
    public C1066Qv[] A0L;
    public final long A0M;
    public final Uri A0N;
    public final Handler A0O;
    public final TJ A0P;
    public final TO A0Q;
    public final C1360bA A0R;
    public final InterfaceC1365bF A0S;
    public final InterfaceC1370bK A0T;
    public final InterfaceC1496dM A0U;
    public final Q7 A0V;
    public final InterfaceC1536e1 A0W;
    public final C1031Pj A0X;
    public final C1599f2 A0Y;
    public final Runnable A0Z;
    public final Runnable A0a;
    public final String A0b;
    public final boolean A0c;
    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"})
    public final boolean A0d;

    public static String A0B(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0e, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] - i12) - 16;
            if (A0f[4].length() != 32) {
                throw new RuntimeException();
            }
            String[] strArr = A0f;
            strArr[3] = "y68EVoBxdY5TfdR8CpRnFIaUEOMSi";
            strArr[6] = "x3u0FCkiZHZvLp";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A0I() {
        A0e = new byte[]{-114, -102, -76, -54, 126, -98, -74, -59, -78, -107, -78, -59, -78, -59, -24, -38, -35, -34, -21, -77, -55, -21, -24, -32, -21, -34, -20, -20, -30, -17, -34, -58, -34, -35, -30, -38, -55, -34, -21, -30, -24, -35, -60, -25, -39, -36, -31, -26, -33, -104, -34, -31, -26, -31, -21, -32, -35, -36, -104, -38, -35, -34, -25, -22, -35, -104, -24, -22, -35, -24, -39, -22, -39, -20, -31, -25, -26, -104, -31, -21, -104, -37, -25, -27, -24, -28, -35, -20, -35, -90, 123, -98, -112, -109, -104, -99, -106, 79, -107, -104, -99, -104, -94, -105, -108, -109, 79, -111, -108, -107, -98, -95, -108, 79, -97, -95, -108, -97, -112, -95, -112, -93, -104, -98, -99, 79, -104, -94, 79, -110, -98, -100, -97, -101, -108, -93, -108, 93, 79, -124, -127, 120, 105, 79, -28, -13, -13, -17, -20, -26, -28, -9, -20, -14, -15, -78, -5, -80, -20, -26, -4, -122, Byte.MIN_VALUE, -106, -102, -95, -104, -104};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.R7
    public final long AIF(QD[] qdArr, boolean[] zArr, InterfaceC1381bV[] interfaceC1381bVArr, boolean[] zArr2, long j10) {
        int i10;
        int i11;
        int i12;
        A0E();
        C1063Qs c1063Qs = this.A09.A00;
        boolean[] zArr3 = this.A09.A01;
        int i13 = this.A01;
        int i14 = 0;
        while (true) {
            i10 = 0;
            if (i14 >= qdArr.length) {
                break;
            }
            if (interfaceC1381bVArr[i14] != null && (qdArr[i14] == null || !zArr[i14])) {
                i12 = ((R1) interfaceC1381bVArr[i14]).A00;
                AbstractC1589es.A08(zArr3[i12]);
                this.A01--;
                zArr3[i12] = false;
                interfaceC1381bVArr[i14] = null;
            }
            i14++;
        }
        boolean z10 = !this.A0J ? j10 == 0 : i13 != 0;
        for (int i15 = 0; i15 < qdArr.length; i15++) {
            if (interfaceC1381bVArr[i15] == null && qdArr[i15] != null) {
                QD qd = qdArr[i15];
                AbstractC1589es.A08(qd.length() == 1);
                AbstractC1589es.A08(qd.A87(0) == 0);
                int A04 = c1063Qs.A04(qd.A9B());
                AbstractC1589es.A08(!zArr3[A04]);
                this.A01++;
                zArr3[A04] = true;
                interfaceC1381bVArr[i15] = new R1(this, A04);
                zArr2[i15] = true;
                if (!z10) {
                    C1066Qv c1066Qv = this.A0L[A04];
                    z10 = (c1066Qv.A0f(j10, true) || c1066Qv.A0O() == 0) ? false : true;
                }
            }
        }
        if (this.A01 != 0) {
            if (z10) {
                j10 = AIE(j10, false);
                if (A0f[7].charAt(31) != '4') {
                    A0f[7] = "3IHVhVDJhWfNhoMnKwCP3ugaZG5QyoFr";
                    i11 = 0;
                } else {
                    i11 = 0;
                }
                while (i11 < interfaceC1381bVArr.length) {
                    InterfaceC1381bV interfaceC1381bV = interfaceC1381bVArr[i11];
                    String[] strArr = A0f;
                    if (strArr[3].length() == strArr[6].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0f;
                    strArr2[1] = "6Ls6DGwEhxOsIdfSFdX0Zn86CPQag";
                    strArr2[2] = "4E0A1HTbBIqOovQWzP1hrM6r0OPfy";
                    if (interfaceC1381bV != null) {
                        zArr2[i11] = true;
                    }
                    i11++;
                }
            }
            this.A0J = true;
            return j10;
        }
        this.A0F = false;
        this.A0E = false;
        if (this.A0X.A0E()) {
            C1066Qv[] c1066QvArr = this.A0L;
            String[] strArr3 = A0f;
            if (strArr3[1].length() == strArr3[2].length()) {
                String[] strArr4 = A0f;
                strArr4[3] = "qRltZSkGuu5Z2WrcAAqPQRzeNotJM";
                strArr4[6] = "f3Gq0TAmo8XFcO";
                int length = c1066QvArr.length;
                while (i10 < length) {
                    c1066QvArr[i10].A0V();
                    i10++;
                }
                this.A0X.A09();
            }
            throw new RuntimeException();
        }
        C1066Qv[] c1066QvArr2 = this.A0L;
        int length2 = c1066QvArr2.length;
        while (i10 < length2) {
            c1066QvArr2[i10].A0Z();
            i10++;
        }
        this.A0J = true;
        return j10;
    }

    static {
        A0I();
        A0h = A0D();
        A0g = new P5().A0y(A0B(161, 3, 13)).A11(A0B(144, 17, 115)).A14();
    }

    public C05867h(Uri uri, Q7 q72, InterfaceC1365bF interfaceC1365bF, TO to, TJ tj, InterfaceC1536e1 interfaceC1536e1, C1360bA c1360bA, InterfaceC1370bK interfaceC1370bK, InterfaceC1496dM interfaceC1496dM, String str, int i10, InterfaceExecutorC1651ft interfaceExecutorC1651ft) {
        C1031Pj c1031Pj;
        this.A0N = uri;
        this.A0V = q72;
        this.A0Q = to;
        this.A0P = tj;
        this.A0W = interfaceC1536e1;
        this.A0R = c1360bA;
        this.A0T = interfaceC1370bK;
        this.A0U = interfaceC1496dM;
        this.A0b = str;
        this.A0M = i10;
        if (interfaceExecutorC1651ft != null) {
            c1031Pj = new C1031Pj(interfaceExecutorC1651ft);
        } else {
            c1031Pj = new C1031Pj(A0B(13, 29, 105));
        }
        this.A0X = c1031Pj;
        this.A0S = interfaceC1365bF;
        this.A0Y = new C1599f2();
        this.A0Z = new Runnable() { // from class: com.facebook.ads.redexgen.X.bG
            @Override // java.lang.Runnable
            public final void run() {
                C05867h.this.A0F();
            }
        };
        this.A0a = new Runnable() { // from class: com.facebook.ads.redexgen.X.bH
            @Override // java.lang.Runnable
            public final void run() {
                C05867h.this.A0b();
            }
        };
        this.A0O = AbstractC1672gE.A0Y();
        boolean z10 = false;
        this.A0K = new C1371bL[0];
        this.A0L = new C1066Qv[0];
        this.A05 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
        this.A00 = 1;
        this.A0d = (C0962Mq.A03(EnumC0959Mn.A0d) || C0962Mq.A03(EnumC0959Mn.A0e) || C0962Mq.A03(EnumC0959Mn.A1X)) ? true : true;
        this.A0c = C0962Mq.A03(EnumC0959Mn.A0g);
    }

    private int A00() {
        int i10 = 0;
        for (C1066Qv c1066Qv : this.A0L) {
            int extractedSamplesCount = c1066Qv.A0P();
            i10 += extractedSamplesCount;
        }
        return i10;
    }

    public long A03(boolean z10) {
        long j10 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.A0L.length; i10++) {
            if (z10 || ((C1372bM) AbstractC1589es.A01(this.A09)).A01[i10]) {
                long largestQueuedTimestampUs = this.A0L[i10].A0T();
                j10 = Math.max(j10, largestQueuedTimestampUs);
            }
        }
        return j10;
    }

    private C1066Qv A08(C1371bL c1371bL) {
        int length = this.A0L.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (c1371bL.equals(this.A0K[i10])) {
                return this.A0L[i10];
            }
        }
        C1066Qv A0B = C1066Qv.A0B(this.A0U, this.A0Q, this.A0P);
        A0B.A0d(this);
        int trackCount = length + 1;
        C1371bL[] c1371bLArr = (C1371bL[]) Arrays.copyOf(this.A0K, trackCount);
        c1371bLArr[length] = c1371bL;
        this.A0K = (C1371bL[]) AbstractC1672gE.A1H(c1371bLArr);
        int trackCount2 = length + 1;
        C1066Qv[] c1066QvArr = (C1066Qv[]) Arrays.copyOf(this.A0L, trackCount2);
        c1066QvArr[length] = A0B;
        this.A0L = (C1066Qv[]) AbstractC1672gE.A1H(c1066QvArr);
        return A0B;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1539e4
    /* renamed from: A09 */
    public final C1540e5 ADt(R3 r32, long j10, long j11, IOException iOException, int i10) {
        AnonymousClass51 anonymousClass51;
        long j12;
        C1519dj c1519dj;
        long j13;
        C1540e5 c1540e5;
        long j14;
        anonymousClass51 = r32.A0A;
        j12 = r32.A05;
        c1519dj = r32.A02;
        C1344ar c1344ar = new C1344ar(j12, c1519dj, anonymousClass51.A01(), anonymousClass51.A02(), j10, j11, anonymousClass51.A00());
        j13 = r32.A00;
        long A8k = this.A0W.A8k(new C1535e0(c1344ar, new C1347au(1, -1, null, 0, null, AbstractC1672gE.A0P(j13), AbstractC1672gE.A0P(this.A03)), iOException, i10));
        if (A8k == -9223372036854775807L) {
            c1540e5 = C1031Pj.A06;
        } else {
            int A00 = A00();
            boolean z10 = A00 > this.A02;
            if (A0U(r32, A00)) {
                c1540e5 = C1031Pj.A01(z10, A8k);
            } else {
                c1540e5 = C1031Pj.A05;
            }
        }
        C1360bA c1360bA = this.A0R;
        j14 = r32.A00;
        c1360bA.A07(c1344ar, 1, -1, null, 0, null, j14, this.A03, iOException, !c1540e5.A02());
        return c1540e5;
    }

    public static Map<String, String> A0D() {
        HashMap hashMap = new HashMap();
        hashMap.put(A0B(1, 12, 65), A0B(0, 1, 77));
        Map<String, String> headers = Collections.unmodifiableMap(hashMap);
        return headers;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private void A0E() {
        AbstractC1589es.A08(this.A0G);
        AbstractC1589es.A01(this.A09);
        AbstractC1589es.A01(this.A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x007e, code lost:
        if (r10 != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0F() {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C05867h.A0F():void");
    }

    public void A0G() {
        this.A0O.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.bI
            @Override // java.lang.Runnable
            public final void run() {
                C05867h.this.A0c();
            }
        });
    }

    private void A0H() {
        C1519dj c1519dj;
        long j10;
        long j11;
        R3 r32 = new R3(this, this.A0N, this.A0V, this.A0S, this, this.A0Y);
        if (this.A0G) {
            AbstractC1589es.A08(A0S());
            if (this.A03 != -9223372036854775807L && this.A05 >= this.A03) {
                this.A0D = true;
                this.A05 = -9223372036854775807L;
                return;
            }
            r32.A04(((Uj) AbstractC1589es.A01(this.A06)).A8r(this.A05).A00.A00, this.A05);
            for (C1066Qv c1066Qv : this.A0L) {
                c1066Qv.A0b(this.A05);
            }
            this.A05 = -9223372036854775807L;
        }
        this.A02 = A00();
        long A08 = this.A0X.A08(r32, this, this.A0W.A8P(this.A00));
        c1519dj = r32.A02;
        C1360bA c1360bA = this.A0R;
        j10 = r32.A05;
        C1344ar c1344ar = new C1344ar(j10, c1519dj, A08);
        j11 = r32.A00;
        c1360bA.A06(c1344ar, 1, -1, null, 0, null, j11, this.A03, 0);
    }

    private final void A0J() throws IOException {
        this.A0X.A0B(this.A0W.A8P(this.A00));
    }

    private void A0K(int i10) {
        A0E();
        boolean[] zArr = this.A09.A03;
        if (!zArr[i10]) {
            ZM A08 = this.A09.A00.A05(i10).A08(0);
            String[] strArr = A0f;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0f;
            strArr2[0] = "vc2T8OhAXRcAAc3hAhm1OHzRbXIwU20j";
            strArr2[5] = "1a2wqUy3SsTxWpCxKacNfhORpOU8UVUN";
            this.A0R.A03(Q2.A01(A08.A0W), A08, 0, null, this.A04);
            zArr[i10] = true;
        }
    }

    private void A0L(int i10) {
        A0E();
        boolean[] zArr = this.A09.A02;
        if (this.A0F && zArr[i10]) {
            if (this.A0L[i10].A0g(false)) {
                return;
            }
            this.A05 = 0L;
            this.A0F = false;
            this.A0E = true;
            this.A04 = 0L;
            this.A02 = 0;
            for (C1066Qv c1066Qv : this.A0L) {
                c1066Qv.A0Z();
            }
            ((R8) AbstractC1589es.A01(this.A08)).ACl(this);
        }
    }

    /* renamed from: A0M */
    public void A0e(Uj uj) {
        this.A06 = uj;
        this.A03 = uj.A7j();
        this.A0C = !this.A0B && uj.A7j() == -9223372036854775807L;
        this.A00 = this.A0C ? 7 : 1;
        this.A0T.AF9(this.A03, uj.AAY(), this.A0C);
        if (!this.A0G) {
            A0F();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1539e4
    /* renamed from: A0N */
    public final void ADs(R3 r32, long j10, long j11) {
        AnonymousClass51 anonymousClass51;
        long j12;
        C1519dj c1519dj;
        long j13;
        long largestQueuedTimestampUs;
        if (this.A03 == -9223372036854775807L && this.A06 != null) {
            boolean AAY = this.A06.AAY();
            long A03 = A03(true);
            if (A03 == Long.MIN_VALUE) {
                largestQueuedTimestampUs = 0;
            } else {
                largestQueuedTimestampUs = 10000 + A03;
            }
            this.A03 = largestQueuedTimestampUs;
            this.A0T.AF9(this.A03, AAY, this.A0C);
        }
        anonymousClass51 = r32.A0A;
        j12 = r32.A05;
        c1519dj = r32.A02;
        C1344ar c1344ar = new C1344ar(j12, c1519dj, anonymousClass51.A01(), anonymousClass51.A02(), j10, j11, anonymousClass51.A00());
        C1360bA c1360bA = this.A0R;
        j13 = r32.A00;
        c1360bA.A08(c1344ar, 1, -1, null, 0, null, j13, this.A03, r32, null);
        this.A0D = true;
        ((R8) AbstractC1589es.A01(this.A08)).ACl(this);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1539e4
    /* renamed from: A0O */
    public final void ADw(R3 r32, long j10, long j11, int i10) {
        AnonymousClass51 dataSource;
        C1344ar c1344ar;
        long j12;
        C1519dj c1519dj;
        long j13;
        long j14;
        C1519dj c1519dj2;
        dataSource = r32.A0A;
        if (i10 == 0) {
            j14 = r32.A05;
            c1519dj2 = r32.A02;
            c1344ar = new C1344ar(j14, c1519dj2, j10);
        } else {
            j12 = r32.A05;
            c1519dj = r32.A02;
            c1344ar = new C1344ar(j12, c1519dj, dataSource.A01(), dataSource.A02(), j10, j11, dataSource.A00());
        }
        C1360bA c1360bA = this.A0R;
        j13 = r32.A00;
        c1360bA.A06(c1344ar, 1, -1, null, 0, null, j13, this.A03, i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1539e4
    /* renamed from: A0P */
    public final void ADq(R3 r32, long j10, long j11, boolean z10) {
        AnonymousClass51 dataSource;
        long j12;
        C1519dj c1519dj;
        long j13;
        dataSource = r32.A0A;
        j12 = r32.A05;
        c1519dj = r32.A02;
        C1344ar c1344ar = new C1344ar(j12, c1519dj, dataSource.A01(), dataSource.A02(), j10, j11, dataSource.A00());
        C1360bA c1360bA = this.A0R;
        j13 = r32.A00;
        c1360bA.A05(c1344ar, 1, -1, null, 0, null, j13, this.A03);
        if (!z10) {
            C1066Qv[] c1066QvArr = this.A0L;
            String[] strArr = A0f;
            if (strArr[1].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A0f[7] = "YnZIzTizfMz6VgYwxmvgcnSp4WbTty4b";
            for (C1066Qv c1066Qv : c1066QvArr) {
                c1066Qv.A0Z();
            }
            if (this.A01 > 0) {
                ((R8) AbstractC1589es.A01(this.A08)).ACl(this);
            }
        }
    }

    private boolean A0S() {
        return this.A05 != -9223372036854775807L;
    }

    private boolean A0T() {
        return this.A0E || A0S();
    }

    private boolean A0U(R3 r32, int i10) {
        if (this.A0B || (this.A06 != null && this.A06.A7j() != -9223372036854775807L)) {
            this.A02 = i10;
            return true;
        }
        if (this.A0G && !A0T()) {
            this.A0F = true;
            return false;
        }
        this.A0E = this.A0G;
        this.A04 = 0L;
        this.A02 = 0;
        for (C1066Qv c1066Qv : this.A0L) {
            c1066Qv.A0Z();
        }
        r32.A04(0L, 0L);
        String[] strArr = A0f;
        if (strArr[0].charAt(7) != strArr[5].charAt(7)) {
            String[] strArr2 = A0f;
            strArr2[1] = "yjCUTSJDo3L43308C8DGBBYCvEyZb";
            strArr2[2] = "5jKJJIOTTwVtB9vSmxruxMg3X2EZ9";
            return true;
        }
        throw new RuntimeException();
    }

    private boolean A0V(boolean[] zArr, long j10) {
        int length = this.A0L.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.A0L[i10].A0f(j10, false)) {
                boolean z10 = zArr[i10];
                String[] strArr = A0f;
                String str = strArr[1];
                String str2 = strArr[2];
                int i11 = str.length();
                int trackCount = str2.length();
                if (i11 != trackCount) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0f;
                strArr2[3] = "SITNFu75AMDVq0Iha3QdupKHiKZ3f";
                strArr2[6] = "Om4ZIYUVKZUZgG";
                if (!z10) {
                    boolean z11 = this.A0A;
                    String[] strArr3 = A0f;
                    String str3 = strArr3[3];
                    String str4 = strArr3[6];
                    int i12 = str3.length();
                    int trackCount2 = str4.length();
                    if (i12 == trackCount2) {
                        throw new RuntimeException();
                    }
                    String[] strArr4 = A0f;
                    strArr4[3] = "dAC8sfy47OtRs99iYTjzGuYCOqiPq";
                    strArr4[6] = "iHcX590VZBgkVW";
                    if (!z11) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final int A0X(int i10, long j10) {
        if (A0T()) {
            return 0;
        }
        A0K(i10);
        C1066Qv c1066Qv = this.A0L[i10];
        int A0Q = c1066Qv.A0Q(j10, this.A0D);
        c1066Qv.A0a(A0Q);
        if (A0Q == 0) {
            A0L(i10);
        }
        return A0Q;
    }

    public final int A0Y(int i10, P6 p62, C1214Ww c1214Ww, int i11) {
        if (A0T()) {
            return -3;
        }
        A0K(i10);
        int result = this.A0L[i10].A0R(p62, c1214Ww, i11, this.A0D);
        if (result == -3) {
            A0L(i10);
        }
        return result;
    }

    public final InterfaceC1157Uo A0Z() {
        return A08(new C1371bL(0, true));
    }

    public final void A0a() {
        if (this.A0G) {
            for (C1066Qv c1066Qv : this.A0L) {
                c1066Qv.A0X();
            }
        }
        this.A0X.A0C(this);
        this.A0O.removeCallbacksAndMessages(null);
        this.A08 = null;
        String[] strArr = A0f;
        if (strArr[0].charAt(7) == strArr[5].charAt(7)) {
            throw new RuntimeException();
        }
        A0f[4] = "MVLpl5KepuXzKUIiq8jlMIL6Wjy59Ljt";
        this.A0H = true;
    }

    public final /* synthetic */ void A0b() {
        if (!this.A0H) {
            ((R8) AbstractC1589es.A01(this.A08)).ACl(this);
        }
    }

    public final /* synthetic */ void A0c() {
        this.A0B = true;
    }

    public final void A0d(int i10) throws IOException {
        this.A0L[i10].A0W();
        A0J();
    }

    public final boolean A0f(int i10) {
        if (!A0T()) {
            boolean A0g2 = this.A0L[i10].A0g(this.A0D);
            String[] strArr = A0f;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0f;
            strArr2[3] = "XxDgOD8mb6TyNFZSs9dwq1kvHo2ku";
            strArr2[6] = "3TQJKPdccBkaU7";
            if (A0g2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1385bZ
    @MetaExoPlayerCustomization("Added in D19760981 for cancel request")
    public final void A4i(long j10) {
    }

    @Override // com.facebook.ads.redexgen.X.R7
    public final boolean A52(long j10) {
        if (!this.A0D) {
            boolean A0D = this.A0X.A0D();
            if (A0f[7].charAt(31) != '4') {
                String[] strArr = A0f;
                strArr[0] = "gwE3QleYkKBsSTL3UZjmguRQKvSEq6BH";
                strArr[5] = "C5V8daFPbEcNHkp1V3F9i9HkA2Rq8mw0";
                if (A0D || this.A0F) {
                    return false;
                }
                if (this.A0G && this.A01 == 0) {
                    return false;
                }
                boolean A04 = this.A0Y.A04();
                boolean continuedLoading = this.A0X.A0E();
                if (!continuedLoading) {
                    A0H();
                    return true;
                }
                return A04;
            }
            throw new RuntimeException();
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.R7
    public final void A5q(long j10, boolean z10) {
        A0E();
        if (A0S()) {
            return;
        }
        boolean[] zArr = this.A09.A01;
        String[] strArr = A0f;
        if (strArr[0].charAt(7) == strArr[5].charAt(7)) {
            throw new RuntimeException();
        }
        A0f[7] = "5ipg9mBpoWMhELrV0qCvKtmQyRgycIrL";
        int length = this.A0L.length;
        for (int trackCount = 0; trackCount < length; trackCount++) {
            this.A0L[trackCount].A0c(j10, z10, zArr[trackCount]);
        }
    }

    @Override // com.facebook.ads.redexgen.X.UL
    public final void A6E() {
        this.A0I = true;
        this.A0O.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.R7
    public final long A6h(long j10, C1059Qn c1059Qn) {
        A0E();
        if (!this.A06.AAY()) {
            return 0L;
        }
        C1153Ui A8r = this.A06.A8r(j10);
        return c1059Qn.A00(j10, A8r.A00.A01, A8r.A01.A01);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1385bZ
    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Added in D9949576 for unstall buffer")
    public final long A6w(long j10) {
        if (this.A0d && !this.A0G) {
            return 0L;
        }
        if (this.A0D) {
            return this.A03 - j10;
        }
        return A6y() - j10;
    }

    @Override // com.facebook.ads.redexgen.X.R7
    public final long A6y() {
        A0E();
        if (this.A0D || this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        if (A0S()) {
            return this.A05;
        }
        long largestQueuedTimestampUs = Long.MAX_VALUE;
        if (this.A0A) {
            int i10 = this.A0L.length;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.A09.A02[i11] && this.A09.A01[i11] && !this.A0L[i11].A0e()) {
                    largestQueuedTimestampUs = Math.min(largestQueuedTimestampUs, this.A0L[i11].A0T());
                }
            }
        }
        if (largestQueuedTimestampUs == Long.MAX_VALUE) {
            largestQueuedTimestampUs = A03(false);
        }
        if (largestQueuedTimestampUs == Long.MIN_VALUE) {
            return this.A04;
        }
        return largestQueuedTimestampUs;
    }

    @Override // com.facebook.ads.redexgen.X.R7
    public final long A8R() {
        return A6y();
    }

    @Override // com.facebook.ads.redexgen.X.R7
    public final C1063Qs A9C() {
        A0E();
        return this.A09.A00;
    }

    @Override // com.facebook.ads.redexgen.X.R7
    public final void ABn() throws IOException {
        A0J();
        if (this.A0D && !this.A0G) {
            if (this.A0c) {
                throw Q6.A01(A0B(90, 54, 31) + (this.A0N != null ? this.A0N.toString() : A0B(164, 4, 28)), null);
            }
            throw Q6.A01(A0B(42, 48, 104), null);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1543e8
    public final void ADx() {
        for (C1066Qv c1066Qv : this.A0L) {
            c1066Qv.A0Y();
        }
        this.A0S.AGj();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1377bR
    public final void AFT(ZM zm) {
        this.A0O.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.R7
    public final void AGD(R8 r82, long j10) {
        this.A08 = r82;
        this.A0Y.A04();
        A0H();
    }

    @Override // com.facebook.ads.redexgen.X.R7
    public final long AGY() {
        if (this.A0E && (this.A0D || A00() > this.A02)) {
            this.A0E = false;
            return this.A04;
        }
        String[] strArr = A0f;
        if (strArr[3].length() != strArr[6].length()) {
            String[] strArr2 = A0f;
            strArr2[3] = "p4tuvMsP4ps7LSohAdGPatWy7tjO5";
            strArr2[6] = "M94GAlCEOW4fph";
            return -9223372036854775807L;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.R7
    public final void AGe(long j10) {
    }

    @Override // com.facebook.ads.redexgen.X.UL
    public final void AID(final Uj uj) {
        this.A0O.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.bJ
            @Override // java.lang.Runnable
            public final void run() {
                C05867h.this.A0e(uj);
            }
        });
    }

    @Override // com.facebook.ads.redexgen.X.R7
    public final long AIE(@MetaExoPlayerCustomization long j10, boolean z10) {
        A0E();
        boolean[] zArr = this.A09.A02;
        if (!this.A06.AAY()) {
            j10 = 0;
        }
        int i10 = 0;
        this.A0E = false;
        this.A04 = j10;
        if (A0S()) {
            this.A05 = j10;
            return j10;
        }
        int i11 = this.A00;
        if (A0f[4].length() != 32) {
            throw new RuntimeException();
        }
        A0f[7] = "uBOY0ivsuv8M4GXYtHaE4uN838wHwhse";
        if (i11 != 7 && A0V(zArr, j10)) {
            return j10;
        }
        this.A0F = false;
        this.A05 = j10;
        this.A0D = false;
        if (this.A0X.A0E()) {
            C1066Qv[] c1066QvArr = this.A0L;
            int length = c1066QvArr.length;
            while (i10 < length) {
                c1066QvArr[i10].A0V();
                i10++;
            }
            this.A0X.A09();
        } else {
            this.A0X.A0A();
            C1066Qv[] c1066QvArr2 = this.A0L;
            int length2 = c1066QvArr2.length;
            while (i10 < length2) {
                c1066QvArr2[i10].A0Z();
                i10++;
            }
        }
        return j10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1385bZ
    @MetaExoPlayerCustomization("Added in D19875605 for error load during pause")
    public final void AIi(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.UL
    public final InterfaceC1157Uo AJX(int i10, int i11) {
        return A08(new C1371bL(i10, false));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1385bZ
    @MetaExoPlayerCustomization("Added in D13267633 for lower priority during pause")
    public final void AJg(byte b10) {
    }
}

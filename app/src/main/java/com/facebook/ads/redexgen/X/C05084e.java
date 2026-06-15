package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.4e  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C05084e implements Q7 {
    public static byte[] A0M;
    public static String[] A0N = {"s00UHyISL", "CysEKyClACPXFYeEhZn", "da", "nGvpX33P5UCM8ahnxHWaMyTa", "lLUX", "BDeT7nLDcgwxPCwpEhsshSlHVzAjjBZ1", "jZuDK72Zjf1meCMQEv38wr6fWx", "cLdlhrP9hsQzKcJJjC4G0Hit2UnEgDt4"};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public Q7 A06;
    public C1519dj A07;
    public C1519dj A08;
    @MetaExoPlayerCustomization
    public C1524dp A09;
    public C1572eb A0A;
    public boolean A0B;
    public boolean A0C;
    public final Q7 A0D;
    public final Q7 A0E;
    public final Q7 A0F;
    public final InterfaceC1562eR A0G;
    public final InterfaceC1565eU A0H;
    public final InterfaceC1571ea A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0M, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0N[5].length() == 7) {
                throw new RuntimeException();
            }
            A0N[1] = "Is7";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 126);
            i13++;
        }
    }

    public static void A05() {
        A0M = new byte[]{-40, -10, -8, -3, -6, -39, -10, 9, -10, -24, 4, 10, 7, -8, -6, -58, -14, -8, -17, -25, -15, -86, -9, -93, -8, -13, -25, -28, -9, -24, -93, -11, -24, -25, -20, -11, -24, -26, -9, -24, -25, -93, -40, -43, -52, -79, -93, -41, -21, -20, -10, -93, -16, -20, -22, -21, -9, -93, -26, -28, -8, -10, -24, -93, -11, -24, -17, -28, -9, -20, -7, -24, -93, -40, -43, -52, -10, -93, -22, -24, -9, -93, -11, -24, -10, -14, -17, -7, -24, -25, -93, -20, -15, -26, -14, -11, -11, -24, -26, -9, -17, -4, -79, -15, -16, -59, -29, -27, -22, -25, -26, -60, -5, -10, -25, -11, -44, -25, -29, -26};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.Q7
    @MetaExoPlayerCustomization("usage of fbDataSpecExtension and the check for isInitSegment")
    public final long AFq(C1519dj c1519dj) throws IOException {
        try {
            String A4b = this.A0I.A4b(c1519dj);
            C1519dj A09 = c1519dj.A04().A08(A4b).A09();
            this.A08 = A09;
            this.A05 = A01(this.A0G, A4b, A09.A06);
            this.A03 = c1519dj.A04;
            this.A09 = new C1524dp(c1519dj.A07);
            boolean z10 = true;
            this.A0B = A00(c1519dj) != -1;
            boolean z11 = this.A0B;
            if (this.A0B) {
                this.A00 = -1L;
            } else {
                this.A00 = AbstractC1582el.A00(this.A0G.A7I(A4b));
                if (this.A00 != -1) {
                    this.A00 -= c1519dj.A04;
                    if (this.A00 < 0) {
                        throw new C1512dc(AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            }
            z10 = (c1519dj.A07.A08 > 0 || c1519dj.A07.A07 > 0) ? false : false;
            if (c1519dj.A03 != -1) {
                this.A00 = this.A00 == -1 ? c1519dj.A03 : Math.min(this.A00, c1519dj.A03);
            }
            if (this.A00 > 0 || this.A00 == -1) {
                A06(A09, false, z10);
            }
            return c1519dj.A03 != -1 ? c1519dj.A03 : this.A00;
        } catch (Throwable th) {
            A09(th);
            throw th;
        }
    }

    static {
        A05();
    }

    public C05084e(InterfaceC1562eR interfaceC1562eR, final Q7 q72, Q7 q73, final InterfaceC1507dX interfaceC1507dX, InterfaceC1571ea interfaceC1571ea, int i10, final QV qv, final int i11, InterfaceC1565eU interfaceC1565eU) {
        this.A0G = interfaceC1562eR;
        this.A0D = q73;
        this.A0I = interfaceC1571ea == null ? InterfaceC1571ea.A00 : interfaceC1571ea;
        this.A0J = (i10 & 1) != 0;
        this.A0L = (i10 & 2) != 0;
        this.A0K = (i10 & 4) != 0;
        if (q72 != null) {
            q72 = qv != null ? new Q7(q72, qv, i11) { // from class: com.facebook.ads.redexgen.X.55
                public static byte[] A03;
                public final int A00;
                public final QV A01;
                public final Q7 A02;

                static {
                    A01();
                }

                public static String A00(int i12, int i13, int i14) {
                    byte[] copyOfRange = Arrays.copyOfRange(A03, i12, i12 + i13);
                    for (int i15 = 0; i15 < copyOfRange.length; i15++) {
                        copyOfRange[i15] = (byte) ((copyOfRange[i15] ^ i14) ^ 70);
                    }
                    return new String(copyOfRange);
                }

                public static void A01() {
                    A03 = new byte[]{Byte.MAX_VALUE, 125, 96, 108, 106, 106, 107, 64, 125, 91, 103, 125, 96, 120};
                }

                {
                    this.A02 = (Q7) AbstractC1589es.A01(q72);
                    AbstractC1589es.A01(qv);
                    this.A01 = null;
                    this.A00 = i11;
                }

                @Override // com.facebook.ads.redexgen.X.Q7
                public final void A3t(InterfaceC1558eN interfaceC1558eN) {
                    AbstractC1589es.A01(interfaceC1558eN);
                    this.A02.A3t(interfaceC1558eN);
                }

                @Override // com.facebook.ads.redexgen.X.Q7
                public final Map<String, List<String>> A8j() {
                    return this.A02.A8j();
                }

                @Override // com.facebook.ads.redexgen.X.Q7
                public final Uri A9F() {
                    return this.A02.A9F();
                }

                @Override // com.facebook.ads.redexgen.X.Q7
                public final long AFq(C1519dj c1519dj) throws IOException {
                    throw new NullPointerException(A00(0, 14, 73));
                }

                @Override // com.facebook.ads.redexgen.X.Q7
                public final void close() throws IOException {
                    this.A02.close();
                }

                @Override // com.facebook.ads.redexgen.X.O9
                public final int read(byte[] bArr, int i12, int i13) throws IOException {
                    throw new NullPointerException(A00(0, 14, 73));
                }
            } : q72;
            this.A0F = q72;
            this.A0E = interfaceC1507dX != null ? new Q7(q72, interfaceC1507dX) { // from class: com.facebook.ads.redexgen.X.4p
                public static String[] A04 = {"IPBH", "VvgngosO5gvuBIyUBvfbio5RuJ0XAOwT", "9kAHgyP8b1o6aK86O9Jn91", "PbAc3uI2imQeeK05P6OUKl8qIXg", "Tppked33KysbYBUOXTyiG15VLrK", "Y3cR4o4oDjLQNG9WKbCbk1Q7F0", "cSX5hyyTZ5Xwx0Yw98nS423yfpfc3qoP", "47CrhAEfeBd2TTkvETVdoqJNPhVu9FaS"};
                public long A00;
                public boolean A01;
                public final InterfaceC1507dX A02;
                public final Q7 A03;

                {
                    this.A03 = (Q7) AbstractC1589es.A01(q72);
                    this.A02 = (InterfaceC1507dX) AbstractC1589es.A01(interfaceC1507dX);
                }

                @Override // com.facebook.ads.redexgen.X.Q7
                public final void A3t(InterfaceC1558eN interfaceC1558eN) {
                    AbstractC1589es.A01(interfaceC1558eN);
                    this.A03.A3t(interfaceC1558eN);
                }

                @Override // com.facebook.ads.redexgen.X.Q7
                public final Map<String, List<String>> A8j() {
                    return this.A03.A8j();
                }

                @Override // com.facebook.ads.redexgen.X.Q7
                public final Uri A9F() {
                    return this.A03.A9F();
                }

                @Override // com.facebook.ads.redexgen.X.Q7
                public final long AFq(C1519dj c1519dj) throws IOException {
                    this.A00 = this.A03.AFq(c1519dj);
                    if (this.A00 == 0) {
                        return 0L;
                    }
                    if (c1519dj.A03 == -1 && this.A00 != -1) {
                        long j10 = this.A00;
                        if (A04[2].length() != 22) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A04;
                        strArr[5] = "Z0G4eYFPaVif8IsJJbYUaDzhBY";
                        strArr[0] = "z9ex";
                        c1519dj = c1519dj.A05(0L, j10);
                    }
                    this.A01 = true;
                    this.A02.AFs(c1519dj);
                    return this.A00;
                }

                @Override // com.facebook.ads.redexgen.X.Q7
                public final void close() throws IOException {
                    try {
                        this.A03.close();
                        if (this.A01) {
                            this.A01 = false;
                            String[] strArr = A04;
                            if (strArr[4].length() != strArr[3].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A04;
                            strArr2[6] = "BWoPRcZ7tIy7LNiUifturaOqDshrHKKS";
                            strArr2[7] = "FltKfF5q4beKiOJfMmhdW2azzmF4o8yz";
                            this.A02.close();
                        }
                    } catch (Throwable th) {
                        if (this.A01) {
                            this.A01 = false;
                            this.A02.close();
                        }
                        throw th;
                    }
                }

                @Override // com.facebook.ads.redexgen.X.O9
                public final int read(byte[] bArr, int i12, int i13) throws IOException {
                    if (this.A00 == 0) {
                        return -1;
                    }
                    int read = this.A03.read(bArr, i12, i13);
                    if (read > 0) {
                        this.A02.write(bArr, i12, read);
                        int bytesRead = (this.A00 > (-1L) ? 1 : (this.A00 == (-1L) ? 0 : -1));
                        if (bytesRead != 0) {
                            this.A00 -= read;
                        }
                    }
                    return read;
                }
            } : null;
        } else {
            this.A0F = AnonymousClass59.A03;
            this.A0E = null;
        }
        this.A0H = interfaceC1565eU;
    }

    private int A00(C1519dj c1519dj) {
        if (this.A0L && this.A0C) {
            return 0;
        }
        if (this.A0K && c1519dj.A03 == -1) {
            return 1;
        }
        return -1;
    }

    public static Uri A01(InterfaceC1562eR interfaceC1562eR, String str, Uri redirectedUri) {
        Uri redirectedUri2 = AbstractC1582el.A01(interfaceC1562eR.A7I(str));
        return redirectedUri2 != null ? redirectedUri2 : redirectedUri;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.facebook.ads.redexgen.X.dj, com.facebook.ads.redexgen.X.Q7, com.facebook.ads.redexgen.X.eb] */
    private void A03() throws IOException {
        if (this.A06 == null) {
            return;
        }
        try {
            this.A06.close();
        } finally {
            this.A07 = null;
            this.A06 = null;
            if (this.A0A != null) {
                this.A0G.AGo(this.A0A);
                this.A0A = null;
            }
        }
    }

    private void A04() {
        if (0 != 0 && this.A04 > 0) {
            this.A0G.A70();
            throw new NullPointerException(A02(103, 17, 4));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0160, code lost:
        if (r3 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0162, code lost:
        r21.A0A = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01cc, code lost:
        if (r3 != false) goto L34;
     */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Parameter isInitSegment and all ot is usages. Setting mFbDataSpecExtension in nextDataSpec. Call to maybeUpdateRedirectedUriMetadata at the end")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A06(com.facebook.ads.redexgen.X.C1519dj r22, boolean r23, boolean r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C05084e.A06(com.facebook.ads.redexgen.X.dj, boolean, boolean):void");
    }

    private void A07(String str) throws IOException {
        this.A00 = 0L;
        if (A0D()) {
            C1584en c1584en = new C1584en();
            C1584en.A00(c1584en, this.A03);
            this.A0G.A44(str, c1584en);
        }
    }

    @MetaExoPlayerCustomization
    private void A08(String str, Uri uri) {
        if (!A0D()) {
            return;
        }
        C1584en c1584en = new C1584en();
        if (!uri.equals(this.A05)) {
            C1584en.A01(c1584en, this.A05);
        } else {
            C1584en.A01(c1584en, null);
        }
        try {
            this.A0G.A44(str, c1584en);
        } catch (C1559eO e8) {
            String message = A02(15, 88, 5);
            Log.w(A02(0, 15, 23), message, e8);
        }
    }

    private void A09(Throwable th) {
        if (A0B() || (th instanceof C1559eO)) {
            this.A0C = true;
        }
    }

    private boolean A0A() {
        return this.A06 == this.A0F;
    }

    private boolean A0B() {
        return this.A06 == this.A0D;
    }

    private boolean A0C() {
        return !A0B();
    }

    private boolean A0D() {
        return this.A06 == this.A0E;
    }

    public final InterfaceC1562eR A0E() {
        return this.A0G;
    }

    public final InterfaceC1571ea A0F() {
        return this.A0I;
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final void A3t(InterfaceC1558eN interfaceC1558eN) {
        AbstractC1589es.A01(interfaceC1558eN);
        this.A0D.A3t(interfaceC1558eN);
        this.A0F.A3t(interfaceC1558eN);
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final Map<String, List<String>> A8j() {
        if (A0C()) {
            Q7 q72 = this.A0F;
            if (A0N[6].length() != 26) {
                throw new RuntimeException();
            }
            A0N[4] = "2cmD";
            return q72.A8j();
        }
        return Collections.emptyMap();
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final Uri A9F() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final void close() throws IOException {
        this.A08 = null;
        this.A05 = null;
        this.A03 = 0L;
        A04();
        try {
            A03();
        } catch (Throwable e8) {
            A09(e8);
            throw e8;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
        if (r3 == 0) goto L40;
     */
    @Override // com.facebook.ads.redexgen.X.O9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r18, int r19, int r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C05084e.read(byte[], int, int):int");
    }
}

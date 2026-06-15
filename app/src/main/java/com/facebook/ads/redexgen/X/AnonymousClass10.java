package com.facebook.ads.redexgen.X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomizations;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.10  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AnonymousClass10 extends AbstractC0760Et {
    public static byte[] A13;
    public static String[] A14 = {"OoD3hUQgPrFFrwO8ECHeD9ucUnIPwTWe", "q2VbVvwIahzZSPBh8sixElhn9uYPYz5C", "Pp53zOtr5gumwXoEargTAvad9TKjOEgM", "5qpQxKR2N4wfCYd38KbkjywhgnJ963hV", "9oxzTu4R5tJcMdmljo9bC2HK97CtRBfK", "Wth5rWysJIg0M3W02ZI4QKscogaIe9F4", "9M43VDTX2MMQLNxVkh2pOgl2SmRW93gu", "qHhlxrTPgn5CkjzgCo9tNZlnZBpXR"};
    public static final byte[] A15;
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public MediaFormat A0D;
    public TA A0E;
    public TA A0F;
    public InterfaceC1268Yz A0G;
    public Z2 A0H;
    public Z9 A0I;
    public ZB A0J;
    public String A0K;
    public ByteBuffer A0L;
    public ArrayDeque<Z2> A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    @MetaExoPlayerCustomization("Potentially can be removed. Added in D36797879")
    public long A0h;
    public OA A0i;
    public ZM A0j;
    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D57514060: Do not added Dav1dMediaCodecInfo to the list of MediaCodecInfos if it's already added, can be cleaned up after launch")
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public final int A0n;
    public final int A0o;
    public final MediaCodec.BufferInfo A0p;
    public final P6 A0q;
    public final C1214Ww A0r;
    public final C1214Ww A0s;
    public final TO A0t;
    public final ZS A0u;
    public final ArrayDeque<ZB> A0v;
    public final List<Long> A0w;
    public final boolean A0x;
    public final boolean A0y;
    public final boolean A0z;
    public final C0951Md A10;
    public final C0954Mg A11;
    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "D60404164: Merge init calls in the renderer")
    public final boolean A12;

    public static String A0x(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A13, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A14;
            if (strArr[0].charAt(23) != strArr[5].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A14;
            strArr2[6] = "9TORv4gsetTtojXGR5Ecdz5TvCF4O3Fr";
            strArr2[3] = "AfJj5G27xag0QDWQPIvdRithhIMyf3fV";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 43);
            i13++;
        }
    }

    public static void A15() {
        A13 = new byte[]{-127, 117, -73, -54, -55, 117, -61, -60, 117, -56, -70, -72, -54, -57, -70, 117, -71, -70, -72, -60, -71, -70, -57, 117, -74, -53, -74, -66, -63, -74, -73, -63, -70, -125, 117, -87, -57, -50, -66, -61, -68, 117, -55, -60, 117, -59, -57, -60, -72, -70, -70, -71, 117, -52, -66, -55, -67, 117, -107, -55, -22, -24, -12, -23, -22, -9, -91, -18, -13, -18, -7, -18, -26, -15, -18, -1, -26, -7, -18, -12, -13, -91, -21, -26, -18, -15, -22, -23, -79, -91, -9, -22, -7, -9, -2, -107, -74, -62, -58, -74, -58, -74, 113, -73, -78, -70, -67, -74, -75, 125, 113, -61, -74, -59, -61, -54, -47, -1, -6, -83, 0, -14, 0, 0, -10, -4, -5, -83, -1, -14, -2, 2, -10, -1, -14, 0, -83, 0, -14, -16, 2, -1, -14, -83, -15, -14, -16, -4, -15, -14, -1, -83, -13, -4, -1, -83, -47, -20, -12, -9, -16, -17, -85, -1, -6, -85, -12, -7, -12, -1, -12, -20, -9, -12, 5, -16, -85, -17, -16, -18, -6, -17, -16, -3, -59, -85, -57, -33, -34, -29, -37, -102, -20, -33, -21, -17, -29, -20, -33, -19, -102, -37, -102, -66, -20, -25, -51, -33, -19, -19, -29, -23, -24, -57, -37, -24, -37, -31, -33, -20, 123, -109, -110, -105, -113, 113, -99, -110, -109, -111, Byte.MIN_VALUE, -109, -100, -110, -109, -96, -109, -96, -38, -40, -29, -71, -48, 3, 4, -7, -6, -2, -71, -20, 1, -18, -71, -17, -16, -18, -114, -116, -105, 109, -124, -73, -72, -83, -82, -78, 109, -96, -75, -94, 109, -93, -92, -94, 109, -78, -92, -94, -76, -79, -92, -98, -100, -89, 125, -100, -93, -102, 125, -112, -92, -109, -104, -98, 125, -109, -108, -110, -98, -109, -108, -95, 125, -100, -97, -126, -41, -43, -32, -74, -43, -36, -45, -74, -34, -47, -52, -51, -41, -74, -52, -51, -53, -41, -52, -51, -38, -74, -55, -34, -53, -125, -127, -116, 98, -126, -86, -99, -104, -99, -107, 98, -100, 102, 106, 104, 98, -104, -103, -105, -93, -104, -103, -52, -54, -43, -85, -53, -13, -26, -31, -26, -34, -85, -27, -81, -77, -79, -85, -31, -30, -32, -20, -31, -30, -85, -16, -30, -32, -14, -17, -30, -79, -81, -70, -112, -75, -89, -91, -112, -61, -40, -59, -112, -58, -57, -59, -96, -98, -87, Byte.MAX_VALUE, -92, -106, -108, Byte.MAX_VALUE, -78, -57, -76, Byte.MAX_VALUE, -75, -74, -76, Byte.MAX_VALUE, -60, -74, -76, -58, -61, -74, -27, -29, -18, -60, -9, 2, 2, 13, -1, 4, 4, -5, 8, -60, 12, -1, -6, -5, 5, -60, -6, -5, -7, 5, -6, -5, 8, -60, -9, 12, -7, -48, -50, -39, -81, -30, -18, -19, -16, -24, -22, -28, -81, -30, -9, -28, -81, -27, -26, -28, -16, -27, -26, -13, -81, -30, -8, -26, -12, -16, -18, -26, -41, -43, -32, -74, -23, -11, -12, -9, -17, -15, -21, -74, -23, -2, -21, -74, -20, -19, -21, -9, -20, -19, -6, -74, -23, -1, -19, -5, -9, -11, -19, -74, -5, -19, -21, -3, -6, -19, -67, -69, -58, -100, -43, -35, -35, -43, -38, -45, -100, -49, -49, -47, -100, -46, -45, -47, -35, -46, -45, -32, -24, -26, -15, -57, 0, 8, 8, 0, 5, -2, -57, 15, 8, 11, -5, 2, 12, -57, -3, -2, -4, 8, -3, -2, 11, -78, -80, -69, -111, -43, -50, -111, -39, -52, -57, -56, -46, -62, -57, -56, -58, -46, -57, -56, -43, -111, -60, -39, -58, -124, -90, -103, -102, -103, -90, -90, -103, -104, 84, -104, -103, -105, -93, -104, -103, -90, 84, -99, -94, -89, -88, -107, -94, -88, -99, -107, -88, -99, -93, -94, 84, -102, -107, -99, -96, -103, -104, 98, 84, -121, -96, -103, -103, -92, -99, -94, -101, 84, -88, -100, -103, -94, 84, -90, -103, -88, -90, -83, -99, -94, -101, 98, -100, -106, 118, -118, 126, 122, 121, Byte.MIN_VALUE, 122, 90, 110, 98, 95, 93, -35, -41, -73, -47, -62, -70, -70, -29, -35, -67, -38, -57, -64, -64, -35, -41, -73, -34, -65, -62, -65, -57, -52, -59, -46, -46, -55, -48, -111, -57, -45, -39, -46, -40, 8, 20, 19, 11, 14, 12, 26, 23, 10, -24, 20, 9, 10, 8, -96, -81, -94, -98, -79, -94, Byte.MIN_VALUE, -84, -95, -94, -96, 119, -13, 1, -16, -8, -3, -48, -3, -13, -43, -12, -12, -13, -68, -62, -59, -53, -60, -70, -69, -56, -50, -44, -41, -35, -42, -52, -51, -38, -57, -44, -36, -51, -11, -13, 2, -27, 0, -17, -2, -2, -13, -14, -37, -13, -14, -9, -17, -47, 0, 7, -2, 2, -3, -18, -7, -10, -4, -9, -20, -7, -84, -90, 118, 116, 116, 116, -34, -37, -33, -35, -34, -22, 3, -5, 10, -9, -60, -6, -9, 12, -57, -6, -60, -9, 12, -57, -60, -6, -5, -7, 5, -6, -5, 8, -26, -25, -44, -27, -25, -74, -30, -41, -40, -42, 21, 10, 13, 2, 17, 10, 2, 31, 18, 13, 14, 24, -40, 10, 31, -39, -38, 13, 0, -5, -4, 6, -58, -5, 6, 3, -7, 16, -60, 13, 0, 10, 0, 6, 5, 29, 15, 10, 26, 14};
    }

    public abstract int A1g(InterfaceC1268Yz interfaceC1268Yz, Z2 z22, ZM zm, ZM zm2);

    public abstract int A1h(ZS zs, TO to, ZM zm) throws ZW;

    public abstract List<Z2> A1l(ZS zs, ZM zm, boolean z10) throws ZW;

    public abstract void A1u(C1214Ww c1214Ww);

    public abstract void A1v(@MetaExoPlayerCustomization InterfaceC1268Yz interfaceC1268Yz, MediaFormat mediaFormat) throws EK;

    public abstract void A1w(Z2 z22, InterfaceC1268Yz interfaceC1268Yz, ZM zm, MediaCrypto mediaCrypto) throws ZW;

    @MetaExoPlayerCustomization("D45988204: [FBLite][Video] Add Codec Hooks for Logging")
    public abstract void A1x(String str);

    public abstract void A1y(String str, long j10, long j11);

    public abstract boolean A22();

    public abstract boolean A23(long j10, long j11, InterfaceC1268Yz interfaceC1268Yz, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10, boolean z11) throws EK;

    static {
        A15();
        A15 = new byte[]{0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    }

    public AnonymousClass10(int i10, C0954Mg c0954Mg, C0951Md c0951Md, ZS zs, TO to, boolean z10, boolean z11, int i11, int i12) {
        super(i10);
        this.A09 = -9223372036854775807L;
        this.A08 = -9223372036854775807L;
        this.A0m = false;
        this.A0k = false;
        AbstractC1589es.A08(AbstractC1672gE.A02 >= 16);
        this.A11 = (C0954Mg) AbstractC1589es.A01(c0954Mg);
        this.A10 = (C0951Md) AbstractC1589es.A01(c0951Md);
        this.A0u = (ZS) AbstractC1589es.A01(zs);
        this.A0t = to;
        this.A0z = z10;
        this.A0x = z11;
        this.A0o = i11;
        this.A0n = i12;
        this.A0r = new C1214Ww(0);
        this.A0s = C1214Ww.A02();
        this.A0q = new P6();
        this.A0w = new ArrayList();
        this.A0p = new MediaCodec.BufferInfo();
        this.A00 = 1.0f;
        this.A01 = 1.0f;
        this.A0v = new ArrayDeque<>();
        A18(ZB.A04);
        this.A03 = 0;
        this.A04 = 0;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A0C = -9223372036854775807L;
        this.A0y = C0962Mq.A03(EnumC0959Mn.A1j);
        this.A12 = C0962Mq.A03(EnumC0959Mn.A1U);
    }

    private int A0w(String str) {
        if (AbstractC1672gE.A02 <= 25 && A0x(256, 25, 20).equals(str) && (AbstractC1672gE.A06.startsWith(A0x(681, 7, 95)) || AbstractC1672gE.A06.startsWith(A0x(653, 7, 30)) || AbstractC1672gE.A06.startsWith(A0x(660, 7, 2)) || AbstractC1672gE.A06.startsWith(A0x(674, 7, 101)))) {
            return 2;
        }
        if (AbstractC1672gE.A02 < 24) {
            if (A0x(331, 22, 9).equals(str) || A0x(353, 29, 82).equals(str)) {
                String str2 = AbstractC1672gE.A03;
                if (A14[2].charAt(24) != '9') {
                    throw new RuntimeException();
                }
                String[] strArr = A14;
                strArr[0] = "gnzJwAISQjMOqd2NpKTj0H6c1j3UUSfk";
                strArr[5] = "7RIPIFML4eYXrQIkUKlmvltc2OxxU33E";
                if (!A0x(739, 8, 43).equals(str2)) {
                    if (!A0x(747, 12, 61).equals(AbstractC1672gE.A03)) {
                        if (!A0x(780, 7, 92).equals(AbstractC1672gE.A03)) {
                            if (A0x(831, 7, 118).equals(AbstractC1672gE.A03)) {
                                return 1;
                            }
                            return 0;
                        }
                        return 1;
                    }
                    return 1;
                }
                return 1;
            }
            return 0;
        }
        return 0;
    }

    private ByteBuffer A0y(int i10) {
        return this.A0G.A89(i10);
    }

    private ByteBuffer A0z(int i10) {
        return this.A0G.A8U(i10);
    }

    private List<Z2> A10(boolean z10) throws ZW {
        String alternativeMimeType;
        List<Z2> A1l = A1l(this.A0u, this.A0j, z10);
        if (A1l.isEmpty() && z10) {
            A1l = A1l(this.A0u, this.A0j, false);
            if (!A1l.isEmpty()) {
                AbstractC1633fb.A07(A0x(220, 18, 3), A0x(116, 40, 98) + this.A0j.A0W + A0x(0, 58, 42) + A1l + A0x(58, 1, 60));
            }
        }
        if (A1l.isEmpty() && this.A0l && (alternativeMimeType = ZZ.A0P(this.A0j)) != null) {
            List<Z2> A7e = this.A0u.A7e(alternativeMimeType, false, false);
            if (AbstractC1672gE.A02 >= 26) {
                if (A0x(848, 18, 108).equals(this.A0j.A0W) && !A7e.isEmpty()) {
                    return A7e;
                }
                return A1l;
            }
            return A1l;
        }
        return A1l;
    }

    private void A11() throws EK {
        if (this.A04 == 2) {
            A1n();
            A1p();
            return;
        }
        this.A0b = true;
        A1o();
    }

    private void A12() throws EK {
        MediaFormat A8V = this.A0G.A8V();
        if (this.A02 != 0 && A8V.getInteger(A0x(866, 5, 123)) == 32 && A8V.getInteger(A0x(793, 6, 75)) == 32) {
            this.A0c = true;
            return;
        }
        if (this.A0T) {
            A8V.setInteger(A0x(688, 13, 57), 1);
        }
        this.A0D = A8V;
        this.A0U = true;
        A1v(this.A0G, A8V);
    }

    private void A13() {
        this.A05 = -1;
        this.A0r.A02 = null;
    }

    private void A14() {
        this.A06 = -1;
        this.A0L = null;
    }

    @MetaExoPlayerCustomizations({@MetaExoPlayerCustomization("Call to 'forceDisableAsynchronous'"), @MetaExoPlayerCustomization("D45988204: [FBLite][Video] Add Codec Hooks for Logging"), @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "D60404164: Merge init calls in the renderer")})
    private void A16(Z2 z22, MediaCrypto mediaCrypto) throws Exception {
        InterfaceC1268Yz interfaceC1268Yz = null;
        String str = z22.A03;
        try {
            if (this.A12) {
                A1z(str, this.A0j);
            } else {
                A1t(this.A0j);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!this.A12) {
                A1x(str);
            }
            AbstractC1663g5.A02(A0x(IronSourceError.ERROR_NT_LOAD_NO_CONFIG, 12, 18) + str);
            new C1081Rk().A00();
            interfaceC1268Yz = Z6.A04().A0K(A22(), this.A11, this.A10.A00(), EnumC0949Mb.A05, str);
            try {
                this.A0K = str;
                AbstractC1663g5.A00();
                AbstractC1663g5.A02(A0x(IronSourceError.ERROR_NT_LOAD_AFTER_LONG_INITIATION, 14, 122));
                try {
                    A1w(z22, interfaceC1268Yz, this.A0j, mediaCrypto);
                    AbstractC1663g5.A00();
                    AbstractC1663g5.A02(A0x(821, 10, 72));
                    interfaceC1268Yz.start();
                    AbstractC1663g5.A00();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    this.A0G = interfaceC1268Yz;
                    this.A0H = z22;
                    A1y(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                } catch (Exception e8) {
                    e = e8;
                    if (interfaceC1268Yz != null) {
                        interfaceC1268Yz.AGj();
                    }
                    throw e;
                }
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D53064452: Add decoder init time failure thread sleep")
    private void A17(Z2 z22, Z2 z23, MediaCrypto mediaCrypto) throws Exception {
        int A00 = C0962Mq.A00(EnumC0960Mo.A06);
        if (A00 >= 0) {
            try {
                A16(z23, mediaCrypto);
                return;
            } catch (Exception e8) {
                if (z23 == z22) {
                    AbstractC1633fb.A07(A0x(220, 18, 3), A0x(590, 63, 9));
                    Thread.sleep(A00);
                    A16(z23, mediaCrypto);
                    return;
                }
                throw e8;
            }
        }
        A16(z23, mediaCrypto);
    }

    private void A18(ZB zb) {
        this.A0J = zb;
        if (zb.A02 != -9223372036854775807L) {
            this.A0a = true;
        }
    }

    private boolean A19() {
        boolean z10 = false;
        if (this.A0n <= 0) {
            return false;
        }
        z10 = (this.A08 == -9223372036854775807L || System.currentTimeMillis() - this.A08 <= ((long) this.A0n)) ? true : true;
        if (this.A08 == -9223372036854775807L) {
            AbstractC1633fb.A07(A0x(220, 18, 3), A0x(95, 21, 38));
            try {
                this.A0M = null;
                A1n();
            } catch (IllegalStateException unused) {
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (A14[2].charAt(24) != '9') {
                throw new RuntimeException();
            }
            String[] strArr = A14;
            strArr[1] = "Q4MpamSuL85iJ4LieLOuDunWx78uflZU";
            strArr[4] = "LSkMpxDVSEyRzVZUteVftDEthtoIL7mt";
            this.A08 = currentTimeMillis;
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0212, code lost:
        if (com.facebook.ads.redexgen.X.AnonymousClass10.A14[2].charAt(24) == '9') goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0214, code lost:
        r7.A01(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0217, code lost:
        r2 = A1N(r5);
        r13.A0g = r2;
        r2 = r13.A0g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x021f, code lost:
        if (r2 == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0221, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0222, code lost:
        com.facebook.ads.redexgen.X.AnonymousClass10.A14[7] = "6WGrs41Jg1Sn5A5xMN2zu7gWYWWcJ";
        r7.A01(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x022d, code lost:
        r2 = r13.A0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x022f, code lost:
        if (r2 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0231, code lost:
        if (r5 != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0233, code lost:
        r6 = r13.A0r.A02;
        r4 = com.facebook.ads.redexgen.X.AnonymousClass10.A14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0249, code lost:
        if (r4[6].charAt(29) == r4[3].charAt(29)) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x024b, code lost:
        r4 = com.facebook.ads.redexgen.X.AnonymousClass10.A14;
        r4[1] = "kPguBqJT2oKiT7pDw7xEP0Sv5ObL6l7G";
        r4[4] = "nHPR3X17FXI7xDYXOGGOFso1zy9DquGM";
        com.facebook.ads.redexgen.X.AbstractC1149Ud.A0G(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0262, code lost:
        if (r13.A0r.A02.position() != 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0264, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0265, code lost:
        r4 = com.facebook.ads.redexgen.X.AnonymousClass10.A14;
        r4[1] = "IeHm5h95MZ8oiAgkgb73IBHMpFC3hvfl";
        r4[4] = "ZvZmeBXxZwD0WjhIfVcHUz6D4UH3Kjtt";
        com.facebook.ads.redexgen.X.AbstractC1149Ud.A0G(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x027c, code lost:
        if (r13.A0r.A02.position() != 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x027f, code lost:
        r13.A0O = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0281, code lost:
        r7 = r13.A0r.A01;
        r2 = r13.A0r.A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x028b, code lost:
        if (r2 == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x028d, code lost:
        r13.A0w.add(java.lang.Long.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0296, code lost:
        r13.A0A = java.lang.Math.max(r13.A0A, r7);
        r13.A0r.A0B();
        A1u(r13.A0r);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02a8, code lost:
        if (r5 == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02aa, code lost:
        r13.A0G.AGS(r13.A05, 0, r13.A0r.A05, r7, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02b8, code lost:
        r13.A0G.AGQ(r13.A05, 0, r13.A0r.A02.limit(), r7, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02c9, code lost:
        A13();
        r13.A0V = true;
        r13.A03 = 0;
        r13.A0i.A08++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02d7, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02d8, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02d9, code lost:
        r1 = r13.A0j;
        r0 = r2.getErrorCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02e7, code lost:
        throw A1S(r2, r1, com.facebook.ads.redexgen.X.AbstractC1672gE.A02(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
        if (r4 < 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
        r13.A05 = r13.A0G.A5i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
        if (r13.A05 >= 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
        if (r4 < 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
        r13.A0r.A02 = A0y(r13.A05);
        r13.A0r.A0A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
        if (r13.A04 != 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
        if (r13.A0R == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
        r13.A04 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
        r13.A0W = true;
        r13.A0G.AGQ(r13.A05, 0, 0, 0, 4);
        A13();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
        if (r13.A0N == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009c, code lost:
        r13.A0N = false;
        r13.A0r.A02.put(com.facebook.ads.redexgen.X.AnonymousClass10.A15);
        r13.A0G.AGQ(r13.A05, 0, com.facebook.ads.redexgen.X.AnonymousClass10.A15.length, 0, 0);
        A13();
        r13.A0V = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ba, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
        if (r13.A0g == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c0, code lost:
        r9 = -4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c5, code lost:
        if (A9f() != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
        if (r13.A0r.A08() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cf, code lost:
        r2 = r13.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dc, code lost:
        if (com.facebook.ads.redexgen.X.AnonymousClass10.A14[7].length() == 29) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00de, code lost:
        r8 = com.facebook.ads.redexgen.X.AnonymousClass10.A14;
        r8[0] = "0sEgsCazVRiJjFArRYRqJhUcC9vBDmEG";
        r8[5] = "3yCsh36eFUwBUSByAIGb1IZckRxx3muh";
        r13.A0B = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ed, code lost:
        if (r9 != (-3)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ef, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f0, code lost:
        r8 = com.facebook.ads.redexgen.X.AnonymousClass10.A14;
        r8[0] = "rzBHZ5pctL1gePFdp9hWlm0cA2ePuptH";
        r8[5] = "TiUas2vf1DyqzCawQg9XxMScCvs3S8z5";
        r13.A0B = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0101, code lost:
        if (r13.A03 != 1) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0103, code lost:
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010c, code lost:
        if (r4 >= r13.A0j.A0X.size()) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010e, code lost:
        r13.A0r.A02.put(r13.A0j.A0X.get(r4));
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0122, code lost:
        r13.A03 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0124, code lost:
        r6 = r13.A0r.A02.position();
        r8 = r13.A0q;
        r7 = r13.A0r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013b, code lost:
        if (com.facebook.ads.redexgen.X.AnonymousClass10.A14[7].length() == 29) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013d, code lost:
        com.facebook.ads.redexgen.X.AnonymousClass10.A14[7] = "MsJZXGBrjaiuCiwjDOKwGLec3V4vS";
        r9 = A1R(r8, r7, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014a, code lost:
        com.facebook.ads.redexgen.X.AnonymousClass10.A14[2] = "e3ztOfE5GXvu0ruPB65XhXtb9pVKXoUS";
        r9 = A1R(r8, r7, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0158, code lost:
        if (r9 != (-5)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015c, code lost:
        if (r13.A03 != 2) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015e, code lost:
        r4 = r13.A0r;
        r3 = com.facebook.ads.redexgen.X.AnonymousClass10.A14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0172, code lost:
        if (r3[6].charAt(29) == r3[3].charAt(29)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0179, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017a, code lost:
        r3 = com.facebook.ads.redexgen.X.AnonymousClass10.A14;
        r3[6] = "R8o32Zdhjt4xMezSE1zAR89ND139738d";
        r3[3] = "cd13lubkXhHULqBERq4KGhKcPMHm23ze";
        r4.A0A();
        r13.A03 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018b, code lost:
        A1s(r13.A0q.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0192, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0199, code lost:
        if (r13.A0r.A05() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019d, code lost:
        if (r13.A03 != 2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019f, code lost:
        r13.A0r.A0A();
        r13.A03 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a6, code lost:
        r13.A0Y = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01aa, code lost:
        if (r13.A0V != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ac, code lost:
        A11();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01af, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b2, code lost:
        if (r13.A0R == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b5, code lost:
        r13.A0W = true;
        r13.A0G.AGQ(r13.A05, 0, 0, 0, 4);
        A13();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c6, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c7, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c8, code lost:
        r1 = r13.A0j;
        r0 = r2.getErrorCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01d6, code lost:
        throw A1S(r2, r1, com.facebook.ads.redexgen.X.AbstractC1672gE.A02(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d9, code lost:
        if (r13.A0f == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e1, code lost:
        if (r13.A0r.A07() != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e3, code lost:
        r13.A0r.A0A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ea, code lost:
        if (r13.A03 != 2) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ec, code lost:
        r13.A03 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ee, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ef, code lost:
        r13.A0f = false;
        r5 = r13.A0r.A0E();
        r2 = r13.A10.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01fd, code lost:
        if (r2 == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ff, code lost:
        if (r5 == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0201, code lost:
        r7 = r13.A0r.A05;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A1A() throws com.facebook.ads.redexgen.X.EK {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass10.A1A():boolean");
    }

    private boolean A1B() {
        return this.A06 >= 0;
    }

    private boolean A1C(int i10) throws EK {
        P6 A1U = A1U();
        this.A0s.A0A();
        int A1R = A1R(A1U, this.A0s, i10 | 4);
        if (A1R == -5) {
            A1s(A1U.A00);
            return true;
        } else if (A1R == -4 && this.A0s.A05()) {
            this.A0Y = true;
            A11();
            return false;
        } else {
            return false;
        }
    }

    private boolean A1D(long j10) {
        int size = this.A0w.size();
        for (int i10 = 0; i10 < size; i10++) {
            int size2 = (this.A0w.get(i10).longValue() > j10 ? 1 : (this.A0w.get(i10).longValue() == j10 ? 0 : -1));
            if (size2 == 0) {
                this.A0w.remove(i10);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ae, code lost:
        if (r5 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b3, code lost:
        if (r21.A04 != 2) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b5, code lost:
        A11();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c0, code lost:
        if (r5 == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A1E(long r22, long r24) throws com.facebook.ads.redexgen.X.EK {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass10.A1E(long, long):boolean");
    }

    private boolean A1F(MediaCrypto mediaCrypto, boolean z10) throws Z9 {
        Z9 A00;
        if (this.A0M == null) {
            try {
                List<Z2> A10 = A10(z10);
                if (this.A0x) {
                    this.A0M = new ArrayDeque<>(A10);
                } else {
                    this.A0M = new ArrayDeque<>(Collections.singletonList(A10.get(0)));
                }
                this.A0I = null;
            } catch (ZW e8) {
                throw new Z9(this.A0j, e8, z10, -49998);
            }
        }
        if (!this.A0k && A21()) {
            this.A0M.addFirst(Z2.A02(A0x(799, 22, 107), this.A0j.A0W, this.A0j.A0W, null, false, true, false, false, false));
        }
        if (!this.A0M.isEmpty()) {
            Z2 peekFirst = this.A0M.peekFirst();
            do {
                Z2 peekFirst2 = this.A0M.peekFirst();
                if (!A25(peekFirst2)) {
                    return false;
                }
                try {
                    A17(peekFirst, peekFirst2, mediaCrypto);
                    return true;
                } catch (Exception e10) {
                    AbstractC1633fb.A0A(A0x(220, 18, 3), A0x(156, 30, 96) + peekFirst2, e10);
                    this.A0M.removeFirst();
                    Z9 z92 = new Z9(this.A0j, e10, z10, peekFirst2);
                    if (this.A0I == null) {
                        this.A0I = z92;
                    } else {
                        A00 = this.A0I.A00(z92);
                        this.A0I = A00;
                    }
                    if (this.A0M.isEmpty()) {
                        throw this.A0I;
                    }
                }
            } while (this.A0M.isEmpty());
            throw this.A0I;
        }
        throw new Z9(this.A0j, (Throwable) null, z10, -49999);
    }

    public static boolean A1G(ZM zm) {
        return zm.A07 == 0 || zm.A07 == 2;
    }

    public static boolean A1H(Z2 z22) {
        String str = z22.A03;
        if (AbstractC1672gE.A02 <= 17) {
            String[] strArr = A14;
            if (strArr[6].charAt(29) != strArr[3].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A14;
            strArr2[0] = "Dh5gFYVTv0cqWq9YiaFEkCLc3B9gYsdG";
            strArr2[5] = "bmSfnSe7jv5poQp2oZzmqzpcoNrfPftO";
            String name = A0x(566, 24, 56);
            if (!name.equals(str)) {
                String name2 = A0x(419, 31, 107);
                if (name2.equals(str)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean A1I(String str) {
        if (AbstractC1672gE.A02 > 23 || !A0x(541, 25, 110).equals(str)) {
            if (AbstractC1672gE.A02 <= 19) {
                String str2 = AbstractC1672gE.A03;
                if (A14[2].charAt(24) != '9') {
                    throw new RuntimeException();
                }
                String[] strArr = A14;
                strArr[0] = "KmYu75IlDAU87UyZtW1ThwRcmAw5W1Np";
                strArr[5] = "U7cJbeNNmChJwVdWZhAYB9Mc4aX30Owk";
                if (!A0x(787, 6, 25).equals(str2) || (!A0x(450, 31, 86).equals(str) && !A0x(481, 38, 93).equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A1J(String str) {
        return AbstractC1672gE.A02 == 21 && A0x(519, 22, 67).equals(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
        if (r3.equals(r5) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
        if (A0x(397, 22, 38).equals(r5) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
        if (r3.equals(r5) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A1K(java.lang.String r5) {
        /*
            int r0 = com.facebook.ads.redexgen.X.AbstractC1672gE.A02
            r4 = 18
            if (r0 < r4) goto Ld0
            int r3 = com.facebook.ads.redexgen.X.AbstractC1672gE.A02
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AnonymousClass10.A14
            r0 = 2
            r1 = r1[r0]
            r0 = 24
            char r1 = r1.charAt(r0)
            r0 = 57
            if (r1 == r0) goto L1d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L1d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass10.A14
            java.lang.String r1 = "vlVT2N2U5T0gZH7fXy0w8egcpxlFLscz"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "6anGbGx0fx5RXUQkV3Jv7Focx8t8fygB"
            r0 = 5
            r2[r0] = r1
            if (r3 != r4) goto L6a
            r2 = 382(0x17e, float:5.35E-43)
            r1 = 15
            r0 = 55
            java.lang.String r3 = A0x(r2, r1, r0)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass10.A14
            r0 = 1
            r1 = r2[r0]
            r0 = 4
            r2 = r2[r0]
            r0 = 0
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L81
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass10.A14
            java.lang.String r1 = "8yjr9E9X5f2zWMVBajh0ju3thozfHrOE"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "rlbJf9SuQAaRuV1arfQVXiP5yHX7Bris"
            r0 = 4
            r2[r0] = r1
            boolean r0 = r3.equals(r5)
            if (r0 != 0) goto Ld0
        L5a:
            r2 = 397(0x18d, float:5.56E-43)
            r1 = 22
            r0 = 38
            java.lang.String r0 = A0x(r2, r1, r0)
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto Ld0
        L6a:
            int r3 = com.facebook.ads.redexgen.X.AbstractC1672gE.A02
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AnonymousClass10.A14
            r0 = 2
            r1 = r1[r0]
            r0 = 24
            char r1 = r1.charAt(r0)
            r0 = 57
            if (r1 == r0) goto L94
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L81:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass10.A14
            java.lang.String r1 = "GdmiuaDAsM7j2OCsuvCB1oZTImGQHOLM"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "b0J8rZ3bdGAHJkYyeQImmVgmbplkztxB"
            r0 = 4
            r2[r0] = r1
            boolean r0 = r3.equals(r5)
            if (r0 != 0) goto Ld0
            goto L5a
        L94:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass10.A14
            java.lang.String r1 = "Sjifj9tgaQXcctvFEVu8PGQg30tAd"
            r0 = 7
            r2[r0] = r1
            r0 = 19
            if (r3 != r0) goto Ld2
            java.lang.String r3 = com.facebook.ads.redexgen.X.AbstractC1672gE.A06
            r2 = 667(0x29b, float:9.35E-43)
            r1 = 7
            r0 = 95
            java.lang.String r0 = A0x(r2, r1, r0)
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto Ld2
            r2 = 238(0xee, float:3.34E-43)
            r1 = 18
            r0 = 96
            java.lang.String r0 = A0x(r2, r1, r0)
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto Ld0
            r2 = 256(0x100, float:3.59E-43)
            r1 = 25
            r0 = 20
            java.lang.String r0 = A0x(r2, r1, r0)
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto Ld2
        Ld0:
            r0 = 1
        Ld1:
            return r0
        Ld2:
            r0 = 0
            goto Ld1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass10.A1K(java.lang.String):boolean");
    }

    public static boolean A1L(String str, ZM zm) {
        return AbstractC1672gE.A02 < 21 && zm.A0X.isEmpty() && A0x(306, 25, 93).equals(str);
    }

    public static boolean A1M(String str, ZM zm) {
        return AbstractC1672gE.A02 <= 18 && zm.A06 == 1 && A0x(281, 25, 36).equals(str);
    }

    private boolean A1N(boolean z10) throws EK {
        if (this.A0E == null || (!z10 && this.A0z)) {
            return false;
        }
        int A90 = this.A0E.A90();
        if (A90 != 1) {
            return A90 != 4;
        }
        T8 A7q = this.A0E.A7q();
        ZM zm = this.A0j;
        int drmSessionState = ((T8) AbstractC1589es.A01(this.A0E.A7q())).A00;
        throw A1S(A7q, zm, drmSessionState);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0760Et
    public void A1X() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0760Et
    public void A1Y() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0760Et
    public void A1Z() {
        this.A0j = null;
        A18(ZB.A04);
        this.A0v.clear();
        this.A0M = null;
        try {
            A1n();
            try {
                if (this.A0E != null) {
                    this.A0E.AGk(null);
                }
                try {
                    if (this.A0F != null && this.A0F != this.A0E) {
                        this.A0F.AGk(null);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    if (this.A0F != null && this.A0F != this.A0E) {
                        this.A0F.AGk(null);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.A0E != null) {
                    this.A0E.AGk(null);
                }
                try {
                    if (this.A0F != null && this.A0F != this.A0E) {
                        this.A0F.AGk(null);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    if (this.A0F != null && this.A0F != this.A0E) {
                        this.A0F.AGk(null);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0760Et
    public void A1a(long j10, boolean z10) throws EK {
        this.A0Y = false;
        this.A0b = false;
        if (this.A0G != null) {
            A1m();
        }
        if (this.A0J.A03.A01() > 0) {
            this.A0e = true;
        }
        this.A0J.A03.A02();
        this.A0v.clear();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0760Et
    @MetaExoPlayerCustomization("D36797879: Adding implementation for calculating avg render time")
    public void A1b(boolean z10, boolean z11) throws EK {
        this.A0i = new OA();
        this.A0h = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0760Et
    public void A1c(ZM[] zmArr, long j10, long j11) throws EK {
    }

    public final float A1f() {
        return this.A00;
    }

    public final long A1i() {
        return this.A0J.A02;
    }

    public final InterfaceC1268Yz A1j() {
        return this.A0G;
    }

    public final Z2 A1k() {
        return this.A0H;
    }

    public void A1m() throws EK {
        this.A07 = -9223372036854775807L;
        A13();
        A14();
        this.A0f = true;
        this.A0g = false;
        this.A0d = false;
        this.A0w.clear();
        this.A0N = false;
        this.A0c = false;
        this.A0Z = false;
        this.A0C = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        if (!this.A0S) {
            boolean z10 = this.A0P;
            if (A14[2].charAt(24) != '9') {
                throw new RuntimeException();
            }
            String[] strArr = A14;
            strArr[6] = "zoNignRVnifI3Zm4xgdJx0R81x7hJ3HR";
            strArr[3] = "d976PP5zRUwEFmO2pIQLdKGEi3eBb3N0";
            if ((!z10 || !this.A0W) && !A20()) {
                if (this.A04 != 0) {
                    A1n();
                    A1p();
                } else {
                    this.A0G.flush();
                    this.A0V = false;
                }
                if (!this.A0X && this.A0j != null) {
                    this.A03 = 1;
                    return;
                }
            }
        }
        A1n();
        A1p();
        if (!this.A0X) {
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String, com.facebook.ads.redexgen.X.TA] */
    public void A1n() {
        this.A07 = -9223372036854775807L;
        this.A09 = -9223372036854775807L;
        this.A08 = -9223372036854775807L;
        A13();
        A14();
        this.A0D = null;
        this.A0U = false;
        this.A0g = false;
        this.A0d = false;
        this.A0w.clear();
        this.A0H = null;
        this.A0X = false;
        this.A0V = false;
        this.A0O = false;
        this.A0S = false;
        this.A02 = 0;
        this.A0R = false;
        this.A0P = false;
        this.A0T = false;
        this.A0N = false;
        this.A0c = false;
        this.A0W = false;
        this.A03 = 0;
        this.A04 = 0;
        if (this.A0G != null) {
            this.A0i.A03++;
            try {
                Z6.A04().A0L(A22(), this.A11, this.A10.A00(), EnumC0949Mb.A05, this.A0K, this.A0G);
                this.A0G = null;
                if (this.A0E != null && this.A0F != this.A0E) {
                    try {
                        this.A0E.AGk(null);
                    } finally {
                    }
                }
            } catch (Throwable th) {
                this.A0G = null;
                if (this.A0E != null && this.A0F != this.A0E) {
                    try {
                        this.A0E.AGk(null);
                        this.A0E = null;
                        if (A14[7].length() != 29) {
                            throw new RuntimeException();
                        }
                        A14[2] = "ZV0ENIG6SxSATEXmI29uLGlE9g1IIFsN";
                        this.A0K = null;
                    } finally {
                    }
                }
                throw th;
            }
        }
    }

    public void A1o() throws EK {
    }

    public final void A1p() throws EK {
        long j10;
        if (this.A0G != null || this.A0j == null) {
            return;
        }
        this.A0E = this.A0F;
        if (this.A0E != null) {
            this.A0E.A7L();
            if (0 == 0) {
                if (this.A0E.A7q() == null) {
                    return;
                }
            } else {
                throw new NullPointerException(A0x(759, 21, 99));
            }
        }
        try {
            if (!A1F(null, false)) {
                return;
            }
            String str = this.A0H.A03;
            this.A02 = A0w(str);
            this.A0O = A1L(str, this.A0j);
            this.A0S = A1K(str);
            this.A0R = A1H(this.A0H);
            this.A0P = A1I(str);
            this.A0Q = A1J(str);
            String[] strArr = A14;
            if (strArr[0].charAt(23) != strArr[5].charAt(23)) {
                throw new RuntimeException();
            }
            A14[2] = "v0D91NWRCj72UoKpAwpZitPy9fD0oWph";
            this.A0T = A1M(str, this.A0j);
            if (A90() == 2) {
                j10 = SystemClock.elapsedRealtime() + 1000;
            } else {
                j10 = -9223372036854775807L;
            }
            this.A07 = j10;
            A13();
            A14();
            this.A09 = -9223372036854775807L;
            this.A0f = true;
            this.A0i.A02++;
            String[] strArr2 = A14;
            if (strArr2[0].charAt(23) != strArr2[5].charAt(23)) {
                return;
            }
            A14[7] = "d0gB5d3Rle0lrUWV3sYUunKuYNR67";
        } catch (Z9 e8) {
            if (this.A0o > 0 && (this.A09 == -9223372036854775807L || System.currentTimeMillis() - this.A09 <= this.A0o)) {
                if (this.A09 == -9223372036854775807L) {
                    String A0x = A0x(220, 18, 3);
                    String mimeType = A0x(59, 36, 90);
                    AbstractC1633fb.A07(A0x, mimeType);
                    this.A09 = System.currentTimeMillis();
                }
                if (this.A0M != null && this.A0M.isEmpty()) {
                    this.A0M = null;
                    return;
                }
                return;
            }
            throw A1S(e8, this.A0j, IronSourceConstants.NT_LOAD);
        }
    }

    public void A1q(long j10) {
    }

    @MetaExoPlayerCustomization("Needed for sr video effects")
    public void A1r(ZM zm) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cf, code lost:
        if (r7.A0V != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d1, code lost:
        r7.A04 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dd, code lost:
        if (r7.A0V != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e0, code lost:
        A1n();
        A1p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A1s(com.facebook.ads.redexgen.X.ZM r8) throws com.facebook.ads.redexgen.X.EK {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass10.A1s(com.facebook.ads.redexgen.X.ZM):void");
    }

    public void A1t(ZM zm) throws EK {
    }

    public void A1z(String str, ZM zm) throws EK {
        A1t(zm);
    }

    public boolean A20() {
        return false;
    }

    public final boolean A21() {
        return A24(this.A0j);
    }

    public final boolean A24(ZM zm) {
        if (zm == null || !this.A0m || !A0x(838, 10, 126).equalsIgnoreCase(zm.A0W)) {
            return false;
        }
        return true;
    }

    public boolean A25(Z2 z22) {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq
    public boolean AAE() {
        return this.A0b;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq
    @MetaExoPlayerCustomization("D18870411: Adding start stall debug reason")
    public boolean AAT() {
        if (this.A0j == null) {
            super.A0B = MI.A07;
        } else {
            boolean z10 = this.A0g;
            String[] strArr = A14;
            if (strArr[6].charAt(29) == strArr[3].charAt(29)) {
                A14[7] = "RFgbLL7LsnviIscfhp0QOuOvBFSGb";
                if (z10) {
                    MI mi = MI.A0A;
                    if (A14[7].length() == 29) {
                        String[] strArr2 = A14;
                        strArr2[6] = "ts0W2C1JQFOuLMCdKvVZ7al9Y4LXT3rb";
                        strArr2[3] = "o0XvOJavr7iwEI36oKR6gRzbuz2fc3Xx";
                        super.A0B = mi;
                    }
                } else if (!A1d() && !A1B()) {
                    super.A0B = MI.A06;
                }
            }
            throw new RuntimeException();
        }
        if (this.A0j != null && !this.A0g) {
            if (!A1d() && !A1B()) {
                if (this.A07 != -9223372036854775807L) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j10 = this.A07;
                    String[] strArr3 = A14;
                    if (strArr3[1].charAt(0) != strArr3[4].charAt(0)) {
                        String[] strArr4 = A14;
                        strArr4[1] = "4duWCqbcI26RTRGCnsQSheQjDKhqEP5z";
                        strArr4[4] = "x1WntWfuzjT8gW0yw38JomljRkRGj2XF";
                        if (elapsedRealtime < j10) {
                        }
                    }
                    throw new RuntimeException();
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1259Yq
    public void AHd(long j10, long j11) throws EK {
        if (this.A0b) {
            A1o();
        } else if (this.A0j == null && !A1C(2)) {
        } else {
            A1p();
            String[] strArr = A14;
            if (strArr[0].charAt(23) != strArr[5].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A14;
            strArr2[6] = "RrIuGbpVwBdCQnVAqzfbiwf9RJMol3Gl";
            strArr2[3] = "TDG5L5AVX1yJIELoGBHwsBDTbvGwy3kA";
            if (this.A0G != null) {
                try {
                    try {
                        AbstractC1663g5.A02(A0x(727, 12, 100));
                        while (A1E(j10, j11)) {
                        }
                        while (A1A()) {
                        }
                        this.A08 = -9223372036854775807L;
                    } catch (IllegalStateException e8) {
                        if (!A19()) {
                            throw A1S(e8, this.A0j, 4003);
                        }
                    }
                } finally {
                    AbstractC1663g5.A00();
                }
            } else {
                this.A0i.A0A += A1Q(j10);
                A1C(1);
            }
            this.A0i.A02();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1054Qi
    public final int AJR(ZM zm) throws EK {
        try {
            return A1h(this.A0u, this.A0t, zm);
        } catch (ZW e8) {
            throw A1S(e8, zm, IronSourceConstants.NT_INSTANCE_LOAD);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0760Et, com.facebook.ads.redexgen.X.InterfaceC1054Qi
    public final int AJT() {
        return 8;
    }
}

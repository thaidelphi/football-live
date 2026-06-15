package com.facebook.ads.redexgen.X;

import com.google.android.gms.ads.AdRequest;
import java.util.Arrays;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* renamed from: com.facebook.ads.redexgen.X.Sz  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1122Sz implements Y7 {
    public static byte[] A0L;
    public static String[] A0M = {"k4h1tLehYnXesS7lKlfTzJueEk6IVLbW", "zj2ppcfaFj6e0vzpeXVavWBLXhN", "ZrZqmBjeieZTvL", "5oOyLXJUOdOrP09NRpK", "DvmwwEvnUft1eoKb", "WvhWZ2ZW5VA1uZtknP1DJz7b", "UeKMXJeWvytnR20Qq1rEs999JXZ", "qf65VJ8JNDA7qwOsvH9"};
    public static final byte[] A0N;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public InterfaceC1157Uo A0A;
    public InterfaceC1157Uo A0B;
    public InterfaceC1157Uo A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final C1647fp A0H;
    public final C1648fq A0I;
    public final String A0J;
    public final boolean A0K;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 91);
            String[] strArr = A0M;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0M[4] = "rvivAbEYp2o375aZ";
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A0L = new byte[]{67, 79, 13, 26, 27, 79, 14, 28, 28, 26, 2, 6, 1, 8, 79, 46, 46, 44, 79, 35, 44, 65, 34, 7, 23, 16, 49, 6, 2, 7, 6, 17, 88, 121, 104, 121, Byte.MAX_VALUE, 104, 121, 120, 60, 125, 105, 120, 117, 115, 60, 115, 126, 118, 121, Byte.MAX_VALUE, 104, 60, 104, 101, 108, 121, 38, 60, 35, 50, 50, 46, 43, 33, 35, 54, 43, 45, 44, 109, 43, 38, 113, 11, 31, 14, 3, 5, 69, 7, 26, 94, 11, 71, 6, 11, 30, 7};
    }

    static {
        A09();
        A0N = new byte[]{73, 68, 51};
    }

    public C1122Sz(boolean z10) {
        this(z10, null);
    }

    public C1122Sz(boolean z10, String str) {
        this.A0H = new C1647fp(new byte[7]);
        this.A0I = new C1648fq(Arrays.copyOf(A0N, 10));
        A06();
        this.A03 = -1;
        this.A02 = -1;
        this.A08 = -9223372036854775807L;
        this.A09 = -9223372036854775807L;
        this.A0K = z10;
        this.A0J = str;
    }

    @EnsuresNonNull({"output", "currentOutput", "id3Output"})
    private void A01() {
        AbstractC1589es.A01(this.A0C);
    }

    @RequiresNonNull({"output"})
    private void A02() throws Q6 {
        this.A0H.A08(0);
        if (!this.A0G) {
            int A04 = this.A0H.A04(2) + 1;
            if (A04 != 2) {
                AbstractC1633fb.A07(A00(22, 10, 56), A00(32, 28, 71) + A04 + A00(0, 22, 52));
                A04 = 2;
            }
            this.A0H.A09(5);
            int A042 = this.A0H.A04(3);
            int audioObjectType = this.A02;
            byte[] A07 = AbstractC1145Ty.A07(A04, audioObjectType, A042);
            C1144Tx aacConfig = AbstractC1145Ty.A03(A07);
            P5 A0w = new P5().A0y(this.A0D).A11(A00(75, 15, 49)).A0w(aacConfig.A02);
            int audioObjectType2 = aacConfig.A00;
            P5 A0b = A0w.A0b(audioObjectType2);
            int audioObjectType3 = aacConfig.A01;
            ZM A14 = A0b.A0m(audioObjectType3).A12(Collections.singletonList(A07)).A10(this.A0J).A14();
            int audioObjectType4 = A14.A0G;
            this.A08 = 1024000000 / audioObjectType4;
            this.A0C.A6U(A14);
            this.A0G = true;
        } else {
            this.A0H.A09(10);
        }
        this.A0H.A09(4);
        int A043 = (this.A0H.A04(13) - 2) - 5;
        if (this.A0F) {
            A043 -= 2;
        }
        InterfaceC1157Uo interfaceC1157Uo = this.A0C;
        long j10 = this.A08;
        String[] strArr = A0M;
        String str = strArr[3];
        String str2 = strArr[7];
        int length = str.length();
        int sampleSize = str2.length();
        if (length != sampleSize) {
            throw new RuntimeException();
        }
        A0M[0] = "YD41JuXFXypIZpezdO7DjFAbz2on2Hh5";
        A0A(interfaceC1157Uo, j10, 0, A043);
    }

    @RequiresNonNull({"id3Output"})
    private void A03() {
        this.A0B.AHx(this.A0I, 10);
        this.A0I.A0f(6);
        A0A(this.A0B, 0L, 10, this.A0I.A0H() + 10);
    }

    private void A04() {
        this.A0E = false;
        A06();
    }

    private void A05() {
        this.A06 = 1;
        this.A00 = 0;
    }

    private void A06() {
        this.A06 = 0;
        this.A00 = 0;
        this.A04 = 256;
    }

    private void A07() {
        this.A06 = 3;
        this.A00 = 0;
    }

    private void A08() {
        this.A06 = 2;
        this.A00 = A0N.length;
        this.A05 = 0;
        this.A0I.A0f(0);
    }

    private void A0A(InterfaceC1157Uo interfaceC1157Uo, long j10, int i10, int i11) {
        this.A06 = 4;
        this.A00 = i10;
        this.A0A = interfaceC1157Uo;
        this.A07 = j10;
        this.A05 = i11;
    }

    private void A0B(C1648fq c1648fq) {
        if (c1648fq.A07() == 0) {
            return;
        }
        this.A0H.A00[0] = c1648fq.A0l()[c1648fq.A09()];
        this.A0H.A08(2);
        C1647fp c1647fp = this.A0H;
        String[] strArr = A0M;
        if (strArr[3].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A0M[0] = "djrYXpfVknLXuHAogeqJgfRkoFAOrgQm";
        int A04 = c1647fp.A04(4);
        if (this.A02 != -1) {
            int currentFrameSampleRateIndex = this.A02;
            if (A04 != currentFrameSampleRateIndex) {
                A04();
                return;
            }
        }
        if (!this.A0E) {
            this.A0E = true;
            int currentFrameSampleRateIndex2 = this.A01;
            this.A03 = currentFrameSampleRateIndex2;
            this.A02 = A04;
        }
        A07();
    }

    private void A0C(C1648fq c1648fq) {
        byte[] A0l = c1648fq.A0l();
        int position = c1648fq.A09();
        int A0A = c1648fq.A0A();
        while (position < A0A) {
            int endOffset = position + 1;
            int i10 = A0l[position] & 255;
            if (this.A04 == 512 && A0E((byte) -1, (byte) i10) && (this.A0E || A0G(c1648fq, endOffset - 2))) {
                this.A01 = (i10 & 8) >> 3;
                this.A0F = (i10 & 1) == 0;
                if (!this.A0E) {
                    A05();
                } else {
                    A07();
                }
                c1648fq.A0f(endOffset);
                return;
            }
            switch (this.A04 | i10) {
                case 329:
                    this.A04 = 768;
                    break;
                case 511:
                    this.A04 = AdRequest.MAX_CONTENT_URL_LENGTH;
                    break;
                case 836:
                    this.A04 = 1024;
                    break;
                case 1075:
                    A08();
                    c1648fq.A0f(endOffset);
                    return;
                default:
                    int data = this.A04;
                    if (data == 256) {
                        break;
                    } else {
                        this.A04 = 256;
                        position = endOffset - 1;
                        String[] strArr = A0M;
                        String str = strArr[3];
                        String str2 = strArr[7];
                        int data2 = str.length();
                        if (data2 != str2.length()) {
                            throw new RuntimeException();
                        }
                        A0M[0] = "CfCYX08BdNDExPjuNdm6ybPhxGdeRMhi";
                        continue;
                    }
            }
            position = endOffset;
        }
        c1648fq.A0f(position);
    }

    @RequiresNonNull({"currentOutput"})
    private void A0D(C1648fq c1648fq) {
        int min = Math.min(c1648fq.A07(), this.A05 - this.A00);
        this.A0A.AHx(c1648fq, min);
        int bytesToRead = this.A00;
        this.A00 = bytesToRead + min;
        int i10 = this.A00;
        int bytesToRead2 = this.A05;
        if (i10 == bytesToRead2) {
            int i11 = (this.A09 > (-9223372036854775807L) ? 1 : (this.A09 == (-9223372036854775807L) ? 0 : -1));
            String[] strArr = A0M;
            String str = strArr[6];
            String str2 = strArr[1];
            int length = str.length();
            int bytesToRead3 = str2.length();
            if (length != bytesToRead3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[3] = "LJn2r9bqemQMEbjfQIf";
            strArr2[7] = "oliRQGFBbE2SzPxHJ61";
            if (i11 != 0) {
                this.A0A.AI0(this.A09, 1, this.A05, 0, null);
                this.A09 += this.A07;
            }
            A06();
        }
    }

    private boolean A0E(byte b10, byte b11) {
        return A0F(((b10 & 255) << 8) | (b11 & 255));
    }

    public static boolean A0F(int i10) {
        return (65526 & i10) == 65520;
    }

    private boolean A0G(C1648fq c1648fq, int i10) {
        c1648fq.A0f(i10 + 1);
        if (A0I(c1648fq, this.A0H.A00, 1)) {
            C1647fp c1647fp = this.A0H;
            if (A0M[4].length() != 16) {
                throw new RuntimeException();
            }
            String[] strArr = A0M;
            strArr[3] = "MQwF78Hrvcco9cZBh5N";
            strArr[7] = "W0MJxnopUzunHbA491r";
            c1647fp.A08(4);
            int A04 = this.A0H.A04(1);
            if (this.A03 == -1 || A04 == this.A03) {
                if (this.A02 != -1) {
                    if (!A0I(c1648fq, this.A0H.A00, 1)) {
                        return true;
                    }
                    this.A0H.A08(2);
                    if (this.A0H.A04(4) != this.A02) {
                        return false;
                    }
                    c1648fq.A0f(i10 + 2);
                }
                if (A0I(c1648fq, this.A0H.A00, 4)) {
                    this.A0H.A08(14);
                    int A042 = this.A0H.A04(13);
                    if (A042 < 7) {
                        return false;
                    }
                    byte[] A0l = c1648fq.A0l();
                    int A0A = c1648fq.A0A();
                    int i11 = i10 + A042;
                    if (i11 >= A0A) {
                        return true;
                    }
                    if (A0l[i11] == -1) {
                        if (i11 + 1 == A0A) {
                            return true;
                        }
                        if (A0E((byte) -1, A0l[i11 + 1])) {
                            int currentFrameVersion = i11 + 1;
                            if (((A0l[currentFrameVersion] & 8) >> 3) == A04) {
                                return true;
                            }
                        }
                        return false;
                    } else if (A0l[i11] != 73) {
                        return false;
                    } else {
                        int currentFrameVersion2 = i11 + 1;
                        if (currentFrameVersion2 == A0A) {
                            return true;
                        }
                        int currentFrameVersion3 = i11 + 1;
                        int dataLimit = A0l[currentFrameVersion3];
                        String[] strArr2 = A0M;
                        String str = strArr2[5];
                        String str2 = strArr2[2];
                        int length = str.length();
                        int currentFrameVersion4 = str2.length();
                        if (length != currentFrameVersion4) {
                            A0M[4] = "MzNwmvMWHM9YxxhN";
                            if (dataLimit != 68) {
                                return false;
                            }
                            int currentFrameVersion5 = i11 + 2;
                            if (currentFrameVersion5 == A0A) {
                                return true;
                            }
                            int i12 = i11 + 2;
                            String[] strArr3 = A0M;
                            String str3 = strArr3[3];
                            String str4 = strArr3[7];
                            int length2 = str3.length();
                            int currentFrameVersion6 = str4.length();
                            if (length2 != currentFrameVersion6) {
                                throw new RuntimeException();
                            }
                            String[] strArr4 = A0M;
                            strArr4[3] = "kA8IewY3jlpHmumMKHk";
                            strArr4[7] = "UZDK62AaDJaRgty09WY";
                            return A0l[i12] == 51;
                        }
                        throw new RuntimeException();
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean A0H(C1648fq c1648fq, byte[] bArr, int i10) {
        int min = Math.min(c1648fq.A07(), i10 - this.A00);
        int bytesToRead = this.A00;
        c1648fq.A0k(bArr, bytesToRead, min);
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + min;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i10;
    }

    private boolean A0I(C1648fq c1648fq, byte[] bArr, int i10) {
        if (c1648fq.A07() < i10) {
            return false;
        }
        c1648fq.A0k(bArr, 0, i10);
        return true;
    }

    public final long A0J() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void A50(C1648fq c1648fq) throws Q6 {
        A01();
        while (c1648fq.A07() > 0) {
            switch (this.A06) {
                case 0:
                    A0C(c1648fq);
                    break;
                case 1:
                    A0B(c1648fq);
                    break;
                case 2:
                    if (!A0H(c1648fq, this.A0I.A0l(), 10)) {
                        break;
                    } else {
                        A03();
                        break;
                    }
                case 3:
                    int i10 = this.A0F ? 7 : 5;
                    C1647fp c1647fp = this.A0H;
                    String[] strArr = A0M;
                    String str = strArr[3];
                    String str2 = strArr[7];
                    int length = str.length();
                    int targetLength = str2.length();
                    if (length == targetLength) {
                        String[] strArr2 = A0M;
                        strArr2[6] = "AzgWWNtnPWgOYmgz36m3yxJg3sI";
                        strArr2[1] = "rzuPsJA2ShxfzBzYoluko6JIhOL";
                        if (!A0H(c1648fq, c1647fp.A00, i10)) {
                            break;
                        } else {
                            A02();
                            break;
                        }
                    } else {
                        throw new RuntimeException();
                    }
                case 4:
                    A0D(c1648fq);
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void A5S(UL ul, YS ys) {
        ys.A05();
        this.A0D = ys.A04();
        this.A0C = ul.AJX(ys.A03(), 1);
        this.A0A = this.A0C;
        if (this.A0K) {
            ys.A05();
            this.A0B = ul.AJX(ys.A03(), 5);
            this.A0B.A6U(new P5().A0y(ys.A04()).A11(A00(60, 15, 25)).A14());
            return;
        }
        this.A0B = new WN();
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void AFx() {
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void AFy(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.A09 = j10;
        }
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void AIB() {
        this.A09 = -9223372036854775807L;
        A04();
    }
}

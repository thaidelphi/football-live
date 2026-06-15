package com.google.android.exoplayer2.extractor.mkv;

import android.net.Uri;
import android.util.SparseArray;
import com.facebook.ads.redexgen.X.AbstractC1149Ud;
import com.facebook.ads.redexgen.X.AbstractC1589es;
import com.facebook.ads.redexgen.X.AbstractC1633fb;
import com.facebook.ads.redexgen.X.AbstractC1672gE;
import com.facebook.ads.redexgen.X.C1139Ts;
import com.facebook.ads.redexgen.X.C1143Tw;
import com.facebook.ads.redexgen.X.C1152Ug;
import com.facebook.ads.redexgen.X.C1191Vy;
import com.facebook.ads.redexgen.X.C1192Vz;
import com.facebook.ads.redexgen.X.C1634fc;
import com.facebook.ads.redexgen.X.C1648fq;
import com.facebook.ads.redexgen.X.InterfaceC1157Uo;
import com.facebook.ads.redexgen.X.InterfaceC1189Vw;
import com.facebook.ads.redexgen.X.Q6;
import com.facebook.ads.redexgen.X.UK;
import com.facebook.ads.redexgen.X.UL;
import com.facebook.ads.redexgen.X.UO;
import com.facebook.ads.redexgen.X.Uj;
import com.facebook.ads.redexgen.X.W0;
import com.facebook.ads.redexgen.X.W1;
import com.facebook.ads.redexgen.X.WJ;
import com.facebook.ads.redexgen.X.WY;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.ColorInfo;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlayAdError;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class MatroskaExtractor implements UK {
    public static byte[] A0t;
    public static String[] A0u = {"hvJsNyYp3v3a4C8A8LwOC4mgkuvCVXoh", "3ANqqpKHoM9q2pU5yvcC4TIXXl4OB4", "W4fcrFg9mIAIMJnn3ruN8Pp1p", "kBvi78HnY0B5pFf5ZLsioHHyWxztsmRs", "nMOCvaqUX6ANdIUM2nc6uVaFYW8fhdLw", "NaaBlhh1gleR9PSnSSlJga6sCsJWQtGN", "vbtih1VRjprWkk0rxsNMjhqVp2JrwXtO", ""};
    public static final UO A0v;
    public static final Map<String, Integer> A0w;
    public static final UUID A0x;
    public static final byte[] A0y;
    public static final byte[] A0z;
    public static final byte[] A10;
    public static final byte[] A11;
    public byte A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public long A0N;
    public long A0O;
    @MetaExoPlayerCustomization("Removed the final from the member variable")
    public SparseArray<C1192Vz> A0P;
    public UL A0Q;
    public C1192Vz A0R;
    public C1634fc A0S;
    public C1634fc A0T;
    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "AR/VC customizations")
    public String A0U;
    public ByteBuffer A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public int[] A0f;
    public final InterfaceC1189Vw A0g;
    public final W1 A0h;
    public final C1648fq A0i;
    public final C1648fq A0j;
    public final C1648fq A0k;
    public final C1648fq A0l;
    public final C1648fq A0m;
    public final C1648fq A0n;
    public final C1648fq A0o;
    public final C1648fq A0p;
    public final C1648fq A0q;
    public final C1648fq A0r;
    public final boolean A0s;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @RequiresNonNull({"#2.output"})
    private int A02(WJ wj, C1192Vz c1192Vz, int i10, boolean z10) throws IOException {
        boolean A0B;
        int i11;
        int i12;
        if (A06(1012, 11, 79).equals(c1192Vz.A0d)) {
            A0F(wj, A10, i10);
            return A00();
        }
        boolean equals = A06(1002, 10, 36).equals(c1192Vz.A0d);
        String[] strArr = A0u;
        if (strArr[1].length() != strArr[7].length()) {
            String[] strArr2 = A0u;
            strArr2[1] = "VeNawnzVnUoeQbv5dbPntIzy1QeUIs";
            strArr2[7] = "";
            if (equals) {
                A0F(wj, A0z, i10);
                String[] strArr3 = A0u;
                if (strArr3[1].length() != strArr3[7].length()) {
                    String[] strArr4 = A0u;
                    strArr4[3] = "xvOGB0nkBw8ypQOxOB86OzNoUEqCHeQo";
                    strArr4[5] = "9ya9RNQvGPORZirlZGnzoNeBDQHCmHaH";
                    return A00();
                }
                throw new RuntimeException();
            } else if (A06(1023, 13, 34).equals(c1192Vz.A0d)) {
                A0F(wj, A11, i10);
                return A00();
            } else {
                InterfaceC1157Uo interfaceC1157Uo = c1192Vz.A0b;
                if (!this.A0Y) {
                    if (c1192Vz.A0i) {
                        this.A02 &= -1073741825;
                        if (!this.A0b) {
                            wj.readFully(this.A0n.A0l(), 0, 1);
                            this.A08++;
                            if ((this.A0n.A0l()[0] & 128) == 128) {
                                throw Q6.A01(A06(694, 35, 18), null);
                            }
                            this.A00 = this.A0n.A0l()[0];
                            this.A0b = true;
                        }
                        if ((this.A00 & 1) == 1) {
                            boolean z11 = (this.A00 & 2) == 2;
                            this.A02 |= 1073741824;
                            if (!this.A0Z) {
                                wj.readFully(this.A0i.A0l(), 0, 8);
                                this.A08 += 8;
                                this.A0Z = true;
                                this.A0n.A0l()[0] = (byte) ((z11 ? 128 : 0) | 8);
                                this.A0n.A0f(0);
                                interfaceC1157Uo.AHy(this.A0n, 1, 1);
                                this.A09++;
                                this.A0i.A0f(0);
                                interfaceC1157Uo.AHy(this.A0i, 8, 1);
                                this.A09 += 8;
                            }
                            if (z11) {
                                if (!this.A0a) {
                                    wj.readFully(this.A0n.A0l(), 0, 1);
                                    this.A08++;
                                    this.A0n.A0f(0);
                                    this.A0B = this.A0n.A0I();
                                    this.A0a = true;
                                }
                                int i13 = this.A0B * 4;
                                this.A0n.A0d(i13);
                                wj.readFully(this.A0n.A0l(), 0, i13);
                                this.A08 += i13;
                                short s10 = (short) ((this.A0B / 2) + 1);
                                int i14 = (s10 * 6) + 2;
                                if (this.A0V == null || this.A0V.capacity() < i14) {
                                    this.A0V = ByteBuffer.allocate(i14);
                                }
                                this.A0V.position(0);
                                String[] strArr5 = A0u;
                                if (strArr5[3].charAt(31) != strArr5[5].charAt(31)) {
                                    String[] strArr6 = A0u;
                                    strArr6[3] = "XsyONaQoXb0KRGR9GBMCqS74AjhcnCna";
                                    strArr6[5] = "Km2zYEf5FuXm3vuJIjLoXkc44n6BHKFj";
                                    this.A0V.putShort(s10);
                                    i11 = 0;
                                    i12 = 0;
                                } else {
                                    A0u[6] = "1a1cgBQUUVYd773oCiMoc5ncpb4sV2rG";
                                    this.A0V.putShort(s10);
                                    i11 = 0;
                                    i12 = 0;
                                }
                                while (i12 < this.A0B) {
                                    int i15 = i11;
                                    i11 = this.A0n.A0L();
                                    if (i12 % 2 == 0) {
                                        this.A0V.putShort((short) (i11 - i15));
                                    } else {
                                        this.A0V.putInt(i11 - i15);
                                    }
                                    i12++;
                                }
                                int i16 = (i10 - this.A08) - i11;
                                if (this.A0B % 2 == 1) {
                                    this.A0V.putInt(i16);
                                } else {
                                    this.A0V.putShort((short) i16);
                                    this.A0V.putInt(0);
                                }
                                C1648fq c1648fq = this.A0j;
                                byte[] array = this.A0V.array();
                                String[] strArr7 = A0u;
                                if (strArr7[1].length() != strArr7[7].length()) {
                                    String[] strArr8 = A0u;
                                    strArr8[3] = "OVXM98q5Whv6Ovenvj8Rl8RTqDNSVL0c";
                                    strArr8[5] = "Pcui2Gkgol7vWOk20ujxNfcUqWQWrCa7";
                                    c1648fq.A0j(array, i14);
                                    interfaceC1157Uo.AHy(this.A0j, i14, 1);
                                    this.A09 += i14;
                                } else {
                                    String[] strArr9 = A0u;
                                    strArr9[4] = "w5EeB6QB3VoUfhBDA6Ca0eRezxaYRFVP";
                                    strArr9[0] = "3JNEEZKOGCdM5xkGIjn8mvQrr3ZCFSrs";
                                    c1648fq.A0j(array, i14);
                                    interfaceC1157Uo.AHy(this.A0j, i14, 0);
                                    this.A09 += i14;
                                }
                            }
                        }
                    } else if (c1192Vz.A0m != null) {
                        this.A0m.A0j(c1192Vz.A0m, c1192Vz.A0m.length);
                    }
                    A0B = c1192Vz.A0B(z10);
                    if (A0B) {
                        this.A02 |= 268435456;
                        this.A0q.A0d(0);
                        int A0A = (this.A0m.A0A() + i10) - this.A08;
                        this.A0n.A0d(4);
                        this.A0n.A0l()[0] = (byte) ((A0A >> 24) & 255);
                        this.A0n.A0l()[1] = (byte) ((A0A >> 16) & 255);
                        this.A0n.A0l()[2] = (byte) ((A0A >> 8) & 255);
                        this.A0n.A0l()[3] = (byte) (A0A & 255);
                        interfaceC1157Uo.AHy(this.A0n, 4, 2);
                        this.A09 += 4;
                    }
                    this.A0Y = true;
                }
                int A0A2 = i10 + this.A0m.A0A();
                if (A06(IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE, 15, 19).equals(c1192Vz.A0d) || A06(1236, 16, 87).equals(c1192Vz.A0d)) {
                    byte[] A0l = this.A0k.A0l();
                    A0l[0] = 0;
                    A0l[1] = 0;
                    A0l[2] = 0;
                    int i17 = c1192Vz.A0Q;
                    int i18 = 4 - c1192Vz.A0Q;
                    while (this.A08 < A0A2) {
                        if (this.A0A == 0) {
                            A0G(wj, A0l, i18, i17);
                            this.A08 += i17;
                            this.A0k.A0f(0);
                            this.A0A = this.A0k.A0L();
                            this.A0l.A0f(0);
                            interfaceC1157Uo.AHx(this.A0l, 4);
                            this.A09 += 4;
                        } else {
                            int A01 = A01(wj, interfaceC1157Uo, this.A0A);
                            this.A08 += A01;
                            this.A09 += A01;
                            this.A0A -= A01;
                        }
                    }
                } else {
                    if (c1192Vz.A0c != null) {
                        AbstractC1589es.A08(this.A0m.A0A() == 0);
                        c1192Vz.A0c.A03(wj);
                    }
                    while (this.A08 < A0A2) {
                        int A012 = A01(wj, interfaceC1157Uo, A0A2 - this.A08);
                        this.A08 += A012;
                        this.A09 += A012;
                    }
                }
                if (A06(271, 8, 29).equals(c1192Vz.A0d)) {
                    this.A0r.A0f(0);
                    interfaceC1157Uo.AHx(this.A0r, 4);
                    this.A09 += 4;
                }
                return A00();
            }
        }
        throw new RuntimeException();
    }

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0t, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0t = new byte[]{Byte.MAX_VALUE, 50, 42, 44, 43, Byte.MAX_VALUE, 61, 58, Byte.MAX_VALUE, 54, 49, Byte.MAX_VALUE, 62, Byte.MAX_VALUE, 28, 42, 58, 44, 98, 47, 55, 49, 54, 98, 32, 39, 98, 43, 44, 98, 35, 98, 22, 48, 35, 33, 41, 7, 44, 54, 48, 59, 0, 78, 79, 84, 0, 83, 85, 80, 80, 79, 82, 84, 69, 68, 29, 8, 9, 92, 2, 29, 8, 10, 92, 2, 29, 8, 10, 92, 2, 29, 8, 10, 92, 38, 51, 49, 103, 57, 38, 51, 49, 103, 57, 38, 51, 49, 103, 47, 38, 51, 48, 103, 42, 63, 61, 107, 53, 42, 63, 61, 107, 53, 42, 63, 61, 107, 33, 42, 63, 60, 107, 101, 97, 119, 119, 65, 80, 80, 77, 74, 67, 87, 103, 77, 84, 76, 65, 86, 105, 75, 64, 65, 4, 61, 35, 61, 61, 63, 64, 94, 64, 66, 50, 27, 5, 30, 14, 9, 31, 1, 26, 10, 13, 113, 27, 6, 14, 12, 27, 13, 13, 81, 79, 84, 68, 67, 63, 92, 95, 67, 67, 92, 85, 67, 67, 36, 58, 32, 36, 38, 86, 76, 82, 75, 65, 76, 78, 58, 36, 54, 43, 62, 60, 84, 55, 73, 28, 2, 16, 13, 24, 26, 114, 17, 110, 73, 87, 69, 91, 39, 73, 75, 69, 118, 104, 120, 103, 98, 100, 96, 126, 113, 98, 108, 14, 103, 109, 110, 96, 117, 14, 104, 100, 100, 100, 69, 91, 84, 71, 73, 43, 77, 74, 80, 43, 70, 77, 67, 73, 87, 88, 75, 69, 39, 65, 70, 92, 39, 68, 65, 92, 5, 27, 16, 22, 17, 1, 12, 0, 103, 121, 112, 105, 116, 100, 111, 117, 44, 14, 1, 72, 27, 79, 28, 12, 14, 3, 10, 79, 27, 6, 2, 10, 12, 0, 11, 10, 79, 31, 29, 6, 0, 29, 79, 27, 0, 79, 27, 6, 2, 10, 12, 0, 11, 10, 60, 12, 14, 3, 10, 79, 13, 10, 6, 1, 8, 79, 28, 10, 27, 65, 9, 37, 46, 47, 41, 3, 46, 106, 35, 57, 106, 39, 35, 57, 57, 35, 36, 45, 106, 35, 36, 106, 30, 56, 43, 41, 33, 15, 36, 62, 56, 51, 106, 47, 38, 47, 39, 47, 36, 62, 46, 2, 0, 15, 4, 3, 4, 3, 10, 77, 8, 3, 14, 31, 20, 29, 25, 4, 2, 3, 77, 12, 3, 9, 77, 14, 2, 0, 29, 31, 8, 30, 30, 4, 2, 3, 77, 4, 30, 77, 3, 2, 25, 77, 30, 24, 29, 29, 2, 31, 25, 8, 9, 96, 76, 77, 87, 70, 77, 87, 96, 76, 78, 83, 98, 79, 68, 76, 3, 116, 88, 89, 67, 82, 89, 67, 114, 89, 84, 118, 91, 80, 88, 23, 65, 109, 108, 118, 103, 108, 118, 71, 108, 97, 109, 102, 107, 108, 101, 77, 112, 102, 103, 112, 34, 92, 112, 113, 107, 122, 113, 107, 90, 113, 124, 112, 123, 118, 113, 120, 76, 124, 112, 111, 122, 63, 11, 38, 60, 44, 46, 61, 43, 38, 33, 40, 111, 35, 46, 60, 59, 111, 44, 58, 42, 111, 63, 32, 38, 33, 59, 111, 56, 38, 59, 39, 111, 58, 33, 42, 55, 63, 42, 44, 59, 42, 43, 111, 43, 58, 61, 46, 59, 38, 32, 33, 117, 111, 33, 10, 6, 49, 28, 21, 0, 69, 94, 117, 121, 78, 99, 106, Byte.MAX_VALUE, 72, Byte.MAX_VALUE, 123, 126, 76, Byte.MAX_VALUE, 104, 105, 115, 117, 116, 58, 56, 63, 48, 49, 93, 17, 28, 30, 20, 19, 26, 93, 14, 28, 16, 13, 17, 24, 93, 14, 20, 7, 24, 93, 18, 8, 9, 93, 18, 27, 93, 15, 28, 19, 26, 24, 83, 116, 115, 124, 125, 99, 84, 80, 85, 103, 84, 67, 66, 88, 94, 95, 17, 105, 64, 73, 65, 73, 66, 88, 12, 89, 114, Byte.MAX_VALUE, 110, 101, 108, 104, 121, 120, 60, 72, 110, 125, Byte.MAX_VALUE, 119, 60, 122, 115, 105, 114, 120, 60, 126, 105, 104, 60, 95, 115, 114, 104, 121, 114, 104, 89, 114, Byte.MAX_VALUE, 87, 121, 101, 85, 88, 60, 107, 125, 111, 60, 114, 115, 104, 60, 122, 115, 105, 114, 120, 108, 81, 93, 76, 71, 90, 64, 70, 71, 9, 75, 64, 93, 9, 64, 90, 9, 90, 76, 93, 9, 64, 71, 9, 90, 64, 78, 71, 72, 69, 9, 75, 80, 93, 76, 99, 74, 87, 72, 68, 81, 31, 5, 118, 81, 68, 87, 81, 9, 5, 96, 75, 65, 9, 5, 119, 64, 68, 65, 106, 87, 65, 64, 87, 9, 5, 105, 68, 92, 64, 87, 9, 5, 118, 81, 92, 73, 64, 9, 5, 107, 68, 72, 64, 9, 5, 104, 68, 87, 66, 76, 75, 105, 9, 5, 104, 68, 87, 66, 76, 75, 119, 9, 5, 104, 68, 87, 66, 76, 75, 115, 9, 5, 96, 67, 67, 64, 70, 81, 9, 5, 113, 64, 93, 81, 96, 76, 67, 73, 76, 89, 66, 95, 84, 13, 72, 65, 72, 64, 72, 67, 89, 13, 126, 72, 72, 70, 100, 105, 13, 66, 95, 13, 126, 72, 72, 70, 125, 66, 94, 68, 89, 68, 66, 67, 13, 67, 66, 89, 13, 75, 66, 88, 67, 73, 116, 88, 77, 75, 86, 74, 82, 88, 124, 65, 77, 75, 88, 90, 77, 86, 75, 7, 63, 38, 62, 35, 58, 38, 47, 106, 25, 47, 45, 39, 47, 36, 62, 106, 47, 38, 47, 39, 47, 36, 62, 57, 106, 36, 37, 62, 106, 57, 63, 58, 58, 37, 56, 62, 47, 46, 19, 50, 125, 43, 60, 49, 52, 57, 125, 41, 47, 60, 62, 54, 46, 125, 42, 56, 47, 56, 125, 59, 50, 40, 51, 57, 115, 82, 29, 75, 92, 81, 84, 89, 29, 75, 92, 79, 84, 83, 73, 29, 81, 88, 83, 90, 73, 85, 29, 80, 92, 78, 86, 29, 91, 82, 72, 83, 89, 16, 28, 7, 21, 1, 16, 22, 1, 55, 59, 44, 32, 41, 50, 75, 52, 
        35, 55, 76, 64, 75, 90, 71, 75, 48, 94, 76, 76, 39, 43, 32, 49, 44, 32, 91, 33, 32, 50, 76, 74, 70, 77, 92, 65, 77, 54, 78, 92, 91, 79, 77, 77, 8, 4, 13, 20, 25, 8, 14, 25, 79, 119, 117, 108, 108, 117, 114, 123, 60, 111, 105, 126, 104, 117, 104, 112, 121, 60, 111, 125, 113, 108, 112, 121, 60, 117, 114, 60, 112, 125, Byte.MAX_VALUE, 121, 120, 60, 126, 112, 115, Byte.MAX_VALUE, 119, 50, 1, 57, 59, 34, 34, 59, 60, 53, 114, 33, 39, 48, 38, 59, 38, 62, 55, 114, 33, 51, 63, 34, 62, 55, 114, 37, 59, 38, 58, 114, 60, 61, 114, 54, 39, 32, 51, 38, 59, 61, 60, 124, 69, 126, 117, 104, 96, 117, 115, 100, 117, 116, 48, 121, 116, 42, 48, 73, 114, 121, 100, 108, 121, Byte.MAX_VALUE, 104, 121, 120, 60, 112, 125, Byte.MAX_VALUE, 117, 114, 123, 60, 106, 125, 112, 105, 121, 38, 60, 56, 49, 47, 56, 95, 87, 94, 76, 81, 68, 70, 51, 70, 79, 93, 64, 85, 87, 36, 63, 89, 67, 95, 63, 81, 64, 20, 29, 15, 18, 7, 5, 118, 109, 11, 17, 13, 109, 3, 17, 18, 126, 119, 101, 120, 109, 111, 28, 7, 97, 123, 103, 7, 105, 126, 107, 91, 82, 64, 93, 72, 74, 57, 34, 68, 94, 66, 34, 94, 93, 58, 51, 33, 60, 41, 43, 36, 67, 37, 63, 35, 67, 36, 41, 58, 47, 17, 24, 10, 20, 104, 17, 1, 16, 104, 1, 8, 18, 21, 4, 4, 79, 70, 77, 81, 92, 86, 75, 88, 94, 87, 94, 88, 48, 110, 103, 110, 104, 1, 42, 54, 33, 29, 52, 43, 38, 39, 45, 29, 48, 45, 54, 3, 111, 114, 114, 114, 80, 76, 91, 103, 78, 81, 92, 93, 87, 103, 74, 87, 76, 121, 21, 8, 1, 8, 119, 107, 124, 64, 105, 118, 123, 122, 112, 64, 109, 112, 107, 94, 50, 46, 39, 47, 23, 11, 28, 32, 9, 22, 27, 26, 16, 32, 13, 16, 11, 62, 82, 77, 72, 79, 26, 22, 3, 5, 24, 4, 28, 22, 69, 90, 87, 86, 92, 28, 68, 86, 81, 94, 6, 20, 19, 28};
    }

    static {
        A0B();
        A0v = new UO() { // from class: com.facebook.ads.redexgen.X.Tu
            @Override // com.facebook.ads.redexgen.X.UO
            public final UK[] A5D() {
                return MatroskaExtractor.A0Q();
            }

            @Override // com.facebook.ads.redexgen.X.UO
            public final /* synthetic */ UK[] A5E(Uri uri, Map map) {
                return UN.A01(this, uri, map);
            }
        };
        A10 = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        A0y = AbstractC1672gE.A1G(A06(729, 90, 30));
        A0z = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        A11 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        A0x = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        hashMap.put(A06(1285, 18, 121), 0);
        hashMap.put(A06(IronSourceConstants.RV_AD_UNIT_CAPPED, 18, 3), 90);
        hashMap.put(A06(IronSourceConstants.RV_COLLECT_TOKENS_COMPLETED, 18, 36), 180);
        hashMap.put(A06(1339, 18, 68), 270);
        Map<String, Integer> trackNameToRotationDegrees = Collections.unmodifiableMap(hashMap);
        A0w = trackNameToRotationDegrees;
    }

    public MatroskaExtractor() {
        this(0);
    }

    public MatroskaExtractor(int i10) {
        this(new C1143Tw(), i10);
    }

    public MatroskaExtractor(InterfaceC1189Vw interfaceC1189Vw, int i10) {
        this.A0M = -1L;
        this.A0O = -9223372036854775807L;
        this.A0I = -9223372036854775807L;
        this.A0J = -9223372036854775807L;
        this.A0H = -1L;
        this.A0L = -1L;
        this.A0G = -9223372036854775807L;
        this.A0g = interfaceC1189Vw;
        this.A0g.AA1(new C1139Ts(this));
        this.A0s = (i10 & 1) == 0;
        this.A0h = new W1();
        this.A0P = new SparseArray<>();
        this.A0n = new C1648fq(4);
        this.A0r = new C1648fq(ByteBuffer.allocate(4).putInt(-1).array());
        this.A0o = new C1648fq(4);
        this.A0l = new C1648fq(AbstractC1149Ud.A03);
        this.A0k = new C1648fq(4);
        this.A0m = new C1648fq();
        this.A0p = new C1648fq();
        this.A0i = new C1648fq(8);
        this.A0j = new C1648fq();
        this.A0q = new C1648fq();
        this.A0f = new int[1];
    }

    private int A00() {
        int sampleSize = this.A09;
        A0A();
        return sampleSize;
    }

    private int A01(WJ wj, InterfaceC1157Uo interfaceC1157Uo, int i10) throws IOException {
        int strippedBytesLeft = this.A0m.A07();
        if (strippedBytesLeft > 0) {
            int bytesWritten = Math.min(i10, strippedBytesLeft);
            interfaceC1157Uo.AHx(this.A0m, bytesWritten);
            return bytesWritten;
        }
        String[] strArr = A0u;
        if (strArr[4].charAt(26) != strArr[0].charAt(26)) {
            String[] strArr2 = A0u;
            strArr2[1] = "0YdUuctU2QhpAt9U3DDz8MmnF4Qdx3";
            strArr2[7] = "";
            return interfaceC1157Uo.AHv(wj, i10, false);
        }
        throw new RuntimeException();
    }

    private long A03(long j10) throws Q6 {
        if (this.A0O != -9223372036854775807L) {
            return AbstractC1672gE.A0U(j10, this.A0O, 1000L);
        }
        throw Q6.A01(A06(279, 54, 84), null);
    }

    @MetaExoPlayerCustomization("Adding support AR/VR eventListener")
    private Uj A04(C1634fc c1634fc, C1634fc c1634fc2) {
        if (this.A0M == -1 || this.A0J == -9223372036854775807L || c1634fc == null || c1634fc.A02() == 0 || c1634fc2 == null || c1634fc2.A02() != c1634fc.A02()) {
            return new C1191Vy(this.A0J);
        }
        int A02 = c1634fc.A02();
        int[] iArr = new int[A02];
        long[] timesUs = new long[A02];
        String[] strArr = A0u;
        String str = strArr[1];
        String str2 = strArr[7];
        int length = str.length();
        int cuePointsSize = str2.length();
        if (length != cuePointsSize) {
            String[] strArr2 = A0u;
            strArr2[3] = "gVrzOIrGkpMKHCJql84VffjdelF7f3Qa";
            strArr2[5] = "ETJTZkcPi6sBc1BE7EkTzZvXvhAqJcHT";
            long[] jArr = new long[A02];
            long[] jArr2 = new long[A02];
            for (int i10 = 0; i10 < A02; i10++) {
                jArr2[i10] = c1634fc.A03(i10);
                timesUs[i10] = this.A0M + c1634fc2.A03(i10);
            }
            for (int i11 = 0; i11 < A02 - 1; i11++) {
                iArr[i11] = (int) (timesUs[i11 + 1] - timesUs[i11]);
                jArr[i11] = jArr2[i11 + 1] - jArr2[i11];
            }
            iArr[A02 - 1] = (int) ((this.A0M + this.A0N) - timesUs[A02 - 1]);
            jArr[A02 - 1] = this.A0J - jArr2[A02 - 1];
            long j10 = jArr[A02 - 1];
            if (j10 <= 0) {
                AbstractC1633fb.A07(A06(869, 17, 2), A06(499, 52, 116) + j10);
                iArr = Arrays.copyOf(iArr, iArr.length - 1);
                timesUs = Arrays.copyOf(timesUs, timesUs.length - 1);
                jArr = Arrays.copyOf(jArr, jArr.length - 1);
                jArr2 = Arrays.copyOf(jArr2, jArr2.length - 1);
            }
            return new WY(iArr, timesUs, jArr, jArr2);
        }
        throw new RuntimeException();
    }

    private final C1192Vz A05(int i10) throws Q6 {
        A0D(i10);
        return this.A0R;
    }

    @EnsuresNonNull({"extractorOutput"})
    private void A09() {
        AbstractC1589es.A02(this.A0Q);
    }

    private void A0A() {
        this.A08 = 0;
        this.A09 = 0;
        this.A0A = 0;
        this.A0Y = false;
        this.A0b = false;
        this.A0a = false;
        this.A0B = 0;
        this.A00 = (byte) 0;
        this.A0Z = false;
        this.A0m.A0d(0);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private void A0C(int i10) throws Q6 {
        if (this.A0T != null && this.A0S != null) {
            return;
        }
        throw Q6.A01(A06(LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, 8, 23) + i10 + A06(0, 18, 100), null);
    }

    @EnsuresNonNull({"currentTrack"})
    private void A0D(int i10) throws Q6 {
        if (this.A0R != null) {
            return;
        }
        throw Q6.A01(A06(LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, 8, 23) + i10 + A06(18, 24, 121), null);
    }

    private void A0E(WJ wj, int i10) throws IOException {
        if (this.A0n.A0A() >= i10) {
            return;
        }
        if (this.A0n.A08() < i10) {
            this.A0n.A0c(Math.max(this.A0n.A08() * 2, i10));
        }
        wj.readFully(this.A0n.A0l(), this.A0n.A0A(), i10 - this.A0n.A0A());
        this.A0n.A0e(i10);
    }

    private void A0F(WJ wj, byte[] bArr, int i10) throws IOException {
        int length = bArr.length + i10;
        int sizeWithPrefix = this.A0p.A08();
        if (sizeWithPrefix < length) {
            int sizeWithPrefix2 = length + i10;
            this.A0p.A0i(Arrays.copyOf(bArr, sizeWithPrefix2));
        } else {
            byte[] A0l = this.A0p.A0l();
            int sizeWithPrefix3 = bArr.length;
            System.arraycopy(bArr, 0, A0l, 0, sizeWithPrefix3);
        }
        byte[] A0l2 = this.A0p.A0l();
        int sizeWithPrefix4 = bArr.length;
        wj.readFully(A0l2, sizeWithPrefix4, i10);
        this.A0p.A0f(0);
        C1648fq c1648fq = this.A0p;
        String[] strArr = A0u;
        String str = strArr[3];
        String str2 = strArr[5];
        int charAt = str.charAt(31);
        int sizeWithPrefix5 = str2.charAt(31);
        if (charAt == sizeWithPrefix5) {
            throw new RuntimeException();
        }
        A0u[2] = "OLEoajv0A5hAFn";
        c1648fq.A0e(length);
    }

    private void A0G(WJ wj, byte[] bArr, int i10, int i11) throws IOException {
        int min = Math.min(i11, this.A0m.A07());
        int pendingStrippedBytes = i10 + min;
        wj.readFully(bArr, pendingStrippedBytes, i11 - min);
        if (min > 0) {
            this.A0m.A0k(bArr, i10, min);
        }
    }

    private final void A0H(C1192Vz c1192Vz, int i10, WJ wj, int i11) throws IOException {
        if (i10 == 4) {
            if (A06(1280, 5, 3).equals(c1192Vz.A0d)) {
                this.A0q.A0d(i11);
                wj.readFully(this.A0q.A0l(), 0, i11);
                return;
            }
        }
        wj.AJ9(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0051, code lost:
        if (A06(1023, 13, 34).equals(r17.A0d) != false) goto L24;
     */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0I(com.facebook.ads.redexgen.X.C1192Vz r17, long r18, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.A0I(com.facebook.ads.redexgen.X.Vz, long, int, int, int):void");
    }

    private final void A0J(C1192Vz c1192Vz, WJ wj, int i10) throws IOException {
        int i11;
        int i12;
        i11 = c1192Vz.A0n;
        if (i11 != 1685485123) {
            i12 = c1192Vz.A0n;
            if (i12 != 1685480259) {
                wj.AJ9(i10);
                return;
            }
        }
        c1192Vz.A0k = new byte[i10];
        wj.readFully(c1192Vz.A0k, 0, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void A0K(String str, long j10, byte[] bArr) {
        char c10;
        byte[] A0O;
        int i10;
        switch (str.hashCode()) {
            case 738597099:
                if (A0u[6].charAt(12) == 'Q') {
                    throw new RuntimeException();
                }
                A0u[2] = "Ms6DDOdJ87XoRGxXo";
                if (str.equals(A06(1002, 10, 36))) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 1045209816:
                if (str.equals(A06(1023, 13, 34))) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1422270023:
                if (str.equals(A06(1012, 11, 79))) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        String[] strArr = A0u;
        if (strArr[3].charAt(31) == strArr[5].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0u;
        strArr2[3] = "omptfwud1uZfxkRy7EoFVt5BBy6X4sdY";
        strArr2[5] = "9NnrcsgcwKRVNKlpkbx1c9FxUfNErco3";
        switch (c10) {
            case 0:
                A0O = A0O(j10, A06(75, 19, 56), 1000L);
                i10 = 19;
                break;
            case 1:
                A0O = A0O(j10, A06(56, 19, 3), 10000L);
                i10 = 21;
                break;
            case 2:
                A0O = A0O(j10, A06(94, 19, 52), 1000L);
                i10 = 25;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(A0O, 0, bArr, i10, A0O.length);
    }

    private boolean A0L(C1152Ug c1152Ug, long j10) {
        if (this.A0c) {
            this.A0L = j10;
            c1152Ug.A00 = this.A0H;
            this.A0c = false;
            return true;
        } else if (!this.A0e || this.A0L == -1) {
            return false;
        } else {
            c1152Ug.A00 = this.A0L;
            this.A0L = -1L;
            return true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean A0M(String str) {
        char c10;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals(A06(1178, 14, 43))) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -2095575984:
                if (str.equals(A06(1222, 14, 54))) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -1985379776:
                if (str.equals(A06(207, 8, 51))) {
                    c10 = 23;
                    break;
                }
                c10 = 65535;
                break;
            case -1784763192:
                if (str.equals(A06(263, 8, 127))) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case -1730367663:
                if (A0u[6].charAt(12) != 'Q') {
                    A0u[2] = "UUQNuwg2Mh";
                    if (str.equals(A06(271, 8, 29))) {
                        c10 = '\f';
                        break;
                    }
                    c10 = 65535;
                    break;
                } else {
                    throw new RuntimeException();
                }
            case -1482641358:
                if (str.equals(A06(189, 9, 64))) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case -1482641357:
                if (str.equals(A06(198, 9, 102))) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case -1373388978:
                if (str.equals(A06(1252, 15, 124))) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case -933872740:
                if (str.equals(A06(984, 8, 120))) {
                    c10 = ' ';
                    break;
                }
                c10 = 65535;
                break;
            case -538363189:
                if (str.equals(A06(1192, 15, 121))) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -538363109:
                if (str.equals(A06(IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE, 15, 19))) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -425012669:
                if (str.equals(A06(IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, 8, 96))) {
                    c10 = 30;
                    break;
                }
                c10 = 65535;
                break;
            case -356037306:
                if (str.equals(A06(163, 14, 43))) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            case 62923557:
                if (str.equals(A06(135, 5, 71))) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 62923603:
                if (str.equals(A06(IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, 5, 58))) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 62927045:
                if (str.equals(A06(145, 5, 97))) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 82318131:
                if (str.equals(A06(1166, 5, 85))) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 82338133:
                if (str.equals(A06(1275, 5, 51))) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 82338134:
                if (str.equals(A06(1280, 5, 3))) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 99146302:
                if (str.equals(A06(992, 10, 95))) {
                    c10 = 31;
                    break;
                }
                c10 = 65535;
                break;
            case 444813526:
                if (str.equals(A06(1267, 8, 34))) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 542569478:
                if (str.equals(A06(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 13, 101))) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case 635596514:
                if (str.equals(A06(221, 16, 26))) {
                    c10 = 26;
                    break;
                }
                c10 = 65535;
                break;
            case 725948237:
                if (str.equals(A06(237, 13, 63))) {
                    c10 = 25;
                    break;
                }
                c10 = 65535;
                break;
            case 725957860:
                if (str.equals(A06(IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, 13, 51))) {
                    c10 = 24;
                    break;
                }
                c10 = 65535;
                break;
            case 738597099:
                if (str.equals(A06(1002, 10, 36))) {
                    c10 = 28;
                    break;
                }
                c10 = 65535;
                break;
            case 855502857:
                if (str.equals(A06(1236, 16, 87))) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 1045209816:
                if (str.equals(A06(1023, 13, 34))) {
                    c10 = 29;
                    break;
                }
                c10 = 65535;
                break;
            case 1422270023:
                if (str.equals(A06(1012, 11, 79))) {
                    c10 = 27;
                    break;
                }
                c10 = 65535;
                break;
            case 1809237540:
                if (str.equals(A06(1171, 7, 58))) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1950749482:
                if (str.equals(A06(177, 6, 94))) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case 1950789798:
                if (str.equals(A06(183, 6, 54))) {
                    c10 = 22;
                    break;
                }
                c10 = 65535;
                break;
            case 1951062397:
                if (str.equals(A06(215, 6, 12))) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ' ':
                return true;
            default:
                return false;
        }
    }

    public static byte[] A0O(long j10, String str, long j11) {
        AbstractC1589es.A07(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - ((i10 * 3600) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - ((i11 * 60) * 1000000);
        int i12 = (int) (j13 / 1000000);
        int minutes = (int) ((j13 - (i12 * 1000000)) / j11);
        return AbstractC1672gE.A1G(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(minutes)));
    }

    public static int[] A0P(int[] iArr, int i10) {
        if (iArr == null) {
            int[] iArr2 = new int[i10];
            String[] strArr = A0u;
            if (strArr[3].charAt(31) != strArr[5].charAt(31)) {
                String[] strArr2 = A0u;
                strArr2[1] = "0ba4GojJLJm7uxnaPSAOLd77fYTidr";
                strArr2[7] = "";
                return iArr2;
            }
            throw new RuntimeException();
        } else if (iArr.length >= i10) {
            return iArr;
        } else {
            return new int[Math.max(iArr.length * 2, i10)];
        }
    }

    public static /* synthetic */ UK[] A0Q() {
        return new UK[]{new MatroskaExtractor()};
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "Adding support for AR/VR TAGs")
    public final int A0R(int i10) {
        switch (i10) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 26568:
            case 28032:
            case 29555:
            case 30113:
            case 30320:
            case 290298740:
            case 307544935:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            case 17543:
            case 17827:
                return 6;
            default:
                String[] strArr = A0u;
                if (strArr[1].length() != strArr[7].length()) {
                    String[] strArr2 = A0u;
                    strArr2[1] = "A2FH5DOh7IT2snIry1cKkBkzyzULmN";
                    strArr2[7] = "";
                    return 0;
                }
                throw new RuntimeException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x00db, code lost:
        if (r4 != (-1)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00e2, code lost:
        if (r14.A0C != 475249515) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x00e4, code lost:
        r14.A0H = r14.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x00f3, code lost:
        if (r4 != (-1)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:?, code lost:
        return;
     */
    /* JADX WARN: Incorrect condition in loop: B:166:0x0183 */
    /* JADX WARN: Incorrect condition in loop: B:170:0x0190 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0S(int r15) throws com.facebook.ads.redexgen.X.Q6 {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.A0S(int):void");
    }

    public final void A0T(int i10, double d10) throws Q6 {
        switch (i10) {
            case 181:
                A05(i10).A0T = (int) d10;
                return;
            case 17545:
                this.A0I = (long) d10;
                return;
            case 21969:
                A05(i10).A06 = (float) d10;
                return;
            case 21970:
                A05(i10).A07 = (float) d10;
                return;
            case 21971:
                A05(i10).A04 = (float) d10;
                return;
            case 21972:
                A05(i10).A05 = (float) d10;
                return;
            case 21973:
                A05(i10).A02 = (float) d10;
                return;
            case 21974:
                A05(i10).A03 = (float) d10;
                return;
            case 21975:
                C1192Vz A05 = A05(i10);
                float f10 = (float) d10;
                String[] strArr = A0u;
                if (strArr[4].charAt(26) != strArr[0].charAt(26)) {
                    A0u[6] = "GpGoD1bpW9Cr16bouccvZy2hl3WrTyfc";
                    A05.A0B = f10;
                    return;
                }
                throw new RuntimeException();
            case 21976:
                A05(i10).A0C = (float) d10;
                return;
            case 21977:
                A05(i10).A00 = (float) d10;
                return;
            case 21978:
                A05(i10).A01 = (float) d10;
                return;
            case 30323:
                A05(i10).A0A = (float) d10;
                return;
            case 30324:
                A05(i10).A08 = (float) d10;
                return;
            case 30325:
                A05(i10).A09 = (float) d10;
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:177:0x0186 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0U(int r19, int r20, com.facebook.ads.redexgen.X.WJ r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.A0U(int, int, com.facebook.ads.redexgen.X.WJ):void");
    }

    public final void A0V(int i10, long j10) throws Q6 {
        String A06 = A06(42, 14, 27);
        switch (i10) {
            case 131:
                A05(i10).A0V = (int) j10;
                return;
            case 136:
                A05(i10).A0f = j10 == 1;
                return;
            case 155:
                this.A0D = A03(j10);
                return;
            case 159:
                A05(i10).A0E = (int) j10;
                return;
            case 176:
                A05(i10).A0W = (int) j10;
                return;
            case 179:
                A0C(i10);
                this.A0T.A04(A03(j10));
                return;
            case 186:
                A05(i10).A0M = (int) j10;
                return;
            case 215:
                A05(i10).A0R = (int) j10;
                return;
            case 231:
                long A03 = A03(j10);
                String[] strArr = A0u;
                if (strArr[4].charAt(26) != strArr[0].charAt(26)) {
                    String[] strArr2 = A0u;
                    strArr2[1] = "N4wUezsqKMvSsh09xrDROdih0el4rf";
                    strArr2[7] = "";
                    this.A0G = A03;
                    return;
                }
                A0u[6] = "gZA18wlZqGkVKVcbkcwQH6O765N5iGrw";
                this.A0G = A03;
                return;
            case 238:
                this.A01 = (int) j10;
                return;
            case 241:
                boolean z10 = this.A0d;
                String[] strArr3 = A0u;
                if (strArr3[4].charAt(26) != strArr3[0].charAt(26)) {
                    String[] strArr4 = A0u;
                    strArr4[3] = "Io3F5GpcwGeLsvVnH4RNXQOeF3DOTVj0";
                    strArr4[5] = "reFWPNfDPDIen75T2OsnmI6Hn5ySsbxR";
                    if (z10) {
                        return;
                    }
                    A0C(i10);
                    this.A0S.A04(j10);
                    this.A0d = true;
                    return;
                }
                break;
            case 251:
                this.A0W = true;
                return;
            case 16871:
                A05(i10).A0n = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw Q6.A01(A06(426, 16, 24) + j10 + A06, null);
            case 17029:
                if (j10 >= 1 && j10 <= 2) {
                    return;
                }
                throw Q6.A01(A06(559, 19, 33) + j10 + A06, null);
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw Q6.A01(A06(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 16, 10) + j10 + A06, null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw Q6.A01(A06(442, 15, 12) + j10 + A06, null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw Q6.A01(A06(113, 22, 31) + j10 + A06, null);
            case 20529:
                if (j10 == 0) {
                    return;
                }
                throw Q6.A01(A06(457, 21, 57) + j10 + A06, null);
            case 20530:
                if (j10 != 1) {
                    throw Q6.A01(A06(478, 21, 36) + j10 + A06, null);
                }
                return;
            case 21420:
                this.A0K = this.A0M + j10;
                return;
            case 21432:
                int i11 = (int) j10;
                A0D(i10);
                switch (i11) {
                    case 0:
                        this.A0R.A0U = 0;
                        return;
                    case 1:
                        this.A0R.A0U = 2;
                        return;
                    case 3:
                        this.A0R.A0U = 1;
                        return;
                    case 15:
                        this.A0R.A0U = 3;
                        return;
                    default:
                        return;
                }
            case 21680:
                A05(i10).A0L = (int) j10;
                return;
            case 21682:
                A05(i10).A0K = (int) j10;
                return;
            case 21690:
                C1192Vz A05 = A05(i10);
                String[] strArr5 = A0u;
                if (strArr5[1].length() != strArr5[7].length()) {
                    String[] strArr6 = A0u;
                    strArr6[3] = "a4JWGbvcHBxEuqFTNJyjkKzLLBks8zxi";
                    strArr6[5] = "V653rOPNcZ8n6p2drhLFQbJ4jSAS100h";
                    A05.A0J = (int) j10;
                    return;
                }
                String[] strArr7 = A0u;
                strArr7[1] = "SFiKSoumrDWrN654gSJjTAdOE1goia";
                strArr7[7] = "";
                A05.A0J = (int) j10;
                return;
            case 21930:
                A05(i10).A0g = j10 == 1;
                return;
            case 21945:
                A0D(i10);
                switch ((int) j10) {
                    case 1:
                        this.A0R.A0F = 2;
                        return;
                    case 2:
                        this.A0R.A0F = 1;
                        return;
                    default:
                        return;
                }
            case 21946:
                A0D(i10);
                int A01 = ColorInfo.A01((int) j10);
                if (A01 == -1) {
                    return;
                }
                this.A0R.A0H = A01;
                return;
            case 21947:
                A0D(i10);
                this.A0R.A0h = true;
                int A00 = ColorInfo.A00((int) j10);
                if (A00 == -1) {
                    return;
                }
                this.A0R.A0G = A00;
                return;
            case 21948:
                A05(i10).A0O = (int) j10;
                return;
            case 21949:
                C1192Vz A052 = A05(i10);
                String[] strArr8 = A0u;
                if (strArr8[4].charAt(26) != strArr8[0].charAt(26)) {
                    String[] strArr9 = A0u;
                    strArr9[3] = "T0WP6ZFXgE6s8V8heT9wtEkD8f9NdjCM";
                    strArr9[5] = "7XePdUxt4aUcyCfjxSClX0QS1zLuSosx";
                    A052.A0P = (int) j10;
                    return;
                }
                throw new RuntimeException();
            case 21998:
                A05(i10).A0N = (int) j10;
                return;
            case 22186:
                A05(i10).A0X = j10;
                return;
            case 22203:
                A05(i10).A0Y = j10;
                return;
            case 25188:
                C1192Vz A053 = A05(i10);
                String[] strArr10 = A0u;
                if (strArr10[3].charAt(31) != strArr10[5].charAt(31)) {
                    String[] strArr11 = A0u;
                    strArr11[1] = "Cu1zz2XfEKQYvl96Y2e5xfLC0ajo7s";
                    strArr11[7] = "";
                    A053.A0D = (int) j10;
                    return;
                }
                break;
            case 30114:
                this.A0E = j10;
                return;
            case 30321:
                A0D(i10);
                switch ((int) j10) {
                    case 0:
                        this.A0R.A0S = 0;
                        return;
                    case 1:
                        this.A0R.A0S = 1;
                        return;
                    case 2:
                        this.A0R.A0S = 2;
                        return;
                    case 3:
                        this.A0R.A0S = 3;
                        return;
                    default:
                        return;
                }
            case 2352003:
                A05(i10).A0I = (int) j10;
                return;
            case 2807729:
                this.A0O = j10;
                return;
            default:
                return;
        }
        throw new RuntimeException();
    }

    public final void A0W(int i10, long j10, long j11) throws Q6 {
        A09();
        switch (i10) {
            case 160:
                this.A0W = false;
                this.A0E = 0L;
                return;
            case 174:
                this.A0R = new C1192Vz();
                return;
            case 187:
                this.A0d = false;
                return;
            case 19899:
                this.A0C = -1;
                this.A0K = -1L;
                return;
            case 20533:
                A05(i10).A0i = true;
                return;
            case 21968:
                A05(i10).A0h = true;
                return;
            case 25152:
            default:
                return;
            case 408125543:
                if (this.A0M == -1 || this.A0M == j10) {
                    this.A0M = j10;
                    this.A0N = j11;
                    return;
                }
                throw Q6.A01(A06(886, 39, 113), null);
            case 475249515:
                this.A0T = new C1634fc();
                this.A0S = new C1634fc();
                return;
            case 524531317:
                if (this.A0e) {
                    return;
                }
                if (this.A0s && this.A0H != -1) {
                    this.A0c = true;
                    return;
                }
                this.A0Q.AID(new C1191Vy(this.A0J));
                this.A0e = true;
                return;
        }
    }

    @MetaExoPlayerCustomization("Adding support for AR/VR TAGs")
    public final void A0X(int i10, String str) throws Q6 {
        switch (i10) {
            case 134:
                A05(i10).A0d = str;
                return;
            case 17026:
                String A06 = A06(1375, 4, 74);
                String[] strArr = A0u;
                if (strArr[3].charAt(31) == strArr[5].charAt(31)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0u;
                strArr2[1] = "ZpQtQwhf10lxVfkk9mMvWEAcwosY1p";
                strArr2[7] = "";
                if (A06.equals(str)) {
                    return;
                }
                String[] strArr3 = A0u;
                if (strArr3[3].charAt(31) == strArr3[5].charAt(31)) {
                    throw new RuntimeException();
                }
                A0u[2] = "ErKYIjeg";
                if (A06(1357, 8, 76).equals(str)) {
                    return;
                }
                throw Q6.A01(A06(551, 8, 94) + str + A06(42, 14, 27), null);
            case 17827:
                this.A0U = str;
                return;
            case 21358:
                A05(i10).A0e = str;
                return;
            case 2274716:
                A05(i10).A0o = str;
                return;
            default:
                return;
        }
    }

    public final boolean A0Y(int i10) {
        if (i10 != 357149030) {
            String[] strArr = A0u;
            if (strArr[1].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0u;
            strArr2[1] = "BSEqXCtR2L3q8w452lR0fLhAQtFc8c";
            strArr2[7] = "";
            if (i10 != 524531317 && i10 != 475249515 && i10 != 374648427) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AA0(UL ul) {
        this.A0Q = ul;
    }

    /* JADX WARN: Incorrect condition in loop: B:52:0x004d */
    @Override // com.facebook.ads.redexgen.X.UK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int AGT(com.facebook.ads.redexgen.X.WJ r7, com.facebook.ads.redexgen.X.C1152Ug r8) throws java.io.IOException {
        /*
            r6 = this;
            r3 = 0
            r6.A0X = r3
            r5 = 1
        L4:
            if (r5 == 0) goto L44
            boolean r4 = r6.A0X
            java.lang.String[] r2 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.A0u
            r0 = 3
            r1 = r2[r0]
            r0 = 5
            r2 = r2[r0]
            r0 = 31
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L3e
            java.lang.String[] r2 = com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.A0u
            java.lang.String r1 = "Z1NgeQgdiHJR50jbQsNezzrBQqlcsU"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = ""
            r0 = 7
            r2[r0] = r1
            if (r4 != 0) goto L44
            com.facebook.ads.redexgen.X.Vw r0 = r6.A0g
            boolean r5 = r0.AGW(r7)
            if (r5 == 0) goto L4
            long r0 = r7.A8d()
            boolean r0 = r6.A0L(r8, r0)
            if (r0 == 0) goto L4
            r0 = 1
            return r0
        L3e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L44:
            if (r5 != 0) goto L62
            r1 = 0
        L47:
            android.util.SparseArray<com.facebook.ads.redexgen.X.Vz> r0 = r6.A0P
            int r0 = r0.size()
            if (r1 >= r0) goto L60
            android.util.SparseArray<com.facebook.ads.redexgen.X.Vz> r0 = r6.A0P
            java.lang.Object r0 = r0.valueAt(r1)
            com.facebook.ads.redexgen.X.Vz r0 = (com.facebook.ads.redexgen.X.C1192Vz) r0
            com.facebook.ads.redexgen.X.C1192Vz.A08(r0)
            r0.A0E()
            int r1 = r1 + 1
            goto L47
        L60:
            r0 = -1
            return r0
        L62:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.AGT(com.facebook.ads.redexgen.X.WJ, com.facebook.ads.redexgen.X.Ug):int");
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AGj() {
    }

    /* JADX WARN: Incorrect condition in loop: B:12:0x001e */
    @Override // com.facebook.ads.redexgen.X.UK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AIC(long r3, long r5) {
        /*
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.A0G = r0
            r0 = 0
            r2.A05 = r0
            com.facebook.ads.redexgen.X.Vw r0 = r2.A0g
            r0.reset()
            com.facebook.ads.redexgen.X.W1 r0 = r2.A0h
            r0.A06()
            r2.A0A()
            r1 = 0
        L18:
            android.util.SparseArray<com.facebook.ads.redexgen.X.Vz> r0 = r2.A0P
            int r0 = r0.size()
            if (r1 >= r0) goto L2e
            android.util.SparseArray<com.facebook.ads.redexgen.X.Vz> r0 = r2.A0P
            java.lang.Object r0 = r0.valueAt(r1)
            com.facebook.ads.redexgen.X.Vz r0 = (com.facebook.ads.redexgen.X.C1192Vz) r0
            r0.A0F()
            int r1 = r1 + 1
            goto L18
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.AIC(long, long):void");
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final boolean AJB(WJ wj) throws IOException {
        return new W0().A01(wj);
    }
}

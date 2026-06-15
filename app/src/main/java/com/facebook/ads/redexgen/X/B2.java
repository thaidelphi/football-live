package com.facebook.ads.redexgen.X;

import com.google.android.exoplayer2.Metadata;
import com.google.android.exoplayer2.extractor.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.extractor.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.extractor.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.extractor.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.extractor.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.extractor.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.extractor.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.extractor.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.extractor.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.extractor.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.extractor.metadata.id3.UrlLinkFrame;
import com.ironsource.j3;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class B2 extends V4 {
    public static byte[] A01;
    public static String[] A02 = {"4PUX10uapdAKfZ8re8Io2", "jNB", "IBbtYh0A9gNC1TrvC14nL43TzD7dWWko", "yQM15z", "lDa6K5W2t1sAKPEcLi9zi", "hY7ujEfoQ16D93Wi6K4rNPNHebqBzoW5", "V", "dV"};
    public static final VP A03;
    public final VP A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static ApicFrame A04(C1648fq c1648fq, int i10, int i11) {
        int A022;
        String A012;
        int A0I = c1648fq.A0I();
        Charset A0M = A0M(A0I);
        byte[] bArr = new byte[i10 - 1];
        c1648fq.A0k(bArr, 0, i10 - 1);
        String A0J = A0J(402, 6, 88);
        if (i11 == 2) {
            A022 = 2;
            A012 = A0J + AbstractC1756hb.A01(new String(bArr, 0, 3, AbstractC1758hd.A01));
            if (A0J(418, 9, 93).equals(A012)) {
                A012 = A0J(j3.a.b.f17903h, 10, 93);
            }
        } else {
            A022 = A02(bArr, 0);
            A012 = AbstractC1756hb.A01(new String(bArr, 0, A022, AbstractC1758hd.A01));
            if (A012.indexOf(47) == -1) {
                A012 = A0J + A012;
            }
        }
        int i12 = bArr[A022 + 1] & 255;
        int i13 = A022 + 2;
        int A032 = A03(bArr, i13, A0I);
        return new ApicFrame(A012, new String(bArr, i13, A032 - i13, A0M), i12, A0Q(bArr, A00(A0I) + A032, bArr.length));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static ChapterFrame A06(C1648fq c1648fq, int i10, int i11, boolean z10, int i12, VP vp) {
        int A09 = c1648fq.A09();
        int A022 = A02(c1648fq.A0l(), A09);
        String str = new String(c1648fq.A0l(), A09, A022 - A09, AbstractC1758hd.A01);
        c1648fq.A0f(A022 + 1);
        int A0C = c1648fq.A0C();
        int A0C2 = c1648fq.A0C();
        long A0Q = c1648fq.A0Q();
        if (A0Q == 4294967295L) {
            A0Q = -1;
        }
        long A0Q2 = c1648fq.A0Q();
        if (A0Q2 == 4294967295L) {
            A0Q2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        int i13 = A09 + i10;
        while (c1648fq.A09() < i13) {
            Id3Frame A0B = A0B(i11, c1648fq, z10, i12, vp);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        return new ChapterFrame(str, A0C, A0C2, A0Q, A0Q2, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static GeobFrame A09(C1648fq c1648fq, int i10) {
        int A0I = c1648fq.A0I();
        Charset A0M = A0M(A0I);
        byte[] bArr = new byte[i10 - 1];
        c1648fq.A0k(bArr, 0, i10 - 1);
        int A022 = A02(bArr, 0);
        String str = new String(bArr, 0, A022, AbstractC1758hd.A01);
        int i11 = A022 + 1;
        int A032 = A03(bArr, i11, A0I);
        String A0L = A0L(bArr, i11, A032, A0M);
        int A00 = A00(A0I) + A032;
        int A033 = A03(bArr, A00, A0I);
        return new GeobFrame(str, A0L, A0L(bArr, A00, A033, A0M), A0Q(bArr, A00(A0I) + A033, bArr.length));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static MlltFrame A0C(C1648fq c1648fq, int i10) {
        int A0M = c1648fq.A0M();
        int A0K = c1648fq.A0K();
        int A0K2 = c1648fq.A0K();
        int A0I = c1648fq.A0I();
        int A0I2 = c1648fq.A0I();
        C1647fp c1647fp = new C1647fp();
        c1647fp.A0C(c1648fq);
        int i11 = ((i10 - 10) * 8) / (A0I + A0I2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int A04 = c1647fp.A04(A0I);
            int A042 = c1647fp.A04(A0I2);
            iArr[i12] = A04;
            iArr2[i12] = A042;
        }
        return new MlltFrame(A0M, A0K, A0K2, iArr, iArr2);
    }

    public static String A0J(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A0N() {
        A01 = new byte[]{-99, -88, -82, -48, 73, -121, 73, -121, 73, -121, 105, -89, 105, -89, 105, -89, 105, -89, 101, 89, -97, -85, -102, -90, -98, -116, -94, -77, -98, 118, -44, -15, 4, -15, -80, 4, -1, -1, -80, 3, -8, -1, 2, 4, -80, 4, -1, -80, -14, -11, -80, -15, -2, -80, -39, -44, -61, -80, 4, -15, -9, -49, -22, -14, -11, -18, -19, -87, -3, -8, -87, -19, -18, -20, -8, -19, -18, -87, -17, -5, -22, -10, -18, -61, -87, -14, -19, -58, -45, -18, -10, -7, -14, -15, -83, 1, -4, -83, 3, -18, -7, -10, -15, -18, 1, -14, -83, -42, -47, -64, -83, 1, -18, -12, -83, 4, -10, 1, -11, -83, -6, -18, -9, -4, -1, -29, -14, -1, 0, -10, -4, -5, -54, -93, -49, -66, -54, -62, 125, -48, -58, -41, -62, 125, -62, -43, -64, -62, -62, -63, -48, 125, -49, -62, -54, -66, -58, -53, -58, -53, -60, 125, -47, -66, -60, 125, -63, -66, -47, -66, -45, -18, -67, -50, -17, -19, -7, -18, -17, -4, -17, 7, 5, 12, 12, 1, 0, -68, -27, -32, -49, -68, 16, -3, 3, -68, 19, 5, 16, 4, -68, 9, -3, 6, 11, 14, -14, 1, 14, 15, 5, 11, 10, -39, -50, -68, -3, 10, 0, -68, 17, 10, 0, 1, 2, 5, 10, 1, 0, -68, -1, 11, 9, 12, 14, 1, 15, 15, 5, 11, 10, -68, 15, -1, 4, 1, 9, 1, -71, -47, -49, -42, -42, -53, -54, -122, -81, -86, -103, -122, -38, -57, -51, -122, -35, -49, -38, -50, -122, -37, -44, -39, -37, -42, -42, -43, -40, -38, -53, -54, -122, -45, -57, -48, -43, -40, -68, -53, -40, -39, -49, -43, -44, -93, -18, 6, 4, 11, 11, 4, 9, 2, -69, 16, 9, 14, 16, 11, 11, 10, 13, 15, 0, -1, -69, -2, 10, 8, 11, 13, 0, 14, 14, 0, -1, -69, 10, 13, -69, 0, 9, -2, 13, 20, 11, 15, 0, -1, -69, 1, 13, -4, 8, 0, -41, -37, -37, -37, -97, -72, -81, -62, -70, -81, -83, -66, -81, -82, 106, -80, -77, -68, -67, -66, 106, -66, -78, -68, -81, -81, 106, -84, -61, -66, -81, -67, 106, -71, -80, 106, -109, -114, 125, 106, -66, -85, -79, 106, -78, -81, -85, -82, -81, -68, -124, 106, 122, -62, -70, -69, -69, -69, -31, -27, -39, -33, -35, -89, -26, -22, -34, -28, -30, -84, -25, -19, -30, -28, -26, -22, -34, -28, -30, -84, -25, -19, -28};
    }

    static {
        A0N();
        A03 = new VP() { // from class: com.facebook.ads.redexgen.X.Ux
            @Override // com.facebook.ads.redexgen.X.VP
            public final boolean A6G(int i10, int i11, int i12, int i13, int i14) {
                return B2.A0O(i10, i11, i12, i13, i14);
            }
        };
    }

    public B2() {
        this(null);
    }

    public B2(VP vp) {
        this.A00 = vp;
    }

    public static int A00(int i10) {
        if (i10 == 0 || i10 == 3) {
            return 1;
        }
        return 2;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(com.facebook.ads.redexgen.X.C1648fq r7, int r8) {
        /*
            byte[] r3 = r7.A0l()
            int r7 = r7.A09()
            r6 = r7
        L9:
            int r1 = r6 + 1
            int r0 = r7 + r8
            if (r1 >= r0) goto L4c
            r5 = r3[r6]
            r4 = 255(0xff, float:3.57E-43)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.B2.A02
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L25
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L25:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.B2.A02
            java.lang.String r1 = "Qmz29gqSj5oBgAAaGkuyA"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "P5RtE9KGbm2BLtYsqTEc0"
            r0 = 0
            r2[r0] = r1
            r5 = r5 & r4
            if (r5 != r4) goto L49
            int r0 = r6 + 1
            r0 = r3[r0]
            if (r0 != 0) goto L49
            int r0 = r6 - r7
            int r2 = r6 + 2
            int r1 = r6 + 1
            int r0 = r8 - r0
            int r0 = r0 + (-2)
            java.lang.System.arraycopy(r3, r2, r3, r1, r0)
            int r8 = r8 + (-1)
        L49:
            int r6 = r6 + 1
            goto L9
        L4c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.B2.A01(com.facebook.ads.redexgen.X.fq, int):int");
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0001 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A02(byte[] r1, int r2) {
        /*
        L0:
            int r0 = r1.length
            if (r2 >= r0) goto Lb
            r0 = r1[r2]
            if (r0 != 0) goto L8
            return r2
        L8:
            int r2 = r2 + 1
            goto L0
        Lb:
            int r0 = r1.length
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.B2.A02(byte[], int):int");
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A03(byte[] r5, int r6, int r7) {
        /*
            int r3 = A02(r5, r6)
            if (r7 == 0) goto L9
            r0 = 3
            if (r7 != r0) goto La
        L9:
            return r3
        La:
            int r0 = r5.length
            int r0 = r0 + (-1)
            if (r3 >= r0) goto L42
            int r0 = r3 - r6
            int r4 = r0 % 2
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.B2.A02
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 29
            if (r1 == r0) goto L3c
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.B2.A02
            java.lang.String r1 = "oKHflXQomRqlrTFJytXlQ"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "ptdZMHzR0IlJCy8h8ia0k"
            r0 = 0
            r2[r0] = r1
            if (r4 != 0) goto L35
            int r0 = r3 + 1
            r0 = r5[r0]
            if (r0 != 0) goto L35
            return r3
        L35:
            int r0 = r3 + 1
            int r3 = A02(r5, r0)
            goto La
        L3c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L42:
            int r0 = r5.length
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.B2.A03(byte[], int, int):int");
    }

    public static BinaryFrame A05(C1648fq c1648fq, int i10, String str) {
        byte[] bArr = new byte[i10];
        c1648fq.A0k(bArr, 0, i10);
        return new BinaryFrame(str, bArr);
    }

    public static ChapterTocFrame A07(C1648fq c1648fq, int i10, int i11, boolean z10, int elementIdEndIndex, VP vp) {
        int A09 = c1648fq.A09();
        int A022 = A02(c1648fq.A0l(), A09);
        String str = new String(c1648fq.A0l(), A09, A022 - A09, AbstractC1758hd.A01);
        c1648fq.A0f(A022 + 1);
        int framePosition = c1648fq.A0I();
        boolean z11 = (framePosition & 2) != 0;
        boolean z12 = (framePosition & 1) != 0;
        int A0I = c1648fq.A0I();
        String[] strArr = new String[A0I];
        for (int i12 = 0; i12 < A0I; i12++) {
            int startIndex = c1648fq.A09();
            int A023 = A02(c1648fq.A0l(), startIndex);
            int elementIdEndIndex2 = A023 - startIndex;
            strArr[i12] = new String(c1648fq.A0l(), startIndex, elementIdEndIndex2, AbstractC1758hd.A01);
            c1648fq.A0f(A023 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i13 = A09 + i10;
        while (c1648fq.A09() < i13) {
            Id3Frame A0B = A0B(i11, c1648fq, z10, elementIdEndIndex, vp);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        return new ChapterTocFrame(str, z11, z12, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static CommentFrame A08(C1648fq c1648fq, int i10) {
        if (i10 < 4) {
            return null;
        }
        int textStartIndex = c1648fq.A0I();
        Charset A0M = A0M(textStartIndex);
        byte[] bArr = new byte[3];
        c1648fq.A0k(bArr, 0, 3);
        String description = new String(bArr, 0, 3);
        int encoding = i10 - 4;
        byte[] data = new byte[encoding];
        int encoding2 = i10 - 4;
        c1648fq.A0k(data, 0, encoding2);
        int encoding3 = A03(data, 0, textStartIndex);
        String language = new String(data, 0, encoding3, A0M);
        int A00 = A00(textStartIndex) + encoding3;
        int encoding4 = A03(data, A00, textStartIndex);
        return new CommentFrame(description, language, A0L(data, A00, encoding4, A0M));
    }

    public static VQ A0A(C1648fq c1648fq) {
        int A0K;
        int A07 = c1648fq.A07();
        String A0J = A0J(170, 10, 106);
        if (A07 < 10) {
            String A0J2 = A0J(30, 31, 112);
            if (A02[6].length() != 29) {
                A02[7] = "ft";
                AbstractC1633fb.A07(A0J, A0J2);
                return null;
            }
        } else {
            boolean z10 = false;
            if (c1648fq.A0K() != 4801587) {
                AbstractC1633fb.A07(A0J, A0J(348, 50, 42) + String.format(A0J(0, 4, 88), Integer.valueOf(A0K)));
                return null;
            }
            int flags = c1648fq.A0I();
            c1648fq.A0g(1);
            int A0I = c1648fq.A0I();
            int A0H = c1648fq.A0H();
            if (flags == 2) {
                int id = A0I & 64;
                int id2 = id != 0 ? 1 : 0;
                if (id2 != 0) {
                    AbstractC1633fb.A07(A0J, A0J(180, 68, 124));
                    return null;
                }
            } else if (A02[7].length() != 2) {
                throw new RuntimeException();
            } else {
                String[] strArr = A02;
                strArr[4] = "OqMHXY7CQ0TcT8fFOzpkR";
                strArr[0] = "15NoodIVrIzM0pd7Jtwuw";
                if (flags == 3) {
                    int id3 = A0I & 64;
                    int id4 = id3 != 0 ? 1 : 0;
                    if (id4 != 0) {
                        int A0C = c1648fq.A0C();
                        String[] strArr2 = A02;
                        String str = strArr2[3];
                        String str2 = strArr2[1];
                        int majorVersion = str.length();
                        int id5 = str2.length();
                        if (majorVersion != id5) {
                            String[] strArr3 = A02;
                            strArr3[4] = "gxSfxc1ujN4pN2WOYfwTj";
                            strArr3[0] = "u0kRLxyagpkvuBkC8M7TC";
                            c1648fq.A0g(A0C);
                            int id6 = A0C + 4;
                            A0H -= id6;
                        }
                    }
                } else if (flags == 4) {
                    int id7 = A0I & 64;
                    int id8 = id7 != 0 ? 1 : 0;
                    if (id8 != 0) {
                        int majorVersion2 = c1648fq.A0H();
                        int id9 = majorVersion2 - 4;
                        c1648fq.A0g(id9);
                        A0H -= majorVersion2;
                    }
                    int id10 = A0I & 16;
                    int id11 = id10 != 0 ? 1 : 0;
                    if (id11 != 0) {
                        A0H -= 10;
                    }
                } else {
                    AbstractC1633fb.A07(A0J, A0J(248, 46, 70) + flags);
                    return null;
                }
            }
            if (flags < 4) {
                int id12 = A0I & 128;
                if (id12 != 0) {
                    z10 = true;
                }
            }
            return new VQ(flags, z10, A0H);
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x020c, code lost:
        if (r8 == 67) goto L107;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.extractor.metadata.id3.Id3Frame A0B(int r23, com.facebook.ads.redexgen.X.C1648fq r24, boolean r25, int r26, com.facebook.ads.redexgen.X.VP r27) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.B2.A0B(int, com.facebook.ads.redexgen.X.fq, boolean, int, com.facebook.ads.redexgen.X.VP):com.google.android.exoplayer2.extractor.metadata.id3.Id3Frame");
    }

    public static PrivFrame A0D(C1648fq c1648fq, int i10) {
        byte[] bArr = new byte[i10];
        c1648fq.A0k(bArr, 0, i10);
        int A022 = A02(bArr, 0);
        return new PrivFrame(new String(bArr, 0, A022, AbstractC1758hd.A01), A0Q(bArr, A022 + 1, bArr.length));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<java.lang.String> */
    public static TextInformationFrame A0E(C1648fq c1648fq, int i10) {
        if (i10 < 1) {
            return null;
        }
        int A0I = c1648fq.A0I();
        int encoding = i10 - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i10 - 1;
        c1648fq.A0k(bArr, 0, encoding2);
        int A032 = A03(bArr, 0, A0I);
        String str = new String(bArr, 0, A032, A0M(A0I));
        int encoding3 = A00(A0I);
        return new TextInformationFrame(A0J(344, 4, 99), str, A0I(bArr, A0I, encoding3 + A032));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<java.lang.String> */
    public static TextInformationFrame A0F(C1648fq c1648fq, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int A0I = c1648fq.A0I();
        int encoding = i10 - 1;
        byte[] data = new byte[encoding];
        c1648fq.A0k(data, 0, i10 - 1);
        return new TextInformationFrame(str, null, A0I(data, A0I, 0));
    }

    public static UrlLinkFrame A0G(C1648fq c1648fq, int i10) {
        if (i10 < 1) {
            return null;
        }
        int A0I = c1648fq.A0I();
        int encoding = i10 - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i10 - 1;
        c1648fq.A0k(bArr, 0, encoding2);
        int A032 = A03(bArr, 0, A0I);
        String str = new String(bArr, 0, A032, A0M(A0I));
        int descriptionEndIndex = A00(A0I) + A032;
        String description = A0L(bArr, descriptionEndIndex, A02(bArr, descriptionEndIndex), AbstractC1758hd.A01);
        return new UrlLinkFrame(A0J(398, 4, 67), str, description);
    }

    public static UrlLinkFrame A0H(C1648fq c1648fq, int i10, String str) {
        byte[] bArr = new byte[i10];
        c1648fq.A0k(bArr, 0, i10);
        return new UrlLinkFrame(str, null, new String(bArr, 0, A02(bArr, 0), AbstractC1758hd.A01));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4T != com.google.common.collect.ImmutableList$Builder<java.lang.String> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<java.lang.String> */
    public static OI<String> A0I(byte[] bArr, int i10, int i11) {
        int length = bArr.length;
        String A0J = A0J(0, 0, 116);
        if (i11 >= length) {
            return OI.A04(A0J);
        }
        C4T A012 = OI.A01();
        int valueEndIndex = A03(bArr, i11, i10);
        while (i11 < valueEndIndex) {
            int valueStartIndex = valueEndIndex - i11;
            A012.A04(new String(bArr, i11, valueStartIndex, A0M(i10)));
            i11 = valueEndIndex + A00(i10);
            valueEndIndex = A03(bArr, i11, i10);
        }
        OI<String> A05 = A012.A05();
        return A05.isEmpty() ? OI.A04(A0J) : A05;
    }

    public static String A0K(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, A0J(4, 6, 4), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, A0J(10, 8, 36), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static String A0L(byte[] bArr, int i10, int i11, Charset charset) {
        if (i11 <= i10 || i11 > bArr.length) {
            return A0J(0, 0, 116);
        }
        return new String(bArr, i10, i11 - i10, charset);
    }

    public static Charset A0M(int i10) {
        switch (i10) {
            case 1:
                return AbstractC1758hd.A03;
            case 2:
                return AbstractC1758hd.A04;
            case 3:
                return AbstractC1758hd.A06;
            default:
                return AbstractC1758hd.A01;
        }
    }

    public static /* synthetic */ boolean A0O(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
        if (r10 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
        if (r5 != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
        r18.A0f(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
        if (r10 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011a, code lost:
        if (r8 != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011c, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0133, code lost:
        if (r8 != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0136, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0P(com.facebook.ads.redexgen.X.C1648fq r18, int r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.B2.A0P(com.facebook.ads.redexgen.X.fq, int, int, boolean):boolean");
    }

    public static byte[] A0Q(byte[] bArr, int i10, int i11) {
        if (i11 <= i10) {
            return AbstractC1672gE.A07;
        }
        return Arrays.copyOfRange(bArr, i10, i11);
    }

    @Override // com.facebook.ads.redexgen.X.V4
    public final Metadata A0R(Bi bi, ByteBuffer byteBuffer) {
        return A0S(byteBuffer.array(), byteBuffer.limit());
    }

    public final Metadata A0S(byte[] bArr, int i10) {
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList = new ArrayList();
        C1648fq c1648fq = new C1648fq(bArr, i10);
        VQ A0A = A0A(c1648fq);
        if (A0A == null) {
            return null;
        }
        int startPosition = c1648fq.A09();
        i11 = A0A.A01;
        int frameHeaderSize = i11 == 2 ? 6 : 10;
        i12 = A0A.A00;
        z10 = A0A.A02;
        if (z10) {
            i17 = A0A.A00;
            i12 = A01(c1648fq, i17);
        }
        c1648fq.A0e(startPosition + i12);
        boolean z11 = false;
        i13 = A0A.A01;
        if (!A0P(c1648fq, i13, frameHeaderSize, false)) {
            i15 = A0A.A01;
            if (i15 == 4 && A0P(c1648fq, 4, frameHeaderSize, true)) {
                z11 = true;
            } else {
                StringBuilder append = new StringBuilder().append(A0J(88, 45, 109));
                i16 = A0A.A01;
                AbstractC1633fb.A07(A0J(170, 10, 106), append.append(i16).toString());
                return null;
            }
        }
        while (c1648fq.A07() >= frameHeaderSize) {
            i14 = A0A.A01;
            Id3Frame A0B = A0B(i14, c1648fq, z11, frameHeaderSize, this.A00);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        return new Metadata(arrayList);
    }
}

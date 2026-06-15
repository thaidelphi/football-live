package com.facebook.ads.redexgen.X;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.gms.ads.AdRequest;
import com.ironsource.j3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlayAdError;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class Z2 {
    public static byte[] A0B;
    public static String[] A0C = {"FBXPhDeCZ6ta56izg2RX4UAMGxSWuPmO", "QDrmS89XtXuNc36lbLCGV2rXwMMaCdmS", "noOMEUvqxn4F9nXxwkLlT", "Nt19yBDAzxo6G70U2O2eiohegrIvFrbk", "3lkz9BodtFScM4PEoF3XaCKts9KucpwR", "ZOKXB8HAY4o3HPLOLnouM", "MXm1HhuqFq0azwHnrfysHiEAnyccYvPg", "FEiKe9Sj4I2Kk6mI0nlyn5nHBNOH03KR"};
    public final MediaCodecInfo.CodecCapabilities A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 46);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        byte[] bArr = {-65, 19, 14, -65, -97, -109, -93, -105, -46, -110, -95, -45, -45, -43, -51, -59, -60, -83, -63, -40, -93, -56, -63, -50, -50, -59, -52, -95, -60, -54, -43, -45, -44, -51, -59, -50, -44, -102, Byte.MIN_VALUE, -38, 12, 12, 14, 6, -2, -3, -20, 14, 9, 9, 8, 11, 13, -71, -12, -30, -5, 4, 5, 12, 5, -74, -22, -40, -61, -18, -52, -58, -53, -36, -11, -2, -1, 6, -1, -80, -28, -46, -67, -24, -58, -64, -58, -91, -66, -57, -56, -49, -56, 121, -83, -101, -122, -79, -113, -118, -113, -97, -73, -74, -69, -77, -107, -63, -74, -73, -75, -101, -64, -72, -63, -121, -98, -79, -82, -84, 89, 106, 105, -86, -53, -81, -47, -52, -52, -53, -50, -48, 124, -73, -37, -48, -34, -37, -43, -48, -71, -28, -31, -65, -83, -85, -74, -116, -93, -42, -41, -52, -51, -47, -116, -97, -76, -95, -116, -94, -61, -63, -51, -62, -61, -48, -15, -17, -6, -48, -25, 26, 27, 16, 17, 21, -48, -29, -8, -27, -48, -26, 7, 5, 17, 6, 7, 20, -48, 21, 7, 5, 23, 20, 7, -73, -75, -64, -106, -75, -87, -70, -66, -83, -76, -76, -106, -66, -79, -84, -83, -73, -106, -80, -65, -106, -85, -73, -84, -87, -97, -99, -100, -102, -84, -83, -85, -73, -84, -83, -70, -61, -63, -52, -94, -63, -56, -65, -94, -54, -67, -72, -71, -61, -94, -72, -71, -73, -61, -72, -71, -58, -94, -68, -71, -54, -73, 0, -6, -38, 1, -33, -32, -35, -104, -32, -93, -34, 13, 16, 13, 28, 32, 21, 34, 17, -39, 28, 24, 13, 37, 14, 13, 15, 23, 14, 34, 17, 22, 28, -36, -32, 20, 29, 29, -22, -2, -19, -14, -8, -72, -22, -20, -68, -28, -8, -25, -20, -14, -78, -28, -16, -11, -80, -6, -27, -81, -61, -78, -73, -67, 125, -77, -81, -79, -127, -5, 15, -2, 3, 9, -55, 0, 6, -5, -3, 11, 31, 14, 19, 25, -39, 17, -31, -37, -37, -41, 11, 22, 11, 33, -57, -37, -54, -49, -43, -107, -51, -99, -105, -105, -109, -45, -46, -57, -35, -92, -72, -89, -84, -78, 114, -86, -74, -80, -27, -7, -24, -19, -13, -77, -15, -12, -72, -27, -79, -16, -27, -8, -15, -16, 4, -13, -8, -2, -66, -4, -1, -12, -10, -1, 19, 2, 7, 13, -51, 13, 14, 19, 17, -48, -28, -45, -40, -34, -98, -31, -48, -26, -32, -12, -29, -24, -18, -82, -11, -18, -15, -31, -24, -14, -5, 8, 11, -2, -6, 5, -55, -50, -57, -44, -44, -53, -46, -87, -43, -37, -44, -38, -108, -57, -87, -57, -42, -39, -59, -54, -61, -48, -48, -57, -50, -91, -47, -41, -48, -42, -112, -59, -61, -46, -43, -96, -91, -98, -85, -85, -94, -87, Byte.MIN_VALUE, -84, -78, -85, -79, 107, -80, -78, -83, -83, -84, -81, -79, 105, 93, -59, -47, -58, -57, -59, -112, -49, -53, -49, -57, -126, -47, -35, -46, -45, -47, -100, -34, -32, -35, -44, -41, -38, -45, -70, -45, -28, -45, -38, -102, -114, -57, -69, -52, -58, -61, -56, 24, 14, 33, -32, 12, -37, -55, -54, -38, -47, -42, -55, -14, -32, -24, -21, -27, -24, -14, -25, -46, -64, -52, -49, -53, -60, -79, -64, -45, -60, -115, -64, -94, -64, -49, -46, 22, 4, 16, 19, 15, 8, -11, 4, 23, 8, -47, 6, 4, 19, 22, 10, -8, 4, 7, 3, -4, -23, -8, 11, -4, -59, 10, 12, 7, 7, 6, 9, 11, -61, -73, -35, -49, -51, -33, -36, -49, -105, -38, -42, -53, -29, -52, -53, -51, -43, 23, 13, 30, 9, -27, 18, 8, -10, 5, 24, 9, -46, 7, 5, 20, 23, -14, -24, -7, -28, -64, -19, -29, -47, -32, -13, -28, -83, -30, -18, -11, -28, -15, -85, -97, 13, 3, 20, -1, -37, 8, -2, -20, -5, 14, -1, -56, 12, 9, 14, -5, 14, -1, -2, -58, -70, 32, 22, 39, 18, -18, 27, 17, -1, 14, 33, 18, -37, 32, 34, 29, 29, 28, 31, 33, -39, -51, -17, -27, -10, -31, -67, -22, -32, -50, -35, -16, -31, -86, -14, -65, -35, -20, -17, 33, 34, 27, 27, 18, 25, 18, 17, -38, 29, 25, 14, 38, 15, 14, 16, 24, -18, -31, -36, -35, -25, -89, -39, -18, -37, -43, -56, -61, -60, -50, -114, -61, -50, -53, -63, -40, -116, -43, -56, -46, -56, -50, -51, -32, -45, -50, -49, -39, -103, -46, -49, -32, -51, 10, -3, -8, -7, 3, -61, 12, -63, 10, 2, -8, -62, 3, 2, -58, -62, 10, 4, -51, -52};
        String[] strArr = A0C;
        if (strArr[0].charAt(30) != strArr[1].charAt(30)) {
            throw new RuntimeException();
        }
        A0C[6] = "Z5VDyRnJom1aU8j1qPs7WLJ1gpMnSQJN";
        A0B = bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ed, code lost:
        if (r4 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ef, code lost:
        r9 = r9 | 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f1, code lost:
        r4 = A0H(r10.A02);
        r2 = com.facebook.ads.redexgen.X.Z2.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0109, code lost:
        if (r2[0].charAt(30) == r2[1].charAt(30)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0110, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011d, code lost:
        if (r4 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0120, code lost:
        r2 = com.facebook.ads.redexgen.X.Z2.A0C;
        r2[4] = "QhdJwSvYwnxnh04cgBDXk1DfSAMlKxiR";
        r2[7] = "bBzx3qQxnphZNjaaSLtGu5pyO1sK8pIR";
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012c, code lost:
        if (r4 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012e, code lost:
        r9 = r9 | 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0130, code lost:
        if (r9 != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013b, code lost:
        return new com.facebook.ads.redexgen.X.OD(r10.A03, r11, r12, 1, 0);
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.X.OD A0O(com.facebook.ads.redexgen.X.ZM r11, com.facebook.ads.redexgen.X.ZM r12) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.Z2.A0O(com.facebook.ads.redexgen.X.ZM, com.facebook.ads.redexgen.X.ZM):com.facebook.ads.redexgen.X.OD");
    }

    static {
        A04();
    }

    public Z2(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.A03 = (String) AbstractC1589es.A01(str);
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = codecCapabilities;
        this.A05 = z10;
        this.A07 = z11;
        this.A09 = z12;
        this.A04 = z13;
        this.A08 = z14;
        this.A06 = z15;
        this.A0A = Q2.A0F(str2);
    }

    public static int A00(String str, String str2, int i10) {
        int i11;
        if (i10 > 1 || (AbstractC1672gE.A02 >= 26 && i10 > 0)) {
            return i10;
        }
        if (A03(386, 10, 97).equals(str2) || A03(281, 10, 127).equals(str2) || A03(300, 12, 85).equals(str2) || A03(371, 15, 86).equals(str2) || A03(415, 12, 81).equals(str2) || A03(396, 10, 112).equals(str2) || A03(j3.a.b.f17901f, 9, 65).equals(str2) || A03(322, 10, 108).equals(str2) || A03(332, 15, 124).equals(str2) || A03(347, 15, 56).equals(str2) || A03(362, 9, 21).equals(str2)) {
            return i10;
        }
        if (A03(291, 9, 91).equals(str2)) {
            i11 = 6;
        } else if (A03(312, 10, 32).equals(str2)) {
            i11 = 16;
        } else {
            i11 = 30;
        }
        AbstractC1633fb.A07(A03(97, 14, 36), A03(10, 29, 50) + str + A03(6, 3, 73) + i10 + A03(0, 4, 113) + i11 + A03(260, 1, 13));
        return i11;
    }

    public static Point A01(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int heightAlignment = videoCapabilities.getWidthAlignment();
        int widthAlignment = videoCapabilities.getHeightAlignment();
        return new Point(AbstractC1672gE.A05(i10, heightAlignment) * heightAlignment, AbstractC1672gE.A05(i11, widthAlignment) * widthAlignment);
    }

    public static Z2 A02(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15 = (z13 || codecCapabilities == null || !A09(codecCapabilities) || A0J(str)) ? false : true;
        boolean z16 = codecCapabilities != null && A0D(codecCapabilities);
        boolean z17 = z14 || (codecCapabilities != null && A0B(codecCapabilities));
        String[] strArr = A0C;
        if (strArr[4].charAt(31) != strArr[7].charAt(31)) {
            throw new RuntimeException();
        }
        A0C[6] = "iu6X6TeG7hna2aJ2WJ8Ns0NHwlxEFqT7";
        return new Z2(str, str2, str3, codecCapabilities, z10, z11, z12, z15, z16, z17);
    }

    private void A05(String str) {
        StringBuilder append = new StringBuilder().append(A03(39, 16, 107)).append(str);
        String A03 = A03(261, 3, 85);
        AbstractC1633fb.A04(A03(97, 14, 36), append.append(A03).append(this.A03).append(A03(4, 2, 69)).append(this.A02).append(A03).append(AbstractC1672gE.A04).append(A03(260, 1, 13)).toString());
    }

    private void A06(String str) {
        StringBuilder append = new StringBuilder().append(A03(119, 11, 46)).append(str);
        String A03 = A03(261, 3, 85);
        AbstractC1633fb.A04(A03(97, 14, 36), append.append(A03).append(this.A03).append(A03(4, 2, 69)).append(this.A02).append(A03).append(AbstractC1672gE.A04).append(A03(260, 1, 13)).toString());
    }

    public static boolean A07() {
        return AbstractC1672gE.A03.equals(A03(532, 7, 58)) || AbstractC1672gE.A03.equals(A03(427, 6, 107)) || AbstractC1672gE.A06.startsWith(A03(55, 14, 104)) || AbstractC1672gE.A06.startsWith(A03(69, 14, 98)) || AbstractC1672gE.A06.startsWith(A03(83, 14, 43));
    }

    public static boolean A09(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return AbstractC1672gE.A02 >= 19 && A0A(codecCapabilities);
    }

    public static boolean A0A(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(264, 17, 126));
    }

    public static boolean A0B(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return AbstractC1672gE.A02 >= 21 && A0C(codecCapabilities);
    }

    public static boolean A0C(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(598, 15, 60));
    }

    public static boolean A0D(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return AbstractC1672gE.A02 >= 21 && A0E(codecCapabilities);
    }

    public static boolean A0E(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(IronSourceError.ERROR_NT_INSTANCE_INIT_TIMEOUT, 17, 127));
    }

    public static boolean A0F(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point alignedSize = A01(videoCapabilities, i10, i11);
        int i12 = alignedSize.x;
        int i13 = alignedSize.y;
        if (d10 == -1.0d || d10 < 1.0d) {
            return videoCapabilities.isSizeSupported(i12, i13);
        }
        return videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D46258033: [FBLite][Video] Solve tasks T154141530 T154151746 gating the call for SDK >=21")
    private boolean A0G(ZM zm, boolean z10) {
        Pair<Integer, Integer> A0B2 = ZZ.A0B(zm);
        if (A0B2 == null) {
            return true;
        }
        int intValue = ((Integer) A0B2.first).intValue();
        int intValue2 = ((Integer) A0B2.second).intValue();
        if (A03(733, 18, 49).equals(zm.A0W)) {
            if (A03(724, 9, 74).equals(this.A02)) {
                intValue = 8;
                intValue2 = 0;
            } else if (A03(751, 10, 60).equals(this.A02)) {
                intValue = 2;
                intValue2 = 0;
            }
        }
        if ((!this.A0A && intValue != 42) || A0V().length <= 0) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] profileLevels = A0V();
        if (AbstractC1672gE.A02 >= 21 && AbstractC1672gE.A02 <= 23) {
            if (A03(761, 19, 102).equals(this.A02) && profileLevels.length == 0) {
                profileLevels = A0M(this.A00);
            }
        }
        if (A0C[3].charAt(6) != 'D') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[0] = "ORMX5iAQPjpwd33E74u0BsfeHTZSntm8";
        strArr[1] = "S9zUHIvKdvUZcB7QlWQwOtS9GyXtTFmh";
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : profileLevels) {
            int profile = codecProfileLevel.profile;
            if (profile == intValue) {
                int profile2 = codecProfileLevel.level;
                if ((profile2 >= intValue2 || !z10) && !A0L(this.A02, intValue)) {
                    return true;
                }
            }
        }
        A06(A03(IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE, 20, 64) + zm.A0R + A03(4, 2, 69) + this.A01);
        return false;
    }

    public static boolean A0H(String str) {
        return A03(396, 10, 112).equals(str);
    }

    public static boolean A0I(String str) {
        return AbstractC1672gE.A06.startsWith(A03(253, 7, 127)) && A03(191, 36, 58).equals(str);
    }

    public static boolean A0J(String str) {
        if (AbstractC1672gE.A02 <= 22) {
            if ((A03(130, 10, 94).equals(AbstractC1672gE.A06) || A03(111, 8, 11).equals(AbstractC1672gE.A06)) && (A03(IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, 22, 48).equals(str) || A03(162, 29, 116).equals(str))) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0K(String str) {
        if (A03(227, 26, 70).equals(str) && A03(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 5, 125).equals(AbstractC1672gE.A03)) {
            return false;
        }
        if (A0C[3].charAt(6) != 'D') {
            throw new RuntimeException();
        }
        A0C[6] = "rGkUTSP69JXayHzzfRs4rqRX6esaTUNK";
        return true;
    }

    public static boolean A0L(String str, int i10) {
        if (A03(751, 10, 60).equals(str)) {
            String[] strArr = A0C;
            if (strArr[4].charAt(31) != strArr[7].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[0] = "lDNsaVG6TpZD2QagnIn1pIMPC8hAw7mb";
            strArr2[1] = "IkuK62epzms2zSlQYmCFCweCKeq9Cgmu";
            if (2 == i10) {
                if (A03(539, 8, 81).equals(AbstractC1672gE.A03) || A03(521, 6, 44).equals(AbstractC1672gE.A03)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static MediaCodecInfo.CodecProfileLevel[] A0M(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int level;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i10 = 0;
        if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
            i10 = videoCapabilities.getBitrateRange().getUpper().intValue();
        }
        if (A0C[6].charAt(11) != 'a') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[2] = "bMi2YjKgH6UosJyAhorls";
        strArr[5] = "OZZEdnO9Xa3Shz0YgvfWB";
        if (i10 >= 180000000) {
            level = 1024;
        } else if (i10 >= 120000000) {
            level = AdRequest.MAX_CONTENT_URL_LENGTH;
        } else if (i10 >= 60000000) {
            level = 256;
        } else if (i10 >= 30000000) {
            level = 128;
        } else if (i10 >= 18000000) {
            level = 64;
        } else if (i10 >= 12000000) {
            level = 32;
        } else if (i10 >= 7200000) {
            level = 16;
        } else if (i10 >= 3600000) {
            level = 8;
        } else if (i10 >= 1800000) {
            level = 4;
        } else if (i10 >= 800000) {
            level = 2;
        } else {
            level = 1;
        }
        MediaCodecInfo.CodecProfileLevel profileLevel = new MediaCodecInfo.CodecProfileLevel();
        profileLevel.profile = 1;
        profileLevel.level = level;
        return new MediaCodecInfo.CodecProfileLevel[]{profileLevel};
    }

    public final Point A0N(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (this.A00 == null || (videoCapabilities = this.A00.getVideoCapabilities()) == null) {
            return null;
        }
        return A01(videoCapabilities, i10, i11);
    }

    public final boolean A0P(int i10) {
        if (this.A00 == null) {
            A06(A03(451, 17, 52));
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.A00.getAudioCapabilities();
        if (audioCapabilities == null) {
            A06(A03(433, 18, 56));
            return false;
        } else if (A00(this.A03, this.A02, audioCapabilities.getMaxInputChannelCount()) < i10) {
            A06(A03(468, 22, 15) + i10);
            return false;
        } else {
            return true;
        }
    }

    public final boolean A0Q(int i10) {
        if (this.A00 == null) {
            A06(A03(563, 15, 117));
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.A00.getAudioCapabilities();
        if (audioCapabilities == null) {
            A06(A03(547, 16, 49));
            return false;
        } else if (!audioCapabilities.isSampleRateSupported(i10)) {
            A06(A03(578, 20, 105) + i10);
            return false;
        } else {
            return true;
        }
    }

    public final boolean A0R(int i10, int i11, double d10) {
        if (this.A00 == null) {
            A06(A03(IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE, 16, 118));
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.A00.getVideoCapabilities();
        if (videoCapabilities == null) {
            A06(A03(690, 17, 78));
            return false;
        }
        int i12 = AbstractC1672gE.A02;
        String A03 = A03(9, 1, 36);
        String A032 = A03(780, 1, 38);
        if (i12 >= 29) {
            int A00 = Z0.A00(videoCapabilities, i10, i11, d10);
            if (A00 == 2) {
                return true;
            }
            if (A00 == 1) {
                A06(A03(LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, 19, 81) + i10 + A032 + i11 + A03 + d10);
                return false;
            }
        }
        if (!A0F(videoCapabilities, i10, i11, d10)) {
            if (i10 >= i11 || !A0K(this.A03) || !A0F(videoCapabilities, i11, i10, d10)) {
                A06(A03(669, 21, 127) + i10 + A032 + i11 + A03 + d10);
                return false;
            }
            A05(A03(648, 21, 108) + i10 + A032 + i11 + A03 + d10);
        }
        return true;
    }

    @MetaExoPlayerCustomization(type = {"DEPRECATED_LOGIC"}, value = "D51676338: Control Renderer Support behavior")
    public final boolean A0S(ZM zm) {
        String A07;
        if (zm.A0R == null || this.A02 == null || (A07 = Q2.A07(zm.A0R)) == null) {
            return true;
        }
        String str = this.A02;
        if (A0C[3].charAt(6) != 'D') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[2] = "KAwJ2lKC4hgwLXt68d84S";
        strArr[5] = "kJwFVEEageZGhP5qzVn8u";
        if (!str.equals(A07)) {
            StringBuilder sb = new StringBuilder();
            String codecMimeType = A03(490, 11, 52);
            StringBuilder append = sb.append(codecMimeType);
            String codecMimeType2 = zm.A0R;
            StringBuilder append2 = append.append(codecMimeType2);
            String codecMimeType3 = A03(4, 2, 69);
            A06(append2.append(codecMimeType3).append(A07).toString());
            return false;
        }
        return A0G(zm, true);
    }

    public final boolean A0T(ZM zm) {
        if (this.A0A) {
            boolean z10 = this.A04;
            String[] strArr = A0C;
            if (strArr[0].charAt(30) == strArr[1].charAt(30)) {
                String[] strArr2 = A0C;
                strArr2[4] = "q0okLXeWdPGtykafkblhIV4KyWkme2AR";
                strArr2[7] = "3q0ziuawpqKtRPl3U6pidMLg7nfoGoOR";
                return z10;
            }
        } else {
            Pair<Integer, Integer> A0B2 = ZZ.A0B(zm);
            if (A0C[6].charAt(11) == 'a') {
                String[] strArr3 = A0C;
                strArr3[0] = "1xtIoqy66xdoySwSi0No6Dznh2tk7Bm6";
                strArr3[1] = "tyq1ut2AGrr1b3GtAVKN5E2WpsFCa0m4";
                return A0B2 != null && ((Integer) A0B2.first).intValue() == 42;
            }
        }
        throw new RuntimeException();
    }

    @Deprecated
    public final boolean A0U(ZM zm, ZM zm2, boolean z10) {
        if (!z10 && zm.A0N != null && zm2.A0N == null) {
            zm2 = zm2.A07().A0t(zm.A0N).A14();
        }
        int i10 = A0O(zm, zm2).A01;
        if (i10 != 2) {
            if (A0C[6].charAt(11) != 'a') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[4] = "G0NkXFkY0d8qrzbvDqnofI31CkQoypIR";
            strArr[7] = "vdgZg5erOMw5t31Gg1U5hRxQh5cKBhKR";
            if (i10 != 3) {
                return false;
            }
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] A0V() {
        if (this.A00 == null || this.A00.profileLevels == null) {
            return new MediaCodecInfo.CodecProfileLevel[0];
        }
        return this.A00.profileLevels;
    }

    public final String toString() {
        return this.A03;
    }
}

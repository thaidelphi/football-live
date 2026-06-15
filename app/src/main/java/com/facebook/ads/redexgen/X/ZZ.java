package com.facebook.ads.redexgen.X;

import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.exoplayer2.ColorInfo;
import com.google.android.gms.ads.AdRequest;
import com.google.protobuf.CodedOutputStream;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class ZZ {
    public static int A00;
    public static byte[] A01;
    public static String[] A02 = {"e14ptteY", "UQXq5sBWu5fWK1bGcwCRcgAxbxIvQnsR", "MMSqLmnpL37FJ7rqyr1Y90kyhHlvdj", "tbd5BofXm4zOqwGtJ3KNPCWvIt3qsJ0f", "NegEtcjDnKZ3TSj7vSACdiJNeW3xtz", "v8COqcqZmM6Hoi607jE5leKHzxFEA4ko", "zzxR9J3acXU1ORCyNKYtta", "dCwgrsPR"};
    public static final HashMap<ZV, List<Z2>> A03;
    public static final Pattern A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A00() throws ZW {
        if (A00 == -1) {
            int i10 = 0;
            Z2 A0J = A0J(A0N(1756, 9, 65), false, false);
            if (A0J != null) {
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : A0J.A0V()) {
                    i10 = Math.max(A03(codecProfileLevel.level), i10);
                }
                i10 = Math.max(i10, AbstractC1672gE.A02 >= 21 ? 345600 : 172800);
            }
            A00 = i10;
        }
        return A00;
    }

    public static String A0N(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 5);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cb, code lost:
        if (r23.A01 != r12) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d1, code lost:
        if (r23.A01 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
        r6.add(com.facebook.ads.redexgen.X.Z2.A02(r2, r5, r1, r0, r20, r21, r22, false, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010a, code lost:
        r16 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010b, code lost:
        r2 = r2;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f A[Catch: Exception -> 0x018e, TRY_ENTER, TryCatch #2 {Exception -> 0x018e, blocks: (B:3:0x0014, B:5:0x002a, B:28:0x00a3, B:8:0x0035, B:11:0x0040, B:21:0x005f, B:24:0x006f, B:26:0x0075, B:69:0x0153, B:70:0x018c), top: B:79:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0153 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList<com.facebook.ads.redexgen.X.Z2> A0Q(com.facebook.ads.redexgen.X.ZV r23, com.facebook.ads.redexgen.X.ZX r24) throws com.facebook.ads.redexgen.X.ZW {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.ZZ.A0Q(com.facebook.ads.redexgen.X.ZV, com.facebook.ads.redexgen.X.ZX):java.util.ArrayList");
    }

    public static void A0S() {
        A01 = new byte[]{38, 46, 113, 121, -73, -78, -70, -67, -74, -75, 113, -59, -64, 113, -62, -58, -74, -61, -54, 113, -76, -78, -63, -78, -77, -70, -67, -70, -59, -70, -74, -60, 122, 78, 116, 102, -121, -71, -71, -69, -77, -81, -76, -83, Byte.MIN_VALUE, 102, -100, -31, -45, -47, -29, -32, -45, -107, -38, -34, -107, -90, -90, 105, 106, -91, -89, 107, 110, 125, -127, -94, -89, -101, -95, -82, -75, -80, -72, 117, 126, -99, 90, 89, -122, -122, -126, -125, 86, 88, -115, 92, 88, 92, 123, 107, -94, -94, -92, -91, -58, -60, -48, -59, -58, -45, -61, -79, -75, -80, -76, 102, 84, 88, 83, 88, 111, 93, 98, 92, 96, 84, 66, 71, 65, 70, -62, -75, -75, -81, -79, -78, -91, -91, -97, -94, 125, 112, 112, 106, 112, 126, 113, 113, 108, 113, 97, 103, 110, 95, 95, 97, 98, -125, -127, -115, -126, -125, -112, 99, 105, 112, 97, 109, 114, 110, 98, 100, -123, -125, -113, -124, -123, -110, -80, -74, -67, -70, -67, -96, -79, -46, -48, -36, -47, -46, -33, 73, 79, 86, 92, 117, 120, 104, 111, 121, 74, 107, 105, 117, 106, 107, 120, 79, 106, 114, 117, 110, 109, 41, 125, 120, 41, 122, 126, 110, 123, -126, 41, 108, 120, 109, 110, 108, 41, Byte.MIN_VALUE, 105, 106, 104, -124, 109, 110, 111, -60, -83, -79, -84, 117, 94, 98, 96, -81, -104, -100, -99, -53, -76, -69, -77, -85, -108, -101, -106, 103, 80, 87, 85, 110, 89, 86, -63, -81, -87, 82, 64, 61, -125, 116, 107, 88, 73, 67, -83, -78, -58, -28, -21, -20, -17, -26, -21, -28, -99, -22, -34, -23, -29, -20, -17, -22, -30, -31, -99, -66, -45, -82, -99, -32, -20, -31, -30, -32, -99, -16, -15, -17, -26, -21, -28, -73, -99, 83, 113, 120, 121, 124, 115, 120, 113, 42, 119, 107, 118, 112, 121, 124, 119, 111, 110, 42, 75, 96, 77, 42, 109, 121, 110, 111, 109, 42, 125, 126, 124, 115, 120, 113, 68, 42, 119, -107, -100, -99, -96, -105, -100, -107, 78, -101, -113, -102, -108, -99, -96, -101, -109, -110, 78, 114, -99, -102, -112, -89, 78, -124, -105, -95, -105, -99, -100, 78, -111, -99, -110, -109, -111, 78, -95, -94, -96, -105, -100, -107, 104, 78, -82, -52, -45, -44, -41, -50, -45, -52, -123, -46, -58, -47, -53, -44, -41, -46, -54, -55, -123, -83, -86, -69, -88, -123, -56, -44, -55, -54, -56, -123, -40, -39, -41, -50, -45, -52, -97, -123, -94, -64, -57, -56, -53, -62, -57, -64, 121, -58, -70, -59, -65, -56, -53, -58, -66, -67, 121, -90, -87, -115, -102, 121, -68, -56, -67, -66, -68, 121, -52, -51, -53, -62, -57, -64, -109, 121, 79, 109, 116, 117, 120, 111, 116, 109, 38, 115, 103, 114, 108, 117, 120, 115, 107, 106, 38, 92, 86, 63, 38, 105, 117, 106, 107, 105, 38, 121, 122, 120, 111, 116, 109, 64, 38, -74, -101, -100, -102, 97, 70, 71, 72, 119, 92, 96, 91, -53, -80, -76, -78, 93, 66, 70, 71, -84, -111, -104, -112, -73, -100, -93, -98, -69, -96, -89, -91, -101, -126, Byte.MAX_VALUE, -52, -77, -74, -24, 118, 96, 90, -63, -85, -88, -93, -112, -121, -118, 119, 113, 108, 111, 82, 99, -124, -126, -114, -125, -124, -111, -61, -37, -38, -33, -41, -71, -27, -38, -37, -39, -62, -33, -23, -22, -106, -73, -58, -65, -106, -38, -33, -38, -28, -99, -22, -106, -30, -33, -23, -22, -106, -23, -37, -39, -21, -24, -37, -106, -38, -37, -39, -27, -38, -37, -24, -106, -36, -27, -24, -80, -106, -48, -24, -25, -20, -28, -58, -14, -25, -24, -26, -40, -9, -20, -17, -54, -56, -45, -87, -64, -13, -12, -23, -22, -18, -87, -68, -68, -66, -87, -65, -32, -34, -22, -33, -32, -19, 111, 109, 120, 78, 109, 115, 78, 104, 101, 118, 99, 100, 118, 78, 100, -123, -125, -113, -124, -123, -110, -115, -117, -106, 108, -117, -110, -119, 108, Byte.MAX_VALUE, -109, -126, -121, -115, 108, -126, -125, -127, -115, -126, -125, -112, 108, Byte.MAX_VALUE, Byte.MAX_VALUE, -127, 92, 90, 101, 59, 90, 97, 88, 59, 78, 98, 81, 86, 92, 59, 81, 82, 80, 92, 81, 82, 95, 59, 81, 96, 93, 78, 80, 64, 96, 94, 105, 63, 94, 101, 92, 63, 82, 102, 85, 90, 96, 63, 85, 86, 84, 96, 85, 86, 99, 63, 99, 82, 104, -84, -86, -75, -117, -81, -79, -88, -117, -45, -58, -63, -62, -52, -117, -63, -62, -64, -52, -63, -62, -49, -56, -58, -47, -89, -52, -66, -68, -89, -58, -55, -84, -89, -67, -34, -36, -24, -35, -34, -21, 122, 120, -125, 89, 126, 112, 110, 89, -116, -116, -114, 89, -113, -112, -114, -120, -122, -111, 103, -116, 126, 124, 103, -90, -87, 108, 103, -99, -98, -100, 119, 117, Byte.MIN_VALUE, 86, 123, 109, 107, 86, -98, -104, 96, 86, -116, -115, -117, -60, -62, -51, -93, -41, -25, -40, -30, -93, -42, -22, -39, -34, -28, -93, -30, -27, -88, -93, -39, -38, -40, -28, -39, -38, -25, 106, 104, 115, 73, -126, -118, -118, -126, -121, Byte.MIN_VALUE, -102, -104, -93, 121, -78, -70, -70, -78, -73, -80, 121, -67, -84, -62, 121, -81, -80, -82, -70, -81, -80, -67, 101, 99, 110, 68, -126, 125, 123, 68, 119, 121, 73, 68, 122, 123, 121, -123, 122, 123, -120, -58, -60, -49, -91, -29, -34, -36, -91, -40, -29, -40, -38, -91, -37, -36, -38, -26, -37, -36, -23, -64, -66, -55, -97, -35, -40, -42, -97, -41, -35, -46, -44, -97, -43, -42, -44, -32, -43, -42, -29, 90, 88, 99, 57, 124, 110, 122, 120, 57, 108, Byte.MIN_VALUE, 111, 116, 122, 57, 111, 112, 110, 122, 111, 112, 125, 57, 108, 108, 110, 84, 82, 93, 51, 118, 104, 116, 114, 51, 102, 122, 105, 110, 116, 51, 105, 106, 104, 116, 105, 106, 119, 
        51, 114, 117, 56, 91, 89, 100, 58, 125, 111, 123, 121, 58, -126, 117, 112, 113, 123, 58, 112, 113, 111, 123, 112, 113, 126, 58, -126, 124, 68, -127, Byte.MAX_VALUE, -118, 96, -93, -90, -101, 96, -109, -89, -106, -101, -95, 96, -106, -105, -107, -95, -106, -105, -92, 96, -104, -98, -109, -107, -94, -96, -85, -127, -59, -72, -76, -65, -57, -72, -66, -127, -55, -68, -73, -72, -62, -127, -73, -72, -74, -62, -73, -72, -59, -127, -57, -56, -63, -63, -72, -65, -72, -73, 92, 67, -57, -73, -95, -92, -88, -69, -64, -80, -102, -99, -94, -76, 108, 92, 111, 76, 74, 105, 101, 67, 70, 72, 91, -107, -83, -85, -78, -78, -85, -80, -87, 98, -91, -79, -90, -89, -91, 98, -77, -52, -55, -52, -51, -43, -52, 126, -97, -76, -113, 126, -64, -57, -46, 126, -62, -61, -50, -46, -58, -104, 126, 105, -126, Byte.MAX_VALUE, -126, -125, -117, -126, 52, 85, 106, 69, 52, Byte.MIN_VALUE, 121, -118, 121, Byte.MIN_VALUE, 78, 52, 104, -127, 126, -127, -126, -118, -127, 51, 84, 105, 68, 51, -125, -123, -126, 121, 124, Byte.MAX_VALUE, 120, 77, 51, 100, 125, 122, 125, 126, -122, 125, 47, 80, 101, 82, 47, 123, 116, -123, 116, 123, 73, 47, 94, 119, 116, 119, 120, Byte.MIN_VALUE, 119, 41, 74, 95, 76, 41, 121, 123, 120, 111, 114, 117, 110, 67, 41, -120, -95, -98, -95, -94, -86, -95, 83, 119, -94, -97, -107, -84, 83, -119, -100, -90, -100, -94, -95, 83, -97, -104, -87, -104, -97, 83, -90, -89, -91, -100, -95, -102, 109, 83, -52, -27, -30, -27, -26, -18, -27, -105, -69, -26, -29, -39, -16, -105, -51, -32, -22, -32, -26, -27, -105, -25, -23, -26, -35, -32, -29, -36, -105, -22, -21, -23, -32, -27, -34, -79, -105, -111, -86, -89, -86, -85, -77, -86, 92, -124, -127, -110, Byte.MAX_VALUE, 92, -88, -95, -78, -95, -88, 92, -81, -80, -82, -91, -86, -93, 118, 92, -65, -40, -43, -40, -39, -31, -40, -118, -78, -81, -64, -83, -118, -38, -36, -39, -48, -45, -42, -49, -118, -35, -34, -36, -45, -40, -47, -92, -118, -127, -102, -105, -102, -101, -93, -102, 76, -126, 124, 101, 76, -104, -111, -94, -111, -104, 102, 76, 95, 120, 117, 120, 121, -127, 120, 42, 96, 90, 67, 42, 122, 124, 121, 112, 115, 118, 111, 68, 42, -53, -36, -44, -30, -32, -36, -45, -91, -52, -54, -78, -83, -106, -54, -46, -103, -105, -110, -121, 93, 86, -106, -89, -104, 99, 106, 126, 109, 114, 120, 56, 106, 108, 60, -29, -9, -26, -21, -15, -79, -29, -18, -29, -27, -66, -46, -63, -58, -52, -116, -62, -66, -64, -112, -38, -18, -35, -30, -24, -88, -34, -38, -36, -84, -90, -29, -24, -36, -32, -12, -29, -24, -18, -82, -27, -21, -32, -30, 118, -118, 121, 126, -124, 68, -127, 124, 66, 118, 120, 72, -35, -15, -32, -27, -21, -85, -23, -20, -80, -35, -87, -24, -35, -16, -23, -27, -7, -24, -19, -13, -77, -10, -27, -5, -71, -51, -68, -63, -57, -121, -48, -123, -60, -65, -123, -71, -60, -71, -69, 105, 125, 108, 113, 119, 55, Byte.MIN_VALUE, 53, 116, 111, 53, 110, 116, 105, 107, 122, -113, 73, 74, -67, -46, -65, -115, Byte.MAX_VALUE, -108, -127, 80, 116, 67, 63, -120, 87, 83, -122, -109, -119, -105, -108, -114, -119, -95, 112, 108, -97, -84, -94, -80, -83, -89, -94, 108, 122, 73, 69, 126, -122, -122, 126, -125, 124, 69, -96, 110, -88, -80, -68, -71, -81, -83, -83, -95, -98, -81, 106, -93, -79, -98, 108, -126, 126, -124, -116, 125, 114, 102, 119, 110, 115, 106, 113, 121, 106, 102, 121, 121, -37, -34, -94, -49, Byte.MAX_VALUE, 125, -120, 62, -79, -81, -70, 112, -88, -88, -81, -78, -89, -87, 112, -79, -81, -70, 112, -87, -79, -79, -87, -82, -89, 112, -81, -83, -72, 110, -79, -93, -81, -83, 110, -74, -87, -92, -91, -81, 110, -92, -91, -93, -81, -92, -91, -78, 110, -88, -91, -74, -93, -77, -73, -74, -92, -91, -93, -49, -51, -40, -114, -45, -59, -61, -114, 126, Byte.MIN_VALUE, 125, -126, 125, -125, -117, 121, -123, -117, -115, -122, Byte.MAX_VALUE, -69, -87, -74, -68, -73, -69, -36, -50, -52, -34, -37, -50, -106, -39, -43, -54, -30, -53, -54, -52, -44, -34, -48, -35, -35, -52, -39, -38, -38, -106, -105, -104, -111, -111, -120, -113, -120, -121, 80, -109, -113, -124, -100, -123, -124, -122, -114, -68, -81, -86, -85, -75, 117, -89, -68, -87, -109, -122, -127, -126, -116, 76, -127, -116, -119, Byte.MAX_VALUE, -106, 74, -109, -122, -112, -122, -116, -117, -42, -55, -60, -59, -49, -113, -60, -42, -65, -56, -59, -42, -61, -121, 122, 117, 118, Byte.MIN_VALUE, 64, 121, 118, -121, 116, -73, -86, -91, -90, -80, 112, -87, -90, -73, -92, -91, -73, -110, -123, -120, -120, -127, -49, -62, -59, -59, -66, -68, -117, -35, -48, -45, -45, -52, -41, -45, -36, -38, -14, -20, -84, -75, -67, -88, -79, -81, -73, -88, -10, -31, -18, -21, -30, -24, -16, -31, -29, -50, -37, -40, -43, -35, -50};
    }

    static {
        A0S();
        A04 = Pattern.compile(A0N(1409, 10, 105));
        A03 = new HashMap<>();
        A00 = -1;
    }

    public static int A01(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                String[] strArr = A02;
                if (strArr[1].charAt(25) != strArr[5].charAt(25)) {
                    throw new RuntimeException();
                }
                A02[6] = "DZPKdS2Suw7A2WWZJ933G9";
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return AdRequest.MAX_CONTENT_URL_LENGTH;
            case 10:
                return 1024;
            case 11:
                return a.f18931n;
            case 12:
                return CodedOutputStream.DEFAULT_BUFFER_SIZE;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                String[] strArr2 = A02;
                if (strArr2[7].length() != strArr2[0].length()) {
                    return 262144;
                }
                A02[6] = "rGSLArW4wjuPhJCwdOT1bb";
                return 262144;
            case 19:
                return 524288;
            case 20:
                String[] strArr3 = A02;
                if (strArr3[7].length() != strArr3[0].length()) {
                    String[] strArr4 = A02;
                    strArr4[1] = "wLRvbCdngZAUfcH4avaFWpzm7xzNBDhX";
                    strArr4[5] = "ZRniqCt1tWvnfBi63Es5g3xVwxlTTXOX";
                    return 1048576;
                }
                String[] strArr5 = A02;
                strArr5[7] = "1J9WAPDH";
                strArr5[0] = "ojx2FDNV";
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                String[] strArr6 = A02;
                if (strArr6[7].length() != strArr6[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr7 = A02;
                strArr7[1] = "HhCd7fNDUjEhzTtQ6bwt25XjXxvC9TfS";
                strArr7[5] = "UwbOSuOpodBkePRSfGCLdiRzlxyJVely";
                return 8388608;
            default:
                return -1;
        }
    }

    public static int A02(int i10) {
        switch (i10) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            case 20:
                return 32;
            case 21:
                return 64;
            case 22:
                return 128;
            case 30:
                return 256;
            case 31:
                return AdRequest.MAX_CONTENT_URL_LENGTH;
            case 32:
                return 1024;
            case 40:
                return a.f18931n;
            case 41:
                return CodedOutputStream.DEFAULT_BUFFER_SIZE;
            case 42:
                return 8192;
            case 50:
                String[] strArr = A02;
                if (strArr[2].length() != strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[2] = "y7ry7XILPOnd3z1nLDkYCS3XlcNdtN";
                strArr2[4] = "RVhUMYQJmNRV6rsRUCcyKJcF7GN3Qq";
                return 16384;
            case 51:
                return 32768;
            case 52:
                return 65536;
            default:
                if (A02[3].charAt(4) != 'G') {
                    A02[6] = "ZgkoiXmfXmSguzaTnFh2E0";
                    return -1;
                }
                throw new RuntimeException();
        }
    }

    public static int A03(int i10) {
        switch (i10) {
            case 1:
            case 2:
                return 25344;
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                if (A02[3].charAt(4) != 'G') {
                    String[] strArr = A02;
                    strArr[7] = "Gygeg3Rl";
                    strArr[0] = "7QkIcaw5";
                    return 202752;
                }
                throw new RuntimeException();
            case 128:
            case 256:
                return 414720;
            case AdRequest.MAX_CONTENT_URL_LENGTH /* 512 */:
                return 921600;
            case 1024:
                return 1310720;
            case a.f18931n /* 2048 */:
            case CodedOutputStream.DEFAULT_BUFFER_SIZE /* 4096 */:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    public static int A04(int i10) {
        switch (i10) {
            case 66:
                return 1;
            case 77:
                String[] strArr = A02;
                if (strArr[1].charAt(25) != strArr[5].charAt(25)) {
                    A02[3] = "kR19kTSe8LORPFodJPrKNGKIjznBVI3I";
                    return 2;
                }
                A02[3] = "c4b5OlH1VleXLEppfJwSoN6xrTrUh5Te";
                return 2;
            case 88:
                return 4;
            case 100:
                return 8;
            case 110:
                return 16;
            case 122:
                return 32;
            case 244:
                return 64;
            default:
                String[] strArr2 = A02;
                if (strArr2[7].length() != strArr2[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A02;
                strArr3[2] = "J03IUgD0PoFEhu0kdaV9RE5XA8DMil";
                strArr3[4] = "IMomj7QhmWZTfTeYvfi6cOsNLvqQyU";
                return -1;
        }
    }

    public static int A05(int i10) {
        switch (i10) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                String[] strArr = A02;
                if (strArr[2].length() != strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[2] = "s8i0dDADnv32QcyGbTcQWIdM4Bpmza";
                strArr2[4] = "a1aZBoASqOjXhB0NNyE0FSW3pVvlxx";
                return 5;
            case 6:
                return 6;
            case 17:
                return 17;
            case 20:
                return 20;
            case 23:
                return 23;
            case 29:
                return 29;
            case 39:
                return 39;
            case 42:
                return 42;
            default:
                return -1;
        }
    }

    public static int A06(int i10) {
        switch (i10) {
            case 10:
                return 1;
            case 11:
                return 2;
            case 20:
                return 4;
            case 21:
                return 8;
            case 30:
                if (A02[3].charAt(4) != 'G') {
                    A02[6] = "zVMNCzVjvGwrCJmz3Kv0Dx";
                    return 16;
                }
                break;
            case 31:
                return 32;
            case 40:
                return 64;
            case 41:
                String[] strArr = A02;
                if (strArr[7].length() == strArr[0].length()) {
                    String[] strArr2 = A02;
                    strArr2[2] = "uN5AwwAfcifznWh1OWVjiJQZlXC1fE";
                    strArr2[4] = "gaUov8CeXSNQPuNG4xRUsrmbQ0s0zM";
                    return 128;
                }
                break;
            case 50:
                return 256;
            case 51:
                return AdRequest.MAX_CONTENT_URL_LENGTH;
            case 60:
                return a.f18931n;
            case 61:
                return CodedOutputStream.DEFAULT_BUFFER_SIZE;
            case 62:
                return 8192;
            default:
                if (A02[3].charAt(4) != 'G') {
                    String[] strArr3 = A02;
                    strArr3[2] = "NwMjPyUaH0jwdJ0RJHpdvx7p5mlED0";
                    strArr3[4] = "D1vDG65V9z3WF2hMacqTQ6UAfh8Hje";
                    return -1;
                }
                break;
        }
        throw new RuntimeException();
    }

    public static int A07(int i10) {
        switch (i10) {
            case 0:
                String[] strArr = A02;
                if (strArr[2].length() != strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[2] = "5ML1Jv1G8o56LQn6XxHBnd5dSFaP13";
                strArr2[4] = "KfFU6g29IP1I1QemmoOVlFEfXqYrtZ";
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            default:
                return -1;
        }
    }

    public static /* synthetic */ int A08(Z2 z22) {
        String str = z22.A03;
        String name = A0N(861, 10, 22);
        if (str.startsWith(name)) {
            return 1;
        }
        String name2 = A0N(1560, 10, 32);
        if (str.startsWith(name2)) {
            return 1;
        }
        if (AbstractC1672gE.A02 < 26) {
            String name3 = A0N(725, 25, 12);
            if (str.equals(name3)) {
                String[] strArr = A02;
                String str2 = strArr[7];
                String name4 = strArr[0];
                if (str2.length() != name4.length()) {
                    throw new RuntimeException();
                }
                A02[3] = "feVptfzURif5Ud05KXXhW5ZLbwX60m9p";
                return -1;
            }
            return 0;
        }
        return 0;
    }

    public static /* synthetic */ int A09(Z2 z22) {
        return z22.A03.startsWith(A0N(861, 10, 22)) ? 1 : 0;
    }

    public static /* synthetic */ int A0A(ZY zy, Object obj, Object obj2) {
        return zy.A8m(obj2) - zy.A8m(obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b6, code lost:
        if (r4.equals(A0N(1549, 4, 87)) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> A0B(com.facebook.ads.redexgen.X.ZM r7) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.ZZ.A0B(com.facebook.ads.redexgen.X.ZM):android.util.Pair");
    }

    public static Pair<Integer, Integer> A0C(String str, String[] strArr) {
        int length = strArr.length;
        String A0N = A0N(428, 38, 84);
        String A0N2 = A0N(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 14, 126);
        if (length != 3) {
            AbstractC1633fb.A07(A0N2, A0N + str);
            return null;
        }
        try {
            int objectTypeIndication = Integer.parseInt(strArr[1], 16);
            if (A0N(1491, 15, 119).equals(Q2.A05(objectTypeIndication))) {
                int objectTypeIndication2 = Integer.parseInt(strArr[2]);
                int A05 = A05(objectTypeIndication2);
                if (A05 != -1) {
                    return new Pair<>(Integer.valueOf(A05), 0);
                }
            }
        } catch (NumberFormatException unused) {
            AbstractC1633fb.A07(A0N2, A0N + str);
        }
        return null;
    }

    public static Pair<Integer, Integer> A0D(String str, String[] strArr) {
        int parseInt;
        int parseInt2;
        int length = strArr.length;
        String A0N = A0N(307, 37, 5);
        String A0N2 = A0N(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 14, 126);
        if (length < 2) {
            AbstractC1633fb.A07(A0N2, A0N + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                parseInt = Integer.parseInt(strArr[1].substring(0, 2), 16);
                parseInt2 = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                parseInt = Integer.parseInt(strArr[1]);
                parseInt2 = Integer.parseInt(strArr[2]);
            } else {
                AbstractC1633fb.A07(A0N2, A0N + str);
                return null;
            }
            int A042 = A04(parseInt);
            if (A042 == -1) {
                AbstractC1633fb.A07(A0N2, A0N(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, 21, 4) + parseInt);
                return null;
            }
            int levelInteger = A02(parseInt2);
            if (levelInteger == -1) {
                AbstractC1633fb.A07(A0N2, A0N(1193, 19, 10) + parseInt2);
                return null;
            }
            return new Pair<>(Integer.valueOf(A042), Integer.valueOf(levelInteger));
        } catch (NumberFormatException unused) {
            AbstractC1633fb.A07(A0N2, A0N + str);
            return null;
        }
    }

    public static Pair<Integer, Integer> A0E(String str, String[] strArr) {
        int length = strArr.length;
        String A0N = A0N(344, 46, 41);
        String levelString = A0N(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 14, 126);
        if (length < 3) {
            AbstractC1633fb.A07(levelString, A0N + str);
            return null;
        }
        Matcher matcher = A04.matcher(strArr[1]);
        if (!matcher.matches()) {
            AbstractC1633fb.A07(levelString, A0N + str);
            return null;
        }
        String group = matcher.group(1);
        Integer profile = A0L(group);
        if (profile == null) {
            AbstractC1633fb.A07(levelString, A0N(1268, 37, 114) + group);
            return null;
        }
        String str2 = strArr[2];
        Integer A0K = A0K(str2);
        if (A0K == null) {
            AbstractC1633fb.A07(levelString, A0N(1233, 35, 46) + str2);
            return null;
        }
        return new Pair<>(profile, A0K);
    }

    public static Pair<Integer, Integer> A0F(String str, String[] strArr) {
        int length = strArr.length;
        String A0N = A0N(466, 37, 1);
        String A0N2 = A0N(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 14, 126);
        if (length < 3) {
            AbstractC1633fb.A07(A0N2, A0N + str);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int profile = A07(parseInt);
            if (profile == -1) {
                AbstractC1633fb.A07(A0N2, A0N(1380, 21, 5) + parseInt);
                return null;
            }
            int profileInteger = A06(parseInt2);
            if (profileInteger == -1) {
                AbstractC1633fb.A07(A0N2, A0N(1361, 19, 39) + parseInt2);
                return null;
            }
            return new Pair<>(Integer.valueOf(profile), Integer.valueOf(profileInteger));
        } catch (NumberFormatException unused) {
            AbstractC1633fb.A07(A0N2, A0N + str);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c7, code lost:
        if (r1 == 6) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> A0G(java.lang.String r9, java.lang.String[] r10, com.google.android.exoplayer2.ColorInfo r11) {
        /*
            int r5 = r10.length
            r3 = 4
            r2 = 270(0x10e, float:3.78E-43)
            r1 = 37
            r0 = 120(0x78, float:1.68E-43)
            java.lang.String r4 = A0N(r2, r1, r0)
            r8 = 0
            r2 = 615(0x267, float:8.62E-43)
            r1 = 14
            r0 = 126(0x7e, float:1.77E-43)
            java.lang.String r2 = A0N(r2, r1, r0)
            if (r5 >= r3) goto L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.facebook.ads.redexgen.X.AbstractC1633fb.A07(r2, r0)
            return r8
        L2e:
            r0 = 1
            r0 = r10[r0]     // Catch: java.lang.NumberFormatException -> Ldc
            int r7 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> Ldc
            r3 = 2
            r1 = r10[r3]     // Catch: java.lang.NumberFormatException -> Ldc
            r0 = 0
            java.lang.String r0 = r1.substring(r0, r3)     // Catch: java.lang.NumberFormatException -> Ldc
            int r5 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> Ldc
            r0 = 3
            r0 = r10[r0]     // Catch: java.lang.NumberFormatException -> Ldc
            int r6 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> Ldc
            if (r7 == 0) goto L69
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r3 = 1172(0x494, float:1.642E-42)
            r1 = 21
            r0 = 14
            java.lang.String r0 = A0N(r3, r1, r0)
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.facebook.ads.redexgen.X.AbstractC1633fb.A07(r2, r0)
            return r8
        L69:
            r1 = 8
            if (r6 == r1) goto L90
            r0 = 10
            if (r6 == r0) goto L90
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r3 = 1130(0x46a, float:1.583E-42)
            r1 = 23
            r0 = 89
            java.lang.String r0 = A0N(r3, r1, r0)
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.facebook.ads.redexgen.X.AbstractC1633fb.A07(r2, r0)
            return r8
        L90:
            if (r6 != r1) goto Lb9
            r3 = 1
        L93:
            int r1 = A01(r5)
            r0 = -1
            if (r1 != r0) goto Lce
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r3 = 1153(0x481, float:1.616E-42)
            r1 = 19
            r0 = 15
            java.lang.String r0 = A0N(r3, r1, r0)
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.facebook.ads.redexgen.X.AbstractC1633fb.A07(r2, r0)
            return r8
        Lb9:
            if (r11 == 0) goto Lcc
            byte[] r0 = r11.A04
            if (r0 != 0) goto Lc9
            int r1 = r11.A03
            r0 = 7
            if (r1 == r0) goto Lc9
            int r1 = r11.A03
            r0 = 6
            if (r1 != r0) goto Lcc
        Lc9:
            r3 = 4096(0x1000, float:5.74E-42)
            goto L93
        Lcc:
            r3 = 2
            goto L93
        Lce:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            return r0
        Ldc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.facebook.ads.redexgen.X.AbstractC1633fb.A07(r2, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.ZZ.A0G(java.lang.String, java.lang.String[], com.google.android.exoplayer2.ColorInfo):android.util.Pair");
    }

    public static Pair<Integer, Integer> A0H(String str, String[] strArr, ColorInfo colorInfo) {
        int i10;
        int length = strArr.length;
        String A0N = A0N(390, 38, 96);
        String A0N2 = A0N(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 14, 126);
        if (length < 4) {
            AbstractC1633fb.A07(A0N2, A0N + str);
            return null;
        }
        Matcher matcher = A04.matcher(strArr[1]);
        if (!matcher.matches()) {
            AbstractC1633fb.A07(A0N2, A0N + str);
            return null;
        }
        String group = matcher.group(1);
        if (A0N(77, 1, 103).equals(group)) {
            i10 = 1;
        } else {
            String[] strArr2 = A02;
            String profileString = strArr2[7];
            if (profileString.length() != strArr2[0].length()) {
                throw new RuntimeException();
            }
            A02[3] = "c0fMYsBI2G0b69e8OBJU5zNcb9h8hVD8";
            if (A0N(86, 1, 86).equals(group)) {
                if (colorInfo != null && colorInfo.A03 == 6) {
                    i10 = CodedOutputStream.DEFAULT_BUFFER_SIZE;
                } else {
                    i10 = 2;
                }
            } else {
                AbstractC1633fb.A07(A0N2, A0N(1332, 29, 101) + group);
                return null;
            }
        }
        String levelString = strArr[3];
        Integer A0M = A0M(levelString);
        if (A0M == null) {
            AbstractC1633fb.A07(A0N2, A0N(1305, 27, 55) + levelString);
            return null;
        }
        return new Pair<>(Integer.valueOf(i10), A0M);
    }

    public static Z2 A0I() throws ZW {
        return A0J(A0N(1506, 9, 127), false, false);
    }

    public static Z2 A0J(String str, boolean z10, boolean z11) throws ZW {
        List<Z2> A0R = A0R(str, z10, z11);
        if (A0R.isEmpty()) {
            return null;
        }
        return A0R.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer A0K(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.ZZ.A0K(java.lang.String):java.lang.Integer");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Integer A0L(String str) {
        char c10;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 1536:
                if (str.equals(A0N(57, 2, 113))) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 1537:
                String[] strArr = A02;
                if (strArr[7].length() == strArr[0].length()) {
                    A02[3] = "lelDUncmc70ccni8s43asgLNC5UWMlEm";
                    if (str.equals(A0N(59, 2, 52))) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                } else {
                    throw new RuntimeException();
                }
            case 1538:
                String[] strArr2 = A02;
                if (strArr2[1].charAt(25) == strArr2[5].charAt(25)) {
                    String[] strArr3 = A02;
                    strArr3[7] = "J85HS2dO";
                    strArr3[0] = "jv0ZKFrJ";
                    if (str.equals(A0N(61, 2, 112))) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                } else {
                    throw new RuntimeException();
                }
            case 1539:
                if (str.equals(A0N(63, 2, 54))) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1540:
                if (str.equals(A0N(65, 2, 72))) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1541:
                if (str.equals(A0N(67, 2, 109))) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1542:
                if (str.equals(A0N(69, 2, 102))) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 1543:
                if (str.equals(A0N(71, 2, 121))) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 1544:
                if (str.equals(A0N(73, 2, 123))) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 1545:
                if (str.equals(A0N(75, 2, 64))) {
                    c10 = '\t';
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
                return 1;
            case 1:
                return 2;
            case 2:
                String[] strArr4 = A02;
                if (strArr4[7].length() != strArr4[0].length()) {
                    String[] strArr5 = A02;
                    strArr5[2] = "6ShHmwAYwcqH3ilJm1gFZS88cUj4ce";
                    strArr5[4] = "sZg1SMRxg4DffPZnP4poVsOgnZvsXL";
                    return 4;
                }
                A02[3] = "IavLbEdCFMYbCUr2B7Od086J6TpYKjMP";
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case '\b':
                return 256;
            case '\t':
                Integer valueOf = Integer.valueOf((int) AdRequest.MAX_CONTENT_URL_LENGTH);
                if (A02[6].length() != 22) {
                    throw new RuntimeException();
                }
                String[] strArr6 = A02;
                strArr6[1] = "DS4D4XIWWZN2imqo6jVjpdUe5xfuuUKD";
                strArr6[5] = "B1D2wyVBDWzEVBJIEi7Hzl5yQxbemupR";
                return valueOf;
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ba, code lost:
        if (r10.equals(r3) != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01bc, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ca, code lost:
        if (r10.equals(r3) != false) goto L129;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer A0M(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.ZZ.A0M(java.lang.String):java.lang.Integer");
    }

    public static String A0O(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        String[] supportedTypes;
        for (String supportedType : mediaCodecInfo.getSupportedTypes()) {
            boolean equalsIgnoreCase = supportedType.equalsIgnoreCase(str2);
            String[] strArr = A02;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A02[6] = "k7o502k2nPItdNvRhvnNOp";
            if (equalsIgnoreCase) {
                return supportedType;
            }
        }
        if (str2.equals(A0N(1765, 18, 24))) {
            if (A0N(651, 21, 27).equals(str)) {
                return A0N(1806, 12, 60);
            }
            if (A0N(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS, 21, 88).equals(str) || A0N(IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, 34, 78).equals(str)) {
                return A0N(1783, 13, 91);
            }
            return null;
        } else if (str2.equals(A0N(1435, 10, 125)) && A0N(912, 20, 114).equals(str)) {
            return A0N(1515, 15, 83);
        } else {
            if (str2.equals(A0N(1469, 10, 122))) {
                String[] strArr2 = A02;
                if (strArr2[2].length() != strArr2[4].length()) {
                    throw new RuntimeException();
                }
                A02[6] = "2CbZ80OvquNR2ZlJfDi1w2";
                if (A0N(932, 20, 108).equals(str)) {
                    return A0N(1530, 15, 3);
                }
            }
            if (str2.equals(A0N(1426, 9, 4)) && A0N(893, 19, 17).equals(str)) {
                return A0N(1479, 12, 16);
            }
            return null;
        }
    }

    public static String A0P(ZM zm) {
        Pair<Integer, Integer> codecProfileAndLevel;
        if (A0N(1455, 14, 116).equals(zm.A0W)) {
            return A0N(1445, 10, 88);
        }
        if (A0N(1765, 18, 24).equals(zm.A0W) && (codecProfileAndLevel = A0B(zm)) != null) {
            int profile = ((Integer) codecProfileAndLevel.first).intValue();
            if (profile == 16 || profile == 256) {
                return A0N(1796, 10, 12);
            }
            if (profile == 512) {
                return A0N(1756, 9, 65);
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> */
    public static synchronized List<Z2> A0R(String str, boolean z10, boolean z11) throws ZW {
        ZX rs;
        synchronized (ZZ.class) {
            ZV zv = new ZV(str, z10, z11);
            List<Z2> list = A03.get(zv);
            if (list != null) {
                return list;
            }
            if (AbstractC1672gE.A02 >= 21) {
                rs = new RR(z10, z11);
            } else {
                rs = new RS();
            }
            ArrayList<Z2> A0Q = A0Q(zv, rs);
            if (z10 && A0Q.isEmpty() && 21 <= AbstractC1672gE.A02 && AbstractC1672gE.A02 <= 23) {
                A0Q = A0Q(zv, new RS());
                if (!A0Q.isEmpty()) {
                    AbstractC1633fb.A07(A0N(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 14, 126), A0N(564, 51, 113) + str + A0N(34, 12, 65) + A0Q.get(0).A03);
                }
            }
            A0T(str, A0Q);
            OI A05 = OI.A05(A0Q);
            A03.put(zv, A05);
            return A05;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bb, code lost:
        if (r0.equals(r5) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0T(java.lang.String r13, java.util.List<com.facebook.ads.redexgen.X.Z2> r14) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.ZZ.A0T(java.lang.String, java.util.List):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZY != com.google.android.exoplayer2.mediacodec.MediaCodecUtil$ScoreProvider<T> */
    public static <T> void A0U(List<T> list, final ZY<T> zy) {
        Collections.sort(list, new Comparator() { // from class: com.facebook.ads.redexgen.X.ZT
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ZZ.A0A(ZY.this, obj, obj2);
            }
        });
    }

    public static boolean A0V(MediaCodecInfo mediaCodecInfo) {
        return AbstractC1672gE.A02 >= 29 && A0W(mediaCodecInfo);
    }

    public static boolean A0W(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    public static boolean A0X(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean A0Y(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    public static boolean A0Z(MediaCodecInfo mediaCodecInfo) {
        if (AbstractC1672gE.A02 >= 29) {
            return A0a(mediaCodecInfo);
        }
        String A012 = AbstractC1756hb.A01(mediaCodecInfo.getName());
        String codecName = A0N(1644, 11, 61);
        if (!A012.startsWith(codecName)) {
            String codecName2 = A0N(1570, 11, 57);
            if (!A012.startsWith(codecName2)) {
                String codecName3 = A0N(1581, 10, 18);
                if (!A012.startsWith(codecName3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A0a(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static boolean A0b(MediaCodecInfo mediaCodecInfo, String str) {
        if (AbstractC1672gE.A02 >= 29) {
            return A0X(mediaCodecInfo);
        }
        return !A0c(mediaCodecInfo, str);
    }

    public static boolean A0c(MediaCodecInfo mediaCodecInfo, String str) {
        if (AbstractC1672gE.A02 >= 29) {
            return A0Y(mediaCodecInfo);
        }
        if (Q2.A0C(str)) {
            return true;
        }
        String A012 = AbstractC1756hb.A01(mediaCodecInfo.getName());
        String codecName = A0N(1422, 4, 48);
        if (A012.startsWith(codecName)) {
            return false;
        }
        String codecName2 = A0N(1644, 11, 61);
        if (A012.startsWith(codecName2)) {
            return true;
        }
        String[] strArr = A02;
        if (strArr[1].charAt(25) != strArr[5].charAt(25)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[1] = "BfuvYMu29zcQIJSKLpJ8Pw0ASx6Zt4Nu";
        strArr2[5] = "BlYL91MWigd3FE8bzeDAxR8UMxE9gVgV";
        String codecName3 = A0N(1633, 11, 61);
        if (A012.startsWith(codecName3)) {
            return true;
        }
        String codecName4 = A0N(1688, 8, 91);
        if (A012.startsWith(codecName4)) {
            String codecName5 = A0N(53, 4, 98);
            if (A012.contains(codecName5)) {
                return true;
            }
        }
        String codecName6 = A0N(1655, 33, 59);
        if (A012.equals(codecName6)) {
            return true;
        }
        String codecName7 = A0N(1570, 11, 57);
        if (A012.startsWith(codecName7)) {
            return true;
        }
        String codecName8 = A0N(1581, 10, 18);
        if (A012.startsWith(codecName8)) {
            return true;
        }
        String codecName9 = A0N(1629, 4, 11);
        if (!A012.startsWith(codecName9)) {
            String codecName10 = A0N(1557, 3, 12);
            if (!A012.startsWith(codecName10)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0354, code lost:
        if (A0N(com.ironsource.mediationsdk.utils.IronSourceConstants.RV_CHECK_PLACEMENT_CAPPED, 5, 20).equals(com.facebook.ads.redexgen.X.AbstractC1672gE.A03) != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0400, code lost:
        if (r6.startsWith(r5) != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x040e, code lost:
        if (r6.startsWith(r5) != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00db, code lost:
        if (com.facebook.ads.redexgen.X.AbstractC1672gE.A03.startsWith(A0N(268, 2, 96)) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01dd, code lost:
        if (A0N(1109, 6, 17).equals(com.facebook.ads.redexgen.X.AbstractC1672gE.A03) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x024f, code lost:
        if (A0N(117, 5, 12).equals(com.facebook.ads.redexgen.X.AbstractC1672gE.A03) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x029f, code lost:
        if (A0N(com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, 22, 118).equals(r8) != false) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0d(android.media.MediaCodecInfo r7, java.lang.String r8, boolean r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 1197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.ZZ.A0d(android.media.MediaCodecInfo, java.lang.String, boolean, java.lang.String):boolean");
    }
}

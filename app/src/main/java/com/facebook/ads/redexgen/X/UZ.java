package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class UZ {
    public static byte[] A00;
    public static String[] A01 = {"M7wI3H9FKzyXVcVHGmWAFEry0q8odmLA", "o2SZ1XZGvIBjcWLMlCSx1X7Fx3wtWrqZ", "TserLfyOTj8VBRtLTJ5dR", "zLaWO7ikrlhAyuDayzui0JFw5msxIogc", "nPEYcqSgayQktn2vQb4aQlCK0KOLR3q4", "yb5C2oRIBk14u", "EK9vLgIU0kFgoLLRCkDXyLA1czjYHcFq", "QtuV0fNvLWrUpfezcoySJHCiZo0jn0hl"};
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;
    public static final int[] A05;
    public static final int[] A06;
    public static final int[] A07;
    public static final String[] A08;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{-125, -105, -122, -117, -111, 81, -113, -110, -121, -119, -91, -71, -88, -83, -77, 115, -79, -76, -87, -85, 113, -112, 117, -4, 16, -1, 4, 10, -54, 8, 11, 0, 2, -56, -25, -51};
    }

    static {
        A05();
        A08 = new String[]{A04(10, 13, 40), A04(23, 13, 127), A04(0, 10, 6)};
        A07 = new int[]{44100, 48000, 32000};
        A02 = new int[]{32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
        A06 = new int[]{32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
        A03 = new int[]{32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
        A04 = new int[]{32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
        A05 = new int[]{8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    }

    public static int A00(int i10) {
        int i11;
        int layer;
        int padding;
        int i12;
        int version;
        int version2;
        if (!A06(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (layer = (i10 >>> 17) & 3) == 0 || (padding = (i10 >>> 12) & 15) == 0 || padding == 15 || (i12 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i13 = A07[i12];
        if (i11 == 2) {
            i13 /= 2;
        } else if (i11 == 0) {
            i13 /= 4;
        }
        int i14 = (i10 >>> 9) & 1;
        if (layer == 3) {
            if (i11 == 3) {
                int version3 = padding - 1;
                version2 = A02[version3];
            } else {
                int[] iArr = A06;
                int layer2 = padding - 1;
                String[] strArr = A01;
                String str = strArr[6];
                String str2 = strArr[1];
                int samplingRate = str.charAt(14);
                int version4 = str2.charAt(14);
                if (samplingRate != version4) {
                    throw new RuntimeException();
                }
                A01[2] = "CnikfV3xS98UFi7I8CE6P";
                version2 = iArr[layer2];
            }
            return (((version2 * 12) / i13) + i14) * 4;
        }
        if (i11 == 3) {
            if (layer == 2) {
                int version5 = padding - 1;
                version = A03[version5];
            } else {
                int[] iArr2 = A04;
                int samplingRate2 = A01[5].length();
                if (samplingRate2 == 6) {
                    throw new RuntimeException();
                }
                A01[5] = "f7Zn6tT0yAQk6";
                int version6 = padding - 1;
                version = iArr2[version6];
            }
        } else {
            int version7 = padding - 1;
            version = A05[version7];
        }
        if (i11 == 3) {
            return ((version * 144) / i13) + i14;
        }
        int layer3 = (layer == 1 ? 72 : 144) * version;
        String[] strArr2 = A01;
        String str3 = strArr2[6];
        String str4 = strArr2[1];
        int samplingRate3 = str3.charAt(14);
        int version8 = str4.charAt(14);
        if (samplingRate3 != version8) {
            return (layer3 / i13) + i14;
        }
        String[] strArr3 = A01;
        strArr3[6] = "urVogKFAAE6EvZLSoKvQaC7d0asbupVR";
        strArr3[1] = "LF10raY6BFoWKGLxej2lL3VHQWOSRWl3";
        return (layer3 / i13) + i14;
    }

    public static int A01(int i10) {
        int i11;
        int layer;
        if (!A06(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (layer = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i12 = (i10 >>> 12) & 15;
        int version = i10 >>> 10;
        int version2 = version & 3;
        if (i12 == 0 || i12 == 15 || version2 == 3) {
            return -1;
        }
        int version3 = A02(i11, layer);
        return version3;
    }

    public static int A02(int i10, int i11) {
        switch (i11) {
            case 1:
                return i10 == 3 ? 1152 : 576;
            case 2:
                return 1152;
            case 3:
                return 384;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static boolean A06(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }
}

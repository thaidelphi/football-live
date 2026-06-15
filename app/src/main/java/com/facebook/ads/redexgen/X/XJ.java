package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class XJ {
    public static byte[] A05;
    public static String[] A06 = {"58By1xz9Rh5hryJLIDyh003hjsI0lyIE", "HjtrxM8ilO8Z2FhyLxFPsyBcrsn62jy2", "4dBhv8AxOYr8CGU3ph7faumyuTKAx0Kp", "778pKx87nActyaaewVQmaW5nz6FNYXsy", "gseVCSHD1mFENwOgl8q7q8G1wYU2PWoi", "AtIPg5CtYVFE3mrbL7ZpQzYtC1CxgwKG", "vwPZh3w8Bw5byhp8wA0eqZa2uXs5Fkwp", "RAnITn0AZcJID8b1fAncsOtB2RKhCJQa"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 3);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{83, 39, 14, 19, 12, 0, 21, 91, 103, 108, 102, 43, 44, 57, 42, 44, 43, 44, 33, 52, 61, 102, 119, 106, 102};
    }

    static {
        A02();
    }

    public XJ(int i10, int i11, int i12, int i13, int i14) {
        this.A02 = i10;
        this.A00 = i11;
        this.A03 = i12;
        this.A04 = i13;
        this.A01 = i14;
    }

    public static XJ A00(String str) {
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        String A01 = A01(1, 7, 98);
        AbstractC1589es.A07(str.startsWith(A01));
        int startTimeIndex = A01.length();
        String[] keys = TextUtils.split(str.substring(startTimeIndex), A01(0, 1, 124));
        int i14 = 0;
        while (true) {
            int startTimeIndex2 = keys.length;
            int textIndex = -1;
            if (i14 < startTimeIndex2) {
                String A012 = AbstractC1756hb.A01(keys[i14].trim());
                int startTimeIndex3 = A012.hashCode();
                switch (startTimeIndex3) {
                    case 100571:
                        if (A012.equals(A01(8, 3, 1))) {
                            textIndex = 1;
                            break;
                        }
                        break;
                    case 3556653:
                        String A013 = A01(21, 4, 17);
                        String[] strArr = A06;
                        String str2 = strArr[6];
                        String str3 = strArr[7];
                        int endTimeIndex = str2.charAt(23);
                        int startTimeIndex4 = str3.charAt(23);
                        if (endTimeIndex == startTimeIndex4) {
                            break;
                        } else {
                            String[] strArr2 = A06;
                            strArr2[6] = "hm9yiOYAKaTdT4AAKs2MzvMODTkeDI71";
                            strArr2[7] = "rkHMaKqyJB66rLyWKGxaX3BTM0hlAx65";
                            if (A012.equals(A013)) {
                                textIndex = 3;
                                break;
                            }
                        }
                        break;
                    case 109757538:
                        String A014 = A01(11, 5, 91);
                        String[] strArr3 = A06;
                        String str4 = strArr3[6];
                        String str5 = strArr3[7];
                        int endTimeIndex2 = str4.charAt(23);
                        int startTimeIndex5 = str5.charAt(23);
                        if (endTimeIndex2 == startTimeIndex5) {
                            break;
                        } else {
                            String[] strArr4 = A06;
                            strArr4[0] = "t0Mmc8Epbz1mx1DDeVgK7AGTczF7jz2K";
                            strArr4[4] = "9ZCXatAEgZlVxkwxK9MRCc28dOTrxdqB";
                            if (A012.equals(A014)) {
                                textIndex = 0;
                                break;
                            }
                        }
                        break;
                    case 109780401:
                        if (A012.equals(A01(16, 5, 91))) {
                            textIndex = 2;
                            break;
                        }
                        break;
                }
                switch (textIndex) {
                    case 0:
                        i10 = i14;
                        break;
                    case 1:
                        i11 = i14;
                        break;
                    case 2:
                        i12 = i14;
                        break;
                    case 3:
                        i13 = i14;
                        break;
                }
                i14++;
            } else if (i10 != -1 && i11 != -1 && i13 != -1) {
                return new XJ(i10, i11, i12, i13, keys.length);
            } else {
                return null;
            }
        }
        throw new RuntimeException();
    }
}

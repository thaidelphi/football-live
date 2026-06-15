package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: com.facebook.ads.redexgen.X.dv  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1530dv {
    public static byte[] A00;
    public static String[] A01 = {"pDeK4If9f629aq3CRkrp0Fu253", "2IxDQ1FbSrPR4KpDqGN4Yxt", "MNxukNS8NVrt79lQPoFW9wUhyH3Skkxc", "nwY5aqKWcaspw22ML9sMpaz2RHxxnbqO", "cV3a0bTQOvASh0VxOrwUJrKjSY71LWyF", "GT1sriu0a7BI2kZpGB1ddeLeL31", "iQyUbPltXqK4gOA4Uaq8Yz2weVl178tx", "SIU17CCn"};
    public static final Pattern A02;
    public static final Pattern A03;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[1].length() != 23) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "TGjViVv7JbPcjygwM3W3WX2xvZI1v8dQ";
            strArr[4] = "T46E6X8N4lQd61rk3Adh7SRXAnD1hkTG";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 22);
            i13++;
        }
    }

    public static void A04() {
        A00 = new byte[]{105, -47, -3, -3, -7, -34, -3, -14, -11, -120, -83, -94, -82, -83, -78, -88, -78, -77, -92, -83, -77, 95, -89, -92, -96, -93, -92, -79, -78, 95, -102, -83, -58, -67, -48, -56, -67, -69, -52, -67, -68, 120, -101, -57, -58, -52, -67, -58, -52, -123, -92, -67, -58, -65, -52, -64, 120, -77, -82, -57, -66, -47, -55, -66, -68, -51, -66, -67, 121, -100, -56, -57, -51, -66, -57, -51, -122, -85, -70, -57, -64, -66, 121, -76, 118, -64, -125, -66, -50, -27, -32, -47, -33, -116, -108, -85, -90, -108, -85, -90, -56, -48, -105, -103, -56, -48, -105, -107, -24, -56, -106, -107, -101, -108, -56, -48, -105, -107, -64, -41, -46, -61, -47, 126, -122, -70, -62, -119, -121, -117, -122, -70, -62, -119, -121, -115, -122, -99, -104, -70, -62, -119, -38, -70, -120, -121, -100, -77, -82, -97, -83, 119};
    }

    static {
        A04();
        A03 = Pattern.compile(A02(118, 28, 72));
        A02 = Pattern.compile(A02(88, 30, 86));
    }

    public static long A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = A02.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) AbstractC1589es.A01(matcher.group(1)));
        }
        return -1L;
    }

    public static long A01(String str, String str2) {
        long j10 = -1;
        boolean isEmpty = TextUtils.isEmpty(str);
        String A022 = A02(84, 1, 3);
        String A023 = A02(1, 8, 115);
        if (!isEmpty) {
            try {
                j10 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                AbstractC1633fb.A05(A023, A02(31, 27, 66) + str + A022);
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            Matcher matcher = A03.matcher(str2);
            if (matcher.matches()) {
                try {
                    long parseLong = (Long.parseLong((String) AbstractC1589es.A01(matcher.group(2))) - Long.parseLong((String) AbstractC1589es.A01(matcher.group(1)))) + 1;
                    if (A01[5].length() != 30) {
                        A01[5] = "TTNCMeE85cRdex";
                        if (j10 < 0) {
                            return parseLong;
                        }
                        int i10 = (j10 > parseLong ? 1 : (j10 == parseLong ? 0 : -1));
                        String[] strArr = A01;
                        if (strArr[6].charAt(27) != strArr[4].charAt(27)) {
                            A01[2] = "WZvuQVopZ9x5ghlrMEMxsNTbIUdY1SAX";
                            if (i10 == 0) {
                                return j10;
                            }
                        } else {
                            String[] strArr2 = A01;
                            strArr2[0] = "OwImKd1qhqds0GCaPhttWxIfP4";
                            strArr2[7] = "pvJOTdKe";
                            if (i10 == 0) {
                                return j10;
                            }
                        }
                        AbstractC1633fb.A07(A023, A02(9, 22, 41) + str + A02(85, 3, 77) + str2 + A022);
                        j10 = Math.max(j10, parseLong);
                        return j10;
                    }
                    throw new RuntimeException();
                } catch (NumberFormatException unused2) {
                    AbstractC1633fb.A05(A023, A02(58, 26, 67) + str2 + A022);
                    return j10;
                }
            }
            return j10;
        }
        return j10;
    }

    public static String A03(long j10, long j11) {
        if (j10 == 0 && j11 == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A02(146, 6, 36));
        sb.append(j10);
        sb.append(A02(0, 1, 38));
        if (j11 != -1) {
            sb.append((j10 + j11) - 1);
        }
        return sb.toString();
    }
}

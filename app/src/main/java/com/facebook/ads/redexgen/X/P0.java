package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class P0 {
    public static byte[] A00;
    public static String[] A01 = {"Q6M248UdEKsfA5cD3fbKbu90kHMotYCc", "7h88XVyRVBVdEUwD4wXRnLVeGzZsIgQy", "Go0", "ZsEAEoNH4Z9WLEs7Rqn5rSYJ9tl", "dNlhSSERgjT67RyILA4ywu82piqYUlsG", "O03wSW8sdzJZuWjGzkZWdPNOPgAxMZbA", "NEhlKnMa41TXq2iulRLPljipPyrxtohW", "kNeSg3iQiRXxI1x3I5DKinblXexk8lrR"};

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 97);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-29, 22, 22, 24, -77, -26, -24, -72, -61, -10, -8, -55, -57, -6, -3, 13, 12, -40, 11, 23, 28, -43, 8, 29, 16, -31, 22, 32, 25, -85, -30, -32, -80, -61, -5, 1, -10, -8, -86, -30, -24, -14, -51, 9, 15, 4, 6, -90, -30, -24, -33, 2, 65, 6, 68, -80, -17, -74, -49, 14, 10, 5, -56, 7, 3, -2, 3, 14, 77, 75, -27, 36, 39, -22, 1, 64, 67, 7, -46, 17, 20, 9, 11, -52, 11, 14, 5, -96, -31, -39, -87, -22, -21, -16, -18, -76, -10, -7, -88, -19, -25, -32, -36, 34, 33, -7, 65, 63, 63, -25, 48, 26, 47, -24, 49, 27, 48, 31, -18, 55, 37, 34, 45, -45, 28, 10, 7, 27, 25, 25, -28, 16, 15, 21, 6, 15, 21, -50, -11, 26, 17, 6, 37, 52, 52, 48, 45, 39, 37, 56, 45, 51, 50, -13, 49, 52, -8, 56, 71, 71, 67, 64, 58, 56, 75, 64, 70, 69, 6, 78, 60, 57, 68, -48, -28, -45, -40, -34, -98, -94, -42, -33, -33, 12, 32, 15, 20, 26, -38, 12, 14, -34, -48, -28, -45, -40, -34, -98, -48, -46, -93, -12, 8, -9, -4, 2, -62, -12, 0, 5, 25, 45, 28, 33, 39, -25, 25, 37, 42, -27, 47, 26, 1, 21, 4, 9, 15, -49, 5, 1, 3, -45, -45, -25, -42, -37, -31, -95, -41, -45, -43, -91, -97, -36, -31, -43, -58, -38, -55, -50, -44, -108, -53, -47, -58, -56, 37, 57, 40, 45, 51, -13, 49, 45, 40, 45, -53, -33, -50, -45, -39, -103, -41, -38, -98, 34, 54, 37, 42, 48, -16, 46, 49, 38, 40, 23, 43, 26, 31, 37, -27, 37, 29, 29, -48, -28, -45, -40, -34, -98, -26, -48, -27, 56, 76, 59, 64, 70, 6, 78, 60, 57, 68, 9, 29, 12, 17, 23, -41, 32, -43, 21, 9, 28, 26, 23, 27, 19, 9, -27, -23, -35, -29, -31, -85, -26, -20, -31, -29, 9, -6, 13, 9, -60, 11, 9, 9, 8, -5, -10, -9, 1, -63, -1, 2, -60, 2, -36, -49, -54, -53, -43, -107, -45, -42, -104, -38, 76, 63, 58, 59, 69, 5, 67, 70, 10, -13, -26, -31, -30, -20, -84, -12, -30, -33, -22, -7, -20, -25, -24, -14, -78, -5, -80, -23, -17, -7, -22, -35, -40, -39, -29, -93, -20, -95, -31, -43, -24, -26, -29, -25, -33, -43, -32, -45, -50, -49, -39, -103, -30, -105, -41, -35, -32, -45, -50, -49, -39};
    }

    static {
        A04();
    }

    public static int A00(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        String filename = A03(4, 4, 36);
        if (lastPathSegment.endsWith(filename)) {
            return 0;
        }
        String filename2 = A03(29, 4, 28);
        if (lastPathSegment.endsWith(filename2)) {
            return 0;
        }
        String filename3 = A03(8, 4, 52);
        if (lastPathSegment.endsWith(filename3)) {
            return 1;
        }
        String filename4 = A03(12, 5, 56);
        if (lastPathSegment.endsWith(filename4)) {
            return 2;
        }
        String filename5 = A03(0, 4, 84);
        if (lastPathSegment.endsWith(filename5)) {
            return 2;
        }
        String filename6 = A03(17, 4, 73);
        if (lastPathSegment.endsWith(filename6)) {
            String filename7 = A01[2];
            if (filename7.length() != 22) {
                A01[4] = "LYt9Grwanx42gjQ5czMyMDBSLII4BppM";
                return 3;
            }
        } else {
            String filename8 = A03(33, 5, 52);
            if (lastPathSegment.endsWith(filename8)) {
                return 4;
            }
            String filename9 = A03(38, 4, 27);
            if (lastPathSegment.endsWith(filename9)) {
                return 5;
            }
            String filename10 = A03(58, 4, 64);
            if (!lastPathSegment.endsWith(filename10)) {
                String A03 = A03(62, 5, 57);
                if (A01[0].charAt(4) == '0') {
                    throw new RuntimeException();
                }
                A01[7] = "4MXCHaWrFzHMW3WLUAb4nN";
                if (lastPathSegment.endsWith(A03)) {
                    return 15;
                }
                String filename11 = A01[2];
                if (filename11.length() == 22) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[6] = "1kPkDVCqs4vlIMsHycGs0zkePVR5OoVM";
                strArr[5] = "nlXmUhG8CeAONYDiqulZyljBPaTWZSvm";
                String filename12 = A03(98, 4, 25);
                if (lastPathSegment.endsWith(filename12)) {
                    return 15;
                }
                int length = lastPathSegment.length();
                String A032 = A03(67, 3, 127);
                if (!lastPathSegment.startsWith(A032, length - (A032.length() + 1))) {
                    String filename13 = A03(118, 5, 95);
                    if (lastPathSegment.endsWith(filename13)) {
                        return 6;
                    }
                    String filename14 = A03(70, 4, 86);
                    if (lastPathSegment.endsWith(filename14)) {
                        return 7;
                    }
                    String A033 = A03(74, 4, 114);
                    if (!lastPathSegment.endsWith(A033)) {
                        int length2 = lastPathSegment.length();
                        String A034 = A03(55, 3, 33);
                        int length3 = A034.length();
                        if (A01[0].charAt(4) != '0') {
                            A01[0] = "wb0PfpDpJu2baLI6Ym1KLA9HIfQPTuvc";
                            if (!lastPathSegment.startsWith(A034, length2 - (length3 + 1)) && !lastPathSegment.startsWith(A033, lastPathSegment.length() - (A033.length() + 1))) {
                                int length4 = lastPathSegment.length();
                                String A035 = A03(25, 4, 82);
                                if (lastPathSegment.startsWith(A035, length4 - (A035.length() + 1))) {
                                    return 8;
                                }
                                int length5 = lastPathSegment.length();
                                String A036 = A03(87, 3, 17);
                                if (!lastPathSegment.startsWith(A036, length5 - (A036.length() + 1))) {
                                    String filename15 = A03(90, 5, 26);
                                    if (lastPathSegment.endsWith(filename15)) {
                                        return 9;
                                    }
                                    String filename16 = A03(95, 3, 37);
                                    if (lastPathSegment.endsWith(filename16)) {
                                        return 10;
                                    }
                                    String[] strArr2 = A01;
                                    if (strArr2[6].charAt(24) != strArr2[5].charAt(24)) {
                                        throw new RuntimeException();
                                    }
                                    A01[4] = "9bvAI1ld7chb84DrE78uia93r0dMHICi";
                                    String filename17 = A03(78, 5, 67);
                                    if (!lastPathSegment.endsWith(filename17)) {
                                        String filename18 = A03(83, 4, 61);
                                        if (!lastPathSegment.endsWith(filename18)) {
                                            String filename19 = A03(51, 4, 115);
                                            if (lastPathSegment.endsWith(filename19)) {
                                                return 10;
                                            }
                                            String A037 = A03(102, 3, 77);
                                            if (lastPathSegment.endsWith(A037) || lastPathSegment.startsWith(A037, lastPathSegment.length() - (A037.length() + 1))) {
                                                return 11;
                                            }
                                            String[] strArr3 = A01;
                                            if (strArr3[6].charAt(24) != strArr3[5].charAt(24)) {
                                                String[] strArr4 = A01;
                                                strArr4[6] = "d6XamE0lv6TG4bYguC9VovLvPvi5q1O1";
                                                strArr4[5] = "LVjoK53HU3fe1yRiBh4pWTK7PgPjaCxY";
                                                String filename20 = A03(109, 4, 88);
                                                if (lastPathSegment.endsWith(filename20)) {
                                                    return 12;
                                                }
                                            } else {
                                                A01[2] = "UJeVoww4r1wic53EaeAdeKH";
                                                String filename21 = A03(109, 4, 88);
                                                if (lastPathSegment.endsWith(filename21)) {
                                                    return 12;
                                                }
                                            }
                                            String filename22 = A03(113, 5, 89);
                                            if (lastPathSegment.endsWith(filename22)) {
                                                return 12;
                                            }
                                            String filename23 = A03(105, 4, 106);
                                            if (lastPathSegment.endsWith(filename23)) {
                                                return 13;
                                            }
                                            String filename24 = A03(123, 7, 68);
                                            if (lastPathSegment.endsWith(filename24)) {
                                                return 13;
                                            }
                                            String filename25 = A03(47, 4, 23);
                                            if (lastPathSegment.endsWith(filename25)) {
                                                return 14;
                                            }
                                            String filename26 = A01[3];
                                            if (filename26.length() != 27) {
                                                throw new RuntimeException();
                                            }
                                            A01[2] = "qw4LTekO";
                                            String filename27 = A03(42, 5, 62);
                                            if (lastPathSegment.endsWith(filename27)) {
                                                return 14;
                                            }
                                            String filename28 = A03(21, 4, 70);
                                            if (!lastPathSegment.endsWith(filename28)) {
                                                return -1;
                                            }
                                            return 16;
                                        }
                                        return 10;
                                    }
                                    return 10;
                                }
                                return 9;
                            }
                            return 8;
                        }
                    } else {
                        return 8;
                    }
                } else {
                    return 6;
                }
            } else {
                return 15;
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x019e, code lost:
        if (r3.equals(A03(339, 8, 33)) != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a0, code lost:
        r0 = 23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b5, code lost:
        if (r3.equals(A03(339, 8, 52)) != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0264, code lost:
        if (r3.equals(A03(232, 14, 17)) != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0266, code lost:
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0271, code lost:
        if (r3.equals(A03(232, 14, 17)) != false) goto L110;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.P0.A01(java.lang.String):int");
    }

    public static int A02(Map<String, List<String>> responseHeaders) {
        List<String> list = responseHeaders.get(A03(130, 12, 64));
        return A01((list == null || list.isEmpty()) ? null : list.get(0));
    }
}

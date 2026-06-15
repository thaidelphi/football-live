package com.facebook.ads.redexgen.X;

import com.google.common.base.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.Os  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1014Os implements InterfaceC1791iE<Character> {
    public static byte[] A00;
    public static String[] A01 = {"hclkFSbi6Vg1BfvH0wmaDr4dbn73", "G9lpasi9RBaNNLModxK5K8gUTz14LheK", "Gftcr", "paUG0VLHuMGB0YhbqyP1Nk9wNO1yz", "Gk6etbpP6dMkcTEXSV9xUYuIVF", "di9Lt", "", "3ewjDWS3ktgbM1wBomSiDURsX5cxFOtv"};

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 13);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{-80, -79, -78, -77, -76, -75, -74, -73, -72, -71, -63, -62, -61, -60, -59, -58};
    }

    public abstract boolean A09(char c10);

    static {
        A07();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.0l] */
    public static C04120l A02(final char match) {
        return new AbstractC05054b(match) { // from class: com.facebook.ads.redexgen.X.0l
            public static byte[] A01;
            public static String[] A02 = {"9yE19", "zOI7IBt", "QcxtIsV3beme0fSshBZEiAbzAb", "54lX5AjhAsj9h7", "50Stt6", "IBfS2nVlEcQ7MYOv0zA4iOMcJ", "2Gh0ygEYZnFezhOBR", "xA0qoezlN6x4dJxmGj9eAbu4w6XV572R"};
            public final char A00;

            public static String A00(int i10, int i11, int i12) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
                for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                    byte b10 = (byte) ((copyOfRange[i13] ^ i12) ^ 115);
                    if (A02[2].length() != 26) {
                        throw new RuntimeException();
                    }
                    A02[1] = "Dls36CWZuql1";
                    copyOfRange[i13] = b10;
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                byte[] bArr = {55, 57, 25, 50, 59, 40, 23, 59, 46, 57, 50, 63, 40, 116, 51, 41, 114, 125};
                if (A02[1].length() == 27) {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[0] = "urSdB";
                strArr[6] = "hh6CYTzAaza6NCd4D";
                A01 = bArr;
            }

            static {
                A01();
            }

            {
                this.A00 = match;
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC1014Os
            public final boolean A09(char c10) {
                return c10 == this.A00;
            }

            public final String toString() {
                String A04;
                StringBuilder append = new StringBuilder().append(A00(2, 16, 41));
                A04 = AbstractC1014Os.A04(this.A00);
                return append.append(A04).append(A00(0, 2, 99)).toString();
            }
        };
    }

    public static AbstractC1014Os A03() {
        AbstractC1014Os abstractC1014Os = C0S.A01;
        if (A01[1].charAt(7) != 'R') {
            A01[1] = "RCT2CzV9IWXJqUHkaSW8fbkoFpPJrj9F";
            return abstractC1014Os;
        }
        throw new RuntimeException();
    }

    public static String A04(char c10) {
        String A06 = A06(0, 16, 115);
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i10 = 0;
        while (A01[7].charAt(17) != '8') {
            A01[3] = "qYlA5j1UP55Q3fDxlHttfnhdcQNgK";
            if (i10 < 4) {
                cArr[5 - i10] = A06.charAt(c10 & 15);
                c10 = (char) (c10 >> 4);
                i10++;
            } else {
                String hex = String.copyValueOf(cArr);
                return hex;
            }
        }
        throw new RuntimeException();
    }

    public int A08(CharSequence sequence, int start) {
        int length = sequence.length();
        AbstractC1790iD.A01(start, length);
        while (start < length) {
            char charAt = sequence.charAt(start);
            String[] strArr = A01;
            String str = strArr[2];
            String str2 = strArr[5];
            int i10 = str.length();
            int length2 = str2.length();
            if (i10 != length2) {
                throw new RuntimeException();
            }
            A01[1] = "6mJi9OgqL4fnjCQ1IPpC8dqdRNdbhMMp";
            if (A09(charAt)) {
                return start;
            }
            start++;
        }
        return -1;
    }

    @Deprecated
    public boolean A0A(Character character) {
        return A09(character.charValue());
    }
}

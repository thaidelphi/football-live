package com.facebook.ads.redexgen.X;

import com.google.common.base.ElementTypesAreNonnullByDefault;
@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.hb  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1756hb {
    public static String[] A00 = {"lKk5JaLmUx95KK", "mYuNW", "CjAKdLXppofA1D702KwO", "uXJpTDaVRtNVAp70rLVfm", "1hSAC5HvnjUxrHV2J", "HaqnzSsBrGrjOCqNCVI", "GKVrteGYxon0I6T9VCiXJnLEHrJ03INP", "n4WaWuAzWRB0VbcGBeRJywBcIsl3WCc7"};

    public static int A00(char c10) {
        return (char) ((c10 | ' ') - 97);
    }

    public static String A01(String string) {
        int length = string.length();
        int i10 = 0;
        while (i10 < length) {
            if (A02(string.charAt(i10))) {
                char[] chars = string.toCharArray();
                while (i10 < length) {
                    char c10 = chars[i10];
                    if (A02(c10)) {
                        int length2 = c10 ^ ' ';
                        chars[i10] = (char) length2;
                    }
                    i10++;
                }
                String valueOf = String.valueOf(chars);
                int i11 = A00[5].length();
                if (i11 != 28) {
                    A00[5] = "jxLLbSZUx5pXLcCA85YTs8Y";
                    return valueOf;
                }
                throw new RuntimeException();
            }
            i10++;
        }
        return string;
    }

    public static boolean A02(char c10) {
        return c10 >= 'A' && c10 <= 'Z';
    }

    public static boolean A03(CharSequence s12, CharSequence s22) {
        int length = s12.length();
        if (s12 == s22) {
            return true;
        }
        int length2 = s22.length();
        if (length != length2) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = s12.charAt(i10);
            char charAt2 = s22.charAt(i10);
            if (charAt != charAt2) {
                int A002 = A00(charAt);
                if (A00[6].charAt(27) != '0') {
                    throw new RuntimeException();
                }
                A00[6] = "1S1N8LGAQqFvlHlBSY2lJ7CUB7v0Wvcl";
                if (A002 < 26) {
                    int length3 = A00(charAt2);
                    if (A002 == length3) {
                    }
                }
                return false;
            }
        }
        return true;
    }
}

package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract /* synthetic */ class FV {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 117);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{51, 52, 59, 56, 60, 56, 67, 52, 65};
    }

    public static /* synthetic */ String A01(CharSequence charSequence, CharSequence[] charSequenceArr) {
        if (charSequence != null) {
            StringBuilder sb = new StringBuilder();
            if (charSequenceArr.length > 0) {
                sb.append(charSequenceArr[0]);
                for (int i10 = 1; i10 < charSequenceArr.length; i10++) {
                    sb.append(charSequence);
                    sb.append(charSequenceArr[i10]);
                }
            }
            return sb.toString();
        }
        throw new NullPointerException(A00(0, 9, 90));
    }
}

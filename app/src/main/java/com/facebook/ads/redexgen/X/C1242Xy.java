package com.facebook.ads.redexgen.X;

import android.text.Layout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Xy  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1242Xy {
    public static byte[] A0B;
    public static String[] A0C = {"", "Dx0gqyT9rf", "LkAQd3gGQgPirXdcntceVnYtoXsqyJaD", "bwNh6S9W5fVpeedjvRszw551anOMItVA", "UdyyRBupZSqYz169Sw0QzqlQV82zROvp", "6aSIjuybDqRgiQomBCXCbLzdiItuQEt", "pudzxoMZY4rXTfDJ9MEQktW0pVIFMyHt", "2Iddxo"};
    public CharSequence A0A;
    public long A09 = 0;
    public long A08 = 0;
    public int A06 = 2;
    public float A00 = -3.4028235E38f;
    public int A04 = 1;
    public int A03 = 0;
    public float A01 = -3.4028235E38f;
    public int A05 = RecyclerView.UNDEFINED_DURATION;
    public float A02 = 1.0f;
    public int A07 = RecyclerView.UNDEFINED_DURATION;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 110);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        String[] strArr = A0C;
        if (strArr[1].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[2] = "nZmS3iJ7wg4zbed8AEKfn2WcdaoHQsbQ";
        strArr2[3] = "T66VSKYBwItuKMdBMouKZW63b6KgqAy0";
        A0B = new byte[]{86, 109, 104, 109, 108, 116, 109, 35, 119, 102, 123, 119, 66, 111, 106, 100, 109, 110, 102, 109, 119, 57, 35, 83, 97, 102, 114, 112, 112, 71, 113, 97, 84, 101, 118, 119, 97, 118};
    }

    static {
        A06();
    }

    public static float A00(float f10, int i10) {
        if (f10 != -3.4028235E38f && i10 == 0 && (f10 < 0.0f || f10 > 1.0f)) {
            return 1.0f;
        }
        if (f10 != -3.4028235E38f) {
            return f10;
        }
        return i10 == 0 ? 1.0f : -3.4028235E38f;
    }

    public static float A01(int i10) {
        switch (i10) {
            case 4:
                String[] strArr = A0C;
                if (strArr[2].charAt(14) != strArr[3].charAt(14)) {
                    throw new RuntimeException();
                }
                A0C[5] = "bRI";
                return 0.0f;
            case 5:
                return 1.0f;
            default:
                return 0.5f;
        }
    }

    public static float A02(int i10, float f10) {
        switch (i10) {
            case 0:
                return 1.0f - f10;
            case 1:
                if (f10 <= 0.5f) {
                    return 2.0f * f10;
                }
                return (1.0f - f10) * 2.0f;
            case 2:
                return f10;
            default:
                throw new IllegalStateException(String.valueOf(i10));
        }
    }

    public static int A03(int i10) {
        switch (i10) {
            case 1:
            case 4:
                return 0;
            case 2:
            default:
                return 1;
            case 3:
            case 5:
                return 2;
        }
    }

    public static Layout.Alignment A04(int i10) {
        switch (i10) {
            case 1:
            case 4:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 5:
                return Layout.Alignment.ALIGN_OPPOSITE;
            default:
                AbstractC1633fb.A07(A05(23, 15, 106), A05(0, 23, 109) + i10);
                return null;
        }
    }

    public final C1235Xr A07() {
        return new C1235Xr(A08().A0H(), this.A09, this.A08);
    }

    public final C1446cY A08() {
        int A03;
        float A01 = this.A01 != -3.4028235E38f ? this.A01 : A01(this.A06);
        if (this.A05 != Integer.MIN_VALUE) {
            A03 = this.A05;
        } else {
            A03 = A03(this.A06);
        }
        C1446cY A0A = new C1446cY().A0F(A04(this.A06)).A07(A00(this.A00, this.A04), this.A04).A09(this.A03).A04(A01).A0A(A03);
        float f10 = this.A02;
        float position = A02(A03, A01);
        C1446cY A0B2 = A0A.A06(Math.min(f10, position)).A0B(this.A07);
        if (this.A0A != null) {
            A0B2.A0G(this.A0A);
        }
        return A0B2;
    }
}

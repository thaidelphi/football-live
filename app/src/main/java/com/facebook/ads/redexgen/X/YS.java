package com.facebook.ads.redexgen.X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class YS {
    public static byte[] A05;
    public static String[] A06 = {"HHf7SoU351EiSnSla0A9kJoDbLtlmLLH", "MAvTUEmW3Qq7zutUsJpSIMoSBa5TROAg", "Iwe1kcnN9nnsnTvLj2pOSpbm1", "uP5SqS945a3YWZY24GGPS8t7JBS2PVpS", "ZgWLINwsPQAkhEb6IfQfZ8RQut", "Ykve2qMsRtNPykrC1", "7D2EcvnsAKqaDDhoj", "OGuVuhXNw7AjqN93jo2ZNhpmPE"};
    public int A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final String A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A06[1].charAt(11) == 's') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[4] = "nvDqYUdZmWYVClK8n80pOPBxZz";
            strArr[7] = "ufBNVaGkwwDnRTydyMt66fBHf2";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 91);
            i13++;
        }
    }

    public static void A02() {
        A05 = new byte[]{8, 48, 50, 57, 50, 37, 54, 35, 50, 25, 50, 32, 30, 51, Byte.MAX_VALUE, 126, 119, 58, 34, 36, 35, 119, 53, 50, 119, 52, 54, 59, 59, 50, 51, 119, 53, 50, 49, 56, 37, 50, 119, 37, 50, 35, 37, 62, 50, 33, 62, 57, 48, 119, 62, 51, 36, 121};
    }

    static {
        A02();
    }

    public YS(int i10, int i11) {
        this(RecyclerView.UNDEFINED_DURATION, i10, i11);
    }

    public YS(int i10, int i11, int i12) {
        String A00 = A00(0, 0, 31);
        this.A04 = i10 != Integer.MIN_VALUE ? i10 + A00(0, 1, 124) : A00;
        this.A02 = i11;
        this.A03 = i12;
        this.A00 = RecyclerView.UNDEFINED_DURATION;
        this.A01 = A00;
    }

    private void A01() {
        if (this.A00 != Integer.MIN_VALUE) {
            return;
        }
        throw new IllegalStateException(A00(1, 53, 12));
    }

    public final int A03() {
        A01();
        return this.A00;
    }

    public final String A04() {
        A01();
        return this.A01;
    }

    public final void A05() {
        this.A00 = this.A00 == Integer.MIN_VALUE ? this.A02 : this.A00 + this.A03;
        this.A01 = this.A04 + this.A00;
    }
}

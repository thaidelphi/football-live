package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.fc  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1634fc {
    public static byte[] A02;
    public static String[] A03 = {"f3nlwPlzCxddnxVlGVaLXVCuNYcQpPrJ", "yUHFn50QSsJzCb2qaxEfPEdUaOjzjFYh", "5zK0Z9Wax96R7Dd", "watMdMsZ9Vk8Ns9Tv5i2G", "EsLiaHJjtBW9cr1dLTwWXWvON2jPJSL3", "fmlFJJ7DMEtfBTvliklSiSiXlZl", "qMmyltOakV3fdJiKTEitFjBL6rcLFOpx", "h5JdlRRIyBbU2rX"};
    public int A00;
    public long[] A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 52);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-37, -49, 34, 24, 41, 20, -49, 24, 34, -49, -97, -60, -52, -73, -62, -65, -70, 118, -65, -60, -70, -69, -50, 118};
    }

    static {
        A01();
    }

    public C1634fc() {
        this(32);
    }

    public C1634fc(int i10) {
        this.A01 = new long[i10];
    }

    public final int A02() {
        return this.A00;
    }

    public final long A03(int i10) {
        if (i10 >= 0 && i10 < this.A00) {
            long j10 = this.A01[i10];
            if (A03[3].length() != 21) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[6] = "qXhUw0ve85DrTv8RmxDFc58lKLfNdt32";
            strArr[0] = "64qOvkrltGcOrnRk0o1sUajnJGxJnpeP";
            return j10;
        }
        throw new IndexOutOfBoundsException(A00(10, 14, 34) + i10 + A00(0, 10, 123) + this.A00);
    }

    public final void A04(long j10) {
        if (this.A00 == this.A01.length) {
            this.A01 = Arrays.copyOf(this.A01, this.A00 * 2);
        }
        long[] jArr = this.A01;
        int i10 = this.A00;
        this.A00 = i10 + 1;
        jArr[i10] = j10;
    }

    public final long[] A05() {
        return Arrays.copyOf(this.A01, this.A00);
    }
}

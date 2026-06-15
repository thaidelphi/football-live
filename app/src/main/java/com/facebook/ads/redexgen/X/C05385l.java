package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.5l  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C05385l {
    public static byte[] A01;
    public final InterfaceC05375k A00;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private int A00(List<C5N> list) {
        int size = list.size() - 1;
        if (size >= 0) {
            list.get(size);
            throw new NullPointerException(A01(0, 3, 72));
        }
        return -1;
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{61, 51, 58};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A03(List<C5N> list, int i10, int i11) {
        list.get(i10);
        list.get(i11);
        throw new NullPointerException(A01(0, 3, 72));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A04(List<C5N> list) {
        int A00 = A00(list);
        if (A00 != -1) {
            A03(list, A00, A00 + 1);
            throw null;
        }
    }

    public C05385l(InterfaceC05375k interfaceC05375k) {
        this.A00 = interfaceC05375k;
    }
}

package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Ui  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1153Ui {
    public static byte[] A02;
    public static String[] A03 = {"DcZnPoy59v7sj6PT8aConXR6jEPAL960", "Pv8IBEx58pJkNNVPq5bnbeRuMFJtpa1x", "3Zs54Ju7SHVe", "H", "RKR9j3xEV0ivPjQ8DuOkvj9eC5GtakEP", "8QNaCEG2mWsibXa4TFiVJYyhNMyXSiHE", "uazceyLmjty8LR90DaJQZdEYzqeKFyaJ", "Ew5eYlEYbVVB"};
    public final C1154Uk A00;
    public final C1154Uk A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 127);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{70, 74, 28, 56};
    }

    static {
        A01();
    }

    public C1153Ui(C1154Uk c1154Uk) {
        this(c1154Uk, c1154Uk);
    }

    public C1153Ui(C1154Uk c1154Uk, C1154Uk c1154Uk2) {
        this.A00 = (C1154Uk) AbstractC1589es.A01(c1154Uk);
        this.A01 = (C1154Uk) AbstractC1589es.A01(c1154Uk2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        String[] strArr = A03;
        if (strArr[1].charAt(6) != strArr[4].charAt(6)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[7] = "TGB2jMu9Hb97";
        strArr2[3] = "v";
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1153Ui c1153Ui = (C1153Ui) obj;
        return this.A00.equals(c1153Ui.A00) && this.A01.equals(c1153Ui.A01);
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        return A00(2, 1, 56) + this.A00 + (this.A00.equals(this.A01) ? A00(0, 0, 31) : A00(0, 2, 21) + this.A01) + A00(3, 1, 26);
    }
}

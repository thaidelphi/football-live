package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Um  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1156Um {
    public static String[] A04 = {"QZnKiNp6aAK0W5en9QSJY87yWFlnf2Z1", "oEGFaIsL4lk1wqhaVuVQeqsaTU2VcNJy", "HxvJk", "H", "Vyrg", "kWuVGImLIC7NK2kT0FHI1OZvhh7ViNOP", "nylCWDh2dpN6tpgalRHWkNoQnb7bXTbh", "eI"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final byte[] A03;

    public C1156Um(int i10, byte[] bArr, int i11, int i12) {
        this.A01 = i10;
        this.A03 = bArr;
        this.A02 = i11;
        this.A00 = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1156Um c1156Um = (C1156Um) obj;
        int i10 = this.A01;
        int i11 = c1156Um.A01;
        if (A04[0].charAt(18) != 'M') {
            A04[6] = "9hF1qABLqaGESEzJKHa21vqeYo2qhQjD";
            if (i10 == i11 && this.A02 == c1156Um.A02 && this.A00 == c1156Um.A00 && Arrays.equals(this.A03, c1156Um.A03)) {
                return true;
            }
            return false;
        }
        throw new RuntimeException();
    }

    public final int hashCode() {
        int result = this.A01;
        int i10 = result * 31;
        int result2 = Arrays.hashCode(this.A03);
        int result3 = this.A00;
        return ((((i10 + result2) * 31) + this.A02) * 31) + result3;
    }
}

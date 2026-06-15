package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class P2 {
    public static String[] A02 = {"vvXNO3IGf0jtXBRiRMutVUVTaNouuPHo", "ldsibeag4bTqwMSTEhmKYtR5sBlVAkiy", "esdGaW2sWntP63tan63ddlKhWV9x", "fBj9kbhvkDklWFwnmCxJ1TSE0KysK7lL", "fUTIPpiVbRb14PUJg1jMPPKghBFN", "nnXryiYoY3", "Zulw1J4JoqvXkWcP9LsgodMh1SN1fYNI", "DrCJiKo0Cs"};
    public boolean A00;
    public final SparseBooleanArray A01 = new SparseBooleanArray();

    public final P2 A00(int i10) {
        AbstractC1589es.A08(!this.A00);
        this.A01.append(i10, true);
        return this;
    }

    public final P2 A01(int i10, boolean z10) {
        if (z10) {
            return A00(i10);
        }
        return this;
    }

    public final P2 A02(P3 p32) {
        int i10 = 0;
        while (true) {
            int A00 = p32.A00();
            if (A02[3].charAt(12) != 'W') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "XTWzdbVRGay4dlzOwVM0CtM8O6e9";
            strArr[4] = "FYAZWPl8jLUw9VoL7t4AoKR30icC";
            if (i10 < A00) {
                int i11 = p32.A01(i10);
                A00(i11);
                i10++;
            } else {
                return this;
            }
        }
    }

    public final P2 A03(int... iArr) {
        for (int i10 : iArr) {
            A00(i10);
        }
        return this;
    }

    public final P3 A04() {
        AbstractC1589es.A08(!this.A00);
        this.A00 = true;
        return new P3(this.A01);
    }
}

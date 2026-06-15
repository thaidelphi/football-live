package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.fx  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1655fx {
    public static byte[] A02;
    public static String[] A03 = {"6LSk8vmCybkn5q9EMQmazCjUkkyprp6m", "u13GSQLWnZfIvMiC8CngCOg", "IPAOVoqPVWjFC8rdgkz5jJxhQnAZUKZy", "gKMJdAPVEH8XQs9epIgJONAR6NtJLXJp", "XOVw4mOAcLc616KwRRFBarzNgS", "WO1mCvac6Q8jQd73Zg6ibi7EIhv6USk4", "Okq", "ro2svsnYT1XkXSpZ2WcZu3Lxz4eZRw63"};
    public static final C1655fx A04;
    public static final C1655fx A05;
    public final int A00;
    public final int A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 61);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {40};
        if (A03[5].charAt(12) == 'i') {
            throw new RuntimeException();
        }
        A03[5] = "hcNk43lt01C8AkUazfuDIRzHm94TOv7o";
        A02 = bArr;
    }

    static {
        A01();
        A04 = new C1655fx(-1, -1);
        A05 = new C1655fx(0, 0);
    }

    public C1655fx(int i10, int i11) {
        AbstractC1589es.A07((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.A01 = i10;
        this.A00 = i11;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03() {
        return this.A01;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1655fx)) {
            return false;
        }
        C1655fx c1655fx = (C1655fx) obj;
        return this.A01 == c1655fx.A01 && this.A00 == c1655fx.A00;
    }

    public final int hashCode() {
        return this.A00 ^ ((this.A01 << 16) | (this.A01 >>> 16));
    }

    public final String toString() {
        return this.A01 + A00(0, 1, 109) + this.A00;
    }
}

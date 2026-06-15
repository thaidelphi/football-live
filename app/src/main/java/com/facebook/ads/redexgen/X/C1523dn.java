package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.dn  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1523dn {
    public static String[] A02 = {"uzGx3mPcW", "LPG96fRjRTqxhXqRTz3L0aFDBAJb5WJR", "90wCL6ETH6mYZTwdo9IDiaWyD6S8l9rV", "QeCVqlRCmvtERc4jSn5UvaLkguqp6o4J", "BvrtGiCjHRNOdXG8qA6zZoH9RmsQfpO3", "8ot6gtTpKRVgM", "ZJvLohZQlihQqGFfLF50i0YNqI8wuEfS", "MpVKWTB0Rrr0V4TSTvqY1WjlnJ3gfgHv"};
    public static final C1523dn A03 = new C1523dn();
    public byte A00 = 3;
    public boolean A01 = true;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C1523dn)) {
            return false;
        }
        if (A02[4].charAt(8) != 'H') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[5] = "ciZoeRuhXnowV";
        strArr[0] = "ParGDPToI";
        C1523dn c1523dn = (C1523dn) obj;
        if (this.A00 == c1523dn.A00) {
            boolean z10 = this.A01;
            String[] strArr2 = A02;
            if (strArr2[1].charAt(21) != strArr2[3].charAt(21)) {
                String[] strArr3 = A02;
                strArr3[5] = "LrCcWexORG0fW";
                strArr3[0] = "bMqx0H3DS";
                if (z10 == c1523dn.A01) {
                    return true;
                }
            } else {
                A02[4] = "4IC1KBP8HdlyuEB0bYnmw83NKGcT4aca";
                if (z10 == c1523dn.A01) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return new Byte(this.A00).hashCode() + new Boolean(this.A01).hashCode();
    }
}

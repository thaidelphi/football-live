package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.co  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1462co {
    public static String[] A02 = {"fovKo2ewLf2GSK9jeear2gS7CowNwxa", "KlGOIL0Oaip6PstgZpnBK85QcCEbYE5x", "a3eX", "FFMxCeQQyGyq4O1GggLVF7QLgDcKRoDY", "cXL4SXe3GsCuoCx0Vnr", "CP9ZXNuNfwc2kIiOsVMHIXJu8wbF", "jroPQLP8oYSHq8f", "LdJsqk09jUSo22s"};
    public final long A00;
    public final long A01;

    public C1462co(long j10, long j11) {
        this.A01 = j10;
        this.A00 = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1462co) {
            String[] strArr = A02;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A02[3] = "9viJvoP4kT6AyuEGwZSXX7SsGy7u7XxA";
            C1462co c1462co = (C1462co) obj;
            return this.A01 == c1462co.A01 && this.A00 == c1462co.A00;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}

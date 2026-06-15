package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.eh  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1578eh {
    public static String[] A02 = {"Bn", "9DA", "9mAqQdDlXtiaQJsyDKizhzwS8miA0rsR", "8fIMAkA79t8k", "YVZ9WAhxf3KC5bp7jPpNZyngG4QC8uk7", "Vc9epR1HSseJWmGE9rg", "gVweXsC1OR4JfQ7LaxgqEl28x0x6GhkR", "saOb5aNxIMPALRV3Lvi"};
    public final long A00;
    public final long A01;

    public C1578eh(long j10, long j11) {
        this.A01 = j10;
        this.A00 = j11;
    }

    public final boolean A00(long j10, long j11) {
        if (this.A00 != -1) {
            return j11 != -1 && this.A01 <= j10 && j10 + j11 <= this.A01 + this.A00;
        }
        long j12 = this.A01;
        String[] strArr = A02;
        if (strArr[5].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "hFw0670rI05U";
        strArr2[0] = "7z";
        return j10 >= j12;
    }

    public final boolean A01(long j10, long j11) {
        if (this.A01 > j10) {
            return j11 == -1 || j10 + j11 > this.A01;
        }
        int i10 = (this.A00 > (-1L) ? 1 : (this.A00 == (-1L) ? 0 : -1));
        String[] strArr = A02;
        if (strArr[3].length() != strArr[0].length()) {
            String[] strArr2 = A02;
            strArr2[1] = "f7q";
            strArr2[4] = "y1fWxdtZevrTDhEmOw2Z7DfHzy1jnh7l";
            return i10 == 0 || this.A01 + this.A00 > j10;
        }
        throw new RuntimeException();
    }
}

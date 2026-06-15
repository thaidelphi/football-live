package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class PL {
    public static String[] A0B = {"FZUTEEo5yQEkrXuWchCqsTpObFXXea7X", "npFxmkkI3BwvG8sLAHLefWgraCGzL2hA", "7TNS65kycv8Lt", "gHtv5ojoh98zX2uiKsAZehQg5EIlXVbb", "k6Pcwm0oRadbgReCb358aHJYtAtn7n", "XbExd065htWUIbkauOrcStjr4mN0Tfuu", "avVMNcEJPyVjQcZdXWMfUdo8s8", "R1CMqfVcvF4s1ZZQ"};
    public final Uri A00;
    public final List<Integer> A01;
    @Deprecated
    public final List<Integer> A02;
    public final Map<String, String> A03;
    @Deprecated
    public final Map<String, String> A04;
    public final UUID A05;
    @Deprecated
    public final UUID A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final byte[] A0A;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PL(com.facebook.ads.redexgen.X.PK r3) {
        /*
            r2 = this;
            r2.<init>()
            boolean r0 = com.facebook.ads.redexgen.X.PK.A06(r3)
            if (r0 == 0) goto Lf
            android.net.Uri r0 = com.facebook.ads.redexgen.X.PK.A00(r3)
            if (r0 == 0) goto L6b
        Lf:
            r0 = 1
        L10:
            com.facebook.ads.redexgen.X.AbstractC1589es.A08(r0)
            java.util.UUID r0 = com.facebook.ads.redexgen.X.PK.A03(r3)
            java.lang.Object r0 = com.facebook.ads.redexgen.X.AbstractC1589es.A01(r0)
            java.util.UUID r0 = (java.util.UUID) r0
            r2.A05 = r0
            java.util.UUID r0 = r2.A05
            r2.A06 = r0
            android.net.Uri r0 = com.facebook.ads.redexgen.X.PK.A00(r3)
            r2.A00 = r0
            java.util.Map r0 = com.facebook.ads.redexgen.X.PK.A02(r3)
            r2.A04 = r0
            java.util.Map r0 = com.facebook.ads.redexgen.X.PK.A02(r3)
            r2.A03 = r0
            boolean r0 = com.facebook.ads.redexgen.X.PK.A04(r3)
            r2.A08 = r0
            boolean r0 = com.facebook.ads.redexgen.X.PK.A06(r3)
            r2.A07 = r0
            boolean r0 = com.facebook.ads.redexgen.X.PK.A05(r3)
            r2.A09 = r0
            java.util.List r0 = com.facebook.ads.redexgen.X.PK.A01(r3)
            r2.A02 = r0
            java.util.List r0 = com.facebook.ads.redexgen.X.PK.A01(r3)
            r2.A01 = r0
            byte[] r0 = com.facebook.ads.redexgen.X.PK.A07(r3)
            if (r0 == 0) goto L69
            byte[] r1 = com.facebook.ads.redexgen.X.PK.A07(r3)
            byte[] r0 = com.facebook.ads.redexgen.X.PK.A07(r3)
            int r0 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r1, r0)
        L66:
            r2.A0A = r0
            return
        L69:
            r0 = 0
            goto L66
        L6b:
            r0 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.PL.<init>(com.facebook.ads.redexgen.X.PK):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PL) {
            PL pl2 = (PL) obj;
            if (this.A05.equals(pl2.A05) && AbstractC1672gE.A1E(this.A00, pl2.A00)) {
                Map<String, String> map = this.A03;
                if (A0B[5].charAt(27) != '0') {
                    throw new RuntimeException();
                }
                String[] strArr = A0B;
                strArr[3] = "AWDgeGskOpENxfufLCM5pOEKRHs2RpkB";
                strArr[0] = "Lr4kXKbqcuT6VTurUgiw2lAWMU0woPfT";
                if (AbstractC1672gE.A1E(map, pl2.A03) && this.A08 == pl2.A08 && this.A07 == pl2.A07 && this.A09 == pl2.A09 && this.A01.equals(pl2.A01) && Arrays.equals(this.A0A, pl2.A0A)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A05.hashCode();
        int i10 = result * 31;
        int result2 = this.A00 != null ? this.A00.hashCode() : 0;
        int hashCode = ((i10 + result2) * 31) + this.A03.hashCode();
        int result3 = A0B[7].length();
        if (result3 != 16) {
            throw new RuntimeException();
        }
        A0B[4] = "yLhRGssFNmeRbbeLC4ll21K0QJz7pb";
        int result4 = this.A08 ? 1 : 0;
        int result5 = this.A09 ? 1 : 0;
        int result6 = Arrays.hashCode(this.A0A);
        return (((((((((hashCode * 31) + result4) * 31) + (this.A07 ? 1 : 0)) * 31) + result5) * 31) + this.A01.hashCode()) * 31) + result6;
    }
}

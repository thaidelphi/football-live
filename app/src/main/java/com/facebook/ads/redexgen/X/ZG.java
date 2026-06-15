package com.facebook.ads.redexgen.X;

import android.os.Bundle;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class ZG implements InterfaceC0973Nb {
    public final float A00;
    public final float A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public static String[] A05 = {"E66l8wlZ4v3iEKCEFHgH9VLRvbTNFtpL", "tE4S3r0V5ycsTYM8Dy5oJD9FoMT1glcU", "wH8wICNcmP8YQ3MTU1MeFa2PWIeGD1lC", "97GTnnCIIcAH3EgCF5ouocWI", "GyFtWuyKbXIMU8WgRoBB5FfFAAaLXJhA", "CMHQy90E6JDQYMfZEUcgLzvffNMrkZNI", "RRx1hV4SwDog4weIlrRs3P0MX6JysyL7", "VFHZIREO7BA91sSd"};
    public static final ZG A07 = new PN().A05();
    public static final InterfaceC0972Na<ZG> A06 = new InterfaceC0972Na() { // from class: com.facebook.ads.redexgen.X.ZH
        @Override // com.facebook.ads.redexgen.X.InterfaceC0972Na
        public final InterfaceC0973Nb A6V(Bundle bundle) {
            return ZG.A00(bundle);
        }
    };

    @Deprecated
    public ZG(long j10, long j11, long j12, float f10, float f11) {
        this.A04 = j10;
        this.A03 = j11;
        this.A02 = j12;
        this.A01 = f10;
        this.A00 = f11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ZG(com.facebook.ads.redexgen.X.PN r10) {
        /*
            r9 = this;
            long r1 = com.facebook.ads.redexgen.X.PN.A02(r10)
            long r3 = com.facebook.ads.redexgen.X.PN.A03(r10)
            long r5 = com.facebook.ads.redexgen.X.PN.A04(r10)
            float r7 = com.facebook.ads.redexgen.X.PN.A00(r10)
            float r8 = com.facebook.ads.redexgen.X.PN.A01(r10)
            r0 = r9
            r0.<init>(r1, r3, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.ZG.<init>(com.facebook.ads.redexgen.X.PN):void");
    }

    public static /* synthetic */ ZG A00(Bundle bundle) {
        return new ZG(bundle.getLong(A01(0), -9223372036854775807L), bundle.getLong(A01(1), -9223372036854775807L), bundle.getLong(A01(2), -9223372036854775807L), bundle.getFloat(A01(3), -3.4028235E38f), bundle.getFloat(A01(4), -3.4028235E38f));
    }

    public static String A01(int i10) {
        return Integer.toString(i10, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZG) {
            ZG zg = (ZG) obj;
            int i10 = (this.A04 > zg.A04 ? 1 : (this.A04 == zg.A04 ? 0 : -1));
            String[] strArr = A05;
            if (strArr[3].length() != strArr[7].length()) {
                String[] strArr2 = A05;
                strArr2[2] = "q9INe8qnlpk9hGRlHP1h549I0GC0iD7c";
                strArr2[0] = "dDn4d8zun5hFgG6eoF3cZR7p2qKAzpbN";
                return i10 == 0 && this.A03 == zg.A03 && this.A02 == zg.A02 && this.A01 == zg.A01 && this.A00 == zg.A00;
            }
            throw new RuntimeException();
        }
        return false;
    }

    public final int hashCode() {
        int result = (int) (this.A02 ^ (this.A02 >>> 32));
        int floatToIntBits = (((((((int) (this.A04 ^ (this.A04 >>> 32))) * 31) + ((int) (this.A03 ^ (this.A03 >>> 32)))) * 31) + result) * 31) + (this.A01 != 0.0f ? Float.floatToIntBits(this.A01) : 0);
        String[] strArr = A05;
        String str = strArr[3];
        String str2 = strArr[7];
        int result2 = str.length();
        if (result2 != str2.length()) {
            A05[4] = "2J5b96YasdupXuMGSA5xaFObQUmrmG7j";
            int i10 = floatToIntBits * 31;
            int result3 = (this.A00 > 0.0f ? 1 : (this.A00 == 0.0f ? 0 : -1));
            int result4 = i10 + (result3 != 0 ? Float.floatToIntBits(this.A00) : 0);
            return result4;
        }
        throw new RuntimeException();
    }
}

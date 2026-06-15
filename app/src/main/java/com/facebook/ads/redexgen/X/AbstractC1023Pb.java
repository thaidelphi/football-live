package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Pb  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1023Pb {
    public static String[] A05 = {"MZeEInBqVnL7fDVjVynLpgycsVhVc2FP", "Xk9uAN0Fn4x0v5dWVwOwrJ7JGZToNY3l", "CDAWvvyMGgXNd5qsTP", "Re2PFJ16QG15nXWYAqvsFprPu8QnxxAj", "vzRJ6390trjMsrCmJ0zXqHjqNcYul7Wr", "t6D48Sv2e", "mUckvOsWmBWtRPKk3qpVMVrL2", "7vFwPN9HUlN"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;

    public AbstractC1023Pb(AbstractC1023Pb abstractC1023Pb) {
        this.A04 = abstractC1023Pb.A04;
        this.A00 = abstractC1023Pb.A00;
        this.A01 = abstractC1023Pb.A01;
        this.A03 = abstractC1023Pb.A03;
        this.A02 = abstractC1023Pb.A02;
    }

    public AbstractC1023Pb(Object obj) {
        this(obj, -1L);
    }

    public AbstractC1023Pb(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    public AbstractC1023Pb(Object obj, int i10, int i11, long j10, int i12) {
        this.A04 = obj;
        this.A00 = i10;
        this.A01 = i11;
        this.A03 = j10;
        this.A02 = i12;
    }

    public AbstractC1023Pb(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public final boolean A00() {
        return this.A00 != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC1023Pb) {
            String[] strArr = A05;
            if (strArr[7].length() != strArr[6].length()) {
                A05[1] = "H5xeOUJH1DaxHk40WhwsThIB5vzqff3X";
                AbstractC1023Pb abstractC1023Pb = (AbstractC1023Pb) obj;
                return this.A04.equals(abstractC1023Pb.A04) && this.A00 == abstractC1023Pb.A00 && this.A01 == abstractC1023Pb.A01 && this.A03 == abstractC1023Pb.A03 && this.A02 == abstractC1023Pb.A02;
            }
            throw new RuntimeException();
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A04.hashCode();
        int result2 = this.A01;
        int result3 = ((((((((17 * 31) + result) * 31) + this.A00) * 31) + result2) * 31) + ((int) this.A03)) * 31;
        int result4 = this.A02;
        return result3 + result4;
    }
}

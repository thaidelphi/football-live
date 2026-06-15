package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.9y  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C06539y {
    public static String[] A04 = {"VndfGBIDInq1AmGKWEXIYtH", "X1ufgR44W1Z84U", com.ironsource.cc.f16875q, "", "za8Aa", "xjBfTCMiG1bFh7NB9hwMlLVXQHNbTqdl", "vkDSrNK7CnANJUjGZxXcCXY", "njWPP"};
    public EnumC06509v A01 = EnumC06509v.A03;
    public EnumC06519w A02 = EnumC06519w.A06;
    public EnumC06529x A03 = EnumC06529x.A02;
    public EnumC06499u A00 = EnumC06499u.A02;

    public final void A00() {
        this.A00 = EnumC06499u.A03;
    }

    public final void A01() {
        this.A02 = EnumC06519w.A04;
    }

    public final void A02() {
        this.A02 = EnumC06519w.A05;
    }

    public final void A03() {
        this.A03 = EnumC06529x.A03;
    }

    public final boolean A04() {
        if (this.A02 != EnumC06519w.A06) {
            EnumC06519w enumC06519w = this.A02;
            String[] strArr = A04;
            if (strArr[6].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[6] = "r152EQyYeE04Ovy9QYMfnLx";
            strArr2[0] = "I6yTYbMajK96Zgvn6mn7gLC";
            if (enumC06519w != EnumC06519w.A02 && this.A02 != EnumC06519w.A05) {
                return false;
            }
        }
        return true;
    }

    public final boolean A05() {
        return this.A02 == EnumC06519w.A06 || this.A02 == EnumC06519w.A02;
    }

    public final boolean A06() {
        return this.A03 == EnumC06529x.A03;
    }

    public final boolean A07() {
        return this.A00 == EnumC06499u.A03;
    }
}

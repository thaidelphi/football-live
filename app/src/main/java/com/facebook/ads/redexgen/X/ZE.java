package com.facebook.ads.redexgen.X;

import android.os.Bundle;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class ZE implements InterfaceC0973Nb {
    public final ZI A00;
    @Deprecated
    public final E1 A01;
    public final ZG A02;
    public final PP A03;
    @Deprecated
    public final ZF A04;
    public final ZC A05;
    public final String A06;
    public static String[] A07 = {"75xJFduIMxyPuYUkVz483sJBnAcsAGMt", "TRlLUM7UN7d6ZMpgKgKtaSof78G6koYS", "QzsC9zybTqk1FRWX4xvOCDJWDQUStUU5", com.ironsource.ho.f17693e, "vby9mdVdCOnOHbl0WKbwu7GFn2k2d8Kf", "RTPWPqup43k0H5h14hfzvYa9TxJMYAZX", "Oumckoc1zDinSUsB0wRSQGt6gXPsEBlZ", "aaUdNUfilNdKQDVoR1mlcUyZ7NAG5upS"};
    public static final ZE A09 = new PH().A05();
    public static final InterfaceC0972Na<ZE> A08 = new InterfaceC0972Na() { // from class: com.facebook.ads.redexgen.X.ZK
        @Override // com.facebook.ads.redexgen.X.InterfaceC0972Na
        public final InterfaceC0973Nb A6V(Bundle bundle) {
            ZE A00;
            A00 = ZE.A00(bundle);
            return A00;
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static ZE A00(Bundle bundle) {
        String str = (String) AbstractC1589es.A01(bundle.getString(A02(0), ""));
        Bundle bundle2 = bundle.getBundle(A02(1));
        ZG A6V = bundle2 == null ? ZG.A07 : ZG.A06.A6V(bundle2);
        Bundle bundle3 = bundle.getBundle(A02(2));
        ZC A6V2 = bundle3 == null ? ZC.A0Z : ZC.A0Y.A6V(bundle3);
        String A02 = A02(3);
        String[] strArr = A07;
        if (strArr[0].charAt(15) != strArr[5].charAt(15)) {
            A07[4] = "7tcWmieQ6urbX1gsYJsT08orlnHIuPr9";
            Bundle bundle4 = bundle.getBundle(A02);
            return new ZE(str, bundle4 == null ? E1.A00 : ZI.A06.A6V(bundle4), null, A6V, A6V2);
        }
        throw new RuntimeException();
    }

    public ZE(String str, E1 e12, ZF zf, ZG zg, ZC zc) {
        this.A06 = str;
        this.A03 = zf;
        this.A04 = zf;
        this.A02 = zg;
        this.A05 = zc;
        this.A00 = e12;
        this.A01 = e12;
    }

    public static String A02(int i10) {
        return Integer.toString(i10, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZE) {
            ZE ze = (ZE) obj;
            if (AbstractC1672gE.A1E(this.A06, ze.A06) && this.A00.equals(ze.A00) && AbstractC1672gE.A1E(this.A03, ze.A03) && AbstractC1672gE.A1E(this.A02, ze.A02) && AbstractC1672gE.A1E(this.A05, ze.A05)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A06.hashCode();
        int i10 = result * 31;
        int result2 = this.A03 != null ? this.A03.hashCode() : 0;
        int result3 = this.A00.hashCode();
        return ((((((i10 + result2) * 31) + this.A02.hashCode()) * 31) + result3) * 31) + this.A05.hashCode();
    }
}

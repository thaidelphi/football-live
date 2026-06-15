package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.Kb  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0898Kb extends C1420c8 {
    public static String[] A0F = {"r3hDWnB1R9y4pEiKAURNp99h2b", "kj3t6dP2tWSOfb61zMSBvgjhGLqlygll", "", "sX8uIgx32JWe8q5WuLHBMtkPG7d", "ZlH8xHdCAMZsgB23qoj", "6lejLSjHGD", "XsRzuVWfX96s5Dei3zwO9zjz9s6FXTfu", "pCK0u"};
    public int A00;
    public ID A01;
    public boolean A02;
    public final C9K<C0897Ka> A03;
    public final C9K<KY> A04;
    public final C9K<C1408bw> A05;
    public final C9K<KX> A06;
    public final C9K<C1403br> A07;
    public final C9K<C1401bp> A08;
    public final C9K<C1400bo> A09;
    public final C9K<C1395bj> A0A;
    public final C9K<C1394bi> A0B;
    public final C1433cL A0C;
    public final AbstractC1405bt A0D;
    public final AbstractC1396bk A0E;

    public C0898Kb(C1900k1 c1900k1, A7 a72, C1433cL c1433cL, String str) {
        this(c1900k1, a72, c1433cL, str, 0, 0, false, null, null);
    }

    public C0898Kb(C1900k1 c1900k1, A7 a72, C1433cL c1433cL, String str, int i10, int i11, boolean z10, Bundle bundle, Map<String, String> map) {
        super(c1900k1, a72, c1433cL, str, !c1433cL.A0o(), i10, i11, z10, bundle, map, new C1419c7(c1900k1, c1433cL));
        this.A0E = new C0899Kc(this);
        this.A08 = new C1430cI(this);
        this.A04 = new C1429cH(this);
        this.A05 = new C1428cG(this);
        this.A06 = new C1427cF(this);
        this.A03 = new C1426cE(this);
        this.A07 = new C1425cD(this);
        this.A0A = new C1424cC(this);
        this.A0B = new C1423cB(this);
        this.A09 = new C1432cK(this);
        this.A0D = new C0900Kd(this);
        this.A02 = false;
        this.A0C = c1433cL;
        this.A0C.getEventBus().A03(this.A0E, this.A06, this.A08, this.A05, this.A04, this.A03, this.A07, this.A0A, this.A0B, this.A0D, this.A09);
        if (C06419m.A2k(c1900k1)) {
            this.A01 = new ID(c1433cL, str, null);
        }
    }

    public C0898Kb(C1900k1 c1900k1, A7 a72, C1433cL c1433cL, String str, Bundle bundle, Map<String, String> extraParams) {
        this(c1900k1, a72, c1433cL, str, 0, 0, false, bundle, extraParams);
    }

    @Override // com.facebook.ads.redexgen.X.C1420c8
    public final void A0n(IH ih, Map<String, String> map) {
        super.A0n(ih, map);
        if (this.A01 != null && ih == IH.A09) {
            Map<String, String> params = this.A01.A05();
            String[] strArr = A0F;
            if (strArr[0].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0F[2] = "tc9";
            map.putAll(params);
        }
    }

    public final void A0p() {
        C1431cJ c1431cJ = new C1431cJ(this);
        if (this.A0C.A0s()) {
            ExecutorC0712Cx.A00(c1431cJ);
            return;
        }
        C1433cL c1433cL = this.A0C;
        String[] strArr = A0F;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A0F[1] = "nFCp2DExxe9bklz52WjNRol8ULAuMoj6";
        c1433cL.getStateHandler().post(c1431cJ);
    }
}

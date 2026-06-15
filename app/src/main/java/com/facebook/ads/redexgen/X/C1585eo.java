package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.eo  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1585eo implements CG {
    public static String[] A01 = {"", "vSeS2rx23zUd4am5Wdo", "UtlZDzt7", "dNEruPHPdkyj182N7GwirLXq8Db2eecB", "b1VGcsOgsecYYY6uN1zNid8VodysKnsR", "yg", "RqC1uxvv784HDfNbZXUq5U9jCsQW0kUg", "5jFX4DLWV5nBObgEbVC73yk5ncCVY3Kv"};
    public final /* synthetic */ L1 A00;

    public C1585eo(L1 l12) {
        this.A00 = l12;
    }

    @Override // com.facebook.ads.redexgen.X.CG
    public final void ACi() {
        HI hi;
        int i10;
        HI hi2;
        hi = this.A00.A0F;
        i10 = this.A00.A0A;
        hi.ACr(i10);
        hi2 = this.A00.A0F;
        hi2.ACS();
    }

    @Override // com.facebook.ads.redexgen.X.CG
    public final void AEg(float f10) {
        int i10;
        boolean z10;
        C1433cL c1433cL;
        int duration;
        boolean z11;
        int i11;
        HI hi;
        i10 = this.A00.A0A;
        float f11 = i10 - f10;
        z10 = this.A00.A0V;
        if (z10) {
            duration = 0;
        } else {
            c1433cL = this.A00.A0I;
            duration = c1433cL.getDuration();
        }
        float f12 = f11 + duration;
        L1 l12 = this.A00;
        if (A01[4].charAt(2) != 'V') {
            throw new RuntimeException();
        }
        A01[7] = "iUY2DHYRiluzyO05ci2O9gzQrrq6c2GK";
        z11 = l12.A0V;
        if (!z11) {
            i11 = this.A00.A09;
        } else {
            L1 l13 = this.A00;
            String[] strArr = A01;
            if (strArr[5].length() != strArr[1].length()) {
                A01[4] = "jZVNpY3PkhFJgbxs6TiKD4bRtw9FJmgD";
                i11 = l13.A0A;
            } else {
                throw new RuntimeException();
            }
        }
        float seenTime = i11;
        float f13 = f12 / seenTime;
        hi = this.A00.A0F;
        hi.AJi(f13);
    }
}

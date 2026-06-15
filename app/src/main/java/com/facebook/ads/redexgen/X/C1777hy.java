package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.hy  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1777hy implements InterfaceC0762Ev {
    public static byte[] A01;
    public final /* synthetic */ View$OnClickListenerC0947Lz A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 72);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-36, -38, -52, -39, -58, -55, -36, -51, -51, -52, -39, -52, -53, -58, -54, -45, -48, -54, -46, -58, -48, -56, -55, -58, -43, -56, -35, -48, -50, -56, -37, -48, -42, -43};
    }

    public C1777hy(View$OnClickListenerC0947Lz view$OnClickListenerC0947Lz) {
        this.A00 = view$OnClickListenerC0947Lz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ev
    public final void AEM(String str) {
        this.A00.A0C.setProgress(100);
        ((C1773hu) this.A00).A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ev
    public final void AEO(String str) {
        int i10;
        ((C1773hu) this.A00).A05 = true;
        this.A00.A0B.setUrl(str);
        i10 = this.A00.A00;
        if (i10 > 1) {
            this.A00.A0H(A00(0, 34, 31));
        }
        View$OnClickListenerC0947Lz.A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ev
    public final void AEj(int i10) {
        if (((C1773hu) this.A00).A05) {
            this.A00.A0C.setProgress(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ev
    public final void AEl(String str) {
        this.A00.A0B.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ev
    public final void AEo() {
        this.A00.A0A.ACY(14);
    }
}

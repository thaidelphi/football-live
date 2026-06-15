package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.g6  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1664g6 implements InterfaceC0762Ev {
    public static byte[] A01;
    public final /* synthetic */ C1652fu A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 104);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{73, 71, 57, 70, 51, 66, 53, 74, 61, 59, 53, 72, 61, 67, 66, 51, 61, 53, 54};
    }

    public C1664g6(C1652fu c1652fu) {
        this.A00 = c1652fu;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ev
    public final void AEM(String str) {
        C0754En c0754En;
        C0754En c0754En2;
        AbstractC2058md abstractC2058md;
        C1728h9 c1728h9;
        AbstractC2058md abstractC2058md2;
        C1728h9 c1728h92;
        this.A00.A0W = false;
        c0754En = this.A00.A0J;
        c0754En.setProgress(100);
        c0754En2 = this.A00.A0J;
        D3.A0L(c0754En2, 8);
        abstractC2058md = this.A00.A0G;
        if (abstractC2058md.A1J()) {
            c1728h9 = this.A00.A0K;
            if (c1728h9 != null) {
                abstractC2058md2 = this.A00.A0G;
                String A0l = abstractC2058md2.A0l();
                if (!TextUtils.isEmpty(A0l)) {
                    c1728h92 = this.A00.A0K;
                    c1728h92.loadUrl(A0l);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ev
    public final void AEO(String str) {
        C0754En c0754En;
        C0753Em c0753Em;
        boolean z10;
        int i10;
        this.A00.A0W = true;
        c0754En = this.A00.A0J;
        D3.A0L(c0754En, 0);
        c0753Em = this.A00.A0I;
        c0753Em.setUrl(str);
        z10 = this.A00.A0U;
        if (!z10) {
            i10 = this.A00.A01;
            if (i10 > 1) {
                this.A00.A0U = true;
                this.A00.A0h(A00(0, 19, 108));
            }
        }
        C1652fu.A03(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ev
    public final void AEj(int i10) {
        boolean z10;
        C0754En c0754En;
        z10 = this.A00.A0W;
        if (z10) {
            c0754En = this.A00.A0J;
            c0754En.setProgress(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ev
    public final void AEl(String str) {
        C0753Em c0753Em;
        c0753Em = this.A00.A0I;
        c0753Em.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ev
    public final void AEo() {
        C0790Fx c0790Fx;
        c0790Fx = this.A00.A0M;
        c0790Fx.A0C().ACY(14);
    }
}

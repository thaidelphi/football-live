package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.d4  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1478d4 extends JK {
    public final /* synthetic */ C0905Ki A00;

    public C1478d4(C0905Ki c0905Ki) {
        this.A00 = c0905Ki;
    }

    @Override // com.facebook.ads.redexgen.X.JK
    public final void A03() {
        C0710Cv c0710Cv;
        C0710Cv c0710Cv2;
        String str;
        JL jl;
        C0710Cv c0710Cv3;
        AbstractC2058md abstractC2058md;
        A7 a72;
        String str2;
        AbstractC2058md abstractC2058md2;
        C1900k1 c1900k1;
        C1900k1 c1900k12;
        AbstractC2058md abstractC2058md3;
        AbstractC2058md abstractC2058md4;
        c0710Cv = this.A00.A0E;
        if (!c0710Cv.A07()) {
            C0905Ki c0905Ki = this.A00;
            c0710Cv2 = this.A00.A0E;
            c0905Ki.setImpressionRecordingFlag(c0710Cv2);
            str = this.A00.A0A;
            if (!TextUtils.isEmpty(str)) {
                FB fb = new FB();
                jl = this.A00.A09;
                FB A03 = fb.A03(jl);
                c0710Cv3 = this.A00.A0E;
                FB A02 = A03.A02(c0710Cv3);
                abstractC2058md = ((AbstractC1762hh) this.A00).A0A;
                Map<String, String> A05 = A02.A04(abstractC2058md.A0h()).A05();
                a72 = ((AbstractC1762hh) this.A00).A0C;
                str2 = this.A00.A0A;
                a72.AB0(str2, A05);
                abstractC2058md2 = ((AbstractC1762hh) this.A00).A0A;
                C04592h A1c = abstractC2058md2.A1c();
                c1900k1 = this.A00.A0D;
                C04592h.A07(A1c, c1900k1);
                c1900k12 = this.A00.A0D;
                c1900k12.A0F().A3B();
                abstractC2058md3 = this.A00.A03;
                String A0g = abstractC2058md3.A0g();
                abstractC2058md4 = ((AbstractC1762hh) this.A00).A0A;
                AbstractC04783a.A02(A0g, AbstractC0693Ce.A00(abstractC2058md4.A0i()));
            }
        }
    }
}

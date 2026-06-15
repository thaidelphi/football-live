package com.facebook.ads.redexgen.X;

import android.os.Handler;
/* renamed from: com.facebook.ads.redexgen.X.cO  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1436cO extends BY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C1433cL A02;
    public final /* synthetic */ JI A03;

    public C1436cO(C1433cL c1433cL, JI ji, int i10, int i11) {
        this.A02 = c1433cL;
        this.A03 = ji;
        this.A00 = i10;
        this.A01 = i11;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        C1900k1 c1900k1;
        Handler handler;
        C9J c9j;
        C1900k1 c1900k12;
        C9J c9j2;
        C1400bo c1400bo;
        Handler handler2;
        C1900k1 c1900k13;
        C9J c9j3;
        Handler handler3;
        C1900k1 c1900k14;
        C1900k1 c1900k15;
        C9J c9j4;
        C1408bw c1408bw;
        Handler handler4;
        C1900k1 c1900k16;
        C1900k1 c1900k17;
        Handler handler5;
        C9J c9j5;
        C9J c9j6;
        C1414c2 c1414c2;
        C1900k1 c1900k18;
        C9J c9j7;
        C1406bu c1406bu;
        if (this.A03 == JI.A07) {
            this.A02.A0M(AE.A0y);
            c1900k18 = this.A02.A0B;
            c1900k18.A0F().A3Z();
            c9j7 = this.A02.A0C;
            c1406bu = C1433cL.A0J;
            c9j7.A02(c1406bu);
        } else if (this.A03 == JI.A03) {
            this.A02.A0M(AE.A0t);
            this.A02.A04 = true;
            c9j6 = this.A02.A0C;
            c1414c2 = C1433cL.A0H;
            c9j6.A02(c1414c2);
            this.A02.A0L(this.A00);
        } else if (this.A03 == JI.A06) {
            this.A02.A0M(AE.A0s);
            c1900k17 = this.A02.A0B;
            c1900k17.A0F().A3R();
            this.A02.A04 = true;
            handler5 = this.A02.A08;
            handler5.removeCallbacksAndMessages(null);
            c9j5 = this.A02.A0C;
            c9j5.A02(new C0897Ka(this.A01, this.A01));
            this.A02.A0L(this.A01);
        } else if (this.A03 == JI.A0A) {
            c1900k14 = this.A02.A0B;
            if (C06419m.A1s(c1900k14)) {
                c1900k16 = this.A02.A0B;
                c1900k16.A0B().AFk();
            }
            this.A02.A0M(AE.A0w);
            c1900k15 = this.A02.A0B;
            c1900k15.A0F().A3g();
            c9j4 = this.A02.A0C;
            c1408bw = C1433cL.A0I;
            c9j4.A02(c1408bw);
            handler4 = this.A02.A08;
            handler4.removeCallbacksAndMessages(null);
            this.A02.A0I();
        } else if (this.A03 == JI.A05) {
            this.A02.A0M(AE.A0v);
            c1900k13 = this.A02.A0B;
            c1900k13.A0F().A3V();
            c9j3 = this.A02.A0C;
            c9j3.A02(new KY(this.A00));
            handler3 = this.A02.A08;
            handler3.removeCallbacksAndMessages(null);
            this.A02.A0L(this.A00);
        } else if (this.A03 == JI.A04) {
            this.A02.A0M(AE.A0u);
            c1900k12 = this.A02.A0B;
            c1900k12.A0F().A3S();
            c9j2 = this.A02.A0C;
            c1400bo = C1433cL.A0L;
            c9j2.A02(c1400bo);
            handler2 = this.A02.A08;
            handler2.removeCallbacksAndMessages(null);
        } else if (this.A03 == JI.A09) {
            this.A02.A0M(AE.A0s);
            c1900k1 = this.A02.A0B;
            c1900k1.A0F().A3b();
            this.A02.A04 = true;
            handler = this.A02.A08;
            handler.removeCallbacksAndMessages(null);
            c9j = this.A02.A0C;
            c9j.A02(new C0897Ka(this.A00, this.A01));
            this.A02.A0L(this.A00);
        }
    }
}

package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Dt  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class View$OnClickListenerC0734Dt implements View.OnClickListener {
    public final /* synthetic */ C04652n A00;
    public final /* synthetic */ AF A01;
    public final /* synthetic */ DR A02;
    public final /* synthetic */ C0735Du A03;
    public final /* synthetic */ String A04;

    public View$OnClickListenerC0734Dt(C0735Du c0735Du, AF af, DR dr, String str, C04652n c04652n) {
        this.A03 = c0735Du;
        this.A01 = af;
        this.A02 = dr;
        this.A04 = str;
        this.A00 = c04652n;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C04843g c04843g;
        C1900k1 c1900k1;
        C1900k1 c1900k12;
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A01.A04(AE.A0A, null);
            c04843g = this.A03.A01;
            c1900k1 = this.A03.A02;
            if (c04843g.A0O(c1900k1.A02(), true)) {
                this.A02.AAd(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                C2 c22 = new C2();
                c1900k12 = this.A03.A02;
                C2.A0M(c22, c1900k12, C5.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}

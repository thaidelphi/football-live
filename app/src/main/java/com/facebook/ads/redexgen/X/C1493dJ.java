package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.dJ  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1493dJ implements GX {
    public final /* synthetic */ C1492dI A00;

    public C1493dJ(C1492dI c1492dI) {
        this.A00 = c1492dI;
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final void AFe(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.GX
    public final void AFg(View view) {
        AbstractC1646fo abstractC1646fo = (AbstractC1646fo) view;
        abstractC1646fo.A1D();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC1646fo.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}

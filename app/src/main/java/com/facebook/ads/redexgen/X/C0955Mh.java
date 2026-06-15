package com.facebook.ads.redexgen.X;

import android.os.Handler;
import com.unity3d.services.core.di.ServiceProvider;
/* renamed from: com.facebook.ads.redexgen.X.Mh  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0955Mh extends AbstractC1781i2<C2030mB> {
    public C0955Mh(C2030mB c2030mB) {
        super(c2030mB);
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        C1900k1 c1900k1;
        Handler handler;
        Runnable runnable;
        C2030mB A06 = A06();
        if (A06 == null) {
            return;
        }
        c1900k1 = A06.A08;
        if (DK.A02(c1900k1)) {
            A06.A07();
            return;
        }
        handler = A06.A05;
        runnable = A06.A0C;
        handler.postDelayed(runnable, ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);
    }
}

package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.jl  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1884jl implements BO {
    @Override // com.facebook.ads.redexgen.X.BO
    public final void AHf(Throwable th, Object obj) {
        if (obj instanceof AnonymousClass80) {
            C1900k1 adContext = ((AnonymousClass80) obj).A6c();
            if (adContext != null) {
                adContext.A0Q(th);
            }
        } else if (!(obj instanceof View)) {
        } else {
            Context context = ((View) obj).getContext();
            if (!(context instanceof C1900k1)) {
                return;
            }
            ((C1900k1) context).A0Q(th);
        }
    }
}

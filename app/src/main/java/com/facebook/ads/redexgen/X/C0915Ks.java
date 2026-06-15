package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
/* renamed from: com.facebook.ads.redexgen.X.Ks  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C0915Ks extends AbstractC1413c1 {
    public final /* synthetic */ C0914Kr A00;

    public C0915Ks(C0914Kr c0914Kr) {
        this.A00 = c0914Kr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A00 */
    public final void A03(C1414c2 c1414c2) {
        new Handler(Looper.getMainLooper()).post(new HD(this));
    }
}

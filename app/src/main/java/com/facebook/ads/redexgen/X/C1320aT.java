package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* renamed from: com.facebook.ads.redexgen.X.aT  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1320aT extends BroadcastReceiver {
    public final /* synthetic */ C1325aY A00;

    public C1320aT(C1325aY c1325aY) {
        this.A00 = c1325aY;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!isInitialStickyBroadcast()) {
            C1325aY.A07(this.A00);
        }
    }
}

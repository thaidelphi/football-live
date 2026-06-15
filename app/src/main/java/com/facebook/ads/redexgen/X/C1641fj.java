package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* renamed from: com.facebook.ads.redexgen.X.fj  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1641fj extends BroadcastReceiver {
    public final /* synthetic */ C1642fk A00;

    public C1641fj(C1642fk c1642fk) {
        this.A00 = c1642fk;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int A00;
        A00 = C1642fk.A00(context);
        if (AbstractC1672gE.A02 >= 31 && A00 == 5) {
            C1639fh.A02(context, this.A00);
        } else {
            this.A00.A07(A00);
        }
    }
}

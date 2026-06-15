package com.facebook.ads.redexgen.X;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
/* renamed from: com.facebook.ads.redexgen.X.fg  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1638fg extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final C1642fk A00;

    public C1638fg(C1642fk c1642fk) {
        this.A00 = c1642fk;
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        boolean is5gNsa = overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5;
        this.A00.A07(is5gNsa ? 10 : 5);
    }
}

package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class P9 implements InterfaceC1596ez {
    @Override // com.facebook.ads.redexgen.X.InterfaceC1596ez
    public final C1020Oy A5F(Looper looper, Handler.Callback callback) {
        return new C1020Oy(new Handler(looper, callback));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1596ez
    public final long A69() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1596ez
    public final long AJj() {
        return SystemClock.uptimeMillis();
    }
}

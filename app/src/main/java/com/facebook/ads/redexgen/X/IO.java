package com.facebook.ads.redexgen.X;

import android.database.ContentObserver;
import android.os.Handler;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class IO extends ContentObserver {
    public final C1420c8 A00;

    public IO(Handler handler, C1420c8 c1420c8) {
        super(handler);
        this.A00 = c1420c8;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.A00.A0f();
    }
}

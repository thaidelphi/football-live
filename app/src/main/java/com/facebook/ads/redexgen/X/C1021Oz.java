package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Message;
/* renamed from: com.facebook.ads.redexgen.X.Oz  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1021Oz implements InterfaceC1623fR {
    public Message A00;
    public C1020Oy A01;

    public C1021Oz() {
    }

    private void A00() {
        this.A00 = null;
        this.A01 = null;
        C1020Oy.A02(this);
    }

    public final C1021Oz A01(Message message, C1020Oy c1020Oy) {
        this.A00 = message;
        this.A01 = c1020Oy;
        return this;
    }

    public final void A02() {
        ((Message) AbstractC1589es.A01(this.A00)).sendToTarget();
        A00();
    }

    public final boolean A03(Handler handler) {
        boolean success = handler.sendMessageAtFrontOfQueue((Message) AbstractC1589es.A01(this.A00));
        A00();
        return success;
    }
}

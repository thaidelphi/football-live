package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* renamed from: com.facebook.ads.redexgen.X.Oa  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class HandlerC0998Oa extends Handler {
    public final /* synthetic */ E9 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0998Oa(E9 e92, Looper looper) {
        super(looper);
        this.A00 = e92;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0N(msg);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}

package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class SP {
    public final AudioTrack.StreamEventCallback A00;
    public final Handler A01 = new Handler(Looper.myLooper());
    public final /* synthetic */ XM A02;

    public SP(XM xm) {
        this.A02 = xm;
        this.A00 = new SO(this, xm);
    }

    public final void A00(AudioTrack audioTrack) {
        Handler handler = this.A01;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new SN(handler), this.A00);
    }

    public final void A01(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.A00);
        this.A01.removeCallbacksAndMessages(null);
    }
}

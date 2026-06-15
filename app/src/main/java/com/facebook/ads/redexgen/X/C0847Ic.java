package com.facebook.ads.redexgen.X;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
/* renamed from: com.facebook.ads.redexgen.X.Ic  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C0847Ic implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ KP A00;

    public C0847Ic(KP kp) {
        this.A00 = kp;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        new Handler(Looper.getMainLooper()).post(new C1389bd(this, i10));
    }
}

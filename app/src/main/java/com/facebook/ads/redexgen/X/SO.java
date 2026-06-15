package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class SO extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ SP A00;
    public final /* synthetic */ XM A01;

    public SO(SP sp, XM xm) {
        this.A00 = sp;
        this.A01 = xm;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        AudioTrack audioTrack2;
        InterfaceC1092Rv interfaceC1092Rv;
        boolean z10;
        InterfaceC1092Rv interfaceC1092Rv2;
        audioTrack2 = this.A00.A02.A0D;
        if (!audioTrack.equals(audioTrack2)) {
            return;
        }
        interfaceC1092Rv = this.A00.A02.A0I;
        if (interfaceC1092Rv == null) {
            return;
        }
        z10 = this.A00.A02.A0X;
        if (!z10) {
            return;
        }
        interfaceC1092Rv2 = this.A00.A02.A0I;
        interfaceC1092Rv2.AEH();
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        InterfaceC1092Rv interfaceC1092Rv;
        boolean z10;
        InterfaceC1092Rv interfaceC1092Rv2;
        audioTrack2 = this.A00.A02.A0D;
        if (!audioTrack.equals(audioTrack2)) {
            return;
        }
        interfaceC1092Rv = this.A00.A02.A0I;
        if (interfaceC1092Rv == null) {
            return;
        }
        z10 = this.A00.A02.A0X;
        if (!z10) {
            return;
        }
        interfaceC1092Rv2 = this.A00.A02.A0I;
        interfaceC1092Rv2.AEH();
    }
}

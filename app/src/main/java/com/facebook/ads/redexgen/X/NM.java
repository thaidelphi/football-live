package com.facebook.ads.redexgen.X;

import android.media.AudioAttributes;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class NM {
    public final AudioAttributes A00;

    public NM(C1280Zm c1280Zm) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c1280Zm.A02).setFlags(c1280Zm.A03).setUsage(c1280Zm.A05);
        if (AbstractC1672gE.A02 >= 29) {
            NK.A00(usage, c1280Zm.A01);
        }
        if (AbstractC1672gE.A02 >= 32) {
            NL.A00(usage, c1280Zm.A04);
        }
        this.A00 = usage.build();
    }
}

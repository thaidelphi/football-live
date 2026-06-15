package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Hn  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class View$OnTouchListenerC0832Hn implements View.OnTouchListener {
    public final /* synthetic */ C0833Ho A00;

    public View$OnTouchListenerC0832Hn(C0833Ho c0833Ho) {
        this.A00 = c0833Ho;
    }

    public /* synthetic */ View$OnTouchListenerC0832Hn(C0833Ho c0833Ho, C0904Kh c0904Kh) {
        this(c0833Ho);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        A7 a72;
        AbstractC2058md abstractC2058md;
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            C0833Ho.A00(this.A00);
            a72 = this.A00.A07;
            abstractC2058md = this.A00.A04;
            a72.ABE(abstractC2058md.A1g(), new FB().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}

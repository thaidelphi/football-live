package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Bundle;
/* renamed from: com.facebook.ads.redexgen.X.dU  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1504dU implements HU {
    public final /* synthetic */ EC A00;
    public final /* synthetic */ C1503dT A01;
    public final /* synthetic */ C0833Ho A02;

    public C1504dU(C1503dT c1503dT, C0833Ho c0833Ho, EC ec) {
        this.A01 = c1503dT;
        this.A02 = c0833Ho;
        this.A00 = ec;
    }

    @Override // com.facebook.ads.redexgen.X.HU
    public final void AHe() {
        DS A05;
        Intent intent;
        DS ds;
        Intent intent2;
        Bundle bundle;
        this.A01.A09();
        C1503dT c1503dT = this.A01;
        A05 = this.A01.A05(this.A02, this.A00);
        c1503dT.A03 = A05;
        intent = this.A01.A01;
        if (intent != null && this.A01.A00 != null) {
            ds = this.A01.A03;
            intent2 = this.A01.A01;
            bundle = this.A01.A02;
            ds.AAj(intent2, bundle, this.A01.A00);
        }
    }
}

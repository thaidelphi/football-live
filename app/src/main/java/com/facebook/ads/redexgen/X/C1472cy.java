package com.facebook.ads.redexgen.X;

import android.media.Spatializer;
/* renamed from: com.facebook.ads.redexgen.X.cy  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1472cy implements Spatializer.OnSpatializerStateChangedListener {
    public final /* synthetic */ C1473cz A00;
    public final /* synthetic */ C05475u A01;

    public C1472cy(C1473cz c1473cz, C05475u c05475u) {
        this.A00 = c1473cz;
        this.A01 = c05475u;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        this.A01.A0L();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        this.A01.A0L();
    }
}

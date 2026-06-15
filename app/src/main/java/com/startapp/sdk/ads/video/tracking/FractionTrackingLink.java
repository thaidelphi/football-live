package com.startapp.sdk.ads.video.tracking;

import com.startapp.common.parser.TypeClassInfo;
/* compiled from: Sta */
@TypeClassInfo(extendsClass = true)
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class FractionTrackingLink extends VideoTrackingLink {
    private static final long serialVersionUID = 1389232981938306043L;
    private int fraction;

    public final void a(int i10) {
        this.fraction = i10;
    }

    public final int g() {
        return this.fraction;
    }

    @Override // com.startapp.sdk.ads.video.tracking.VideoTrackingLink
    public final String toString() {
        return super.toString() + ", fraction=" + this.fraction;
    }
}

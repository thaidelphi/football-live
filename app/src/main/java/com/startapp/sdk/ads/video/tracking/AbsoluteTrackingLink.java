package com.startapp.sdk.ads.video.tracking;

import com.startapp.common.parser.TypeClassInfo;
/* compiled from: Sta */
@TypeClassInfo(extendsClass = true)
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AbsoluteTrackingLink extends VideoTrackingLink {
    private static final long serialVersionUID = 6710863919461399416L;
    private int videoOffsetMillis;

    public final void a(int i10) {
        this.videoOffsetMillis = i10;
    }

    public final int g() {
        return this.videoOffsetMillis;
    }

    @Override // com.startapp.sdk.ads.video.tracking.VideoTrackingLink
    public final String toString() {
        return super.toString() + ", videoOffsetMillis=" + this.videoOffsetMillis;
    }
}

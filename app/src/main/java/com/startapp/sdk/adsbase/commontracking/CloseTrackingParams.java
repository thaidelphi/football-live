package com.startapp.sdk.adsbase.commontracking;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class CloseTrackingParams extends TrackingParams {
    private static final long serialVersionUID = -1873434013300932473L;
    private final long duration;

    public CloseTrackingParams(String str, long j10) {
        super(str);
        this.duration = j10;
    }

    @Override // com.startapp.sdk.adsbase.commontracking.TrackingParams
    public final String e() {
        return super.e() + "&displayDuration=" + Math.max(0L, this.duration);
    }
}

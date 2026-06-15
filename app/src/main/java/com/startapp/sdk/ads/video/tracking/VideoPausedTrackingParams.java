package com.startapp.sdk.ads.video.tracking;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class VideoPausedTrackingParams extends VideoTrackingParams {
    private static final long serialVersionUID = 4019115021800482057L;
    private int pauseNum;
    private PauseOrigin pauseOrigin;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum PauseOrigin {
        INAPP,
        EXTERNAL
    }

    public VideoPausedTrackingParams(String str, int i10, int i11, int i12, PauseOrigin pauseOrigin, String str2) {
        super(i10, i11, str, str2);
        this.pauseNum = i12;
        this.pauseOrigin = pauseOrigin;
    }

    @Override // com.startapp.sdk.ads.video.tracking.VideoTrackingParams, com.startapp.sdk.adsbase.commontracking.TrackingParams
    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(f());
        sb.append("&po=" + this.pauseOrigin.toString());
        sb.append("&pn=" + this.pauseNum);
        sb.append(h());
        return b(sb.toString());
    }
}

package com.startapp.sdk.ads.video.tracking;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class VideoClickedTrackingParams extends VideoTrackingParams {
    private static final long serialVersionUID = 940417627850369979L;
    private boolean isVideoFinished;

    public VideoClickedTrackingParams(String str, int i10, int i11, boolean z10, String str2) {
        super(i10, i11, str, str2);
        this.isVideoFinished = z10;
    }

    @Override // com.startapp.sdk.ads.video.tracking.VideoTrackingParams, com.startapp.sdk.adsbase.commontracking.TrackingParams
    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(f());
        sb.append("&co=".concat(this.isVideoFinished ? "POSTROLL" : "VIDEO"));
        sb.append(h());
        return b(sb.toString());
    }
}

package com.startapp.sdk.ads.video;

import android.content.Context;
import com.startapp.o9;
import com.startapp.sdk.ads.video.VideoUtil;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.w6;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a extends GetAdRequest {
    public GetAdRequest.VideoRequestType W0;
    public GetAdRequest.VideoRequestMode X0 = GetAdRequest.VideoRequestMode.INTERSTITIAL;

    @Override // com.startapp.sdk.adsbase.model.GetAdRequest
    public final void a(Context context, AdPreferences adPreferences, AdPreferences.Placement placement, Pair<String, String> pair) {
        super.a(context, adPreferences, placement, pair);
        Ad.AdType adType = this.V0;
        if (adType != null) {
            if (adType == Ad.AdType.NON_VIDEO) {
                this.W0 = GetAdRequest.VideoRequestType.DISABLED;
            } else if (adType == Ad.AdType.VIDEO_NO_VAST) {
                this.W0 = GetAdRequest.VideoRequestType.FORCED_NONVAST;
            } else {
                if (adType == Ad.AdType.VIDEO || adType == Ad.AdType.REWARDED_VIDEO) {
                    this.W0 = GetAdRequest.VideoRequestType.FORCED;
                }
            }
        } else if (VideoUtil.a(context) == VideoUtil.VideoEligibility.ELIGIBLE) {
            WeakHashMap weakHashMap = o9.f22359a;
            this.W0 = GetAdRequest.VideoRequestType.ENABLED;
        } else {
            this.W0 = GetAdRequest.VideoRequestType.DISABLED;
        }
        Ad.AdType adType2 = this.V0;
        if (adType2 == Ad.AdType.REWARDED_VIDEO) {
            this.X0 = GetAdRequest.VideoRequestMode.REWARDED;
        }
        if (adType2 == Ad.AdType.VIDEO) {
            this.X0 = GetAdRequest.VideoRequestMode.INTERSTITIAL;
        }
    }

    @Override // com.startapp.sdk.adsbase.model.GetAdRequest, com.startapp.u0
    public final void a(w6 w6Var) throws SDKException {
        super.a(w6Var);
        w6Var.a("video", this.W0, false, true);
        w6Var.a("videoMode", this.X0, false, true);
    }
}

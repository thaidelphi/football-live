package com.startapp.sdk.ads.banner;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlayAdError;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public enum BannerFormat {
    BANNER(0, 320, 50),
    MREC(1, 300, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED),
    COVER(2, 1200, LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK);
    
    final int heightDp;
    final int type;
    final int widthDp;

    BannerFormat(int i10, int i11, int i12) {
        this.type = i10;
        this.widthDp = i11;
        this.heightDp = i12;
    }
}

package com.applovin.mediation;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface MaxError {
    @Deprecated
    String getAdLoadFailureInfo();

    int getCode();

    int getMediatedNetworkErrorCode();

    String getMediatedNetworkErrorMessage();

    String getMessage();

    long getRequestLatencyMillis();

    MaxAdWaterfallInfo getWaterfall();
}

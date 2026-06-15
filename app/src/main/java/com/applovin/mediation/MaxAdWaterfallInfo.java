package com.applovin.mediation;

import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface MaxAdWaterfallInfo {
    long getLatencyMillis();

    MaxAd getLoadedAd();

    String getName();

    List<MaxNetworkResponseInfo> getNetworkResponses();

    String getTestName();
}

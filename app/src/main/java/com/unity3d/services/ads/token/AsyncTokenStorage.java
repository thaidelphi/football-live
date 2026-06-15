package com.unity3d.services.ads.token;

import com.unity3d.services.ads.gmascar.managers.IBiddingManager;
import com.unity3d.services.core.configuration.Configuration;
/* compiled from: AsyncTokenStorage.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface AsyncTokenStorage {
    void getToken(IBiddingManager iBiddingManager);

    void onTokenAvailable();

    void setConfiguration(Configuration configuration);
}

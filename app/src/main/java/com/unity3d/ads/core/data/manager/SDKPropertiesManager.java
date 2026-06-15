package com.unity3d.ads.core.data.manager;

import com.unity3d.services.core.properties.SdkProperties;
/* compiled from: SDKPropertiesManager.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface SDKPropertiesManager {
    SdkProperties.InitializationState getCurrentInitializationState();

    void setInitializationTime();

    void setInitializationTimeSinceEpoch();

    void setInitializeState(SdkProperties.InitializationState initializationState);

    void setInitialized(boolean z10);
}

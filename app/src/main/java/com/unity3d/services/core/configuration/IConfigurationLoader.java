package com.unity3d.services.core.configuration;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface IConfigurationLoader {
    Configuration getLocalConfiguration();

    void loadConfiguration(IConfigurationLoaderListener iConfigurationLoaderListener) throws Exception;
}

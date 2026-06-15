package com.unity3d.services.core.configuration;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface IModuleConfiguration {
    Class[] getWebAppApiClassList();

    boolean initCompleteState(Configuration configuration);

    boolean initErrorState(Configuration configuration, ErrorState errorState, String str);

    boolean resetState(Configuration configuration);
}

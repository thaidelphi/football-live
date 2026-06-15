package com.applovin.sdk;

import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface AppLovinSdkConfiguration {

    @Deprecated
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum ConsentDialogState {
        UNKNOWN,
        APPLIES,
        DOES_NOT_APPLY
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum ConsentFlowUserGeography {
        UNKNOWN,
        GDPR,
        OTHER
    }

    @Deprecated
    ConsentDialogState getConsentDialogState();

    ConsentFlowUserGeography getConsentFlowUserGeography();

    String getCountryCode();

    List<String> getEnabledAmazonAdUnitIds();

    boolean isTestModeEnabled();
}

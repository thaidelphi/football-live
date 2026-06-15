package com.applovin.impl;

import com.applovin.sdk.AppLovinSdkConfiguration;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class h0 {

    /* renamed from: a  reason: collision with root package name */
    private final AppLovinSdkConfiguration.ConsentFlowUserGeography f7083a;

    public h0(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        this.f7083a = consentFlowUserGeography;
    }

    protected boolean a(Object obj) {
        return obj instanceof h0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            if (h0Var.a(this)) {
                AppLovinSdkConfiguration.ConsentFlowUserGeography a10 = a();
                AppLovinSdkConfiguration.ConsentFlowUserGeography a11 = h0Var.a();
                return a10 != null ? a10.equals(a11) : a11 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        AppLovinSdkConfiguration.ConsentFlowUserGeography a10 = a();
        return (a10 == null ? 43 : a10.hashCode()) + 59;
    }

    public String toString() {
        return "CmpAdapterParameters(debugUserGeography=" + a() + ")";
    }

    public AppLovinSdkConfiguration.ConsentFlowUserGeography a() {
        return this.f7083a;
    }
}

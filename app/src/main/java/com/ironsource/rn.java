package com.ironsource;

import android.content.Context;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class rn implements qn {
    @Override // com.ironsource.qn
    public void a(int i10) {
        SDKUtils.setDebugMode(i10);
    }

    @Override // com.ironsource.qn
    public void a(Context applicationContext, String applicationKey, String userId, Map<String, String> initParams) {
        kotlin.jvm.internal.n.f(applicationContext, "applicationContext");
        kotlin.jvm.internal.n.f(applicationKey, "applicationKey");
        kotlin.jvm.internal.n.f(userId, "userId");
        kotlin.jvm.internal.n.f(initParams, "initParams");
        IronSourceNetwork.initSDK(applicationContext, applicationKey, userId, initParams);
    }

    @Override // com.ironsource.qn
    public void a(no onNetworkSDKInitListener) {
        kotlin.jvm.internal.n.f(onNetworkSDKInitListener, "onNetworkSDKInitListener");
        IronSourceNetwork.addInitListener(onNetworkSDKInitListener);
    }

    @Override // com.ironsource.qn
    public void a(String controllerConfig) {
        kotlin.jvm.internal.n.f(controllerConfig, "controllerConfig");
        SDKUtils.setControllerConfig(controllerConfig);
    }

    @Override // com.ironsource.qn
    public void b(String controllerUrl) {
        kotlin.jvm.internal.n.f(controllerUrl, "controllerUrl");
        SDKUtils.setControllerUrl(controllerUrl);
    }
}

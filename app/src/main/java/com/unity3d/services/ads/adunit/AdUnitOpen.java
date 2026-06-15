package com.unity3d.services.ads.adunit;

import android.os.ConditionVariable;
import com.ironsource.b9;
import com.ironsource.m5;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.AdOperationError;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.bridge.CallbackStatus;
import java.lang.reflect.Method;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class AdUnitOpen {
    private static Configuration _configuration;
    private static final SDKMetricsSender _sdkMetricsSender = (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);
    private static ConditionVariable _waitShowStatus;

    public static synchronized boolean open(String str, JSONObject jSONObject) throws NoSuchMethodException {
        boolean block;
        synchronized (AdUnitOpen.class) {
            Method method = AdUnitOpen.class.getMethod("showCallback", CallbackStatus.class);
            _waitShowStatus = new ConditionVariable();
            if (_configuration == null) {
                _configuration = new Configuration();
            }
            WebViewApp.getCurrentApp().invokeMethod(b9.h.K, m5.f18419v, method, str, jSONObject);
            block = _waitShowStatus.block(_configuration.getShowTimeout());
            _waitShowStatus = null;
            if (!block) {
                _sdkMetricsSender.sendMetric(AdOperationMetric.newAdShowFailure(AdOperationError.timeout, Long.valueOf(_configuration.getShowTimeout())));
            }
        }
        return block;
    }

    public static void setConfiguration(Configuration configuration) {
        _configuration = configuration;
    }

    public static void showCallback(CallbackStatus callbackStatus) {
        if (_waitShowStatus == null || !callbackStatus.equals(CallbackStatus.OK)) {
            return;
        }
        _waitShowStatus.open();
    }
}

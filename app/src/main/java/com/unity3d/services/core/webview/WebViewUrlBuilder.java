package com.unity3d.services.core.webview;

import com.ironsource.b9;
import com.ironsource.cc;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class WebViewUrlBuilder {
    private final SDKMetricsSender _sdkMetricsSender = (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);
    private final String _urlWithQueryString;

    public WebViewUrlBuilder(String str, Configuration configuration) {
        this._urlWithQueryString = str + ((("?platform=android" + buildQueryParam(cc.f16874p, configuration.getWebViewUrl())) + buildQueryParam("version", configuration.getWebViewVersion())) + buildQueryParam("isNativeCollectingMetrics", String.valueOf(configuration.areMetricsEnabledForCurrentSession())));
    }

    private String buildQueryParam(String str, String str2) {
        if (str2 != null) {
            try {
                return "" + b9.i.f16694c + str + b9.i.f16692b + URLEncoder.encode(str2, "UTF-8");
            } catch (UnsupportedEncodingException e8) {
                DeviceLog.exception(String.format("Unsupported charset when encoding %s", str), e8);
                return "";
            }
        }
        return "";
    }

    public String getUrlWithQueryString() {
        return this._urlWithQueryString;
    }
}

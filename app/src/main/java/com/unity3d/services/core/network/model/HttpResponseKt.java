package com.unity3d.services.core.network.model;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import j8.j0;
import java.util.Map;
import kotlin.jvm.internal.n;
/* compiled from: HttpResponse.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class HttpResponseKt {
    public static final boolean isSuccessful(HttpResponse httpResponse) {
        n.f(httpResponse, "<this>");
        int statusCode = httpResponse.getStatusCode();
        return 200 <= statusCode && statusCode < 300;
    }

    public static final HttpResponse toHttpResponse(UnityAdsNetworkException unityAdsNetworkException) {
        Map f10;
        n.f(unityAdsNetworkException, "<this>");
        Integer code = unityAdsNetworkException.getCode();
        int intValue = code != null ? code.intValue() : IronSourceError.ERROR_NO_INTERNET_CONNECTION;
        f10 = j0.f();
        String url = unityAdsNetworkException.getUrl();
        String str = url == null ? "" : url;
        String protocol = unityAdsNetworkException.getProtocol();
        String str2 = protocol == null ? "" : protocol;
        String client = unityAdsNetworkException.getClient();
        if (client == null) {
            client = "unknown";
        }
        return new HttpResponse("", intValue, f10, str, str2, client, 0L, 64, null);
    }
}

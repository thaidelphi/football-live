package com.unity3d.ads.adplayer.model;

import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: WebViewClientError.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class WebViewClientError {
    private final ErrorReason reason;
    private final Integer statusCode;
    private final String url;

    public WebViewClientError(String str, ErrorReason reason, Integer num) {
        n.f(reason, "reason");
        this.url = str;
        this.reason = reason;
        this.statusCode = num;
    }

    public static /* synthetic */ WebViewClientError copy$default(WebViewClientError webViewClientError, String str, ErrorReason errorReason, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = webViewClientError.url;
        }
        if ((i10 & 2) != 0) {
            errorReason = webViewClientError.reason;
        }
        if ((i10 & 4) != 0) {
            num = webViewClientError.statusCode;
        }
        return webViewClientError.copy(str, errorReason, num);
    }

    public final String component1() {
        return this.url;
    }

    public final ErrorReason component2() {
        return this.reason;
    }

    public final Integer component3() {
        return this.statusCode;
    }

    public final WebViewClientError copy(String str, ErrorReason reason, Integer num) {
        n.f(reason, "reason");
        return new WebViewClientError(str, reason, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WebViewClientError) {
            WebViewClientError webViewClientError = (WebViewClientError) obj;
            return n.a(this.url, webViewClientError.url) && this.reason == webViewClientError.reason && n.a(this.statusCode, webViewClientError.statusCode);
        }
        return false;
    }

    public final ErrorReason getReason() {
        return this.reason;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.reason.hashCode()) * 31;
        Integer num = this.statusCode;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "WebViewClientError(url=" + this.url + ", reason=" + this.reason + ", statusCode=" + this.statusCode + ')';
    }

    public /* synthetic */ WebViewClientError(String str, ErrorReason errorReason, Integer num, int i10, h hVar) {
        this((i10 & 1) != 0 ? null : str, errorReason, (i10 & 4) != 0 ? null : num);
    }
}

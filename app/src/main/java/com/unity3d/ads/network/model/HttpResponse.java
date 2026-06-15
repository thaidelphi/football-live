package com.unity3d.ads.network.model;

import j8.j0;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: HttpResponse.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class HttpResponse {
    private final Object body;
    private final Map<String, Object> headers;
    private final int statusCode;
    private final String urlString;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body) {
        this(body, 0, null, null, 14, null);
        n.f(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i10) {
        this(body, i10, null, null, 12, null);
        n.f(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i10, Map<String, ? extends Object> headers) {
        this(body, i10, headers, null, 8, null);
        n.f(body, "body");
        n.f(headers, "headers");
    }

    public HttpResponse(Object body, int i10, Map<String, ? extends Object> headers, String urlString) {
        n.f(body, "body");
        n.f(headers, "headers");
        n.f(urlString, "urlString");
        this.body = body;
        this.statusCode = i10;
        this.headers = headers;
        this.urlString = urlString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, Object obj, int i10, Map map, String str, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = httpResponse.body;
        }
        if ((i11 & 2) != 0) {
            i10 = httpResponse.statusCode;
        }
        if ((i11 & 4) != 0) {
            map = httpResponse.headers;
        }
        if ((i11 & 8) != 0) {
            str = httpResponse.urlString;
        }
        return httpResponse.copy(obj, i10, map, str);
    }

    public final Object component1() {
        return this.body;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final Map<String, Object> component3() {
        return this.headers;
    }

    public final String component4() {
        return this.urlString;
    }

    public final HttpResponse copy(Object body, int i10, Map<String, ? extends Object> headers, String urlString) {
        n.f(body, "body");
        n.f(headers, "headers");
        n.f(urlString, "urlString");
        return new HttpResponse(body, i10, headers, urlString);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HttpResponse) {
            HttpResponse httpResponse = (HttpResponse) obj;
            return n.a(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && n.a(this.headers, httpResponse.headers) && n.a(this.urlString, httpResponse.urlString);
        }
        return false;
    }

    public final Object getBody() {
        return this.body;
    }

    public final Map<String, Object> getHeaders() {
        return this.headers;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getUrlString() {
        return this.urlString;
    }

    public int hashCode() {
        return (((((this.body.hashCode() * 31) + this.statusCode) * 31) + this.headers.hashCode()) * 31) + this.urlString.hashCode();
    }

    public String toString() {
        return "HttpResponse(body=" + this.body + ", statusCode=" + this.statusCode + ", headers=" + this.headers + ", urlString=" + this.urlString + ')';
    }

    public /* synthetic */ HttpResponse(Object obj, int i10, Map map, String str, int i11, h hVar) {
        this(obj, (i11 & 2) != 0 ? 200 : i10, (i11 & 4) != 0 ? j0.f() : map, (i11 & 8) != 0 ? "" : str);
    }
}

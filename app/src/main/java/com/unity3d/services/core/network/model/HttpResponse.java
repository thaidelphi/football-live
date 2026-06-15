package com.unity3d.services.core.network.model;

import androidx.privacysandbox.ads.adservices.topics.d;
import j8.j0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: HttpResponse.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class HttpResponse {
    private final Object body;
    private final String client;
    private final long contentSize;
    private final Map<String, List<String>> headers;
    private final String protocol;
    private final int statusCode;
    private final String urlString;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body) {
        this(body, 0, null, null, null, null, 0L, 126, null);
        n.f(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i10) {
        this(body, i10, null, null, null, null, 0L, 124, null);
        n.f(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i10, Map<String, ? extends List<String>> headers) {
        this(body, i10, headers, null, null, null, 0L, 120, null);
        n.f(body, "body");
        n.f(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i10, Map<String, ? extends List<String>> headers, String urlString) {
        this(body, i10, headers, urlString, null, null, 0L, 112, null);
        n.f(body, "body");
        n.f(headers, "headers");
        n.f(urlString, "urlString");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i10, Map<String, ? extends List<String>> headers, String urlString, String protocol) {
        this(body, i10, headers, urlString, protocol, null, 0L, 96, null);
        n.f(body, "body");
        n.f(headers, "headers");
        n.f(urlString, "urlString");
        n.f(protocol, "protocol");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i10, Map<String, ? extends List<String>> headers, String urlString, String protocol, String client) {
        this(body, i10, headers, urlString, protocol, client, 0L, 64, null);
        n.f(body, "body");
        n.f(headers, "headers");
        n.f(urlString, "urlString");
        n.f(protocol, "protocol");
        n.f(client, "client");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpResponse(Object body, int i10, Map<String, ? extends List<String>> headers, String urlString, String protocol, String client, long j10) {
        n.f(body, "body");
        n.f(headers, "headers");
        n.f(urlString, "urlString");
        n.f(protocol, "protocol");
        n.f(client, "client");
        this.body = body;
        this.statusCode = i10;
        this.headers = headers;
        this.urlString = urlString;
        this.protocol = protocol;
        this.client = client;
        this.contentSize = j10;
    }

    public final Object component1() {
        return this.body;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final Map<String, List<String>> component3() {
        return this.headers;
    }

    public final String component4() {
        return this.urlString;
    }

    public final String component5() {
        return this.protocol;
    }

    public final String component6() {
        return this.client;
    }

    public final long component7() {
        return this.contentSize;
    }

    public final HttpResponse copy(Object body, int i10, Map<String, ? extends List<String>> headers, String urlString, String protocol, String client, long j10) {
        n.f(body, "body");
        n.f(headers, "headers");
        n.f(urlString, "urlString");
        n.f(protocol, "protocol");
        n.f(client, "client");
        return new HttpResponse(body, i10, headers, urlString, protocol, client, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HttpResponse) {
            HttpResponse httpResponse = (HttpResponse) obj;
            return n.a(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && n.a(this.headers, httpResponse.headers) && n.a(this.urlString, httpResponse.urlString) && n.a(this.protocol, httpResponse.protocol) && n.a(this.client, httpResponse.client) && this.contentSize == httpResponse.contentSize;
        }
        return false;
    }

    public final Object getBody() {
        return this.body;
    }

    public final String getClient() {
        return this.client;
    }

    public final long getContentSize() {
        return this.contentSize;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getUrlString() {
        return this.urlString;
    }

    public int hashCode() {
        return (((((((((((this.body.hashCode() * 31) + this.statusCode) * 31) + this.headers.hashCode()) * 31) + this.urlString.hashCode()) * 31) + this.protocol.hashCode()) * 31) + this.client.hashCode()) * 31) + d.a(this.contentSize);
    }

    public String toString() {
        return "HttpResponse(body=" + this.body + ", statusCode=" + this.statusCode + ", headers=" + this.headers + ", urlString=" + this.urlString + ", protocol=" + this.protocol + ", client=" + this.client + ", contentSize=" + this.contentSize + ')';
    }

    public /* synthetic */ HttpResponse(Object obj, int i10, Map map, String str, String str2, String str3, long j10, int i11, h hVar) {
        this(obj, (i11 & 2) != 0 ? 200 : i10, (i11 & 4) != 0 ? j0.f() : map, (i11 & 8) != 0 ? "" : str, (i11 & 16) == 0 ? str2 : "", (i11 & 32) != 0 ? "unknown" : str3, (i11 & 64) != 0 ? -1L : j10);
    }
}

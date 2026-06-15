package com.unity3d.ads.network.model;

import com.google.android.gms.ads.AdRequest;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.ads.network.model.HttpBody;
import j8.j0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: HttpRequest.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class HttpRequest {
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_SCHEME = "https";
    private static final int DEFAULT_TIMEOUT = 30000;
    private final String baseURL;
    private final HttpBody body;
    private final int callTimeout;
    private final int connectTimeout;
    private final Map<String, List<String>> headers;
    private final RequestType method;
    private final Map<String, String> parameters;
    private final String path;
    private final Integer port;
    private final int readTimeout;
    private final String scheme;
    private final int writeTimeout;

    /* compiled from: HttpRequest.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL) {
        this(baseURL, null, null, null, null, null, null, null, 0, 0, 0, 0, 4094, null);
        n.f(baseURL, "baseURL");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path) {
        this(baseURL, path, null, null, null, null, null, null, 0, 0, 0, 0, 4092, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method) {
        this(baseURL, path, method, null, null, null, null, null, 0, 0, 0, 0, 4088, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body) {
        this(baseURL, path, method, body, null, null, null, null, 0, 0, 0, 0, 4080, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers) {
        this(baseURL, path, method, body, headers, null, null, null, 0, 0, 0, 0, 4064, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(body, "body");
        n.f(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters) {
        this(baseURL, path, method, body, headers, parameters, null, null, 0, 0, 0, 0, 4032, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(body, "body");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme) {
        this(baseURL, path, method, body, headers, parameters, scheme, null, 0, 0, 0, 0, 3968, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(body, "body");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, 0, 0, 0, 0, 3840, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(body, "body");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num, int i10) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i10, 0, 0, 0, 3584, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(body, "body");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num, int i10, int i11) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i10, i11, 0, 0, 3072, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(body, "body");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num, int i10, int i11, int i12) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i10, i11, i12, 0, a.f18931n, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(body, "body");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(scheme, "scheme");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num, int i10, int i11, int i12, int i13) {
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(body, "body");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(scheme, "scheme");
        this.baseURL = baseURL;
        this.path = path;
        this.method = method;
        this.body = body;
        this.headers = headers;
        this.parameters = parameters;
        this.scheme = scheme;
        this.port = num;
        this.connectTimeout = i10;
        this.readTimeout = i11;
        this.writeTimeout = i12;
        this.callTimeout = i13;
    }

    public final String component1() {
        return this.baseURL;
    }

    public final int component10() {
        return this.readTimeout;
    }

    public final int component11() {
        return this.writeTimeout;
    }

    public final int component12() {
        return this.callTimeout;
    }

    public final String component2() {
        return this.path;
    }

    public final RequestType component3() {
        return this.method;
    }

    public final HttpBody component4() {
        return this.body;
    }

    public final Map<String, List<String>> component5() {
        return this.headers;
    }

    public final Map<String, String> component6() {
        return this.parameters;
    }

    public final String component7() {
        return this.scheme;
    }

    public final Integer component8() {
        return this.port;
    }

    public final int component9() {
        return this.connectTimeout;
    }

    public final HttpRequest copy(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num, int i10, int i11, int i12, int i13) {
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(body, "body");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(scheme, "scheme");
        return new HttpRequest(baseURL, path, method, body, headers, parameters, scheme, num, i10, i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HttpRequest) {
            HttpRequest httpRequest = (HttpRequest) obj;
            return n.a(this.baseURL, httpRequest.baseURL) && n.a(this.path, httpRequest.path) && this.method == httpRequest.method && n.a(this.body, httpRequest.body) && n.a(this.headers, httpRequest.headers) && n.a(this.parameters, httpRequest.parameters) && n.a(this.scheme, httpRequest.scheme) && n.a(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout;
        }
        return false;
    }

    public final String getBaseURL() {
        return this.baseURL;
    }

    public final HttpBody getBody() {
        return this.body;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final RequestType getMethod() {
        return this.method;
    }

    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public final String getPath() {
        return this.path;
    }

    public final Integer getPort() {
        return this.port;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.baseURL.hashCode() * 31) + this.path.hashCode()) * 31) + this.method.hashCode()) * 31) + this.body.hashCode()) * 31) + this.headers.hashCode()) * 31) + this.parameters.hashCode()) * 31) + this.scheme.hashCode()) * 31;
        Integer num = this.port;
        return ((((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.connectTimeout) * 31) + this.readTimeout) * 31) + this.writeTimeout) * 31) + this.callTimeout;
    }

    public String toString() {
        return "HttpRequest(baseURL=" + this.baseURL + ", path=" + this.path + ", method=" + this.method + ", body=" + this.body + ", headers=" + this.headers + ", parameters=" + this.parameters + ", scheme=" + this.scheme + ", port=" + this.port + ", connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ", callTimeout=" + this.callTimeout + ')';
    }

    public /* synthetic */ HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map map, Map map2, String str3, Integer num, int i10, int i11, int i12, int i13, int i14, h hVar) {
        this(str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? RequestType.GET : requestType, (i14 & 8) != 0 ? HttpBody.EmptyBody.INSTANCE : httpBody, (i14 & 16) != 0 ? j0.f() : map, (i14 & 32) != 0 ? j0.f() : map2, (i14 & 64) != 0 ? "https" : str3, (i14 & 128) != 0 ? null : num, (i14 & 256) != 0 ? 30000 : i10, (i14 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? 30000 : i11, (i14 & 1024) != 0 ? 30000 : i12, (i14 & a.f18931n) == 0 ? i13 : 30000);
    }
}

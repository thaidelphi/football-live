package com.unity3d.services.core.network.model;

import com.google.android.gms.ads.AdRequest;
import com.google.protobuf.CodedOutputStream;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.ads.core.data.model.OperationType;
import j8.j0;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: HttpRequest.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class HttpRequest {
    public static final Companion Companion = new Companion(null);
    public static final String DEFAULT_SCHEME = "https";
    public static final int DEFAULT_TIMEOUT = 30000;
    private final String baseURL;
    private final Object body;
    private final BodyType bodyType;
    private final int callTimeout;
    private final int connectTimeout;
    private final File downloadDestination;
    private final Map<String, List<String>> headers;
    private final boolean isProtobuf;
    private final RequestType method;
    private final OperationType operationType;
    private final Map<String, String> parameters;
    private final String path;
    private final Integer port;
    private final int priority;
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
        this(baseURL, null, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131070, null);
        n.f(baseURL, "baseURL");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path) {
        this(baseURL, path, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131068, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method) {
        this(baseURL, path, method, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131064, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj) {
        this(baseURL, path, method, obj, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131056, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers) {
        this(baseURL, path, method, obj, headers, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131040, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters) {
        this(baseURL, path, method, obj, headers, parameters, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131008, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, null, null, 0, 0, 0, 0, false, null, null, 0, 130944, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(bodyType, "bodyType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, null, 0, 0, 0, 0, false, null, null, 0, 130816, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(bodyType, "bodyType");
        n.f(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, 0, 0, 0, 0, false, null, null, 0, 130560, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(bodyType, "bodyType");
        n.f(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i10) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, 0, 0, 0, false, null, null, 0, 130048, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(bodyType, "bodyType");
        n.f(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i10, int i11) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, 0, 0, false, null, null, 0, 129024, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(bodyType, "bodyType");
        n.f(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i10, int i11, int i12) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, 0, false, null, null, 0, 126976, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(bodyType, "bodyType");
        n.f(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i10, int i11, int i12, int i13) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, i13, false, null, null, 0, 122880, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(bodyType, "bodyType");
        n.f(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i10, int i11, int i12, int i13, boolean z10) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, i13, z10, null, null, 0, 114688, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(bodyType, "bodyType");
        n.f(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i10, int i11, int i12, int i13, boolean z10, OperationType operationType) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, i13, z10, operationType, null, 0, 98304, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(bodyType, "bodyType");
        n.f(scheme, "scheme");
        n.f(operationType, "operationType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i10, int i11, int i12, int i13, boolean z10, OperationType operationType, File file) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, i13, z10, operationType, file, 0, 65536, null);
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(bodyType, "bodyType");
        n.f(scheme, "scheme");
        n.f(operationType, "operationType");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i10, int i11, int i12, int i13, boolean z10, OperationType operationType, File file, int i14) {
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(bodyType, "bodyType");
        n.f(scheme, "scheme");
        n.f(operationType, "operationType");
        this.baseURL = baseURL;
        this.path = path;
        this.method = method;
        this.body = obj;
        this.headers = headers;
        this.parameters = parameters;
        this.bodyType = bodyType;
        this.scheme = scheme;
        this.port = num;
        this.connectTimeout = i10;
        this.readTimeout = i11;
        this.writeTimeout = i12;
        this.callTimeout = i13;
        this.isProtobuf = z10;
        this.operationType = operationType;
        this.downloadDestination = file;
        this.priority = i14;
    }

    public final String component1() {
        return this.baseURL;
    }

    public final int component10() {
        return this.connectTimeout;
    }

    public final int component11() {
        return this.readTimeout;
    }

    public final int component12() {
        return this.writeTimeout;
    }

    public final int component13() {
        return this.callTimeout;
    }

    public final boolean component14() {
        return this.isProtobuf;
    }

    public final OperationType component15() {
        return this.operationType;
    }

    public final File component16() {
        return this.downloadDestination;
    }

    public final int component17() {
        return this.priority;
    }

    public final String component2() {
        return this.path;
    }

    public final RequestType component3() {
        return this.method;
    }

    public final Object component4() {
        return this.body;
    }

    public final Map<String, List<String>> component5() {
        return this.headers;
    }

    public final Map<String, String> component6() {
        return this.parameters;
    }

    public final BodyType component7() {
        return this.bodyType;
    }

    public final String component8() {
        return this.scheme;
    }

    public final Integer component9() {
        return this.port;
    }

    public final HttpRequest copy(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i10, int i11, int i12, int i13, boolean z10, OperationType operationType, File file, int i14) {
        n.f(baseURL, "baseURL");
        n.f(path, "path");
        n.f(method, "method");
        n.f(headers, "headers");
        n.f(parameters, "parameters");
        n.f(bodyType, "bodyType");
        n.f(scheme, "scheme");
        n.f(operationType, "operationType");
        return new HttpRequest(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, i13, z10, operationType, file, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HttpRequest) {
            HttpRequest httpRequest = (HttpRequest) obj;
            return n.a(this.baseURL, httpRequest.baseURL) && n.a(this.path, httpRequest.path) && this.method == httpRequest.method && n.a(this.body, httpRequest.body) && n.a(this.headers, httpRequest.headers) && n.a(this.parameters, httpRequest.parameters) && this.bodyType == httpRequest.bodyType && n.a(this.scheme, httpRequest.scheme) && n.a(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout && this.isProtobuf == httpRequest.isProtobuf && this.operationType == httpRequest.operationType && n.a(this.downloadDestination, httpRequest.downloadDestination) && this.priority == httpRequest.priority;
        }
        return false;
    }

    public final String getBaseURL() {
        return this.baseURL;
    }

    public final Object getBody() {
        return this.body;
    }

    public final BodyType getBodyType() {
        return this.bodyType;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final File getDownloadDestination() {
        return this.downloadDestination;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final RequestType getMethod() {
        return this.method;
    }

    public final OperationType getOperationType() {
        return this.operationType;
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

    public final int getPriority() {
        return this.priority;
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

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.baseURL.hashCode() * 31) + this.path.hashCode()) * 31) + this.method.hashCode()) * 31;
        Object obj = this.body;
        int hashCode2 = (((((((((hashCode + (obj == null ? 0 : obj.hashCode())) * 31) + this.headers.hashCode()) * 31) + this.parameters.hashCode()) * 31) + this.bodyType.hashCode()) * 31) + this.scheme.hashCode()) * 31;
        Integer num = this.port;
        int hashCode3 = (((((((((hashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.connectTimeout) * 31) + this.readTimeout) * 31) + this.writeTimeout) * 31) + this.callTimeout) * 31;
        boolean z10 = this.isProtobuf;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode4 = (((hashCode3 + i10) * 31) + this.operationType.hashCode()) * 31;
        File file = this.downloadDestination;
        return ((hashCode4 + (file != null ? file.hashCode() : 0)) * 31) + this.priority;
    }

    public final boolean isProtobuf() {
        return this.isProtobuf;
    }

    public String toString() {
        return "HttpRequest(baseURL=" + this.baseURL + ", path=" + this.path + ", method=" + this.method + ", body=" + this.body + ", headers=" + this.headers + ", parameters=" + this.parameters + ", bodyType=" + this.bodyType + ", scheme=" + this.scheme + ", port=" + this.port + ", connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ", callTimeout=" + this.callTimeout + ", isProtobuf=" + this.isProtobuf + ", operationType=" + this.operationType + ", downloadDestination=" + this.downloadDestination + ", priority=" + this.priority + ')';
    }

    public /* synthetic */ HttpRequest(String str, String str2, RequestType requestType, Object obj, Map map, Map map2, BodyType bodyType, String str3, Integer num, int i10, int i11, int i12, int i13, boolean z10, OperationType operationType, File file, int i14, int i15, h hVar) {
        this(str, (i15 & 2) != 0 ? "" : str2, (i15 & 4) != 0 ? RequestType.GET : requestType, (i15 & 8) != 0 ? null : obj, (i15 & 16) != 0 ? j0.f() : map, (i15 & 32) != 0 ? j0.f() : map2, (i15 & 64) != 0 ? BodyType.UNKNOWN : bodyType, (i15 & 128) != 0 ? DEFAULT_SCHEME : str3, (i15 & 256) != 0 ? null : num, (i15 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? 30000 : i10, (i15 & 1024) != 0 ? 30000 : i11, (i15 & a.f18931n) != 0 ? 30000 : i12, (i15 & CodedOutputStream.DEFAULT_BUFFER_SIZE) == 0 ? i13 : 30000, (i15 & 8192) != 0 ? false : z10, (i15 & 16384) != 0 ? OperationType.UNKNOWN : operationType, (i15 & 32768) != 0 ? null : file, (i15 & 65536) == 0 ? i14 : 0);
    }
}

package com.unity3d.services.core.network.mapper;

import b9.p;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.core.network.model.HttpRequest;
import j8.y;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.n;
import n9.r;
import n9.u;
import n9.y;
import n9.z;
/* compiled from: HttpRequestToOkHttpRequest.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class HttpRequestToOkHttpRequestKt {
    private static final z generateOkHttpBody(Object obj) {
        if (obj instanceof byte[]) {
            z d10 = z.d(u.d("text/plain;charset=utf-8"), (byte[]) obj);
            n.e(d10, "create(MediaType.parse(\"…in;charset=utf-8\"), body)");
            return d10;
        } else if (obj instanceof String) {
            z c10 = z.c(u.d("text/plain;charset=utf-8"), (String) obj);
            n.e(c10, "create(MediaType.parse(\"…in;charset=utf-8\"), body)");
            return c10;
        } else {
            z c11 = z.c(u.d("text/plain;charset=utf-8"), "");
            n.e(c11, "create(MediaType.parse(\"…lain;charset=utf-8\"), \"\")");
            return c11;
        }
    }

    private static final r generateOkHttpHeaders(HttpRequest httpRequest) {
        String A;
        r.a aVar = new r.a();
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            A = y.A(entry.getValue(), ",", null, null, 0, null, null, 62, null);
            aVar.a(entry.getKey(), A);
        }
        r d10 = aVar.d();
        n.e(d10, "Builder()\n    .also { he…ng(\",\")) } }\n    .build()");
        return d10;
    }

    private static final z generateOkHttpProtobufBody(Object obj) {
        if (obj instanceof byte[]) {
            z d10 = z.d(u.d(CommonGatewayClient.HEADER_PROTOBUF), (byte[]) obj);
            n.e(d10, "create(MediaType.parse(\"…ation/x-protobuf\"), body)");
            return d10;
        } else if (obj instanceof String) {
            z c10 = z.c(u.d(CommonGatewayClient.HEADER_PROTOBUF), (String) obj);
            n.e(c10, "create(MediaType.parse(\"…ation/x-protobuf\"), body)");
            return c10;
        } else {
            z c11 = z.c(u.d(CommonGatewayClient.HEADER_PROTOBUF), "");
            n.e(c11, "create(MediaType.parse(\"…ication/x-protobuf\"), \"\")");
            return c11;
        }
    }

    public static final n9.y toOkHttpProtoRequest(HttpRequest httpRequest) {
        String z02;
        String z03;
        String Y;
        n.f(httpRequest, "<this>");
        y.a aVar = new y.a();
        StringBuilder sb = new StringBuilder();
        z02 = p.z0(httpRequest.getBaseURL(), '/');
        sb.append(z02);
        sb.append('/');
        z03 = p.z0(httpRequest.getPath(), '/');
        sb.append(z03);
        Y = p.Y(sb.toString(), "/");
        y.a h10 = aVar.h(Y);
        String str = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        n9.y b10 = h10.f(str, body != null ? generateOkHttpProtobufBody(body) : null).e(generateOkHttpHeaders(httpRequest)).b();
        n.e(b10, "Builder()\n    .url(\"${ba…tpHeaders())\n    .build()");
        return b10;
    }

    public static final n9.y toOkHttpRequest(HttpRequest httpRequest) {
        String z02;
        String z03;
        String Y;
        n.f(httpRequest, "<this>");
        y.a aVar = new y.a();
        StringBuilder sb = new StringBuilder();
        z02 = p.z0(httpRequest.getBaseURL(), '/');
        sb.append(z02);
        sb.append('/');
        z03 = p.z0(httpRequest.getPath(), '/');
        sb.append(z03);
        Y = p.Y(sb.toString(), "/");
        y.a h10 = aVar.h(Y);
        String str = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        n9.y b10 = h10.f(str, body != null ? generateOkHttpBody(body) : null).e(generateOkHttpHeaders(httpRequest)).b();
        n.e(b10, "Builder()\n    .url(\"${ba…tpHeaders())\n    .build()");
        return b10;
    }
}

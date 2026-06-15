package com.unity3d.ads.network.mapper;

import b9.p;
import com.unity3d.ads.network.model.HttpBody;
import com.unity3d.ads.network.model.HttpRequest;
import i8.l;
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
    private static final z generateOkHttpBody(HttpBody httpBody) {
        if (httpBody instanceof HttpBody.StringBody) {
            return z.c(u.d("text/plain;charset=utf-8"), ((HttpBody.StringBody) httpBody).getContent());
        }
        if (httpBody instanceof HttpBody.ByteArrayBody) {
            return z.d(u.d("text/plain;charset=utf-8"), ((HttpBody.ByteArrayBody) httpBody).getContent());
        }
        if (httpBody instanceof HttpBody.EmptyBody) {
            return null;
        }
        throw new l();
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
        n9.y b10 = aVar.h(Y).f(httpRequest.getMethod().toString(), generateOkHttpBody(httpRequest.getBody())).e(generateOkHttpHeaders(httpRequest)).b();
        n.e(b10, "Builder()\n    .url(\"${ba…tpHeaders())\n    .build()");
        return b10;
    }
}

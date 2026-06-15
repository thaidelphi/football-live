package com.unity3d.services.core.network.core;

import b9.p;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import d9.i;
import d9.o;
import d9.r1;
import i8.o;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
import m8.d;
import n8.c;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
/* compiled from: CronetClient.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CronetClient implements HttpClient {
    public static final Companion Companion = new Companion(null);
    private static final String MSG_CONNECTION_FAILED = "Network request failed";
    private static final String MSG_CONNECTION_TIMEOUT = "Network request timed out";
    private static final String NETWORK_CLIENT_CRONET = "cronet";
    private final ISDKDispatchers dispatchers;
    private final CronetEngine engine;

    /* compiled from: CronetClient.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public CronetClient(CronetEngine engine, ISDKDispatchers dispatchers) {
        n.f(engine, "engine");
        n.f(dispatchers, "dispatchers");
        this.engine = engine;
        this.dispatchers = dispatchers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildUrl(HttpRequest httpRequest) {
        String z02;
        String z03;
        String Y;
        StringBuilder sb = new StringBuilder();
        z02 = p.z0(httpRequest.getBaseURL(), '/');
        sb.append(z02);
        sb.append('/');
        z03 = p.z0(httpRequest.getPath(), '/');
        sb.append(z03);
        Y = p.Y(sb.toString(), "/");
        return Y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
        r3 = b9.n.h(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long getContentSize(org.chromium.net.UrlResponseInfo r3) {
        /*
            r2 = this;
            java.util.Map r3 = r3.getAllHeaders()
            java.lang.String r0 = "Content-Length"
            java.lang.Object r3 = r3.get(r0)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L22
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L22
            java.lang.Long r3 = b9.f.h(r3)
            if (r3 == 0) goto L22
            long r0 = r3.longValue()
            goto L24
        L22:
            r0 = -1
        L24:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.core.CronetClient.getContentSize(org.chromium.net.UrlResponseInfo):long");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPriority(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return i10 != 2 ? 1 : 2;
            }
            return 3;
        }
        return 4;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public Object execute(HttpRequest httpRequest, d<? super HttpResponse> dVar) {
        d b10;
        Object c10;
        byte[] bArr;
        b10 = c.b(dVar);
        final o oVar = new o(b10, 1);
        oVar.C();
        final ISDKDispatchers iSDKDispatchers = this.dispatchers;
        final long readTimeout = httpRequest.getReadTimeout();
        UnityAdsUrlRequestCallback unityAdsUrlRequestCallback = new UnityAdsUrlRequestCallback(iSDKDispatchers, readTimeout) { // from class: com.unity3d.services.core.network.core.CronetClient$execute$2$callback$1
            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback, org.chromium.net.UrlRequest.Callback
            public void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
                super.onCanceled(urlRequest, urlResponseInfo);
                NetworkTimeoutException networkTimeoutException = new NetworkTimeoutException("Network request timed out", null, null, urlResponseInfo != null ? urlResponseInfo.getUrl() : null, urlResponseInfo != null ? urlResponseInfo.getNegotiatedProtocol() : null, null, "cronet", 38, null);
                d9.n<HttpResponse> nVar = oVar;
                o.a aVar = i8.o.f26626b;
                nVar.resumeWith(i8.o.b(i8.p.a(networkTimeoutException)));
            }

            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback, org.chromium.net.UrlRequest.Callback
            public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
                super.onFailed(urlRequest, urlResponseInfo, cronetException);
                NetworkException networkException = cronetException instanceof NetworkException ? (NetworkException) cronetException : null;
                UnityAdsNetworkException unityAdsNetworkException = new UnityAdsNetworkException(OkHttp3Client.MSG_CONNECTION_FAILED, null, urlResponseInfo != null ? Integer.valueOf(urlResponseInfo.getHttpStatusCode()) : null, urlResponseInfo != null ? urlResponseInfo.getUrl() : null, urlResponseInfo != null ? urlResponseInfo.getNegotiatedProtocol() : null, networkException != null ? Integer.valueOf(networkException.getCronetInternalErrorCode()) : null, "cronet", 2, null);
                d9.n<HttpResponse> nVar = oVar;
                o.a aVar = i8.o.f26626b;
                nVar.resumeWith(i8.o.b(i8.p.a(unityAdsNetworkException)));
            }

            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback
            public void onSucceeded(UrlRequest request, UrlResponseInfo info, byte[] bodyBytes) {
                long contentSize;
                n.f(request, "request");
                n.f(info, "info");
                n.f(bodyBytes, "bodyBytes");
                d9.n<HttpResponse> nVar = oVar;
                int httpStatusCode = info.getHttpStatusCode();
                Map<String, List<String>> allHeaders = info.getAllHeaders();
                String url = info.getUrl();
                String negotiatedProtocol = info.getNegotiatedProtocol();
                contentSize = this.getContentSize(info);
                n.e(allHeaders, "allHeaders");
                n.e(url, "url");
                n.e(negotiatedProtocol, "negotiatedProtocol");
                HttpResponse httpResponse = new HttpResponse(bodyBytes, httpStatusCode, allHeaders, url, negotiatedProtocol, "cronet", contentSize);
                o.a aVar = i8.o.f26626b;
                nVar.resumeWith(i8.o.b(httpResponse));
            }
        };
        UrlRequest.Builder newUrlRequestBuilder = this.engine.newUrlRequestBuilder(buildUrl(httpRequest), unityAdsUrlRequestCallback, r1.a(this.dispatchers.getIo()));
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            String key = entry.getKey();
            for (String str : entry.getValue()) {
                newUrlRequestBuilder.addHeader(key, str);
            }
        }
        if (httpRequest.getMethod() == RequestType.POST) {
            Object body = httpRequest.getBody();
            if (body instanceof byte[]) {
                bArr = (byte[]) httpRequest.getBody();
            } else if (body instanceof String) {
                bArr = ((String) httpRequest.getBody()).getBytes(b9.c.f5283b);
                n.e(bArr, "this as java.lang.String).getBytes(charset)");
            } else {
                bArr = new byte[0];
            }
            newUrlRequestBuilder.setUploadDataProvider(UploadDataProviders.create(bArr), r1.a(this.dispatchers.getIo()));
        }
        UrlRequest req = newUrlRequestBuilder.setHttpMethod(httpRequest.getMethod().toString()).setPriority(getPriority(httpRequest.getPriority())).build();
        oVar.r(new CronetClient$execute$2$2(req));
        n.e(req, "req");
        unityAdsUrlRequestCallback.startTimer(req);
        req.start();
        Object z10 = oVar.z();
        c10 = n8.d.c();
        if (z10 == c10) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return z10;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public HttpResponse executeBlocking(HttpRequest request) {
        n.f(request, "request");
        return (HttpResponse) i.e(this.dispatchers.getIo(), new CronetClient$executeBlocking$1(this, request, null));
    }

    public final void shutdown() {
        this.engine.shutdown();
    }
}

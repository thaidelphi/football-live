package com.unity3d.services.core.network.core;

import android.content.Context;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.core.OkHttp3Client;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import com.unity3d.services.core.network.mapper.HttpRequestToOkHttpRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import d9.i;
import d9.o;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import i8.o;
import i8.p;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
import m8.d;
import n8.c;
import n9.a0;
import n9.e;
import n9.f;
import n9.v;
import n9.y;
import r8.m;
/* compiled from: OkHttp3Client.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class OkHttp3Client implements HttpClient {
    public static final Companion Companion = new Companion(null);
    public static final String MSG_CONNECTION_FAILED = "Network request failed";
    public static final String MSG_CONNECTION_TIMEOUT = "Network request timeout";
    public static final String NETWORK_CLIENT_OKHTTP = "okhttp";
    private final CleanupDirectory cleanupDirectory;
    private final v client;
    private final Context context;
    private final ISDKDispatchers dispatchers;
    private final AlternativeFlowReader isAlternativeFlowReader;
    private final File okHttpCache;
    private final SessionRepository sessionRepository;

    /* compiled from: OkHttp3Client.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OkHttp3Client.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class RequestComplete {
        private final Object body;
        private final a0 response;

        public RequestComplete(a0 response, Object obj) {
            n.f(response, "response");
            this.response = response;
            this.body = obj;
        }

        public static /* synthetic */ RequestComplete copy$default(RequestComplete requestComplete, a0 a0Var, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                a0Var = requestComplete.response;
            }
            if ((i10 & 2) != 0) {
                obj = requestComplete.body;
            }
            return requestComplete.copy(a0Var, obj);
        }

        public final a0 component1() {
            return this.response;
        }

        public final Object component2() {
            return this.body;
        }

        public final RequestComplete copy(a0 response, Object obj) {
            n.f(response, "response");
            return new RequestComplete(response, obj);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RequestComplete) {
                RequestComplete requestComplete = (RequestComplete) obj;
                return n.a(this.response, requestComplete.response) && n.a(this.body, requestComplete.body);
            }
            return false;
        }

        public final Object getBody() {
            return this.body;
        }

        public final a0 getResponse() {
            return this.response;
        }

        public int hashCode() {
            int hashCode = this.response.hashCode() * 31;
            Object obj = this.body;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "RequestComplete(response=" + this.response + ", body=" + this.body + ')';
        }

        public /* synthetic */ RequestComplete(a0 a0Var, Object obj, int i10, h hVar) {
            this(a0Var, (i10 & 2) != 0 ? null : obj);
        }
    }

    public OkHttp3Client(ISDKDispatchers dispatchers, v client, Context context, SessionRepository sessionRepository, CleanupDirectory cleanupDirectory, AlternativeFlowReader isAlternativeFlowReader) {
        n.f(dispatchers, "dispatchers");
        n.f(client, "client");
        n.f(context, "context");
        n.f(sessionRepository, "sessionRepository");
        n.f(cleanupDirectory, "cleanupDirectory");
        n.f(isAlternativeFlowReader, "isAlternativeFlowReader");
        this.dispatchers = dispatchers;
        this.client = client;
        this.context = context;
        this.sessionRepository = sessionRepository;
        this.cleanupDirectory = cleanupDirectory;
        this.isAlternativeFlowReader = isAlternativeFlowReader;
        this.okHttpCache = getOkHttpCache();
    }

    private final File getOkHttpCache() {
        File n10;
        File filesDir = this.context.getFilesDir();
        n.e(filesDir, "context.filesDir");
        n10 = m.n(filesDir, UnityAdsConstants.DefaultUrls.HTTP_CACHE_DIR_NAME);
        n10.mkdirs();
        if (this.sessionRepository.getNativeConfiguration().hasCachedAssetsConfiguration()) {
            NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = this.sessionRepository.getNativeConfiguration().getCachedAssetsConfiguration();
            this.cleanupDirectory.invoke(n10, cachedAssetsConfiguration.getMaxCachedAssetSizeMb(), cachedAssetsConfiguration.getMaxCachedAssetAgeMs());
        }
        return n10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object makeRequest(final HttpRequest httpRequest, long j10, long j11, long j12, d<? super RequestComplete> dVar) {
        d b10;
        Object c10;
        y okHttpProtoRequest = httpRequest.isProtobuf() ? HttpRequestToOkHttpRequestKt.toOkHttpProtoRequest(httpRequest) : HttpRequestToOkHttpRequestKt.toOkHttpRequest(httpRequest);
        v.b u10 = this.client.u();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        v a10 = u10.c(j10, timeUnit).d(j11, timeUnit).e(j12, timeUnit).a();
        final File file = new File(this.okHttpCache, StringExtensionsKt.getSHA256Hash(httpRequest.getBaseURL()));
        Long d10 = b.d((file.exists() && file.isFile()) ? file.length() : 0L);
        y yVar = null;
        if (!(d10.longValue() > 0)) {
            d10 = null;
        }
        if (d10 != null) {
            long longValue = d10.longValue();
            DeviceLog.debug("Resuming download for " + httpRequest.getBaseURL());
            yVar = okHttpProtoRequest.h().a("Range", "bytes=" + longValue + '-').b();
        }
        b10 = c.b(dVar);
        final o oVar = new o(b10, 1);
        oVar.C();
        if (yVar != null) {
            okHttpProtoRequest = yVar;
        }
        a10.c(okHttpProtoRequest).a(new f() { // from class: com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1
            @Override // n9.f
            public void onFailure(e call, IOException e8) {
                n.f(call, "call");
                n.f(e8, "e");
                d9.n<OkHttp3Client.RequestComplete> nVar = oVar;
                o.a aVar = i8.o.f26626b;
                nVar.resumeWith(i8.o.b(p.a(e8)));
            }

            /* JADX WARN: Removed duplicated region for block: B:43:0x00f7 A[Catch: IOException -> 0x0143, TryCatch #0 {IOException -> 0x0143, blocks: (B:6:0x003a, B:8:0x0042, B:10:0x0053, B:12:0x0066, B:19:0x0076, B:21:0x007e, B:22:0x0081, B:26:0x008f, B:29:0x009b, B:31:0x00a3, B:33:0x00ba, B:35:0x00ce, B:37:0x00d4, B:40:0x00de, B:41:0x00f1, B:43:0x00f7, B:45:0x0104, B:47:0x0109, B:48:0x0111, B:50:0x0116, B:52:0x011b, B:53:0x011e, B:55:0x0129, B:57:0x0132, B:56:0x012c, B:39:0x00da), top: B:62:0x003a }] */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0116 A[Catch: IOException -> 0x0143, TryCatch #0 {IOException -> 0x0143, blocks: (B:6:0x003a, B:8:0x0042, B:10:0x0053, B:12:0x0066, B:19:0x0076, B:21:0x007e, B:22:0x0081, B:26:0x008f, B:29:0x009b, B:31:0x00a3, B:33:0x00ba, B:35:0x00ce, B:37:0x00d4, B:40:0x00de, B:41:0x00f1, B:43:0x00f7, B:45:0x0104, B:47:0x0109, B:48:0x0111, B:50:0x0116, B:52:0x011b, B:53:0x011e, B:55:0x0129, B:57:0x0132, B:56:0x012c, B:39:0x00da), top: B:62:0x003a }] */
            /* JADX WARN: Removed duplicated region for block: B:52:0x011b A[Catch: IOException -> 0x0143, TryCatch #0 {IOException -> 0x0143, blocks: (B:6:0x003a, B:8:0x0042, B:10:0x0053, B:12:0x0066, B:19:0x0076, B:21:0x007e, B:22:0x0081, B:26:0x008f, B:29:0x009b, B:31:0x00a3, B:33:0x00ba, B:35:0x00ce, B:37:0x00d4, B:40:0x00de, B:41:0x00f1, B:43:0x00f7, B:45:0x0104, B:47:0x0109, B:48:0x0111, B:50:0x0116, B:52:0x011b, B:53:0x011e, B:55:0x0129, B:57:0x0132, B:56:0x012c, B:39:0x00da), top: B:62:0x003a }] */
            /* JADX WARN: Removed duplicated region for block: B:55:0x0129 A[Catch: IOException -> 0x0143, TryCatch #0 {IOException -> 0x0143, blocks: (B:6:0x003a, B:8:0x0042, B:10:0x0053, B:12:0x0066, B:19:0x0076, B:21:0x007e, B:22:0x0081, B:26:0x008f, B:29:0x009b, B:31:0x00a3, B:33:0x00ba, B:35:0x00ce, B:37:0x00d4, B:40:0x00de, B:41:0x00f1, B:43:0x00f7, B:45:0x0104, B:47:0x0109, B:48:0x0111, B:50:0x0116, B:52:0x011b, B:53:0x011e, B:55:0x0129, B:57:0x0132, B:56:0x012c, B:39:0x00da), top: B:62:0x003a }] */
            /* JADX WARN: Removed duplicated region for block: B:56:0x012c A[Catch: IOException -> 0x0143, TryCatch #0 {IOException -> 0x0143, blocks: (B:6:0x003a, B:8:0x0042, B:10:0x0053, B:12:0x0066, B:19:0x0076, B:21:0x007e, B:22:0x0081, B:26:0x008f, B:29:0x009b, B:31:0x00a3, B:33:0x00ba, B:35:0x00ce, B:37:0x00d4, B:40:0x00de, B:41:0x00f1, B:43:0x00f7, B:45:0x0104, B:47:0x0109, B:48:0x0111, B:50:0x0116, B:52:0x011b, B:53:0x011e, B:55:0x0129, B:57:0x0132, B:56:0x012c, B:39:0x00da), top: B:62:0x003a }] */
            @Override // n9.f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onResponse(n9.e r14, n9.a0 r15) {
                /*
                    Method dump skipped, instructions count: 340
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1.onResponse(n9.e, n9.a0):void");
            }
        });
        Object z10 = oVar.z();
        c10 = n8.d.c();
        if (z10 == c10) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return z10;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public Object execute(HttpRequest httpRequest, d<? super HttpResponse> dVar) {
        return i.g(this.dispatchers.getIo(), new OkHttp3Client$execute$2(this, httpRequest, null), dVar);
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public HttpResponse executeBlocking(HttpRequest request) {
        n.f(request, "request");
        return (HttpResponse) i.e(this.dispatchers.getIo(), new OkHttp3Client$executeBlocking$1(this, request, null));
    }
}

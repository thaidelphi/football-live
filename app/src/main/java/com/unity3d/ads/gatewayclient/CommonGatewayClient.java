package com.unity3d.ads.gatewayclient;

import c9.i;
import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import d9.z2;
import gatewayprotocol.v1.ErrorKt;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseKt;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import i8.s;
import j8.i0;
import j8.j0;
import j8.p;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
import m8.d;
import w8.c;
/* compiled from: CommonGatewayClient.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CommonGatewayClient implements GatewayClient {
    public static final int CODE_400 = 400;
    public static final int CODE_599 = 599;
    public static final Companion Companion = new Companion(null);
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final String HEADER_PROTOBUF = "application/x-protobuf";
    public static final String HEADER_RETRY_ATTEMPT = "X-RETRY-ATTEMPT";
    private final HandleGatewayUniversalResponse handleGatewayUniversalResponse;
    private final HttpClient httpClient;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    /* compiled from: CommonGatewayClient.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public CommonGatewayClient(HttpClient httpClient, HandleGatewayUniversalResponse handleGatewayUniversalResponse, SendDiagnosticEvent sendDiagnosticEvent, SessionRepository sessionRepository) {
        n.f(httpClient, "httpClient");
        n.f(handleGatewayUniversalResponse, "handleGatewayUniversalResponse");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(sessionRepository, "sessionRepository");
        this.httpClient = httpClient;
        this.handleGatewayUniversalResponse = handleGatewayUniversalResponse;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sessionRepository = sessionRepository;
    }

    private final HttpRequest buildHttpRequest(String str, Map<String, ? extends List<String>> map, RequestPolicy requestPolicy, UniversalRequestOuterClass.UniversalRequest universalRequest) {
        return new HttpRequest(str, null, RequestType.POST, universalRequest.toByteArray(), map, null, null, null, null, requestPolicy.getConnectTimeout(), requestPolicy.getReadTimeout(), requestPolicy.getWriteTimeout(), requestPolicy.getOverallTimeout(), true, null, null, 0, 115170, null);
    }

    private final long calculateDelayTime(long j10, RequestPolicy requestPolicy, int i10) {
        return Math.min(calculateExponentialBackoff(j10, requestPolicy, i10) + calculateJitter(requestPolicy.getRetryWaitBase(), requestPolicy.getRetryJitterPct()), requestPolicy.getRetryMaxInterval());
    }

    private final long calculateExponentialBackoff(long j10, RequestPolicy requestPolicy, int i10) {
        return i10 == 0 ? j10 : ((float) j10) * requestPolicy.getRetryScalingFactor();
    }

    private final long calculateJitter(int i10, float f10) {
        if (f10 == 0.0f) {
            return 0L;
        }
        long j10 = i10 * f10;
        return c.f32384a.e(-j10, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object executeRequest(com.unity3d.services.core.network.model.HttpRequest r22, int r23, com.unity3d.ads.core.data.model.OperationType r24, m8.d<? super com.unity3d.services.core.network.model.HttpResponse> r25) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.gatewayclient.CommonGatewayClient.executeRequest(com.unity3d.services.core.network.model.HttpRequest, int, com.unity3d.ads.core.data.model.OperationType, m8.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x015d -> B:40:0x0167). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object executeWithRetry(java.lang.String r34, gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest r35, com.unity3d.ads.gatewayclient.RequestPolicy r36, com.unity3d.ads.core.data.model.OperationType r37, m8.d<? super gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse> r38) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.gatewayclient.CommonGatewayClient.executeWithRetry(java.lang.String, gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest, com.unity3d.ads.gatewayclient.RequestPolicy, com.unity3d.ads.core.data.model.OperationType, m8.d):java.lang.Object");
    }

    private final String getGatewayUrl(String str) {
        return !n.a(str, UnityAdsConstants.DefaultUrls.GATEWAY_URL) ? str : this.sessionRepository.getGatewayUrl();
    }

    private final Map<String, List<String>> getHeaders(int i10) {
        Map b10;
        List b11;
        Map<String, List<String>> a10;
        List b12;
        b10 = i0.b();
        b11 = p.b(HEADER_PROTOBUF);
        b10.put("Content-Type", b11);
        if (i10 > 0) {
            b12 = p.b(String.valueOf(i10));
            b10.put(HEADER_RETRY_ATTEMPT, b12);
        }
        a10 = i0.a(b10);
        return a10;
    }

    private final UniversalResponseOuterClass.UniversalResponse getUniversalResponse(HttpResponse httpResponse, OperationType operationType) {
        Map g10;
        try {
            Object body = httpResponse.getBody();
            if (body instanceof byte[]) {
                UniversalResponseOuterClass.UniversalResponse parseFrom = UniversalResponseOuterClass.UniversalResponse.parseFrom((byte[]) body);
                n.e(parseFrom, "parseFrom(responseBody)");
                return parseFrom;
            } else if (body instanceof String) {
                byte[] bytes = ((String) body).getBytes(b9.c.f5283b);
                n.e(bytes, "this as java.lang.String).getBytes(charset)");
                UniversalResponseOuterClass.UniversalResponse parseFrom2 = UniversalResponseOuterClass.UniversalResponse.parseFrom(bytes);
                n.e(parseFrom2, "parseFrom(\n             ….UTF_8)\n                )");
                return parseFrom2;
            } else {
                throw new InvalidProtocolBufferException("Could not parse response from gateway service");
            }
        } catch (InvalidProtocolBufferException e8) {
            DeviceLog.debug("Failed to parse response from gateway service with exception: %s", e8.getLocalizedMessage());
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            g10 = j0.g(s.a("operation", operationType.toString()), s.a("reason", "protobuf_parsing"), s.a("reason_debug", httpResponse.getBody().toString()));
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_network_parse_failure", null, g10, null, null, 26, null);
            UniversalResponseKt.Dsl.Companion companion = UniversalResponseKt.Dsl.Companion;
            UniversalResponseOuterClass.UniversalResponse.Builder newBuilder = UniversalResponseOuterClass.UniversalResponse.newBuilder();
            n.e(newBuilder, "newBuilder()");
            UniversalResponseKt.Dsl _create = companion._create(newBuilder);
            ErrorKt.Dsl.Companion companion2 = ErrorKt.Dsl.Companion;
            ErrorOuterClass.Error.Builder newBuilder2 = ErrorOuterClass.Error.newBuilder();
            n.e(newBuilder2, "newBuilder()");
            ErrorKt.Dsl _create2 = companion2._create(newBuilder2);
            _create2.setErrorText("ERROR: Could not parse response from gateway service");
            _create.setError(_create2._build());
            return _create._build();
        }
    }

    private final void sendNetworkErrorDiagnosticEvent(UnityAdsNetworkException unityAdsNetworkException, int i10, OperationType operationType, i iVar) {
        Map i11;
        if (operationType == OperationType.UNIVERSAL_EVENT) {
            return;
        }
        i11 = j0.i(s.a("operation", operationType.toString()), s.a("retries", String.valueOf(i10)), s.a("protocol", String.valueOf(unityAdsNetworkException.getProtocol())), s.a("network_client", String.valueOf(unityAdsNetworkException.getClient())), s.a("reason_code", String.valueOf(unityAdsNetworkException.getCode())), s.a("reason_debug", unityAdsNetworkException.getMessage()));
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_failure_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(iVar)), i11, null, null, 24, null);
    }

    private final void sendNetworkSuccessDiagnosticEvent(HttpResponse httpResponse, int i10, OperationType operationType, i iVar) {
        Map i11;
        if (operationType == OperationType.UNIVERSAL_EVENT) {
            return;
        }
        i11 = j0.i(s.a("operation", operationType.toString()), s.a("retries", String.valueOf(i10)), s.a("protocol", httpResponse.getProtocol()), s.a("network_client", httpResponse.getClient()), s.a("reason_code", String.valueOf(httpResponse.getStatusCode())));
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_success_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(iVar)), i11, null, null, 24, null);
    }

    private final boolean shouldRetry(int i10, long j10, int i11) {
        return (400 <= i10 && i10 < 600) && j10 < ((long) i11);
    }

    @Override // com.unity3d.ads.gatewayclient.GatewayClient
    public Object request(String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, d<? super UniversalResponseOuterClass.UniversalResponse> dVar) {
        return z2.c(requestPolicy.getMaxDuration(), new CommonGatewayClient$request$2(this, str, universalRequest, requestPolicy, operationType, null), dVar);
    }
}

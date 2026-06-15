package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import kotlin.jvm.internal.n;
/* compiled from: AndroidHandleGatewayAdResponse.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidHandleGatewayAdResponse implements HandleGatewayAdResponse {
    private final AdPlayerScope adPlayerScope;
    private final AdRepository adRepository;
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetAdPlayer getAdPlayer;
    private final HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer;
    private final GetLatestWebViewConfiguration getLatestWebViewConfiguration;
    private final GetOperativeEventApi getOperativeEventApi;
    private final GetWebViewBridgeUseCase getWebViewBridge;
    private final AndroidGetWebViewContainerUseCase getWebViewContainerUseCase;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidHandleGatewayAdResponse(AdRepository adRepository, AndroidGetWebViewContainerUseCase getWebViewContainerUseCase, GetWebViewBridgeUseCase getWebViewBridge, DeviceInfoRepository deviceInfoRepository, HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer, CampaignRepository campaignRepository, SendDiagnosticEvent sendDiagnosticEvent, GetOperativeEventApi getOperativeEventApi, GetLatestWebViewConfiguration getLatestWebViewConfiguration, AdPlayerScope adPlayerScope, GetAdPlayer getAdPlayer) {
        n.f(adRepository, "adRepository");
        n.f(getWebViewContainerUseCase, "getWebViewContainerUseCase");
        n.f(getWebViewBridge, "getWebViewBridge");
        n.f(deviceInfoRepository, "deviceInfoRepository");
        n.f(getHandleInvocationsFromAdViewer, "getHandleInvocationsFromAdViewer");
        n.f(campaignRepository, "campaignRepository");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(getOperativeEventApi, "getOperativeEventApi");
        n.f(getLatestWebViewConfiguration, "getLatestWebViewConfiguration");
        n.f(adPlayerScope, "adPlayerScope");
        n.f(getAdPlayer, "getAdPlayer");
        this.adRepository = adRepository;
        this.getWebViewContainerUseCase = getWebViewContainerUseCase;
        this.getWebViewBridge = getWebViewBridge;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getHandleInvocationsFromAdViewer = getHandleInvocationsFromAdViewer;
        this.campaignRepository = campaignRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getLatestWebViewConfiguration = getLatestWebViewConfiguration;
        this.adPlayerScope = adPlayerScope;
        this.getAdPlayer = getAdPlayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object cleanup(java.lang.Throwable r15, com.google.protobuf.ByteString r16, gatewayprotocol.v1.AdResponseOuterClass.AdResponse r17, com.unity3d.ads.adplayer.AdPlayer r18, m8.d<? super i8.w> r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r19
            boolean r2 = r1 instanceof com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1
            if (r2 == 0) goto L16
            r2 = r1
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1 r2 = (com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.label = r3
            goto L1b
        L16:
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1 r2 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1
            r2.<init>(r14, r1)
        L1b:
            java.lang.Object r1 = r2.result
            java.lang.Object r12 = n8.b.c()
            int r3 = r2.label
            r13 = 2
            r4 = 1
            if (r3 == 0) goto L41
            if (r3 == r4) goto L38
            if (r3 != r13) goto L30
            i8.p.b(r1)
            goto Lac
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            java.lang.Object r3 = r2.L$0
            com.unity3d.ads.adplayer.AdPlayer r3 = (com.unity3d.ads.adplayer.AdPlayer) r3
            i8.p.b(r1)
            r1 = r3
            goto L9e
        L41:
            i8.p.b(r1)
            gatewayprotocol.v1.OperativeEventErrorDataKt$Dsl$Companion r1 = gatewayprotocol.v1.OperativeEventErrorDataKt.Dsl.Companion
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder r3 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder()
            java.lang.String r5 = "newBuilder()"
            kotlin.jvm.internal.n.e(r3, r5)
            gatewayprotocol.v1.OperativeEventErrorDataKt$Dsl r1 = r1._create(r3)
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType r3 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED
            r1.setErrorType(r3)
            java.lang.Throwable r3 = r15.getCause()
            if (r3 == 0) goto L64
            java.lang.String r3 = r3.getMessage()
            if (r3 != 0) goto L6c
        L64:
            java.lang.String r3 = r15.getMessage()
            if (r3 != 0) goto L6c
            java.lang.String r3 = ""
        L6c:
            r1.setMessage(r3)
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData r1 = r1._build()
            com.unity3d.ads.core.domain.events.GetOperativeEventApi r3 = r0.getOperativeEventApi
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType r5 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_LOAD_ERROR
            com.google.protobuf.ByteString r6 = r17.getTrackingToken()
            java.lang.String r7 = "response.trackingToken"
            kotlin.jvm.internal.n.e(r6, r7)
            com.google.protobuf.ByteString r7 = r1.toByteString()
            java.lang.String r1 = "operativeEventErrorData.toByteString()"
            kotlin.jvm.internal.n.e(r7, r1)
            r8 = 0
            r10 = 16
            r11 = 0
            r1 = r18
            r2.L$0 = r1
            r2.label = r4
            r4 = r5
            r5 = r16
            r9 = r2
            java.lang.Object r3 = com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r3 != r12) goto L9e
            return r12
        L9e:
            if (r1 == 0) goto Laf
            r3 = 0
            r2.L$0 = r3
            r2.label = r13
            java.lang.Object r1 = r1.destroy(r2)
            if (r1 != r12) goto Lac
            return r12
        Lac:
            i8.w r1 = i8.w.f26638a
            return r1
        Laf:
            i8.w r1 = i8.w.f26638a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.cleanup(java.lang.Throwable, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, com.unity3d.ads.adplayer.AdPlayer, m8.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|8))|160|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
        r1 = r3;
        r12 = r6;
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00b6: MOVE  (r12 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:28:0x00b5 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03d7 A[Catch: CancellationException -> 0x03f8, TRY_ENTER, TryCatch #7 {CancellationException -> 0x03f8, blocks: (B:105:0x03f2, B:92:0x0381, B:94:0x0387, B:102:0x03d7, B:89:0x0358), top: B:152:0x0358 }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0461 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01cf A[Catch: CancellationException -> 0x041d, TryCatch #6 {CancellationException -> 0x041d, blocks: (B:60:0x01be, B:65:0x01cf, B:67:0x01e7, B:72:0x01fe, B:74:0x0207), top: B:151:0x01be }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e7 A[Catch: CancellationException -> 0x041d, TryCatch #6 {CancellationException -> 0x041d, blocks: (B:60:0x01be, B:65:0x01cf, B:67:0x01e7, B:72:0x01fe, B:74:0x0207), top: B:151:0x01be }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0355 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0380 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0387 A[Catch: CancellationException -> 0x03f8, TRY_LEAVE, TryCatch #7 {CancellationException -> 0x03f8, blocks: (B:105:0x03f2, B:92:0x0381, B:94:0x0387, B:102:0x03d7, B:89:0x0358), top: B:152:0x0358 }] */
    /* JADX WARN: Type inference failed for: r13v10, types: [T, com.unity3d.ads.adplayer.AdPlayer] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, kotlin.jvm.internal.a0] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // com.unity3d.ads.core.domain.HandleGatewayAdResponse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(com.unity3d.ads.UnityAdsLoadOptions r33, com.google.protobuf.ByteString r34, gatewayprotocol.v1.AdResponseOuterClass.AdResponse r35, android.content.Context r36, java.lang.String r37, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType r38, boolean r39, m8.d<? super com.unity3d.ads.core.data.model.LoadResult> r40) {
        /*
            Method dump skipped, instructions count: 1152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke(com.unity3d.ads.UnityAdsLoadOptions, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, android.content.Context, java.lang.String, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, boolean, m8.d):java.lang.Object");
    }
}

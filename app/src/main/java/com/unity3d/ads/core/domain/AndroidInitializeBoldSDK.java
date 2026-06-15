package com.unity3d.ads.core.domain;

import c9.i;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.log.DeviceLog;
import d9.j0;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import i8.s;
import i8.w;
import j8.i0;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: AndroidInitializeBoldSDK.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidInitializeBoldSDK implements InitializeBoldSDK {
    public static final Companion Companion = new Companion(null);
    public static final String MSG_GATEWAY_DENIED = "Gateway communication failure";
    public static final String MSG_NETWORK = "Network";
    public static final String MSG_TIMEOUT = "Timeout";
    public static final String MSG_UNKNOWN = "Initialization failure";
    private final ClearCache clearCache;
    private final j0 defaultDispatcher;
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final EventObservers eventObservers;
    private final GatewayClient gatewayClient;
    private final GetGameId getGameId;
    private final GetInitializationRequest getInitializeRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final HandleGatewayInitializationResponse handleGatewayInitializationResponse;
    private final InitializeOMSDK initializeOM;
    private final ConfigurationReader legacyConfigurationReader;
    private final SDKPropertiesManager sdkPropertiesManager;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final StorageManager storageManager;
    private final TriggerInitializeListener triggerInitializeListener;

    /* compiled from: AndroidInitializeBoldSDK.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public AndroidInitializeBoldSDK(j0 defaultDispatcher, InitializeOMSDK initializeOM, GetInitializationRequest getInitializeRequest, GetRequestPolicy getRequestPolicy, ClearCache clearCache, HandleGatewayInitializationResponse handleGatewayInitializationResponse, GatewayClient gatewayClient, SessionRepository sessionRepository, EventObservers eventObservers, TriggerInitializeListener triggerInitializeListener, SendDiagnosticEvent sendDiagnosticEvent, DiagnosticEventRepository diagnosticEventRepository, StorageManager storageManager, ConfigurationReader legacyConfigurationReader, SDKPropertiesManager sdkPropertiesManager, GetGameId getGameId) {
        n.f(defaultDispatcher, "defaultDispatcher");
        n.f(initializeOM, "initializeOM");
        n.f(getInitializeRequest, "getInitializeRequest");
        n.f(getRequestPolicy, "getRequestPolicy");
        n.f(clearCache, "clearCache");
        n.f(handleGatewayInitializationResponse, "handleGatewayInitializationResponse");
        n.f(gatewayClient, "gatewayClient");
        n.f(sessionRepository, "sessionRepository");
        n.f(eventObservers, "eventObservers");
        n.f(triggerInitializeListener, "triggerInitializeListener");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(diagnosticEventRepository, "diagnosticEventRepository");
        n.f(storageManager, "storageManager");
        n.f(legacyConfigurationReader, "legacyConfigurationReader");
        n.f(sdkPropertiesManager, "sdkPropertiesManager");
        n.f(getGameId, "getGameId");
        this.defaultDispatcher = defaultDispatcher;
        this.initializeOM = initializeOM;
        this.getInitializeRequest = getInitializeRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.clearCache = clearCache;
        this.handleGatewayInitializationResponse = handleGatewayInitializationResponse;
        this.gatewayClient = gatewayClient;
        this.sessionRepository = sessionRepository;
        this.eventObservers = eventObservers;
        this.triggerInitializeListener = triggerInitializeListener;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.storageManager = storageManager;
        this.legacyConfigurationReader = legacyConfigurationReader;
        this.sdkPropertiesManager = sdkPropertiesManager;
        this.getGameId = getGameId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkCanInitialize() {
        if (this.sessionRepository.getShouldInitialize()) {
            String invoke = this.getGameId.invoke();
            if ((invoke != null ? b9.n.f(invoke) : null) != null) {
                return;
            }
            throw new InitializationException("gameId \"" + invoke + "\" should be a number.", null, "invalid_game_id", invoke, 2, null);
        }
        throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "!sessionRepository.shouldInitialize", 2, null);
    }

    private final Map<String, String> getTags(InitializationException initializationException, String str, boolean z10) {
        Map b10;
        Map<String, String> a10;
        b10 = i0.b();
        b10.put("operation", OperationType.INITIALIZATION.toString());
        b10.put("reason", initializationException.getReason());
        b10.put("source", str);
        b10.put("is_retry", String.valueOf(z10));
        if (initializationException.getReasonDebug() != null) {
            b10.put("reason_debug", initializationException.getReasonDebug());
        }
        a10 = i0.a(b10);
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleResponse(UniversalResponseOuterClass.UniversalResponse universalResponse, m8.d<? super w> dVar) {
        Object c10;
        if (!universalResponse.hasError()) {
            if (universalResponse.hasPayload()) {
                if (universalResponse.getPayload().hasInitializationResponse()) {
                    HandleGatewayInitializationResponse handleGatewayInitializationResponse = this.handleGatewayInitializationResponse;
                    InitializationResponseOuterClass.InitializationResponse initializationResponse = universalResponse.getPayload().getInitializationResponse();
                    n.e(initializationResponse, "response.payload.initializationResponse");
                    Object invoke = handleGatewayInitializationResponse.invoke(initializationResponse, dVar);
                    c10 = n8.d.c();
                    return invoke == c10 ? invoke : w.f26638a;
                }
                throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "No initialization response", 2, null);
            }
            throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "No payload", 2, null);
        }
        this.sessionRepository.setShouldInitialize(false);
        throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", universalResponse.getError().getErrorText(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializationFailure(i iVar, InitializationException initializationException, String str, boolean z10) {
        DeviceLog.debug("Unity Ads Initialization Failure: " + initializationException.getMessage());
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialize_task_failure_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(iVar)), getTags(initializationException, str, z10), null, null, 24, null);
        this.sessionRepository.setInitializationState(InitializationState.FAILED);
        this.sdkPropertiesManager.setInitialized(false);
        this.triggerInitializeListener.error(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, initializationException.getMessage());
        setupDiagnosticEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object initializationStart(String str, boolean z10, m8.d<? super w> dVar) {
        Map g10;
        Object c10;
        DeviceLog.debug("Unity Ads Initialization Start");
        this.sdkPropertiesManager.setInitializationTime();
        this.sdkPropertiesManager.setInitializationTimeSinceEpoch();
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        g10 = j8.j0.g(s.a("source", str), s.a("is_retry", String.valueOf(z10)));
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_initialization_started", null, g10, null, null, 26, null);
        this.sessionRepository.setInitializationState(InitializationState.INITIALIZING);
        Object invoke = this.eventObservers.invoke(dVar);
        c10 = n8.d.c();
        return invoke == c10 ? invoke : w.f26638a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object initializationSuccess(c9.i r17, java.lang.String r18, boolean r19, m8.d<? super i8.w> r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r20
            boolean r2 = r1 instanceof com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$initializationSuccess$1
            if (r2 == 0) goto L17
            r2 = r1
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$initializationSuccess$1 r2 = (com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$initializationSuccess$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$initializationSuccess$1 r2 = new com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$initializationSuccess$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = n8.b.c()
            int r4 = r2.label
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L50
            if (r4 == r7) goto L48
            if (r4 == r6) goto L40
            if (r4 != r5) goto L38
            java.lang.Object r2 = r2.L$0
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r2 = (com.unity3d.ads.core.domain.AndroidInitializeBoldSDK) r2
            i8.p.b(r1)
            goto Lb7
        L38:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L40:
            java.lang.Object r4 = r2.L$0
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r4 = (com.unity3d.ads.core.domain.AndroidInitializeBoldSDK) r4
            i8.p.b(r1)
            goto La9
        L48:
            java.lang.Object r4 = r2.L$0
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r4 = (com.unity3d.ads.core.domain.AndroidInitializeBoldSDK) r4
            i8.p.b(r1)
            goto L9c
        L50:
            i8.p.b(r1)
            java.lang.String r1 = "Unity Ads Initialization Success"
            com.unity3d.services.core.log.DeviceLog.debug(r1)
            com.unity3d.ads.core.domain.SendDiagnosticEvent r8 = r0.sendDiagnosticEvent
            double r9 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r17)
            java.lang.Double r10 = kotlin.coroutines.jvm.internal.b.b(r9)
            i8.n[] r1 = new i8.n[r6]
            r4 = 0
            java.lang.String r9 = "source"
            r11 = r18
            i8.n r9 = i8.s.a(r9, r11)
            r1[r4] = r9
            java.lang.String r4 = java.lang.String.valueOf(r19)
            java.lang.String r9 = "is_retry"
            i8.n r4 = i8.s.a(r9, r4)
            r1[r7] = r4
            java.util.Map r11 = j8.g0.g(r1)
            r12 = 0
            r13 = 0
            r14 = 24
            r15 = 0
            java.lang.String r9 = "native_initialize_task_success_time"
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r8, r9, r10, r11, r12, r13, r14, r15)
            com.unity3d.ads.core.data.manager.StorageManager r1 = r0.storageManager
            r1.hasInitialized()
            com.unity3d.ads.core.domain.om.InitializeOMSDK r1 = r0.initializeOM
            r2.L$0 = r0
            r2.label = r7
            java.lang.Object r1 = r1.invoke(r2)
            if (r1 != r3) goto L9b
            return r3
        L9b:
            r4 = r0
        L9c:
            com.unity3d.ads.core.domain.ClearCache r1 = r4.clearCache
            r2.L$0 = r4
            r2.label = r6
            java.lang.Object r1 = r1.invoke(r2)
            if (r1 != r3) goto La9
            return r3
        La9:
            com.unity3d.ads.core.data.repository.SessionRepository r1 = r4.sessionRepository
            r2.L$0 = r4
            r2.label = r5
            java.lang.Object r1 = r1.persistNativeConfiguration(r2)
            if (r1 != r3) goto Lb6
            return r3
        Lb6:
            r2 = r4
        Lb7:
            com.unity3d.services.core.configuration.ConfigurationReader r1 = r2.legacyConfigurationReader
            com.unity3d.services.core.configuration.Configuration r1 = r1.getCurrentConfiguration()
            r1.deleteFromDisk()
            com.unity3d.ads.core.data.repository.SessionRepository r1 = r2.sessionRepository
            com.unity3d.ads.core.data.model.InitializationState r3 = com.unity3d.ads.core.data.model.InitializationState.INITIALIZED
            r1.setInitializationState(r3)
            com.unity3d.ads.core.data.manager.SDKPropertiesManager r1 = r2.sdkPropertiesManager
            r1.setInitialized(r7)
            com.unity3d.ads.core.domain.TriggerInitializeListener r1 = r2.triggerInitializeListener
            r1.success()
            r2.setupDiagnosticEvents()
            i8.w r1 = i8.w.f26638a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.initializationSuccess(c9.i, java.lang.String, boolean, m8.d):java.lang.Object");
    }

    private final void setupDiagnosticEvents() {
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration config = this.sessionRepository.getNativeConfiguration().getDiagnosticEvents();
        DiagnosticEventRepository diagnosticEventRepository = this.diagnosticEventRepository;
        n.e(config, "config");
        diagnosticEventRepository.configure(config);
    }

    @Override // com.unity3d.ads.core.domain.InitializeBoldSDK
    public Object invoke(String str, m8.d<? super w> dVar) {
        Object c10;
        Object g10 = d9.i.g(this.defaultDispatcher, new AndroidInitializeBoldSDK$invoke$2(this, str, null), dVar);
        c10 = n8.d.c();
        return g10 == c10 ? g10 : w.f26638a;
    }
}

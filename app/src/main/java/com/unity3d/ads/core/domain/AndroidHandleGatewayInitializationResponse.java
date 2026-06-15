package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import d9.k;
import d9.o0;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import i8.w;
import java.util.List;
import kotlin.jvm.internal.n;
/* compiled from: AndroidHandleGatewayInitializationResponse.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidHandleGatewayInitializationResponse implements HandleGatewayInitializationResponse {
    private final o0 sdkScope;
    private final SessionRepository sessionRepository;
    private final TransactionEventManager transactionEventManager;
    private final TriggerInitializationCompletedRequest triggerInitializationCompletedRequest;

    public AndroidHandleGatewayInitializationResponse(TransactionEventManager transactionEventManager, TriggerInitializationCompletedRequest triggerInitializationCompletedRequest, SessionRepository sessionRepository, o0 sdkScope) {
        n.f(transactionEventManager, "transactionEventManager");
        n.f(triggerInitializationCompletedRequest, "triggerInitializationCompletedRequest");
        n.f(sessionRepository, "sessionRepository");
        n.f(sdkScope, "sdkScope");
        this.transactionEventManager = transactionEventManager;
        this.triggerInitializationCompletedRequest = triggerInitializationCompletedRequest;
        this.sessionRepository = sessionRepository;
        this.sdkScope = sdkScope;
    }

    @Override // com.unity3d.ads.core.domain.HandleGatewayInitializationResponse
    public Object invoke(InitializationResponseOuterClass.InitializationResponse initializationResponse, m8.d<? super w> dVar) {
        if (!initializationResponse.hasError()) {
            SessionRepository sessionRepository = this.sessionRepository;
            NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = initializationResponse.getNativeConfiguration();
            n.e(nativeConfiguration, "response.nativeConfiguration");
            sessionRepository.setNativeConfiguration(nativeConfiguration);
            if (initializationResponse.hasUniversalRequestUrl()) {
                String universalRequestUrl = initializationResponse.getUniversalRequestUrl();
                if (!(universalRequestUrl == null || universalRequestUrl.length() == 0)) {
                    SessionRepository sessionRepository2 = this.sessionRepository;
                    String universalRequestUrl2 = initializationResponse.getUniversalRequestUrl();
                    n.e(universalRequestUrl2, "response.universalRequestUrl");
                    sessionRepository2.setGatewayUrl(universalRequestUrl2);
                }
            }
            List<InitializationResponseOuterClass.AdFormat> scarEligibleFormats = this.sessionRepository.getScarEligibleFormats();
            List<InitializationResponseOuterClass.AdFormat> scarEligibleFormatsList = initializationResponse.getScarEligibleFormatsList();
            n.e(scarEligibleFormatsList, "response.scarEligibleFormatsList");
            scarEligibleFormats.addAll(scarEligibleFormatsList);
            if (initializationResponse.getTriggerInitializationCompletedRequest()) {
                k.d(this.sdkScope, null, null, new AndroidHandleGatewayInitializationResponse$invoke$2(this, null), 3, null);
            }
            if (initializationResponse.getNativeConfiguration().getEnableIapEvent()) {
                this.transactionEventManager.invoke();
            }
            return w.f26638a;
        }
        String errorText = initializationResponse.getError().getErrorText();
        n.e(errorText, "response.error.errorText");
        throw new GatewayException(errorText, new IllegalStateException(initializationResponse.getError().getErrorText()), "gateway_initialization", initializationResponse.getError().getErrorText());
    }
}

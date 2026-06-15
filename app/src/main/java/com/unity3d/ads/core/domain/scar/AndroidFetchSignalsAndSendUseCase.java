package com.unity3d.ads.core.domain.scar;

import com.google.protobuf.ByteString;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import d9.k;
import d9.o0;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import i8.w;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.n;
import m8.d;
/* compiled from: AndroidFetchSignalsAndSendUseCase.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidFetchSignalsAndSendUseCase implements FetchSignalsAndSendUseCase {
    private final HandleGetTokenRequest handleGetTokenRequest;
    private final ScarManager scarManager;
    private final o0 scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    public AndroidFetchSignalsAndSendUseCase(o0 scope, SessionRepository sessionRepository, ScarManager scarManager, HandleGetTokenRequest handleGetTokenRequest, SendDiagnosticEvent sendDiagnosticEvent) {
        n.f(scope, "scope");
        n.f(sessionRepository, "sessionRepository");
        n.f(scarManager, "scarManager");
        n.f(handleGetTokenRequest, "handleGetTokenRequest");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.scope = scope;
        this.sessionRepository = sessionRepository;
        this.scarManager = scarManager;
        this.handleGetTokenRequest = handleGetTokenRequest;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getTags() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<InitializationResponseOuterClass.AdFormat> scarEligibleFormats = this.sessionRepository.getScarEligibleFormats();
        if (scarEligibleFormats.contains(InitializationResponseOuterClass.AdFormat.AD_FORMAT_BANNER)) {
            linkedHashMap.put("banner", a.f18924g);
        }
        if (scarEligibleFormats.contains(InitializationResponseOuterClass.AdFormat.AD_FORMAT_REWARDED)) {
            linkedHashMap.put("rewarded", a.f18924g);
        }
        if (scarEligibleFormats.contains(InitializationResponseOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL)) {
            linkedHashMap.put("interstitial", a.f18924g);
        }
        return linkedHashMap;
    }

    @Override // com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase
    public Object invoke(ByteString byteString, d<? super w> dVar) {
        k.d(this.scope, null, null, new AndroidFetchSignalsAndSendUseCase$invoke$2(this, byteString, null), 3, null);
        return w.f26638a;
    }
}

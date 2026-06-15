package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.banners.BannerViewCache;
import d9.j0;
import d9.o0;
import kotlin.jvm.internal.n;
/* compiled from: CommonGetAdPlayer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CommonGetAdPlayer implements GetAdPlayer {
    private final o0 adPlayerScope;
    private final j0 defaultDispatcher;
    private final DeviceInfoRepository deviceInfoRepository;
    private final ExecuteAdViewerRequest executeAdViewerRequest;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final ScarManager scarManager;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    public CommonGetAdPlayer(DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, ExecuteAdViewerRequest executeAdViewerRequest, SendDiagnosticEvent sendDiagnosticEvent, j0 defaultDispatcher, o0 adPlayerScope, OpenMeasurementRepository openMeasurementRepository, ScarManager scarManager) {
        n.f(deviceInfoRepository, "deviceInfoRepository");
        n.f(sessionRepository, "sessionRepository");
        n.f(executeAdViewerRequest, "executeAdViewerRequest");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(defaultDispatcher, "defaultDispatcher");
        n.f(adPlayerScope, "adPlayerScope");
        n.f(openMeasurementRepository, "openMeasurementRepository");
        n.f(scarManager, "scarManager");
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.executeAdViewerRequest = executeAdViewerRequest;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.defaultDispatcher = defaultDispatcher;
        this.adPlayerScope = adPlayerScope;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
    }

    @Override // com.unity3d.ads.core.domain.GetAdPlayer
    public AdPlayer invoke(WebViewBridge webviewBridge, AndroidWebViewContainer webviewContainer, ByteString opportunityId) {
        n.f(webviewBridge, "webviewBridge");
        n.f(webviewContainer, "webviewContainer");
        n.f(opportunityId, "opportunityId");
        WebViewAdPlayer webViewAdPlayer = new WebViewAdPlayer(webviewBridge, this.deviceInfoRepository, this.sessionRepository, this.executeAdViewerRequest, this.defaultDispatcher, this.sendDiagnosticEvent, webviewContainer, this.adPlayerScope);
        if (BannerViewCache.getInstance().getBannerView(ProtobufExtensionsKt.toUUID(opportunityId).toString()) == null) {
            String stringUtf8 = opportunityId.toStringUtf8();
            DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
            SessionRepository sessionRepository = this.sessionRepository;
            OpenMeasurementRepository openMeasurementRepository = this.openMeasurementRepository;
            ScarManager scarManager = this.scarManager;
            n.e(stringUtf8, "toStringUtf8()");
            return new AndroidFullscreenWebViewAdPlayer(webViewAdPlayer, stringUtf8, webviewContainer, deviceInfoRepository, sessionRepository, openMeasurementRepository, scarManager);
        }
        String uuid = ProtobufExtensionsKt.toUUID(opportunityId).toString();
        OpenMeasurementRepository openMeasurementRepository2 = this.openMeasurementRepository;
        ScarManager scarManager2 = this.scarManager;
        n.e(uuid, "toString()");
        return new AndroidEmbeddableWebViewAdPlayer(webViewAdPlayer, uuid, webviewContainer, openMeasurementRepository2, scarManager2);
    }
}

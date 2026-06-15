package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.CommonWebViewBridge;
import com.unity3d.ads.adplayer.WebViewBridge;
import d9.f1;
import d9.j0;
import d9.o0;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: CommonGetWebViewBridgeUseCase.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CommonGetWebViewBridgeUseCase implements GetWebViewBridgeUseCase {
    private final j0 dispatcher;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonGetWebViewBridgeUseCase(j0 dispatcher, SendDiagnosticEvent sendDiagnosticEvent) {
        n.f(dispatcher, "dispatcher");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.dispatcher = dispatcher;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    @Override // com.unity3d.ads.core.domain.GetWebViewBridgeUseCase
    public WebViewBridge invoke(AndroidWebViewContainer webViewContainer, o0 adPlayerScope) {
        n.f(webViewContainer, "webViewContainer");
        n.f(adPlayerScope, "adPlayerScope");
        return new CommonWebViewBridge(this.dispatcher, webViewContainer, adPlayerScope, this.sendDiagnosticEvent);
    }

    public /* synthetic */ CommonGetWebViewBridgeUseCase(j0 j0Var, SendDiagnosticEvent sendDiagnosticEvent, int i10, h hVar) {
        this((i10 & 1) != 0 ? f1.a() : j0Var, sendDiagnosticEvent);
    }
}

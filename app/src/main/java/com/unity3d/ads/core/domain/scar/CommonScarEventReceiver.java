package com.unity3d.ads.core.domain.scar;

import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import d9.k;
import d9.o0;
import g9.a0;
import g9.c0;
import g9.g;
import g9.v;
import j8.y;
import java.util.Set;
import kotlin.jvm.internal.n;
/* compiled from: CommonScarEventReceiver.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CommonScarEventReceiver implements IEventSender {
    private final v<GmaEventData> _gmaEventFlow;
    private final v<String> _versionFlow;
    private final a0<GmaEventData> gmaEventFlow;
    private final o0 scope;
    private final a0<String> versionFlow;

    public CommonScarEventReceiver(o0 scope) {
        n.f(scope, "scope");
        this.scope = scope;
        v<String> b10 = c0.b(0, 0, null, 7, null);
        this._versionFlow = b10;
        this.versionFlow = g.a(b10);
        v<GmaEventData> b11 = c0.b(0, 0, null, 7, null);
        this._gmaEventFlow = b11;
        this.gmaEventFlow = g.a(b11);
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean canSend() {
        return true;
    }

    public final a0<GmaEventData> getGmaEventFlow() {
        return this.gmaEventFlow;
    }

    public final a0<String> getVersionFlow() {
        return this.versionFlow;
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean sendEvent(Enum<?> eventCategory, Enum<?> eventId, Object... params) {
        Set d10;
        boolean q10;
        n.f(eventCategory, "eventCategory");
        n.f(eventId, "eventId");
        n.f(params, "params");
        d10 = j8.o0.d(WebViewEventCategory.INIT_GMA, WebViewEventCategory.GMA, WebViewEventCategory.BANNER);
        q10 = y.q(d10, eventCategory);
        if (q10) {
            k.d(this.scope, null, null, new CommonScarEventReceiver$sendEvent$1(eventId, params, this, null), 3, null);
            return true;
        }
        return false;
    }
}

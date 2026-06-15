package com.unity3d.services.core.cache;

import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.n;
/* compiled from: CacheEventSender.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CacheEventSender implements Serializable {
    private final IEventSender eventSender;

    public CacheEventSender(IEventSender eventSender) {
        n.f(eventSender, "eventSender");
        this.eventSender = eventSender;
    }

    public final boolean sendEvent(CacheEvent eventId, Object... params) {
        n.f(eventId, "eventId");
        n.f(params, "params");
        return this.eventSender.sendEvent(WebViewEventCategory.CACHE, eventId, Arrays.copyOf(params, params.length));
    }
}

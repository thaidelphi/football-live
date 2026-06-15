package com.unity3d.ads.adplayer.model;

import com.unity3d.scar.adapter.common.c;
import kotlin.jvm.internal.n;
/* compiled from: WebViewEvent.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class OnGmaEvent implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

    public OnGmaEvent(c gmaEvent) {
        n.f(gmaEvent, "gmaEvent");
        this.category = "GMA";
        this.name = gmaEvent.name();
        this.parameters = new Object[0];
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public String getCategory() {
        return this.category;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public String getName() {
        return this.name;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public Object[] getParameters() {
        return this.parameters;
    }
}

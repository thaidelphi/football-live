package com.unity3d.ads.adplayer.model;

import kotlin.jvm.internal.n;
/* compiled from: WebViewEvent.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class OnUserConsentChangeEvent implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

    public OnUserConsentChangeEvent(String value) {
        n.f(value, "value");
        this.category = "ADVIEWER";
        this.name = "ON_USER_CONSENT_CHANGE";
        this.parameters = new Object[]{value};
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

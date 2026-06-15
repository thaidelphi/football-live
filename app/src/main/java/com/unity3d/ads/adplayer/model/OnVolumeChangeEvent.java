package com.unity3d.ads.adplayer.model;
/* compiled from: WebViewEvent.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class OnVolumeChangeEvent implements WebViewEvent {
    private final String category = "ADVIEWER";
    private final String name = "ON_VOLUME_CHANGE";
    private final Object[] parameters;

    public OnVolumeChangeEvent(double d10) {
        this.parameters = new Object[]{Double.valueOf(d10)};
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

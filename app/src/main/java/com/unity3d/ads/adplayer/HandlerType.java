package com.unity3d.ads.adplayer;
/* compiled from: HandlerType.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public enum HandlerType {
    CALLBACK("handleCallback"),
    INVOCATION("handleInvocation"),
    EVENT("handleEvent");
    
    private final String jsPath;

    HandlerType(String str) {
        this.jsPath = str;
    }

    public final String getJsPath() {
        return this.jsPath;
    }
}

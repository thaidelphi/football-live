package com.iab.omid.library.unity3d.adsession;

import com.unity3d.services.core.device.MimeTypes;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public enum CreativeType {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO("video"),
    AUDIO(MimeTypes.BASE_TYPE_AUDIO);
    
    private final String creativeType;

    CreativeType(String str) {
        this.creativeType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.creativeType;
    }
}

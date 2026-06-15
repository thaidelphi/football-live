package com.iab.omid.library.ironsrc.adsession;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public enum AdSessionContextType {
    HTML("html"),
    NATIVE(IronSourceConstants.EVENTS_NATIVE),
    JAVASCRIPT("javascript");
    
    private final String typeString;

    AdSessionContextType(String str) {
        this.typeString = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.typeString;
    }
}
